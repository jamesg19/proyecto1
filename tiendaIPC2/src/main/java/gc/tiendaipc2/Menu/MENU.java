/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gc.tiendaipc2.Menu;

import static ConexionMySQL.Conexion.getConnection;
import gc.tiendaipc2.FRAME.NuevaInformacion.CargaArchivo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author james
 */
public class MENU extends javax.swing.JFrame {
    ArrayList<String> ArraycodT = new ArrayList<>();
    ArrayList<String> tienda = new ArrayList<>();
    ArrayList<String> ArrayCliente = new ArrayList<>();
    ArrayList<String> ArrayEmpleado = new ArrayList<>();
    
    String cod,nom,dir;
    
    /**
     * Creates new form MENU
     */
    public MENU() {
        
        initComponents();
        comprobarDupicado();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Cliente = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        id_usuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ComboBoxTienda = new javax.swing.JComboBox<>();
        ActualizarBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(93, 220, 156));

        jLabel1.setFont(new java.awt.Font("Umpush", 2, 24)); // NOI18N
        jLabel1.setText("Bienvenido a Intelaf");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel2.setText("Soy:");

        Cliente.setText("Cliente");
        Cliente.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                ClienteComponentHidden(evt);
            }
        });
        Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClienteActionPerformed(evt);
            }
        });

        jButton2.setText("Empledo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Ingresa tu usuario:");

        jLabel4.setText("Codigo cliente/Codigo Empleado");

        ComboBoxTienda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona una tienda..." }));

        ActualizarBtn.setText("Actualizar");
        ActualizarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ActualizarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ComboBoxTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(id_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(117, 117, 117)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ComboBoxTienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(51, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ActualizarBtn)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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

    private void ClienteComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_ClienteComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_ClienteComponentHidden

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String seleccionTienda=(String) ComboBoxTienda.getSelectedItem();
        String [] cod=seleccionTienda.split(",");
        loginEmpleado(id_usuario.getText(),cod[0]);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteActionPerformed
        // TODO add your handling code here:
        String seleccionTienda=(String) ComboBoxTienda.getSelectedItem();
        String [] cod=seleccionTienda.split(",");
        loginCliente(id_usuario.getText(),cod[0]);
        
    }//GEN-LAST:event_ClienteActionPerformed

    private void ActualizarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarBtnActionPerformed
        // TODO add your handling code here:
        comprobarDupicado();
    }//GEN-LAST:event_ActualizarBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ActualizarBtn;
    private javax.swing.JButton Cliente;
    private javax.swing.JComboBox<String> ComboBoxTienda;
    private javax.swing.JTextField id_usuario;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
    /**
     * metodo que comprueba si la base de datos esta vacia
     */
    private void comprobarDupicado() {
        
        String query = "SELECT * FROM tienda";

        try (PreparedStatement preSt = getConnection().prepareStatement(query);
                ResultSet result = preSt.executeQuery()) {

            //obtiene los codigo de las tiendas registradas 
            //para determinar si se inicia con login o no
            while (result.next()) {
                
                cod=result.getString(1);
                nom=result.getString(2);
                dir=result.getString(3);
                ArraycodT.add(cod+", "+nom+" "+dir);
                tienda.add(cod);
            }

            result.close();
            
        } catch (SQLException e) {
            //System.out.println("Error: " + e.getMessage());
        }
        
        if(ArraycodT.isEmpty()){
            //instancia la clase para cargas datos a BD vacia
            
            //habilita la opciones de login
            jLabel3.setVisible(true);
            id_usuario.setVisible(true);
            jLabel4.setVisible(true);
            Cliente.setEnabled(true);
            //agrega los datos de tienda a Comobox
            AgregaDatosJComboB();
            obtieneCliente();
            obtieneEmpleado();
            CargaArchivo Texto = new CargaArchivo();
            Texto.setVisible(true);
            
        }else{
            jLabel3.setVisible(true);
            id_usuario.setVisible(true);
            jLabel4.setVisible(true);
            AgregaDatosJComboB();
            obtieneCliente();
            obtieneEmpleado();
        }
    }
    /**
     * agrega los datos de las tiendas en Combox para logearse en Menu
     */
    private void AgregaDatosJComboB() {
        
        for(int t=0;t<ArraycodT.size();t++){
            ComboBoxTienda.addItem(ArraycodT.get(t));
            
        }
        
       
    }
    
    /**
     * obtiene los datos de cliente 
     */
    private void obtieneCliente() {
        
        String query = "SELECT * FROM clientes";

        try (PreparedStatement preSt = getConnection().prepareStatement(query);
                ResultSet result = preSt.executeQuery()) {

            //obtiene el codigo de cliente
            while (result.next()) {
                
                String codC=result.getString(2);

                ArrayCliente.add(codC);
                
            }

            result.close();
            
        } catch (SQLException e) {
            
        }
    }
    
    /**
     * obtiene los datos de empleado
     */
    private void obtieneEmpleado() {
        
        String query = "SELECT * FROM empleados";

        try (PreparedStatement preSt = getConnection().prepareStatement(query);
                ResultSet result = preSt.executeQuery()) {

            //obtiene los el codigo de empeado
            while (result.next()) {
                
                String codC=result.getString(1);

                ArrayEmpleado.add(codC);
                
            }

            result.close();
            
        } catch (SQLException e) {
            
        }
    }

    private void loginEmpleado(String id,String cod_tienda) {
        
        if(ArrayEmpleado.contains(id)&& tienda.contains(cod_tienda)){
            
        EmpleadoJFrame empleado = new EmpleadoJFrame(cod_tienda,id);
        empleado.setVisible(true);
        setVisible(false);  
            
        }else{
            JOptionPane.showMessageDialog(null, "El id empleado no existee");
        }
        
    }

    private void loginCliente(String id,String cod_tienda) {
        
        if(ArrayCliente.contains(id)&& tienda.contains(cod_tienda)){
        ClienteJFrame menucliente=new ClienteJFrame(cod_tienda);
        menucliente.setVisible(true);
        setVisible(false);  
            
        }else{
            JOptionPane.showMessageDialog(null, "El id cliente no existe");
        }
    }
    
    
    
    
}
