package Interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.event.InputEvent.CTRL_DOWN_MASK;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.TitledBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTabbedPane;

import Lexico.Token;
import Interfaz.NumeroLinea;
import Lexico.DescripcionGUI;
import Lexico.Lexico;
import javax.swing.ImageIcon;

public class GUI extends JFrame implements ActionListener {

    private JTextArea consola;
    private JTextArea editor;
    private JTextArea sintactico;
    private JTable tablaSimbolos;
    private JTable tablaTodo;
    private JMenuItem menuAbrir = new JMenuItem("Abrir Archivo");
    private JMenuItem menuSalir = new JMenuItem("Salir");
    private JMenuItem menuBorrar = new JMenuItem("Borrar");
    private JMenuItem menuCompilar = new JMenuItem("Compilar");
    private JMenuItem menuDescripcion = new JMenuItem("Información");
    private JPanel lexicoPanel = new JPanel(new GridLayout(1, 1));
    private JPanel sintacticoPanel = new JPanel(new GridLayout(1, 1));
    private JScrollPane scroll;

    public void escribirConsola(String msg) {
        consola.append(msg + "\n");
    }

    private void escribirEditor(String msg) {
        editor.append(msg + "\n");

    }

    private void escribirTablaToken(Vector<Token> tokens) {
        for (Token token1 : tokens) {
            int line = token1.getLinea();
            int num = token1.getToken();
            String token = token1.getDescripcion();
            String word = token1.getLexema();
            ((DefaultTableModel) tablaTodo.getModel()).addRow(new Object[]{String.format("%03d", line), num, token, word});
            
            if (token.equals("ERROR")){
                escribirConsola("Error en linea " + line + " no reconocido: "+ word);
            }
        }
    }
    
    private void escribirTablaSimbolos(Vector<Token> simbolos) {
        for (Token token1 : simbolos) {
            int num = token1.getToken();
            String token = token1.getDescripcion();
            String word = token1.getLexema();
            ((DefaultTableModel) tablaSimbolos.getModel()).addRow(new Object[]{num, token, word});
            
        }
    }
    
    private void limpiarTablaToken() {
        int ta = ((DefaultTableModel) tablaTodo.getModel()).getRowCount();
        for (int i = 0; i < ta; i++) {
            ((DefaultTableModel) tablaTodo.getModel()).removeRow(0);
        }
    }
    
