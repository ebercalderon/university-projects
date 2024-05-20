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
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class EcargarPA extends javax.swing.JFrame implements MouseListener {

    private static JPanel ultimoClickeado;
    DefaultMutableTreeNode Papelera = new DefaultMutableTreeNode("Papelera");
    DefaultTreeModel modelo = new DefaultTreeModel(Papelera);
    final String dirHome = System.getProperty("user.dir") + File.separator + "Mi_PC";
    final String dirPapelera = System.getProperty("user.dir") + File.separator + "Papelera";
    static String direccionP;
    private final JPanel panelA = new JPanel();

    public EcargarPA(String dirAct) throws IOException {
        direccionP = dirAct;
        initComponents();
        setLocationRelativeTo(null);

        cargarArbol(new File(dirPapelera));
        llenarPaneles(new File(direccionP));

        panelA.setBackground(new java.awt.Color(255, 255, 255));
        panelA.setLayout(new java.awt.GridLayout(0, 8));
        jScrollPane2.setViewportView(panelA);

    }

    private void llenarPaneles(File a) throws IOException {
        String[] nombA = a.list();//guardo nombres

        jLabel1.setText(String.valueOf("Se encontaron " + nombA.length + " elementos."));
        ruta.setText(" >Papelera");
        //ruta.setText(" >" + a.getCanonicalPath());
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
            Papelera.add(nodo);
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnVaciarPapelera = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        ruta = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        arbolR = new javax.swing.JTree();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Papelera de Reciclaje");
        setAlwaysOnTop(true);
        setIconImage(new ImageIcon(getClass().getResource("/images/Tach.png")).getImage());
        setResizable(false);

        jPanel1.setBackground(java.awt.Color.darkGray);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 2, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Se econtaron x elementos");

        jPanel3.setOpaque(false);

        btnVaciarPapelera.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        btnVaciarPapelera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/000.png"))); // NOI18N
        btnVaciarPapelera.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnVaciarPapelera.setContentAreaFilled(false);
        btnVaciarPapelera.setDefaultCapable(false);
        btnVaciarPapelera.setFocusPainted(false);
        btnVaciarPapelera.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVaciarPapelera.setRequestFocusEnabled(false);
        btnVaciarPapelera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVaciarPapeleraActionPerformed(evt);
            }
        });

        btnBorrar.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        btnBorrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnBorrar.setContentAreaFilled(false);
        btnBorrar.setDefaultCapable(false);
        btnBorrar.setFocusPainted(false);
        btnBorrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBorrar.setRequestFocusEnabled(false);
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        ruta.setFont(new java.awt.Font("Courier New", 2, 18)); // NOI18N
        ruta.setForeground(new java.awt.Color(255, 255, 255));
        ruta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/00.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton1.setContentAreaFilled(false);
        jButton1.setDefaultCapable(false);
        jButton1.setFocusPainted(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(ruta, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVaciarPapelera, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVaciarPapelera, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ruta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jScrollPane2.setMaximumSize(new java.awt.Dimension(854, 400));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Expe.png"))); // NOI18N

        arbolR.setModel(modelo);
        jScrollPane1.setViewportView(arbolR);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        try {
            borraR(new File(direccionP));
        } catch (IOException ex) {
            Logger.getLogger(EcargarPA.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void borraR(File a) throws IOException {
        JLabel nomb = (JLabel) ultimoClickeado.getComponent(2);
        System.out.println(nomb.getText());
        String name = "/" + nomb.getText();
        File asd = new File(a.getAbsolutePath(), name);
        System.out.println("delete directorio");
        asd.delete();
        dispose();
        EcargarPA xd = new EcargarPA(direccionP);
        xd.setVisible(true);

    }

    private void btnVaciarPapeleraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVaciarPapeleraActionPerformed

        File a = new File(dirPapelera);
        String[] nombA = a.list();//guardo nombres
        for (int i = 0; i < nombA.length; i++) {
            File borrar = new File(dirPapelera + "/" + nombA[i]);
            System.out.println(dirPapelera + "/" + nombA[i]);
            borrar.delete();

        }
        dispose();
        EcargarPA xd;
        try {
            xd = new EcargarPA(direccionP);
            xd.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(EcargarPA.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnVaciarPapeleraActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            borrarxd(new File(direccionP));
        } catch (IOException ex) {
            Logger.getLogger(EcargarPA.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void borrarxd(File a) throws IOException {
        JLabel nomb = (JLabel) ultimoClickeado.getComponent(2);
        String name = "/" + nomb.getText();

        File asd = new File(a.getAbsolutePath(), name);
        File pap = new File(direccionP + name);

        if (pap.isDirectory()) {
            File p = new File(dirHome + name);
            p.mkdir();
        } else {
            File p = new File(dirHome + name);
            p.createNewFile();
        }
        asd.delete();
        dispose();
        EcargarPA xd;
        try {
            xd = new EcargarPA(direccionP);
            xd.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(EcargarPA.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new EcargarPA(direccionP).setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(EcargarPA.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTree arbolR;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnVaciarPapelera;
    private javax.swing.JButton jButton1;
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
