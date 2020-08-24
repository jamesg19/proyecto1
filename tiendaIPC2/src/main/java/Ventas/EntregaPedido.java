/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventas;

import static ConexionMySQL.Conexion.getConnection;
import static Ventas.Vender.RegistraVenta;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author james
 */
public class EntregaPedido extends javax.swing.JFrame {
    String CODIGOTIENDA,FECHA,FECHAENTREGA;
    ArrayList<String> LineaPedido = new ArrayList<>();                                                                                                      ArrayList<String> PedidoListoEntrega = new ArrayList<>(); 
    ArrayList<String> ArrayFecha = new ArrayList<>();                                                                                                       ArrayList<String> Cliente = new ArrayList<>();
    ArrayList<String> ArrayFechanNew = new ArrayList<>();
    ArrayList<Integer> ArrayDias = new ArrayList<>();                             
    ArrayList<String> CODpedido = new ArrayList<>();
    ArrayList<String> producto = new ArrayList<>();                                                                                                         ArrayList<String> productoN = new ArrayList<>();
    ArrayList<Integer> cantidad = new ArrayList<>();                                                                                                        ArrayList<Integer> cantidadN = new ArrayList<>();
    ArrayList<Double> total = new ArrayList<>();                                                                                                            ArrayList<Double> totalN = new ArrayList<>();
    /**
     * Creates new form EntregaPedido
     * @param CODIGOTIENDA
     */                 
    public EntregaPedido(String CODIGOTIENDA) {
        initComponents();
        this.CODIGOTIENDA=CODIGOTIENDA;
        TiendaLabel.setText(CODIGOTIENDA);
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        MuestraDatos = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        TiendaLabel = new javax.swing.JLabel();
        Dia = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        Mes = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        Year = new javax.swing.JSpinner();
        jLabel19 = new javax.swing.JLabel();
        Verificar = new javax.swing.JButton();
        NIT = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        Entregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(83, 142, 167));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        jLabel1.setText("Entrega de pedido");

        MuestraDatos.setColumns(20);
        MuestraDatos.setRows(5);
        jScrollPane1.setViewportView(MuestraDatos);

        jButton1.setText("SALIR");

        jLabel2.setText("Tienda:");