    private void limpiarTablaSimbolos() {
        int ta = ((DefaultTableModel) tablaSimbolos.getModel()).getRowCount();
        for (int i = 0; i < ta; i++) {
            ((DefaultTableModel) tablaSimbolos.getModel()).removeRow(0);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (menuAbrir.equals(e.getSource())) {
            JFileChooser fc = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Text Files", "txt", "text");
            fc.setFileFilter(filter);
            int returnVal = fc.showOpenDialog(this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = fc.getSelectedFile();
                consola.setText("");
                editor.setText("");
                limpiarTablaToken();
                limpiarTablaSimbolos();
                try {
                    cargarArchivo(file.getAbsolutePath());
                } catch (IOException ex) {
                    escribirConsola(ex.toString());
                }
            }

        } else if (menuSalir.equals(e.getSource())) {
            dispose();

        } else if (menuBorrar.equals(e.getSource())) {
            editor.setText("");
            consola.setText("");
            limpiarTablaToken();
            limpiarTablaSimbolos();

        } else if (menuCompilar.equals(e.getSource())) {
            limpiarTablaToken();
            limpiarTablaSimbolos();
            consola.setText("");
            // analisis lexico
            if (editor.getText().equals("")) {
                escribirConsola("El archivo esta vacio");
                return;
            }
            Lexico lex = new Lexico(editor.getText());

            lex.ejecutar();
            Vector<Token> tokens = lex.getTokens();
            Vector<Token> simbolos = lex.getSimbolos();
            // ver token en la tablaSimbolos
            escribirTablaToken(tokens);
            escribirTablaSimbolos(simbolos);
            // contando errores
            int errors = 0;
            for (Token token : tokens) {
                if (token.getDescripcion().equals("ERROR")) {
                    errors++;
                }
            }
            if (lex.getValidacion()){
                escribirConsola("LEXICAMENTE CORRECTO");
            } else {
                escribirConsola("FINALIZADO POR ERROR LEXICO");
            }
            // ver los estados en la consola
            //escribirConsola(tokens.size() + " cadenas encontradas en: " + tokens.get(tokens.size() - 1).getLine() + " lineas,");
            //escribirConsola(errors + " cadenas no coinciden con ninguna regla");
            // actualiza el sintactico
            sintactico = new JTextArea();
            sintactico.setEditable(true);
            sintacticoPanel.removeAll();
            JScrollPane View = new JScrollPane(sintactico);
            sintacticoPanel.add(View);
            //sintacticoPanel.revalidate();
            //sintacticoPanel.repaint();

        } else if (menuDescripcion.equals(e.getSource())) {
            dispose();
            DescripcionGUI gui = new DescripcionGUI("Analizador Léxico y Sintáctico");
            gui.setVisible(true);

        }
    }

    private boolean cargarArchivo(String file) throws FileNotFoundException, IOException {
        String line;
        BufferedReader br = new BufferedReader(new FileReader(file));
        escribirConsola("Leyendo " + file + "");
        line = br.readLine();
        while (line != null) {
            escribirEditor(line);
            line = br.readLine();
        }
        escribirConsola("Archivo Cargado");
        br.close();
        return true;
    }

    private void crearMenu() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menuArchivo = new JMenu("Archivo");
        JMenu menuEditar = new JMenu("Editar");
        JMenu menuEjecutar = new JMenu("Ejecutar");
        JMenu menuAyuda = new JMenu("Ayuda");

        menuAbrir.addActionListener(this);
        menuSalir.addActionListener(this);
        menuBorrar.addActionListener(this);
        menuCompilar.addActionListener(this);
        menuDescripcion.addActionListener(this);
        menuArchivo.add(menuAbrir);
        menuArchivo.addSeparator();
        menuArchivo.add(menuSalir);
        menuEditar.add(menuBorrar);
        menuEjecutar.add(menuCompilar);
        menuAyuda.add(menuDescripcion);
        menuBar.add(menuArchivo);
        menuBar.add(menuEditar);
        menuBar.add(menuEjecutar);
        menuBar.add(menuAyuda);
        setJMenuBar(menuBar);
    }

