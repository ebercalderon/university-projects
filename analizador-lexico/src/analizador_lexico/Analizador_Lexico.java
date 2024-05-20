package analizador_lexico;

import javax.swing.table.DefaultTableModel;

public class Analizador_Lexico extends javax.swing.JFrame {

    String cadena;
    String buffer;
    int indicador;
    int obs = 1;
    Analizador _Analizador = new Analizador();
    DefaultTableModel _Table = new DefaultTableModel();

    public Analizador_Lexico() {
        indicador = 0;
        initComponents();
    }

    int Scanner() {
        buffer = " ";
        char caracter;
        int i = 0, estado = 0;

        for (;;) {
            caracter = cadena.charAt(indicador); //quita letra por letra caracter la cadena
            
            if ((caracter == '$' && i == 0) || (obs == 0)) {
                return 0;
            } else if (caracter == '$') {
                switch (estado) {
                    case 1:
                        return _Analizador._Palabra(buffer); // Palabra reservada(200) o Identificador retorna(300)
                    case 2:
                        return 100; // operador >
                    case 3:
                        return 500; // literal numero
                    case 4:
                        return 400;  //op.delimitador
                    case 5:
                        return 500;
                    case 6:
                        return 110;
                    case 7:
                        return 111;
                    case 8:
                        return 101;
                    case 9:
                        return 102;
                    case 10:
                        return 107;

                } // fin switch 
            } else {
                buffer = buffer.trim();
                switch (estado) {
                    /**
                    * Si a es letra, analiza la siguiente letra en el estado 1
                    * Si a es un numero, pasa al estado 3
                    * Si a es operador, pasa al estado 2
                    */
                    case 0:
                        buffer = buffer + caracter;
                        if (Character.isLetter(caracter)) {
                            estado = 1;
                            i++;
                        }
                        else if (Character.isDigit(caracter)) {
                            estado = 3;
                            i++;
                        }
                        else if (_Analizador.Operador(caracter)) {
                            //estado = 2;
                            i++;
                            indicador++;
                            return _Analizador._Operador(caracter);
                        }
                        else if (caracter == '<') {
                            estado = 6;
                            i++;
                        } //si es < analiza si el siguiente en el estado 6 es =  para formar <=
                        else if (caracter == '>') {
                            estado = 7;
                            i++;
                        } //si es >analiza si el siguiente en el estado 6 es = para formar >=
                        else if (caracter == '=') {
                            estado = 10;
                            i++;
                        } //si es = analiza si el siguiente en el estado 6 es = para formar nuestro == asignación
                        else if (caracter == '~') {
                            estado = 11;
                            i++;
                        } //si es ~ analiza si el siguiente en el estado 6 es = para nuestro diferendete de
                        else if (caracter == '+') {
                            estado = 8;
                            i++;
                        } //si es + analiza si el siguiente en el estado 6 es + para nuestro aumento ++
                        else if (caracter == '-') {
                            estado = 9;
                            i++;
                        } //si es - analiza si el siguiente en el estado 6 es - para nuestra dismunucion --
                        else if (_Analizador.Delimitadores(caracter)) {
                            indicador++;
                            i++;
                            
                            if (caracter == ':' && cadena.charAt(indicador) == ':'){
                                buffer = buffer + cadena.charAt(indicador);
                                indicador++;
                                return 302;
                            }
                            else {
                                return _Analizador._Delimitadores(caracter);
                            }
                            
                        } else if (caracter != ' ') {
                            return 955;// si no reconoce ninguna de las anteriores comparaciones y no es vacio nos retorna cualquier 555 que es un codigo para el default de nuestro metodo jButton3MouseClicked
                        } else {
                            estado = 0;
                        }
                        break;

                    case 1:
                        if ((Character.isLetter(caracter))) {
                            buffer = buffer + caracter; //va almacenando mi letra o numero hasta que se distinto de letra o numero
                            estado = 1;
                        } else {
                            return _Analizador._Palabra(buffer);  //me retorna 200(palabra reservada) o 300(identificador)
                        }
                        i++;
                        break;

                    // case 2: if(_Analizador.Operador(caracter)){buffer=buffer+caracter;indicador++; return 100;} //si el siguiente es operador tmbn me retorna 100
                    case 3:
                        if (Character.isDigit(caracter)) {
                            buffer = buffer + caracter;
                            //indicador++;
                            estado = 3;
                        } //si es numero se van acumulando
                        else {
                            if (caracter == '.') {
                                buffer = buffer + caracter;
                                estado = 5;
                                i++;
                            } //si llega un punto pasa al estado 5 para seguir acumulando numeros
                            else {
                                return 500;
                            }
                        }
                        i++;
                        break;
                    //case 4:  
                        
                    case 5:
                        if (Character.isDigit(caracter)) {
                            buffer = buffer + caracter;
                            estado = 5;
                            i++;
                        } //siguen acumulando numeros despues del punto y no permite que aparesca otro punto 
                        else {
                            return 500;
                        }
                        i++;
                        break;
                    case 6:
                        if (caracter == '=') {
                            buffer = buffer + caracter;
                            //indicador++;
                            return 112;
                        } else {
                            if (caracter == '<') {
                                buffer = buffer + caracter;
                                //indicador++;
                                return 101;
                            } else {
                                return 100;
                            }
                        }
                    case 7:
                        if (caracter == '=') {
                            buffer = buffer + caracter;
                            indicador++;
                            return 111;
                        } else if (caracter == '>') {
                            buffer = buffer + caracter;
                            indicador++;
                            return 102;
                        } else {
                            return 100;
                        }

                    case 8:
                        if (caracter == '+') {
                            buffer = buffer + caracter;
                            //indicador++;
                            return 108;
                        } else {
                            return 101;
                        }

                    case 9:
                        if (caracter == '-') {
                            buffer = buffer + caracter;
                            //indicador++;
                            return 109;
                        } else {
                            return 102;
                        }

                    case 10:
                        if (caracter == '=') {
                            buffer = buffer + caracter;
                            //indicador++;
                            return 112;
                        } else {
                            return 107;
                        }

                }

                indicador++;
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(142, 142, 142));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Thonburi", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/analizando.png"))); // NOI18N
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 50, 70, 40));

        jPanel2.setBackground(new java.awt.Color(32, 67, 87));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/documento.png"))); // NOI18N
        jButton1.setText("ANALIZADOR LEXICO");
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 220, 40));
	
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 40));

        jPanel3.setBackground(new java.awt.Color(142, 142, 142));
        jPanel3.setForeground(new java.awt.Color(42, 42, 42));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(38, 38, 38));

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Token", "Descripcion", "Lexema"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 460, 290));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 660, 40));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Token", "Descripcion", "Lexema"
            }
        ));
        jTable2.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(jTable2);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, 450, 290));

        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton7.setText("TABLA QUE RECONOCE SIMBOLOS");
        jButton7.setContentAreaFilled(false);
        jPanel3.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 390, 30));

        jButton8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton8.setText("TABLA QUE RECONOCE TODO");
        jButton8.setContentAreaFilled(false);
        jPanel3.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 390, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 980, 430));

        jTextField1.setFont(new java.awt.Font("Thonburi", 1, 18)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 600, 40));

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Thonburi", 1, 12)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        jButton6.setText("LIMPIAR TABLA");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(812, 550, 180, 40));

        jButton9.setBackground(new java.awt.Color(3, 29, 44));
        jButton9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/informacion.png"))); // NOI18N
        jButton9.setText("INFORMACION");
        jButton9.setBorder(null);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 280, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked

        indicador = 0;
        int t;

        boolean salir = true;
        cadena = jTextField1.getText();
        cadena = cadena + '$';
        int r = 0, i = 0;
        do {
            t = Scanner();
            //De acuerdo al numero retornado por el metodo Scanner pasa por cada uno de los casos y muestra 
            switch (t) {
                case 0:
                    jTextField2.setText(" CORRECTO ");
                    salir = false;
                    break;

                case 101:
                    jTable1.setValueAt("101", r, 0);
                    jTable1.setValueAt("Operador", r, 1);
                    jTable1.setValueAt(buffer, r, 2);
                    r++;
                    break;

                case 102:
                    jTable1.setValueAt("102", r, 0);
                    jTable1.setValueAt("Operador", r, 1);
                    jTable1.setValueAt(buffer, r, 2);
                    r++;
                    break;

                case 103:
                    jTable1.setValueAt("103", r, 0);
                    jTable1.setValueAt("Operador", r, 1);
                    jTable1.setValueAt(buffer, r, 2);
                    r++;
                    break;

                case 104:
                    jTable1.setValueAt("104", r, 0);
                    jTable1.setValueAt("Operador", r, 1);
                    jTable1.setValueAt(buffer, r, 2);
                    r++;
                    break;

                case 105:
                    jTable1.setValueAt("105", r, 0);
                    jTable1.setValueAt("Operador", r, 1);
                    jTable1.setValueAt(buffer, r, 2);
                    r++;
                    break;

                case 106:
                    jTable1.setValueAt("106", r, 0);
                    jTable1.setValueAt("Operador", r, 1);
                    jTable1.setValueAt(buffer, r, 2);
                    r++;
                    break;

                case 107:
                    jTable1.setValueAt("107", r, 0);
                    jTable1.setValueAt("Operador", r, 1);
                    jTable1.setValueAt(buffer, r, 2);
                    r++;
                    break;

                case 108:
                    jTable1.setValueAt("108", r, 0);
                    jTable1.setValueAt("Operador", r, 1);
                    jTable1.setValueAt(buffer, r, 2);
                    r++;
                    break;

                case 109:
                    jTable1.setValueAt("109", r, 0);
                    jTable1.setValueAt("Operador", r, 1);
                    jTable1.setValueAt(buffer, r, 2);
                    r++;
                    break;

                case 110:
                    jTable1.setValueAt("110", r, 0);
                    jTable1.setValueAt("Operador", r, 1);
                    jTable1.setValueAt(buffer, r, 2);
                    r++;
                    break;

                case 111:
                    jTable1.setValueAt("111", r, 0);
                    jTable1.setValueAt("Operador", r, 1);
                    jTable1.setValueAt(buffer, r, 2);
                    r++;
                    break;

                case 112:
                    jTable1.setValueAt("112", r, 0);
                    jTable1.setValueAt("Operador", r, 1);
                    jTable1.setValueAt(buffer, r, 2);
                    r++;
                    break;

                case 113:
                    jTable1.setValueAt("113", r, 0);
                    jTable1.setValueAt("Operador", r, 1);
                    jTable1.setValueAt(buffer, r, 2);
                    r++;
                    break;

                case 114:
                    jTable1.setValueAt("114", r, 0);
                    jTable1.setValueAt("Operador", r, 1);
                    jTable1.setValueAt(buffer, r, 2);
                    r++;
                    break;

                case 115:
                    jTable1.setValueAt("115", r, 0);
                    jTable1.setValueAt("Operador", r, 1);
                    jTable1.setValueAt(buffer, r, 2);
                    r++;
                    break;

                case 116:
                    jTable1.setValueAt("116", r, 0);
                    jTable1.setValueAt("Operador", r, 1);
                    jTable1.setValueAt(buffer, r, 2);
                    r++;
                    break;
                    
                case 117:
                    jTable1.setValueAt("117", r, 0);
                    jTable1.setValueAt("Operador", r, 1);
                    jTable1.setValueAt(buffer, r, 2);
                    r++;
                    break;
                    
                case 118:
                    jTable1.setValueAt("118", r, 0);
                    jTable1.setValueAt("Operador", r, 1);
                    jTable1.setValueAt(buffer, r, 2);
                    r++;
                    break;

                case 200:
                    jTable1.setValueAt("200", r, 0);
                    jTable1.setValueAt("Palabra reservada", r, 1);
                    jTable1.setValueAt(buffer, r, 2);
                    r++;
                    break;

                case 201:
                    jTable1.setValueAt("201", r, 0);
                    jTable1.setValueAt("Palabra reservada", r, 1);
                    jTable1.setValueAt(buffer, r, 2);
                    r++;
                    break;

                case 202:
                    jTable1.setValueAt("202", r, 0);
                    jTable1.setValueAt("Palabra reservada", r, 1);
                    jTable1.setValueAt(buffer, r, 2);
                    r++;
                    break;

                case 203:
                    jTable1.setValueAt("203", r, 0);
                    jTable1.setValueAt("Palabra reservada", r, 1);
                    jTable1.setValueAt(buffer, r, 2);
                    r++;
                    break;

                case 204:
                    jTable1.setValueAt("204", r, 0);
                    jTable1.setValueAt("Palabra reservada", r, 1);
                    jTable1.setValueAt(buffer, r, 2);
                    r++;
                    break;

                case 205:
                    jTable1.setValueAt("205", r, 0);
                    jTable1.setValueAt("Palabra reservada", r, 1);
                    jTable1.setValueAt(buffer, r, 2);
                    r++;
                    break;

                case 206:
                    jTable1.setValueAt("106", r, 0);
                    jTable1.setValueAt("Palabra reservada", r, 1);
                    jTable1.setValueAt(buffer, r, 2);
                    r++;
                    break;

                case 207:
                    jTable1.setValueAt("207", r, 0);
                    jTable1.setValueAt("Palabra reservada", r, 1);
                    jTable1.setValueAt(buffer, r, 2);
                    r++;
                    break;

                case 208:
                    jTable1.setValueAt("208", r, 0);
                    jTable1.setValueAt("Palabra reservada", r, 1);
                    jTable1.setValueAt(buffer, r, 2);
                    r++;
                    break;

                case 209:
                    jTable1.setValueAt("209", r, 0);
                    jTable1.setValueAt("Palabra reservada", r, 1);
                    jTable1.setValueAt(buffer, r, 2);
                    r++;
                    break;

                case 210:
                    jTable1.setValueAt("210", r, 0);
                    jTable1.setValueAt("Palabra reservada", r, 1);
                    jTable1.setValueAt(buffer, r, 2);
                    r++;
                    break;

                case 211:
                    jTable1.setValueAt("211", r, 0);
                    jTable1.setValueAt("Palabra reservada", r, 1);
                    jTable1.setValueAt(buffer, r, 2);
                    r++;
                    break;

                case 212:
                    jTable1.setValueAt("212", r, 0);
                    jTable1.setValueAt("Palabra reservada", r, 1);
                    jTable1.setValueAt(buffer, r, 2);
                    r++;
                    break;

                case 213:
                    jTable1.setValueAt("213", r, 0);
                    jTable1.setValueAt("Palabra reservada", r, 1);
                    jTable1.setValueAt(buffer, r, 2);
                    r++;
                    break;

                case 214:
                    jTable1.setValueAt("214", r, 0);
                    jTable1.setValueAt("Palabra reservada", r, 1);
                    jTable1.setValueAt(buffer, r, 2);
                    r++;
                    break;

                case 215:
                    jTable2.setValueAt("215", r, 0);
                    jTable2.setValueAt("Palabra reservada", r, 1);
                    jTable2.setValueAt(buffer, r, 2);
                    r++;
                    break;

                case 216:
                    jTable1.setValueAt("216", r, 0);
                    jTable1.setValueAt("Palabra reservada", r, 1);
                    jTable1.setValueAt(buffer, r, 2);
                    r++;
                    break;

                case 217:
                    jTable1.setValueAt("217", r, 0);
                    jTable1.setValueAt("Palabra reservada", r, 1);
                    jTable1.setValueAt(buffer, r, 2);
                    r++;
                    break;

                case 218:
                    jTable1.setValueAt("218", r, 0);
                    jTable1.setValueAt("Palabra reservada", r, 1);
                    jTable1.setValueAt(buffer, r, 2);
                    r++;
                    break;

                case 219:
                    jTable1.setValueAt("219", r, 0);
                    jTable1.setValueAt("Palabra reservada", r, 1);
                    jTable1.setValueAt(buffer, r, 2);
                    r++;
                    break;

                case 220:
                    jTable1.setValueAt("220", r, 0);
                    jTable1.setValueAt("Palabra reservada", r, 1);
                    jTable1.setValueAt(buffer, r, 2);
                    r++;
                    break;

                case 221:
                    jTable1.setValueAt("221", r, 0);
                    jTable1.setValueAt("Palabra reservada", r, 1);
                    jTable1.setValueAt(buffer, r, 2);
                    r++;
                    break;

                case 300:
                    jTable1.setValueAt("300", r, 0);
                    jTable1.setValueAt("Identificador", r, 1);
                    jTable1.setValueAt(buffer, r, 2);
                    r++;

                    jTable2.setValueAt("300", r, 0);
                    jTable2.setValueAt("Identificador", r, 1);
                    jTable2.setValueAt(buffer, r, 2);
                    r++;
                    break;
                case 301:
                    jTable1.setValueAt("400", r, 0);
                    jTable1.setValueAt("Op.Delimitador", r, 1);
                    jTable1.setValueAt(buffer, r, 2);
                    r++;
                    break;
                case 302:
                    jTable1.setValueAt("401", r, 0);
                    jTable1.setValueAt("Op.Delimitador", r, 1);
                    jTable1.setValueAt(buffer, r, 2);
                    obs = 0;
                    //r++;
                    break;
                case 303:
                    jTable1.setValueAt("402", r, 0);
                    jTable1.setValueAt("Op.Delimitador", r, 1);
                    jTable1.setValueAt(buffer, r, 2);
                    r++;
                    break;
                case 304:
                    jTable1.setValueAt("403", r, 0);
                    jTable1.setValueAt("Op.Delimitador", r, 1);
                    jTable1.setValueAt(buffer, r, 2);
                    r++;
                    break;
                case 600:
                    jTable1.setValueAt("404", r, 0);
                    jTable1.setValueAt("Op.Delimitador", r, 1);
                    jTable1.setValueAt(buffer, r, 2);
                    r++;
                    break;
                case 601:
                    jTable1.setValueAt("405", r, 0);
                    jTable1.setValueAt("Op.Delimitador", r, 1);
                    jTable1.setValueAt(buffer, r, 2);
                    r++;
                    break;
                case 602:
                    jTable1.setValueAt("406", r, 0);
                    jTable1.setValueAt("Op.Delimitador", r, 1);
                    jTable1.setValueAt(buffer, r, 2);
                    r++;
                    break;
                case 603:
                    jTable1.setValueAt("407", r, 0);
                    jTable1.setValueAt("Op.Delimitador", r, 1);
                    jTable1.setValueAt(buffer, r, 2);
                    r++;
                    break;
                case 604:
                    jTable1.setValueAt("408", r, 0);
                    jTable1.setValueAt("Op.Delimitador", r, 1);
                    jTable1.setValueAt(buffer, r, 2);
                    r++;
                    break;
                case 605:
                    jTable1.setValueAt("409", r, 0);
                    jTable1.setValueAt("Op.Delimitador", r, 1);
                    jTable1.setValueAt(buffer, r, 2);
                    r++;
                    break;
                case 606:
                    jTable1.setValueAt("410", r, 0);
                    jTable1.setValueAt("Op.Delimitador", r, 1);
                    jTable1.setValueAt(buffer, r, 2);
                    r++;
                    break;
                case 607:
                    jTable1.setValueAt("411", r, 0);
                    jTable1.setValueAt("Op.Delimitador", r, 1);
                    jTable1.setValueAt(buffer, r, 2);
                    r++;
                    break;
                case 608:
                    jTable1.setValueAt("412", r, 0);
                    jTable1.setValueAt("Op.Delimitador", r, 1);
                    jTable1.setValueAt(buffer, r, 2);
                    r++;
                    break;
                case 609:
                    jTable1.setValueAt("609", r, 0);
                    jTable1.setValueAt("Op.Delimitador", r, 1);
                    jTable1.setValueAt(buffer, r, 2);
                    r++;
                    break;
                case 610:
                    jTable1.setValueAt("500", r, 0);
                    jTable1.setValueAt("Literal numerica", r, 1);
                    jTable1.setValueAt(buffer, r, 2);
                    r++;
                    break;
                case 611:
                    jTable1.setValueAt("611", r, 0);
                    jTable1.setValueAt("Op.Delimitador", r, 1);
                    jTable1.setValueAt(buffer, r, 2);
                    r++;
                    break;
                case 612:
                    jTable1.setValueAt("612", r, 0);
                    jTable1.setValueAt("op.Delimitador", r, 1);
                    jTable1.setValueAt(buffer, r, 2);
                    r++;
                    break;
                case 500:
                    jTable1.setValueAt("500", r, 0);
                    jTable1.setValueAt("Literal numerica", r, 1);
                    jTable1.setValueAt(buffer, r, 2);
                    r++;
                    break;
                default:
                    jTable1.setValueAt("Error", r, 0);
                    jTable1.setValueAt("Error", r, 1);
                    jTable1.setValueAt(buffer, r, 2);
                    jTextField2.setText(" Error ");
                    salir = false;
            }

        } while (salir);

    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        //Boton Informacion
        this.dispose();
        new Descripcion(this).setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jTextField1.setText("");
        jTextField2.setText("");
        jTable1.getModel();
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null}
                },
                new String[]{
                    "Token", "Descripcion", "Lexema"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }
        });
        jTable2.getModel();
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null}
                },
                new String[]{
                    "Tokens", "Descripcion", "Lexema"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }
        });
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(Analizador_Lexico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Analizador_Lexico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Analizador_Lexico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Analizador_Lexico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Analizador_Lexico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
