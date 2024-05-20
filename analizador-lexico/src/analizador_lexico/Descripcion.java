package analizador_lexico;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
/**
 *
 * @author 
 */
public class Descripcion extends javax.swing.JFrame {

    /**
     * Creates new form Descripcion
     */
    Analizador_Lexico origen;
    

    public Descripcion(Analizador_Lexico O){
        
        super ("INFORMACION TOKENS");
        origen = O;
        initComponents();
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("TOKEN");
        modelo.addColumn("DESCRIPCION");
        modelo.addColumn("LEXEMA");
        
        String []L1={"101","Operador","+"};
        String []L2={"102","Operador","-"};
        String []L3={"103","Operador","*"};
        String []L4={"104","Operador","/"};
        String []L5={"105","Operador","**"};
        String []L6={"106","Operador","//"};
        String []L7={"107","Operador","="};
        String []L8={"108","Operador","++"};
        String []L9={"109","Operador","--"};
        String []L10={"110","Operador","<"};
        String []L11={"111","Operador",">"};
        String []L12={"112","Operador","=="};
        String []L13={"113","Operador","~="};
        String []L14={"114","Operador","<="};
        String []L15={"115","Operador",">="};
        String []L16={"116","Operador","&"};
        String []L17={"117","Operador","|"};
        String []L18={"118","Operador","~"};
        String[] L19 = {"200", "Palabra reservada", "paq"};
        String[] L20 = {"201", "Palabra reservada", "man"};
        String[] L21 = {"202", "Palabra reservada", "mana"};
        String[] L22 = {"203", "Palabra reservada", "kama"};
        String[] L23 = {"204", "Palabra reservada", "retornar"};
        String[] L24 = {"205", "Palabra reservada", "iskirbiy"};
        String[] L25 = {"206", "Palabra reservada", "liyiy"};
        String[] L26 = {"207", "Palabra reservada", "clases"};
        String[] L27 = {"208", "Palabra reservada", "central"};
        String[] L28 = {"209", "Palabra reservada", "entero"};
        String[] L29 = {"210", "Palabra reservada", "real"};
        String[] L30 = {"211", "Palabra reservada", "caracter"};
        String[] L31 = {"212", "Palabra reservada", "palabra"};
        String[] L32 = {"213", "Palabra reservada", "veracidad"};
        String[] L33 = {"214", "Palabra reservada", "nuevo"};
        String[] L34 = {"215", "Palabra reservada", "noobvio"};
        String[] L35 = {"216", "Palabra reservada", "obvio"};
        String[] L36 = {"217", "Palabra reservada", "inmune"};
        String[] L37 = {"218", "Palabra reservada", "verdadero"};
        String[] L38 = {"219", "Palabra reservada", "falso"};
        String[] L39 = {"220", "Palabra reservada", "konstante"};
        String[] L40 = {"221", "Palabra reservada", "vacuo"};
        String []L41={"300","Identificadores",""};
        String []L42={"100","Operador Delimitador",","};
        String []L43={"100","Operador Delimitador",";"};
        String []L44={"100","Operador Delimitador","("};
        String []L45={"100","Operador Delimitador",")"};
        String []L46={"100","Operador Delimitador","{"};
        String []L47={"100","Operador Delimitador","}"};
        String []L48={"100","Operador Delimitador","["};
        String []L49={"100","Operador Delimitador","]"};
        String []L50={"100","Operador Delimitador","^"};
        String []L51={"100","Operador Delimitador","::"};
        String []L52={"100","Operador Delimitador","'"};
        String []L53={"500","Literal numerica",""};
        
        
        modelo.addRow(L1);
        modelo.addRow(L2);
        modelo.addRow(L3);
        modelo.addRow(L4);
        modelo.addRow(L5);
        modelo.addRow(L6);
        modelo.addRow(L7);
        modelo.addRow(L8);
        modelo.addRow(L9);
        modelo.addRow(L10);
        modelo.addRow(L11);
        modelo.addRow(L12);
        modelo.addRow(L13);
        modelo.addRow(L14);
        modelo.addRow(L15);
        modelo.addRow(L16);
        modelo.addRow(L17);
        modelo.addRow(L18);
        modelo.addRow(L19);
        modelo.addRow(L20);
        modelo.addRow(L21);
        modelo.addRow(L22);
        modelo.addRow(L23);
        modelo.addRow(L24);
        modelo.addRow(L25);
        modelo.addRow(L26);
        modelo.addRow(L27);
        modelo.addRow(L28);
        modelo.addRow(L29);
        modelo.addRow(L30);
        modelo.addRow(L31);
        modelo.addRow(L32);
        modelo.addRow(L33);
        modelo.addRow(L34);
        modelo.addRow(L35);
        modelo.addRow(L36);
        modelo.addRow(L37);
        modelo.addRow(L38);
        modelo.addRow(L39);
        modelo.addRow(L40);
        modelo.addRow(L41);
        modelo.addRow(L42);
        modelo.addRow(L43);
        modelo.addRow(L44);
        modelo.addRow(L45);
        modelo.addRow(L46);
        modelo.addRow(L47);
        modelo.addRow(L48);
        modelo.addRow(L49);
        modelo.addRow(L50);
        modelo.addRow(L51);
        modelo.addRow(L52);
        modelo.addRow(L53);
        
        
        jTable1.setModel(modelo);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(141, 151, 156));

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

        jButton1.setText("ATRAS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        origen.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
