package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.Timer;

public class CcargarES extends javax.swing.JFrame {

    public CcargarES() {
        initComponents();
        setLocationRelativeTo(null);
        cargarFYH();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        editor = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        juego = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        calculadora = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        navegador = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        paint = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        papelera = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        explorador = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        panelProgramas = new javax.swing.JPanel();
        btnPrPap = new javax.swing.JButton();
        btnPrCal = new javax.swing.JButton();
        btnPrJue = new javax.swing.JButton();
        btnPrNav = new javax.swing.JButton();
        btnPrEdit = new javax.swing.JButton();
        btnPrPaint = new javax.swing.JButton();
        panelMenuInicio = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnProgramas = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();
        btnApagar = new javax.swing.JButton();
        btnPrExp = new javax.swing.JButton();
        btnAdministrarUsuarios = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        panelFechayHora = new javax.swing.JPanel();
        fecha = new javax.swing.JLabel();
        hora = new javax.swing.JLabel();
        btnExplorador = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        btnJuego = new javax.swing.JButton();
        btnCalc = new javax.swing.JButton();
        btnPapelera = new javax.swing.JButton();
        btnNavegador = new javax.swing.JButton();
        btnEditor = new javax.swing.JButton();
        btnPaint = new javax.swing.JButton();
        colorBarra = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setEnabled(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setOpaque(false);
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        editor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nueva carpeta/exam64.png"))); // NOI18N
        editor.setBorderPainted(false);
        editor.setContentAreaFilled(false);
        editor.setDefaultCapable(false);
        editor.setFocusable(false);
        editor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel5.add(editor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 70));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Editor Texto");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 100, 30));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 15, 100, 100));

        jPanel10.setOpaque(false);
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        juego.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nueva carpeta/newtons-cradle64.png"))); // NOI18N
        juego.setBorderPainted(false);
        juego.setContentAreaFilled(false);
        juego.setDefaultCapable(false);
        juego.setFocusable(false);
        juego.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel10.add(juego, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 70));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Juego");
        jPanel10.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 100, 30));

        jPanel3.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 480, 100, 100));

        jPanel9.setOpaque(false);
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        calculadora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nueva carpeta/math64.png"))); // NOI18N
        calculadora.setBorderPainted(false);
        calculadora.setContentAreaFilled(false);
        calculadora.setDefaultCapable(false);
        calculadora.setFocusable(false);
        calculadora.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel9.add(calculadora, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 70));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Calculadora");
        jPanel9.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 100, 30));

        jPanel3.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 325, 100, 100));

        jPanel8.setOpaque(false);
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        navegador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nueva carpeta/globe64.png"))); // NOI18N
        navegador.setBorderPainted(false);
        navegador.setContentAreaFilled(false);
        navegador.setDefaultCapable(false);
        navegador.setFocusable(false);
        navegador.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel8.add(navegador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 70));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Navegador");
        jPanel8.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 100, 30));

        jPanel3.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 325, 100, 100));

        jPanel7.setOpaque(false);
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        paint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nueva carpeta/art-and-design64.png"))); // NOI18N
        paint.setBorderPainted(false);
        paint.setContentAreaFilled(false);
        paint.setDefaultCapable(false);
        paint.setFocusable(false);
        paint.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel7.add(paint, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 70));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Paint");
        jPanel7.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 100, 30));

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 100, 100));

        jPanel6.setOpaque(false);
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        papelera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nueva carpeta/school-bag64.png"))); // NOI18N
        papelera.setBorderPainted(false);
        papelera.setContentAreaFilled(false);
        papelera.setDefaultCapable(false);
        papelera.setFocusable(false);
        papelera.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel6.add(papelera, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 70));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Papelera");
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 100, 30));

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 170, 100, 100));

        jPanel4.setOpaque(false);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        explorador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nueva carpeta/folder64.png"))); // NOI18N
        explorador.setBorderPainted(false);
        explorador.setContentAreaFilled(false);
        explorador.setDefaultCapable(false);
        explorador.setFocusable(false);
        explorador.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel4.add(explorador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 70));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Explorador");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 100, 30));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 15, 100, 100));

        jPanel1.add(jPanel3);
        jPanel3.setBounds(620, 30, 330, 580);

        panelProgramas.setBackground(new java.awt.Color(24, 43, 69));
        panelProgramas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 96, 97)));
        panelProgramas.setLayout(null);

        btnPrPap.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnPrPap.setForeground(new java.awt.Color(255, 255, 255));
        btnPrPap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nueva carpeta/school-bag.png"))); // NOI18N
        btnPrPap.setText("  Papelera");
        btnPrPap.setBorder(null);
        btnPrPap.setBorderPainted(false);
        btnPrPap.setContentAreaFilled(false);
        btnPrPap.setFocusable(false);
        btnPrPap.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        panelProgramas.add(btnPrPap);
        btnPrPap.setBounds(30, 10, 170, 40);

        btnPrCal.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnPrCal.setForeground(new java.awt.Color(255, 255, 255));
        btnPrCal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nueva carpeta/math.png"))); // NOI18N
        btnPrCal.setText("  Calculadora");
        btnPrCal.setBorder(null);
        btnPrCal.setBorderPainted(false);
        btnPrCal.setContentAreaFilled(false);
        btnPrCal.setFocusable(false);
        btnPrCal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        panelProgramas.add(btnPrCal);
        btnPrCal.setBounds(30, 50, 170, 40);

        btnPrJue.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnPrJue.setForeground(new java.awt.Color(255, 255, 255));
        btnPrJue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nueva carpeta/newtons-cradle.png"))); // NOI18N
        btnPrJue.setText("  Juego");
        btnPrJue.setBorder(null);
        btnPrJue.setBorderPainted(false);
        btnPrJue.setContentAreaFilled(false);
        btnPrJue.setFocusable(false);
        btnPrJue.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        panelProgramas.add(btnPrJue);
        btnPrJue.setBounds(30, 90, 170, 40);

        btnPrNav.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnPrNav.setForeground(new java.awt.Color(255, 255, 255));
        btnPrNav.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nueva carpeta/globe.png"))); // NOI18N
        btnPrNav.setText("  Navegador");
        btnPrNav.setBorder(null);
        btnPrNav.setBorderPainted(false);
        btnPrNav.setContentAreaFilled(false);
        btnPrNav.setFocusable(false);
        btnPrNav.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        panelProgramas.add(btnPrNav);
        btnPrNav.setBounds(30, 130, 170, 40);

        btnPrEdit.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnPrEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnPrEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nueva carpeta/exam.png"))); // NOI18N
        btnPrEdit.setText("  Editor de Texto");
        btnPrEdit.setBorder(null);
        btnPrEdit.setBorderPainted(false);
        btnPrEdit.setContentAreaFilled(false);
        btnPrEdit.setFocusable(false);
        btnPrEdit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPrEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrEditActionPerformed(evt);
            }
        });
        panelProgramas.add(btnPrEdit);
        btnPrEdit.setBounds(30, 170, 170, 40);

        btnPrPaint.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnPrPaint.setForeground(new java.awt.Color(255, 255, 255));
        btnPrPaint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nueva carpeta/art-and-design.png"))); // NOI18N
        btnPrPaint.setText("  Paint");
        btnPrPaint.setBorder(null);
        btnPrPaint.setBorderPainted(false);
        btnPrPaint.setContentAreaFilled(false);
        btnPrPaint.setFocusable(false);
        btnPrPaint.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPrPaint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrPaintActionPerformed(evt);
            }
        });
        panelProgramas.add(btnPrPaint);
        btnPrPaint.setBounds(30, 210, 170, 40);

        jPanel1.add(panelProgramas);
        panelProgramas.setBounds(241, 370, 240, 260);

        panelMenuInicio.setBackground(new java.awt.Color(24, 43, 69));
        panelMenuInicio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 96, 97)));
        panelMenuInicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nueva carpeta/profile.png"))); // NOI18N
        panelMenuInicio.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 240, 130));

        usuario.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        usuario.setForeground(new java.awt.Color(255, 255, 255));
        usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usuario.setText("Usuario");
        panelMenuInicio.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 240, 50));

        jPanel2.setOpaque(false);
        jPanel2.setLayout(null);

        btnProgramas.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnProgramas.setForeground(new java.awt.Color(255, 255, 255));
        btnProgramas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nueva carpeta/push-pin.png"))); // NOI18N
        btnProgramas.setText("   Programas");
        btnProgramas.setBorder(null);
        btnProgramas.setBorderPainted(false);
        btnProgramas.setContentAreaFilled(false);
        btnProgramas.setFocusable(false);
        btnProgramas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(btnProgramas);
        btnProgramas.setBounds(20, 40, 160, 40);

        btnCerrarSesion.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nueva carpeta/luna.png"))); // NOI18N
        btnCerrarSesion.setText("   Suspender");
        btnCerrarSesion.setBorder(null);
        btnCerrarSesion.setBorderPainted(false);
        btnCerrarSesion.setContentAreaFilled(false);
        btnCerrarSesion.setFocusable(false);
        btnCerrarSesion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(btnCerrarSesion);
        btnCerrarSesion.setBounds(20, 140, 160, 40);

        btnApagar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnApagar.setForeground(new java.awt.Color(255, 255, 255));
        btnApagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nueva carpeta/power.png"))); // NOI18N
        btnApagar.setText("   Apagar");
        btnApagar.setBorder(null);
        btnApagar.setBorderPainted(false);
        btnApagar.setContentAreaFilled(false);
        btnApagar.setFocusable(false);
        btnApagar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(btnApagar);
        btnApagar.setBounds(20, 180, 160, 40);

        btnPrExp.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnPrExp.setForeground(new java.awt.Color(255, 255, 255));
        btnPrExp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nueva carpeta/folder.png"))); // NOI18N
        btnPrExp.setText("   Explorador");
        btnPrExp.setBorder(null);
        btnPrExp.setBorderPainted(false);
        btnPrExp.setContentAreaFilled(false);
        btnPrExp.setFocusable(false);
        btnPrExp.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(btnPrExp);
        btnPrExp.setBounds(20, 80, 160, 40);

        btnAdministrarUsuarios.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnAdministrarUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        btnAdministrarUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nueva carpeta/user.png"))); // NOI18N
        btnAdministrarUsuarios.setText("   Usuarios");
        btnAdministrarUsuarios.setBorder(null);
        btnAdministrarUsuarios.setBorderPainted(false);
        btnAdministrarUsuarios.setContentAreaFilled(false);
        btnAdministrarUsuarios.setFocusable(false);
        btnAdministrarUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(btnAdministrarUsuarios);
        btnAdministrarUsuarios.setBounds(20, 0, 160, 40);

        jSeparator1.setBackground(new java.awt.Color(96, 96, 97));
        jSeparator1.setForeground(new java.awt.Color(96, 96, 97));
        jPanel2.add(jSeparator1);
        jSeparator1.setBounds(0, 130, 240, 10);

        panelMenuInicio.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 240, 230));
        panelMenuInicio.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jSeparator5.setBackground(new java.awt.Color(96, 96, 97));
        jSeparator5.setForeground(new java.awt.Color(96, 96, 97));
        panelMenuInicio.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 240, 10));

        jPanel1.add(panelMenuInicio);
        panelMenuInicio.setBounds(1, 278, 240, 450);

        panelFechayHora.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        panelFechayHora.setOpaque(false);
        panelFechayHora.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fecha.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        fecha.setForeground(new java.awt.Color(255, 255, 255));
        fecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fecha.setText("4/ 12/ 2020");
        panelFechayHora.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 20, 100, 20));

        hora.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        hora.setForeground(new java.awt.Color(255, 255, 255));
        hora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hora.setText("3:40");
        panelFechayHora.add(hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 0, 100, 20));

        btnExplorador.setBackground(new java.awt.Color(204, 204, 255));
        btnExplorador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nueva carpeta/folder.png"))); // NOI18N
        btnExplorador.setBorder(null);
        btnExplorador.setContentAreaFilled(false);
        btnExplorador.setFocusPainted(false);
        btnExplorador.setFocusable(false);
        panelFechayHora.add(btnExplorador, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 70, 40));

        btnInicio.setBackground(new java.awt.Color(204, 204, 255));
        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menu.png"))); // NOI18N
        btnInicio.setBorder(null);
        btnInicio.setContentAreaFilled(false);
        btnInicio.setFocusPainted(false);
        btnInicio.setFocusable(false);
        panelFechayHora.add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 40));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        panelFechayHora.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 20, 50));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        panelFechayHora.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 0, 10, 50));

        btnJuego.setBackground(new java.awt.Color(204, 204, 255));
        btnJuego.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nueva carpeta/newtons-cradle.png"))); // NOI18N
        btnJuego.setBorder(null);
        btnJuego.setContentAreaFilled(false);
        btnJuego.setFocusPainted(false);
        btnJuego.setFocusable(false);
        panelFechayHora.add(btnJuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 70, 40));

        btnCalc.setBackground(new java.awt.Color(204, 204, 255));
        btnCalc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nueva carpeta/math.png"))); // NOI18N
        btnCalc.setBorder(null);
        btnCalc.setContentAreaFilled(false);
        btnCalc.setFocusPainted(false);
        btnCalc.setFocusable(false);
        panelFechayHora.add(btnCalc, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 70, 40));

        btnPapelera.setBackground(new java.awt.Color(204, 204, 255));
        btnPapelera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nueva carpeta/school-bag.png"))); // NOI18N
        btnPapelera.setBorder(null);
        btnPapelera.setContentAreaFilled(false);
        btnPapelera.setFocusPainted(false);
        btnPapelera.setFocusable(false);
        panelFechayHora.add(btnPapelera, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 70, 40));

        btnNavegador.setBackground(new java.awt.Color(204, 204, 255));
        btnNavegador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nueva carpeta/globe.png"))); // NOI18N
        btnNavegador.setBorder(null);
        btnNavegador.setBorderPainted(false);
        btnNavegador.setContentAreaFilled(false);
        btnNavegador.setFocusPainted(false);
        btnNavegador.setFocusable(false);
        panelFechayHora.add(btnNavegador, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 70, 40));

        btnEditor.setBackground(new java.awt.Color(204, 204, 255));
        btnEditor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nueva carpeta/exam.png"))); // NOI18N
        btnEditor.setBorder(null);
        btnEditor.setBorderPainted(false);
        btnEditor.setContentAreaFilled(false);
        btnEditor.setFocusPainted(false);
        btnEditor.setFocusable(false);
        panelFechayHora.add(btnEditor, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 70, 40));

        btnPaint.setBackground(new java.awt.Color(204, 204, 255));
        btnPaint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nueva carpeta/art-and-design.png"))); // NOI18N
        btnPaint.setBorder(null);
        btnPaint.setBorderPainted(false);
        btnPaint.setContentAreaFilled(false);
        btnPaint.setFocusPainted(false);
        btnPaint.setFocusable(false);
        panelFechayHora.add(btnPaint, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 70, 40));

        colorBarra.setBackground(new java.awt.Color(51, 51, 51));
        colorBarra.setOpaque(true);
        panelFechayHora.add(colorBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 40));

        jPanel1.add(panelFechayHora);
        panelFechayHora.setBounds(0, 730, 1370, 40);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Fond.jpg"))); // NOI18N
        jLabel1.setFocusable(false);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1366, 768);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 768));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrEditActionPerformed
        
    }//GEN-LAST:event_btnPrEditActionPerformed

    private void btnPrPaintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrPaintActionPerformed
        
    }//GEN-LAST:event_btnPrPaintActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CcargarES().setVisible(true);
            }
        });
    }

    private void cargarFYH() {
        //FECHA DEL SISTEMA
        Date sistFecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("d/ M/ YYYY");
        fecha.setText(formato.format(sistFecha));
        //HORA DEL SISTEMA
        Timer tiempo = new Timer(100, new CcargarES.horas());
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
    public javax.swing.JButton btnAdministrarUsuarios;
    public javax.swing.JButton btnApagar;
    public javax.swing.JButton btnCalc;
    public javax.swing.JButton btnCerrarSesion;
    public javax.swing.JButton btnEditor;
    public javax.swing.JButton btnExplorador;
    public javax.swing.JButton btnInicio;
    public javax.swing.JButton btnJuego;
    public javax.swing.JButton btnNavegador;
    public javax.swing.JButton btnPaint;
    public javax.swing.JButton btnPapelera;
    public javax.swing.JButton btnPrCal;
    public javax.swing.JButton btnPrEdit;
    public javax.swing.JButton btnPrExp;
    public javax.swing.JButton btnPrJue;
    public javax.swing.JButton btnPrNav;
    public javax.swing.JButton btnPrPaint;
    public javax.swing.JButton btnPrPap;
    public javax.swing.JButton btnProgramas;
    public javax.swing.JButton calculadora;
    private javax.swing.JLabel colorBarra;
    public javax.swing.JButton editor;
    public javax.swing.JButton explorador;
    public javax.swing.JLabel fecha;
    public javax.swing.JLabel hora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    public javax.swing.JButton juego;
    public javax.swing.JButton navegador;
    public javax.swing.JButton paint;
    private javax.swing.JPanel panelFechayHora;
    public javax.swing.JPanel panelMenuInicio;
    public javax.swing.JPanel panelProgramas;
    public javax.swing.JButton papelera;
    public javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}
