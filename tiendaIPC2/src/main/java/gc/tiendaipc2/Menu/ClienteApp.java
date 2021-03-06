package gc.tiendaipc2.Menu;


import static ConexionMySQL.Conexion.getConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author james
 */
public class ClienteApp extends javax.swing.JFrame {
    String CODIGOTIENDA;
    /**
     * Creates new form ClienteApp
     * @param CODIGOTIENDA
     */
    public ClienteApp(String CODIGOTIENDA) {
        initComponents();
        this.CODIGOTIENDA=CODIGOTIENDA;
        MuestraTienda.setText(CODIGOTIENDA);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        BusquedaField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        MuestraDatos = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        MuestraTienda = new javax.swing.JLabel();
        Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(73, 172, 105));
        jPanel1.setForeground(new java.awt.Color(109, 162, 124));

        jButton1.setText("Buscar Producto");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        BusquedaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusquedaFieldActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 3, 20)); // NOI18N
        jLabel1.setText("Menu Cliente Intelaf");

        jLabel2.setText("Puedes buscar el producto ingresando el codigo de producto, nombre o fabricante.");

        MuestraDatos.setColumns(20);
        MuestraDatos.setRows(5);
        jScrollPane1.setViewportView(MuestraDatos);

        jLabel4.setText("Estas en la tienda:");

        Salir.setBackground(new java.awt.Color(191, 45, 40));
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(MuestraTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(BusquedaField, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(154, 154, 154)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MuestraTienda, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BusquedaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        MuestraDatos.setText("");
        Buscar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BusquedaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusquedaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BusquedaFieldActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_SalirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BusquedaField;
    private javax.swing.JTextArea MuestraDatos;
    private javax.swing.JLabel MuestraTienda;
    private javax.swing.JButton Salir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    /**
     * BUSCA EL PRODUCTO
     */
    private void Buscar() {

        String query = "SELECT * FROM productos WHERE codigo_producto LIKE ? AND codigo_tienda_exist = ? ORDER BY codigo_producto ASC";
        
        try (PreparedStatement preSt = getConnection().prepareStatement(query)) {
            
            //obtiene el codigo de los productos
            preSt.setString(1, "%"+BusquedaField.getText()+"%" );
            preSt.setString(2, CODIGOTIENDA );
            ResultSet result = preSt.executeQuery(); 

            MuestraDatos.append(" Codigo " + "\t" + " Nombre " + "\t" + " Fabricante " + "\t" + " Cantidad" + "\t"+ " Precio " + "\t"
                            + " Tienda" + "\t"+ " Descripcion " + "\t"+ " Garantia " + "\t"+"\n");

            while (result.next()) {
              
                String cod=result.getString(1);
                String nom=result.getString(2);
                String fab=result.getString(3);
                int cant=result.getInt(4);
                double prec=result.getDouble(5);
                String CODIGOTIENDA=result.getString(6);
                String desc=result.getString(7);
                String garant=result.getString(8);
 
                MuestraDatos.append(cod+"\t"+nom+"\t"+fab+"\t"+cant+"\t"+prec+"\t"+CODIGOTIENDA.trim()+"\t"+desc+"\t"+garant+"\t"+"\n");
            }

            result.close();
            preSt.close();

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        Buscar2();
    }
    
    
    
        /**
     * BUSCA EL PRODUCTO
     */
    private void Buscar2() {

        String query = "SELECT * FROM productos WHERE nombre_producto LIKE ? AND codigo_tienda_exist = ? ORDER BY nombre_producto ASC";
        
        try (PreparedStatement preSt = getConnection().prepareStatement(query)) {
            
            //obtiene el codigo de los productos
            preSt.setString(1, "%"+BusquedaField.getText()+"%" );
            preSt.setString(2, CODIGOTIENDA );
            ResultSet result = preSt.executeQuery(); 


            while (result.next()) {
              
                String cod=result.getString(1);
                String nom=result.getString(2);
                String fab=result.getString(3);
                int cant=result.getInt(4);
                double prec=result.getDouble(5);
                String CODIGOTIENDA=result.getString(6);
                String desc=result.getString(7);
                String garant=result.getString(8);
 
                MuestraDatos.append(cod+"\t"+nom+"\t"+fab+"\t"+cant+"\t"+prec+"\t"+CODIGOTIENDA.trim()+"\t"+desc+"\t"+garant+"\t"+"\n");
            }

            result.close();
            preSt.close();

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        Buscar3();
    }
        /**
         * Busca el fabricante del producto 
         */
        private void Buscar3() {

        String query = "SELECT * FROM productos WHERE fabricante LIKE ? AND codigo_tienda_exist = ? ORDER BY fabricante ASC";
        
        try (PreparedStatement preSt = getConnection().prepareStatement(query)) {
            
            //obtiene el codigo de los productos
            preSt.setString(1, "%"+BusquedaField.getText()+"%" );
            preSt.setString(2, CODIGOTIENDA );
            ResultSet result = preSt.executeQuery(); 


            while (result.next()) {
              
                String cod=result.getString(1);
                String nom=result.getString(2);
                String fab=result.getString(3);
                int cant=result.getInt(4);
                double prec=result.getDouble(5);
                String CODIGOTIENDA=result.getString(6);
                String desc=result.getString(7);
                String garant=result.getString(8);
 
                MuestraDatos.append(cod+"\t"+nom+"\t"+fab+"\t"+cant+"\t"+prec+"\t"+CODIGOTIENDA.trim()+"\t"+desc+"\t"+garant+"\t"+"\n");
            }

            result.close();
            preSt.close();

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
    
    
    
}