        Dia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " " }));

        jLabel12.setText("D");

        Mes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        jLabel20.setText("M");

        Year.setModel(new javax.swing.SpinnerNumberModel(2020, 2020, 2020, 1));

        jLabel19.setText("Y");

        Verificar.setText("Verificar");
        Verificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerificarActionPerformed(evt);
            }
        });

        jLabel21.setText("NIT");

        Entregar.setText("Entregar Pedido");
        Entregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TiendaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Entregar, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(38, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(NIT, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 327, Short.MAX_VALUE)
                                        .addComponent(Verificar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(Year, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Mes, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Dia, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TiendaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel19)
                        .addComponent(jLabel21))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(jLabel20)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Year, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Dia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Verificar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NIT, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Entregar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerificarActionPerformed
        // TODO add your handling code here:
        limpiaArray();
        FECHA=(String) Year.getValue().toString()+"-"+(String) Mes.getSelectedItem()+"-"+(String) Dia.getSelectedItem();
        buscar();
        
    }//GEN-LAST:event_VerificarActionPerformed

    private void EntregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntregarActionPerformed
        // TODO add your handling code here:
        
        eliminaPedido();
        agregaPedidoEntregado();
        AgregaVenta();
    }//GEN-LAST:event_EntregarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Dia;
    private javax.swing.JButton Entregar;
    private javax.swing.JComboBox<String> Mes;
    private javax.swing.JTextArea MuestraDatos;
    private javax.swing.JTextField NIT;
    private javax.swing.JLabel TiendaLabel;
    private javax.swing.JButton Verificar;
    private javax.swing.JSpinner Year;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    private void limpiaArray(){
        LineaPedido.clear();
        ArrayFecha.clear();
        ArrayDias.clear();
        PedidoListoEntrega.clear();
        producto.clear();
        cantidad.clear();
        total.clear();
        productoN.clear();
        cantidadN.clear();
        totalN.clear();
    }
    
    
    
    
    private void buscar() {
        String query = "SELECT distinctrow cod_cliente,tienda_origen,tienda_destino,fecha,cod_articulo,cantidad,total,dias_espera,codigo_pedido FROM pedido p INNER JOIN tiempo_entre_tiendas t ON p.tienda_destino=t.destino and p.tienda_destino= ?  AND p.cod_cliente= ? ";

        LineaPedido.clear();
        try (PreparedStatement preSt = getConnection().prepareStatement(query)) {    
            
            preSt.setString(1, CODIGOTIENDA);
            preSt.setString(2, NIT.getText());
            
            
            ResultSet result = preSt.executeQuery();
            MuestraDatos.setText("");
            MuestraDatos.append("Cliente\t Origen\t Destino\t Fecha\t Articulo \t Cantidad \t Total \t Dias Espera \n");
            while (result.next()) {
                
//                MuestraDatos.append(result.getString(1)+" \t"+result.getString(2)+"  \t"+result.getString(3)+"    \t"+
//                        result.getString(4)+"   \t"+result.getString(5)+"   \t"
//                        +result.getInt(6)+"   \t"+result.getDouble(7)+"   \t"+result.getInt(8)+"\n");
//            
                LineaPedido.add(result.getString(1)+"\t "+result.getString(2)+"\t "+result.getString(3)+"\t   "+result.getString(4)+"\t    "+result.getString(5) 
                            +"\t   "+result.getInt(6)+"\t   "+result.getDouble(7)+"\t   "+result.getInt(8)+"\t");
                
                ArrayFecha.add(result.getString(4));
                ArrayDias.add(result.getInt(8));
                Cliente.add(result.getString(5));
                CODpedido.add(result.getString(9));
                producto.add(result.getString(5));
                cantidad.add(result.getInt(6));
                total.add(result.getDouble(7));
                
//                MuestraDatos.append(result.getString(4)+result.getInt(8)+"\n");
                
            }
            result.close();
            preSt.close();
            

        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        
    
        
        verificaFecha();
    }

    public void verificaFecha() {
        
        
    
            
    for(int i=0;i<LineaPedido.size();i++){
        sumarDiasAFecha(ArrayFecha.get(i),ArrayDias.get(i),i);
    }

        
        
        
    }
    
    
     /**
     * OBTENER FECHA DE ENTREGA
     * suma los dias que tarda un producto en ser entregado a la tienda
     * 
     * @param fecha
     * @param dias
     * @param pos
     * @return 
     */
     public  String sumarDiasAFecha(String fecha, int dias,int pos) {

        if(dias == 0){
            return fecha;
        }

        String[] f = fecha.split("-");
        Calendar calendar = Calendar.getInstance();
        //calendar.setTime(new Date(Integer.parseInt(f[0]), Integer.parseInt(f[1]), Integer.parseInt(f[2])));
        calendar.set(Integer.parseInt(f[0]), Integer.parseInt(f[1])-1, Integer.parseInt(f[2]));
        calendar.add(Calendar.DAY_OF_MONTH, dias);
        SimpleDateFormat fe = new SimpleDateFormat("YYYY-MM-dd");
        
        if((calendar.getTime().getMonth()+1)<10&&(calendar.getTime().getDate())<10){
          FECHAENTREGA="2020-"+"0"+(calendar.getTime().getMonth()+1)+"-0"+(calendar.getTime().getDate());
            
                if(FECHAENTREGA.contains(FECHA.trim())){
                        MuestraDatos.append(LineaPedido.get(pos)+"\n");
                        PedidoListoEntrega.add(CODpedido.get(pos));
                                
                        productoN.add(producto.get(pos));
                        cantidadN.add(cantidad.get(pos));  
                        totalN.add(total.get(pos));
    
                 }
        }
        if((calendar.getTime().getMonth()+1)<10&&(calendar.getTime().getDate())>=10){
          FECHAENTREGA="2020-"+"0"+(calendar.getTime().getMonth()+1)+"-"+(calendar.getTime().getDate());
            
                if(FECHAENTREGA.contains(FECHA.trim())){
                        MuestraDatos.append(LineaPedido.get(pos)+"\n");
                        PedidoListoEntrega.add(CODpedido.get(pos));
                        productoN.add(producto.get(pos));
                        cantidadN.add(cantidad.get(pos));  
                        totalN.add(total.get(pos));
                 }
          
        }
        if((calendar.getTime().getMonth()+1)>10&&(calendar.getTime().getDate())<=10){
          FECHAENTREGA="2020-"+(calendar.getTime().getMonth()+1)+"-0"+(calendar.getTime().getDate());
            
                if(FECHAENTREGA.contains(FECHA.trim())){
                        MuestraDatos.append(LineaPedido.get(pos)+"\n");
                        PedidoListoEntrega.add(CODpedido.get(pos));
                        productoN.add(producto.get(pos));
                        cantidadN.add(cantidad.get(pos));  
                        totalN.add(total.get(pos));
                 }
          
          
        }
        if((calendar.getTime().getMonth()+1)>=10&&(calendar.getTime().getDate())>=10){
          FECHAENTREGA="2020-"+(calendar.getTime().getMonth()+1)+"-"+(calendar.getTime().getDate());
            
                if(FECHAENTREGA.contains(FECHA.trim())){
                        MuestraDatos.append(LineaPedido.get(pos)+"\n");
                        PedidoListoEntrega.add(CODpedido.get(pos));
                        productoN.add(producto.get(pos));
                        cantidadN.add(cantidad.get(pos));  
                        totalN.add(total.get(pos));
                 }
          
          
        }
        

       
                    
        return fe.format(calendar.getTime());
    }

    private void eliminaPedido() {
        
     for(int m=0;m<PedidoListoEntrega.size();m++){
         
          String query = "DELETE FROM pedido WHERE codigo_pedido= ?";
        
            try (PreparedStatement preSt = getConnection().prepareStatement(query)) {

                preSt.setString(1, PedidoListoEntrega.get(m));


                preSt.executeUpdate();


                preSt.close();
            } catch (SQLException e) {
                System.out.println("ERROR AL ELIMINAR PEDIDO" + e.getMessage());
            }
         
     }
  
    }

    private void agregaPedidoEntregado() {
      
        
        for(int j=0;j<productoN.size();j++){

   
        String query = "INSERT INTO ventas VALUES (?,?,?,?,?,?,?)";

        try (PreparedStatement preSt = getConnection().prepareStatement(query)) {

            preSt.setInt(1, 0);
            preSt.setString(2, CODIGOTIENDA);
            preSt.setString(3, NIT.getText());
            preSt.setString(4, productoN.get(j));
            preSt.setInt(5, cantidadN.get(j));
            preSt.setDouble(6, (totalN.get(j)/ cantidadN.get(j)));
            preSt.setDouble(7, totalN.get(j));
            
            preSt.executeUpdate();
            
            preSt.close();
        } catch (SQLException e) {
            //System.out.println("Error: " + e.getMessage());
        }
    
        }        
        
        
        
        
        
        
    }

    private void AgregaVenta() {
      
        for(int j=0;j<productoN.size();j++){

   
        String query = "INSERT INTO ventas VALUES (?,?,?,?,?,?,?)";

        try (PreparedStatement preSt = getConnection().prepareStatement(query)) {

            preSt.setInt(1, 0);
            preSt.setString(2, CODIGOTIENDA);
            preSt.setString(3, NIT.getText());
            preSt.setString(4, productoN.get(j));
            preSt.setInt(5, cantidadN.get(j));
            preSt.setDouble(6, (totalN.get(j)/ cantidadN.get(j)));
            preSt.setDouble(7, totalN.get(j));
            
            preSt.executeUpdate();
            
            preSt.close();
        } catch (SQLException e) {
            //System.out.println("Error: " + e.getMessage());
        }
    
        } 
    }

}