    private void createGUI() {
        TitledBorder panelTitle;
        setLayout(new BorderLayout());
        JPanel topPanel = new JPanel(new GridLayout(1, 1));
        JPanel downPanel = new JPanel(new GridLayout(1, 1));
        JPanel simbolosPanel = new JPanel(new GridLayout(1, 1));
        JPanel todosPanel = new JPanel(new GridLayout(1, 1));
        JPanel editorPanel = new JPanel(new GridLayout(1, 1));
        JPanel consolePanel = new JPanel(new GridLayout(1, 1));

        // editor
        panelTitle = BorderFactory.createTitledBorder(" Codigo fuente ");
        editorPanel.setBorder(panelTitle);
        editor = new JTextArea();
        editor.setEditable(true);
        scroll = new JScrollPane(editor);
        editorPanel.add(scroll);
        
        //numero de lineas editor
        NumeroLinea nl = new NumeroLinea(editor);
        scroll.setRowHeaderView(nl);
        
        // lexico - todo
        panelTitle = BorderFactory.createTitledBorder(" Tabla que reconoce todo ");
        todosPanel.setBorder(panelTitle);
        DefaultTableModel modelRegistry = new DefaultTableModel();
        tablaTodo = new JTable(modelRegistry);
        tablaTodo.setShowGrid(true);
        tablaTodo.setGridColor(Color.LIGHT_GRAY);
        tablaTodo.setAutoCreateRowSorter(true);
        modelRegistry.addColumn("linea");
        modelRegistry.addColumn("token");
        modelRegistry.addColumn("descripcion");
        modelRegistry.addColumn("lexema");
        JScrollPane scrollRegistry = new JScrollPane(tablaTodo);
        tablaTodo.setFillsViewportHeight(true);
        todosPanel.add(scrollRegistry);
        tablaTodo.setEnabled(false);        
        
        // lexico - simbolo
        panelTitle = BorderFactory.createTitledBorder(" Tabla que reconoce simbolos ");
        simbolosPanel.setBorder(panelTitle);
        DefaultTableModel modelTablaRegistry = new DefaultTableModel();
        tablaSimbolos = new JTable(modelTablaRegistry);
        tablaSimbolos.setShowGrid(true);
        tablaSimbolos.setGridColor(Color.LIGHT_GRAY);
        tablaSimbolos.setAutoCreateRowSorter(true);
        modelTablaRegistry.addColumn("token");
        modelTablaRegistry.addColumn("descripcion");
        modelTablaRegistry.addColumn("lexema");
        JScrollPane scrollTablaRegistry = new JScrollPane(tablaSimbolos);
        tablaSimbolos.setFillsViewportHeight(true);
        simbolosPanel.add(scrollTablaRegistry);
        tablaSimbolos.setEnabled(false);
        
        
        
        // consola
        panelTitle = BorderFactory.createTitledBorder(" Consola ");
        consolePanel.setBorder(panelTitle);
        consola = new JTextArea();
        consola.setEditable(false);
        consola.setBackground(Color.white);
        consola.setForeground(Color.red);
        JScrollPane scrollConsole = new JScrollPane(consola);
        consolePanel.add(scrollConsole);
        
        // sintactico
        panelTitle = BorderFactory.createTitledBorder(" Analisis Sintactico ");
        sintacticoPanel.setBorder(panelTitle);
        JScrollPane scrollSintactico = new JScrollPane(new JLabel("Después de la compilación, el resultado se mostrará aquí", JLabel.CENTER));
        sintacticoPanel.add(scrollSintactico);
        
        // tabs
        JTabbedPane tabbedPane = new JTabbedPane();
        
        //tabbedPane.addTab(" Lexico - Todo ", todosPanel);
        //tabbedPane.addTab(" Lexico - Simbolos", simbolosPanel);
        lexicoPanel.add(todosPanel);
        lexicoPanel.add(simbolosPanel);
        
        tabbedPane.addTab(" Léxico ", lexicoPanel);
        tabbedPane.addTab(" Sintáctico ", sintacticoPanel);
        tabbedPane.setSelectedIndex(0);
        
        // main frame
        topPanel.add(editorPanel);
        topPanel.add(tabbedPane);
        downPanel.add(consolePanel);
        downPanel.setPreferredSize(new Dimension(getWidth(), getHeight() / 4));
        add(topPanel, BorderLayout.CENTER);
        add(downPanel, BorderLayout.SOUTH);
        
        // teclas de acceso rapido
        menuCompilar.setAccelerator(KeyStroke.getKeyStroke('D', CTRL_DOWN_MASK));
        menuBorrar.setAccelerator(KeyStroke.getKeyStroke('B', CTRL_DOWN_MASK));
    }

    public GUI(String title) throws IOException {
        super(title);

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
        }

        try {
            ImageIcon ic = new ImageIcon(getClass().getResource("/Imagenes/analizando.png"));
            this.setIconImage(ic.getImage());
        } catch (Exception e) {
        }

        Dimension dim = getToolkit().getScreenSize();
        setSize(3 * dim.width / 4, 3 * dim.height / 4);
        setLocation((dim.width - getSize().width) / 2, (dim.height - getSize().height) / 2);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        crearMenu();
        createGUI();
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {

        GUI gui = new GUI("Analizador Léxico y Sintáctico");
        gui.setVisible(true);
    }

}
