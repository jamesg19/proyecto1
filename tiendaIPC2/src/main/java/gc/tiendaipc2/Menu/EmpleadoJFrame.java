/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gc.tiendaipc2.Menu;


import EditarInformacion.EditaCliente;
import EditarInformacion.EditaTienda;
import EditarInformacion.EditaEmpleado;
import Reportes.ReporteJFrame;
import Ventas.EntregaPedido;
import Ventas.RealizarPedido;
import Ventas.Vender;
import gc.tiendaipc2.FRAME.NuevaInformacion.AgregaProducto;
import gc.tiendaipc2.FRAME.NuevaInformacion.*;
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
        VenderBtn = new javax.swing.JButton();
        EntregaBtn = new javax.swing.JButton();
        TiempoEntreTiendas = new javax.swing.JButton();
        RealizaPedidoBtn = new javax.swing.JButton();
        CrearUsuarios = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        salirBtn = new javax.swing.JButton();
        UsuarioLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TiendaLabel = new javax.swing.JLabel();
        ReporteBtn = new javax.swing.JButton();
        AnadeProducto = new javax.swing.JButton();
        EditaTienda = new javax.swing.JButton();
        EditaEmpleado = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(69, 198, 164));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 3, 24)); // NOI18N
        jLabel1.setText("Menu Empleado");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(360, 0, 216, 51);

        AgregarTienda.setText("Agregar nueva tienda");
        AgregarTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarTiendaActionPerformed(evt);
            }
        });
        jPanel1.add(AgregarTienda);
        AgregarTienda.setBounds(40, 240, 210, 36);

        AgregarNuevosProductos.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        AgregarNuevosProductos.setText("Nuevo Producto");
        AgregarNuevosProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarNuevosProductosActionPerformed(evt);
            }
        });
        jPanel1.add(AgregarNuevosProductos);
        AgregarNuevosProductos.setBounds(40, 340, 210, 42);

        VenderBtn.setText("Vender");
        VenderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VenderBtnActionPerformed(evt);
            }
        });
        jPanel1.add(VenderBtn);
        VenderBtn.setBounds(610, 240, 180, 38);

        EntregaBtn.setText("Entrega de pedido");
        EntregaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntregaBtnActionPerformed(evt);
            }
        });
        jPanel1.add(EntregaBtn);
        EntregaBtn.setBounds(610, 340, 180, 38);

        TiempoEntreTiendas.setText("Tiempo entre tiendas");
        TiempoEntreTiendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TiempoEntreTiendasActionPerformed(evt);
            }
        });
        jPanel1.add(TiempoEntreTiendas);
        TiempoEntreTiendas.setBounds(40, 290, 210, 37);

        RealizaPedidoBtn.setText("Realizar pedido");
        RealizaPedidoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RealizaPedidoBtnActionPerformed(evt);
            }
        });
        jPanel1.add(RealizaPedidoBtn);
        RealizaPedidoBtn.setBounds(610, 290, 180, 40);

        CrearUsuarios.setText("Crear Cliente");
        CrearUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearUsuariosActionPerformed(evt);
            }
        });
        jPanel1.add(CrearUsuarios);
        CrearUsuarios.setBounds(40, 390, 210, 38);

        jLabel2.setFont(new java.awt.Font("Ubuntu", 3, 16)); // NOI18N
        jLabel2.setText("Actividades de la tienda");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(600, 190, 210, 44);

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

        ReporteBtn.setText("Reportes");
        ReporteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReporteBtnActionPerformed(evt);
            }
        });
        jPanel1.add(ReporteBtn);
        ReporteBtn.setBounds(610, 390, 180, 40);

        AnadeProducto.setText("Agrega  Producto");
        AnadeProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnadeProductoActionPerformed(evt);
            }
        });
        jPanel1.add(AnadeProducto);
        AnadeProducto.setBounds(360, 390, 170, 40);

        EditaTienda.setText("Tienda");
        EditaTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditaTiendaActionPerformed(evt);
            }
        });
        jPanel1.add(EditaTienda);
        EditaTienda.setBounds(360, 240, 170, 40);

        EditaEmpleado.setText("Empleado");
        EditaEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditaEmpleadoActionPerformed(evt);
            }
        });
        jPanel1.add(EditaEmpleado);
        EditaEmpleado.setBounds(360, 290, 170, 40);

        jLabel5.setFont(new java.awt.Font("Ubuntu", 3, 16)); // NOI18N
        jLabel5.setText("Registro de nueva informacion");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 190, 250, 44);

        jButton1.setText("Cliente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(360, 340, 170, 40);

        jButton2.setText("Crear Empleado");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(40, 440, 210, 40);

        jButton3.setText("Crear Cliente");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(40, 490, 210, 40);

        jLabel6.setFont(new java.awt.Font("Ubuntu", 3, 16)); // NOI18N
        jLabel6.setText("Ver y editar informacion");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(340, 190, 210, 44);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 855, Short.MAX_VALUE)
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

    private void VenderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VenderBtnActionPerformed
        // TODO add your handling code here:
        Vender venta=new Vender(CODIGOTIENDA);
        venta.setVisible(true);
    }//GEN-LAST:event_VenderBtnActionPerformed

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

    private void RealizaPedidoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RealizaPedidoBtnActionPerformed
        RealizarPedido pedido=new RealizarPedido(CODIGOTIENDA);
        pedido.setVisible(true);
    }//GEN-LAST:event_RealizaPedidoBtnActionPerformed

    private void EntregaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntregaBtnActionPerformed
        // TODO add your handling code here:
        EntregaPedido entrega=new EntregaPedido(CODIGOTIENDA);
        entrega.setVisible(true);
    }//GEN-LAST:event_EntregaBtnActionPerformed

    private void ReporteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReporteBtnActionPerformed
        // TODO add your handling code here:
        ReporteJFrame reportes=new ReporteJFrame(CODIGOTIENDA);
        
        reportes.setVisible(true);
    }//GEN-LAST:event_ReporteBtnActionPerformed

    private void EditaTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditaTiendaActionPerformed
        // TODO add your handling code here:
        EditaTienda editaEmpleado=new EditaTienda();
        editaEmpleado.setVisible(true);
    }//GEN-LAST:event_EditaTiendaActionPerformed

    private void EditaEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditaEmpleadoActionPerformed

        
        EditaEmpleado editatienda=new EditaEmpleado();
        editatienda.setVisible(true);
        
    }//GEN-LAST:event_EditaEmpleadoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        EditaCliente editCliente=new EditaCliente();
        editCliente.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void AnadeProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnadeProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AnadeProductoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        CreaCliente nuevocliente=new CreaCliente();
        nuevocliente.setVisible(true);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        CreaEmpleado empleadoNuevo=new CreaEmpleado();
        empleadoNuevo.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarNuevosProductos;
    private javax.swing.JButton AgregarTienda;
    private javax.swing.JButton AnadeProducto;
    private javax.swing.JButton CrearUsuarios;
    private javax.swing.JButton EditaEmpleado;
    private javax.swing.JButton EditaTienda;
    private javax.swing.JButton EntregaBtn;
    private javax.swing.JButton RealizaPedidoBtn;
    private javax.swing.JButton ReporteBtn;
    private javax.swing.JButton TiempoEntreTiendas;
    private javax.swing.JLabel TiendaLabel;
    private javax.swing.JLabel UsuarioLabel;
    private javax.swing.JButton VenderBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton salirBtn;
    // End of variables declaration//GEN-END:variables
}
