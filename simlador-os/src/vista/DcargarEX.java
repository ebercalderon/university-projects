
package vista;

import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;


public class DcargarEX extends javax.swing.JFrame implements MouseListener {

    private static JPanel ultimoClickeado;
    DefaultMutableTreeNode MiPC = new DefaultMutableTreeNode("Mi_PC");
    DefaultTreeModel modelo = new DefaultTreeModel(MiPC);
    final String dirHome = System.getProperty("user.dir") + File.separator + "Mi_PC";
    final String dirPapelera = System.getProperty("user.dir") + File.separator + "Papelera";
    static String direccion;
    private final JPanel panelA = new JPanel();
    private final JPanel panelB = new JPanel();
    private File pegarD;
    private static String nombreCopiar, tipo;

    public DcargarEX(String dirAct, String nombP, String tipo) throws IOException {

        direccion = dirAct;
        nombreCopiar = nombP;
        DcargarEX.tipo = tipo;
        initComponents();
        setLocationRelativeTo(null);

        cargarArbol(new File(dirHome));
        llenarPaneles(new File(direccion));

        panelA.setBackground(new java.awt.Color(255, 255, 255));
        panelA.setLayout(new java.awt.GridLayout(0, 7));
        jScrollPane2.setViewportView(panelA);

    }
        
    class Components {

        public int i;
        String[] path;

        public Components() {
            i = 0;
            path = new String[10];
        }
    }
    
    public String Join(Components c) {
        String out = "";
        for (int i = 0; i < c.i; ++i) {
            out += c.path[i] + File.separator;
        }
        return out;
    }

    private void llenarPaneles(File a) throws IOException {
        String[] nombA = a.list();//guardo nombres

        jLabel1.setText(String.valueOf("Se encontaron " + nombA.length + " elementos."));
        ruta.setText(" >" + a.getCanonicalPath());
        for (int i = 0; i < nombA.length; i++) {
            DefaultMutableTreeNode nodo = new DefaultMutableTreeNode(nombA[i]);
            File b = new File(a.getAbsolutePath(), nombA[i]);//guardo ruta
            agregarP(nombA[i], b.isDirectory());
        }
    }

