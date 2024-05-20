package aplicacion;

import general.Conexion;
import jaco.mp3.player.MP3Player;

import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.Line;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Mixer;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import org.jaudiotagger.audio.AudioFileIO;
import org.jaudiotagger.audio.exceptions.CannotReadException;
import org.jaudiotagger.audio.exceptions.InvalidAudioFrameException;
import org.jaudiotagger.audio.exceptions.ReadOnlyFileException;
import org.jaudiotagger.audio.mp3.MP3AudioHeader;
import org.jaudiotagger.audio.mp3.MP3File;
import org.jaudiotagger.tag.TagException;

public class Panel extends javax.swing.JFrame {

    //Creamos el objeto Conexion
    Conexion co = new Conexion();

    /**
     * Crear nuevo panel de formulario
     */
    int xMouse, yMouse; // variables para el header
    String rutaPortada, rutaAudio;
    int editID;
    boolean repeat = false;

    public Panel() throws SQLException {
        initComponents();

        jScrollCentral.getViewport().setBackground(new Color(24, 23, 23));
        actualizar();
    }

    /**
     * Este método se llama desde el constructor para inicializar el formulario.
     * ADVERTENCIA: NO modifique este código. El contenido de este método es
     * siempre regenerado por el Editor de formularios.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Fondo = new javax.swing.JPanel();
        Barra = new javax.swing.JPanel();
        jSeparatorB = new javax.swing.JSeparator();
        fdBarra = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        btnSalir = new javax.swing.JPanel();
        lbExit = new javax.swing.JLabel();
        btnVerPlaylist = new javax.swing.JButton();
        jScrollLateral = new javax.swing.JScrollPane();
        ModeloLateral = new DefaultListModel();
        listaLateral = new javax.swing.JList<>();
        Menu = new javax.swing.JPanel();
        btnBiblioteca = new javax.swing.JButton();
        lblBiblioteca = new javax.swing.JLabel();
        btnPlaylist = new javax.swing.JButton();
        lblPlaylist = new javax.swing.JLabel();
        btnReproductor = new javax.swing.JButton();
        lblReproductor = new javax.swing.JLabel();
        btnInformacion = new javax.swing.JButton();
        Escritorio = new javax.swing.JPanel();
        pnlBiblioteca = new javax.swing.JPanel();
        pnlGenero = new javax.swing.JPanel();
        txtGenero = new javax.swing.JTextField();
        jSeparatorB1 = new javax.swing.JSeparator();
        btnCrearGenero = new javax.swing.JButton();
        btnBuscarGenero = new javax.swing.JButton();
        btnEliminarGenero = new javax.swing.JButton();
        pnlArtista = new javax.swing.JPanel();
        txtArtista = new javax.swing.JTextField();
        btnCrearArtista = new javax.swing.JButton();
        jSeparatorB2 = new javax.swing.JSeparator();
        btnBuscarArtista = new javax.swing.JButton();
        btnEliminarArtista = new javax.swing.JButton();
        pnlAlbum = new javax.swing.JPanel();
        txtNombreAlbum = new javax.swing.JTextField();
        btnCrearAlbum = new javax.swing.JButton();
        jSeparatorB3 = new javax.swing.JSeparator();
        txtAñoAlbum = new javax.swing.JTextField();
        jSeparatorB4 = new javax.swing.JSeparator();
        pnlSubirPortada = new javax.swing.JPanel();
        lbSubirPortada = new javax.swing.JLabel();
        txtPortada = new javax.swing.JLabel();
        btnBuscarAlbum = new javax.swing.JButton();
        btnEliminarAlbum = new javax.swing.JButton();
        pnlMusica = new javax.swing.JPanel();
        txtNombreMusica = new javax.swing.JTextField();
        cbxAlbum = new javax.swing.JComboBox<>();
        jSeparatorB5 = new javax.swing.JSeparator();
        btnCrearMusica = new javax.swing.JButton();
        cbxArtista = new javax.swing.JComboBox<>();
        cbxGenero = new javax.swing.JComboBox<>();
        pnlSubirCancion = new javax.swing.JPanel();
        lbSubirCancion = new javax.swing.JLabel();
        txtCancion = new javax.swing.JLabel();
        btnBuscarMusica = new javax.swing.JButton();
        btnEliminarMusica = new javax.swing.JButton();
        pnlPlaylist = new javax.swing.JPanel();
        fdPlaylist = new javax.swing.JLabel();
        jSeparatorP = new javax.swing.JSeparator();
        btnAgregarMusicaPlaylist = new javax.swing.JButton();
        btnEditarPlaylist = new javax.swing.JButton();
        btnEliminarPlaylist = new javax.swing.JButton();
        jScrollCentral = new javax.swing.JScrollPane();
        tblCanciones = new javax.swing.JTable();
        pnlReproductor = new javax.swing.JPanel();
        jSeparatorR = new javax.swing.JSeparator();
        jLabelReproduccion = new javax.swing.JLabel();
        jPanelBotones = new javax.swing.JPanel();
        btnPause = new javax.swing.JLabel();
        btnRepeat = new javax.swing.JLabel();
        btnCancel = new javax.swing.JLabel();
        btnVolumeDown = new javax.swing.JLabel();
        btnVolumeUp = new javax.swing.JLabel();
        btnList = new javax.swing.JLabel();
        btnPlay = new javax.swing.JLabel();
        fdReproductor = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Fondo.setBackground(new java.awt.Color(24, 23, 23));
        Fondo.setMinimumSize(new java.awt.Dimension(0, 0));
        Fondo.setPreferredSize(new java.awt.Dimension(1035, 609));

        Barra.setBackground(new java.awt.Color(18, 31, 35));

        fdBarra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/music.png"))); // NOI18N

        header.setBackground(new java.awt.Color(18, 31, 35));
        header.setPreferredSize(new java.awt.Dimension(24, 26));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(18, 31, 35));
        btnSalir.setPreferredSize(new java.awt.Dimension(22, 22));
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalirMouseExited(evt);
            }
        });

        lbExit.setFont(new java.awt.Font("MS UI Gothic", 1, 14)); // NOI18N
        lbExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/close.png"))); // NOI18N

        javax.swing.GroupLayout btnSalirLayout = new javax.swing.GroupLayout(btnSalir);
        btnSalir.setLayout(btnSalirLayout);
        btnSalirLayout.setHorizontalGroup(
            btnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbExit, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
        );
        btnSalirLayout.setVerticalGroup(
            btnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbExit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addGap(0, 4, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnVerPlaylist.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        btnVerPlaylist.setForeground(new java.awt.Color(44, 62, 80));
        btnVerPlaylist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/view.png"))); // NOI18N
        btnVerPlaylist.setText("Ver playlist");
        btnVerPlaylist.setContentAreaFilled(false);
        btnVerPlaylist.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVerPlaylist.setFocusable(false);
        btnVerPlaylist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVerPlaylistMouseClicked(evt);
            }
        });

        listaLateral.setModel(ModeloLateral);
        listaLateral.setBackground(new java.awt.Color(18, 31, 35));
        listaLateral.setForeground(new java.awt.Color(255, 255, 255));
        listaLateral.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Mi playlist" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaLateral.setToolTipText("");
        jScrollLateral.setViewportView(listaLateral);

        javax.swing.GroupLayout BarraLayout = new javax.swing.GroupLayout(Barra);
        Barra.setLayout(BarraLayout);
        BarraLayout.setHorizontalGroup(
            BarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparatorB)
                .addContainerGap())
            .addGroup(BarraLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(fdBarra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(60, 60, 60))
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
            .addGroup(BarraLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnVerPlaylist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(28, 28, 28))
            .addGroup(BarraLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollLateral, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        BarraLayout.setVerticalGroup(
            BarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fdBarra)
                .addGap(18, 18, 18)
                .addComponent(btnVerPlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparatorB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollLateral, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                .addGap(51, 51, 51))
        );

        Menu.setBackground(new java.awt.Color(24, 23, 23));
        Menu.setPreferredSize(new java.awt.Dimension(24, 26));

        btnBiblioteca.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        btnBiblioteca.setForeground(new java.awt.Color(44, 62, 80));
        btnBiblioteca.setText("Biblioteca");
        btnBiblioteca.setContentAreaFilled(false);
        btnBiblioteca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBiblioteca.setFocusable(false);
        btnBiblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBibliotecaActionPerformed(evt);
            }
        });

        lblBiblioteca.setBackground(new java.awt.Color(0, 204, 106));
        lblBiblioteca.setOpaque(true);

        btnPlaylist.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        btnPlaylist.setForeground(new java.awt.Color(44, 62, 80));
        btnPlaylist.setText("Playlist");
        btnPlaylist.setContentAreaFilled(false);
        btnPlaylist.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPlaylist.setFocusable(false);
        btnPlaylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaylistActionPerformed(evt);
            }
        });

        lblPlaylist.setBackground(new java.awt.Color(24, 23, 23));
        lblPlaylist.setOpaque(true);

        btnReproductor.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        btnReproductor.setForeground(new java.awt.Color(44, 62, 80));
        btnReproductor.setText("Reproductor");
        btnReproductor.setContentAreaFilled(false);
        btnReproductor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReproductor.setFocusable(false);
        btnReproductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReproductorActionPerformed(evt);
            }
        });

        lblReproductor.setBackground(new java.awt.Color(24, 23, 23));
        lblReproductor.setOpaque(true);

        btnInformacion.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        btnInformacion.setForeground(new java.awt.Color(44, 62, 80));
        btnInformacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/information.png"))); // NOI18N
        btnInformacion.setContentAreaFilled(false);
        btnInformacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInformacion.setFocusable(false);

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblBiblioteca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBiblioteca, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnPlaylist, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblPlaylist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReproductor, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(lblReproductor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(364, 364, 364)
                .addComponent(btnInformacion)
                .addContainerGap())
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReproductor, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBiblioteca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblReproductor, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        Escritorio.setBackground(new java.awt.Color(24, 23, 23));
        Escritorio.setLayout(new java.awt.CardLayout());

        pnlBiblioteca.setBackground(new java.awt.Color(24, 23, 23));

        pnlGenero.setBackground(new java.awt.Color(24, 23, 23));
        pnlGenero.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(187, 187, 187), 1, true), "Genero", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        txtGenero.setBackground(new java.awt.Color(24, 23, 23));
        txtGenero.setForeground(new java.awt.Color(255, 251, 248));
        txtGenero.setText("Escriba un genero...");
        txtGenero.setBorder(null);
        txtGenero.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtGeneroFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtGeneroFocusLost(evt);
            }
        });

        btnCrearGenero.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        btnCrearGenero.setForeground(new java.awt.Color(44, 62, 80));
        btnCrearGenero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/save.png"))); // NOI18N
        btnCrearGenero.setContentAreaFilled(false);
        btnCrearGenero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCrearGenero.setFocusable(false);
        btnCrearGenero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCrearGeneroMouseClicked(evt);
            }
        });

        btnBuscarGenero.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        btnBuscarGenero.setForeground(new java.awt.Color(44, 62, 80));
        btnBuscarGenero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/search.png"))); // NOI18N
        btnBuscarGenero.setContentAreaFilled(false);
        btnBuscarGenero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarGenero.setFocusable(false);
        btnBuscarGenero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarGeneroMouseClicked(evt);
            }
        });

        btnEliminarGenero.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        btnEliminarGenero.setForeground(new java.awt.Color(44, 62, 80));
        btnEliminarGenero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/remove.png"))); // NOI18N
        btnEliminarGenero.setContentAreaFilled(false);
        btnEliminarGenero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarGenero.setFocusable(false);
        btnEliminarGenero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarGeneroMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlGeneroLayout = new javax.swing.GroupLayout(pnlGenero);
        pnlGenero.setLayout(pnlGeneroLayout);
        pnlGeneroLayout.setHorizontalGroup(
            pnlGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGeneroLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(pnlGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtGenero, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                    .addComponent(jSeparatorB1))
                .addGap(18, 18, 18)
                .addComponent(btnBuscarGenero)
                .addGap(187, 187, 187)
                .addComponent(btnEliminarGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCrearGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );
        pnlGeneroLayout.setVerticalGroup(
            pnlGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGeneroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscarGenero)
                    .addComponent(btnCrearGenero)
                    .addComponent(btnEliminarGenero)
                    .addGroup(pnlGeneroLayout.createSequentialGroup()
                        .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparatorB1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlArtista.setBackground(new java.awt.Color(24, 23, 23));
        pnlArtista.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(187, 187, 187), 1, true), "Artista", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        txtArtista.setBackground(new java.awt.Color(24, 23, 23));
        txtArtista.setForeground(new java.awt.Color(255, 251, 248));
        txtArtista.setText("Escriba un interprete...");
        txtArtista.setBorder(null);
        txtArtista.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtArtistaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtArtistaFocusLost(evt);
            }
        });

        btnCrearArtista.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        btnCrearArtista.setForeground(new java.awt.Color(44, 62, 80));
        btnCrearArtista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/save.png"))); // NOI18N
        btnCrearArtista.setContentAreaFilled(false);
        btnCrearArtista.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCrearArtista.setFocusable(false);
        btnCrearArtista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCrearArtistaMouseClicked(evt);
            }
        });

        btnBuscarArtista.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        btnBuscarArtista.setForeground(new java.awt.Color(44, 62, 80));
        btnBuscarArtista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/search.png"))); // NOI18N
        btnBuscarArtista.setContentAreaFilled(false);
        btnBuscarArtista.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarArtista.setFocusable(false);
        btnBuscarArtista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarArtistaMouseClicked(evt);
            }
        });

        btnEliminarArtista.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        btnEliminarArtista.setForeground(new java.awt.Color(44, 62, 80));
        btnEliminarArtista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/remove.png"))); // NOI18N
        btnEliminarArtista.setContentAreaFilled(false);
        btnEliminarArtista.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarArtista.setFocusable(false);
        btnEliminarArtista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarArtistaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlArtistaLayout = new javax.swing.GroupLayout(pnlArtista);
        pnlArtista.setLayout(pnlArtistaLayout);
        pnlArtistaLayout.setHorizontalGroup(
            pnlArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlArtistaLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(pnlArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparatorB2, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(txtArtista))
                .addGap(18, 18, 18)
                .addComponent(btnBuscarArtista)
                .addGap(191, 191, 191)
                .addComponent(btnEliminarArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCrearArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );
        pnlArtistaLayout.setVerticalGroup(
            pnlArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlArtistaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparatorB2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlArtistaLayout.createSequentialGroup()
                .addGroup(pnlArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscarArtista)
                    .addComponent(btnEliminarArtista)
                    .addComponent(btnCrearArtista))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnlAlbum.setBackground(new java.awt.Color(24, 23, 23));
        pnlAlbum.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(187, 187, 187), 1, true), "Album", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        txtNombreAlbum.setBackground(new java.awt.Color(24, 23, 23));
        txtNombreAlbum.setForeground(new java.awt.Color(255, 251, 248));
        txtNombreAlbum.setText("Escriba un nombre...");
        txtNombreAlbum.setBorder(null);
        txtNombreAlbum.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombreAlbumFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreAlbumFocusLost(evt);
            }
        });

        btnCrearAlbum.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        btnCrearAlbum.setForeground(new java.awt.Color(44, 62, 80));
        btnCrearAlbum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/save.png"))); // NOI18N
        btnCrearAlbum.setContentAreaFilled(false);
        btnCrearAlbum.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCrearAlbum.setFocusable(false);
        btnCrearAlbum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCrearAlbumMouseClicked(evt);
            }
        });

        txtAñoAlbum.setBackground(new java.awt.Color(24, 23, 23));
        txtAñoAlbum.setForeground(new java.awt.Color(255, 251, 248));
        txtAñoAlbum.setText("Escriba el año...");
        txtAñoAlbum.setBorder(null);
        txtAñoAlbum.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAñoAlbumFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAñoAlbumFocusLost(evt);
            }
        });
        txtAñoAlbum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAñoAlbumKeyTyped(evt);
            }
        });

        pnlSubirPortada.setBackground(new java.awt.Color(24, 23, 23));
        pnlSubirPortada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlSubirPortadaMouseClicked(evt);
            }
        });

        lbSubirPortada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/noalbum.png"))); // NOI18N

        txtPortada.setBackground(new java.awt.Color(24, 23, 23));
        txtPortada.setForeground(new java.awt.Color(255, 255, 255));
        txtPortada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPortada.setText("Portada");

        javax.swing.GroupLayout pnlSubirPortadaLayout = new javax.swing.GroupLayout(pnlSubirPortada);
        pnlSubirPortada.setLayout(pnlSubirPortadaLayout);
        pnlSubirPortadaLayout.setHorizontalGroup(
            pnlSubirPortadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSubirPortadaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtPortada, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbSubirPortada)
                .addContainerGap())
        );
        pnlSubirPortadaLayout.setVerticalGroup(
            pnlSubirPortadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSubirPortadaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSubirPortadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPortada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbSubirPortada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnBuscarAlbum.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        btnBuscarAlbum.setForeground(new java.awt.Color(44, 62, 80));
        btnBuscarAlbum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/search.png"))); // NOI18N
        btnBuscarAlbum.setContentAreaFilled(false);
        btnBuscarAlbum.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarAlbum.setFocusable(false);
        btnBuscarAlbum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarAlbumMouseClicked(evt);
            }
        });

        btnEliminarAlbum.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        btnEliminarAlbum.setForeground(new java.awt.Color(44, 62, 80));
        btnEliminarAlbum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/remove.png"))); // NOI18N
        btnEliminarAlbum.setContentAreaFilled(false);
        btnEliminarAlbum.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarAlbum.setFocusable(false);
        btnEliminarAlbum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarAlbumMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlAlbumLayout = new javax.swing.GroupLayout(pnlAlbum);
        pnlAlbum.setLayout(pnlAlbumLayout);
        pnlAlbumLayout.setHorizontalGroup(
            pnlAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAlbumLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(pnlAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparatorB4)
                    .addComponent(txtAñoAlbum)
                    .addComponent(jSeparatorB3)
                    .addComponent(txtNombreAlbum))
                .addGap(18, 18, 18)
                .addComponent(btnBuscarAlbum)
                .addGroup(pnlAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAlbumLayout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(btnEliminarAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCrearAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAlbumLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlSubirPortada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)))
                .addGap(72, 72, 72))
        );
        pnlAlbumLayout.setVerticalGroup(
            pnlAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAlbumLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscarAlbum)
                    .addGroup(pnlAlbumLayout.createSequentialGroup()
                        .addComponent(pnlSubirPortada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEliminarAlbum)
                            .addComponent(btnCrearAlbum)))
                    .addGroup(pnlAlbumLayout.createSequentialGroup()
                        .addComponent(txtNombreAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparatorB3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAñoAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparatorB4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8))
        );

        pnlMusica.setBackground(new java.awt.Color(24, 23, 23));
        pnlMusica.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(187, 187, 187), 1, true), "Musica", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        txtNombreMusica.setBackground(new java.awt.Color(24, 23, 23));
        txtNombreMusica.setForeground(new java.awt.Color(255, 251, 248));
        txtNombreMusica.setText("Escriba un nombre...");
        txtNombreMusica.setBorder(null);
        txtNombreMusica.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombreMusicaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreMusicaFocusLost(evt);
            }
        });

        cbxAlbum.setBackground(new java.awt.Color(204, 204, 204));
        cbxAlbum.setForeground(new java.awt.Color(51, 51, 51));
        cbxAlbum.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción" }));
        cbxAlbum.setBorder(null);

        btnCrearMusica.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        btnCrearMusica.setForeground(new java.awt.Color(44, 62, 80));
        btnCrearMusica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/save.png"))); // NOI18N
        btnCrearMusica.setContentAreaFilled(false);
        btnCrearMusica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCrearMusica.setFocusable(false);
        btnCrearMusica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCrearMusicaMouseClicked(evt);
            }
        });

        cbxArtista.setBackground(new java.awt.Color(204, 204, 204));
        cbxArtista.setForeground(new java.awt.Color(51, 51, 51));
        cbxArtista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción" }));
        cbxArtista.setBorder(null);

        cbxGenero.setBackground(new java.awt.Color(204, 204, 204));
        cbxGenero.setForeground(new java.awt.Color(51, 51, 51));
        cbxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción" }));
        cbxGenero.setBorder(null);

        pnlSubirCancion.setBackground(new java.awt.Color(24, 23, 23));
        pnlSubirCancion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlSubirCancionMouseClicked(evt);
            }
        });

        lbSubirCancion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/noupload.png"))); // NOI18N

        txtCancion.setBackground(new java.awt.Color(24, 23, 23));
        txtCancion.setForeground(new java.awt.Color(255, 255, 255));
        txtCancion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCancion.setText("Audio");

        javax.swing.GroupLayout pnlSubirCancionLayout = new javax.swing.GroupLayout(pnlSubirCancion);
        pnlSubirCancion.setLayout(pnlSubirCancionLayout);
        pnlSubirCancionLayout.setHorizontalGroup(
            pnlSubirCancionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSubirCancionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtCancion, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbSubirCancion))
        );
        pnlSubirCancionLayout.setVerticalGroup(
            pnlSubirCancionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSubirCancionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSubirCancionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCancion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbSubirCancion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnBuscarMusica.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        btnBuscarMusica.setForeground(new java.awt.Color(44, 62, 80));
        btnBuscarMusica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/search.png"))); // NOI18N
        btnBuscarMusica.setContentAreaFilled(false);
        btnBuscarMusica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarMusica.setFocusable(false);
        btnBuscarMusica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMusicaMouseClicked(evt);
            }
        });

        btnEliminarMusica.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        btnEliminarMusica.setForeground(new java.awt.Color(44, 62, 80));
        btnEliminarMusica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/remove.png"))); // NOI18N
        btnEliminarMusica.setContentAreaFilled(false);
        btnEliminarMusica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarMusica.setFocusable(false);
        btnEliminarMusica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMusicaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlMusicaLayout = new javax.swing.GroupLayout(pnlMusica);
        pnlMusica.setLayout(pnlMusicaLayout);
        pnlMusicaLayout.setHorizontalGroup(
            pnlMusicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMusicaLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(pnlMusicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMusicaLayout.createSequentialGroup()
                        .addGroup(pnlMusicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlMusicaLayout.createSequentialGroup()
                                .addGroup(pnlMusicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombreMusica, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                                    .addComponent(jSeparatorB5))
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscarMusica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE))
                            .addGroup(pnlMusicaLayout.createSequentialGroup()
                                .addComponent(cbxArtista, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(191, 191, 191)))
                        .addGroup(pnlMusicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlSubirCancion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlMusicaLayout.createSequentialGroup()
                        .addComponent(cbxAlbum, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(213, 213, 213)
                        .addComponent(btnEliminarMusica, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCrearMusica, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(73, 73, 73))
        );
        pnlMusicaLayout.setVerticalGroup(
            pnlMusicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMusicaLayout.createSequentialGroup()
                .addGroup(pnlMusicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMusicaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlMusicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlMusicaLayout.createSequentialGroup()
                                .addComponent(txtNombreMusica, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jSeparatorB5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnBuscarMusica)))
                    .addGroup(pnlMusicaLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(cbxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pnlMusicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlSubirCancion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(pnlMusicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarMusica)
                    .addComponent(btnCrearMusica))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlBibliotecaLayout = new javax.swing.GroupLayout(pnlBiblioteca);
        pnlBiblioteca.setLayout(pnlBibliotecaLayout);
        pnlBibliotecaLayout.setHorizontalGroup(
            pnlBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBibliotecaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlMusica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlAlbum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlArtista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlGenero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29))
        );
        pnlBibliotecaLayout.setVerticalGroup(
            pnlBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBibliotecaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlMusica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        Escritorio.add(pnlBiblioteca, "card2");

        pnlPlaylist.setBackground(new java.awt.Color(24, 23, 23));
        pnlPlaylist.setPreferredSize(new java.awt.Dimension(1035, 609));

        fdPlaylist.setForeground(new java.awt.Color(255, 255, 255));
        fdPlaylist.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fdPlaylist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sound-waves.png"))); // NOI18N
        fdPlaylist.setText("Hola Mundo");
        fdPlaylist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fdPlaylistMouseClicked(evt);
            }
        });

        jSeparatorP.setForeground(new java.awt.Color(255, 255, 255));

        btnAgregarMusicaPlaylist.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        btnAgregarMusicaPlaylist.setForeground(new java.awt.Color(44, 62, 80));
        btnAgregarMusicaPlaylist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/song.png"))); // NOI18N
        btnAgregarMusicaPlaylist.setText("Agregar cancion");
        btnAgregarMusicaPlaylist.setContentAreaFilled(false);
        btnAgregarMusicaPlaylist.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarMusicaPlaylist.setFocusable(false);
        btnAgregarMusicaPlaylist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMusicaPlaylistMouseClicked(evt);
            }
        });

        btnEditarPlaylist.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        btnEditarPlaylist.setForeground(new java.awt.Color(44, 62, 80));
        btnEditarPlaylist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/editing.png"))); // NOI18N
        btnEditarPlaylist.setText("Editar");
        btnEditarPlaylist.setContentAreaFilled(false);
        btnEditarPlaylist.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarPlaylist.setFocusable(false);
        btnEditarPlaylist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarPlaylistMouseClicked(evt);
            }
        });

        btnEliminarPlaylist.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        btnEliminarPlaylist.setForeground(new java.awt.Color(44, 62, 80));
        btnEliminarPlaylist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/remove.png"))); // NOI18N
        btnEliminarPlaylist.setText("Eliminar");
        btnEliminarPlaylist.setContentAreaFilled(false);
        btnEliminarPlaylist.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarPlaylist.setFocusable(false);
        btnEliminarPlaylist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarPlaylistMouseClicked(evt);
            }
        });

        tblCanciones.setBackground(new java.awt.Color(24, 23, 23));
        tblCanciones.setForeground(new java.awt.Color(204, 204, 204));
        tblCanciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Duracion", "Genero", "Artista"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCanciones.setShowGrid(false);
        tblCanciones.setShowHorizontalLines(true);
        tblCanciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCancionesMouseClicked(evt);
            }
        });
        jScrollCentral.setViewportView(tblCanciones);

        javax.swing.GroupLayout pnlPlaylistLayout = new javax.swing.GroupLayout(pnlPlaylist);
        pnlPlaylist.setLayout(pnlPlaylistLayout);
        pnlPlaylistLayout.setHorizontalGroup(
            pnlPlaylistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPlaylistLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(pnlPlaylistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollCentral)
                    .addGroup(pnlPlaylistLayout.createSequentialGroup()
                        .addComponent(btnAgregarMusicaPlaylist)
                        .addGap(83, 83, 83)
                        .addComponent(btnEliminarPlaylist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(76, 76, 76)
                        .addComponent(btnEditarPlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(62, 62, 62))
            .addGroup(pnlPlaylistLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPlaylistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparatorP)
                    .addComponent(fdPlaylist, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 764, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlPlaylistLayout.setVerticalGroup(
            pnlPlaylistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPlaylistLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(fdPlaylist)
                .addGap(38, 38, 38)
                .addComponent(jSeparatorP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollCentral, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(pnlPlaylistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarMusicaPlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarPlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarPlaylist))
                .addGap(45, 45, 45))
        );

        Escritorio.add(pnlPlaylist, "card3");

        pnlReproductor.setBackground(new java.awt.Color(24, 23, 23));

        jSeparatorR.setForeground(new java.awt.Color(255, 255, 255));

        jLabelReproduccion.setForeground(new java.awt.Color(255, 255, 255));
        jLabelReproduccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelReproduccion.setText("Reproducindo ahora... | Hola.mp3");
        jLabelReproduccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jPanelBotones.setBackground(new java.awt.Color(24, 23, 23));
        jPanelBotones.setLayout(new java.awt.GridBagLayout());

        btnPause.setBackground(new java.awt.Color(255, 255, 255));
        btnPause.setForeground(new java.awt.Color(255, 255, 255));
        btnPause.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/pause.png"))); // NOI18N
        btnPause.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPauseMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 40, 6, 0);
        jPanelBotones.add(btnPause, gridBagConstraints);

        btnRepeat.setBackground(new java.awt.Color(255, 255, 255));
        btnRepeat.setForeground(new java.awt.Color(255, 255, 255));
        btnRepeat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/repeat.png"))); // NOI18N
        btnRepeat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRepeatMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 149, 6, 0);
        jPanelBotones.add(btnRepeat, gridBagConstraints);

        btnCancel.setBackground(new java.awt.Color(255, 255, 255));
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cancel.png"))); // NOI18N
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 40, 6, 0);
        jPanelBotones.add(btnCancel, gridBagConstraints);

        btnVolumeDown.setBackground(new java.awt.Color(255, 255, 255));
        btnVolumeDown.setForeground(new java.awt.Color(255, 255, 255));
        btnVolumeDown.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/volume-down.png"))); // NOI18N
        btnVolumeDown.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVolumeDownMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 40, 6, 0);
        jPanelBotones.add(btnVolumeDown, gridBagConstraints);

        btnVolumeUp.setBackground(new java.awt.Color(255, 255, 255));
        btnVolumeUp.setForeground(new java.awt.Color(255, 255, 255));
        btnVolumeUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/volume-up.png"))); // NOI18N
        btnVolumeUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVolumeUpMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 40, 6, 160);
        jPanelBotones.add(btnVolumeUp, gridBagConstraints);

        btnList.setBackground(new java.awt.Color(255, 255, 255));
        btnList.setForeground(new java.awt.Color(255, 255, 255));
        btnList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/list.png"))); // NOI18N
        btnList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnListMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 40, 6, 0);
        jPanelBotones.add(btnList, gridBagConstraints);

        btnPlay.setBackground(new java.awt.Color(255, 255, 255));
        btnPlay.setForeground(new java.awt.Color(255, 255, 255));
        btnPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/play.png"))); // NOI18N
        btnPlay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPlayMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 40, 6, 0);
        jPanelBotones.add(btnPlay, gridBagConstraints);

        fdReproductor.setForeground(new java.awt.Color(255, 255, 255));
        fdReproductor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fdReproductor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sound-waves.png"))); // NOI18N
        fdReproductor.setText("Hola Mundo");

        javax.swing.GroupLayout pnlReproductorLayout = new javax.swing.GroupLayout(pnlReproductor);
        pnlReproductor.setLayout(pnlReproductorLayout);
        pnlReproductorLayout.setHorizontalGroup(
            pnlReproductorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlReproductorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparatorR)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlReproductorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fdReproductor, javax.swing.GroupLayout.DEFAULT_SIZE, 764, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnlReproductorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(29, 29, 29))
            .addGroup(pnlReproductorLayout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(jLabelReproduccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(207, 207, 207))
        );
        pnlReproductorLayout.setVerticalGroup(
            pnlReproductorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlReproductorLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(fdReproductor, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                .addGap(67, 67, 67)
                .addComponent(jSeparatorR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(jLabelReproduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(jPanelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        Escritorio.add(pnlReproductor, "card4");

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addComponent(Barra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(Menu, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE))
                .addContainerGap())
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
            .addComponent(Barra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(Fondo, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Tabla de canciones
     */
    private void mostrarCanciones() throws SQLException {

        String queryAudios = "SELECT * FROM cancion INNER JOIN genero ON cancion.genero_id_genero = genero.id_genero INNER JOIN artista ON cancion.artista_id_artista = artista.id_artista ORDER BY id_cancion ASC";

        java.sql.Connection cn = co.conectar();
        PreparedStatement stmtAudios = cn.prepareStatement(queryAudios);
        ResultSet rs = stmtAudios.executeQuery();

        //Crear un modelo de tabla con los encabezados de columna apropiados y con 0 filas (para empezar)
        String[] columnas = {"ID", "Nombre", "Duracion", "Genero", "Artista"};
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);

