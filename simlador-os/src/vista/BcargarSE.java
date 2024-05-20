package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.Timer;

public class BcargarSE extends javax.swing.JFrame {

    public BcargarSE() {

        initComponents();
        setLocationRelativeTo(null);
        cargarFYH();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelUsuario = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        nombreUsuario = new javax.swing.JLabel();
        cajaConstraseña = new javax.swing.JPasswordField();
        btnIniciar = new javax.swing.JButton();
        mensajeError = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        panelRegistro = new javax.swing.JPanel();
        mensajeError1 = new javax.swing.JLabel();
        mensajeError2 = new javax.swing.JLabel();
        cajaRegistrarContraseña = new javax.swing.JPasswordField();
        cajaRegistrarUsuario = new javax.swing.JTextField();
        btnAceptarRegistro = new javax.swing.JButton();
        fecha = new javax.swing.JLabel();
        hora = new javax.swing.JLabel();
        panelApagar = new javax.swing.JPanel();
        comboUsuarios = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        btnApagar = new javax.swing.JButton();
        btnCambiarUsuario = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setEnabled(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel1.setLayout(null);

        panelUsuario.setOpaque(false);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Usua.png"))); // NOI18N

        nombreUsuario.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        nombreUsuario.setForeground(new java.awt.Color(255, 255, 255));
        nombreUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreUsuario.setText("Invitado");

        cajaConstraseña.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        cajaConstraseña.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        btnIniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Desb.png"))); // NOI18N
        btnIniciar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnIniciar.setContentAreaFilled(false);
        btnIniciar.setFocusable(false);

        mensajeError.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        mensajeError.setForeground(new java.awt.Color(255, 255, 255));
        mensajeError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mensajeError.setText("Contraseña Incorrecta. Por favor inténtenlo de nuevo.");

        btnRegistrar.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Registrar");
        btnRegistrar.setBorder(null);
        btnRegistrar.setContentAreaFilled(false);
        btnRegistrar.setFocusPainted(false);
        btnRegistrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelUsuarioLayout = new javax.swing.GroupLayout(panelUsuario);
        panelUsuario.setLayout(panelUsuarioLayout);
        panelUsuarioLayout.setHorizontalGroup(
            panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mensajeError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(nombreUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelUsuarioLayout.createSequentialGroup()
                .addGap(579, 579, 579)
                .addGroup(panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cajaConstraseña)
                    .addComponent(btnIniciar, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelUsuarioLayout.createSequentialGroup()
                .addContainerGap(583, Short.MAX_VALUE)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(580, 580, 580))
        );
        panelUsuarioLayout.setVerticalGroup(
            panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUsuarioLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombreUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cajaConstraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(mensajeError, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(panelUsuario);
        panelUsuario.setBounds(0, 0, 1366, 490);

        panelRegistro.setOpaque(false);

        mensajeError1.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        mensajeError1.setForeground(new java.awt.Color(255, 255, 255));
        mensajeError1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mensajeError1.setText("Contraseña:");

        mensajeError2.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        mensajeError2.setForeground(new java.awt.Color(255, 255, 255));
        mensajeError2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mensajeError2.setText("Usuario:");

        cajaRegistrarContraseña.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        cajaRegistrarContraseña.setForeground(new java.awt.Color(255, 255, 255));
        cajaRegistrarContraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cajaRegistrarContraseña.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        cajaRegistrarContraseña.setOpaque(false);

        cajaRegistrarUsuario.setFont(new java.awt.Font("Century Gothic", 2, 16)); // NOI18N
        cajaRegistrarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        cajaRegistrarUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cajaRegistrarUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        cajaRegistrarUsuario.setOpaque(false);

        btnAceptarRegistro.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        btnAceptarRegistro.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptarRegistro.setText("Aceptar");
        btnAceptarRegistro.setBorder(null);
        btnAceptarRegistro.setContentAreaFilled(false);
        btnAceptarRegistro.setFocusPainted(false);
        btnAceptarRegistro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelRegistroLayout = new javax.swing.GroupLayout(panelRegistro);
        panelRegistro.setLayout(panelRegistroLayout);
        panelRegistroLayout.setHorizontalGroup(
            panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegistroLayout.createSequentialGroup()
                        .addComponent(btnAceptarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4))
                    .addComponent(cajaRegistrarContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(mensajeError1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cajaRegistrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(mensajeError2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        panelRegistroLayout.setVerticalGroup(
            panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mensajeError2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cajaRegistrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mensajeError1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cajaRegistrarContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAceptarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(panelRegistro);
        panelRegistro.setBounds(600, 490, 180, 230);

        fecha.setFont(new java.awt.Font("Century Gothic", 2, 36)); // NOI18N
        fecha.setForeground(new java.awt.Color(255, 255, 255));
        fecha.setText("miercoles, 18 Agosto 2020");
        jPanel1.add(fecha);
        fecha.setBounds(20, 700, 469, 60);

        hora.setFont(new java.awt.Font("Century Gothic", 2, 56)); // NOI18N
        hora.setForeground(new java.awt.Color(255, 255, 255));
        hora.setText("3:40 PM");
        jPanel1.add(hora);
        hora.setBounds(20, 610, 308, 89);

        panelApagar.setOpaque(false);

        comboUsuarios.setBackground(new java.awt.Color(102, 102, 102));
        comboUsuarios.setFont(new java.awt.Font("Century Gothic", 2, 16)); // NOI18N
        comboUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        comboUsuarios.setBorder(null);
        comboUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        comboUsuarios.setPreferredSize(new java.awt.Dimension(84, 34));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ES");

        btnApagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ApaB.png"))); // NOI18N
        btnApagar.setBorder(null);
        btnApagar.setBorderPainted(false);
        btnApagar.setContentAreaFilled(false);
        btnApagar.setFocusPainted(false);

        btnCambiarUsuario.setFont(new java.awt.Font("Century Gothic", 2, 16)); // NOI18N
        btnCambiarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnCambiarUsuario.setText("CAMBIAR USUARIO");
        btnCambiarUsuario.setBorder(null);
        btnCambiarUsuario.setBorderPainted(false);
        btnCambiarUsuario.setContentAreaFilled(false);
        btnCambiarUsuario.setFocusPainted(false);
        btnCambiarUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCambiarUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelApagarLayout = new javax.swing.GroupLayout(panelApagar);
        panelApagar.setLayout(panelApagarLayout);
        panelApagarLayout.setHorizontalGroup(
            panelApagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelApagarLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(panelApagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboUsuarios, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCambiarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelApagarLayout.setVerticalGroup(
            panelApagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelApagarLayout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(comboUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelApagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnApagar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelApagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                        .addComponent(btnCambiarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1.add(panelApagar);
        panelApagar.setBounds(1030, 630, 340, 135);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Fond.jpg"))); // NOI18N
        jLabel1.setFocusable(false);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1366, 768);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 768));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BcargarSE().setVisible(true);
            }
        });
    }

    private void cargarFYH() {
        //FECHA DEL SISTEMA
        Date sistFecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat(" EEEEEEE, dd MMMMM YYYY");
        fecha.setText(formato.format(sistFecha));
        //HORA DEL SISTEMA
        Timer tiempo = new Timer(100, new BcargarSE.horas());
        tiempo.start();

    }

    class horas implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            Date sistHora = new Date();
            String pmAm = "hh:mm a";
            SimpleDateFormat format = new SimpleDateFormat(pmAm);
            Calendar hoy = Calendar.getInstance();
            hora.setText(String.format(format.format(sistHora), hoy));
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAceptarRegistro;
    public javax.swing.JButton btnApagar;
    public javax.swing.JButton btnCambiarUsuario;
    public javax.swing.JButton btnIniciar;
    public javax.swing.JButton btnRegistrar;
    public javax.swing.JPasswordField cajaConstraseña;
    public javax.swing.JPasswordField cajaRegistrarContraseña;
    public javax.swing.JTextField cajaRegistrarUsuario;
    public javax.swing.JComboBox<String> comboUsuarios;
    public javax.swing.JLabel fecha;
    public javax.swing.JLabel hora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel mensajeError;
    public javax.swing.JLabel mensajeError1;
    public javax.swing.JLabel mensajeError2;
    public javax.swing.JLabel nombreUsuario;
    private javax.swing.JPanel panelApagar;
    public javax.swing.JPanel panelRegistro;
    public javax.swing.JPanel panelUsuario;
    // End of variables declaration//GEN-END:variables
}
