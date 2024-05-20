
package vista;

import javax.swing.ImageIcon;
import javax.swing.JButton;


public class VentanaPrincipal extends javax.swing.JFrame {
    private boolean casilla[][] = new boolean[3][3]; 
    private String turno = "usuario1";
    private int matriz[][] = new int[3][3];
    private String usuario1,usuario2;
    private int vecesGanadas1=0,vecesGanadas2=0,vecesEmpate=0;

    public VentanaPrincipal(String usuario1,String usuario2) {
        initComponents();
        setSize(600, 600);
        setLocationRelativeTo(null);
        inicializarCasillas();
        llenarMatriz();
        this.usuario1 = usuario1;
        this.usuario2 = usuario2;

    }
    
    private void inicializarCasillas(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                casilla[i][j] = true;
            }
        }
    }
    
    private void llenarMatriz(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matriz[i][j] = 0;
            }
        }
    }
    
    //Método para dibujar X
    private void dibujarX(JButton boton){
        boton.setIcon(new ImageIcon(getClass().getResource("/imagenesJuego/x.png")));
    }
    
    //Método para dibujar O
    private void dibujarO(JButton boton){
        boton.setIcon(new ImageIcon(getClass().getResource("/imagenesJuego/o.png")));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        arribaIzquierda = new javax.swing.JButton();
        arriba = new javax.swing.JButton();
        arribaDerecha = new javax.swing.JButton();
        izquierda = new javax.swing.JButton();
        centro = new javax.swing.JButton();
        derecha = new javax.swing.JButton();
        abajoIzquierda = new javax.swing.JButton();
        abajo = new javax.swing.JButton();
        abajoDerecha = new javax.swing.JButton();
        barraMenu = new javax.swing.JMenuBar();
        menuJuego = new javax.swing.JMenu();
        comenzarDeNuevo = new javax.swing.JMenuItem();
        mostrarResultados = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        salir = new javax.swing.JMenuItem();
        menuAyuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setIconImage(new ImageIcon(getClass().getResource("/imagenesJuego/juego.png")).getImage());

        panel.setBackground(java.awt.Color.darkGray);
        panel.setLayout(new java.awt.GridLayout(3, 3));

        arribaIzquierda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        arribaIzquierda.setContentAreaFilled(false);
        arribaIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arribaIzquierdaActionPerformed(evt);
            }
        });
        panel.add(arribaIzquierda);

        arriba.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        arriba.setContentAreaFilled(false);
        arriba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arribaActionPerformed(evt);
            }
        });
        panel.add(arriba);

        arribaDerecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        arribaDerecha.setContentAreaFilled(false);
        arribaDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arribaDerechaActionPerformed(evt);
            }
        });
        panel.add(arribaDerecha);

        izquierda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        izquierda.setContentAreaFilled(false);
        izquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                izquierdaActionPerformed(evt);
            }
        });
        panel.add(izquierda);

        centro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        centro.setContentAreaFilled(false);
        centro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                centroActionPerformed(evt);
            }
        });
        panel.add(centro);

        derecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        derecha.setContentAreaFilled(false);
        derecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                derechaActionPerformed(evt);
            }
        });
        panel.add(derecha);

        abajoIzquierda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        abajoIzquierda.setContentAreaFilled(false);
        abajoIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abajoIzquierdaActionPerformed(evt);
            }
        });
        panel.add(abajoIzquierda);

        abajo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        abajo.setContentAreaFilled(false);
        abajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abajoActionPerformed(evt);
            }
        });
        panel.add(abajo);

        abajoDerecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        abajoDerecha.setContentAreaFilled(false);
        abajoDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abajoDerechaActionPerformed(evt);
            }
        });
        panel.add(abajoDerecha);

        menuJuego.setText("Juego");
        menuJuego.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N

        comenzarDeNuevo.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        comenzarDeNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesJuego/comenzarNuevo.png"))); // NOI18N
        comenzarDeNuevo.setText("Comenzar de nuevo");
        comenzarDeNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comenzarDeNuevoActionPerformed(evt);
            }
        });
        menuJuego.add(comenzarDeNuevo);

        mostrarResultados.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        mostrarResultados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesJuego/tabla.png"))); // NOI18N
        mostrarResultados.setText("Mostrar resultados");
        mostrarResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarResultadosActionPerformed(evt);
            }
        });
        menuJuego.add(mostrarResultados);
        menuJuego.add(jSeparator1);

        salir.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesJuego/salir.png"))); // NOI18N
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        menuJuego.add(salir);

        barraMenu.add(menuJuego);

        menuAyuda.setText("Ayuda");
        menuAyuda.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        menuAyuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuAyudaMouseClicked(evt);
            }
        });
        menuAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAyudaActionPerformed(evt);
            }
        });
        barraMenu.add(menuAyuda);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        this.dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void arribaIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arribaIzquierdaActionPerformed
        if(casilla[0][0]==true){
            if(turno.equals("usuario1")){
                dibujarX(arribaIzquierda);
                matriz[0][0] = 1;
                turno = "usuario2";
            }
            else{
                dibujarO(arribaIzquierda);
                matriz[0][0] = 2;
                turno = "usuario1";
            }
           
            casilla[0][0] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_arribaIzquierdaActionPerformed

    private void arribaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arribaActionPerformed
        if(casilla[0][1]==true){
            if(turno.equals("usuario1")){
                dibujarX(arriba);
                matriz[0][1] = 1;
                turno = "usuario2";
            }
            else{
                dibujarO(arriba);
                matriz[0][1] = 2;
                turno = "usuario1";
            }
            
            casilla[0][1] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_arribaActionPerformed

    private void arribaDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arribaDerechaActionPerformed
        if(casilla[0][2]==true){
            if(turno.equals("usuario1")){
                dibujarX(arribaDerecha);
                matriz[0][2] = 1;
                turno = "usuario2";
            }
            else{
                dibujarO(arribaDerecha);
                matriz[0][2] = 2;
                turno = "usuario1";
            }
            
            casilla[0][2] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_arribaDerechaActionPerformed

    private void izquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_izquierdaActionPerformed
        if(casilla[1][0]==true){
            if(turno.equals("usuario1")){
                dibujarX(izquierda);
                matriz[1][0] = 1;
                turno = "usuario2";
            }
            else{
                dibujarO(izquierda);
                matriz[1][0] = 2;
                turno = "usuario1";
            }
            
            casilla[1][0] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_izquierdaActionPerformed

    private void centroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_centroActionPerformed
        if(casilla[1][1]==true){
            if(turno.equals("usuario1")){
                dibujarX(centro);
                matriz[1][1] = 1;
                turno = "usuario2";
            }
            else{
                dibujarO(centro);
                matriz[1][1] = 2;
                turno = "usuario1";
            }
            
            casilla[1][1] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_centroActionPerformed

    private void derechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_derechaActionPerformed
        if(casilla[1][2]==true){
            if(turno.equals("usuario1")){
                dibujarX(derecha);
                matriz[1][2] = 1;
                turno = "usuario2";
            }
            else{
                dibujarO(derecha);
                matriz[1][2] = 2;
                turno = "usuario1";
            }
            
            casilla[1][2] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_derechaActionPerformed

    private void abajoIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abajoIzquierdaActionPerformed
        if(casilla[2][0]==true){
            if(turno.equals("usuario1")){
                dibujarX(abajoIzquierda);
                matriz[2][0] = 1;
                turno = "usuario2";
            }
            else{
                dibujarO(abajoIzquierda);
                matriz[2][0] = 2;
                turno = "usuario1";
            }
            
            casilla[2][0] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_abajoIzquierdaActionPerformed

    private void abajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abajoActionPerformed
        if(casilla[2][1]==true){
            if(turno.equals("usuario1")){
                dibujarX(abajo);
                matriz[2][1] = 1;
                turno = "usuario2";
            }
            else{
                dibujarO(abajo);
                matriz[2][1] = 2;
                turno = "usuario1";
            }
            
            casilla[2][1] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_abajoActionPerformed

    private void abajoDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abajoDerechaActionPerformed
        if(casilla[2][2]==true){
            if(turno.equals("usuario1")){
                dibujarX(abajoDerecha);
                matriz[2][2] = 1;
                turno = "usuario2";
            }
            else{
                dibujarO(abajoDerecha);
                matriz[2][2] = 2;
                turno = "usuario1";
            }
            
            casilla[2][2] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_abajoDerechaActionPerformed

    private void comenzarDeNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comenzarDeNuevoActionPerformed
        vecesGanadas1=0;vecesGanadas2=0;vecesEmpate=0;
        reiniciarJuego();
    }//GEN-LAST:event_comenzarDeNuevoActionPerformed

    private void mostrarResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarResultadosActionPerformed
        VentanaMostrarResultados ventanaMR = new VentanaMostrarResultados(this, true, vecesGanadas1, vecesGanadas2, vecesEmpate, usuario1, usuario2);
        ventanaMR.setVisible(true);
    }//GEN-LAST:event_mostrarResultadosActionPerformed

    private void menuAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAyudaActionPerformed
        
    }//GEN-LAST:event_menuAyudaActionPerformed

    private void menuAyudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAyudaMouseClicked
//        try {
//            try {
//                Desktop.getDesktop().browse(new URI("https://www.guiainfantil.com/articulos/ocio/juegos/juego-de-tres-en-raya-como-jugar-con-los-ninos-con-papel-y-lapiz/"));
//            } catch (IOException ex) {
                //Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        } catch (URISyntaxException ex) {
            //Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_menuAyudaMouseClicked
    
    private void comprobarGanador(){
        boolean ganador1= false;
        boolean ganador2= false;
        int casillasEmpate = 0;
        
        //Comprobamos si el ganador es Usuario1
        ganador1 = comprobando(1);
        
        //Comprobando si el ganador es Usuario2
        ganador2 = comprobando(2);
        
        
        if(ganador1==true){
            vecesGanadas1++;
            VentanaG ventanaGanador = new VentanaG(this, true, usuario1);
            ventanaGanador.setVisible(true);
            reiniciarJuego();
        }
        else if(ganador2==true){
            vecesGanadas2++;
            VentanaG ventanaGanador = new VentanaG(this, true, usuario2);
            ventanaGanador.setVisible(true);
            reiniciarJuego();
        }
        else{ //puede ser que el tablero este lleno, entonces empate
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    if(matriz[i][j]!=0){
                        casillasEmpate++;
                    }
                }
            }
            
            if(casillasEmpate==9){
                vecesEmpate++;
                VentanaE ventanaEmpate = new VentanaE(this, true);
                ventanaEmpate.setVisible(true);
                reiniciarJuego();
            }
            else{
                casillasEmpate=0;
            }
        }
    }
    
    private boolean comprobando(int num){
        boolean ganador=false;
        
        if(matriz[0][0]==num && matriz[1][0]==num && matriz[2][0]==num){
            ganador = true;
        }
        else if(matriz[0][1]==num && matriz[1][1]==num && matriz[2][1]==num){
            ganador = true;
        }
        else if(matriz[0][2]==num && matriz[1][2]==num && matriz[2][2]==num){
            ganador = true;
        }
        else if(matriz[0][0]==num && matriz[0][1]==num && matriz[0][2]==num){
            ganador = true;
        }
        else if(matriz[1][0]==num && matriz[1][1]==num && matriz[1][2]==num){
            ganador = true;
        }
        else if(matriz[2][0]==num && matriz[2][1]==num && matriz[2][2]==num){
            ganador = true;
        }
        else if(matriz[0][0]==num && matriz[1][1]==num && matriz[2][2]==num){
            ganador = true; 
        }
        else if(matriz[0][2]==num && matriz[1][1]==num && matriz[2][0]==num){
            ganador = true;
        }
        
        return ganador;
    }
    
    private void reiniciarJuego(){
        //Primero regresamos todas las casillas a true
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                casilla[i][j] = true;
            }
        }
        
        //Segundo regresamos la matriz a 0
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matriz[i][j] = 0;
            }
        }
        
        //Por ultimo le quitamos las imagenes a los botones
        abajo.setIcon(null);
        abajoDerecha.setIcon(null);
        abajoIzquierda.setIcon(null);
        arriba.setIcon(null);
        arribaDerecha.setIcon(null);
        arribaIzquierda.setIcon(null);
        centro.setIcon(null);
        izquierda.setIcon(null);
        derecha.setIcon(null);
        
        //Vamos a preguntarle al usuario quien va a jugar primero
        quienJuegaPrimero();
    }
    
    private void quienJuegaPrimero(){
        EscogerTu ventanaET = new EscogerTu(this, true, usuario1, usuario2);
        ventanaET.setVisible(true);
        turno = ventanaET.getTurno();
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal(null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton abajo;
    private javax.swing.JButton abajoDerecha;
    private javax.swing.JButton abajoIzquierda;
    private javax.swing.JButton arriba;
    private javax.swing.JButton arribaDerecha;
    private javax.swing.JButton arribaIzquierda;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton centro;
    private javax.swing.JMenuItem comenzarDeNuevo;
    private javax.swing.JButton derecha;
    private javax.swing.JButton izquierda;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenu menuJuego;
    private javax.swing.JMenuItem mostrarResultados;
    private javax.swing.JPanel panel;
    private javax.swing.JMenuItem salir;
    // End of variables declaration//GEN-END:variables
}