        while (rs.next()) {
            String id = rs.getString("id_cancion");
            String nombre = rs.getString("nombre_cancion");
            String duracion = rs.getString("duracion_cancion");
            String genero = rs.getString("nombre_genero") == null ? "" : rs.getString("nombre_genero");
            String artista = rs.getString("nombre_artista") == null ? "" : rs.getString("nombre_artista");

            String[] data = {id, nombre, duracion, genero, artista};

            //Agregar esta fila de datos en el modelo de tabla
            modelo.addRow(data);
        }
        tblCanciones.setModel(modelo);
    }

    /**
     * Funciones para header de la barra
     */
    //Evento de presionar header
    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    //Evento de arrastrar header
    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    //Evento resaltar boton de salida
    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        Color color = new Color(254, 100, 111);
        btnSalir.setBackground(color);
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        Color color = new Color(18, 31, 35);
        btnSalir.setBackground(color);
    }//GEN-LAST:event_btnSalirMouseExited

    //Evento para salir
    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnSalirMouseClicked

    /**
     * Metodos para menu principal
     */
    //Mostrar panel playlist
    private void pnlPlayList() {
        lblPlaylist.setBackground(new Color(0, 204, 106));

        lblBiblioteca.setBackground(new Color(24, 23, 23));
        lblReproductor.setBackground(new Color(24, 23, 23));

        Escritorio.removeAll();
        Escritorio.repaint();
        Escritorio.revalidate();
        Escritorio.add(pnlPlaylist);
        Escritorio.repaint();
        Escritorio.revalidate();
    }

    private void btnPlaylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaylistActionPerformed
        pnlPlayList();
    }//GEN-LAST:event_btnPlaylistActionPerformed

    //Mostrar panel biblioteca
    private void pnlBiblioteca() {
        lblBiblioteca.setBackground(new Color(0, 204, 106));

        lblPlaylist.setBackground(new Color(24, 23, 23));
        lblReproductor.setBackground(new Color(24, 23, 23));

        Escritorio.removeAll();
        Escritorio.repaint();
        Escritorio.revalidate();
        Escritorio.add(pnlBiblioteca);
        Escritorio.repaint();
        Escritorio.revalidate();
    }
    private void btnBibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBibliotecaActionPerformed
        pnlBiblioteca();
    }//GEN-LAST:event_btnBibliotecaActionPerformed

    //Mostrar panel reproductor
    private void pnlReproductor() {
        lblReproductor.setBackground(new Color(0, 204, 106));

        lblPlaylist.setBackground(new Color(24, 23, 23));
        lblBiblioteca.setBackground(new Color(24, 23, 23));

        Escritorio.removeAll();
        Escritorio.repaint();
        Escritorio.revalidate();
        Escritorio.add(pnlReproductor);
        Escritorio.repaint();
        Escritorio.revalidate();
    }

    private void btnReproductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReproductorActionPerformed
        pnlReproductor();
    }//GEN-LAST:event_btnReproductorActionPerformed

    /**
     * Metodos para campos del panel de biblioteca
     */
    private void txtGeneroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtGeneroFocusGained
        txtGenero.setText("");
    }//GEN-LAST:event_txtGeneroFocusGained

    private void txtArtistaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtArtistaFocusGained
        txtArtista.setText("");
    }//GEN-LAST:event_txtArtistaFocusGained

    private void txtNombreAlbumFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreAlbumFocusGained
        txtNombreAlbum.setText("");
    }//GEN-LAST:event_txtNombreAlbumFocusGained

    private void txtAñoAlbumFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAñoAlbumFocusGained
        txtAñoAlbum.setText("");
    }//GEN-LAST:event_txtAñoAlbumFocusGained

    private void txtNombreMusicaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreMusicaFocusGained
        txtNombreMusica.setText("");
    }//GEN-LAST:event_txtNombreMusicaFocusGained

    private void txtGeneroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtGeneroFocusLost
        txtGenero.setText("Escriba un genero...");
    }//GEN-LAST:event_txtGeneroFocusLost

    private void txtArtistaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtArtistaFocusLost
        txtArtista.setText("Escriba un interprete...");
    }//GEN-LAST:event_txtArtistaFocusLost

    private void txtNombreAlbumFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreAlbumFocusLost
        if (txtNombreAlbum.getText().equals("")) {
            txtNombreAlbum.setText("Escriba un nombre....");
        }
    }//GEN-LAST:event_txtNombreAlbumFocusLost

    private void txtAñoAlbumFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAñoAlbumFocusLost
        if (txtAñoAlbum.getText().equals("")) {
            txtAñoAlbum.setText("Escriba el año...");
        }
    }//GEN-LAST:event_txtAñoAlbumFocusLost

    private void txtNombreMusicaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreMusicaFocusLost
        if (txtNombreMusica.getText().equals("")) {
            txtNombreMusica.setText("Escriba un nombre....");
        }
    }//GEN-LAST:event_txtNombreMusicaFocusLost

    //Solo ingreso de numeros
    private void txtAñoAlbumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAñoAlbumKeyTyped
        char validar = evt.getKeyChar();

        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtAñoAlbumKeyTyped

    /**
     * Método auxiliares para los combo box
     */
    public String getCbxGenero() {
        return cbxGenero.getSelectedItem() != null ? cbxGenero.getSelectedItem().toString() : "";   // para que no salte error al capturar el combo box
    }

    public String getCbxArtista() {
        return cbxArtista.getSelectedItem() != null ? cbxArtista.getSelectedItem().toString() : "";
    }

    public String getCbxAlbum() {
        return cbxAlbum.getSelectedItem() != null ? cbxAlbum.getSelectedItem().toString() : "";
    }

    /**
     * Metodos para almacenar datos del panel de biblioteca
     */
    private void btnCrearGeneroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearGeneroMouseClicked
        //Creamos la Consulta SQL
        String query = "INSERT INTO genero (nombre_genero) VALUES (?)";

        try {
            if (!btnEliminarGenero.isEnabled()) {
                if (validar("genero")) {

                    //Establecemos conexión con la BD 
                    java.sql.Connection cn = co.conectar();
                    //Preparamos la consulta SQL
                    PreparedStatement stmt = cn.prepareStatement(query);

                    stmt.setString(1, txtGenero.getText());

                    stmt.executeUpdate();
                    stmt.close();
                    cn.close();

                    JOptionPane.showMessageDialog(null, "Operacion exitosa", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                String texto = txtGenero.getText();

                int confirmacion = JOptionPane.showConfirmDialog(null, "¿Desea actualizar el genero a '" + texto + "'?", "Seleccione una opcion", JOptionPane.YES_NO_OPTION);

                if (confirmacion == JOptionPane.YES_OPTION) {

                    java.sql.Connection cn = co.conectar();

                    PreparedStatement stmt = cn.prepareStatement("UPDATE genero SET nombre_genero = ? WHERE id_genero = ?");

                    stmt.setString(1, texto);
                    stmt.setInt(2, editID);

                    if (stmt.executeUpdate() > 0) {
                        JOptionPane.showMessageDialog(null, "Los datos han sido modificados con éxito", "Operación Exitosa", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }

            actualizar();

        } catch (SQLIntegrityConstraintViolationException e) {
            JOptionPane.showMessageDialog(null, "Ya existe el genero", "Mensaje", JOptionPane.WARNING_MESSAGE);
        } catch (SQLException e) {
            System.out.println("Hubo un error en la conexión.");
        }
    }//GEN-LAST:event_btnCrearGeneroMouseClicked

    private void btnCrearArtistaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearArtistaMouseClicked
        //Creamos la Consulta SQL
        String query = "INSERT INTO artista (nombre_artista) VALUES (?)";

        try {
            if (!btnEliminarArtista.isEnabled()) {
                if (validar(("artista"))) {

                    //Establecemos conexión con la BD 
                    java.sql.Connection cn = co.conectar();
                    //Preparamos la consulta SQL
                    PreparedStatement stmt = cn.prepareStatement(query);

                    stmt.setString(1, txtArtista.getText());

                    stmt.executeUpdate();
                    stmt.close();
                    cn.close();

                    JOptionPane.showMessageDialog(null, "Operacion exitosa", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                String texto = txtArtista.getText();

                int confirmacion = JOptionPane.showConfirmDialog(null, "¿Desea actualizar el artista a '" + texto + "'?", "Seleccione una opcion", JOptionPane.YES_NO_OPTION);

                if (confirmacion == JOptionPane.YES_OPTION) {

                    java.sql.Connection cn = co.conectar();

                    PreparedStatement stmt = cn.prepareStatement("UPDATE artista SET nombre_artista = ? WHERE id_artista = ?");

                    stmt.setString(1, texto);
                    stmt.setInt(2, editID);

                    if (stmt.executeUpdate() > 0) {
                        JOptionPane.showMessageDialog(null, "Los datos han sido modificados con éxito", "Operación Exitosa", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }

            actualizar();

        } catch (SQLIntegrityConstraintViolationException e) {
            JOptionPane.showMessageDialog(null, "Ya existe el artista", "Mensaje", JOptionPane.WARNING_MESSAGE);
        } catch (SQLException e) {
            System.out.println("Hubo un error en la conexión.");
        }
    }//GEN-LAST:event_btnCrearArtistaMouseClicked

    private void btnCrearAlbumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearAlbumMouseClicked

        String query = "INSERT INTO album (nombre_album, ruta_portada, año) VALUES (?, ?, ?)";

        try {
            if (!btnEliminarAlbum.isEnabled()) {
                if (validar("album")) {

                    java.sql.Connection cn = co.conectar();
                    PreparedStatement stmt = cn.prepareStatement(query);

                    stmt.setString(1, txtNombreAlbum.getText());
                    stmt.setString(2, rutaPortada);
                    stmt.setInt(3, Integer.valueOf(txtAñoAlbum.getText()));

                    stmt.executeUpdate();
                    stmt.close();
                    cn.close();

                    JOptionPane.showMessageDialog(null, "Operacion exitosa", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "¿Desea actualizar el album?", "Mensaje", JOptionPane.WARNING_MESSAGE);
            }

            actualizar();

        } catch (SQLException e) {
            System.out.println("Hubo un error en la conexión.");
        }
    }//GEN-LAST:event_btnCrearAlbumMouseClicked

    private void btnCrearMusicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearMusicaMouseClicked

        String query = "INSERT INTO cancion (nombre_cancion, duracion_cancion, ruta_cancion, genero_id_genero, artista_id_artista) VALUES (?, ?, ?, ?, ?)";

        try {
            if (!btnEliminarMusica.isEnabled()) {
                if (validar("musica")) {

                    java.sql.Connection cn = co.conectar();
                    PreparedStatement stmt = cn.prepareStatement(query);

                    stmt.setString(1, txtNombreMusica.getText());
                    stmt.setString(2, txtCancion.getText());
                    stmt.setString(3, rutaAudio);

                    Statement stGenero = cn.createStatement();
                    ResultSet rsG = stGenero.executeQuery("SELECT * FROM genero WHERE nombre_genero = '" + getCbxGenero() + "'");
                    while (rsG.next()) {
                        stmt.setInt(4, rsG.getInt(1));
                    }

                    Statement stArtista = cn.createStatement();
                    ResultSet rsA = stArtista.executeQuery("SELECT * FROM artista WHERE nombre_artista = '" + getCbxArtista() + "'");
                    while (rsA.next()) {
                        stmt.setInt(5, rsA.getInt(1));
                    }

                    stmt.executeUpdate();
                    stmt.close();

                    String idCancion = "";
                    Statement stCancion = cn.createStatement();
                    ResultSet rsC = stCancion.executeQuery("SELECT * FROM cancion ORDER BY id_cancion DESC LIMIT 1");
                    while (rsC.next()) {
                        idCancion = rsC.getString(1);
                    }

                    String idAlbum = "";
                    Statement stAlbum = cn.createStatement();
                    ResultSet rsB = stAlbum.executeQuery("SELECT * FROM album WHERE nombre_album = '" + getCbxAlbum() + "'");
                    while (rsB.next()) {
                        idAlbum = rsB.getString(1);
                    }

                    Statement stIntermedia = cn.createStatement();
                    stIntermedia.executeUpdate("INSERT INTO album_cancion (cancion_id_cancion, album_id_album) VALUES (" + idCancion + ", " + idAlbum + ")");
                    stIntermedia.close();

                    cn.close();

                    JOptionPane.showMessageDialog(null, "Operacion exitosa", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "¿Desea actualizar la musc=ica?", "Mensaje", JOptionPane.WARNING_MESSAGE);
            }

            actualizar();

        } catch (SQLException e) {
            System.out.println("Hubo un error en la conexión.");
        }
    }//GEN-LAST:event_btnCrearMusicaMouseClicked

    // obtener ruta de archivo portada
    private void pnlSubirPortadaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSubirPortadaMouseClicked

        pnlSubirPortada.requestFocus();

        FileFilter filtro = new FileNameExtensionFilter("JPG, PNG & GIF", "jpg", "png", "gif");

        JFileChooser openFileChooser = new JFileChooser("src/imagenes/");
        openFileChooser.setAcceptAllFileFilterUsed(false);
        openFileChooser.addChoosableFileFilter(filtro);

        int result = openFileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File F = openFileChooser.getSelectedFile();
            rutaPortada = F.getAbsolutePath();
        }

        txtPortada.setText(rutaPortada.substring(rutaPortada.lastIndexOf('\\') + 1));

        Icon icono = new ImageIcon(getClass().getResource("/iconos/album.png"));
        lbSubirPortada.setIcon(icono);

    }//GEN-LAST:event_pnlSubirPortadaMouseClicked

    // obtener ruta de archivo de audio
    private void pnlSubirCancionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSubirCancionMouseClicked
        pnlSubirCancion.requestFocus();

        FileFilter filtro = new FileNameExtensionFilter("MP3", "mp3");

        JFileChooser openFileChooser = new JFileChooser("src/audio/");
        openFileChooser.setAcceptAllFileFilterUsed(false);
        openFileChooser.addChoosableFileFilter(filtro);

        int result = openFileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File F = openFileChooser.getSelectedFile();
            rutaAudio = F.getAbsolutePath();
        }

        txtCancion.setText(audioDuracion(rutaAudio));

        Icon icono = new ImageIcon(getClass().getResource("/iconos/upload.png"));
        lbSubirCancion.setIcon(icono);
    }//GEN-LAST:event_pnlSubirCancionMouseClicked

    public static String audioDuracion(String filePath) {

        try {
            File mp3File = new File(filePath);
            MP3File f = (MP3File) AudioFileIO.read(mp3File);
            MP3AudioHeader audioHeader = (MP3AudioHeader) f.getAudioHeader();

            long secs = audioHeader.getTrackLength();

            return String.format("%02d:%02d:%02d", secs / 3600, (secs % 3600) / 60, secs % 60);

        } catch (IOException | NumberFormatException | CannotReadException | InvalidAudioFrameException | ReadOnlyFileException | TagException e) {
            System.out.println("Error en el audio");
            return " ";
        }
    }

    /**
     * Metodos para consultar datos del panel de biblioteca
     */
    private void btnBuscarGeneroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarGeneroMouseClicked
        pnlGenero.requestFocus();

        String query = "SELECT * FROM genero WHERE nombre_genero = '" + txtGenero.getText() + "'";
        int id = 0, cont = 0;
        String dato = "";

        try {
            if (validar("genero")) {

                java.sql.Connection cn = co.conectar();
                Statement stmt = cn.createStatement();
                ResultSet rs = stmt.executeQuery(query);
                while (rs.next()) {
                    id = rs.getInt(1);
                    dato = rs.getString(2);
                    cont++;
                }

                if (cont > 0) {
                    JOptionPane.showMessageDialog(null, "Encontrado : " + String.valueOf(cont) + " coincidencias\n ID                 : "
                            + String.valueOf(id) + "\nGenero        : " + dato, "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                    actualizar();
                    txtGenero.setText(dato);

                    //Activamos las operaciones despues de consultar
                    btnEliminarGenero.setEnabled(true);
                    editID = id;
                } else {
                    JOptionPane.showMessageDialog(null, "No hay coincidencias", "Mensaje", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (SQLException e) {
            System.out.println("Hubo un error en la conexión.");
        }
    }//GEN-LAST:event_btnBuscarGeneroMouseClicked

    private void btnBuscarArtistaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarArtistaMouseClicked
        pnlArtista.requestFocus();

        String query = "SELECT * FROM artista WHERE nombre_artista = '" + txtArtista.getText() + "'";
        int id = 0, cont = 0;
        String dato = "";

        try {
            if (validar(("artista"))) {

                java.sql.Connection cn = co.conectar();
                Statement stmt = cn.createStatement();
                ResultSet rs = stmt.executeQuery(query);
                while (rs.next()) {
                    id = rs.getInt(1);
                    dato = rs.getString(2);
                    cont++;
                }

                if (cont > 0) {
                    JOptionPane.showMessageDialog(null, "Encontrado : " + String.valueOf(cont) + " coincidencias\n ID                 : "
                            + String.valueOf(id) + "\nArtista           : " + dato, "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                    actualizar();
                    txtArtista.setText(dato);

                    //Activamos las operaciones despues de consultar
                    btnEliminarArtista.setEnabled(true);
                    editID = id;
                } else {
                    JOptionPane.showMessageDialog(null, "No hay coincidencias", "Mensaje", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (SQLException e) {
            System.out.println("Hubo un error en la conexión.");
        }
    }//GEN-LAST:event_btnBuscarArtistaMouseClicked

    private void btnBuscarAlbumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarAlbumMouseClicked
        pnlAlbum.requestFocus();

        String query = "SELECT * FROM album WHERE nombre_album = '" + txtNombreAlbum.getText() + "'";
        int año = 0, id = 0, cont = 0;
        String ruta = "", dato = "";

        try {
            if (validar(("album"))) {

                java.sql.Connection cn = co.conectar();
                Statement stmt = cn.createStatement();
                ResultSet rs = stmt.executeQuery(query);
                while (rs.next()) {
                    id = rs.getInt(1);
                    dato = rs.getString(2);
                    ruta = rs.getString(3);
                    año = rs.getInt(4);
                    cont++;
                }

                if (cont > 0) {

                    Icon icono = new ImageIcon(new javax.swing.ImageIcon(ruta).getImage().getScaledInstance(200, 100, Image.SCALE_SMOOTH));

                    JOptionPane.showMessageDialog(null, "Encontrado : " + String.valueOf(cont) + " coincidencias\n ID                 : "
                            + String.valueOf(id) + "\nAlbum           : " + dato + "\nAño               : " + String.valueOf(año), "Mensaje",
                            JOptionPane.PLAIN_MESSAGE, icono);
                    actualizar();
                    txtNombreAlbum.setText(dato);

                    //Activamos las operaciones despues de consultar
                    btnEliminarAlbum.setEnabled(true);
                } else {
                    JOptionPane.showMessageDialog(null, "No hay coincidencias", "Mensaje", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (SQLException e) {
            System.out.println("Hubo un error en la conexión.");
        }
    }//GEN-LAST:event_btnBuscarAlbumMouseClicked

    private void btnBuscarMusicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMusicaMouseClicked
        pnlMusica.requestFocus();

        String query = "SELECT * FROM cancion WHERE nombre_cancion = '" + txtNombreMusica.getText() + "'";
        int id = 0, cont = 0;
        String duracion = "", dato = "";

        try {
            if (validar(("musica"))) {

                java.sql.Connection cn = co.conectar();
                Statement stmt = cn.createStatement();
                ResultSet rs = stmt.executeQuery(query);
                while (rs.next()) {
                    id = rs.getInt(1);
                    dato = rs.getString(2);
                    duracion = rs.getString(3);
                    cont++;
                }

                if (cont > 0) {
                    JOptionPane.showMessageDialog(null, "Encontrado : " + String.valueOf(cont) + " coincidencias\n ID                 : "
                            + String.valueOf(id) + "\nMusica         : " + dato + "\nDuracion     : " + duracion,
                            "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                    actualizar();
                    txtNombreMusica.setText(dato);

                    //Activamos las operaciones despues de consultar
                    btnEliminarMusica.setEnabled(true);
                } else {
                    JOptionPane.showMessageDialog(null, "No hay coincidencias", "Mensaje", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (SQLException e) {
            System.out.println("Hubo un error en la conexión.");
        }
    }//GEN-LAST:event_btnBuscarMusicaMouseClicked

    /**
     * Metodos para eliminar datos del panel de biblioteca
     */
    private void btnEliminarGeneroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarGeneroMouseClicked
        pnlGenero.requestFocus();
        try {
            if (validar("genero")) {
                eliminar("DELETE FROM genero WHERE nombre_genero = '" + txtGenero.getText() + "'", txtGenero);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEliminarGeneroMouseClicked

    private void btnEliminarArtistaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarArtistaMouseClicked
        pnlArtista.requestFocus();
        try {
            if (validar("artista")) {
                eliminar("DELETE FROM artista WHERE nombre_artista = '" + txtArtista.getText() + "'", txtArtista);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEliminarArtistaMouseClicked

    private void btnEliminarAlbumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarAlbumMouseClicked
        pnlAlbum.requestFocus();
        try {
            if (validar("album")) {
                eliminar("DELETE FROM album WHERE nombre_album = '" + txtNombreAlbum.getText() + "'", txtNombreAlbum);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEliminarAlbumMouseClicked

    private void btnEliminarMusicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMusicaMouseClicked
        pnlMusica.requestFocus();
        try {
            if (validar("musica")) {
                eliminar("DELETE FROM cancion WHERE nombre_cancion = '" + txtNombreMusica.getText() + "'", txtNombreMusica);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEliminarMusicaMouseClicked

    private void eliminar(String query, JTextField campo) throws SQLException {

        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el elemento '" + campo.getText() + "'?", "Seleccione una opcion", JOptionPane.YES_NO_OPTION);

        if (confirmacion == JOptionPane.YES_OPTION) {
            java.sql.Connection cn = co.conectar();
            Statement stmt = cn.createStatement();
            stmt.executeUpdate(query);
        }
        actualizar();
    }

    /**
     * Metodos para playlist
     */
    private void btnVerPlaylistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerPlaylistMouseClicked

        pnlPlayList();

        /*String query = "INSERT INTO playlist (nombre_playlist) VALUES (?)";

        try {
            String nombre = JOptionPane.showInputDialog("Ingrese un nombre:");

            if (nombre != null) {

                java.sql.Connection cn = co.conectar();
                PreparedStatement stmt = cn.prepareStatement(query);

                stmt.setString(1, nombre);

                stmt.executeUpdate();
                stmt.close();
                cn.close();

                JOptionPane.showMessageDialog(null, "Operacion exitosa", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            }

            actualizar();

        } catch (SQLIntegrityConstraintViolationException e) {
            JOptionPane.showMessageDialog(null, "Ya existe el playlist", "Mensaje", JOptionPane.WARNING_MESSAGE);
        } catch (SQLException e) {
            System.out.println("Hubo un error en la conexión.");
        }
         */
    }//GEN-LAST:event_btnVerPlaylistMouseClicked

    private void btnEliminarPlaylistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarPlaylistMouseClicked

        Barra.requestFocus();
        int seleccion = tblCanciones.getSelectedRow();

        try {
            if (seleccion != -1) {
                int confirmacion = JOptionPane.showConfirmDialog(null, "¿Desea eliminar la cancion '" + tblCanciones.getValueAt(seleccion, 1) + "'?", "Seleccione una opcion", JOptionPane.YES_NO_OPTION);
                if (confirmacion == JOptionPane.YES_OPTION) {
                    java.sql.Connection cn = co.conectar();
                    Statement stmt = cn.createStatement();
                    stmt.executeUpdate("DELETE FROM cancion WHERE id_cancion = " + tblCanciones.getValueAt(seleccion, 0).toString());
                }
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione alguna fila", "Mensaje", JOptionPane.WARNING_MESSAGE);
            }

            actualizar();
        } catch (SQLException ex) {
            Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
        }

        /*
        Barra.requestFocus();
        String playlist = listaLateral.getSelectedValue() == null ? "" : listaLateral.getSelectedValue().toString();
        try {
            if (!playlist.equals("")) {
                int confirmacion = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el playlist '" + playlist + "'?", "Seleccione una opcion", JOptionPane.YES_NO_OPTION);
                if (confirmacion == JOptionPane.YES_OPTION) {
                    java.sql.Connection cn = co.conectar();
                    Statement stmt = cn.createStatement();
                    stmt.executeUpdate("DELETE FROM playlist WHERE nombre_playlist = '" + playlist + "'");
                }
            }

            actualizar();
        } catch (SQLException ex) {
            Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
        }
         */
    }//GEN-LAST:event_btnEliminarPlaylistMouseClicked

    private void btnAgregarMusicaPlaylistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMusicaPlaylistMouseClicked
        pnlBiblioteca();
    }//GEN-LAST:event_btnAgregarMusicaPlaylistMouseClicked

    private void btnEditarPlaylistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarPlaylistMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarPlaylistMouseClicked

    private void cargarPortada(JLabel texto, int x, int y) {
        Barra.requestFocus();
        int seleccion = tblCanciones.getSelectedRow();

        if (seleccion != -1) {
            try {
                java.sql.Connection cn = co.conectar();
                PreparedStatement stmtAudios;

                stmtAudios = cn.prepareStatement("SELECT * FROM cancion INNER JOIN album_cancion ON cancion.id_cancion = album_cancion.cancion_id_cancion INNER JOIN album ON album_cancion.album_id_album = album.id_album WHERE cancion.id_cancion = " + tblCanciones.getValueAt(seleccion, 0));
                ResultSet rs;

                rs = stmtAudios.executeQuery();

                while (rs.next()) {
                    texto.setText(rs.getString("nombre_cancion"));
                    Icon icono = new ImageIcon(new javax.swing.ImageIcon(rs.getString("ruta_portada")).getImage().getScaledInstance(180, 180, Image.SCALE_SMOOTH));
                    texto.setIcon(icono);
                }

            } catch (SQLException ex) {
                Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void tblCancionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCancionesMouseClicked
        cargarPortada(fdPlaylist, 180, 180);
    }//GEN-LAST:event_tblCancionesMouseClicked

    /**
     * Metodos para reproductor
     */
    MP3Player player = new MP3Player();
    File songFile;
    String currentDirectory = "src/audio/";
    String currentPath;
    String imagePath;

    private void cargarMusica() {
        Barra.requestFocus();
        int seleccion = tblCanciones.getSelectedRow();
        String ruta = "", nombre = "";

        try {
            if (seleccion != -1) {
                java.sql.Connection cn = co.conectar();
                Statement stmt = cn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM cancion WHERE id_cancion = " + tblCanciones.getValueAt(seleccion, 0).toString());
                while (rs.next()) {
                    ruta = rs.getString("ruta_cancion");
                    nombre = rs.getString("nombre_cancion");
                }

                songFile = new File(ruta);
                player.addToPlayList(songFile);
                player.skipForward();
                currentDirectory = songFile.getAbsolutePath();
                jLabelReproduccion.setText("Reproducindo ahora... | " + nombre);

                cargarPortada(fdReproductor, 360, 360);
                fdReproductor.setText("");

            } else {
                JOptionPane.showMessageDialog(null, "Seleccione alguna fila", "Mensaje", JOptionPane.WARNING_MESSAGE);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void fdPlaylistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fdPlaylistMouseClicked
        pnlReproductor();
        cargarMusica();
    }//GEN-LAST:event_fdPlaylistMouseClicked

    private void btnPauseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPauseMouseClicked
        player.pause();
    }//GEN-LAST:event_btnPauseMouseClicked

    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked
        player.stop();
        try {
            actualizar();
        } catch (SQLException ex) {
            Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCancelMouseClicked

    private void repetir(){
        if (repeat == false) {
            repeat = true;
            player.setRepeat(repeat);

            Icon icono = new ImageIcon(getClass().getResource("/iconos/repeat.png"));
            btnRepeat.setIcon(icono);
        } else if (repeat == true) {
            repeat = false;
            player.setRepeat(repeat);

            Icon icono = new ImageIcon(getClass().getResource("/iconos/norepeat.png"));
            btnRepeat.setIcon(icono);
        }
    }
    private void btnRepeatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRepeatMouseClicked
        repetir();
    }//GEN-LAST:event_btnRepeatMouseClicked

    private void btnListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListMouseClicked
        pnlPlayList();
    }//GEN-LAST:event_btnListMouseClicked

    private void btnVolumeDownMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolumeDownMouseClicked
        volumeDownControl(0.1);
    }//GEN-LAST:event_btnVolumeDownMouseClicked

    private void btnVolumeUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolumeUpMouseClicked
        volumeUpControl(0.1);
    }//GEN-LAST:event_btnVolumeUpMouseClicked

    private void btnPlayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPlayMouseClicked
        cargarMusica();
        player.play();
        repetir();
    }//GEN-LAST:event_btnPlayMouseClicked

    private void volumeUpControl(Double valueToPlusMinus) {

        Mixer.Info[] mixers = AudioSystem.getMixerInfo();
        for (Mixer.Info mixerInfo : mixers) {
            Mixer mixer = AudioSystem.getMixer(mixerInfo);
            Line.Info[] lineInfos = mixer.getTargetLineInfo();
            for (Line.Info lineInfo : lineInfos) {
                Line line = null;
                boolean opened = true;
                try {
                    line = mixer.getLine(lineInfo);
                    opened = line.isOpen() || line instanceof Clip;
                    if (!opened) {
                        line.open();
                    }
                    FloatControl volControl = (FloatControl) line.getControl(FloatControl.Type.VOLUME);
                    float currentVolume = volControl.getValue();
                    Double volumeToCut = valueToPlusMinus;
                    float changedCalc = (float) ((float) currentVolume + (double) volumeToCut);
                    volControl.setValue(changedCalc);

                } catch (LineUnavailableException lineException) {
                } catch (IllegalArgumentException illException) {
                } finally {
                    if (line != null && !opened) {
                        line.close();
                    }
                }
            }
        }
    }

    private void volumeDownControl(Double valueToPlusMinus) {
        Mixer.Info[] mixers = AudioSystem.getMixerInfo();
        for (Mixer.Info mixerInfo : mixers) {
            Mixer mixer = AudioSystem.getMixer(mixerInfo);
            Line.Info[] lineInfos = mixer.getTargetLineInfo();
            for (Line.Info lineInfo : lineInfos) {
                Line line = null;
                boolean opened = true;
                try {
                    line = mixer.getLine(lineInfo);
                    opened = line.isOpen() || line instanceof Clip;
                    if (!opened) {
                        line.open();
                    }
                    FloatControl volControl = (FloatControl) line.getControl(FloatControl.Type.VOLUME);
                    float currentVolume = volControl.getValue();
                    Double volumeToCut = valueToPlusMinus;
                    float changedCalc = (float) ((float) currentVolume - (double) volumeToCut);
                    volControl.setValue(changedCalc);

                } catch (LineUnavailableException lineException) {
                } catch (IllegalArgumentException illException) {
                } finally {
                    if (line != null && !opened) {
                        line.close();
                    }
                }
            }
        }
    }

    /**
     * Metodos para actualizar los campos de la aplicacion
     */
    private void actualizar() throws SQLException {

        //Reiniciar los campos de la biblioteca
        txtGenero.setText("Escriba un genero...");
        txtArtista.setText("Escriba un interprete...");
        txtNombreAlbum.setText("Escriba un nombre....");
        txtAñoAlbum.setText("Escriba el año...");
        txtNombreMusica.setText("Escriba un nombre....");

        txtPortada.setText("Portada");
        Icon iconoPortada = new ImageIcon(getClass().getResource("/iconos/noalbum.png"));
        lbSubirPortada.setIcon(iconoPortada);

        txtCancion.setText("Audio");
        Icon iconoAudio = new ImageIcon(getClass().getResource("/iconos/noupload.png"));
        lbSubirCancion.setIcon(iconoAudio);

        //Actualizar los ComboBox segun la BD
        cbxGenero.removeAllItems();
        cbxGenero.addItem("Seleccione un genero");

        cbxArtista.removeAllItems();
        cbxArtista.addItem("Seleccione un artista");

        cbxAlbum.removeAllItems();
        cbxAlbum.addItem("Seleccione un album");

        //Lista lateral
        //ModeloLateral.clear();
        //Tabla central
        mostrarCanciones();

        //Playlist
        fdPlaylist.setText("Hola Mundo");
        Icon icono = new ImageIcon(getClass().getResource("/imagenes/sound-waves.png"));
        fdPlaylist.setIcon(icono);

        //Reproductor
        fdReproductor.setText("Hola Mundo");
        fdReproductor.setIcon(icono);
        jLabelReproduccion.setText("Reproducindo ahora... | Hola.mp3");

        //Editar
        editID = 0;

        //Creamos las Consulta SQL
        String queryGenero = "SELECT nombre_genero FROM genero ORDER BY nombre_genero ASC";
        String queryArtista = "SELECT nombre_artista FROM artista ORDER BY nombre_artista ASC";
        String queryAlbum = "SELECT nombre_album FROM album ORDER BY nombre_album ASC";
        String queryPlaylist = "SELECT nombre_playlist FROM playlist ORDER BY id_playlist";

        //Establecemos bloque try-catch
        try {
            //Establecemos conexión con la BD 
            java.sql.Connection cn = co.conectar();
            //Preparamos la consulta SQL
            PreparedStatement stmtGenero = cn.prepareStatement(queryGenero);
            //Ejecutamos la consulta
            ResultSet rs = stmtGenero.executeQuery();
            while (rs.next()) {
                cbxGenero.addItem(rs.getString("nombre_genero"));
            }

            PreparedStatement stmtArtista = cn.prepareStatement(queryArtista);
            rs = stmtArtista.executeQuery();

            while (rs.next()) {
                cbxArtista.addItem(rs.getString("nombre_artista"));
            }

            PreparedStatement stmtAlbum = cn.prepareStatement(queryAlbum);
            rs = stmtAlbum.executeQuery();

            while (rs.next()) {
                cbxAlbum.addItem(rs.getString("nombre_album"));
            }

            /*PreparedStatement stmtPlaylist = cn.prepareStatement(queryPlaylist);
            rs = stmtPlaylist.executeQuery();

            while (rs.next()) {
                ModeloLateral.addElement(rs.getString("nombre_playlist"));
            }*/
            cn.close();
            rs.close();
        } catch (SQLException e) {
            System.out.println("Hubo un error en la conexión.");
        }

        //Bloqueamos la opcion eliminar hasta que se haga una busqueda
        btnEliminarGenero.setEnabled(false);
        btnEliminarArtista.setEnabled(false);
        btnEliminarAlbum.setEnabled(false);
        btnEliminarMusica.setEnabled(false);

    }

    /**
     * Metodos para validar los campos de la aplicacion
     */
    private boolean validar(String campo) throws SQLException {

        boolean flag = true;

        if (campo.equals("genero")) {
            flag = !(txtGenero.getText().equals("") || txtGenero.getText().equals("Escriba un genero..."));
        }

        if (campo.equals("artista")) {
            flag = !(txtArtista.getText().equals("") || txtArtista.getText().equals("Escriba un interprete..."));
        }

        if (campo.equals("album")) {
            flag = !(txtNombreAlbum.getText().equals("") || txtNombreAlbum.getText().equals("Escriba un nombre..."));
        }

        if (campo.equals("musica")) {
            flag = !(txtNombreMusica.getText().equals("") || txtNombreMusica.getText().equals("Escriba un nombre..."));
        }

        if (!flag) {
            JOptionPane.showMessageDialog(null, "Rellene todos los campos", "Mensaje", JOptionPane.WARNING_MESSAGE);
        }

        return flag;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Establece el aspecto y la sensación de Nimbus */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Crea y muestra el formulario */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Panel().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Barra;
    private javax.swing.JPanel Escritorio;
    private javax.swing.JPanel Fondo;
    private javax.swing.JPanel Menu;
    private javax.swing.JButton btnAgregarMusicaPlaylist;
    private javax.swing.JButton btnBiblioteca;
    private javax.swing.JButton btnBuscarAlbum;
    private javax.swing.JButton btnBuscarArtista;
    private javax.swing.JButton btnBuscarGenero;
    private javax.swing.JButton btnBuscarMusica;
    private javax.swing.JLabel btnCancel;
    private javax.swing.JButton btnCrearAlbum;
    private javax.swing.JButton btnCrearArtista;
    private javax.swing.JButton btnCrearGenero;
    private javax.swing.JButton btnCrearMusica;
    private javax.swing.JButton btnEditarPlaylist;
    private javax.swing.JButton btnEliminarAlbum;
    private javax.swing.JButton btnEliminarArtista;
    private javax.swing.JButton btnEliminarGenero;
    private javax.swing.JButton btnEliminarMusica;
    private javax.swing.JButton btnEliminarPlaylist;
    private javax.swing.JButton btnInformacion;
    private javax.swing.JLabel btnList;
    private javax.swing.JLabel btnPause;
    private javax.swing.JLabel btnPlay;
    private javax.swing.JButton btnPlaylist;
    private javax.swing.JLabel btnRepeat;
    private javax.swing.JButton btnReproductor;
    private javax.swing.JPanel btnSalir;
    private javax.swing.JButton btnVerPlaylist;
    private javax.swing.JLabel btnVolumeDown;
    private javax.swing.JLabel btnVolumeUp;
    private javax.swing.JComboBox<String> cbxAlbum;
    private javax.swing.JComboBox<String> cbxArtista;
    private javax.swing.JComboBox<String> cbxGenero;
    private javax.swing.JLabel fdBarra;
    private javax.swing.JLabel fdPlaylist;
    private javax.swing.JLabel fdReproductor;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabelReproduccion;
    private javax.swing.JPanel jPanelBotones;
    private javax.swing.JScrollPane jScrollCentral;
    private javax.swing.JScrollPane jScrollLateral;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparatorB;
    private javax.swing.JSeparator jSeparatorB1;
    private javax.swing.JSeparator jSeparatorB2;
    private javax.swing.JSeparator jSeparatorB3;
    private javax.swing.JSeparator jSeparatorB4;
    private javax.swing.JSeparator jSeparatorB5;
    private javax.swing.JSeparator jSeparatorP;
    private javax.swing.JSeparator jSeparatorR;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbExit;
    private javax.swing.JLabel lbSubirCancion;
    private javax.swing.JLabel lbSubirPortada;
    private javax.swing.JLabel lblBiblioteca;
    private javax.swing.JLabel lblPlaylist;
    private javax.swing.JLabel lblReproductor;
    private javax.swing.JList<String> listaLateral;
    private DefaultListModel ModeloLateral;
    private javax.swing.JPanel pnlAlbum;
    private javax.swing.JPanel pnlArtista;
    private javax.swing.JPanel pnlBiblioteca;
    private javax.swing.JPanel pnlGenero;
    private javax.swing.JPanel pnlMusica;
    private javax.swing.JPanel pnlPlaylist;
    private javax.swing.JPanel pnlReproductor;
    private javax.swing.JPanel pnlSubirCancion;
    private javax.swing.JPanel pnlSubirPortada;
    private javax.swing.JTable tblCanciones;
    private javax.swing.JTextField txtArtista;
    private javax.swing.JTextField txtAñoAlbum;
    private javax.swing.JLabel txtCancion;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtNombreAlbum;
    private javax.swing.JTextField txtNombreMusica;
    private javax.swing.JLabel txtPortada;
    // End of variables declaration//GEN-END:variables
}
