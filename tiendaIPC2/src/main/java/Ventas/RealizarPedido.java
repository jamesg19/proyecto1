/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventas;

import static ConexionMySQL.Conexion.getConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author james
 */
public class RealizarPedido extends javax.swing.JFrame {
    String CODIGOTIENDA;
    /**
     * Creates new form RealizarPedido
     * @param CODIGOTIENDA
     */
    public RealizarPedido(String CODIGOTIENDA) {
        initComponents();
        this.CODIGOTIENDA=CODIGOTIENDA;
        TiendaActualLabel.setText(CODIGOTIENDA);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BuscaCodigoP = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        MuestraProductos = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        TiendaActualLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(54, 191, 165));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 3, 24)); // NOI18N
        jLabel1.setText("Realizar pedido");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(256, 34, 174, 29);

        jLabel4.setText("Puedes buscar articulos en otras tiendas ingresando ");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 80, 363, 18);

        jLabel2.setText("el codigo del producto.");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 100, 160, 18);
        jPanel1.add(BuscaCodigoP);
        BuscaCodigoP.setBounds(50, 130, 200, 40);

        jButton1.setText("Buscar Producto");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(310, 120, 151, 50);

        MuestraProductos.setColumns(20);
        MuestraProductos.setRows(5);
        jScrollPane1.setViewportView(MuestraProductos);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(50, 180, 559, 170);

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jLabel3.setText("Tienda Destino:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(436, 0, 113, 42);
        jPanel1.add(TiendaActualLabel);
        TiendaActualLabel.setBounds(555, 0, 79, 42);

        jLabel5.setText("Agrega la fecha de hoy");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(50, 360, 180, 30);

        jFormattedTextField1.setText("jFormattedTextField1");
        jPanel1.add(jFormattedTextField1);
        jFormattedTextField1.setBounds(50, 400, 173, 35);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MuestraProductos.setText("");
        BuscaProducto();
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BuscaCodigoP;
    private javax.swing.JTextArea MuestraProductos;
    private javax.swing.JLabel TiendaActualLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    
    /**
     * Busca los productos en otras tiendas y calcula el tiempo de envio
     */
    public  void BuscaProducto() {  
        String query = "SELECT DISTINCTROW codigo_tienda_exist,codigo_producto,nombre_producto,cantidad,precio,dias_espera " +
                        "FROM productos p INNER JOIN tiempo_entre_tiendas t ON " +
                        "p.codigo_tienda_exist = t.origen AND t.destino= ? "
                        + "AND p.codigo_producto LIKE ?";

        try (PreparedStatement preSt = getConnection().prepareStatement(query)) {

            preSt.setString(1, CODIGOTIENDA);
            preSt.setString(2, "%" + BuscaCodigoP.getText() + "%");
            ResultSet result = preSt.executeQuery();

            MuestraProductos.append("TIENDA \t PRODUCTO \t NOMBRE \t CANTIDAD \t PRECIO \t DIAS DE ENVIO"+"\n");

            while (result.next()) {
                MuestraProductos.append(result.getString(1)+"\t"+result.getString(2)+"\t"+result.getString(3)+"\t"+result.getInt(4)+"\t"
                +result.getDouble(5)+"\t    "+result.getInt(6)+"\t"+"\n");
                
            }
            BuscaProducto2();
            result.close();
            preSt.close();
        } catch (SQLException e) {
            
        }
        
    }
        /**
     * Busca los productos en otras tiendas y calcula el tiempo de envio
     */
    private void BuscaProducto2() {  
        String query = "SELECT DISTINCTROW codigo_tienda_exist,codigo_producto,nombre_producto,cantidad,precio,dias_espera " +
                        "FROM productos p INNER JOIN tiempo_entre_tiendas t ON " +
                        "p.codigo_tienda_exist = t.destino AND t.origen= ? "
                        + "AND p.codigo_producto LIKE ?";

        try (PreparedStatement preSt = getConnection().prepareStatement(query)) {

            preSt.setString(1, CODIGOTIENDA);
            preSt.setString(2, "%" + BuscaCodigoP.getText() + "%");
            ResultSet result = preSt.executeQuery();

            
            while (result.next()) {
                MuestraProductos.append(result.getString(1)+"\t"+result.getString(2)+"\t"+result.getString(3)+"\t"+result.getInt(4)+"\t"
                +result.getDouble(5)+"\t    "+result.getInt(6)+"\t"+"\n");
                
            }

            result.close();
            preSt.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
    }





}
