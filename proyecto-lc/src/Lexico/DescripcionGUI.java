package Lexico;

import Interfaz.GUI;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import java.io.IOException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

public class DescripcionGUI extends JFrame implements ActionListener {

    private JTable tablaTokens;
    private Vector<Token> tokens;
    private JButton botonAtras = new JButton(" Atras ");

    private JScrollPane scroll;

    private void escribirTablaToken(Vector<Token> tokens) {
        for (Token token1 : tokens) {
            int num = token1.getToken();
            String token = token1.getDescripcion();
            String word = token1.getLexema();
            ((DefaultTableModel) tablaTokens.getModel()).addRow(new Object[]{String.format("%03d", num), token, word});
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (botonAtras.equals(e.getSource())) {
            try {
                GUI gui = new GUI("PROYECTO LC");
                gui.setVisible(true);
                dispose();
            } catch (IOException ex) {
                Logger.getLogger(DescripcionGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void createGUI() {
        TitledBorder panelTitle;
        setLayout(new BorderLayout());
        JMenuBar menuBar = new JMenuBar();
        JPanel panel = new JPanel(new GridLayout(1, 1));
        JPanel downpanel = new JPanel(new GridLayout(1, 1));
        JPanel tokenPanel = new JPanel(new GridLayout(1, 1));

        // descripcion
        panelTitle = BorderFactory.createTitledBorder(" Descripción del Lenguaje ");
        tokenPanel.setBorder(panelTitle);
        DefaultTableModel modelRegistry = new DefaultTableModel();
        tablaTokens = new JTable(modelRegistry);
        tablaTokens.setShowGrid(true);
        tablaTokens.setGridColor(Color.LIGHT_GRAY);
        tablaTokens.setAutoCreateRowSorter(true);
        modelRegistry.addColumn("TOKEN");
        modelRegistry.addColumn("DESCRIPCION");
        modelRegistry.addColumn("LEXEMA");
        JScrollPane scrollRegistry = new JScrollPane(tablaTokens);
        tablaTokens.setFillsViewportHeight(true);
        tokenPanel.add(scrollRegistry);
        tablaTokens.setEnabled(false);

        // main frame
        setJMenuBar(menuBar);
        panel.add(tokenPanel);
        panel.add(downpanel);
        add(panel, BorderLayout.CENTER);

        // boton
        downpanel.setPreferredSize(new Dimension(getWidth(), getHeight() / 12));
        add(downpanel, BorderLayout.SOUTH);
        botonAtras.setContentAreaFilled(false);
        botonAtras.setFocusPainted(false);
        botonAtras.addActionListener(this);
        botonAtras.setBorder(new LineBorder(Color.lightGray));
        downpanel.add(botonAtras);

    }

    private void descripcion() {
        tokens = new Vector<Token>();
        tokens.add(new Token(101, "Operador", "+"));
        tokens.add(new Token(102, "Operador", "-"));
        tokens.add(new Token(103, "Operador", "*"));
        tokens.add(new Token(104, "Operador", "/"));
        tokens.add(new Token(105, "Operador", "**"));
        tokens.add(new Token(106, "Operador", "//"));
        tokens.add(new Token(107, "Operador", "="));
        tokens.add(new Token(108, "Operador", "++"));
        tokens.add(new Token(109, "Operador", "--"));
        tokens.add(new Token(110, "Operador", "<"));
        tokens.add(new Token(111, "Operador", ">"));
        tokens.add(new Token(112, "Operador", "=="));
        tokens.add(new Token(113, "Operador", "~="));
        tokens.add(new Token(114, "Operador", "<="));
        tokens.add(new Token(115, "Operador", ">="));
        tokens.add(new Token(116, "Operador", "&"));
        tokens.add(new Token(117, "Operador", "|"));
        tokens.add(new Token(117, "Operador", "~"));
        tokens.add(new Token(200, "Palabra reservada", "paq"));
        tokens.add(new Token(201, "Palabra reservada", "man"));
        tokens.add(new Token(202, "Palabra reservada", "mana"));
        tokens.add(new Token(203, "Palabra reservada", "kama"));
        tokens.add(new Token(204, "Palabra reservada", "retornar"));
        tokens.add(new Token(205, "Palabra reservada", "iskirbiy"));
        tokens.add(new Token(206, "Palabra reservada", "liyiy"));
        tokens.add(new Token(207, "Palabra reservada", "clases"));
        tokens.add(new Token(208, "Palabra reservada", "central"));
        tokens.add(new Token(209, "Palabra reservada", "entero"));
        tokens.add(new Token(210, "Palabra reservada", "real"));
        tokens.add(new Token(211, "Palabra reservada", "caracter"));
        tokens.add(new Token(212, "Palabra reservada", "palabra"));
        tokens.add(new Token(213, "Palabra reservada", "veracidad"));
        tokens.add(new Token(214, "Palabra reservada", "nuevo"));
        tokens.add(new Token(215, "Palabra reservada", "noobvio"));
        tokens.add(new Token(216, "Palabra reservada", "obvio"));
        tokens.add(new Token(217, "Palabra reservada", "inmune"));
        tokens.add(new Token(218, "Palabra reservada", "verdadero"));
        tokens.add(new Token(219, "Palabra reservada", "falso"));
        tokens.add(new Token(220, "Palabra reservada", "kontante"));
        tokens.add(new Token(221, "Palabra reservada", "vacuo"));
        tokens.add(new Token(300, "Identificadores", ""));
        tokens.add(new Token(100, "Operador Delimitador", ","));
        tokens.add(new Token(100, "Operador Delimitador", ";"));
        tokens.add(new Token(100, "Operador Delimitador", "("));
        tokens.add(new Token(100, "Operador Delimitador", ")"));
        tokens.add(new Token(100, "Operador Delimitador", "{"));
        tokens.add(new Token(100, "Operador Delimitador", "}"));
        tokens.add(new Token(100, "Operador Delimitador", "["));
        tokens.add(new Token(100, "Operador Delimitador", "]"));
        tokens.add(new Token(100, "Operador Delimitador", "^"));
        tokens.add(new Token(100, "Operador Delimitador", "::"));
        tokens.add(new Token(100, "Operador Delimitador", "'"));
        tokens.add(new Token(500, "Literal numerica", ""));
        escribirTablaToken(tokens);
    }

    public DescripcionGUI(String title) {
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
        setSize(2 * dim.width / 4, 2 * dim.height / 4);
        setLocation((dim.width - getSize().width) / 2, (dim.height - getSize().height) / 2);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createGUI();
        descripcion();
    }

    public static void main(String[] args) {
        DescripcionGUI gui = new DescripcionGUI("Analizador Léxico y Sintáctico");
        gui.setVisible(true);
    }

}
