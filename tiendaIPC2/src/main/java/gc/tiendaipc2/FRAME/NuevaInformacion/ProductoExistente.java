/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gc.tiendaipc2.FRAME.NuevaInformacion;

/**
 *
 * @author james
 */
public class ProductoExistente extends javax.swing.JFrame {
    String CODIGOTIENDA;
    /**
     * Creates new form ProductoExistente
     * @param CODIGOTIENDA
     */
    public ProductoExistente(String CODIGOTIENDA) {
        initComponents();
        this.CODIGOTIENDA=CODIGOTIENDA;
        tienda.setText(CODIGOTIENDA);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        tienda = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        fabricante = new javax.swing.JTextField();
        precio = new javax.swing.JTextField();
        Descripcion = new javax.swing.JTextField();
        GarantiaSpinner = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(139, 157, 175));
        jPanel1.setLayout(null);

        jLabel2.setText("Estas en la tienda:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(90, 80, 150, 30);

        jLabel4.setText("Nombre:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 160, 163, 31);

        jLabel11.setText("*");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(220, 160, 20, 20);

        jLabel5.setText("Fabricante:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(50, 200, 163, 31);

        jLabel6.setText("Codigo de producto:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(50, 120, 163, 31);

        jLabel7.setText("Cantidad");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(50, 240, 163, 31);

        jLabel16.setText("Precio:");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(50, 280, 163, 31);

        jLabel8.setText("Descripcion:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(50, 320, 163, 31);

        jLabel9.setText("Garantia (meses)");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(50, 360, 163, 31);

        jLabel15.setText("*");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(220, 280, 20, 20);

        jLabel14.setText("*");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(220, 240, 20, 20);

        jLabel13.setText("*");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(220, 120, 20, 20);

        jLabel12.setText("*");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(220, 200, 20, 20);

        nombre.setEditable(false);
        jPanel1.add(nombre);
        nombre.setBounds(250, 160, 209, 31);

        tienda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(tienda);
        tienda.setBounds(250, 80, 210, 30);

        jLabel1.setFont(new java.awt.Font("Phetsarath OT", 0, 24)); // NOI18N
        jLabel1.setText("Agrega mas productos a inventario");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(100, 20, 440, 42);

        fabricante.setEditable(false);
        jPanel1.add(fabricante);
        fabricante.setBounds(250, 200, 209, 31);
        jPanel1.add(precio);
        precio.setBounds(250, 280, 209, 31);

        Descripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescripcionActionPerformed(evt);
            }
        });
        jPanel1.add(Descripcion);
        Descripcion.setBounds(250, 320, 209, 31);

        GarantiaSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jPanel1.add(GarantiaSpinner);
        GarantiaSpinner.setBounds(250, 370, 210, 30);

        jButton1.setText("Salir");
        jPanel1.add(jButton1);
        jButton1.setBounds(20, 10, 70, 50);
        jPanel1.add(jSpinner1);
        jSpinner1.setBounds(340, 240, 120, 30);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(250, 120, 210, 35);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DescripcionActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Descripcion;
    private javax.swing.JSpinner GarantiaSpinner;
    private javax.swing.JTextField fabricante;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField precio;
    private javax.swing.JLabel tienda;
    // End of variables declaration//GEN-END:variables
}
