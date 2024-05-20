
package vista;

import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class VentanaDi extends javax.swing.JFrame {

    private String divisa1 = "";
    private String divisa2 = "";
    private String cantidad = "";
    private double dinero, cambio;
    private boolean punto = true;

    public VentanaDi() {
        initComponents();
        setSize(300, 450);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panel = new javax.swing.JPanel();
        etiquetaDivisa1 = new javax.swing.JLabel();
        etiquetaCambio1 = new javax.swing.JLabel();
        comboDivisas1 = new javax.swing.JComboBox();
        etiquetaDivisa2 = new javax.swing.JLabel();
        etiquetaCambio2 = new javax.swing.JLabel();
        comboDivisas2 = new javax.swing.JComboBox();
        botonC = new javax.swing.JButton();
        botonBorrar = new javax.swing.JButton();
        boton7 = new javax.swing.JButton();
        boton8 = new javax.swing.JButton();
        boton9 = new javax.swing.JButton();
        boton4 = new javax.swing.JButton();
        boton5 = new javax.swing.JButton();
        boton6 = new javax.swing.JButton();
        boton1 = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        boton3 = new javax.swing.JButton();
        boton0 = new javax.swing.JButton();
        botonPunto = new javax.swing.JButton();
        barraMenu = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        calculadoraEstandar = new javax.swing.JMenuItem();
        conversorDivisas = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        salir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Conversor de Divisas");
        setAlwaysOnTop(true);
        setIconImage(new ImageIcon(getClass().getResource("/imagenesCalculadora/dinero.png")).getImage());

        panel.setLayout(new java.awt.GridBagLayout());

        etiquetaDivisa1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        etiquetaDivisa1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiquetaDivisa1.setText("$");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 0, 10);
        panel.add(etiquetaDivisa1, gridBagConstraints);

        etiquetaCambio1.setFont(new java.awt.Font("Century Gothic", 2, 36)); // NOI18N
        etiquetaCambio1.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 0);
        panel.add(etiquetaCambio1, gridBagConstraints);

        comboDivisas1.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        comboDivisas1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Estados Unidos - Dólar", "Perú - Nuevo Sol", "Europa - Euro" }));
        comboDivisas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboDivisas1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        panel.add(comboDivisas1, gridBagConstraints);

        etiquetaDivisa2.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        etiquetaDivisa2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiquetaDivisa2.setText("$");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 0, 10);
        panel.add(etiquetaDivisa2, gridBagConstraints);

        etiquetaCambio2.setFont(new java.awt.Font("Century Gothic", 2, 36)); // NOI18N
        etiquetaCambio2.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 0);
        panel.add(etiquetaCambio2, gridBagConstraints);

        comboDivisas2.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        comboDivisas2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Estados Unidos - Dólar", "Perú - Nuevo Sol", "Europa - Euro" }));
        comboDivisas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboDivisas2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        panel.add(comboDivisas2, gridBagConstraints);

        botonC.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        botonC.setText("C");
        botonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 0);
        panel.add(botonC, gridBagConstraints);

        botonBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesCalculadora/borrar.png"))); // NOI18N
        botonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 0);
        panel.add(botonBorrar, gridBagConstraints);

        boton7.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        boton7.setText("7");
        boton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton7ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(boton7, gridBagConstraints);

        boton8.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        boton8.setText("8");
        boton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton8ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(boton8, gridBagConstraints);

        boton9.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        boton9.setText("9");
        boton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton9ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(boton9, gridBagConstraints);

        boton4.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        boton4.setText("4");
        boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(boton4, gridBagConstraints);

        boton5.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        boton5.setText("5");
        boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(boton5, gridBagConstraints);

        boton6.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        boton6.setText("6");
        boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(boton6, gridBagConstraints);

        boton1.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        boton1.setText("1");
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(boton1, gridBagConstraints);

        boton2.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        boton2.setText("2");
        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(boton2, gridBagConstraints);

        boton3.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        boton3.setText("3");
        boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(boton3, gridBagConstraints);

        boton0.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        boton0.setText("0");
        boton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton0ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(boton0, gridBagConstraints);

        botonPunto.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        botonPunto.setText(".");
        botonPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPuntoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(botonPunto, gridBagConstraints);

        menu.setText("Usos");
        menu.setFont(new java.awt.Font("Century Gothic", 2, 16)); // NOI18N

        calculadoraEstandar.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        calculadoraEstandar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesCalculadora/calculadora.png"))); // NOI18N
        calculadoraEstandar.setText("Calculadora Estándar");
        calculadoraEstandar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculadoraEstandarActionPerformed(evt);
            }
        });
        menu.add(calculadoraEstandar);

        conversorDivisas.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        conversorDivisas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesCalculadora/divisas.png"))); // NOI18N
        conversorDivisas.setText("Conversor de Divisas");
        menu.add(conversorDivisas);
        menu.add(jSeparator1);

        salir.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesCalculadora/salir.png"))); // NOI18N
        salir.setText("Cerrar");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        menu.add(salir);

        barraMenu.add(menu);

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

    private void calculadoraEstandarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculadoraEstandarActionPerformed
        VentanCal calculadora = new VentanCal();
        calculadora.setVisible(true);

        dispose();
    }//GEN-LAST:event_calculadoraEstandarActionPerformed

    private void comboDivisas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboDivisas1ActionPerformed
        divisa1 = (String) comboDivisas1.getSelectedItem();

        if (divisa1.equals("Estados Unidos - Dólar")) {
            etiquetaDivisa1.setText("$");
        } else if (divisa1.equals("Perú - Nuevo Sol")) {
            etiquetaDivisa1.setText("S/.");
        } else if (divisa1.equals("Europa - Euro")) {
            etiquetaDivisa1.setText("€");
        }

        obtenerDinero();
    }//GEN-LAST:event_comboDivisas1ActionPerformed

    private void comboDivisas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboDivisas2ActionPerformed
        divisa2 = (String) comboDivisas2.getSelectedItem();

        if (divisa2.equals("Estados Unidos - Dólar")) {
            etiquetaDivisa2.setText("$");
        } else if (divisa2.equals("Perú - Nuevo Sol")) {
            etiquetaDivisa2.setText("S/.");
        } else if (divisa2.equals("Europa - Euro")) {
            etiquetaDivisa2.setText("€");
        }

        obtenerDinero();
    }//GEN-LAST:event_comboDivisas2ActionPerformed

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        if (etiquetaCambio1.getText() == "0") {
            cantidad = "1";
        } else {
            cantidad += "1";
        }

        etiquetaCambio1.setText(cantidad);
        obtenerDinero();
    }//GEN-LAST:event_boton1ActionPerformed

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
        if (etiquetaCambio1.getText() == "0") {
            cantidad = "2";
        } else {
            cantidad += "2";
        }
        etiquetaCambio1.setText(cantidad);
        obtenerDinero();
    }//GEN-LAST:event_boton2ActionPerformed

    private void boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3ActionPerformed
        if (etiquetaCambio1.getText() == "0") {
            cantidad = "3";
        } else {
            cantidad += "3";
        }
        etiquetaCambio1.setText(cantidad);
        obtenerDinero();
    }//GEN-LAST:event_boton3ActionPerformed

    private void boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton4ActionPerformed
        if (etiquetaCambio1.getText() == "0") {
            cantidad = "4";
        } else {
            cantidad += "4";
        }
        etiquetaCambio1.setText(cantidad);
        obtenerDinero();
    }//GEN-LAST:event_boton4ActionPerformed

    private void boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton5ActionPerformed
        if (etiquetaCambio1.getText() == "0") {
            cantidad = "5";
        } else {
            cantidad += "5";
        }
        etiquetaCambio1.setText(cantidad);
        obtenerDinero();
    }//GEN-LAST:event_boton5ActionPerformed

    private void boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton6ActionPerformed
        if (etiquetaCambio1.getText() == "0") {
            cantidad = "6";
        } else {
            cantidad += "6";
        }
        etiquetaCambio1.setText(cantidad);
        obtenerDinero();
    }//GEN-LAST:event_boton6ActionPerformed

    private void boton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton7ActionPerformed
        if (etiquetaCambio1.getText() == "0") {
            cantidad = "7";
        } else {
            cantidad += "7";
        }
        etiquetaCambio1.setText(cantidad);
        obtenerDinero();
    }//GEN-LAST:event_boton7ActionPerformed

    private void boton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton8ActionPerformed
        if (etiquetaCambio1.getText() == "0") {
            cantidad = "8";
        } else {
            cantidad += "8";
        }
        etiquetaCambio1.setText(cantidad);
        obtenerDinero();
    }//GEN-LAST:event_boton8ActionPerformed

    private void boton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton9ActionPerformed
        if (etiquetaCambio1.getText() == "0") {
            cantidad = "9";
        } else {
            cantidad += "9";
        }
        etiquetaCambio1.setText(cantidad);
        obtenerDinero();
    }//GEN-LAST:event_boton9ActionPerformed

    private void boton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton0ActionPerformed
        if (cantidad != "") {
            if (etiquetaCambio1.getText() == "0") {
                cantidad = "0";
            } else {
                cantidad += "0";
            }
            etiquetaCambio1.setText(cantidad);
            obtenerDinero();
        }
    }//GEN-LAST:event_boton0ActionPerformed

    private void botonPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPuntoActionPerformed
        if (punto == true) {
            if (cantidad == "") {
                cantidad = "0.";
            } 
            else {
                cantidad += ".";
            }
            etiquetaCambio1.setText(cantidad);
            
            punto = false;
        }
    }//GEN-LAST:event_botonPuntoActionPerformed

    private void botonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarActionPerformed
        int tamaño = cantidad.length();
        if(tamaño > 0){
            if(tamaño == 1){
                cantidad = "0";
            }
            else{
                cantidad = cantidad.substring(0, cantidad.length()-1);
            }
            etiquetaCambio1.setText(cantidad);
            obtenerDinero();
        }
    }//GEN-LAST:event_botonBorrarActionPerformed

    private void botonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCActionPerformed
        cantidad = "";
        punto = true;
        etiquetaCambio1.setText("0");
        etiquetaCambio2.setText("0");
    }//GEN-LAST:event_botonCActionPerformed

    private void obtenerDinero() {
        cantidad = etiquetaCambio1.getText();
        dinero = Double.parseDouble(cantidad);
        cambioDivisas();
        dinero *= cambio;
        etiquetaCambio2.setText(String.format("%.2f", dinero));
    }

    private void cambioDivisas() {
        if (divisa1.equals(divisa2)) {
            cambio = 1;
        } else if (divisa1.equals("Estados Unidos - Dólar") && divisa2.equals("Perú - Nuevo Sol")) {
            cambio = 3.25;
        } else if (divisa1.equals("Estados Unidos - Dólar") && divisa2.equals("Europa - Euro")) {
            cambio = 0.84;
        } else if (divisa1.equals("Perú - Nuevo Sol") && divisa2.equals("Estados Unidos - Dólar")) {
            cambio = 0.32;
        } else if (divisa1.equals("Perú - Nuevo Sol") && divisa2.equals("Europa - Euro")) {
            cambio = 0.26;
        } else if (divisa1.equals("Europa - Euro") && divisa2.equals("Estados Unidos - Dólar")) {
            cambio = 1.2;
        } else if (divisa1.equals("Europa - Euro") && divisa2.equals("Perú - Nuevo Sol")) {
            cambio = 3.91;
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaDi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton boton0;
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton3;
    private javax.swing.JButton boton4;
    private javax.swing.JButton boton5;
    private javax.swing.JButton boton6;
    private javax.swing.JButton boton7;
    private javax.swing.JButton boton8;
    private javax.swing.JButton boton9;
    private javax.swing.JButton botonBorrar;
    private javax.swing.JButton botonC;
    private javax.swing.JButton botonPunto;
    private javax.swing.JMenuItem calculadoraEstandar;
    private javax.swing.JComboBox comboDivisas1;
    private javax.swing.JComboBox comboDivisas2;
    private javax.swing.JMenuItem conversorDivisas;
    private javax.swing.JLabel etiquetaCambio1;
    private javax.swing.JLabel etiquetaCambio2;
    private javax.swing.JLabel etiquetaDivisa1;
    private javax.swing.JLabel etiquetaDivisa2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu menu;
    private javax.swing.JPanel panel;
    private javax.swing.JMenuItem salir;
    // End of variables declaration//GEN-END:variables
}
