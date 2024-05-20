package vista;

import static Persistencia.Datos.agregarUsuario;
import static Persistencia.Datos.cargarUsuarios;
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import modelo.Usuario;

public class EcargarAU extends javax.swing.JFrame implements MouseListener {

    private String NOMBRE, PERMISO, CONTRASEÑA;

    private static JPanel ultimoClickeado;
    private final JPanel panelA = new JPanel();

    public EcargarAU() throws IOException {
        initComponents();
        setLocationRelativeTo(null);
        //aver();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nombrexd = new javax.swing.JLabel();
        permisoxd = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnCambiarNombre = new javax.swing.JButton();
        btnCambiarTipoCuenta = new javax.swing.JButton();
        btnCambiarContraseña = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        comboUsuarios = new javax.swing.JComboBox<>();
        btnCambiarUsuario = new javax.swing.JButton();
        btnElimina = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        cajaNombreNuevo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cajaClaveActual = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cajaClaveNueva = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnWardar = new javax.swing.JButton();
        btnWardar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cuentas de Usuarios");
        setAlwaysOnTop(true);
        setIconImage(new ImageIcon(getClass().getResource("/images/shield.png")).getImage());
        setResizable(false);

        jPanel2.setBackground(java.awt.SystemColor.activeCaption);
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255)));
        jPanel2.setFocusable(false);

        jLabel1.setBackground(javax.swing.UIManager.getDefaults().getColor("InternalFrame.activeTitleGradient"));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nueva carpeta/man.png"))); // NOI18N
        jLabel1.setOpaque(true);

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setText("Cuenta Local");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setText("Protegida por contraseña");

        nombrexd.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        nombrexd.setText("       ");

        permisoxd.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        permisoxd.setText("         ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nombrexd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(permisoxd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(nombrexd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(permisoxd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addGap(30, 30, 30))))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255)));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel4.setFocusable(false);

        btnCambiarNombre.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        btnCambiarNombre.setForeground(new java.awt.Color(0, 0, 102));
        btnCambiarNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nueva carpeta/shield.png"))); // NOI18N
        btnCambiarNombre.setText("Cambiar nombre.");
        btnCambiarNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnCambiarNombre.setBorderPainted(false);
        btnCambiarNombre.setContentAreaFilled(false);
        btnCambiarNombre.setFocusPainted(false);
        btnCambiarNombre.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnCambiarNombre.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnCambiarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarNombreActionPerformed(evt);
            }
        });

        btnCambiarTipoCuenta.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        btnCambiarTipoCuenta.setForeground(new java.awt.Color(0, 0, 102));
        btnCambiarTipoCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nueva carpeta/shield.png"))); // NOI18N
        btnCambiarTipoCuenta.setText("Cambiar el tipo de cuenta.");
        btnCambiarTipoCuenta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnCambiarTipoCuenta.setBorderPainted(false);
        btnCambiarTipoCuenta.setContentAreaFilled(false);
        btnCambiarTipoCuenta.setFocusPainted(false);
        btnCambiarTipoCuenta.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnCambiarTipoCuenta.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnCambiarTipoCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarTipoCuentaActionPerformed(evt);
            }
        });

        btnCambiarContraseña.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        btnCambiarContraseña.setForeground(new java.awt.Color(0, 0, 102));
        btnCambiarContraseña.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nueva carpeta/shield.png"))); // NOI18N
        btnCambiarContraseña.setText("Cambiar Contraseña.");
        btnCambiarContraseña.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnCambiarContraseña.setBorderPainted(false);
        btnCambiarContraseña.setContentAreaFilled(false);
        btnCambiarContraseña.setFocusPainted(false);
        btnCambiarContraseña.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnCambiarContraseña.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnCambiarContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarContraseñaActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Century Gothic", 2, 20)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Realizar Cambios en la cuenta.");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnCambiarNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCambiarTipoCuenta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCambiarContraseña, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCambiarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCambiarTipoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(btnCambiarContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255)));
        jPanel3.setFocusable(false);

        comboUsuarios.setBackground(java.awt.SystemColor.control);
        comboUsuarios.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        comboUsuarios.setBorder(null);
        comboUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        comboUsuarios.setPreferredSize(new java.awt.Dimension(84, 34));

        btnCambiarUsuario.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnCambiarUsuario.setForeground(new java.awt.Color(0, 0, 102));
        btnCambiarUsuario.setText("Cambiar Usuario");
        btnCambiarUsuario.setBorder(null);
        btnCambiarUsuario.setBorderPainted(false);
        btnCambiarUsuario.setContentAreaFilled(false);
        btnCambiarUsuario.setFocusPainted(false);
        btnCambiarUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCambiarUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCambiarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarUsuarioActionPerformed(evt);
            }
        });

        btnElimina.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        btnElimina.setForeground(new java.awt.Color(0, 0, 102));
        btnElimina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nueva carpeta/shield.png"))); // NOI18N
        btnElimina.setText("Eliminar Usuario.");
        btnElimina.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnElimina.setBorderPainted(false);
        btnElimina.setContentAreaFilled(false);
        btnElimina.setEnabled(false);
        btnElimina.setFocusPainted(false);
        btnElimina.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnElimina.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnElimina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminaActionPerformed(evt);
            }
        });

        btnAgregar.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(0, 0, 102));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nueva carpeta/shield.png"))); // NOI18N
        btnAgregar.setText("Agregar Usuario.");
        btnAgregar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnAgregar.setBorderPainted(false);
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.setFocusPainted(false);
        btnAgregar.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnElimina, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(comboUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(btnCambiarUsuario)
                        .addGap(31, 31, 31))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCambiarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnElimina, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255)));
        jPanel5.setFocusable(false);

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setText("Nuevo Nombre:");

        cajaNombreNuevo.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel8.setText("Tipo de Cuenta:");

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel9.setText("Nueva Clave:");

        cajaClaveActual.setEnabled(false);

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel11.setText("Repita Clave:");

        cajaClaveNueva.setEnabled(false);

        jComboBox1.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo de cuenta", "Usuario estandar", "Invitado" }));
        jComboBox1.setEnabled(false);

        btnWardar.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        btnWardar.setForeground(new java.awt.Color(0, 0, 102));
        btnWardar.setText("Guardar Cambios.");
        btnWardar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnWardar.setBorderPainted(false);
        btnWardar.setContentAreaFilled(false);
        btnWardar.setEnabled(false);
        btnWardar.setFocusPainted(false);
        btnWardar.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnWardar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnWardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWardarActionPerformed(evt);
            }
        });

        btnWardar1.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        btnWardar1.setForeground(new java.awt.Color(0, 0, 102));
        btnWardar1.setText("Guardar Usuario.");
        btnWardar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnWardar1.setBorderPainted(false);
        btnWardar1.setContentAreaFilled(false);
        btnWardar1.setEnabled(false);
        btnWardar1.setFocusPainted(false);
        btnWardar1.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnWardar1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnWardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWardar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnWardar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnWardar))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cajaClaveNueva)
                            .addComponent(cajaClaveActual)
                            .addComponent(cajaNombreNuevo)
                            .addComponent(jComboBox1, 0, 272, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cajaNombreNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cajaClaveActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cajaClaveNueva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnWardar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnWardar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCambiarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarUsuarioActionPerformed
        ArrayList<Usuario> usuarios = cargarUsuarios();
        try {

            String aux = comboUsuarios.getSelectedItem().toString();
            for (int i = 0; i < usuarios.size(); i++) {

                if (usuarios.get(i).getNombre().equals(aux)) {
                    NOMBRE = usuarios.get(i).getNombre();
                    CONTRASEÑA = usuarios.get(i).getClave();
                    PERMISO = usuarios.get(i).getPermisos();
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(EcargarAU.class.getName()).log(Level.SEVERE, null, ex);
        }
        nombrexd.setText(NOMBRE);
        permisoxd.setText(PERMISO);
        btnElimina.setEnabled(true);
    }//GEN-LAST:event_btnCambiarUsuarioActionPerformed

    private void btnCambiarContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarContraseñaActionPerformed

        cajaClaveNueva.setEnabled(true);
        cajaClaveActual.setEnabled(true);
        btnWardar.setEnabled(true);
        cajaNombreNuevo.setEnabled(false);
        jComboBox1.setEnabled(false);
        btnWardar1.setEnabled(false);
    }//GEN-LAST:event_btnCambiarContraseñaActionPerformed

    private void btnCambiarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarNombreActionPerformed

        cajaNombreNuevo.setEnabled(true);
        cajaClaveActual.setEnabled(false);
        cajaClaveNueva.setEnabled(false);
        jComboBox1.setEnabled(false);
        btnWardar.setEnabled(true);
        btnWardar1.setEnabled(false);


    }//GEN-LAST:event_btnCambiarNombreActionPerformed

    private void btnCambiarTipoCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarTipoCuentaActionPerformed

        jComboBox1.setEnabled(true);
        btnWardar.setEnabled(true);
        cajaNombreNuevo.setEnabled(false);
        cajaClaveActual.setEnabled(false);
        cajaClaveNueva.setEnabled(false);
        btnWardar1.setEnabled(false);
    }//GEN-LAST:event_btnCambiarTipoCuentaActionPerformed

    private void btnWardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWardarActionPerformed
        /*
        Connection conexion = getConnection();
        if (cajaNombreNuevo.isEnabled()) {
            try {
                ps = conexion.prepareStatement("UPDATE persona SET user_nombre = ? WHERE user_nombre = ?");
                ps.setString(1, cajaNombreNuevo.getText());
                ps.setString(2, nombrexd.getText());
                int resultado = ps.executeUpdate();
                if (resultado > 0) {
                    nombrexd.setText(cajaNombreNuevo.getText());
                    System.out.println("actualizado ez");
                    cajaNombreNuevo.setText("");
                    aver();
                }
            } catch (SQLException ex) {
                Logger.getLogger(EcargarAU.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("nombre wardado: " + cajaNombreNuevo.getText());
            cajaNombreNuevo.setEnabled(false);
        }
        if (jComboBox1.isEnabled()) {
            try {
                ps = conexion.prepareStatement("UPDATE persona SET user_permiso = ? WHERE user_nombre = ?");
                ps.setString(1, jComboBox1.getSelectedItem().toString());
                ps.setString(2, nombrexd.getText());
                int resultado = ps.executeUpdate();
                if (resultado > 0) {
                    System.out.println("permiso wardado: " + jComboBox1.getSelectedItem().toString());
                    jComboBox1.setEnabled(false);
                    aver();
                }
            } catch (SQLException ex) {
                Logger.getLogger(EcargarAU.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        if (cajaClaveNueva.isEnabled()) {
            try {
                ps = conexion.prepareStatement("UPDATE persona SET user_clave = ? WHERE user_nombre = ?");
                if (cajaClaveActual.getText().equals(cajaClaveNueva.getText())) {
                    ps.setString(1, cajaClaveActual.getText());
                }
                ps.setString(2, nombrexd.getText());
                int resultado = ps.executeUpdate();
                if (resultado > 0) {
                    System.out.println("clave wardada");
                    cajaClaveNueva.setText("");
                    cajaClaveActual.setText("");
                    cajaClaveNueva.setEnabled(false);
                    cajaClaveActual.setEnabled(false);
                    aver();
                }
            } catch (SQLException ex) {
                Logger.getLogger(EcargarAU.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
         */

    }//GEN-LAST:event_btnWardarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        cajaNombreNuevo.setEnabled(true);
        jComboBox1.setEnabled(true);
        cajaClaveNueva.setEnabled(true);
        btnWardar1.setEnabled(true);
        btnWardar.setEnabled(false);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnWardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWardar1ActionPerformed
        Usuario usuario = new Usuario();
        ArrayList<Usuario> lista = cargarUsuarios();

        try {
            usuario.setNombre(cajaNombreNuevo.getText());
            usuario.setClave(cajaClaveNueva.getText());
            usuario.setPermisos(jComboBox1.getSelectedItem().toString());
            cajaNombreNuevo.setText("");
            cajaClaveNueva.setText("");
            jComboBox1.setSelectedIndex(0);
            lista.add(usuario);

            agregarUsuario(lista);

        } catch (Exception ex) {
            Logger.getLogger(EcargarAU.class.getName()).log(Level.SEVERE, null, ex);
        }
        cajaNombreNuevo.setEnabled(false);
        jComboBox1.setEnabled(false);
        cajaClaveNueva.setEnabled(false);
        btnWardar1.setEnabled(false);

    }//GEN-LAST:event_btnWardar1ActionPerformed

    private void btnEliminaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminaActionPerformed
        /*
        try {
            
            Connection conexion = getConnection();

            ps = conexion.prepareStatement("delete from persona where user_nombre = ?");
            ps.setString(1, nombrexd.getText());
            int resultado = ps.executeUpdate();
            if (resultado > 0) { //Ejecucion correcta
                System.out.println("eliminado ez");
                nombrexd.setText("");
                permisoxd.setText("");
                aver();
            }
        } catch (SQLException ex) {
            Logger.getLogger(EcargarAU.class.getName()).log(Level.SEVERE, null, ex);
        }
         */
    }//GEN-LAST:event_btnEliminaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EcargarAU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new EcargarAU().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(EcargarAU.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAgregar;
    public javax.swing.JButton btnCambiarContraseña;
    public javax.swing.JButton btnCambiarNombre;
    public javax.swing.JButton btnCambiarTipoCuenta;
    public javax.swing.JButton btnCambiarUsuario;
    public javax.swing.JButton btnElimina;
    public javax.swing.JButton btnWardar;
    public javax.swing.JButton btnWardar1;
    private javax.swing.JTextField cajaClaveActual;
    private javax.swing.JTextField cajaClaveNueva;
    private javax.swing.JTextField cajaNombreNuevo;
    public javax.swing.JComboBox<String> comboUsuarios;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel nombrexd;
    private javax.swing.JLabel permisoxd;
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

    public void aver() throws Exception {
        comboUsuarios.removeAllItems();
        comboUsuarios.addItem("Seleccione Usuario");
        //Connection conexion = getConnection();
        //ps = conexion.prepareStatement("select user_nombre from persona");
        //rs = ps.executeQuery();

        // while (rs.next()) {
        //     comboUsuarios.addItem(rs.getString("user_nombre"));
        // }
    }

}
