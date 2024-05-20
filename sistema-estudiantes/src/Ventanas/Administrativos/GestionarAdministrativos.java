package Ventanas.Administrativos;

import Modelo.Clases.Usuario;
import static Persistencia.Datos.agregarUsuario;
import static Persistencia.Datos.cargarUsuarios;
import static Persistencia.Datos.reiniciarEstudiantes;
import static Persistencia.Datos.reiniciarMatriculas;
import static Persistencia.Datos.reiniciarUsuarios;
import Ventanas.Ingreso.Login;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gonzalo
 */
public class GestionarAdministrativos extends javax.swing.JFrame {

    private String dni = "";
    private String nombre = "";
    private String apellido = "";
    private String nacimiento = "";
    private String celular = "";
    private String genero = "";
    private String modo = "";
    private String user = "";
    private String password = "";

    public GestionarAdministrativos() {
        initComponents();
        EstablecerIcono();
        eventoTabla();
        mostrarDatos();
        cbxGenero.setSelectedItem(null);   // poner en blanco el jcomboBox al principio
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgBarra = new javax.swing.JPanel();
        bgOpciones = new javax.swing.JPanel();
        bgRegresar = new javax.swing.JPanel();
        btnRegresar = new javax.swing.JLabel();
        btnSalir = new javax.swing.JPanel();
        salirLabel = new javax.swing.JLabel();
        bgLineaRegresar = new javax.swing.JPanel();
        bgEscritorio = new javax.swing.JPanel();
        bgFondo = new javax.swing.JPanel();
        bgTop = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        lbDNI = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        lbNombres = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        lbApellidos = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        lbRol = new javax.swing.JLabel();
        lbCelular = new javax.swing.JLabel();
        txtRol = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lbUsername = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        lbPassword = new javax.swing.JLabel();
        cbxGenero = new javax.swing.JComboBox<>();
        lbGenero = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        btnReiniciar = new javax.swing.JPanel();
        lbIcon = new javax.swing.JLabel();
        lbReiniciar = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(32767, 32767));
        setPreferredSize(new java.awt.Dimension(1035, 609));
        setSize(new java.awt.Dimension(1000, 600));

        bgBarra.setBackground(new java.awt.Color(255, 255, 255));
        bgBarra.setPreferredSize(new java.awt.Dimension(50, 600));
        bgBarra.setLayout(new java.awt.BorderLayout());

        bgOpciones.setBackground(new java.awt.Color(18, 31, 35));
        bgOpciones.setAutoscrolls(true);
        bgOpciones.setPreferredSize(new java.awt.Dimension(50, 600));

        bgRegresar.setBackground(new java.awt.Color(18, 31, 35));
        bgRegresar.setPreferredSize(new java.awt.Dimension(50, 50));
        bgRegresar.setLayout(new java.awt.BorderLayout());

