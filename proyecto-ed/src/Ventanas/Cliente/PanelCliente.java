package Ventanas.Cliente;

import Entidades.Camino;
import Frames.BebidasDelivery;
import Frames.BrasasDelivery;
import Frames.CarritoDelivery;
import Frames.CartasDelivery;
import Frames.EnsaladasDelivery;
import Frames.EntradasDelivery;
import Frames.GuarnicionesDelivery;
import Frames.MainClientes;
import Frames.Mapa;
import static Frames.Rutas.gr;
import Ventanas.Ingreso.Login;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class PanelCliente extends javax.swing.JFrame {

    String av;
    private boolean sidebar;

    public PanelCliente() {
        initComponents();
        EstablecerIcono();
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
        deliveryLabel = new javax.swing.JLabel();
        rutasLabel = new javax.swing.JLabel();
        sugerenciasLabel = new javax.swing.JLabel();
        bgEscritorio = new javax.swing.JPanel();
        deliveryPanel = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        rutasPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel95 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox<>();
        jButton23 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jButton24 = new javax.swing.JButton();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jButton25 = new javax.swing.JButton();
        sugerenciasPanel = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Tomapedido");
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
        btnSidebar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventanas/Iconos/menu_32px.png"))); // NOI18N
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
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventanas/Iconos/salir.png"))); // NOI18N
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
        btnConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventanas/Iconos/settings_32px.png"))); // NOI18N
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 453, Short.MAX_VALUE)
                .addComponent(bgSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bgMenu.add(bgMenuIconos, java.awt.BorderLayout.LINE_START);

        bgMenuOculto.setBackground(new java.awt.Color(34, 45, 49));

        deliveryLabel.setBackground(new java.awt.Color(34, 45, 49));
        deliveryLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        deliveryLabel.setForeground(new java.awt.Color(255, 255, 255));
        deliveryLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deliveryLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventanas/Iconos/delivery.png"))); // NOI18N
        deliveryLabel.setText("Delivery");
        deliveryLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deliveryLabel.setOpaque(true);
        deliveryLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deliveryLabelMouseClicked(evt);
            }
        });

        rutasLabel.setBackground(new java.awt.Color(34, 45, 49));
        rutasLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rutasLabel.setForeground(new java.awt.Color(255, 255, 255));
        rutasLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rutasLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventanas/Iconos/mapa.png"))); // NOI18N
        rutasLabel.setText("Ver rutas");
        rutasLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rutasLabel.setOpaque(true);
        rutasLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rutasLabelMouseClicked(evt);
            }
        });

        sugerenciasLabel.setBackground(new java.awt.Color(34, 45, 49));
        sugerenciasLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sugerenciasLabel.setForeground(new java.awt.Color(255, 255, 255));
        sugerenciasLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sugerenciasLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventanas/Iconos/sugerencia.png"))); // NOI18N
        sugerenciasLabel.setText("Sugerencias");
        sugerenciasLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sugerenciasLabel.setOpaque(true);
        sugerenciasLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sugerenciasLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bgMenuOcultoLayout = new javax.swing.GroupLayout(bgMenuOculto);
        bgMenuOculto.setLayout(bgMenuOcultoLayout);
        bgMenuOcultoLayout.setHorizontalGroup(
            bgMenuOcultoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(deliveryLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(rutasLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sugerenciasLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bgMenuOcultoLayout.setVerticalGroup(
            bgMenuOcultoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgMenuOcultoLayout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(deliveryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rutasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sugerenciasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(296, Short.MAX_VALUE))
        );

        bgMenu.add(bgMenuOculto, java.awt.BorderLayout.CENTER);

        getContentPane().add(bgMenu, java.awt.BorderLayout.LINE_START);

        bgEscritorio.setLayout(new java.awt.CardLayout());

        deliveryPanel.setBackground(new java.awt.Color(236, 239, 244));

        jPanel4.setBackground(new java.awt.Color(237, 51, 56));
        jPanel4.setPreferredSize(new java.awt.Dimension(808, 55));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("BIENVENIDO AL SISTEMA");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        jButton8.setBackground(new java.awt.Color(255, 0, 51));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("VER CARRITO");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("BRASAS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 204, 0));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pierna-de-pollo.png"))); // NOI18N
        jLabel7.setOpaque(true);

        jButton2.setBackground(new java.awt.Color(255, 51, 51));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("ENSALADAS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 204, 0));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bebidas.png"))); // NOI18N
        jLabel5.setOpaque(true);

        jButton3.setBackground(new java.awt.Color(255, 51, 51));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("BEBIDAS");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 204, 0));
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ensalada.png"))); // NOI18N
        jLabel6.setOpaque(true);

        jButton4.setBackground(new java.awt.Color(255, 51, 51));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("GUARNICIONES");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 204, 0));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/papas-fritas.png"))); // NOI18N
        jLabel8.setOpaque(true);

        jButton5.setBackground(new java.awt.Color(255, 51, 51));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("A LA CARTA");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 204, 0));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carne.png"))); // NOI18N
        jLabel9.setOpaque(true);

        jButton6.setBackground(new java.awt.Color(255, 51, 51));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("ENTRADAS");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(255, 204, 0));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cuchilleria.png"))); // NOI18N
        jLabel13.setOpaque(true);

        javax.swing.GroupLayout deliveryPanelLayout = new javax.swing.GroupLayout(deliveryPanel);
        deliveryPanel.setLayout(deliveryPanelLayout);
        deliveryPanelLayout.setHorizontalGroup(
            deliveryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deliveryPanelLayout.createSequentialGroup()
                .addGroup(deliveryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 1021, Short.MAX_VALUE)
                    .addGroup(deliveryPanelLayout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addGroup(deliveryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(deliveryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(deliveryPanelLayout.createSequentialGroup()
                                .addGap(184, 184, 184)
                                .addComponent(jButton8))
                            .addGroup(deliveryPanelLayout.createSequentialGroup()
                                .addGap(137, 137, 137)
                                .addGroup(deliveryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(deliveryPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(137, 137, 137)
                                        .addComponent(jLabel6))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deliveryPanelLayout.createSequentialGroup()
                                        .addGroup(deliveryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(deliveryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                        .addGap(0, 184, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(deliveryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(deliveryPanelLayout.createSequentialGroup()
                    .addGap(709, 709, 709)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(188, Short.MAX_VALUE)))
        );
        deliveryPanelLayout.setVerticalGroup(
            deliveryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deliveryPanelLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(deliveryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(deliveryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(deliveryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3)
                        .addComponent(jButton1))
                    .addComponent(jButton2))
                .addGap(21, 21, 21)
                .addGroup(deliveryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(deliveryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(jButton8)
                .addGap(45, 45, 45))
            .addGroup(deliveryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(deliveryPanelLayout.createSequentialGroup()
                    .addGap(97, 97, 97)
                    .addComponent(jLabel7)
                    .addGap(208, 208, 208)
                    .addComponent(jButton6)
                    .addContainerGap(153, Short.MAX_VALUE)))
        );

        bgEscritorio.add(deliveryPanel, "card2");

        rutasPanel.setBackground(new java.awt.Color(0, 153, 153));

        jPanel3.setBackground(new java.awt.Color(237, 51, 56));
        jPanel3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.setPreferredSize(new java.awt.Dimension(1027, 55));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("BIENVENIDO AL SISTEMA");
        jLabel10.setToolTipText("");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 1027, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        jPanel9.setBackground(new java.awt.Color(0, 153, 153));

        jLabel95.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel95.setForeground(new java.awt.Color(255, 204, 0));
        jLabel95.setText("LUGAR CERCANO DONDE SE ENCUENTRA USTED");

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13" }));
        jComboBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox7ActionPerformed(evt);
            }
        });

        jButton23.setText("VER RUTA");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jTextArea6.setColumns(20);
        jTextArea6.setRows(5);
        jScrollPane6.setViewportView(jTextArea6);

        jButton24.setText("REGRESAR");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jLabel96.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mediterraneo-logo (1).png"))); // NOI18N

        jLabel97.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel97.setForeground(new java.awt.Color(255, 204, 0));
        jLabel97.setText("RUTA");

        jLabel98.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel98.setForeground(new java.awt.Color(255, 204, 0));
        jLabel98.setText("DISTANCIA");

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jLabel99.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel99.setForeground(new java.awt.Color(255, 204, 0));
        jLabel99.setText("1. MALECON BALTA");

        jLabel100.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel100.setForeground(new java.awt.Color(255, 204, 0));
        jLabel100.setText("2. JOSE PARDO");

        jLabel101.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel101.setForeground(new java.awt.Color(255, 204, 51));
        jLabel101.setText("3. ALFREDO BENAVIDES");

        jLabel102.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel102.setForeground(new java.awt.Color(255, 204, 0));
        jLabel102.setText("4. MARISCAL RAMON CASTILLA");

        jLabel103.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel103.setForeground(new java.awt.Color(255, 204, 0));
        jLabel103.setText("5. VELASCO");

        jLabel104.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel104.setForeground(new java.awt.Color(255, 204, 0));
        jLabel104.setText("6. ANGAMOS");

        jLabel105.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel105.setForeground(new java.awt.Color(255, 204, 0));
        jLabel105.setText("7. AVIACION");

        jLabel106.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel106.setForeground(new java.awt.Color(255, 204, 0));
        jLabel106.setText("8. CAMINOS DEL INCA");

        jLabel107.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel107.setForeground(new java.awt.Color(255, 204, 0));
        jLabel107.setText("9. AREQUIPA");

        jLabel108.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel108.setForeground(new java.awt.Color(255, 204, 0));
        jLabel108.setText("10. OVALO HIGUERETA");

        jLabel109.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel109.setForeground(new java.awt.Color(255, 204, 0));
        jLabel109.setText("11. RICARDO PALMA");

        jLabel110.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel110.setForeground(new java.awt.Color(255, 204, 0));
        jLabel110.setText("12. SAN BORJA");

        jLabel111.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel111.setForeground(new java.awt.Color(255, 204, 0));
        jLabel111.setText("13. MEDITERRANEO");

        jButton25.setText("VER MAPA");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel95)
                                .addGap(87, 87, 87)
                                .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                                    .addGap(249, 249, 249)
                                    .addComponent(jButton24))
                                .addGroup(jPanel9Layout.createSequentialGroup()
                                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel98)
                                        .addComponent(jLabel97))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel96))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(jButton23)
                        .addGap(86, 86, 86)
                        .addComponent(jButton25)))
                .addGap(96, 96, 96)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel104)
                    .addComponent(jLabel101)
                    .addComponent(jLabel100)
                    .addComponent(jLabel99)
                    .addComponent(jLabel102)
                    .addComponent(jLabel103)
                    .addComponent(jLabel105)
                    .addComponent(jLabel106)
                    .addComponent(jLabel107)
                    .addComponent(jLabel108)
                    .addComponent(jLabel109)
                    .addComponent(jLabel110)
                    .addComponent(jLabel111))
                .addContainerGap(207, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel96)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel99)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel100)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel101)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel95)
                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel102))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel103)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton23)
                            .addComponent(jButton25)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel104)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel105)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel106)
                .addGap(1, 1, 1)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel98)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel107))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addGap(49, 49, 49)
                            .addComponent(jLabel97)
                            .addGap(41, 41, 41))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel108)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel109)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel110)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel111)
                            .addGap(20, 20, 20)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jButton24)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout rutasPanelLayout = new javax.swing.GroupLayout(rutasPanel);
        rutasPanel.setLayout(rutasPanelLayout);
        rutasPanelLayout.setHorizontalGroup(
            rutasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(rutasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(rutasPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        rutasPanelLayout.setVerticalGroup(
            rutasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rutasPanelLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 554, Short.MAX_VALUE))
            .addGroup(rutasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(rutasPanelLayout.createSequentialGroup()
                    .addGap(85, 85, 85)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(87, Short.MAX_VALUE)))
        );

        bgEscritorio.add(rutasPanel, "card3");

        sugerenciasPanel.setBackground(new java.awt.Color(102, 102, 255));

        jPanel5.setBackground(new java.awt.Color(0, 153, 153));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Administrar Recepcionistas");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(569, 569, 569))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout sugerenciasPanelLayout = new javax.swing.GroupLayout(sugerenciasPanel);
        sugerenciasPanel.setLayout(sugerenciasPanelLayout);
        sugerenciasPanelLayout.setHorizontalGroup(
            sugerenciasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sugerenciasPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(281, Short.MAX_VALUE))
        );
        sugerenciasPanelLayout.setVerticalGroup(
            sugerenciasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sugerenciasPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(549, Short.MAX_VALUE))
        );

        bgEscritorio.add(sugerenciasPanel, "card4");

        getContentPane().add(bgEscritorio, java.awt.BorderLayout.CENTER);

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

    public void setDefault(Color color) {

        deliveryLabel.setBackground(color);
        rutasLabel.setBackground(color);
        sugerenciasLabel.setBackground(color);
        deliveryPanel.setVisible(false);
        rutasPanel.setVisible(false);

    }

    public void limpiarEscritorio(JLabel label, JPanel panel) {

        setDefault(new Color(34, 45, 49));
        label.setBackground(new Color(44, 59, 66));
        panel.setVisible(true);
        mostrarOculto(bgMenu, sidebar, btnSidebar);
        SwingUtilities.updateComponentTreeUI(this);
        sidebar = !sidebar;

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
            cambiarImagen(button, "/Ventanas/Iconos/menu_32px.png");
        } else {
            menushowhide.setPreferredSize(new Dimension(270, menushowhide.getHeight()));
            cambiarImagen(button, "/Ventanas/Iconos/back_32px.png");
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

        Login clinica = new Login();
        clinica.setVisible(true);
        JOptionPane.showMessageDialog(null, "Sesion cerrada");
        dispose();
 
    }//GEN-LAST:event_btnSalirMouseClicked

    private void deliveryLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deliveryLabelMouseClicked
        limpiarEscritorio(deliveryLabel, deliveryPanel);
    }//GEN-LAST:event_deliveryLabelMouseClicked

    private void rutasLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rutasLabelMouseClicked
        limpiarEscritorio(rutasLabel, rutasPanel);
    }//GEN-LAST:event_rutasLabelMouseClicked

    private void sugerenciasLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sugerenciasLabelMouseClicked
        limpiarEscritorio(sugerenciasLabel, sugerenciasPanel);    
    }//GEN-LAST:event_sugerenciasLabelMouseClicked

    private void btnConfiguracionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfiguracionMouseEntered
        cambiarColor(bgLineaConfig, new Color(247, 78, 105));
    }//GEN-LAST:event_btnConfiguracionMouseEntered

    private void btnConfiguracionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfiguracionMouseExited
        cambiarColor(bgLineaConfig, new Color(18, 31, 35));
    }//GEN-LAST:event_btnConfiguracionMouseExited

    private void btnConfiguracionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfiguracionMouseClicked
        //GestionarAdministrativos administrativo = new GestionarAdministrativos();
       // administrativo.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnConfiguracionMouseClicked

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        CarritoDelivery main = new CarritoDelivery();
        main.setLocationRelativeTo(null);
        main.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        BrasasDelivery login = new BrasasDelivery();
        login.setLocationRelativeTo(null);
        login.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        EnsaladasDelivery login = new EnsaladasDelivery();
        login.setLocationRelativeTo(null);
        login.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        BebidasDelivery beb = new BebidasDelivery();
        beb.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        GuarnicionesDelivery login = new GuarnicionesDelivery();
        login.setLocationRelativeTo(null);
        login.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        CartasDelivery login = new CartasDelivery();
        login.setLocationRelativeTo(null);
        login.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        EntradasDelivery login = new EntradasDelivery();
        login.setLocationRelativeTo(null);
        login.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jComboBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox7ActionPerformed
        av = jComboBox2.getSelectedItem().toString();
    }//GEN-LAST:event_jComboBox7ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        int opc = Integer.parseInt(jComboBox2.getSelectedItem().toString());
        Camino cam = (Camino) gr.caminoMinimo(opc);
        jTextField1.setText(Integer.toString(cam.getDistancia())+" metros");
        jTextArea1.setText(cam.getRecorrido());

    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        MainClientes login = new MainClientes();
        login.setLocationRelativeTo(null);
        login.setVisible(true);
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        Mapa login = new Mapa();
        login.setLocationRelativeTo(null);
        login.setVisible(true);
    }//GEN-LAST:event_jButton25ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new PanelCliente().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgConfiguracion;
    private javax.swing.JPanel bgEscritorio;
    private javax.swing.JPanel bgLineaConfig;
    private javax.swing.JPanel bgLineaSide;
    private javax.swing.JPanel bgMenu;
    private javax.swing.JPanel bgMenuIconos;
    private javax.swing.JPanel bgMenuOculto;
    private javax.swing.JPanel bgSalir;
    private javax.swing.JPanel bgSidebar;
    private javax.swing.JLabel btnConfiguracion;
    private javax.swing.JLabel btnSalir;
    private javax.swing.JLabel btnSidebar;
    private javax.swing.JLabel deliveryLabel;
    private javax.swing.JPanel deliveryPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel rutasLabel;
    private javax.swing.JPanel rutasPanel;
    private javax.swing.JLabel sugerenciasLabel;
    private javax.swing.JPanel sugerenciasPanel;
    // End of variables declaration//GEN-END:variables
}
