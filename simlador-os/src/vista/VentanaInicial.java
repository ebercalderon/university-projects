
package vista;

import javax.swing.ImageIcon;

public class VentanaInicial extends javax.swing.JFrame {
    private String usuario1;
    private String usuario2;
    
    public VentanaInicial() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        etiquetaImagen = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        etiquetaNombre1 = new javax.swing.JLabel();
        cajaUsuario1 = new javax.swing.JTextField();
        etiquetaNombre2 = new javax.swing.JLabel();
        cajaUsuario2 = new javax.swing.JTextField();
        botonGuardar = new javax.swing.JButton();
        etiquetaMuestra1 = new javax.swing.JLabel();
        etiquetaMuestra2 = new javax.swing.JLabel();
        botonComenzar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImage(new ImageIcon(getClass().getResource("/imagenesJuego/juego.png")).getImage());
        setResizable(false);

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiquetaImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesJuego/3EnRaya.gif"))); // NOI18N
        panel.add(etiquetaImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 240, 180));

        titulo.setFont(new java.awt.Font("Century Gothic", 3, 36)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Tres en Raya");
        panel.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 605, -1));

        etiquetaNombre1.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        etiquetaNombre1.setText("Digite el nombre del Usuario 1 :");
        panel.add(etiquetaNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 106, -1, -1));

        cajaUsuario1.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        cajaUsuario1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
        panel.add(cajaUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 100, 270, 30));

        etiquetaNombre2.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        etiquetaNombre2.setText("Digite el nombre del Usuario 2 : ");
        panel.add(etiquetaNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 164, -1, -1));

        cajaUsuario2.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        cajaUsuario2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
        panel.add(cajaUsuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 160, 270, 30));

        botonGuardar.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        botonGuardar.setText("Guardar");
        botonGuardar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
        botonGuardar.setContentAreaFilled(false);
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });
        panel.add(botonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 227, 90, 40));

        etiquetaMuestra1.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        panel.add(etiquetaMuestra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        etiquetaMuestra2.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        panel.add(etiquetaMuestra2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        botonComenzar.setFont(new java.awt.Font("Century Gothic", 2, 24)); // NOI18N
        botonComenzar.setText("Comenzar Juego");
        botonComenzar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
        botonComenzar.setContentAreaFilled(false);
        botonComenzar.setVisible(false);
        botonComenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonComenzarActionPerformed(evt);
            }
        });
        panel.add(botonComenzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 240, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        usuario1 = cajaUsuario1.getText();
        usuario2 = cajaUsuario2.getText();
        
        botonGuardar.setVisible(false);
        
        etiquetaMuestra1.setText(usuario1+" jugará primero,    su ficha es: X");
        etiquetaMuestra2.setText(usuario2+" jugará segundo, su ficha es: O");
        
        botonComenzar.setVisible(true);
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void botonComenzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonComenzarActionPerformed
        VentanaPrincipal ventanaP = new VentanaPrincipal(usuario1,usuario2);
        ventanaP.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_botonComenzarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonComenzar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JTextField cajaUsuario1;
    private javax.swing.JTextField cajaUsuario2;
    private javax.swing.JLabel etiquetaImagen;
    private javax.swing.JLabel etiquetaMuestra1;
    private javax.swing.JLabel etiquetaMuestra2;
    private javax.swing.JLabel etiquetaNombre1;
    private javax.swing.JLabel etiquetaNombre2;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
