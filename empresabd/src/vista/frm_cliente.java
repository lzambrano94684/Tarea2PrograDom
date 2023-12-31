/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;
import modelo.Cliente;

/**
 *
 * @author Luis Zambra
 */
public class frm_cliente extends javax.swing.JFrame {
Cliente cliente;

    /**
     * Creates new form frm_cliente
     */
    public frm_cliente() {
        initComponents();
        cliente = new Cliente();
        tbl_datos.setModel(cliente.leer());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_id = new javax.swing.JLabel();
        lbl_nit = new javax.swing.JLabel();
        lbl_nombres = new javax.swing.JLabel();
        lbl_apellidos = new javax.swing.JLabel();
        lbl_direccion = new javax.swing.JLabel();
        lbl_telefono = new javax.swing.JLabel();
        lbl_fecha_nacimiento = new javax.swing.JLabel();
        btn_agregar = new javax.swing.JButton();
        btn_actualizar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_datos = new javax.swing.JTable();
        txt_id = new javax.swing.JTextField();
        txt_nit = new javax.swing.JTextField();
        txt_nombres = new javax.swing.JTextField();
        txt_apellidos = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_fecha_nacimiento = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_id.setText("id");

        lbl_nit.setText("Nit:");

        lbl_nombres.setText("Nombres:");

        lbl_apellidos.setText("Apellidos:");

        lbl_direccion.setText("Direccion");

        lbl_telefono.setText("Telefono:");

        lbl_fecha_nacimiento.setText("Fecha Nacimiento");

        btn_agregar.setText("Agregar");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        btn_actualizar.setText("Actualizar");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });

        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        tbl_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_datos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_datosMouseClicked(evt);
            }
        });
        tbl_datos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbl_datosKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_datos);

        txt_id.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lbl_id, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbl_fecha_nacimiento)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_fecha_nacimiento))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbl_telefono)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txt_telefono))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbl_direccion)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txt_direccion))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbl_apellidos)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txt_apellidos))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbl_nombres)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txt_nombres))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbl_nit)
                                    .addGap(18, 18, 18)
                                    .addComponent(txt_nit, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(34, 34, 34)
                            .addComponent(btn_agregar)
                            .addGap(18, 18, 18)
                            .addComponent(btn_actualizar)
                            .addGap(18, 18, 18)
                            .addComponent(btn_eliminar))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_agregar)
                        .addComponent(btn_actualizar)
                        .addComponent(btn_eliminar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_id)
                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_nit)
                            .addComponent(txt_nit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_nombres)
                            .addComponent(txt_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_apellidos)
                            .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_direccion)
                            .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_telefono)
                            .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_fecha_nacimiento)
                            .addComponent(txt_fecha_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        // TODO add your handling code here:
        cliente = new Cliente(txt_nit.getText(),0,txt_nombres.getText(),txt_apellidos.getText(),txt_direccion.getText(),txt_telefono.getText(),txt_fecha_nacimiento.getText());
        cliente.crear();
        tbl_datos.setModel(cliente.leer());
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void tbl_datosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_datosMouseClicked
        // TODO add your handling code here:
        seleccionar_datos();
        
        
    }//GEN-LAST:event_tbl_datosMouseClicked

    public void seleccionar_datos(){
        int fila = tbl_datos.getSelectedRow();
        txt_id.setText(tbl_datos.getValueAt(fila, 0).toString());
        txt_nit.setText(tbl_datos.getValueAt(fila, 1).toString());
        txt_nombres.setText(tbl_datos.getValueAt(fila, 2).toString());
        txt_apellidos.setText(tbl_datos.getValueAt(fila, 3).toString());
        txt_direccion.setText(tbl_datos.getValueAt(fila, 4).toString());
        txt_telefono.setText(tbl_datos.getValueAt(fila, 5).toString());
        txt_fecha_nacimiento.setText(tbl_datos.getValueAt(fila, 6).toString());
    }
    
    private void tbl_datosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_datosKeyReleased
        // TODO add your handling code here:
        seleccionar_datos();
    }//GEN-LAST:event_tbl_datosKeyReleased

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        // TODO add your handling code here:
        cliente = new Cliente(txt_nit.getText(),Integer.parseInt(txt_id.getText()),txt_nombres.getText(),txt_apellidos.getText(),txt_direccion.getText(),txt_telefono.getText(),txt_fecha_nacimiento.getText());
        cliente.actualizar();
        tbl_datos.setModel(cliente.leer());
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        // TODO add your handling code here:
        cliente = new Cliente();
        cliente.setId(Integer.parseInt(txt_id.getText()));
        cliente.borrar();
        tbl_datos.setModel(cliente.leer());
    }//GEN-LAST:event_btn_eliminarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frm_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_apellidos;
    private javax.swing.JLabel lbl_direccion;
    private javax.swing.JLabel lbl_fecha_nacimiento;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_nit;
    private javax.swing.JLabel lbl_nombres;
    private javax.swing.JLabel lbl_telefono;
    private javax.swing.JTable tbl_datos;
    private javax.swing.JTextField txt_apellidos;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_fecha_nacimiento;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_nit;
    private javax.swing.JTextField txt_nombres;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
