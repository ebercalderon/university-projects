
package vista;

import javax.swing.table.DefaultTableModel;

public class VentanaMostrarResultados extends javax.swing.JDialog {
    private int vecesGanadas1,vecesGanadas2,vecesEmpate;
    DefaultTableModel modeloTabla = new DefaultTableModel();
    private String usuario1,usuario2;
    
    public VentanaMostrarResultados(java.awt.Frame parent, boolean modal,int vecesGanadas1,int vecesGanadas2,int vecesEmpate,String usuario1,String usuario2) {
        super(parent, modal);
        this.vecesGanadas1 = vecesGanadas1;
        this.vecesGanadas2 = vecesGanadas2;
        this.vecesEmpate = vecesEmpate;
        this.usuario1 = usuario1;
        this.usuario2 = usuario2;
        cargarModeloTabla();
        initComponents();
        setLocationRelativeTo(null);
    }

    private void cargarModeloTabla(){
        modeloTabla.addColumn("N° victorias de "+usuario1);
        modeloTabla.addColumn("N° victorias de "+usuario2);
        modeloTabla.addColumn("Empates");
        String [] fila = {String.valueOf(vecesGanadas1),String.valueOf(vecesGanadas2),String.valueOf(vecesEmpate)};
        
        modeloTabla.addRow(fila);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        botonRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Century Gothic", 2, 24)); // NOI18N
        jLabel1.setText("Tabla de Resultados");

        jTable1.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        jTable1.setModel(modeloTabla);
        jTable1.setRowHeight(20);
        jScrollPane1.setViewportView(jTable1);

        botonRegresar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        botonRegresar.setText("Regresar");
        botonRegresar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
        botonRegresar.setContentAreaFilled(false);
        botonRegresar.setFocusable(false);
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
        dispose();
    }//GEN-LAST:event_botonRegresarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaMostrarResultados dialog = new VentanaMostrarResultados(new javax.swing.JFrame(), true,0,0,0,null,null);
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
    private javax.swing.JButton botonRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