        btnRegresar.setBackground(new java.awt.Color(18, 31, 35));
        btnRegresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/back_32px.png"))); // NOI18N
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegresarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegresarMouseExited(evt);
            }
        });
        bgRegresar.add(btnRegresar, java.awt.BorderLayout.CENTER);

        btnSalir.setBackground(new java.awt.Color(18, 31, 35));
        btnSalir.setPreferredSize(new java.awt.Dimension(50, 50));
        btnSalir.setLayout(new java.awt.BorderLayout());

        salirLabel.setBackground(new java.awt.Color(18, 31, 35));
        salirLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        salirLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/salir.png"))); // NOI18N
        salirLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salirLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirLabelMouseClicked(evt);
            }
        });
        btnSalir.add(salirLabel, java.awt.BorderLayout.CENTER);

        bgLineaRegresar.setBackground(new java.awt.Color(18, 31, 35));
        bgLineaRegresar.setPreferredSize(new java.awt.Dimension(50, 7));

        javax.swing.GroupLayout bgLineaRegresarLayout = new javax.swing.GroupLayout(bgLineaRegresar);
        bgLineaRegresar.setLayout(bgLineaRegresarLayout);
        bgLineaRegresarLayout.setHorizontalGroup(
            bgLineaRegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        bgLineaRegresarLayout.setVerticalGroup(
            bgLineaRegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout bgOpcionesLayout = new javax.swing.GroupLayout(bgOpciones);
        bgOpciones.setLayout(bgOpcionesLayout);
        bgOpcionesLayout.setHorizontalGroup(
            bgOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgOpcionesLayout.createSequentialGroup()
                .addGroup(bgOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bgOpcionesLayout.createSequentialGroup()
                        .addComponent(bgLineaRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(bgRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, Short.MAX_VALUE))
        );
        bgOpcionesLayout.setVerticalGroup(
            bgOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgOpcionesLayout.createSequentialGroup()
                .addGroup(bgOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bgRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bgLineaRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 509, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bgBarra.add(bgOpciones, java.awt.BorderLayout.LINE_START);

        getContentPane().add(bgBarra, java.awt.BorderLayout.LINE_START);

        bgEscritorio.setLayout(new java.awt.BorderLayout());

        bgFondo.setBackground(new java.awt.Color(236, 239, 244));
        bgFondo.setPreferredSize(new java.awt.Dimension(1065, 609));

        bgTop.setBackground(new java.awt.Color(204, 204, 204));
        bgTop.setAutoscrolls(true);
        bgTop.setPreferredSize(new java.awt.Dimension(808, 55));

        lbTitulo.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(0, 26, 51));
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("CONFIGURACIONES ADMINISTRATIVAS");
        lbTitulo.setAutoscrolls(true);

        javax.swing.GroupLayout bgTopLayout = new javax.swing.GroupLayout(bgTop);
        bgTop.setLayout(bgTopLayout);
        bgTopLayout.setHorizontalGroup(
            bgTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgTopLayout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(184, 184, 184))
        );
        bgTopLayout.setVerticalGroup(
            bgTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        lbDNI.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lbDNI.setForeground(new java.awt.Color(102, 102, 102));
        lbDNI.setText("DNI");

        txtDNI.setBackground(new java.awt.Color(255, 255, 255));
        txtDNI.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtDNI.setForeground(new java.awt.Color(0, 26, 51));

        txtNombres.setBackground(new java.awt.Color(255, 255, 255));
        txtNombres.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtNombres.setForeground(new java.awt.Color(0, 26, 51));

        lbNombres.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lbNombres.setForeground(new java.awt.Color(102, 102, 102));
        lbNombres.setText("Nombres");

        txtApellidos.setBackground(new java.awt.Color(255, 255, 255));
        txtApellidos.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtApellidos.setForeground(new java.awt.Color(0, 26, 51));

        lbApellidos.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lbApellidos.setForeground(new java.awt.Color(102, 102, 102));
        lbApellidos.setText("Apellidos");

        txtCelular.setBackground(new java.awt.Color(255, 255, 255));
        txtCelular.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtCelular.setForeground(new java.awt.Color(0, 26, 51));
        txtCelular.setText("+51 ");

        lbRol.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lbRol.setForeground(new java.awt.Color(102, 102, 102));
        lbRol.setText("Rol");

        lbCelular.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lbCelular.setForeground(new java.awt.Color(102, 102, 102));
        lbCelular.setText("Celular");

        txtRol.setEditable(false);
        txtRol.setBackground(new java.awt.Color(255, 255, 255));
        txtRol.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtRol.setForeground(new java.awt.Color(0, 26, 51));
        txtRol.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRol.setText("-");

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/lupa.png"))); // NOI18N
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });

        txtUsername.setBackground(new java.awt.Color(222, 222, 222));
        txtUsername.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(0, 0, 0));

        lbUsername.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lbUsername.setForeground(new java.awt.Color(102, 102, 102));
        lbUsername.setText("Usuario");

        txtPassword.setBackground(new java.awt.Color(222, 222, 222));
        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(0, 0, 0));

        lbPassword.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lbPassword.setForeground(new java.awt.Color(102, 102, 102));
        lbPassword.setText("Contraseña");

        cbxGenero.setBackground(new java.awt.Color(255, 255, 255));
        cbxGenero.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        cbxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));

        lbGenero.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lbGenero.setForeground(new java.awt.Color(102, 102, 102));
        lbGenero.setText("Genero");

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "DNI", "Nombres", "Apellidos", "Rol", "Usuario", "Contraseña"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable.setRowHeight(22);
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);

        btnReiniciar.setBackground(new java.awt.Color(255, 72, 27));
        btnReiniciar.setForeground(new java.awt.Color(0, 153, 153));
        btnReiniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReiniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReiniciarMouseClicked(evt);
            }
        });

        lbIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/settings_32px.png"))); // NOI18N

        lbReiniciar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbReiniciar.setForeground(new java.awt.Color(255, 255, 255));
        lbReiniciar.setText("Reiniciar");

        javax.swing.GroupLayout btnReiniciarLayout = new javax.swing.GroupLayout(btnReiniciar);
        btnReiniciar.setLayout(btnReiniciarLayout);
        btnReiniciarLayout.setHorizontalGroup(
            btnReiniciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnReiniciarLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lbReiniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        btnReiniciarLayout.setVerticalGroup(
            btnReiniciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbReiniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbIcon)
        );

        btnAgregar.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMouseClicked(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });

        btnActualizar.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizarMouseClicked(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bgFondoLayout = new javax.swing.GroupLayout(bgFondo);
        bgFondo.setLayout(bgFondoLayout);
        bgFondoLayout.setHorizontalGroup(
            bgFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgTop, javax.swing.GroupLayout.DEFAULT_SIZE, 1069, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgFondoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(bgFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgFondoLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(145, 145, 145))
                    .addGroup(bgFondoLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                        .addGap(94, 94, 94)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                        .addGap(119, 119, 119)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                        .addGap(231, 231, 231))))
            .addGroup(bgFondoLayout.createSequentialGroup()
                .addGroup(bgFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgFondoLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(bgFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbCelular, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbApellidos)
                                .addComponent(lbNombres))
                            .addComponent(lbGenero, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(44, 44, 44)
                        .addGroup(bgFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtCelular, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxGenero, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtApellidos)
                            .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(79, 79, 79)
                        .addGroup(bgFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgFondoLayout.createSequentialGroup()
                                .addGroup(bgFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(bgFondoLayout.createSequentialGroup()
                                        .addGroup(bgFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(bgFondoLayout.createSequentialGroup()
                                                .addGap(74, 74, 74)
                                                .addComponent(lbDNI))
                                            .addGroup(bgFondoLayout.createSequentialGroup()
                                                .addGap(80, 80, 80)
                                                .addComponent(lbRol)))
                                        .addGap(53, 53, 53)
                                        .addGroup(bgFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtRol, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgFondoLayout.createSequentialGroup()
                                        .addGap(85, 85, 85)
                                        .addGroup(bgFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtUsername, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscar))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgFondoLayout.createSequentialGroup()
                                .addGroup(bgFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbPassword)
                                    .addComponent(lbUsername))
                                .addGap(328, 328, 328))))
                    .addGroup(bgFondoLayout.createSequentialGroup()
                        .addGap(447, 447, 447)
                        .addComponent(btnReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bgFondoLayout.setVerticalGroup(
            bgFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgFondoLayout.createSequentialGroup()
                .addComponent(bgTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(bgFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgFondoLayout.createSequentialGroup()
                        .addGroup(bgFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbDNI)
                                .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(bgFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbRol)
                            .addComponent(txtRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(bgFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbUsername)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bgFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbPassword)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgFondoLayout.createSequentialGroup()
                        .addGroup(bgFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbNombres)
                            .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(bgFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbApellidos))
                        .addGap(24, 24, 24)
                        .addGroup(bgFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbCelular))
                        .addGap(18, 18, 18)
                        .addGroup(bgFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbGenero))))
                .addGap(34, 34, 34)
                .addGroup(bgFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        bgEscritorio.add(bgFondo, java.awt.BorderLayout.CENTER);

        getContentPane().add(bgEscritorio, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EstablecerIcono() {

        try {
            ImageIcon ic = new ImageIcon(getClass().getResource("/Imagenes/Iconos/universidad.png"));
            this.setIconImage(ic.getImage());
        } catch (Exception e) {
        }

    }

    private void eventoTabla() {
        jTable.addMouseListener(new MouseAdapter() {
            
            // creamos un modelo de tabla
            DefaultTableModel model = new DefaultTableModel();

            public void mouseClicked(MouseEvent e) {

                int i = jTable.getSelectedRow();
                dni = (jTable.getValueAt(i, 0).toString());
                nombre = (jTable.getValueAt(i, 1).toString());
                apellido = (jTable.getValueAt(i, 2).toString());
                modo = (jTable.getValueAt(i, 3).toString());
                user = (jTable.getValueAt(i, 4).toString());
                password = (jTable.getValueAt(i, 5).toString());

            }
        });
    }
    
    /*  Método para limpiar los campos */
    private void borrar() {

        txtDNI.setText("");
        txtDNI.setEditable(true);
        txtNombres.setText("");
        txtApellidos.setText("");
        txtUsername.setText("");
        txtPassword.setText("");
        txtCelular.setText("+51 ");
        cbxGenero.setSelectedItem(null);

    }
    
    /*  Método para validar campos y restricciones */
    public boolean validar() {

        if (txtUsername.getText().equals("") || txtPassword.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Rellene todos los campos", "Error", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        ArrayList<Usuario> usuario = cargarUsuarios();

        for (Usuario buscar : usuario) {

            if (buscar.getDni().equals(txtDNI.getText())) {
                JOptionPane.showMessageDialog(null, "Usuario ya registrado", "Error", JOptionPane.WARNING_MESSAGE);
                return false;
            }
        }

        return true;

    }
    
    /*  Método para mostrar los datos almacenados */
    public void mostrarDatos() {

        ArrayList<Usuario> usuarios = cargarUsuarios();
        if (usuarios != null) {
            String matriz[][] = new String[usuarios.size()][6];

            for (int i = 0; i < usuarios.size(); i++) {

                matriz[i][0] = usuarios.get(i).getDni();
                matriz[i][1] = usuarios.get(i).getNombre();
                matriz[i][2] = usuarios.get(i).getApellido();
                matriz[i][3] = usuarios.get(i).getModo();
                matriz[i][4] = usuarios.get(i).getUsername();
                matriz[i][5] = usuarios.get(i).getPassword();

            }

            jTable.setModel(new javax.swing.table.DefaultTableModel(matriz, new String[]{"DNI", "Nombres", "Apellidos", "Rol", "Usuario", "Contraseña"}));
        }
    }

    /* Métodos Auxiliares del Sidebar */
    private void btnRegresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseEntered
        bgLineaRegresar.setBackground(new Color(247, 78, 105));
    }//GEN-LAST:event_btnRegresarMouseEntered

    private void btnRegresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseExited
        bgLineaRegresar.setBackground(new Color(18, 31, 35));
    }//GEN-LAST:event_btnRegresarMouseExited

    private void btnRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseClicked

        PanelAdministrativo administrativo = new PanelAdministrativo();
        administrativo.setVisible(true);
        dispose();

    }//GEN-LAST:event_btnRegresarMouseClicked

    private void salirLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirLabelMouseClicked
        Login clinica = new Login();
        clinica.setVisible(true);
        JOptionPane.showMessageDialog(null, "Sesion cerrada");
        dispose();
    }//GEN-LAST:event_salirLabelMouseClicked

    /* Método para reinciar el sistema */
    private void btnReiniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReiniciarMouseClicked

        if (JOptionPane.showConfirmDialog(null, "Desea continuar?", "IMPORTANTE", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            reiniciarUsuarios();
            reiniciarEstudiantes();
            reiniciarMatriculas();
            JOptionPane.showMessageDialog(null, "Sistema reiniciado", "Reinicio Completado", JOptionPane.INFORMATION_MESSAGE);
            borrar();
        }
    }//GEN-LAST:event_btnReiniciarMouseClicked
    
    /* Método para agregar un usuario */
    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked

        if (validar()) {

            ArrayList<Usuario> usuario = cargarUsuarios();
            usuario.add(new Usuario(txtUsername.getText(), txtPassword.getText(), "Administrador", txtDNI.getText(), txtNombres.getText(), txtApellidos.getText(), " ", txtCelular.getText(), getCbxGenero()));
            agregarUsuario(usuario);
            JOptionPane.showMessageDialog(null, "Usuario agregado");

        }

        borrar();
        mostrarDatos();
    }//GEN-LAST:event_btnAgregarMouseClicked
    
    /* Método para seleccionar un estudiante para consultarlo desde el campo de busqueda */
    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked

        ArrayList<Usuario> usuario = cargarUsuarios();
        boolean flag = false;

        for (Usuario buscar : usuario) {

            if (buscar.getDni().equals(txtDNI.getText())) {

                txtDNI.setText(buscar.getDni());
                txtDNI.setEditable(false);
                txtUsername.setText(buscar.getUsername());
                txtPassword.setText(buscar.getPassword());
                txtRol.setText(buscar.getModo());
                txtNombres.setText(buscar.getNombre());
                txtApellidos.setText(buscar.getApellido());
                txtCelular.setText(buscar.getCelular());
                cbxGenero.setSelectedItem(buscar.getGenero());

                flag = true;

            }
        }

        if (!flag) {
            JOptionPane.showMessageDialog(null, "Usuario no encontrado", "Error", JOptionPane.WARNING_MESSAGE);
            borrar();
        }

    }//GEN-LAST:event_btnBuscarMouseClicked
    
    /* Método para seleccionar un usuario para eliminarlo */
    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked

        ArrayList<Usuario> usuario = cargarUsuarios();

        for (int i = 0; i < usuario.size(); i++) {
            if (txtDNI.getText().equals(usuario.get(i).getDni())) {

                if (JOptionPane.showConfirmDialog(null, "Desea eliminar a " + usuario.get(i).getNombre() + " " + usuario.get(i).getApellido() + " ?", "IMPORTANTE", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    usuario.remove(i);
                    agregarUsuario(usuario);
                    JOptionPane.showMessageDialog(null, "Usuario eliminado");
                }
            }
        }

        borrar();
        mostrarDatos();
    }//GEN-LAST:event_btnEliminarMouseClicked
    
    /* Método para seleccionar un usuario para editarlo */
    private void btnActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseClicked
        ArrayList<Usuario> lista = cargarUsuarios();

        for (int i = 0; i < lista.size(); i++) {
            if (txtDNI.getText().equals(lista.get(i).getDni())) {
                lista.get(i).setNombre(txtNombres.getText());
                lista.get(i).setApellido(txtApellidos.getText());
                lista.get(i).setCelular(txtCelular.getText());
                lista.get(i).setUsername(txtUsername.getText());
                lista.get(i).setPassword(txtPassword.getText());
            }
        }

        agregarUsuario(lista);
        borrar();
        mostrarDatos();
    }//GEN-LAST:event_btnActualizarMouseClicked

    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
        borrar();
    }//GEN-LAST:event_btnLimpiarMouseClicked

    /* Método para seleccionar un usuario para consultarlo desde la tabla*/
    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        int seleccion = jTable.getSelectedRow();

        ArrayList<Usuario> usuario = cargarUsuarios();

        for (Usuario buscar : usuario) {

            if (buscar.getDni().equals(jTable.getValueAt(seleccion, 0).toString())) {

                txtDNI.setText(buscar.getDni());
                txtDNI.setEditable(false);
                txtUsername.setText(buscar.getUsername());
                txtPassword.setText(buscar.getPassword());
                txtRol.setText(buscar.getModo());
                txtNombres.setText(buscar.getNombre());
                txtApellidos.setText(buscar.getApellido());
                txtCelular.setText(buscar.getCelular());
                cbxGenero.setSelectedItem(buscar.getGenero());

            }
        }
    }//GEN-LAST:event_jTableMouseClicked
    
    /* Métodos Auxiliares */
    public String getCbxGenero() {
        return cbxGenero.getSelectedItem() != null ? cbxGenero.getSelectedItem().toString() : "";
    }
    
    /* Inicio del punto de vista técnico y de soporte */
    public static void main(String[] args) {
        /* Constructor de carga de la ventana */
        GestionarAdministrativos administrativo = new GestionarAdministrativos();
        administrativo.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgBarra;
    private javax.swing.JPanel bgEscritorio;
    private javax.swing.JPanel bgFondo;
    public javax.swing.JPanel bgLineaRegresar;
    private javax.swing.JPanel bgOpciones;
    private javax.swing.JPanel bgRegresar;
    private javax.swing.JPanel bgTop;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JLabel btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel btnRegresar;
    private javax.swing.JPanel btnReiniciar;
    private javax.swing.JPanel btnSalir;
    private javax.swing.JComboBox<String> cbxGenero;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable;
    private javax.swing.JLabel lbApellidos;
    private javax.swing.JLabel lbCelular;
    private javax.swing.JLabel lbDNI;
    private javax.swing.JLabel lbGenero;
    private javax.swing.JLabel lbIcon;
    private javax.swing.JLabel lbNombres;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JLabel lbReiniciar;
    private javax.swing.JLabel lbRol;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbUsername;
    private javax.swing.JLabel salirLabel;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtRol;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
