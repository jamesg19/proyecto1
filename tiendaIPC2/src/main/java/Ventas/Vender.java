/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventas;

import static ConexionMySQL.Conexion.getConnection;
import static java.lang.Integer.parseInt;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author james
 */
public class Vender extends javax.swing.JFrame {
    String CODIGOTIENDA;
    ArrayList<String> ArrayLineaProd = new ArrayList<>();
    ArrayList<String> ArrayCodPreCant = new ArrayList<>();
    ArrayList<Double> ArrayPrecio = new ArrayList<>();
    ArrayList<Double> ArrayP = new ArrayList<>();
    ArrayList<Integer> ArrayC = new ArrayList<>();
    ArrayList<String> ArrayCode = new ArrayList<>();
    double total,pre;
    int cantElegida,cantRestante,cantidadTotal;
    /**
     * Creates new form Vender
     * @param CODIGOTIENDA
     */
    public Vender(String CODIGOTIENDA) {
        initComponents();
        this.CODIGOTIENDA=CODIGOTIENDA;
        tiendaLabel.setText(CODIGOTIENDA);
        comprobarExistenciaProductos();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        MuestraDatos = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tiendaLabel = new javax.swing.JLabel();
        MuestraBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ProductoField = new javax.swing.JTextField();
        nitField = new javax.swing.JTextField();
        cantidadField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        precioField = new javax.swing.JTextField();
        ProcesaBtn = new javax.swing.JButton();
        TotalPagar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(106, 163, 173));

        MuestraDatos.setColumns(20);
        MuestraDatos.setRows(5);
        jScrollPane1.setViewportView(MuestraDatos);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel1.setText("Productos existentes disponibles para Vender");

        jLabel2.setText("De la tienda:  ");

        MuestraBtn.setText("Mostar Productos");
        MuestraBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MuestraBtnActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(217, 41, 27));
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        jLabel3.setText("Ingresa los datos de venta");

        jLabel4.setText("Codigo de producto:");

        jLabel5.setText("Cantidad:");

        jLabel6.setText("NIT del cliente:");

        jLabel7.setText("Precio:");

        precioField.setEditable(false);

        ProcesaBtn.setBackground(new java.awt.Color(69, 196, 94));
        ProcesaBtn.setText("Vender Ahora");
        ProcesaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProcesaBtnActionPerformed(evt);
            }
        });

        TotalPagar.setEditable(false);

        jLabel8.setText("Total a Pagar");

        jLabel9.setText("Q.");

        jLabel10.setText("Q.");

        jButton2.setText("Limpiar ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tiendaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(MuestraBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(ProductoField, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jLabel10)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(TotalPagar)
                                                    .addComponent(cantidadField))))
                                        .addGap(34, 34, 34)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel9))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(ProcesaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(58, 58, 58)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nitField, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                    .addComponent(precioField))))))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(MuestraBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tiendaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProductoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nitField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cantidadField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precioField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ProcesaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MuestraBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MuestraBtnActionPerformed
        MuestraDatos.setText("");
        comprobarExistenciaProductos();
        
    }//GEN-LAST:event_MuestraBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ProcesaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProcesaBtnActionPerformed
        MuestraDatos.setText("");
        comprobarExistenciaProductos();
        ProcesarCompra();
        
    }//GEN-LAST:event_ProcesaBtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        LimpiarDatos();
    }//GEN-LAST:event_jButton2ActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MuestraBtn;
    private javax.swing.JTextArea MuestraDatos;
    private javax.swing.JButton ProcesaBtn;
    private javax.swing.JTextField ProductoField;
    private javax.swing.JTextField TotalPagar;
    private javax.swing.JTextField cantidadField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nitField;
    private javax.swing.JTextField precioField;
    private javax.swing.JLabel tiendaLabel;
    // End of variables declaration//GEN-END:variables
/**
 * comprueba la existencia de productos en la tienda seleccionada
 */
