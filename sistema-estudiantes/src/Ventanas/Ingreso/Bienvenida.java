package Ventanas.Ingreso;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Gonzalo
 */
public class Bienvenida extends javax.swing.JFrame {

    public Bienvenida() {
        initComponents();
        EstablecerIcono();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgContenedor = new javax.swing.JPanel();
        btnAcceder = new javax.swing.JPanel();
        lbAcceder = new javax.swing.JLabel();
        lbIcon = new javax.swing.JLabel();
        lbFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestión de Estudiantes");
        setResizable(false);
        setSize(new java.awt.Dimension(1227, 770));

        bgContenedor.setAlignmentX(0.0F);
        bgContenedor.setPreferredSize(new java.awt.Dimension(1227, 730));

        btnAcceder.setBackground(new java.awt.Color(0, 153, 153));
        btnAcceder.setAlignmentY(0.0F);
        btnAcceder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAcceder.setPreferredSize(new java.awt.Dimension(211, 90));
        btnAcceder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAccederMouseClicked(evt);
            }
        });

        lbAcceder.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lbAcceder.setForeground(new java.awt.Color(255, 255, 255));
        lbAcceder.setText(" ACCEDER ");

        lbIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/universidad.png"))); // NOI18N

        javax.swing.GroupLayout btnAccederLayout = new javax.swing.GroupLayout(btnAcceder);
        btnAcceder.setLayout(btnAccederLayout);
        btnAccederLayout.setHorizontalGroup(
            btnAccederLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAccederLayout.createSequentialGroup()
                .addContainerGap(514, Short.MAX_VALUE)
                .addComponent(lbIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbAcceder)
                .addContainerGap(514, Short.MAX_VALUE))
        );
        btnAccederLayout.setVerticalGroup(
            btnAccederLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnAccederLayout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addGroup(btnAccederLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(btnAccederLayout.createSequentialGroup()
                        .addComponent(lbAcceder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(2, 2, 2))
                    .addComponent(lbIcon))
                .addContainerGap())
        );

        lbFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.png"))); // NOI18N

        javax.swing.GroupLayout bgContenedorLayout = new javax.swing.GroupLayout(bgContenedor);
        bgContenedor.setLayout(bgContenedorLayout);
        bgContenedorLayout.setHorizontalGroup(
            bgContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAcceder, javax.swing.GroupLayout.PREFERRED_SIZE, 1227, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lbFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bgContenedorLayout.setVerticalGroup(
            bgContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgContenedorLayout.createSequentialGroup()
                .addComponent(lbFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAcceder, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgContenedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgContenedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        bgContenedor.getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void EstablecerIcono() {

        try {
            ImageIcon ic = new ImageIcon(getClass().getResource("/Imagenes/universidad.png"));
            this.setIconImage(ic.getImage());
        } catch (Exception e) {
        }

    }
    
    private void btnAccederMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAccederMouseClicked
        /* Constructor de carga de la ventana */
        Login login = new Login();
        login.setVisible(true);
        dispose();
       
    }//GEN-LAST:event_btnAccederMouseClicked
    
    public JPanel getBtnAcceder() {
        return btnAcceder;
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgContenedor;
    private javax.swing.JPanel btnAcceder;
    private javax.swing.JLabel lbAcceder;
    private javax.swing.JLabel lbFondo;
    private javax.swing.JLabel lbIcon;
    // End of variables declaration//GEN-END:variables
}
