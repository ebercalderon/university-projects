package vista;

import chrriis.dj.nativeswing.swtimpl.NativeInterface;
import chrriis.dj.nativeswing.swtimpl.components.JWebBrowser;
import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class EcargarNa extends javax.swing.JFrame {

    JWebBrowser navegador = new JWebBrowser();

    public EcargarNa() {
        initComponents();
        this.setTitle("Navegador Predeterminado");
        this.setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        this.setIconImage(new ImageIcon(getClass().getResource("/imagenes/nav.png")).getImage());
        this.setLocationRelativeTo(null);

        navega1.setLayout(new BorderLayout());
        navegador.navigate("http://www.google.com.mx");
        navegador.setStatusBarVisible(false);
        navegador.setBarsVisible(false);
        navegador.setButtonBarVisible(false);
        navegador.setLocationBarVisible(false);
        navega1.add(navegador);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelNavegador = new javax.swing.JPanel();
        url = new app.bolivia.swing.JCTextField();
        adelante = new javax.swing.JButton();
        atras = new javax.swing.JButton();
        navega1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);

        panelNavegador.setBackground(new java.awt.Color(255, 255, 255));

        url.setForeground(new java.awt.Color(0, 102, 153));
        url.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        url.setPlaceholder("Ingresar URL");
        url.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                urlKeyPressed(evt);
            }
        });

        adelante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha-correcta.png"))); // NOI18N
        adelante.setToolTipText("Siguiente");
        adelante.setContentAreaFilled(false);
        adelante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adelante.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/adelante1.png"))); // NOI18N
        adelante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adelanteActionPerformed(evt);
            }
        });

        atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha-izquierda.png"))); // NOI18N
        atras.setToolTipText("Atras");
        atras.setContentAreaFilled(false);
        atras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        atras.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atras1.png"))); // NOI18N
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });

        navega1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout navega1Layout = new javax.swing.GroupLayout(navega1);
        navega1.setLayout(navega1Layout);
        navega1Layout.setHorizontalGroup(
            navega1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        navega1Layout.setVerticalGroup(
            navega1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 375, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelNavegadorLayout = new javax.swing.GroupLayout(panelNavegador);
        panelNavegador.setLayout(panelNavegadorLayout);
        panelNavegadorLayout.setHorizontalGroup(
            panelNavegadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNavegadorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adelante, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(url, javax.swing.GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(navega1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelNavegadorLayout.setVerticalGroup(
            panelNavegadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNavegadorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelNavegadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(url, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adelante, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(navega1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelNavegador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelNavegador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void urlKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_urlKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (evt.getSource() == url) {
                navegador.navigate(url.getText());
                this.url.setText("");
            }
        }
    }//GEN-LAST:event_urlKeyPressed

    private void adelanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adelanteActionPerformed
        navegador.navigateForward();
    }//GEN-LAST:event_adelanteActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        navegador.navigateBack();
    }//GEN-LAST:event_atrasActionPerformed
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        NativeInterface.open();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adelante;
    private javax.swing.JButton atras;
    private javax.swing.JPanel navega1;
    private javax.swing.JPanel panelNavegador;
    private app.bolivia.swing.JCTextField url;
    // End of variables declaration//GEN-END:variables

}
