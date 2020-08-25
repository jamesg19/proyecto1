
package Reportes;

import static ConexionMySQL.Conexion.getConnection;
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
public class Reporte4 extends javax.swing.JFrame {
    String CODIGOTIENDA,FECHA,FECHAENTREGA;
    ArrayList<String> LineaPedido = new ArrayList<>();                                                                                                      ArrayList<String> PedidoListoEntrega = new ArrayList<>(); 
    ArrayList<String> ArrayFecha = new ArrayList<>();                                                                                                       ArrayList<String> Cliente = new ArrayList<>();
    ArrayList<Integer> ArrayDias = new ArrayList<>();                             
    ArrayList<String> CODpedido = new ArrayList<>();
    ArrayList<String> producto = new ArrayList<>();                                                                                                         ArrayList<String> productoN = new ArrayList<>();
    ArrayList<Integer> cantidad = new ArrayList<>();                                                                                                        ArrayList<Integer> cantidadN = new ArrayList<>();
    ArrayList<Double> total = new ArrayList<>();                                                                                                            ArrayList<Double> totalN = new ArrayList<>();
    ArrayList<String> ArrayCLiente = new ArrayList<>();
    /**
     * Creates new form EntregaPedido
     * @param CODIGOTIENDA
     */                 
    public Reporte4(String CODIGOTIENDA) {
        initComponents();
        this.CODIGOTIENDA=CODIGOTIENDA;
        TiendaLabel.setText(CODIGOTIENDA);
        
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(97, 150, 134));

        MuestraDatos.setColumns(20);
        MuestraDatos.setRows(5);
        jScrollPane1.setViewportView(MuestraDatos);

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

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

        jLabel1.setFont(new java.awt.Font("TlwgTypewriter", 3, 22)); // NOI18N
        jLabel1.setText("tienda y estan en transito");

        jLabel3.setFont(new java.awt.Font("TlwgTypewriter", 3, 24)); // NOI18N
        jLabel3.setText("Pedidos que salieron de la ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(64, 64, 64)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addComponent(Year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Mes, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Dia, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(51, 51, 51)
                                    .addComponent(Verificar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(68, 68, 68)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(78, 78, 78)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(62, 62, 62)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(156, 156, 156))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(56, 56, 56)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(TiendaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TiendaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Year, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Verificar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Dia;
    private javax.swing.JComboBox<String> Mes;
    private javax.swing.JTextArea MuestraDatos;
    private javax.swing.JLabel TiendaLabel;
    private javax.swing.JButton Verificar;
    private javax.swing.JSpinner Year;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    /**
     * limpia los arrayList utilizados para el proceso de informacion de 
     * la base de datos
     */
    private void limpiaArray(){
        LineaPedido.clear();
        ArrayFecha.clear();
        ArrayDias.clear();
        producto.clear();
        cantidad.clear();
        CODpedido.clear();
        total.clear();
        PedidoListoEntrega.clear();
        productoN.clear();
        cantidadN.clear();
        totalN.clear();
        ArrayCLiente.clear();
        Cliente.clear();
    }
    
    
    
    /**
     * Metodo para buscar pedidos del cliente seleccionado a la tienda actual
     */
    private void buscar() {
        String query = "SELECT distinctrow cod_cliente,tienda_origen,tienda_destino,fecha,cod_articulo,cantidad,total,dias_espera,codigo_pedido FROM pedido p INNER JOIN tiempo_entre_tiendas t ON p.tienda_origen=t.origen and p.tienda_origen= ?   ";

        LineaPedido.clear();
        try (PreparedStatement preSt = getConnection().prepareStatement(query)) {    
            
            preSt.setString(1, CODIGOTIENDA);

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
                Cliente.add(result.getString(1));
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
        
    
        //buscar2();
        verificaFecha();
    }
        /**
         * Verifica los producto que estan por ingresar
         */
        private void buscar2() {
        String query = "SELECT distinctrow cod_cliente,tienda_origen,tienda_destino,fecha,cod_articulo,cantidad,total,dias_espera,codigo_pedido FROM pedido p INNER JOIN tiempo_entre_tiendas t ON p.tienda_destino=t.origen and p.tienda_destino= ? ";

        LineaPedido.clear();
        try (PreparedStatement preSt = getConnection().prepareStatement(query)) {    
            
            preSt.setString(1, CODIGOTIENDA);

            ResultSet result = preSt.executeQuery();
           
            while (result.next()) {
                          
                LineaPedido.add(result.getString(1)+"\t "+result.getString(2)+"\t "+result.getString(3)+"\t   "+result.getString(4)+"\t    "+result.getString(5) 
                            +"\t   "+result.getInt(6)+"\t   "+result.getDouble(7)+"\t   "+result.getInt(8)+"\t"); 
                ArrayFecha.add(result.getString(4));
                ArrayDias.add(result.getInt(8));
                Cliente.add(result.getString(1));
                CODpedido.add(result.getString(9));
                producto.add(result.getString(5));
                cantidad.add(result.getInt(6));
                total.add(result.getDouble(7));

            }
            result.close();
            preSt.close();
            

        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        
    
        
//        verificaFecha();
    }
    /**
     * verifica la fecha ingresada por el usuario manualmente
     */
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
                        ArrayCLiente.add(Cliente.get(pos));
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
                        ArrayCLiente.add(Cliente.get(pos));
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
                        ArrayCLiente.add(Cliente.get(pos));
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
                        ArrayCLiente.add(Cliente.get(pos));
                 }

        }
 
                    
        return fe.format(calendar.getTime());
    }


}