    private void cargarArbol(File a) {
        String[] nombA = a.list();//guardo nombres
        for (int i = 0; i < nombA.length; i++) {
            DefaultMutableTreeNode nodo = new DefaultMutableTreeNode(nombA[i]);
            MiPC.add(nodo);
            File b = new File(a.getAbsolutePath(), nombA[i]);//guardo ruta
            if (b.isDirectory()) {//verifico
                String[] nombB = b.list();//guardo nombres
                for (int j = 0; j < nombB.length; j++) {
                    DefaultMutableTreeNode nodo1 = new DefaultMutableTreeNode(nombB[j]);
                    nodo.add(nodo1);
                    File c = new File(b.getAbsolutePath(), nombB[j]);//guardo ruta
                    if (c.isDirectory()) {//verifico
                        String[] nombC = c.list();//guardo nombres
                        for (int k = 0; k < nombC.length; k++) {
                            DefaultMutableTreeNode nodo2 = new DefaultMutableTreeNode(nombC[k]);
                            nodo1.add(nodo2);
                            File d = new File(c.getAbsolutePath(), nombC[k]);//guardo ruta
                            if (d.isDirectory()) {//verifico
                                String[] nombD = d.list();
                                for (int l = 0; l < nombD.length; l++) {
                                    DefaultMutableTreeNode nodo3 = new DefaultMutableTreeNode(nombD[l]);
                                    nodo2.add(nodo3);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private void agregarP(String nomb, boolean dir) {

        String tip;
        if (dir) {
            tip = "Directorio";
        } else {
            tip = "Archivo";
        }
        JPanel jp = new JPanel();
        jp.addMouseListener(this);

        jp.setLayout(new BoxLayout(jp, BoxLayout.Y_AXIS));
        jp.setPreferredSize(new java.awt.Dimension(99, 120));

        JLabel nombre = new JLabel(nomb);
        nombre.setForeground(Color.BLACK);
        nombre.setFont(new java.awt.Font("Century Gothic", 2, 14));
        nombre.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel floro = new JLabel("  ");
        floro.setForeground(Color.BLACK);
        floro.setFont(new java.awt.Font("Century Gothic", 2, 20));
        floro.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel imagen = new JLabel("");
        imagen.setAlignmentX(Component.CENTER_ALIGNMENT);
        imagen.setSize(60, 60);

        if (dir) {
            ImageIcon img_directorio = new ImageIcon(getClass().getResource("/images/Fold.png"));
            ImageIcon img = new ImageIcon(img_directorio.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_DEFAULT));
            imagen.setIcon(img);
        } else {
            ImageIcon img_directorio = new ImageIcon(getClass().getResource("/images/Docu.png"));
            ImageIcon img = new ImageIcon(img_directorio.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_DEFAULT));
            imagen.setIcon(img);
        }

        jp.add(floro);
        jp.add(imagen);
        jp.add(nombre);
        jp.setBackground(Color.white);
        panelA.add(jp);

    }
    
    private void agregarPB(String nomb, boolean dir) {

        String tip;
        if (dir) {
            tip = "Directorio";
        } else {
            tip = "Archivo";
        }
        JPanel jp = new JPanel();
        jp.addMouseListener(this);

        jp.setLayout(new BoxLayout(jp, BoxLayout.Y_AXIS));
        jp.setPreferredSize(new java.awt.Dimension(99, 120));

        JLabel nombre = new JLabel(nomb);
        nombre.setForeground(Color.BLACK);
        nombre.setFont(new java.awt.Font("Century Gothic", 2, 14));
        nombre.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel floro = new JLabel("  ");
        floro.setForeground(Color.BLACK);
        floro.setFont(new java.awt.Font("Century Gothic", 2, 20));
        floro.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel imagen = new JLabel("");
        imagen.setAlignmentX(Component.CENTER_ALIGNMENT);
        imagen.setSize(60, 60);

        if (dir) {
            ImageIcon img_directorio = new ImageIcon(getClass().getResource("/images/Fold.png"));
            ImageIcon img = new ImageIcon(img_directorio.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_DEFAULT));
            imagen.setIcon(img);
        } else {
            ImageIcon img_directorio = new ImageIcon(getClass().getResource("/images/Docu.png"));
            ImageIcon img = new ImageIcon(img_directorio.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_DEFAULT));
            imagen.setIcon(img);
        }

        jp.add(floro);
        jp.add(imagen);
        jp.add(nombre);
        jp.setBackground(Color.white);
        panelB.add(jp);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        arbolR = new javax.swing.JTree();
        jPanel3 = new javax.swing.JPanel();
        btnNuevoA = new javax.swing.JButton();
        btnNuevoD = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        ruta = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        btnCopiar = new javax.swing.JButton();
        btnPegarD = new javax.swing.JButton();
        btnCortar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Explorador de Archivos");
        setAlwaysOnTop(true);
        setIconImage(new ImageIcon(getClass().getResource("/images/WebS.png")).getImage());
        setResizable(false);

        jPanel1.setBackground(java.awt.Color.darkGray);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 2, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Se econtaron x elementos");

        arbolR.setModel(modelo);
        jScrollPane1.setViewportView(arbolR);

        jPanel3.setOpaque(false);

        btnNuevoA.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        btnNuevoA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addFile.png"))); // NOI18N
        btnNuevoA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnNuevoA.setContentAreaFilled(false);
        btnNuevoA.setDefaultCapable(false);
        btnNuevoA.setFocusPainted(false);
        btnNuevoA.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNuevoA.setRequestFocusEnabled(false);
        btnNuevoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoAActionPerformed(evt);
            }
        });

        btnNuevoD.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        btnNuevoD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/0.png"))); // NOI18N
        btnNuevoD.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnNuevoD.setContentAreaFilled(false);
        btnNuevoD.setDefaultCapable(false);
        btnNuevoD.setFocusPainted(false);
        btnNuevoD.setRequestFocusEnabled(false);
        btnNuevoD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoDActionPerformed(evt);
            }
        });

        btnBorrar.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        btnBorrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnBorrar.setContentAreaFilled(false);
        btnBorrar.setDefaultCapable(false);
        btnBorrar.setFocusPainted(false);
        btnBorrar.setRequestFocusEnabled(false);
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Casa.png"))); // NOI18N
        btnInicio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnInicio.setContentAreaFilled(false);
        btnInicio.setDefaultCapable(false);
        btnInicio.setFocusPainted(false);
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        ruta.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        ruta.setForeground(new java.awt.Color(255, 255, 255));
        ruta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/editFile.png"))); // NOI18N
        btnEditar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnEditar.setContentAreaFilled(false);
        btnEditar.setDefaultCapable(false);
        btnEditar.setFocusPainted(false);
        btnEditar.setRequestFocusEnabled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnCopiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/copyFIle.png"))); // NOI18N
        btnCopiar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnCopiar.setContentAreaFilled(false);
        btnCopiar.setDefaultCapable(false);
        btnCopiar.setFocusPainted(false);
        btnCopiar.setRequestFocusEnabled(false);
        btnCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopiarActionPerformed(evt);
            }
        });

        btnPegarD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PasteFile.png"))); // NOI18N
        btnPegarD.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnPegarD.setContentAreaFilled(false);
        btnPegarD.setDefaultCapable(false);
        btnPegarD.setFocusPainted(false);
        btnPegarD.setRequestFocusEnabled(false);
        btnPegarD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPegarDActionPerformed(evt);
            }
        });

        btnCortar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CutFile.png"))); // NOI18N
        btnCortar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnCortar.setContentAreaFilled(false);
        btnCortar.setDefaultCapable(false);
        btnCortar.setFocusPainted(false);
        btnCortar.setRequestFocusEnabled(false);
        btnCortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCortarActionPerformed(evt);
            }
        });

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1.png"))); // NOI18N
        btnBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.setDefaultCapable(false);
        btnBuscar.setFocusPainted(false);
        btnBuscar.setRequestFocusEnabled(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ruta, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNuevoD, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNuevoA, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCortar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPegarD, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnNuevoD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNuevoA, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ruta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnCortar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnPegarD, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnCopiar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jScrollPane2.setMaximumSize(new java.awt.Dimension(854, 400));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Expe.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1040, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoAActionPerformed
        try {
            nuevoA(new File(direccion));
        } catch (IOException ex) {
        }
    }//GEN-LAST:event_btnNuevoAActionPerformed

    private void nuevoA(File a) throws IOException {
        dispose(); //obs
        String name = "/".concat(JOptionPane.showInputDialog(null, "Nombre del archivo", "Crear Archivo", 3)).concat(".txt");
        File asd = new File(a.getAbsolutePath(), name);
        try {
            asd.createNewFile();
        } catch (IOException ex) {
        }
        dispose();
        DcargarEX xd = new DcargarEX(direccion, "", "");
        xd.setVisible(true);
    }

    private void btnNuevoDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoDActionPerformed
        try {
            nuevoD(new File(direccion));
        } catch (IOException ex) {
        }
    }//GEN-LAST:event_btnNuevoDActionPerformed

    private void nuevoD(File a) throws IOException {
        dispose(); //obs
        String name = "/".concat(JOptionPane.showInputDialog(null, "Nombre del directorio", "Crear Directorio", 3));
        File asd = new File(a.getAbsolutePath(), name);
        asd.mkdir();
        dispose();
        DcargarEX xd = new DcargarEX(direccion, "", "");
        xd.setVisible(true);
    }

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        try {
            borraR(new File(direccion));
        } catch (IOException ex) {
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void borraR(File a) throws IOException {
        JLabel nomb = (JLabel) ultimoClickeado.getComponent(2);
        String name = "/" + nomb.getText();
        System.out.println(direccion + name);

        File asd = new File(a.getAbsolutePath(), name);
        File pap = new File(direccion + name);

        if (pap.isDirectory()) {
            File p = new File(dirPapelera + name);
            p.mkdir();
        } else {
            File p = new File(dirPapelera + name);
            p.createNewFile();
        }
        pap.delete();
        asd.delete();
        dispose();
        DcargarEX xd = new DcargarEX(direccion, "", "");
        xd.setVisible(true);
    }

    private void editaR(File a) throws IOException {
        JLabel nomb = (JLabel) ultimoClickeado.getComponent(2);
        String name = "/" + nomb.getText();//Nombre actual
        dispose(); //obs
        String rena = "/".concat(JOptionPane.showInputDialog(null, "Nuevo nombre", "Editar", 3));//Nuevo nombre
        File diract = new File(direccion + name);//direccion actual
        if (diract.isDirectory()) {
            File rename = new File(direccion + rena);//nueva direccion
            diract.renameTo(rename);
        }
        if (diract.isFile()) {
            File rename = new File(direccion + rena + ".txt");//nueva direccion
            diract.renameTo(rename);
        }
        dispose();
        DcargarEX xd = new DcargarEX(direccion, "", "");
        xd.setVisible(true);
    }

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        dispose();
        DcargarEX xd;
        try {
            xd = new DcargarEX(dirHome, nombreCopiar, tipo);
            xd.setVisible(true);
        } catch (IOException ex) {
        }
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        try {
            editaR(new File(direccion));
        } catch (IOException ex) {
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopiarActionPerformed
        JLabel nomb = (JLabel) ultimoClickeado.getComponent(2);
        nombreCopiar = nomb.getText();
        File verificar = new File(direccion + "/" + nombreCopiar);
        if (verificar.isDirectory()) {
            this.tipo = "directorio";
        } else if (verificar.isFile()) {
            this.tipo = "archivo";
        }
    }//GEN-LAST:event_btnCopiarActionPerformed

    private void btnCortarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCortarActionPerformed
        JLabel nomb = (JLabel) ultimoClickeado.getComponent(2);
        nombreCopiar = nomb.getText();
        File verificar = new File(direccion + "/" + nombreCopiar);
        if (verificar.isDirectory()) {
            this.tipo = "directorio";
        } else if (verificar.isFile()) {
            this.tipo = "archivo";
        }
        verificar.delete();
        dispose();
        DcargarEX xd;
        try {
            xd = new DcargarEX(direccion, nombreCopiar, tipo);
            xd.setVisible(true);
        } catch (IOException ex) {
        }
    }//GEN-LAST:event_btnCortarActionPerformed

    private void btnPegarDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPegarDActionPerformed

        if (tipo.equals("directorio")) {
            pegarD = new File(direccion + "/" + nombreCopiar);
            pegarD.mkdir();
        } else if (tipo.equals("archivo")) {
            pegarD = new File(direccion + "/" + nombreCopiar);
            try {
                pegarD.createNewFile();
            } catch (IOException ex) {
            }
        }
        dispose();
        DcargarEX xd;
        try {
            xd = new DcargarEX(direccion, "", "");
            xd.setVisible(true);
        } catch (IOException ex) {
        }

    }//GEN-LAST:event_btnPegarDActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
        dispose(); //obs
        String name = JOptionPane.showInputDialog(null, "Nombre a buscar", "Buscando...", 3);
        DcargarEX xd;
        try {
            xd = new DcargarEX(direccion, "", "");
            xd.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(DcargarEX.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        llenarBuscar(new File(dirHome), name);
        

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void llenarBuscar(File a, String buscar) {
        String[] nombA = a.list();//guardo nombres
        for (int i = 0; i < nombA.length; i++) {
            File b = new File(a.getAbsolutePath(), nombA[i]);//guardo ruta
            if (nombA[i].contains(buscar)) {
                agregarPB(nombA[i], b.isDirectory());
            }
            if (b.isDirectory()) {//verifico
                String[] nombB = b.list();//guardo nombres
                for (int j = 0; j < nombB.length; j++) {
                    File c = new File(b.getAbsolutePath(), nombB[j]);//guardo ruta
                    if (nombB[j].contains(buscar)) {
                        agregarPB(nombB[j], c.isDirectory());
                    }
                    if (c.isDirectory()) {//verifico
                        String[] nombC = c.list();//guardo nombres
                        for (int k = 0; k < nombC.length; k++) {
                            File d = new File(c.getAbsolutePath(), nombC[k]);//guardo ruta
                            if (nombC[k].contains(buscar)) {
                                agregarPB(nombC[k], d.isDirectory());
                            }
                            if (d.isDirectory()) {//verifico
                                String[] nombD = d.list();//guardo nombres
                                for (int l = 0; l < nombD.length; l++) {
                                    File e = new File(d.getAbsolutePath(), nombD[l]);//guardo ruta
                                    if (nombD[l].contains(buscar)) {
                                        agregarPB(nombD[l], e.isDirectory());
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        panelB.setBackground(new java.awt.Color(255, 255, 255));
        panelB.setLayout(new java.awt.GridLayout(0, 8));
        jScrollPane2.setViewportView(panelB);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new DcargarEX(direccion, nombreCopiar, tipo).setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(DcargarEX.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTree arbolR;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCopiar;
    private javax.swing.JButton btnCortar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnNuevoA;
    private javax.swing.JButton btnNuevoD;
    private javax.swing.JButton btnPegarD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel ruta;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mouseClicked(MouseEvent e) {

        if (ultimoClickeado != null) {
            ultimoClickeado.setBackground(Color.WHITE);
        }
        e.getComponent().setBackground(new Color(187, 211, 249));
        ultimoClickeado = (JPanel) e.getComponent();

        if (e.getClickCount() == 2) {
            JLabel nomb = (JLabel) ultimoClickeado.getComponent(2);
            String name = "/" + nomb.getText();
            File asd = new File(direccion, name);
            if (asd.isDirectory()) {
                dispose();
                DcargarEX xd;
                try {
                    xd = new DcargarEX(asd.getAbsolutePath(), nombreCopiar, this.tipo);
                    xd.setVisible(true);
                } catch (IOException ex) {
                }

            } else {
                dispose();
                EditorTexto xd = new EditorTexto();
                xd.setVisible(true);
                try {
                    xd.Abrireltxt(direccion + name);
                } catch (IOException ex) {
                }
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
