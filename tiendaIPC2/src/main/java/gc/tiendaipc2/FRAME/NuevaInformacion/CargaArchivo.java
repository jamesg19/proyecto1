package gc.tiendaipc2.FRAME.NuevaInformacion;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
/**
 *
 * @author james
 */
public class CargaArchivo extends javax.swing.JFrame {
    ArrayList<String> datoIncorrecto = new ArrayList<>();
    ArrayList<String> ArraycodT = new ArrayList<>();
    ArrayList<String> ArraycodE = new ArrayList<>();
    ArrayList<String> ArraycodC = new ArrayList<>();
    int cont=-1;

    public CargaArchivo() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentPane = new javax.swing.JPanel();
        BotonSeleccionar = new javax.swing.JButton();
        jScrollPane = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        Aceptar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        CargaLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contentPane.setBackground(new java.awt.Color(179, 221, 185));

        BotonSeleccionar.setText("Seleccionar");
        BotonSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSeleccionarActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane.setViewportView(jTextArea1);

        jTextField.setBackground(new java.awt.Color(177, 177, 177));
        jTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldActionPerformed(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane1.setViewportView(jTextArea2);

        Aceptar.setText("Agregar");
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(213, 45, 55));

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane2.setViewportView(jTextArea3);

        javax.swing.GroupLayout contentPaneLayout = new javax.swing.GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(BotonSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(contentPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(contentPaneLayout.createSequentialGroup()
                        .addComponent(CargaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPaneLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonSeleccionar)
                    .addComponent(jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(CargaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(Aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contentPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSeleccionarActionPerformed
   // TODO add your handling code here:
       
                //Creamos el objeto JFileChooser
                JFileChooser fc=new JFileChooser();
                //Creamos el filtro
                FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.TXT", "txt");
                //Le indicamos el filtro
                fc.setFileFilter(filtro);
                //Abrimos la ventana, guardamos la opcion seleccionada por el empleado
                int seleccion=fc.showOpenDialog(contentPane);
                //Si el usuario, pincha en aceptar
                if(seleccion==JFileChooser.APPROVE_OPTION){
                    //Seleccionamos el fichero
                    File fichero=fc.getSelectedFile();
                    //Ecribe la ruta del fichero seleccionado en el campo de texto
                    jTextField.setText(fichero.getAbsolutePath());
                    
                    try(FileReader fr=new FileReader(fichero)){                    
                        String cadena="";
                        int valor=fr.read();
                        while(valor!=-1){
                            cadena=cadena+(char)valor;
                            valor=fr.read();
                        }
                        jTextArea1.setText(cadena);
 
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    } 
                }
    }//GEN-LAST:event_BotonSeleccionarActionPerformed
    private void jTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldActionPerformed
    }//GEN-LAST:event_jTextFieldActionPerformed
    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
        // TODO add your handling code here:
                String texto = jTextArea1.getText();
                String[] linea = texto.split("\n");
                DeterminaTipoLinea(linea);     
    }//GEN-LAST:event_AceptarActionPerformed
  
    //METODO QUE DETERMINA QUE TIPO DE INFORMACION LEE
    public void DeterminaTipoLinea(String [] linea){ 
        
        for(int i=0;i<linea.length;i++){
            
                String texto=linea[i];
                if(texto.contains(",,")||texto.contains(", ,")){
                    cont++;
                    jLabel1.setText("Los siguientes datos no fueron cargados correctamente. ");
                    datoIncorrecto.add(cont,texto);
                    jTextArea2.append(texto+"\n");
                }else {   
                        //las palabras separadas por coma las guarda en arreglo de palabras  
                        String[] TipoLinea = texto.split(",");
                        if(TipoLinea[0].equalsIgnoreCase("TIENDA")){
                            verificaErrorT(texto);  
                        }
            }
        }     
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JButton BotonSeleccionar;
    private javax.swing.JLabel CargaLabel;
    private javax.swing.JPanel contentPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField;
    // End of variables declaration//GEN-END:variables

    private void verificaErrorT(String texto) {
        String[] TipoLinea = texto.split(",");
        
            if(TipoLinea.length==5){
                if(ArraycodT.contains(TipoLinea[3])){
                    ArraycodT.add(TipoLinea[3]);
                    String nombre=TipoLinea[1];
                    String direccion=TipoLinea[2];
                    String codT=TipoLinea[3];
                    String tel1=TipoLinea[4];

                    jTextArea3.append(nombre+" "+direccion+" "+codT+" "+tel1+"\n");
                    jLabel1.setText("Datos cargados correctamente");
                    }else{
                        AgregarLineaIncorrecta(texto);
                    }
            }else{
                    AgregarLineaIncorrecta(texto);
                }   
    }
    public void AgregarLineaIncorrecta(String texto){
        cont++;
        datoIncorrecto.add(cont,texto);
        jTextArea2.append(texto+"\n");
    }
}
