package Ventanas.Ingreso;

import Modelo.Clases.Usuario;
import static Persistencia.Datos.cargarUsuarios;
import Ventanas.Administrativos.PanelAdministrativo;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Gonzalo
 */
public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        EstablecerIcono();
    }

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
        btnRegistrarse = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        bgFondo = new javax.swing.JPanel();
        lbIcon = new javax.swing.JLabel();
        lbVersion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestión de Estudiantes");
        setPreferredSize(new java.awt.Dimension(1146, 710));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 600));

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
        txtUsername.setText("admin");

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
        txtPassword.setText("admin");

        javax.swing.GroupLayout bgSubcontenedorLayout = new javax.swing.GroupLayout(bgSubcontenedor);
        bgSubcontenedor.setLayout(bgSubcontenedorLayout);
        bgSubcontenedorLayout.setHorizontalGroup(
            bgSubcontenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgSubcontenedorLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(bgSubcontenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPassword)
                    .addComponent(lbUsername)
                    .addComponent(lbSubtitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTitulo)
                    .addComponent(lbPassword)
                    .addComponent(txtUsername, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(216, Short.MAX_VALUE))
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
                .addGap(95, 95, 95)
                .addComponent(btnRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(201, Short.MAX_VALUE))
        );

        bgFondo.setBackground(new java.awt.Color(0, 26, 51));

        lbIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/java.png"))); // NOI18N

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
                    .addComponent(lbIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbVersion))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        bgFondoLayout.setVerticalGroup(
            bgFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgFondoLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(lbIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(lbVersion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout bgContenedorLayout = new javax.swing.GroupLayout(bgContenedor);
        bgContenedor.setLayout(bgContenedorLayout);
        bgContenedorLayout.setHorizontalGroup(
            bgContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgContenedorLayout.createSequentialGroup()
                .addComponent(bgFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bgSubcontenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
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
            ImageIcon ic = new ImageIcon(getClass().getResource("/Imagenes/universidad.png"));
            this.setIconImage(ic.getImage());
        } catch (Exception e) {
        }

    }
    
    /* Método para validar el ingreso de usuarios */
    private void btnRegistrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarseMouseClicked
        
        ArrayList<Usuario>  usuario = cargarUsuarios();
        
        if (usuario.stream().anyMatch(buscar -> (buscar.getUsername().equals(txtUsername.getText()) && buscar.getPassword().equals(txtPassword.getText())))) {
               
                // mensaje saludo
                JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso", "Buen dia " + txtUsername.getText(), JOptionPane.INFORMATION_MESSAGE);
                /* Constructor de carga de la ventana */
                PanelAdministrativo administrativo = new PanelAdministrativo();
                administrativo.setVisible(true);
                dispose();

        } else {
            JOptionPane.showMessageDialog(null, "Credenciales incorrentas", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnRegistrarseMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgContenedor;
    private javax.swing.JPanel bgFondo;
    private javax.swing.JPanel bgSubcontenedor;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JLabel lbIcon;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JLabel lbSubtitulo;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbUsername;
    private javax.swing.JLabel lbVersion;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
