/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gc.tiendaipc2.Menu;


import Ventas.RealizarPedido;
import Ventas.Vender;
import gc.tiendaipc2.FRAME.NuevaInformacion.AgregaProducto;
import gc.tiendaipc2.FRAME.NuevaInformacion.Nueva_Tienda;
import gc.tiendaipc2.FRAME.NuevaInformacion.tiempoTiendas;

/**
 *
 * @author james
 */
public class EmpleadoJFrame extends javax.swing.JFrame {
    String empleado,CODIGOTIENDA;
    Nueva_Tienda nuevatienda=new Nueva_Tienda();

    public EmpleadoJFrame(String CODIGOTIENDA, String empleado) {
        initComponents();
        this.empleado=empleado;
        this.CODIGOTIENDA=CODIGOTIENDA;
        UsuarioLabel.setText(empleado);
        TiendaLabel.setText(CODIGOTIENDA);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        AgregarTienda = new javax.swing.JButton();
        AgregarNuevosProductos = new javax.swing.JButton();
        Vender = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        TiempoEntreTiendas = new javax.swing.JButton();
        PedidoBtn = new javax.swing.JButton();
        CrearUsuarios = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        salirBtn = new javax.swing.JButton();
        UsuarioLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TiendaLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(120, 152, 184));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 3, 24)); // NOI18N
        jLabel1.setText("Menu Empleado");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(255, 27, 216, 51);

        AgregarTienda.setText("Agregar nueva tienda");
        AgregarTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarTiendaActionPerformed(evt);
            }
        });
        jPanel1.add(AgregarTienda);
        AgregarTienda.setBounds(40, 240, 194, 36);

        AgregarNuevosProductos.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        AgregarNuevosProductos.setText("Nuevo Producto");
        AgregarNuevosProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarNuevosProductosActionPerformed(evt);
            }
        });
        jPanel1.add(AgregarNuevosProductos);
        AgregarNuevosProductos.setBounds(40, 340, 194, 42);

        Vender.setText("Vender");
        Vender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VenderActionPerformed(evt);
            }
        });
        jPanel1.add(Vender);
        Vender.setBounds(430, 240, 154, 38);

        jButton4.setText("Entrega de pedido");
        jPanel1.add(jButton4);
        jButton4.setBounds(430, 340, 154, 38);

        TiempoEntreTiendas.setText("Tiempo entre tiendas");
        TiempoEntreTiendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TiempoEntreTiendasActionPerformed(evt);
            }
        });
        jPanel1.add(TiempoEntreTiendas);
        TiempoEntreTiendas.setBounds(40, 290, 194, 37);

        PedidoBtn.setText("Realizar pedido");
        PedidoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PedidoBtnActionPerformed(evt);
            }
        });
        jPanel1.add(PedidoBtn);
        PedidoBtn.setBounds(430, 290, 154, 40);

        CrearUsuarios.setText("Crear usuarios");
        CrearUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearUsuariosActionPerformed(evt);
            }
        });
        jPanel1.add(CrearUsuarios);
        CrearUsuarios.setBounds(40, 400, 194, 38);

        jLabel2.setFont(new java.awt.Font("Ubuntu", 3, 16)); // NOI18N
        jLabel2.setText("Registro de nueva informacion");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 190, 270, 44);

        jLabel3.setText("Usuario:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(37, 90, 69, 28);

        salirBtn.setBackground(new java.awt.Color(215, 69, 58));
        salirBtn.setText("SALIR");
        salirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirBtnActionPerformed(evt);
            }
        });
        jPanel1.add(salirBtn);
        salirBtn.setBounds(37, 27, 107, 28);
        jPanel1.add(UsuarioLabel);
        UsuarioLabel.setBounds(124, 90, 241, 32);

        jLabel4.setText("Tienda:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(37, 128, 69, 29);
        jPanel1.add(TiendaLabel);
        TiendaLabel.setBounds(124, 128, 241, 29);

        jButton1.setText("Reportes");
        jPanel1.add(jButton1);
        jButton1.setBounds(430, 390, 160, 40);

        jButton2.setText("Agrega  Producto");
        jPanel1.add(jButton2);
        jButton2.setBounds(260, 340, 150, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarTiendaActionPerformed
        // TODO add your handling code here:
        nuevatienda.setVisible(true);
    }//GEN-LAST:event_AgregarTiendaActionPerformed

    private void TiempoEntreTiendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TiempoEntreTiendasActionPerformed
        // TODO add your handling code here:
        tiempoTiendas tiempo=new tiempoTiendas();
        tiempo.setVisible(true);
    }//GEN-LAST:event_TiempoEntreTiendasActionPerformed

    private void VenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VenderActionPerformed
        // TODO add your handling code here:
        Vender venta=new Vender(CODIGOTIENDA);
        venta.setVisible(true);
    }//GEN-LAST:event_VenderActionPerformed

    private void salirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirBtnActionPerformed
        // TODO add your handling code here:
        MENU Menu=new MENU();
        Menu.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_salirBtnActionPerformed

    private void AgregarNuevosProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarNuevosProductosActionPerformed
        // TODO add your handling code here:
        
        AgregaProducto nuevo_producto=new AgregaProducto(CODIGOTIENDA);
        nuevo_producto.setVisible(true);
    }//GEN-LAST:event_AgregarNuevosProductosActionPerformed

    private void CrearUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearUsuariosActionPerformed

    }//GEN-LAST:event_CrearUsuariosActionPerformed

    private void PedidoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PedidoBtnActionPerformed
        RealizarPedido pedido =new RealizarPedido(CODIGOTIENDA);
        pedido.setVisible(true);
    }//GEN-LAST:event_PedidoBtnActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarNuevosProductos;
    private javax.swing.JButton AgregarTienda;
    private javax.swing.JButton CrearUsuarios;
    private javax.swing.JButton PedidoBtn;
    private javax.swing.JButton TiempoEntreTiendas;
    private javax.swing.JLabel TiendaLabel;
    private javax.swing.JLabel UsuarioLabel;
    private javax.swing.JButton Vender;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton salirBtn;
    // End of variables declaration//GEN-END:variables
}