private void comprobarExistenciaProductos() {
         
        String query = "SELECT * FROM productos WHERE codigo_tienda_exist= ?";
        
        try (PreparedStatement preSt = getConnection().prepareStatement(query)) {
            
            //obtiene el codigo de los productos
            preSt.setString(1, CODIGOTIENDA );
            ResultSet result = preSt.executeQuery(); 
                


            ResultSetMetaData meta = result.getMetaData();
                ArrayLineaProd.clear();
                ArrayCodPreCant.clear();
                ArrayCode.clear();
                ArrayC.clear();
                ArrayP.clear();
            
//            MuestraDatos.append(meta.getColumnName(1) + "\t" + meta.getColumnName(2) + " y " + meta.getColumnName(3) + "\t" + meta.getColumnName(4) + "\t"+ meta.getColumnName(5) + "\t"
//            + meta.getColumnName(6) + "\t"+ meta.getColumnName(7) + "\t"+ meta.getColumnName(8) + "\t"+"\n");
            
MuestraDatos.append(" Codigo " + "\t" + " Nombre " + "\t" + " Fabricante " + "\t" + " Cantidad" + "\t"+ " Precio " + "\t"
            + " Tienda" + "\t"+ " Descripcion " + "\t"+ " Garantia " + "\t"+"\n");

            while (result.next()) {
              
                String cod=result.getString(1);
                String nom=result.getString(2);
                String fab=result.getString(3);
                int cant=result.getInt(4);
                double prec=result.getDouble(5);
                String desc=result.getString(7);
                String garant=result.getString(8);
 
                MuestraDatos.append(cod+"\t"+nom+"\t"+fab+"\t"+cant+"\t"+prec+"\t"+CODIGOTIENDA.trim()+"\t"+desc+"\t"+garant+"\t"+"\n");
                ArrayLineaProd.add(cod+""+nom+" "+fab+" "+cant+" "+prec+" "+desc+" "+garant);
                ArrayCodPreCant.add(cod);
                ArrayCode.add(cod);
                
                ArrayC.add(cant);
                ArrayP.add(prec);
            }

            result.close();
            preSt.close();

            
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
         
    }

    /**
     * procesa la compra verificando que todos los campos esten
     * en formato establecido
     */
    private void ProcesarCompra() {
        try{
            cantElegida=(Integer) parseInt(cantidadField.getText());
            nitField.getText();
            verificarExistenciaProducto(ProductoField.getText(),cantElegida,nitField.getText());
            
        }catch(NumberFormatException e){
          JOptionPane.showMessageDialog(this, "Ingresa un numero entero en cantidad o llena/n"
                  + "todos los espacios disponibles");
        }
        
       
    }
    /**
     * metodo que comprueba la existencia del producto en la tienda
     * @param product
     * @param cantidad
     * @param nit 
     */
    private void verificarExistenciaProducto(String product, int cantidad,String nit) {
       
       if(ArrayCodPreCant.contains(product)){
           for(int i=0;i<ArrayCode.size();i++){
               
               if(ArrayCode.get(i).contains(product)){
                   cantidadTotal=ArrayC.get(i);
                   pre=ArrayP.get(i);
                   
               }
           }
           if(cantidadTotal>=cantElegida&&cantidadTotal>0){
               ConfirmaVenta();
           }else{
               JOptionPane.showMessageDialog(this, "No hay suficientes unidades para la venta.");
               
           }
           
       }else{
           JOptionPane.showMessageDialog(this, "El codigo del producto es invalido");
       }
     
        
    }
    /**
     * actualiza el inventario de productos de una tienda
     */
    public  void ConfirmaVenta() {
       
        
        String query = "UPDATE productos SET cantidad = ? WHERE codigo_tienda_exist = ? "
                + "AND codigo_producto= ?";
        cantidadTotal=cantidadTotal-cantElegida;
        total=cantElegida*pre;
        
        try (PreparedStatement preSt = getConnection().prepareStatement(query)) {
            
            preSt.setInt(1, cantidadTotal);
            preSt.setString(2, CODIGOTIENDA);
            preSt.setString(3, ProductoField.getText() );

            preSt.executeUpdate();
            
            RegistraVenta(CODIGOTIENDA,nitField.getText(), ProductoField.getText(),
            cantElegida,pre ,total);
            precioField.setText(pre+"");
            TotalPagar.setText(total+"");
            JOptionPane.showMessageDialog(this, "Venta Realizada con exito."
            +"\n venta realizada de: Q"+total);
            LimpiarDatos();

            preSt.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
       
    
    }

    

    public static void RegistraVenta(String Tienda,String Cliente, String Producto,
            int Cant,double Precio, double Total){
   
        String query = "INSERT INTO ventas VALUES (?,?,?,?,?,?,?)";

        try (PreparedStatement preSt = getConnection().prepareStatement(query)) {

            preSt.setInt(1, 0);
            preSt.setString(2, Tienda);
            preSt.setString(3, Cliente);
            preSt.setString(4, Producto);
            preSt.setInt(5, Cant);
            preSt.setDouble(6, Precio);
            preSt.setDouble(7, Total);
            
            preSt.executeUpdate();
            
            preSt.close();
        } catch (SQLException e) {
            //System.out.println("Error: " + e.getMessage());
        }
    }

    private void LimpiarDatos() {
        ProductoField.setText("");
        nitField.setText("");
        cantidadField.setText("");
        precioField.setText("");
        TotalPagar.setText("");
    }
}
