
package vista;

public class VentanaG extends javax.swing.JDialog {
    private String usuario;
    
    public VentanaG(java.awt.Frame parent, boolean modal,String usuario) {
        super(parent, modal);
        this.usuario = usuario;
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        salir = new javax.swing.JButton();
        etiquetaUsuario = new javax.swing.JLabel();
        etiquetaGanaste = new javax.swing.JLabel();
        juegoDeNuevo = new javax.swing.JButton();
        etiquetaImagen = new javax.swing.JLabel();

        salir.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        salir.setForeground(new java.awt.Color(255, 255, 255));
        salir.setText("Aceptar");
        salir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        salir.setContentAreaFilled(false);
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiquetaUsuario.setFont(new java.awt.Font("Century Gothic", 2, 30)); // NOI18N
        etiquetaUsuario.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaUsuario.setText("Felicitaciones "+usuario);

        getContentPane().add(etiquetaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 470, -1));

        etiquetaGanaste.setFont(new java.awt.Font("Century Gothic", 2, 30)); // NOI18N
        etiquetaGanaste.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaGanaste.setText("Ganaste!!!");
        getContentPane().add(etiquetaGanaste, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        juegoDeNuevo.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        juegoDeNuevo.setForeground(new java.awt.Color(255, 255, 255));
        juegoDeNuevo.setText("Jugar de nuevo");
        juegoDeNuevo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        juegoDeNuevo.setContentAreaFilled(false);
        juegoDeNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                juegoDeNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(juegoDeNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 130, 30));

        etiquetaImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesJuego/ganador.gif"))); // NOI18N
        getContentPane().add(etiquetaImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        dispose();
        
    }//GEN-LAST:event_salirActionPerformed

    private void juegoDeNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_juegoDeNuevoActionPerformed
        dispose();        
    }//GEN-LAST:event_juegoDeNuevoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaG dialog = new VentanaG(new javax.swing.JFrame(), true,null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etiquetaGanaste;
    private javax.swing.JLabel etiquetaImagen;
    private javax.swing.JLabel etiquetaUsuario;
    private javax.swing.JButton juegoDeNuevo;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
