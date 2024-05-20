package Ventanas.Ingreso;

import ConexionSQL.ConexionMySQL;
import Sistema.Sistema;
import Ventanas.Cliente.PanelCliente;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        EstablecerIcono();
        cbxModo.setSelectedItem(null);   // poner en blanco el jcomboBox al principio
    }

    ConexionMySQL con = new ConexionMySQL();
    Connection cn = con.conexion();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgContenedor = new javax.swing.JPanel();
        bgSubcontenedor = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        lbSubtitulo = new javax.swing.JLabel();
        lbUsername = new javax.swing.JLabel();
        lbPassword = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lbModo = new javax.swing.JLabel();
        cbxModo = new javax.swing.JComboBox<>();
        btnRegistrarse = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        bgFondo = new javax.swing.JPanel();
        lbIcon = new javax.swing.JLabel();
        lbVersion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Tomapedido");
        setResizable(false);
        setSize(new java.awt.Dimension(1227, 770));

        bgContenedor.setPreferredSize(new java.awt.Dimension(1227, 730));

        bgSubcontenedor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bgSubcontenedor.setPreferredSize(new java.awt.Dimension(211, 88));

        lbTitulo.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(0, 26, 51));
        lbTitulo.setText("INICIAR SESIÓN");

        lbSubtitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbSubtitulo.setText("Ingrese sus datos de inicio de sesión");

        lbUsername.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        lbUsername.setForeground(new java.awt.Color(102, 102, 102));
        lbUsername.setText("Nombre de usuario");

        lbPassword.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        lbPassword.setForeground(new java.awt.Color(102, 102, 102));
        lbPassword.setText("Contraseña");

        txtUsername.setBackground(new java.awt.Color(255, 255, 255));
        txtUsername.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(0, 26, 51));

        lbModo.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        lbModo.setForeground(new java.awt.Color(102, 102, 102));
        lbModo.setText("Modo de Usuario");

        cbxModo.setBackground(new java.awt.Color(255, 255, 255));
        cbxModo.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        cbxModo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrativo", "Cliente" }));

        btnRegistrarse.setBackground(new java.awt.Color(0, 26, 51));
        btnRegistrarse.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        btnRegistrarse.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarse.setText("Iniciar Sesión");
        btnRegistrarse.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegistrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarseMouseClicked(evt);
            }
        });

        txtPassword.setBackground(new java.awt.Color(255, 255, 255));
        txtPassword.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N

        javax.swing.GroupLayout bgSubcontenedorLayout = new javax.swing.GroupLayout(bgSubcontenedor);
        bgSubcontenedor.setLayout(bgSubcontenedorLayout);
        bgSubcontenedorLayout.setHorizontalGroup(
            bgSubcontenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgSubcontenedorLayout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addGroup(bgSubcontenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPassword)
                    .addComponent(lbUsername)
                    .addComponent(lbSubtitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTitulo)
                    .addComponent(lbPassword)
                    .addComponent(lbModo)
                    .addComponent(txtUsername, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbxModo, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(173, Short.MAX_VALUE))
        );
        bgSubcontenedorLayout.setVerticalGroup(
            bgSubcontenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgSubcontenedorLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(lbTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbSubtitulo)
                .addGap(33, 33, 33)
                .addComponent(lbUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(lbPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(lbModo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxModo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(btnRegistrarse)
                .addContainerGap(137, Short.MAX_VALUE))
        );

        bgFondo.setBackground(new java.awt.Color(0, 26, 51));

        lbIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventanas/Imagenes/unmsm.png"))); // NOI18N

        lbVersion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbVersion.setForeground(new java.awt.Color(255, 255, 255));
        lbVersion.setText("Version 4.3");

        javax.swing.GroupLayout bgFondoLayout = new javax.swing.GroupLayout(bgFondo);
        bgFondo.setLayout(bgFondoLayout);
        bgFondoLayout.setHorizontalGroup(
            bgFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgFondoLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(bgFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgFondoLayout.createSequentialGroup()
                        .addComponent(lbVersion)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(bgFondoLayout.createSequentialGroup()
                        .addComponent(lbIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
                        .addGap(36, 36, 36))))
        );
        bgFondoLayout.setVerticalGroup(
            bgFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgFondoLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(lbIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbVersion)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout bgContenedorLayout = new javax.swing.GroupLayout(bgContenedor);
        bgContenedor.setLayout(bgContenedorLayout);
        bgContenedorLayout.setHorizontalGroup(
            bgContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgContenedorLayout.createSequentialGroup()
                .addComponent(bgFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bgSubcontenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
                .addContainerGap())
        );
        bgContenedorLayout.setVerticalGroup(
            bgContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bgContenedorLayout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(bgSubcontenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            ImageIcon ic = new ImageIcon(getClass().getResource("/Ventanas/Iconos/pedido.png"));
            this.setIconImage(ic.getImage());
        } catch (Exception e) {
        }

    }

    private void btnRegistrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarseMouseClicked

        String SQL = "select * from clientes where usuario ='" + txtUsername.getText() + "'and password ='" + txtPassword.getText() + "' ";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            if (rs.next()) {
                String dni = rs.getString(5);
                Sistema.cliente.setDni(dni);

                if (getCbxModo().equals("Administrativo")) {
                   JOptionPane.showMessageDialog(null, "TEST:Inicio de sesión exitoso", "Buen dia " + txtUsername.getText(), JOptionPane.INFORMATION_MESSAGE);
                    

                } else if (getCbxModo().equals("Cliente")) {

                    
                    JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso", "Buen dia " + txtUsername.getText(), JOptionPane.INFORMATION_MESSAGE);
                    PanelCliente administrativo = new PanelCliente();
                    administrativo.setVisible(true);
                    dispose();
                }

                //this.dispose();
                //MainClientes mc = new MainClientes();
                //mc.setLocationRelativeTo(null);
                //mc.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Credenciales incorrentas", "Error", JOptionPane.WARNING_MESSAGE);
            }
        } catch (HeadlessException | SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnRegistrarseMouseClicked

    public String getCbxModo() {    // validacion cbx - null
        return cbxModo.getSelectedItem() != null ? cbxModo.getSelectedItem().toString() : "";
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgContenedor;
    private javax.swing.JPanel bgFondo;
    private javax.swing.JPanel bgSubcontenedor;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JComboBox<String> cbxModo;
    private javax.swing.JLabel lbIcon;
    private javax.swing.JLabel lbModo;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JLabel lbSubtitulo;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbUsername;
    private javax.swing.JLabel lbVersion;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
