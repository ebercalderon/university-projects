package Ventanas.Administrativos;

import Modelo.Clases.Curso;
import Modelo.Clases.Estudiante;
import Modelo.Clases.Matricula;
import static Persistencia.Datos.agregarEstudiante;
import static Persistencia.Datos.agregarMatricula;
import static Persistencia.Datos.cargarEstudiantes;
import static Persistencia.Datos.cargarMatriculas;
import Ventanas.Ingreso.Login;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gonzalo
 */
public class PanelAdministrativo extends javax.swing.JFrame {

    private String dni = "";
    private String IDmatriculado = "";
    private String nombre = "";
    private String apellido = "";
    private String nacimiento = "";
    private String celular = "";
    private String genero = "";
    private String centro = "";
    private String facultad = "";
    private String correo = "";
    private String ingreso = "";
    private String situacion = "";
    private float promedio = 0;

    private String IDmatricula = "";
    private String IDestudiante = "";
    private String semestre = "";
    private String salon = "";
    private String nroCursos = "";
    private String IDcalificacion = "";

    private boolean sidebar;

    public PanelAdministrativo() {
        initComponents();
        EstablecerIcono();
        eventoTablaEstudiantes();
        mostrarDatos();
        mostrarDatosMatricula();
        mostrarDatosCalificaciones();
        IniciarCombobox();

        this.sidebar = false;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgMenu = new javax.swing.JPanel();
        bgMenuIconos = new javax.swing.JPanel();
        bgSidebar = new javax.swing.JPanel();
        btnSidebar = new javax.swing.JLabel();
        bgSalir = new javax.swing.JPanel();
        btnSalir = new javax.swing.JLabel();
        bgLineaSide = new javax.swing.JPanel();
        bgLineaConfig = new javax.swing.JPanel();
        bgConfiguracion = new javax.swing.JPanel();
        btnConfiguracion = new javax.swing.JLabel();
        bgMenuOculto = new javax.swing.JPanel();
        estudianteLabel = new javax.swing.JLabel();
        matriculaLabel = new javax.swing.JLabel();
        calificacionesLabel = new javax.swing.JLabel();
        bgEscritorio = new javax.swing.JPanel();
        estudiantePanel = new javax.swing.JPanel();
        bgFondo = new javax.swing.JPanel();
        bgDatos = new javax.swing.JPanel();
        lbDNI = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        lbNombres = new javax.swing.JLabel();
        lbNacimiento = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jCalendar = new com.toedter.calendar.JDateChooser();
        lbApellidos = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        lbCentro = new javax.swing.JLabel();
        lbCelular = new javax.swing.JLabel();
        txtCentro = new javax.swing.JTextField();
        cbxGenero = new javax.swing.JComboBox<>();
        lbGenero = new javax.swing.JLabel();
        lbCorreo = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        bgTop1 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        lbFacultad = new javax.swing.JLabel();
        cbxFacultad = new javax.swing.JComboBox<>();
        lbIngreso = new javax.swing.JLabel();
        txtIngreso = new javax.swing.JTextField();
        lbSituacion = new javax.swing.JLabel();
        txtSituacion = new javax.swing.JTextField();
        lbPromedio = new javax.swing.JLabel();
        txtPromedio = new javax.swing.JTextField();
        bgTop = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        bgRegistrados = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        bgDatos1 = new javax.swing.JPanel();
        cbxConsultar = new javax.swing.JComboBox<>();
        lbConsultar = new javax.swing.JLabel();
        txtConsulta = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        matriculaPanel = new javax.swing.JPanel();
        bgFondo1 = new javax.swing.JPanel();
        bgDatos2 = new javax.swing.JPanel();
        txtNombresMatricula = new javax.swing.JTextField();
        lbNombres1 = new javax.swing.JLabel();
        txtApellidosMatricula = new javax.swing.JTextField();
        lbApellidos1 = new javax.swing.JLabel();
        lbFacultadMatricula = new javax.swing.JLabel();
        txtFacultadMatricula = new javax.swing.JTextField();
        cbxSemestre = new javax.swing.JComboBox<>();
        lbSemestre = new javax.swing.JLabel();
        bgTop2 = new javax.swing.JPanel();
        btnAgregarMatricula = new javax.swing.JButton();
        btnEliminarMatricula = new javax.swing.JButton();
        btnMatricula = new javax.swing.JButton();
        lbSituacionMatricula = new javax.swing.JLabel();
        txtSituacionMatricula = new javax.swing.JTextField();
        lbSalon = new javax.swing.JLabel();
        txtSalon = new javax.swing.JTextField();
        lbNcursos = new javax.swing.JLabel();
        txtNCursos = new javax.swing.JTextField();
        lbCursos = new javax.swing.JLabel();
        txtIDMatricula = new javax.swing.JTextField();
        lbIDMatricula = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        Modelo = new DefaultListModel();
        jListCursos = new javax.swing.JList<>();
        jSeparator1 = new javax.swing.JSeparator();
        cbxCursos = new javax.swing.JComboBox<>();
        bgTop3 = new javax.swing.JPanel();
        lbTitulo1 = new javax.swing.JLabel();
        bgRegistrados1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableMatricula = new javax.swing.JTable();
        bgDatos3 = new javax.swing.JPanel();
        lbBuscarEstudiante = new javax.swing.JLabel();
        txtBuscarEstudiante = new javax.swing.JTextField();
        btnBuscarEstudiante = new javax.swing.JButton();
        bgDatos6 = new javax.swing.JPanel();
        lbMatricula = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        btnConsultarMatricula = new javax.swing.JButton();
        calificacionesPanel = new javax.swing.JPanel();
        bgFondo3 = new javax.swing.JPanel();
        bgDatos7 = new javax.swing.JPanel();
        txtNombresCalificaciones = new javax.swing.JTextField();
        lbNombres3 = new javax.swing.JLabel();
        txtApellidosCalificaciones = new javax.swing.JTextField();
        lbApellidos3 = new javax.swing.JLabel();
        lbFacultadCalificaciones = new javax.swing.JLabel();
        txtFacultadCalificaciones = new javax.swing.JTextField();
        bgTop6 = new javax.swing.JPanel();
        btnAgregarCalificaciones = new javax.swing.JButton();
        btnLimpiarCalificaciones = new javax.swing.JButton();
        lbSemestreCalificaciones = new javax.swing.JLabel();
        txtSemestreCalificaciones = new javax.swing.JTextField();
        lbCursosCalificaciones = new javax.swing.JLabel();
        lbPromedioCalificaciones = new javax.swing.JLabel();
        txtpromedioCalificaciones = new javax.swing.JTextField();
        txtCursosCalificaciones = new javax.swing.JTextField();
        bgRegistrados4 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTableNotas = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        bgTop7 = new javax.swing.JPanel();
        lbTitulo3 = new javax.swing.JLabel();
        bgRegistrados3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableCalificaciones = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1000, 600));

        bgMenu.setBackground(new java.awt.Color(255, 255, 255));
        bgMenu.setPreferredSize(new java.awt.Dimension(50, 600));
        bgMenu.setLayout(new java.awt.BorderLayout());

        bgMenuIconos.setBackground(new java.awt.Color(18, 31, 35));
        bgMenuIconos.setAutoscrolls(true);
        bgMenuIconos.setPreferredSize(new java.awt.Dimension(50, 600));

        bgSidebar.setBackground(new java.awt.Color(18, 31, 35));
        bgSidebar.setPreferredSize(new java.awt.Dimension(50, 50));
        bgSidebar.setLayout(new java.awt.BorderLayout());

        btnSidebar.setBackground(new java.awt.Color(18, 31, 35));
        btnSidebar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSidebar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/menu_32px.png"))); // NOI18N
        btnSidebar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSidebar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSidebarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSidebarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSidebarMouseExited(evt);
            }
        });
        bgSidebar.add(btnSidebar, java.awt.BorderLayout.CENTER);

        bgSalir.setBackground(new java.awt.Color(18, 31, 35));
        bgSalir.setPreferredSize(new java.awt.Dimension(50, 50));
        bgSalir.setLayout(new java.awt.BorderLayout());

        btnSalir.setBackground(new java.awt.Color(18, 31, 35));
        btnSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/salir.png"))); // NOI18N
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });
        bgSalir.add(btnSalir, java.awt.BorderLayout.CENTER);

        bgLineaSide.setBackground(new java.awt.Color(18, 31, 35));
        bgLineaSide.setPreferredSize(new java.awt.Dimension(50, 7));

        javax.swing.GroupLayout bgLineaSideLayout = new javax.swing.GroupLayout(bgLineaSide);
        bgLineaSide.setLayout(bgLineaSideLayout);
        bgLineaSideLayout.setHorizontalGroup(
            bgLineaSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        bgLineaSideLayout.setVerticalGroup(
            bgLineaSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        bgLineaConfig.setBackground(new java.awt.Color(18, 31, 35));
        bgLineaConfig.setPreferredSize(new java.awt.Dimension(50, 5));

        javax.swing.GroupLayout bgLineaConfigLayout = new javax.swing.GroupLayout(bgLineaConfig);
        bgLineaConfig.setLayout(bgLineaConfigLayout);
        bgLineaConfigLayout.setHorizontalGroup(
            bgLineaConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        bgLineaConfigLayout.setVerticalGroup(
            bgLineaConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        bgConfiguracion.setBackground(new java.awt.Color(18, 31, 35));
        bgConfiguracion.setPreferredSize(new java.awt.Dimension(50, 50));
        bgConfiguracion.setLayout(new java.awt.BorderLayout());

        btnConfiguracion.setBackground(new java.awt.Color(18, 31, 35));
        btnConfiguracion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/settings_32px.png"))); // NOI18N
        btnConfiguracion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnConfiguracion.setMaximumSize(new java.awt.Dimension(30, 30));
        btnConfiguracion.setMinimumSize(new java.awt.Dimension(30, 30));
        btnConfiguracion.setPreferredSize(new java.awt.Dimension(30, 30));
        btnConfiguracion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConfiguracionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConfiguracionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConfiguracionMouseExited(evt);
            }
        });
        bgConfiguracion.add(btnConfiguracion, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout bgMenuIconosLayout = new javax.swing.GroupLayout(bgMenuIconos);
        bgMenuIconos.setLayout(bgMenuIconosLayout);
        bgMenuIconosLayout.setHorizontalGroup(
            bgMenuIconosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgMenuIconosLayout.createSequentialGroup()
                .addGroup(bgMenuIconosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bgSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bgMenuIconosLayout.createSequentialGroup()
                        .addComponent(bgLineaSide, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(bgSidebar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgMenuIconosLayout.createSequentialGroup()
                        .addComponent(bgLineaConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bgConfiguracion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bgMenuIconosLayout.setVerticalGroup(
            bgMenuIconosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgMenuIconosLayout.createSequentialGroup()
                .addGroup(bgMenuIconosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bgSidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bgLineaSide, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgMenuIconosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bgLineaConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bgConfiguracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 554, Short.MAX_VALUE)
                .addComponent(bgSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bgMenu.add(bgMenuIconos, java.awt.BorderLayout.LINE_START);

        bgMenuOculto.setBackground(new java.awt.Color(34, 45, 49));

        estudianteLabel.setBackground(new java.awt.Color(34, 45, 49));
        estudianteLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        estudianteLabel.setForeground(new java.awt.Color(255, 255, 255));
        estudianteLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        estudianteLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/estudiantes.png"))); // NOI18N
        estudianteLabel.setText(" Estudiantes");
        estudianteLabel.setOpaque(true);
        estudianteLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                estudianteLabelMouseClicked(evt);
            }
        });

        matriculaLabel.setBackground(new java.awt.Color(34, 45, 49));
        matriculaLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        matriculaLabel.setForeground(new java.awt.Color(255, 255, 255));
        matriculaLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        matriculaLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/matricula.png"))); // NOI18N
        matriculaLabel.setText(" Matrícula");
        matriculaLabel.setOpaque(true);
        matriculaLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                matriculaLabelMouseClicked(evt);
            }
        });

        calificacionesLabel.setBackground(new java.awt.Color(34, 45, 49));
        calificacionesLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        calificacionesLabel.setForeground(new java.awt.Color(255, 255, 255));
        calificacionesLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        calificacionesLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/promedio.png"))); // NOI18N
        calificacionesLabel.setText("Calificaciones");
        calificacionesLabel.setOpaque(true);
        calificacionesLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calificacionesLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bgMenuOcultoLayout = new javax.swing.GroupLayout(bgMenuOculto);
        bgMenuOculto.setLayout(bgMenuOcultoLayout);
        bgMenuOcultoLayout.setHorizontalGroup(
            bgMenuOcultoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgMenuOcultoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bgMenuOcultoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(calificacionesLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(matriculaLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(estudianteLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bgMenuOcultoLayout.setVerticalGroup(
            bgMenuOcultoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgMenuOcultoLayout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(estudianteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(matriculaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(calificacionesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(397, Short.MAX_VALUE))
        );

        bgMenu.add(bgMenuOculto, java.awt.BorderLayout.CENTER);

        getContentPane().add(bgMenu, java.awt.BorderLayout.LINE_START);

        bgEscritorio.setLayout(new java.awt.CardLayout());

        estudiantePanel.setLayout(new java.awt.BorderLayout());

        bgFondo.setBackground(new java.awt.Color(236, 239, 244));
        bgFondo.setPreferredSize(new java.awt.Dimension(1035, 609));

        bgDatos.setBackground(new java.awt.Color(236, 239, 244));
        bgDatos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estudiante"));
        bgDatos.setAutoscrolls(true);
        bgDatos.setPreferredSize(new java.awt.Dimension(808, 55));

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

        lbNacimiento.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lbNacimiento.setForeground(new java.awt.Color(102, 102, 102));
        lbNacimiento.setText("Nacimiento");

        txtApellidos.setBackground(new java.awt.Color(255, 255, 255));
        txtApellidos.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtApellidos.setForeground(new java.awt.Color(0, 26, 51));

        jCalendar.setToolTipText("");
        jCalendar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lbApellidos.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lbApellidos.setForeground(new java.awt.Color(102, 102, 102));
        lbApellidos.setText("Apellidos");

        txtCelular.setBackground(new java.awt.Color(255, 255, 255));
        txtCelular.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtCelular.setForeground(new java.awt.Color(0, 26, 51));
        txtCelular.setText("+51 ");

        lbCentro.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lbCentro.setForeground(new java.awt.Color(102, 102, 102));
        lbCentro.setText("Centro");

        lbCelular.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lbCelular.setForeground(new java.awt.Color(102, 102, 102));
        lbCelular.setText("Celular");

        txtCentro.setBackground(new java.awt.Color(255, 255, 255));
        txtCentro.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtCentro.setForeground(new java.awt.Color(0, 26, 51));

        cbxGenero.setBackground(new java.awt.Color(255, 255, 255));
        cbxGenero.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        cbxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));

        lbGenero.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lbGenero.setForeground(new java.awt.Color(102, 102, 102));
        lbGenero.setText("Genero");

        lbCorreo.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lbCorreo.setForeground(new java.awt.Color(102, 102, 102));
        lbCorreo.setText("Correo");

        txtCorreo.setBackground(new java.awt.Color(255, 255, 255));
        txtCorreo.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(0, 26, 51));

        bgTop1.setBackground(new java.awt.Color(236, 239, 244));
        bgTop1.setAutoscrolls(true);
        bgTop1.setPreferredSize(new java.awt.Dimension(808, 55));

        btnAgregar.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/add.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMouseClicked(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/refresh.png"))); // NOI18N
        btnEditar.setText("Actualizar");
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarMouseClicked(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/cancel.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/clean.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bgTop1Layout = new javax.swing.GroupLayout(bgTop1);
        bgTop1.setLayout(bgTop1Layout);
        bgTop1Layout.setHorizontalGroup(
            bgTop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgTop1Layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addGroup(bgTop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );
        bgTop1Layout.setVerticalGroup(
            bgTop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgTop1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(btnAgregar)
                .addGap(41, 41, 41)
                .addComponent(btnEditar)
                .addGap(35, 35, 35)
                .addComponent(btnEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(btnLimpiar)
                .addContainerGap())
        );

        lbFacultad.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lbFacultad.setForeground(new java.awt.Color(102, 102, 102));
        lbFacultad.setText("Facultad");

        cbxFacultad.setBackground(new java.awt.Color(255, 255, 255));
        cbxFacultad.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        cbxFacultad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingeniería de Sistemas", "Medicina Humana", "Ciencias Contables" }));

        lbIngreso.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lbIngreso.setForeground(new java.awt.Color(102, 102, 102));
        lbIngreso.setText("Ingreso");

        txtIngreso.setEditable(false);
        txtIngreso.setBackground(new java.awt.Color(255, 255, 255));
        txtIngreso.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtIngreso.setForeground(new java.awt.Color(0, 26, 51));
        txtIngreso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIngreso.setText("-");

        lbSituacion.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lbSituacion.setForeground(new java.awt.Color(102, 102, 102));
        lbSituacion.setText("Situación");

        txtSituacion.setEditable(false);
        txtSituacion.setBackground(new java.awt.Color(255, 255, 255));
        txtSituacion.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtSituacion.setForeground(new java.awt.Color(0, 26, 51));
        txtSituacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSituacion.setText("-");

        lbPromedio.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lbPromedio.setForeground(new java.awt.Color(102, 102, 102));
        lbPromedio.setText("Promedio");

        txtPromedio.setEditable(false);
        txtPromedio.setBackground(new java.awt.Color(255, 255, 255));
        txtPromedio.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtPromedio.setForeground(new java.awt.Color(0, 26, 51));
        txtPromedio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPromedio.setText("-");

        javax.swing.GroupLayout bgDatosLayout = new javax.swing.GroupLayout(bgDatos);
        bgDatos.setLayout(bgDatosLayout);
        bgDatosLayout.setHorizontalGroup(
            bgDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgDatosLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(bgDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bgDatosLayout.createSequentialGroup()
                        .addGroup(bgDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(bgDatosLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(lbApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lbNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(bgDatosLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(lbCelular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(bgDatosLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(lbNombres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(bgDatosLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(lbGenero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(bgDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxGenero, 0, 156, Short.MAX_VALUE)
                            .addComponent(txtNombres, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtApellidos)
                            .addComponent(jCalendar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCelular, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)))
                    .addGroup(bgDatosLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(lbDNI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(txtDNI, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)))
                .addGroup(bgDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgDatosLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(bgDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbSituacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgDatosLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(bgDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbFacultad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgDatosLayout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(lbCentro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgDatosLayout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(bgDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbPromedio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgDatosLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(lbIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgDatosLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(lbCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bgDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtSituacion)
                    .addComponent(txtIngreso, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCentro, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxFacultad, javax.swing.GroupLayout.Alignment.LEADING, 0, 207, Short.MAX_VALUE)
                    .addComponent(txtPromedio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bgTop1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        bgDatosLayout.setVerticalGroup(
            bgDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgDatosLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(bgDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgDatosLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lbDNI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(bgDatosLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(bgDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCentro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCentro)))
                    .addGroup(bgDatosLayout.createSequentialGroup()
                        .addComponent(txtDNI)
                        .addGap(4, 4, 4)))
                .addGap(18, 18, 18)
                .addGroup(bgDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgDatosLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lbNombres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgDatosLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(bgDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbFacultad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxFacultad)))
                    .addGroup(bgDatosLayout.createSequentialGroup()
                        .addComponent(txtNombres)
                        .addGap(6, 6, 6)))
                .addGap(18, 18, 18)
                .addGroup(bgDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgDatosLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lbApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtCorreo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bgDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtApellidos)
                        .addComponent(lbCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(bgDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgDatosLayout.createSequentialGroup()
                        .addGroup(bgDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCalendar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(24, 24, 24)
                        .addGroup(bgDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSituacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCelular)
                            .addGroup(bgDatosLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(bgDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbCelular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbSituacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addGroup(bgDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgDatosLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lbGenero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(bgDatosLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(bgDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(bgDatosLayout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(lbPromedio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(txtPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(cbxGenero))
                        .addGap(24, 24, 24))
                    .addGroup(bgDatosLayout.createSequentialGroup()
                        .addGroup(bgDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIngreso)
                            .addComponent(lbIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(126, 126, 126))))
            .addGroup(bgDatosLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(bgTop1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        bgTop.setBackground(new java.awt.Color(204, 204, 204));
        bgTop.setAutoscrolls(true);
        bgTop.setPreferredSize(new java.awt.Dimension(808, 55));

        lbTitulo.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(0, 26, 51));
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("PANEL DE ESTUDIANTES");
        lbTitulo.setAutoscrolls(true);

        javax.swing.GroupLayout bgTopLayout = new javax.swing.GroupLayout(bgTop);
        bgTop.setLayout(bgTopLayout);
        bgTopLayout.setHorizontalGroup(
            bgTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgTopLayout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE)
                .addGap(184, 184, 184))
        );
        bgTopLayout.setVerticalGroup(
            bgTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        bgRegistrados.setBackground(new java.awt.Color(236, 239, 244));
        bgRegistrados.setBorder(javax.swing.BorderFactory.createTitledBorder("Estudiantes Registrados"));
        bgRegistrados.setAutoscrolls(true);
        bgRegistrados.setPreferredSize(new java.awt.Dimension(808, 55));

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "DNI", "Nombres", "Apellidos", "Nacimiento", "Celular", "Genero", "Facultad", "Situación"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable.setToolTipText("");
        jTable.setPreferredSize(new java.awt.Dimension(700, 220));
        jTable.setRowHeight(22);
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);

        javax.swing.GroupLayout bgRegistradosLayout = new javax.swing.GroupLayout(bgRegistrados);
        bgRegistrados.setLayout(bgRegistradosLayout);
        bgRegistradosLayout.setHorizontalGroup(
            bgRegistradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgRegistradosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1)
                .addGap(20, 20, 20))
        );
        bgRegistradosLayout.setVerticalGroup(
            bgRegistradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
        );

        bgDatos1.setBackground(new java.awt.Color(236, 239, 244));
        bgDatos1.setBorder(javax.swing.BorderFactory.createTitledBorder("Consultar Estudiante"));
        bgDatos1.setAutoscrolls(true);
        bgDatos1.setPreferredSize(new java.awt.Dimension(808, 55));

        cbxConsultar.setBackground(new java.awt.Color(255, 255, 255));
        cbxConsultar.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        cbxConsultar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DNI", "Apellidos" }));

        lbConsultar.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lbConsultar.setForeground(new java.awt.Color(102, 102, 102));
        lbConsultar.setText("Buscar por:");

        txtConsulta.setBackground(new java.awt.Color(255, 255, 255));
        txtConsulta.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtConsulta.setForeground(new java.awt.Color(0, 26, 51));

        btnConsultar.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/buscar.png"))); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConsultarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bgDatos1Layout = new javax.swing.GroupLayout(bgDatos1);
        bgDatos1.setLayout(bgDatos1Layout);
        bgDatos1Layout.setHorizontalGroup(
            bgDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgDatos1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(lbConsultar)
                .addGap(18, 18, 18)
                .addComponent(cbxConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(txtConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                .addGap(61, 61, 61)
                .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );
        bgDatos1Layout.setVerticalGroup(
            bgDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgDatos1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bgDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(bgDatos1Layout.createSequentialGroup()
                        .addComponent(txtConsulta)
                        .addGap(1, 1, 1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bgDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbConsultar)
                        .addComponent(cbxConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout bgFondoLayout = new javax.swing.GroupLayout(bgFondo);
        bgFondo.setLayout(bgFondoLayout);
        bgFondoLayout.setHorizontalGroup(
            bgFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgTop, javax.swing.GroupLayout.DEFAULT_SIZE, 1035, Short.MAX_VALUE)
            .addGroup(bgFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bgFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bgRegistrados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1023, Short.MAX_VALUE)
                    .addComponent(bgDatos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1023, Short.MAX_VALUE)
                    .addComponent(bgDatos1, javax.swing.GroupLayout.DEFAULT_SIZE, 1023, Short.MAX_VALUE))
                .addContainerGap())
        );
        bgFondoLayout.setVerticalGroup(
            bgFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgFondoLayout.createSequentialGroup()
                .addComponent(bgTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bgDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bgDatos1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bgRegistrados, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                .addContainerGap())
        );

        estudiantePanel.add(bgFondo, java.awt.BorderLayout.CENTER);

        bgEscritorio.add(estudiantePanel, "card5");

        matriculaPanel.setLayout(new java.awt.BorderLayout());

        bgFondo1.setBackground(new java.awt.Color(0, 128, 128));
        bgFondo1.setPreferredSize(new java.awt.Dimension(1035, 609));

        bgDatos2.setBackground(new java.awt.Color(0, 128, 128));
        bgDatos2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Matrícula"));
        bgDatos2.setAutoscrolls(true);
        bgDatos2.setPreferredSize(new java.awt.Dimension(808, 55));

        txtNombresMatricula.setEditable(false);
        txtNombresMatricula.setBackground(new java.awt.Color(204, 204, 204));
        txtNombresMatricula.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtNombresMatricula.setForeground(new java.awt.Color(0, 26, 51));
        txtNombresMatricula.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombresMatricula.setText("-");

        lbNombres1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lbNombres1.setForeground(new java.awt.Color(0, 0, 0));
        lbNombres1.setText("Nombres");

        txtApellidosMatricula.setEditable(false);
        txtApellidosMatricula.setBackground(new java.awt.Color(204, 204, 204));
        txtApellidosMatricula.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtApellidosMatricula.setForeground(new java.awt.Color(0, 26, 51));
        txtApellidosMatricula.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApellidosMatricula.setText("-");

        lbApellidos1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lbApellidos1.setForeground(new java.awt.Color(0, 0, 0));
        lbApellidos1.setText("Apellidos");

        lbFacultadMatricula.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lbFacultadMatricula.setForeground(new java.awt.Color(0, 0, 0));
        lbFacultadMatricula.setText("Facultad");

        txtFacultadMatricula.setEditable(false);
        txtFacultadMatricula.setBackground(new java.awt.Color(204, 204, 204));
        txtFacultadMatricula.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtFacultadMatricula.setForeground(new java.awt.Color(0, 26, 51));
        txtFacultadMatricula.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFacultadMatricula.setText("-");

        cbxSemestre.setBackground(new java.awt.Color(255, 255, 255));
        cbxSemestre.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        cbxSemestre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2021 - 1", "2021 - 2" }));

        lbSemestre.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lbSemestre.setForeground(new java.awt.Color(0, 0, 0));
        lbSemestre.setText("Semestre");

        bgTop2.setBackground(new java.awt.Color(0, 128, 128));
        bgTop2.setAutoscrolls(true);
        bgTop2.setPreferredSize(new java.awt.Dimension(808, 55));

        btnAgregarMatricula.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        btnAgregarMatricula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/add.png"))); // NOI18N
        btnAgregarMatricula.setText("Matricular");
        btnAgregarMatricula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMatriculaMouseClicked(evt);
            }
        });

        btnEliminarMatricula.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        btnEliminarMatricula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/cancel.png"))); // NOI18N
        btnEliminarMatricula.setText("Eliminar");
        btnEliminarMatricula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMatriculaMouseClicked(evt);
            }
        });

        btnMatricula.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        btnMatricula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/clean.png"))); // NOI18N
        btnMatricula.setText("Limpiar");
        btnMatricula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMatriculaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bgTop2Layout = new javax.swing.GroupLayout(bgTop2);
        bgTop2.setLayout(bgTop2Layout);
        bgTop2Layout.setHorizontalGroup(
            bgTop2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgTop2Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(bgTop2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEliminarMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAgregarMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .addComponent(btnMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );
        bgTop2Layout.setVerticalGroup(
            bgTop2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgTop2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnAgregarMatricula)
                .addGap(18, 18, 18)
                .addComponent(btnEliminarMatricula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(btnMatricula)
                .addGap(25, 25, 25))
        );

        lbSituacionMatricula.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lbSituacionMatricula.setForeground(new java.awt.Color(0, 0, 0));
        lbSituacionMatricula.setText("Situación");

        txtSituacionMatricula.setEditable(false);
        txtSituacionMatricula.setBackground(new java.awt.Color(204, 204, 204));
        txtSituacionMatricula.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtSituacionMatricula.setForeground(new java.awt.Color(0, 26, 51));
        txtSituacionMatricula.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSituacionMatricula.setText("-");

        lbSalon.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lbSalon.setForeground(new java.awt.Color(0, 0, 0));
        lbSalon.setText("Salón");

        txtSalon.setBackground(new java.awt.Color(255, 255, 255));
        txtSalon.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtSalon.setForeground(new java.awt.Color(0, 26, 51));
        txtSalon.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbNcursos.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lbNcursos.setForeground(new java.awt.Color(0, 0, 0));
        lbNcursos.setText("N° Cursos");

        txtNCursos.setEditable(false);
        txtNCursos.setBackground(new java.awt.Color(255, 255, 255));
        txtNCursos.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtNCursos.setForeground(new java.awt.Color(0, 26, 51));
        txtNCursos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNCursos.setText("-");

        lbCursos.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lbCursos.setForeground(new java.awt.Color(0, 0, 0));
        lbCursos.setText("Cursos");

        txtIDMatricula.setBackground(new java.awt.Color(255, 255, 255));
        txtIDMatricula.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtIDMatricula.setForeground(new java.awt.Color(0, 26, 51));
        txtIDMatricula.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbIDMatricula.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lbIDMatricula.setForeground(new java.awt.Color(0, 0, 0));
        lbIDMatricula.setText("ID*");

        jListCursos.setModel(Modelo);
        jListCursos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListCursosMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jListCursos);

        cbxCursos.setBackground(new java.awt.Color(255, 255, 255));
        cbxCursos.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        cbxCursos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Matemáticas", "Programación", "Economía", "Realidad Nacional", "Idioma Extranjero" }));
        cbxCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCursosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgDatos2Layout = new javax.swing.GroupLayout(bgDatos2);
        bgDatos2.setLayout(bgDatos2Layout);
        bgDatos2Layout.setHorizontalGroup(
            bgDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgDatos2Layout.createSequentialGroup()
                .addGroup(bgDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgDatos2Layout.createSequentialGroup()
                        .addGroup(bgDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgDatos2Layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addGroup(bgDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbApellidos1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(bgDatos2Layout.createSequentialGroup()
                                        .addComponent(lbNombres1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(1, 1, 1)))
                                .addGap(8, 8, 8))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgDatos2Layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addGroup(bgDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(bgDatos2Layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(lbCursos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(lbSemestre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(bgDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxCursos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtApellidosMatricula)
                            .addComponent(txtNombresMatricula)
                            .addComponent(cbxSemestre, 0, 217, Short.MAX_VALUE))
                        .addGap(39, 39, 39)
                        .addGroup(bgDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgDatos2Layout.createSequentialGroup()
                                .addGroup(bgDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgDatos2Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(bgDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(bgDatos2Layout.createSequentialGroup()
                                                .addComponent(lbFacultadMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                                                .addGap(6, 6, 6))
                                            .addComponent(lbSituacionMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(bgDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lbSalon)
                                        .addComponent(lbNcursos)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                                .addGroup(bgDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtFacultadMatricula)
                                    .addComponent(txtSituacionMatricula)
                                    .addComponent(txtSalon)
                                    .addComponent(txtNCursos, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)))
                            .addComponent(jScrollPane5)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgDatos2Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jSeparator1)))
                .addGroup(bgDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgDatos2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lbIDMatricula)
                        .addGap(18, 18, 18)
                        .addComponent(txtIDMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgDatos2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(bgTop2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))))
        );
        bgDatos2Layout.setVerticalGroup(
            bgDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgDatos2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(bgDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgDatos2Layout.createSequentialGroup()
                        .addGroup(bgDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbFacultadMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtFacultadMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbIDMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtIDMatricula))
                        .addGap(18, 18, 18)
                        .addGroup(bgDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(bgDatos2Layout.createSequentialGroup()
                                .addGroup(bgDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbSituacionMatricula)
                                    .addComponent(txtSituacionMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10))
                            .addComponent(bgTop2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(bgDatos2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(bgDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbNombres1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNombresMatricula))
                        .addGap(18, 18, 18)
                        .addGroup(bgDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbApellidos1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtApellidosMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addGroup(bgDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtSalon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbSalon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(bgDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbSemestre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbxSemestre)))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(bgDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbNcursos)
                            .addComponent(txtNCursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbCursos)
                            .addComponent(cbxCursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(161, 161, 161))))
        );

        bgTop3.setBackground(new java.awt.Color(0, 51, 51));
        bgTop3.setAutoscrolls(true);
        bgTop3.setPreferredSize(new java.awt.Dimension(808, 55));

        lbTitulo1.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        lbTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        lbTitulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo1.setText("PANEL DE MATRÍCULA");
        lbTitulo1.setAutoscrolls(true);

        javax.swing.GroupLayout bgTop3Layout = new javax.swing.GroupLayout(bgTop3);
        bgTop3.setLayout(bgTop3Layout);
        bgTop3Layout.setHorizontalGroup(
            bgTop3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgTop3Layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(lbTitulo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(184, 184, 184))
        );
        bgTop3Layout.setVerticalGroup(
            bgTop3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbTitulo1, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        bgRegistrados1.setBackground(new java.awt.Color(0, 128, 128));
        bgRegistrados1.setBorder(javax.swing.BorderFactory.createTitledBorder("Estudiantes Registrados"));
        bgRegistrados1.setAutoscrolls(true);
        bgRegistrados1.setPreferredSize(new java.awt.Dimension(808, 55));

        jTableMatricula.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "DNI", "Nombres", "Apellidos", "Nacimiento", "Celular", "Genero", "Facultad", "Situación"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableMatricula.setToolTipText("");
        jTableMatricula.setPreferredSize(new java.awt.Dimension(700, 220));
        jTableMatricula.setRowHeight(22);
        jTableMatricula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMatriculaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableMatricula);

        javax.swing.GroupLayout bgRegistrados1Layout = new javax.swing.GroupLayout(bgRegistrados1);
        bgRegistrados1.setLayout(bgRegistrados1Layout);
        bgRegistrados1Layout.setHorizontalGroup(
            bgRegistrados1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgRegistrados1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2)
                .addGap(20, 20, 20))
        );
        bgRegistrados1Layout.setVerticalGroup(
            bgRegistrados1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
        );

        bgDatos3.setBackground(new java.awt.Color(0, 128, 128));
        bgDatos3.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar Estudiante"));
        bgDatos3.setAutoscrolls(true);
        bgDatos3.setPreferredSize(new java.awt.Dimension(808, 55));

        lbBuscarEstudiante.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lbBuscarEstudiante.setForeground(new java.awt.Color(0, 0, 0));
        lbBuscarEstudiante.setText("DNI");

        txtBuscarEstudiante.setBackground(new java.awt.Color(255, 255, 255));
        txtBuscarEstudiante.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtBuscarEstudiante.setForeground(new java.awt.Color(0, 26, 51));

        btnBuscarEstudiante.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        btnBuscarEstudiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/buscar.png"))); // NOI18N
        btnBuscarEstudiante.setText("Buscar");
        btnBuscarEstudiante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarEstudianteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bgDatos3Layout = new javax.swing.GroupLayout(bgDatos3);
        bgDatos3.setLayout(bgDatos3Layout);
        bgDatos3Layout.setHorizontalGroup(
            bgDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgDatos3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbBuscarEstudiante)
                .addGap(18, 18, 18)
                .addComponent(txtBuscarEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscarEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );
        bgDatos3Layout.setVerticalGroup(
            bgDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgDatos3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bgDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbBuscarEstudiante)
                    .addComponent(btnBuscarEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscarEstudiante))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        bgDatos6.setBackground(new java.awt.Color(0, 128, 128));
        bgDatos6.setBorder(javax.swing.BorderFactory.createTitledBorder("Consultar Matrícula"));
        bgDatos6.setAutoscrolls(true);
        bgDatos6.setPreferredSize(new java.awt.Dimension(808, 55));

        lbMatricula.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lbMatricula.setForeground(new java.awt.Color(0, 0, 0));
        lbMatricula.setText("ID");

        txtMatricula.setBackground(new java.awt.Color(255, 255, 255));
        txtMatricula.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtMatricula.setForeground(new java.awt.Color(0, 26, 51));

        btnConsultarMatricula.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        btnConsultarMatricula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/buscar.png"))); // NOI18N
        btnConsultarMatricula.setText("Consultar");
        btnConsultarMatricula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConsultarMatriculaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bgDatos6Layout = new javax.swing.GroupLayout(bgDatos6);
        bgDatos6.setLayout(bgDatos6Layout);
        bgDatos6Layout.setHorizontalGroup(
            bgDatos6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgDatos6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbMatricula)
                .addGap(18, 18, 18)
                .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnConsultarMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bgDatos6Layout.setVerticalGroup(
            bgDatos6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgDatos6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bgDatos6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMatricula)
                    .addComponent(btnConsultarMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout bgFondo1Layout = new javax.swing.GroupLayout(bgFondo1);
        bgFondo1.setLayout(bgFondo1Layout);
        bgFondo1Layout.setHorizontalGroup(
            bgFondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgTop3, javax.swing.GroupLayout.DEFAULT_SIZE, 1035, Short.MAX_VALUE)
            .addGroup(bgFondo1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bgFondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bgRegistrados1, javax.swing.GroupLayout.DEFAULT_SIZE, 1023, Short.MAX_VALUE)
                    .addComponent(bgDatos2, javax.swing.GroupLayout.DEFAULT_SIZE, 1023, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgFondo1Layout.createSequentialGroup()
                        .addComponent(bgDatos3, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bgDatos6, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)))
                .addContainerGap())
        );
        bgFondo1Layout.setVerticalGroup(
            bgFondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgFondo1Layout.createSequentialGroup()
                .addComponent(bgTop3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bgDatos2, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgFondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bgDatos3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bgDatos6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bgRegistrados1, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                .addContainerGap())
        );

        matriculaPanel.add(bgFondo1, java.awt.BorderLayout.CENTER);

        bgEscritorio.add(matriculaPanel, "card5");

        calificacionesPanel.setLayout(new java.awt.BorderLayout());

        bgFondo3.setBackground(new java.awt.Color(0, 102, 153));
        bgFondo3.setPreferredSize(new java.awt.Dimension(1035, 609));

        bgDatos7.setBackground(new java.awt.Color(0, 102, 153));
        bgDatos7.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Generales"));
        bgDatos7.setAutoscrolls(true);
        bgDatos7.setPreferredSize(new java.awt.Dimension(808, 55));

        txtNombresCalificaciones.setEditable(false);
        txtNombresCalificaciones.setBackground(new java.awt.Color(204, 204, 204));
        txtNombresCalificaciones.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtNombresCalificaciones.setForeground(new java.awt.Color(0, 26, 51));
        txtNombresCalificaciones.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombresCalificaciones.setText("-");

        lbNombres3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lbNombres3.setForeground(new java.awt.Color(0, 0, 0));
        lbNombres3.setText("Nombres");

        txtApellidosCalificaciones.setEditable(false);
        txtApellidosCalificaciones.setBackground(new java.awt.Color(204, 204, 204));
        txtApellidosCalificaciones.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtApellidosCalificaciones.setForeground(new java.awt.Color(0, 26, 51));
        txtApellidosCalificaciones.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApellidosCalificaciones.setText("-");

        lbApellidos3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lbApellidos3.setForeground(new java.awt.Color(0, 0, 0));
        lbApellidos3.setText("Apellidos");

        lbFacultadCalificaciones.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lbFacultadCalificaciones.setForeground(new java.awt.Color(0, 0, 0));
        lbFacultadCalificaciones.setText("Facultad");

        txtFacultadCalificaciones.setEditable(false);
        txtFacultadCalificaciones.setBackground(new java.awt.Color(204, 204, 204));
        txtFacultadCalificaciones.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtFacultadCalificaciones.setForeground(new java.awt.Color(0, 26, 51));
        txtFacultadCalificaciones.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFacultadCalificaciones.setText("-");

        bgTop6.setBackground(new java.awt.Color(0, 102, 153));
        bgTop6.setAutoscrolls(true);
        bgTop6.setPreferredSize(new java.awt.Dimension(808, 55));

        btnAgregarCalificaciones.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        btnAgregarCalificaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/add.png"))); // NOI18N
        btnAgregarCalificaciones.setText("Subir");
        btnAgregarCalificaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarCalificacionesMouseClicked(evt);
            }
        });

        btnLimpiarCalificaciones.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        btnLimpiarCalificaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/clean.png"))); // NOI18N
        btnLimpiarCalificaciones.setText("Limpiar");
        btnLimpiarCalificaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarCalificacionesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bgTop6Layout = new javax.swing.GroupLayout(bgTop6);
        bgTop6.setLayout(bgTop6Layout);
        bgTop6Layout.setHorizontalGroup(
            bgTop6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgTop6Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(bgTop6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAgregarCalificaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .addComponent(btnLimpiarCalificaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );
        bgTop6Layout.setVerticalGroup(
            bgTop6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgTop6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAgregarCalificaciones)
                .addGap(67, 67, 67)
                .addComponent(btnLimpiarCalificaciones)
                .addGap(33, 33, 33))
        );

        lbSemestreCalificaciones.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lbSemestreCalificaciones.setForeground(new java.awt.Color(0, 0, 0));
        lbSemestreCalificaciones.setText("Semestre");

        txtSemestreCalificaciones.setEditable(false);
        txtSemestreCalificaciones.setBackground(new java.awt.Color(204, 204, 204));
        txtSemestreCalificaciones.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtSemestreCalificaciones.setForeground(new java.awt.Color(0, 26, 51));
        txtSemestreCalificaciones.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSemestreCalificaciones.setText("-");

        lbCursosCalificaciones.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lbCursosCalificaciones.setForeground(new java.awt.Color(0, 0, 0));
        lbCursosCalificaciones.setText("Cursos");

        lbPromedioCalificaciones.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lbPromedioCalificaciones.setForeground(new java.awt.Color(0, 0, 0));
        lbPromedioCalificaciones.setText("Promedio");

        txtpromedioCalificaciones.setEditable(false);
        txtpromedioCalificaciones.setBackground(new java.awt.Color(204, 204, 204));
        txtpromedioCalificaciones.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtpromedioCalificaciones.setForeground(new java.awt.Color(0, 26, 51));
        txtpromedioCalificaciones.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtpromedioCalificaciones.setText("-");

        txtCursosCalificaciones.setEditable(false);
        txtCursosCalificaciones.setBackground(new java.awt.Color(204, 204, 204));
        txtCursosCalificaciones.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtCursosCalificaciones.setForeground(new java.awt.Color(0, 26, 51));
        txtCursosCalificaciones.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCursosCalificaciones.setText("-");

        bgRegistrados4.setBackground(new java.awt.Color(0, 102, 153));
        bgRegistrados4.setAutoscrolls(true);
        bgRegistrados4.setPreferredSize(new java.awt.Dimension(808, 55));

        jTableNotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Curso", "Nota"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableNotas.setToolTipText("");
        jTableNotas.setPreferredSize(new java.awt.Dimension(700, 220));
        jTableNotas.setRowHeight(22);
        jScrollPane6.setViewportView(jTableNotas);

        javax.swing.GroupLayout bgRegistrados4Layout = new javax.swing.GroupLayout(bgRegistrados4);
        bgRegistrados4.setLayout(bgRegistrados4Layout);
        bgRegistrados4Layout.setHorizontalGroup(
            bgRegistrados4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgRegistrados4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane6)
                .addGap(21, 21, 21))
        );
        bgRegistrados4Layout.setVerticalGroup(
            bgRegistrados4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgRegistrados4Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jSeparator2.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout bgDatos7Layout = new javax.swing.GroupLayout(bgDatos7);
        bgDatos7.setLayout(bgDatos7Layout);
        bgDatos7Layout.setHorizontalGroup(
            bgDatos7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgDatos7Layout.createSequentialGroup()
                .addGroup(bgDatos7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bgDatos7Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(bgRegistrados4, javax.swing.GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bgTop6, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bgDatos7Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(bgDatos7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNombres3)
                            .addComponent(lbApellidos3))
                        .addGap(18, 18, 18)
                        .addGroup(bgDatos7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombresCalificaciones)
                            .addComponent(txtApellidosCalificaciones))
                        .addGap(34, 34, 34)
                        .addGroup(bgDatos7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbFacultadCalificaciones)
                            .addComponent(lbSemestreCalificaciones))
                        .addGap(37, 37, 37)
                        .addGroup(bgDatos7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSemestreCalificaciones)
                            .addComponent(txtFacultadCalificaciones))
                        .addGap(27, 27, 27)
                        .addGroup(bgDatos7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbPromedioCalificaciones)
                            .addComponent(lbCursosCalificaciones))
                        .addGap(36, 36, 36)
                        .addGroup(bgDatos7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCursosCalificaciones)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgDatos7Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(txtpromedioCalificaciones)))))
                .addGap(64, 64, 64))
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        bgDatos7Layout.setVerticalGroup(
            bgDatos7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgDatos7Layout.createSequentialGroup()
                .addGroup(bgDatos7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgDatos7Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(bgDatos7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgDatos7Layout.createSequentialGroup()
                                .addGroup(bgDatos7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbFacultadCalificaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtFacultadCalificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(49, 49, 49))
                            .addGroup(bgDatos7Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(bgDatos7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbNombres3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtNombresCalificaciones))
                                .addGap(18, 18, 18)
                                .addGroup(bgDatos7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbApellidos3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtApellidosCalificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbSemestreCalificaciones)
                                    .addComponent(txtSemestreCalificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbPromedioCalificaciones)))))
                    .addGroup(bgDatos7Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(bgDatos7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCursosCalificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbCursosCalificaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(txtpromedioCalificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(bgDatos7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bgTop6, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                    .addComponent(bgRegistrados4, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
                .addGap(51, 51, 51))
        );

        bgTop7.setBackground(new java.awt.Color(0, 51, 102));
        bgTop7.setAutoscrolls(true);
        bgTop7.setPreferredSize(new java.awt.Dimension(808, 55));

        lbTitulo3.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        lbTitulo3.setForeground(new java.awt.Color(255, 255, 255));
        lbTitulo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo3.setText("CALIFICACIONES");
        lbTitulo3.setAutoscrolls(true);

        javax.swing.GroupLayout bgTop7Layout = new javax.swing.GroupLayout(bgTop7);
        bgTop7.setLayout(bgTop7Layout);
        bgTop7Layout.setHorizontalGroup(
            bgTop7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgTop7Layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(lbTitulo3, javax.swing.GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE)
                .addGap(184, 184, 184))
        );
        bgTop7Layout.setVerticalGroup(
            bgTop7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbTitulo3, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        bgRegistrados3.setBackground(new java.awt.Color(0, 102, 153));
        bgRegistrados3.setBorder(javax.swing.BorderFactory.createTitledBorder("Estudiantes Matriculados"));
        bgRegistrados3.setAutoscrolls(true);
        bgRegistrados3.setPreferredSize(new java.awt.Dimension(808, 55));

        jTableCalificaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Matricula", "DNI", "Semestre", "Salon", "Cursos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableCalificaciones.setToolTipText("");
        jTableCalificaciones.setPreferredSize(new java.awt.Dimension(700, 220));
        jTableCalificaciones.setRowHeight(22);
        jTableCalificaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCalificacionesMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTableCalificaciones);

        javax.swing.GroupLayout bgRegistrados3Layout = new javax.swing.GroupLayout(bgRegistrados3);
        bgRegistrados3.setLayout(bgRegistrados3Layout);
        bgRegistrados3Layout.setHorizontalGroup(
            bgRegistrados3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgRegistrados3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane4)
                .addGap(20, 20, 20))
        );
        bgRegistrados3Layout.setVerticalGroup(
            bgRegistrados3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout bgFondo3Layout = new javax.swing.GroupLayout(bgFondo3);
        bgFondo3.setLayout(bgFondo3Layout);
        bgFondo3Layout.setHorizontalGroup(
            bgFondo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgTop7, javax.swing.GroupLayout.DEFAULT_SIZE, 1035, Short.MAX_VALUE)
            .addGroup(bgFondo3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bgFondo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bgRegistrados3, javax.swing.GroupLayout.DEFAULT_SIZE, 1023, Short.MAX_VALUE)
                    .addComponent(bgDatos7, javax.swing.GroupLayout.DEFAULT_SIZE, 1023, Short.MAX_VALUE))
                .addContainerGap())
        );
        bgFondo3Layout.setVerticalGroup(
            bgFondo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgFondo3Layout.createSequentialGroup()
                .addComponent(bgTop7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bgDatos7, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bgRegistrados3, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                .addContainerGap())
        );

        calificacionesPanel.add(bgFondo3, java.awt.BorderLayout.CENTER);

        bgEscritorio.add(calificacionesPanel, "card5");

        getContentPane().add(bgEscritorio, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void IniciarCombobox() {

        cbxGenero.setSelectedItem(null);   // pone en blanco el jcomboBox al principio
        cbxFacultad.setSelectedItem(null);   // pone en blanco el jcomboBox al principio
        cbxSemestre.setSelectedItem(null);
        cbxCursos.setSelectedItem(null);

        txtNCursos.setText("-");
        Modelo.clear();

    }

    private void EstablecerIcono() {

        try {
            ImageIcon ic = new ImageIcon(getClass().getResource("/Imagenes/Iconos/universidad.png"));
            this.setIconImage(ic.getImage());
        } catch (Exception e) {
        }

    }

    /**
     * Estudiantes
     * --------------------------------------------------------------------------------------------------------------------------------------
     */
    private void eventoTablaEstudiantes() {
        jTable.addMouseListener(new MouseAdapter() {

            // creamos un modelo de tabla
            DefaultTableModel model = new DefaultTableModel();

            public void mouseClicked(MouseEvent e) {

                // asociamos el modelo al JTable
                int i = jTable.getSelectedRow();
                dni = (jTable.getValueAt(i, 0).toString());
                nombre = (jTable.getValueAt(i, 1).toString());
                apellido = (jTable.getValueAt(i, 2).toString());
                nacimiento = (jTable.getValueAt(i, 3).toString());
                celular = (jTable.getValueAt(i, 4).toString());
                genero = (jTable.getValueAt(i, 5).toString());
                facultad = (jTable.getValueAt(i, 6).toString());
                situacion = (jTable.getValueAt(i, 7).toString());

            }
        });
    }

    /*  Método para limpiar los campos estudiantes*/
    private void limpiarEstudiantes() {

        txtDNI.setText("");
        txtDNI.setEditable(true);
        txtNombres.setText("");
        txtApellidos.setText("");
        jCalendar.setCalendar(null);
        txtCelular.setText("+51 ");
        cbxGenero.setSelectedItem(null);
        cbxGenero.setEnabled(true);
        txtCentro.setText("");
        cbxFacultad.setSelectedItem(null);
        cbxFacultad.setEnabled(true);
        txtCorreo.setText("");
        txtIngreso.setText("-");
        txtSituacion.setText("-");
        txtPromedio.setText("-");

    }

    /*  Método para validar campos y restricciones en estudiantes */
    public boolean validar() {

        if (txtDNI.getText().equals("") || txtNombres.getText().equals("") || jCalendar.getCalendar() == null) {
            JOptionPane.showMessageDialog(null, "Rellene todos los campos", "Error", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        // verificamos que no se dupliquen los datos
        ArrayList<Estudiante> estudiante = cargarEstudiantes();

        for (Estudiante buscar : estudiante) {

            if (buscar.getDni().equals(txtDNI.getText())) {
                JOptionPane.showMessageDialog(null, "Estudiante ya registrado", "Error", JOptionPane.WARNING_MESSAGE);
                return false;
            }
        }

        return true;

    }

    /*  Método para mostrar los datos almacenados en estudiantes*/
    public void mostrarDatos() {

        ArrayList<Estudiante> estudiantes = cargarEstudiantes();
        if (estudiantes != null) {
            String matriz[][] = new String[estudiantes.size()][8];

            for (int i = 0; i < estudiantes.size(); i++) {

                matriz[i][0] = estudiantes.get(i).getDni();
                matriz[i][1] = estudiantes.get(i).getNombre();
                matriz[i][2] = estudiantes.get(i).getApellido();
                matriz[i][3] = estudiantes.get(i).getNacimiento();
                matriz[i][4] = estudiantes.get(i).getCelular();
                matriz[i][5] = estudiantes.get(i).getGenero();
                matriz[i][6] = estudiantes.get(i).getFacultad();
                matriz[i][7] = estudiantes.get(i).getSituacion();

            }

            jTable.setModel(new javax.swing.table.DefaultTableModel(matriz, new String[]{"DNI", "Nombres", "Apellidos", "Nacimiento", "Celular", "Genero", "Facultad", "Situación"}));
        }
    }

    /* Métodos Auxiliares del Sidebar */
    public void setDefault(Color color) {

        estudianteLabel.setBackground(color);
        matriculaLabel.setBackground(color);
        calificacionesLabel.setBackground(color);
        estudiantePanel.setVisible(false);
        matriculaPanel.setVisible(false);
        calificacionesPanel.setVisible(false);

    }

    public void limpiarEscritorio(JLabel label, JPanel panel) {

        setDefault(new Color(34, 45, 49));
        label.setBackground(new Color(44, 59, 66));
        panel.setVisible(true);

        // matiene datos actualizados
        mostrarDatos();
        mostrarDatosMatricula();
        mostrarDatosCalificaciones();

    }

    public void cambiarColor(JPanel panel, Color color) {
        panel.setBackground(color);
    }

    public void cambiarImagen(JLabel button, String resourcheimg) {

        ImageIcon aimg = new ImageIcon(getClass().getResource(resourcheimg));
        button.setIcon(aimg);

    }

    public void mostrarOculto(JPanel menushowhide, boolean dashboard, JLabel button) {

        if (dashboard) {
            menushowhide.setPreferredSize(new Dimension(50, menushowhide.getHeight()));
            cambiarImagen(button, "/Imagenes/Iconos/menu_32px.png");
        } else {
            menushowhide.setPreferredSize(new Dimension(270, menushowhide.getHeight()));
            cambiarImagen(button, "/Imagenes/Iconos/back_32px.png");
        }

    }

    private void btnSidebarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSidebarMouseEntered
        cambiarColor(bgLineaSide, new Color(247, 78, 105));
    }//GEN-LAST:event_btnSidebarMouseEntered

    private void btnSidebarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSidebarMouseClicked

        cambiarColor(bgMenuOculto, new Color(34, 45, 49));
        mostrarOculto(bgMenu, sidebar, btnSidebar);
        SwingUtilities.updateComponentTreeUI(this);
        sidebar = !sidebar;

    }//GEN-LAST:event_btnSidebarMouseClicked

    private void btnSidebarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSidebarMouseExited
        cambiarColor(bgLineaSide, new Color(18, 31, 35));
    }//GEN-LAST:event_btnSidebarMouseExited

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked

        Login universidad = new Login();
        universidad.setVisible(true);
        JOptionPane.showMessageDialog(null, "Sesion cerrada");
        dispose();

    }//GEN-LAST:event_btnSalirMouseClicked

    private void estudianteLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_estudianteLabelMouseClicked
        limpiarEscritorio(estudianteLabel, estudiantePanel);
    }//GEN-LAST:event_estudianteLabelMouseClicked

    private void matriculaLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_matriculaLabelMouseClicked
        limpiarEscritorio(matriculaLabel, matriculaPanel);
    }//GEN-LAST:event_matriculaLabelMouseClicked

    private void calificacionesLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calificacionesLabelMouseClicked
        limpiarEscritorio(calificacionesLabel, calificacionesPanel);
    }//GEN-LAST:event_calificacionesLabelMouseClicked

    private void btnConfiguracionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfiguracionMouseEntered
        cambiarColor(bgLineaConfig, new Color(247, 78, 105));
    }//GEN-LAST:event_btnConfiguracionMouseEntered

    private void btnConfiguracionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfiguracionMouseExited
        cambiarColor(bgLineaConfig, new Color(18, 31, 35));
    }//GEN-LAST:event_btnConfiguracionMouseExited

    private void btnConfiguracionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfiguracionMouseClicked
        GestionarAdministrativos administrativo = new GestionarAdministrativos();
        administrativo.setVisible(true);
        dispose();

    }//GEN-LAST:event_btnConfiguracionMouseClicked

    /* Método para seleccionar un estudiante para consultarlo desde el campo de busqueda */
    private void btnConsultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarMouseClicked
        ArrayList<Estudiante> estudiante = cargarEstudiantes();
        boolean flag = false; // bandera

        for (Estudiante buscar : estudiante) {

            if (buscar.getDni().equals(txtConsulta.getText())) {

                try {
                    Date fecha = new SimpleDateFormat("dd-MM-yyyy").parse(buscar.getNacimiento());
                    jCalendar.setDate(fecha);
                } catch (ParseException e) {
                    System.out.println(e);
                }

                txtDNI.setText(buscar.getDni());
                txtDNI.setEditable(false);
                txtNombres.setText(buscar.getNombre());
                txtApellidos.setText(buscar.getApellido());
                //jCalendar.setCalendar(null);
                txtCelular.setText(buscar.getCelular());
                cbxGenero.setSelectedItem(buscar.getGenero());
                cbxGenero.setEnabled(false);
                txtCentro.setText(buscar.getCentro());
                cbxFacultad.setSelectedItem(buscar.getFacultad());
                cbxFacultad.setEnabled(false);
                txtCorreo.setText(buscar.getCorreo());
                txtIngreso.setText(buscar.getIngreso());
                txtSituacion.setText(buscar.getSituacion());
                txtPromedio.setText(String.valueOf(buscar.getPromedio()));

                flag = true;

            }
        }

        // lanza el aviso
        if (!flag) {
            JOptionPane.showMessageDialog(null, "Estudiante no encontrado", "Error", JOptionPane.WARNING_MESSAGE);
            limpiarEstudiantes();
        }
    }//GEN-LAST:event_btnConsultarMouseClicked

    /* Método para seleccionar un estudiante para eliminarlo */
    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked

        ArrayList<Estudiante> estudiante = cargarEstudiantes();

        for (int i = 0; i < estudiante.size(); i++) {
            if (txtDNI.getText().equals(estudiante.get(i).getDni())) {

                // captura la confirmacion y evaluamos
                if (JOptionPane.showConfirmDialog(null, "Desea eliminar a " + estudiante.get(i).getNombre() + " " + estudiante.get(i).getApellido() + " ?", "IMPORTANTE", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    estudiante.remove(i);
                    agregarEstudiante(estudiante);
                    JOptionPane.showMessageDialog(null, "Estudiante eliminado");
                }
            }
        }

        limpiarEstudiantes();
        mostrarDatos();

    }//GEN-LAST:event_btnEliminarMouseClicked

    /* Método para seleccionar un estudiante para editarlo */
    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked

        ArrayList<Estudiante> lista = cargarEstudiantes();

        for (int i = 0; i < lista.size(); i++) {
            if (txtDNI.getText().equals(lista.get(i).getDni())) {
                // captura de los datos del estudiante para editarlo
                lista.get(i).setNombre(txtNombres.getText());
                lista.get(i).setApellido(txtApellidos.getText());
                lista.get(i).setCelular(txtCelular.getText());
                lista.get(i).setCentro(txtCentro.getText());
                lista.get(i).setCorreo(txtCorreo.getText());
            }
        }

        agregarEstudiante(lista);
        limpiarEstudiantes();
        mostrarDatos();

    }//GEN-LAST:event_btnEditarMouseClicked

    /* Método para agregar un estudiante */
    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked

        if (validar()) {

            ArrayList<Estudiante> estudiante = cargarEstudiantes();

            // captura la fecha y le da formato correcto Dia,mes,año
            int año = jCalendar.getCalendar().get(Calendar.YEAR);
            int mes = jCalendar.getCalendar().get(Calendar.MARCH);
            int dia = jCalendar.getCalendar().get(Calendar.DAY_OF_MONTH);

            nacimiento = (dia + "-" + mes + "-" + año);

            estudiante.add(new Estudiante(txtCentro.getText(), getCbxFacultad(), txtCorreo.getText(), String.valueOf(YearMonth.now().getYear()), "No matriculado", 0, txtDNI.getText(), txtNombres.getText(), txtApellidos.getText(), nacimiento, txtCelular.getText(), getCbxGenero()));
            agregarEstudiante(estudiante);
            JOptionPane.showMessageDialog(null, "Usuario agregado");

        }

        limpiarEstudiantes();
        mostrarDatos();

    }//GEN-LAST:event_btnAgregarMouseClicked

    /* Método para seleccionar un estudiante para consultarlo desde la tabla*/
    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked

        int seleccion = jTable.getSelectedRow();

        ArrayList<Estudiante> estudiante = cargarEstudiantes();

        for (Estudiante buscar : estudiante) {

            if (buscar.getDni().equals(jTable.getValueAt(seleccion, 0).toString())) {

                try {
                    Date fecha = new SimpleDateFormat("dd-MM-yyyy").parse(buscar.getNacimiento());
                    jCalendar.setDate(fecha);
                } catch (ParseException e) {
                    System.out.println(e);
                }

                txtDNI.setText(buscar.getDni());
                txtDNI.setEditable(false);
                txtNombres.setText(buscar.getNombre());
                txtApellidos.setText(buscar.getApellido());
                //jCalendar.setCalendar(null);
                txtCelular.setText(buscar.getCelular());
                cbxGenero.setSelectedItem(buscar.getGenero());
                cbxGenero.setEnabled(false);
                txtCentro.setText(buscar.getCentro());
                cbxFacultad.setSelectedItem(buscar.getFacultad());
                cbxFacultad.setEnabled(false);
                txtCorreo.setText(buscar.getCorreo());
                txtIngreso.setText(buscar.getIngreso());
                txtSituacion.setText(buscar.getSituacion());
                txtPromedio.setText(String.valueOf(buscar.getPromedio()));

            }
        }

    }//GEN-LAST:event_jTableMouseClicked

    /* Llamada a metodo de limpieza de campos estudiantes*/
    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
        limpiarEstudiantes();
    }//GEN-LAST:event_btnLimpiarMouseClicked

    private float sacarPromedio(String id) {
        ArrayList<Matricula> matricula = cargarMatriculas();

        float promedios = 0;
        float total = 0;

        for (int i = 0; i < matricula.size(); i++) {
            if (id.equals(matricula.get(i).getIDestudiante())) {
                ArrayList<Curso> cursos = matricula.get(i).getCursos();
                try {
                    for (int j = 0; j < matricula.get(i).getNroCursos(); j++) {
                        Curso c = cursos.get(j);
                        promedios += c.getNota();
                    }
                    total = matricula.get(i).getNroCursos();
                } catch (Exception e) {
                }

            }
        }

        return promedios / total;
    }

    /**
     * Matricula
     * --------------------------------------------------------------------------------------------------------------------------------------
     */
    /*  Método para limpiar los campos matricula */
    private void limpiarMatriculas() {
        txtBuscarEstudiante.setText("");
        txtMatricula.setText("");
        txtIDMatricula.setText("");
        txtIDMatricula.setEditable(true);
        txtNombresMatricula.setText("-");
        txtApellidosMatricula.setText("-");
        cbxSemestre.setSelectedItem(null);
        cbxSemestre.setEnabled(true);
        cbxCursos.setSelectedItem(null);
        cbxCursos.setEnabled(true);
        txtFacultadMatricula.setText("-");
        txtSituacionMatricula.setText("-");
        txtNCursos.setText("-");
        txtSalon.setText("");
        Modelo.clear();

    }

    /*  Método para mostrar los datos almacenados en matricula*/
    public void mostrarDatosMatricula() {

        ArrayList<Estudiante> estudiantes = cargarEstudiantes();
        if (estudiantes != null) {
            String matriz[][] = new String[estudiantes.size()][8];

            for (int i = 0; i < estudiantes.size(); i++) {

                matriz[i][0] = estudiantes.get(i).getDni();
                matriz[i][1] = estudiantes.get(i).getNombre();
                matriz[i][2] = estudiantes.get(i).getApellido();
                matriz[i][3] = estudiantes.get(i).getNacimiento();
                matriz[i][4] = estudiantes.get(i).getCelular();
                matriz[i][5] = estudiantes.get(i).getGenero();
                matriz[i][6] = estudiantes.get(i).getFacultad();
                matriz[i][7] = estudiantes.get(i).getSituacion();

            }

            jTableMatricula.setModel(new javax.swing.table.DefaultTableModel(matriz, new String[]{"DNI", "Nombres", "Apellidos", "Nacimiento", "Celular", "Genero", "Facultad", "Situación"}));
        }
    }

    /* Método para agregar una matricula */
    private void btnAgregarMatriculaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMatriculaMouseClicked

        if (!txtSituacionMatricula.getText().equals("Matriculado")) {
            if (!txtIDMatricula.getText().equals("")) {

                ArrayList<Curso> cursos = new ArrayList<Curso>();
                try {
                    for (int j = 0; j < Modelo.getSize(); j++) {
                        Curso c = new Curso((String) jListCursos.getModel().getElementAt(j), 0);
                        cursos.add(c);
                    }
                } catch (Exception e) {
                }

                ArrayList<Matricula> matricula = cargarMatriculas();

                matricula.add(new Matricula(txtIDMatricula.getText(), IDmatriculado, getCbxSemestre(), txtSalon.getText(), cursos, Modelo.getSize()));
                agregarMatricula(matricula);

                ArrayList<Estudiante> lista = cargarEstudiantes();

                for (int i = 0; i < lista.size(); i++) {
                    if (IDmatriculado.equals(lista.get(i).getDni())) {
                        lista.get(i).setPromedio(0);

                        lista.get(i).setSituacion("Matriculado");
                    }
                }
                agregarEstudiante(lista);

                JOptionPane.showMessageDialog(null, "Matrícula Realizada");
            } else {
                JOptionPane.showMessageDialog(null, "Rellene los campos necesarios");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ya existe matricula");
        }

        limpiarMatriculas();
        mostrarDatosMatricula();
    }//GEN-LAST:event_btnAgregarMatriculaMouseClicked

    /* Método para seleccionar una matricula para eliminarlo */
    private void btnEliminarMatriculaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMatriculaMouseClicked
        ArrayList<Matricula> matricula = cargarMatriculas();

        for (int i = 0; i < matricula.size(); i++) {
            if (txtIDMatricula.getText().equals(matricula.get(i).getIDmatricula())) {

                // captura la confirmacion y evaluamos
                if (JOptionPane.showConfirmDialog(null, "Desea eliminar la matricula " + matricula.get(i).getIDmatricula() + " ?", "IMPORTANTE", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

                    ArrayList<Estudiante> lista = cargarEstudiantes();

                    for (int k = 0; k < lista.size(); k++) {
                        if (matricula.get(i).getIDestudiante().equals(lista.get(k).getDni())) {

                            lista.get(k).setPromedio(0);
                            lista.get(k).setSituacion("No matriculado");
                        }
                    }
                    agregarEstudiante(lista);

                    matricula.remove(i);
                    agregarMatricula(matricula);
                    JOptionPane.showMessageDialog(null, "Matricula eliminada");
                }
            }
        }

        limpiarMatriculas();
        mostrarDatosMatricula();
    }//GEN-LAST:event_btnEliminarMatriculaMouseClicked

    /* Llamada a metodo de limpieza de campos matricula*/
    private void btnMatriculaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMatriculaMouseClicked
        limpiarMatriculas();
    }//GEN-LAST:event_btnMatriculaMouseClicked

    /* Método para seleccionar un estudiante para consultarlo desde la tabla matricula*/
    private void jTableMatriculaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMatriculaMouseClicked

        limpiarMatriculas();

        int seleccion = jTableMatricula.getSelectedRow();

        ArrayList<Estudiante> estudiante = cargarEstudiantes();

        for (Estudiante buscar : estudiante) {

            if (buscar.getDni().equals(jTableMatricula.getValueAt(seleccion, 0).toString())) {

                IDmatriculado = buscar.getDni();
                txtNombresMatricula.setText(buscar.getNombre());
                txtApellidosMatricula.setText(buscar.getApellido());
                txtFacultadMatricula.setText(buscar.getFacultad());
                txtSituacionMatricula.setText(buscar.getSituacion());

                ArrayList<Matricula> matricula = cargarMatriculas();

                for (Matricula buscarE : matricula) {

                    if (buscarE.getIDestudiante().equals(IDmatriculado)) {

                        txtIDMatricula.setText(buscarE.getIDmatricula());
                        cbxSemestre.setSelectedItem(buscarE.getSemestre());
                        txtSalon.setText(buscarE.getSalon());
                        txtNCursos.setText(String.valueOf(buscarE.getNroCursos()));

                        ArrayList<Curso> cursos = buscarE.getCursos();
                        try {
                            for (int j = 0; j < buscarE.getNroCursos(); j++) {
                                Curso c = cursos.get(j);
                                Modelo.addElement(c.getNombreCurso());
                            }
                        } catch (Exception e) {
                        }

                    }
                }

            }
        }
    }//GEN-LAST:event_jTableMatriculaMouseClicked

    /* Método para seleccionar un estudiante para consultarlo desde el campo de consulta matricula*/
    private void btnBuscarEstudianteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarEstudianteMouseClicked

        ArrayList<Estudiante> estudiante = cargarEstudiantes();
        boolean flag = false; // bandera

        for (Estudiante buscar : estudiante) {

            if (buscar.getDni().equals(txtBuscarEstudiante.getText())) {

                limpiarMatriculas();

                txtBuscarEstudiante.setText(buscar.getDni());
                IDmatriculado = buscar.getDni();
                txtNombresMatricula.setText(buscar.getNombre());
                txtApellidosMatricula.setText(buscar.getApellido());
                txtFacultadMatricula.setText(buscar.getFacultad());
                txtSituacionMatricula.setText(buscar.getSituacion());

                flag = true;

                ArrayList<Matricula> matricula = cargarMatriculas();

                for (Matricula buscarE : matricula) {

                    if (buscarE.getIDestudiante().equals(IDmatriculado)) {

                        txtIDMatricula.setText(buscarE.getIDmatricula());
                        cbxSemestre.setSelectedItem(buscarE.getSemestre());
                        txtSalon.setText(buscarE.getSalon());
                        txtNCursos.setText(String.valueOf(buscarE.getNroCursos()));

                        ArrayList<Curso> cursos = buscarE.getCursos();
                        try {
                            for (int j = 0; j < buscarE.getNroCursos(); j++) {
                                Curso c = cursos.get(j);
                                Modelo.addElement(c.getNombreCurso());
                            }
                        } catch (Exception e) {
                        }

                    }
                }

            }
        }

        // lanza el aviso
        if (!flag) {
            JOptionPane.showMessageDialog(null, "Estudiante no encontrado", "Error", JOptionPane.WARNING_MESSAGE);
            limpiarMatriculas();
        }
    }//GEN-LAST:event_btnBuscarEstudianteMouseClicked

    /* Método para seleccionar una matricula para consultarlo desde el campo de consulta*/
    private void btnConsultarMatriculaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarMatriculaMouseClicked

        ArrayList<Matricula> matricula = cargarMatriculas();
        boolean flag = false; // bandera

        for (Matricula buscar : matricula) {

            if (buscar.getIDmatricula().equals(txtMatricula.getText())) {

                limpiarMatriculas();

                txtMatricula.setText(buscar.getIDmatricula());
                txtIDMatricula.setText(buscar.getIDmatricula());
                cbxSemestre.setSelectedItem(buscar.getSemestre());
                txtSalon.setText(buscar.getSalon());
                txtNCursos.setText(String.valueOf(buscar.getNroCursos()));

                ArrayList<Curso> cursos = buscar.getCursos();
                try {
                    for (int j = 0; j < buscar.getNroCursos(); j++) {
                        Curso c = cursos.get(j);
                        Modelo.addElement(c.getNombreCurso());
                    }
                } catch (Exception e) {
                }

                flag = true;

                ArrayList<Estudiante> estudiante = cargarEstudiantes();

                for (Estudiante buscarE : estudiante) {

                    if (buscarE.getDni().equals(buscar.getIDestudiante())) {

                        txtNombresMatricula.setText(buscarE.getNombre());
                        txtApellidosMatricula.setText(buscarE.getApellido());
                        txtFacultadMatricula.setText(buscarE.getFacultad());
                        txtSituacionMatricula.setText(buscarE.getSituacion());

                    }
                }

            }
        }

        // lanza el aviso
        if (!flag) {
            JOptionPane.showMessageDialog(null, "Matrícula no encontrada", "Error", JOptionPane.WARNING_MESSAGE);
            limpiarEstudiantes();
        }
    }//GEN-LAST:event_btnConsultarMatriculaMouseClicked

    /* Métodos para agregar y quitar cursos en matricula*/
    private void cbxCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCursosActionPerformed

        Modelo.addElement(getCbxCursos());
        txtNCursos.setText(String.valueOf(Modelo.getSize()));

    }//GEN-LAST:event_cbxCursosActionPerformed

    /**
     * Calificaciones
     * --------------------------------------------------------------------------------------------------------------------------------------
     */
    private void limpiarCalificaiones() {
        txtCursosCalificaciones.setText("");
        txtSemestreCalificaciones.setText("");
        txtNombresCalificaciones.setText("");
        txtApellidosCalificaciones.setText("");
        txtFacultadCalificaciones.setText("");
        txtpromedioCalificaciones.setText("");

        DefaultTableModel tb = (DefaultTableModel) jTableNotas.getModel();
        int a = jTableNotas.getRowCount() - 1;
        for (int i = a; i >= 0; i--) {
            tb.removeRow(tb.getRowCount() - 1);
        }

    }

    /*  Método para mostrar los datos almacenados en matricula*/
    public void mostrarDatosCalificaciones() {

        ArrayList<Matricula> matriculas = cargarMatriculas();
        if (matriculas != null) {
            String matriz[][] = new String[matriculas.size()][5];

            for (int i = 0; i < matriculas.size(); i++) {

                matriz[i][0] = matriculas.get(i).getIDmatricula();
                matriz[i][1] = matriculas.get(i).getIDestudiante();
                matriz[i][2] = matriculas.get(i).getSemestre();
                matriz[i][3] = matriculas.get(i).getSalon();
                matriz[i][4] = String.valueOf(matriculas.get(i).getNroCursos());

            }

            jTableCalificaciones.setModel(new javax.swing.table.DefaultTableModel(matriz, new String[]{"ID Matricula", "DNI", "Semestre", "Salon", "Cursos"}));
        }
    }

    private void btnAgregarCalificacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarCalificacionesMouseClicked

        ArrayList<Matricula> lista = cargarMatriculas();

        for (int i = 0; i < lista.size(); i++) {
            if (IDcalificacion.equals(lista.get(i).getIDestudiante())) {

                ArrayList<Curso> cursos = lista.get(i).getCursos();
                try {
                    for (int j = 0; j < lista.get(i).getNroCursos(); j++) {
                        Curso c = cursos.get(j);
                        System.out.println(jTableNotas.getValueAt(j, 1));
                        c.setNota(Integer.valueOf(String.valueOf(jTableNotas.getValueAt(j, 1))));

                    }

                    JOptionPane.showMessageDialog(null, "Calificaciones Subidas");
                } catch (Exception e) {
                }
            }
        }

        agregarMatricula(lista);

        ArrayList<Estudiante> listaE = cargarEstudiantes();

        for (int m = 0; m < listaE.size(); m++) {
            if (IDcalificacion.equals(listaE.get(m).getDni())) {
                listaE.get(m).setPromedio(sacarPromedio(IDcalificacion));
            }
        }
        agregarEstudiante(listaE);

        limpiarCalificaiones();
        mostrarDatosCalificaciones();

    }//GEN-LAST:event_btnAgregarCalificacionesMouseClicked

    private void btnLimpiarCalificacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarCalificacionesMouseClicked
        limpiarCalificaiones();
    }//GEN-LAST:event_btnLimpiarCalificacionesMouseClicked

    private void jTableCalificacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCalificacionesMouseClicked

        limpiarCalificaiones();

        int seleccion = jTableCalificaciones.getSelectedRow();

        ArrayList<Matricula> matricula = cargarMatriculas();

        for (Matricula buscar : matricula) {

            if (buscar.getIDmatricula().equals(jTableCalificaciones.getValueAt(seleccion, 0).toString())) {

                txtCursosCalificaciones.setText(String.valueOf(buscar.getNroCursos()));
                txtSemestreCalificaciones.setText(buscar.getSemestre());

                ArrayList<Estudiante> estudiante = cargarEstudiantes();

                for (Estudiante buscarE : estudiante) {

                    if (buscarE.getDni().equals(buscar.getIDestudiante())) {

                        IDcalificacion = buscarE.getDni();
                        txtNombresCalificaciones.setText(buscarE.getNombre());
                        txtApellidosCalificaciones.setText(buscarE.getApellido());
                        txtFacultadCalificaciones.setText(buscarE.getFacultad());
                        txtpromedioCalificaciones.setText(String.valueOf(buscarE.getPromedio()));

                        ArrayList<Curso> cursos = buscar.getCursos();
                        String matrizC[][] = new String[cursos.size()][2];

                        try {
                                                       
                            for (int j = 0; j < buscar.getNroCursos(); j++) {
                                Curso c = cursos.get(j);
                                
                                matrizC[j][0] = c.getNombreCurso();
                                matrizC[j][1] = String.valueOf(c.getNota());
                                
                            }
                        } catch (Exception e) {
                            System.out.println(e);
                        }

                        jTableNotas.setModel(new javax.swing.table.DefaultTableModel(matrizC, new String[]{"Curso", "Nota"}));

                    }
                }

            }
        }
    }//GEN-LAST:event_jTableCalificacionesMouseClicked

    private void jListCursosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListCursosMouseClicked
        try {
            Modelo.remove(jListCursos.locationToIndex(evt.getPoint()));
            txtNCursos.setText(String.valueOf(Modelo.getSize()));
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jListCursosMouseClicked

    /* Método auxiliares para los combo box*/
    public String getCbxGenero() {
        return cbxGenero.getSelectedItem() != null ? cbxGenero.getSelectedItem().toString() : "";   // para que no salte error al capturar el combo box
    }

    public String getCbxFacultad() {
        return cbxFacultad.getSelectedItem() != null ? cbxFacultad.getSelectedItem().toString() : "";
    }

    public String getCbxSemestre() {
        return cbxSemestre.getSelectedItem() != null ? cbxSemestre.getSelectedItem().toString() : "";
    }

    public String getCbxCursos() {
        return cbxCursos.getSelectedItem() != null ? cbxCursos.getSelectedItem().toString() : "";
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgConfiguracion;
    private javax.swing.JPanel bgDatos;
    private javax.swing.JPanel bgDatos1;
    private javax.swing.JPanel bgDatos2;
    private javax.swing.JPanel bgDatos3;
    private javax.swing.JPanel bgDatos6;
    private javax.swing.JPanel bgDatos7;
    private javax.swing.JPanel bgEscritorio;
    private javax.swing.JPanel bgFondo;
    private javax.swing.JPanel bgFondo1;
    private javax.swing.JPanel bgFondo3;
    private javax.swing.JPanel bgLineaConfig;
    private javax.swing.JPanel bgLineaSide;
    private javax.swing.JPanel bgMenu;
    private javax.swing.JPanel bgMenuIconos;
    private javax.swing.JPanel bgMenuOculto;
    private javax.swing.JPanel bgRegistrados;
    private javax.swing.JPanel bgRegistrados1;
    private javax.swing.JPanel bgRegistrados3;
    private javax.swing.JPanel bgRegistrados4;
    private javax.swing.JPanel bgSalir;
    private javax.swing.JPanel bgSidebar;
    private javax.swing.JPanel bgTop;
    private javax.swing.JPanel bgTop1;
    private javax.swing.JPanel bgTop2;
    private javax.swing.JPanel bgTop3;
    private javax.swing.JPanel bgTop6;
    private javax.swing.JPanel bgTop7;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAgregarCalificaciones;
    private javax.swing.JButton btnAgregarMatricula;
    private javax.swing.JButton btnBuscarEstudiante;
    private javax.swing.JLabel btnConfiguracion;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnConsultarMatricula;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminarMatricula;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnLimpiarCalificaciones;
    private javax.swing.JButton btnMatricula;
    private javax.swing.JLabel btnSalir;
    private javax.swing.JLabel btnSidebar;
    private javax.swing.JLabel calificacionesLabel;
    private javax.swing.JPanel calificacionesPanel;
    private javax.swing.JComboBox<String> cbxConsultar;
    private javax.swing.JComboBox<String> cbxCursos;
    private javax.swing.JComboBox<String> cbxFacultad;
    private javax.swing.JComboBox<String> cbxGenero;
    private javax.swing.JComboBox<String> cbxSemestre;
    private javax.swing.JLabel estudianteLabel;
    private javax.swing.JPanel estudiantePanel;
    private com.toedter.calendar.JDateChooser jCalendar;
    private javax.swing.JList<String> jListCursos;
    private DefaultListModel Modelo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable;
    private javax.swing.JTable jTableCalificaciones;
    private javax.swing.JTable jTableMatricula;
    private javax.swing.JTable jTableNotas;
    private javax.swing.JLabel lbApellidos;
    private javax.swing.JLabel lbApellidos1;
    private javax.swing.JLabel lbApellidos3;
    private javax.swing.JLabel lbBuscarEstudiante;
    private javax.swing.JLabel lbCelular;
    private javax.swing.JLabel lbCentro;
    private javax.swing.JLabel lbConsultar;
    private javax.swing.JLabel lbCorreo;
    private javax.swing.JLabel lbCursos;
    private javax.swing.JLabel lbCursosCalificaciones;
    private javax.swing.JLabel lbDNI;
    private javax.swing.JLabel lbFacultad;
    private javax.swing.JLabel lbFacultadCalificaciones;
    private javax.swing.JLabel lbFacultadMatricula;
    private javax.swing.JLabel lbGenero;
    private javax.swing.JLabel lbIDMatricula;
    private javax.swing.JLabel lbIngreso;
    private javax.swing.JLabel lbMatricula;
    private javax.swing.JLabel lbNacimiento;
    private javax.swing.JLabel lbNcursos;
    private javax.swing.JLabel lbNombres;
    private javax.swing.JLabel lbNombres1;
    private javax.swing.JLabel lbNombres3;
    private javax.swing.JLabel lbPromedio;
    private javax.swing.JLabel lbPromedioCalificaciones;
    private javax.swing.JLabel lbSalon;
    private javax.swing.JLabel lbSemestre;
    private javax.swing.JLabel lbSemestreCalificaciones;
    private javax.swing.JLabel lbSituacion;
    private javax.swing.JLabel lbSituacionMatricula;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbTitulo1;
    private javax.swing.JLabel lbTitulo3;
    private javax.swing.JLabel matriculaLabel;
    private javax.swing.JPanel matriculaPanel;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtApellidosCalificaciones;
    private javax.swing.JTextField txtApellidosMatricula;
    private javax.swing.JTextField txtBuscarEstudiante;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCentro;
    private javax.swing.JTextField txtConsulta;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtCursosCalificaciones;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtFacultadCalificaciones;
    private javax.swing.JTextField txtFacultadMatricula;
    private javax.swing.JTextField txtIDMatricula;
    private javax.swing.JTextField txtIngreso;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNCursos;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtNombresCalificaciones;
    private javax.swing.JTextField txtNombresMatricula;
    private javax.swing.JTextField txtPromedio;
    private javax.swing.JTextField txtSalon;
    private javax.swing.JTextField txtSemestreCalificaciones;
    private javax.swing.JTextField txtSituacion;
    private javax.swing.JTextField txtSituacionMatricula;
    private javax.swing.JTextField txtpromedioCalificaciones;
    // End of variables declaration//GEN-END:variables
}
