/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication99;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.ComboBox;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

/**
 *
 * @author Daniel Agurcia
 */
public class lab6_Principal extends javax.swing.JFrame {

    /**
     * Creates new form lab6_Principal
     */
    public lab6_Principal() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tf_nombre = new javax.swing.JTextField();
        tf_edad = new javax.swing.JTextField();
        tf_id = new javax.swing.JTextField();
        sp_celda = new javax.swing.JSpinner();
        sp_anios = new javax.swing.JSpinner();
        jb_agregar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tf_nombreM = new javax.swing.JTextField();
        tf_edadM = new javax.swing.JTextField();
        tf_idM = new javax.swing.JTextField();
        sp_celdaM = new javax.swing.JSpinner();
        sp_aniosM = new javax.swing.JSpinner();
        jb_modificar = new javax.swing.JButton();
        cb_lista_modificar = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jl_eliminar_criminales = new javax.swing.JList<>();
        jb_eliminar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jl_expedientes = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        ta_exp = new javax.swing.JTextArea();
        jb_ver_expe = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre");

        jLabel2.setText("Edad");

        jLabel3.setText("Identidad");

        jLabel4.setText("Celda");

        jLabel5.setText("Anios a Cumplir");

        jb_agregar.setText("Agregar Criminal");
        jb_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_agregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_nombre)
                            .addComponent(tf_edad)
                            .addComponent(tf_id)
                            .addComponent(sp_celda, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(sp_anios)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(jb_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(231, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(sp_celda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(sp_anios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jb_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Agregar Criminal", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setText("Nombre");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 57, -1, -1));

        jLabel7.setText("Edad");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 100, -1, -1));

        jLabel8.setText("Identidad");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 143, -1, -1));

        jLabel9.setText("Celda");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 190, -1, -1));

        jLabel10.setText("Anios a Cumplir");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 246, -1, -1));
        jPanel2.add(tf_nombreM, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 60, 139, -1));
        jPanel2.add(tf_edadM, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 100, 139, -1));
        jPanel2.add(tf_idM, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 144, 139, -1));
        jPanel2.add(sp_celdaM, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 194, 139, -1));
        jPanel2.add(sp_aniosM, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 240, 108, -1));

        jb_modificar.setText("Modificar");
        jb_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_modificarActionPerformed(evt);
            }
        });
        jPanel2.add(jb_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 110, 50));

        cb_lista_modificar.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_lista_modificarItemStateChanged(evt);
            }
        });
        jPanel2.add(cb_lista_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 6, 105, 30));

        jLabel11.setText("Agregar un Delito");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Asesinato", "Violacion", "Robo", "Trafico", "Secuestro" }));
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 140, -1));

        jTabbedPane1.addTab("Modificar Criminal", jPanel2);

        jl_eliminar_criminales.setModel(new DefaultListModel());
        jScrollPane1.setViewportView(jl_eliminar_criminales);

        jb_eliminar.setText("Eliminar");
        jb_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_eliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jb_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jb_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Eliminar Criminal", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_expedientes.setModel(new DefaultListModel());
        jScrollPane2.setViewportView(jl_expedientes);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 6, 133, 321));

        ta_exp.setColumns(20);
        ta_exp.setRows(5);
        jScrollPane3.setViewportView(ta_exp);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 6, 350, 321));

        jb_ver_expe.setText("Crear Expediente");
        jb_ver_expe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_ver_expeActionPerformed(evt);
            }
        });
        jPanel4.add(jb_ver_expe, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 150, 55));

        jTabbedPane1.addTab("Expedientes", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_agregarActionPerformed
        try {
            Criminal nuevoCriminal = new Criminal(tf_nombre.getText(), Integer.parseInt(tf_edad.getText()), Integer.parseInt(tf_id.getText()), (Integer) sp_celda.getValue(), (Integer) sp_anios.getValue());
            admin_criminal ap = new admin_criminal("./Criminales.txt");
            ap.cargarArchivo();
            ap.getLista_criminales().add(nuevoCriminal);
            DefaultComboBoxModel modelocombo = (DefaultComboBoxModel) cb_lista_modificar.getModel();
            modelocombo.addElement(nuevoCriminal);
            cb_lista_modificar.setModel(modelocombo);
            DefaultListModel modelolista = (DefaultListModel) jl_eliminar_criminales.getModel();
            modelolista.addElement(nuevoCriminal);
            jl_eliminar_criminales.setModel(modelolista);
            DefaultListModel modelolista2 = (DefaultListModel) jl_expedientes.getModel();
            modelolista2.addElement(nuevoCriminal);
            jl_expedientes.setModel(modelolista2);
            ap.escribirArchivo();
            tf_nombre.setText("");
            tf_id.setText("");
            tf_edad.setText("");
            sp_celda.setValue(0);
            sp_anios.setValue(0);

        } catch (IOException ex) {
        }
    }//GEN-LAST:event_jb_agregarActionPerformed

    private void jb_ver_expeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_ver_expeActionPerformed
        if (jl_expedientes.getSelectedIndex() >= 0) {
            try {
                ta_exp.setText("");
                DefaultListModel modeloLista = (DefaultListModel) jl_expedientes.getModel();
                Criminal seleccionado = (Criminal) modeloLista.get(jl_expedientes.getSelectedIndex());
                jl_expedientes.setModel(modeloLista);
                ta_exp.setText(seleccionado.Expediente());
                seleccionado.setExp(ta_exp.getText());
                admin_criminal ap = new admin_criminal("./Expedientes.txt");
                ap.getLista_criminales().add(seleccionado);
                ap.escribirArchivoExp();
            } catch (IOException ex) {
                Logger.getLogger(lab6_Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jb_ver_expeActionPerformed

    private void jb_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_eliminarActionPerformed
        if (jl_eliminar_criminales.getSelectedIndex() >= 0) {
            try {
                admin_criminal ap = new admin_criminal("./Criminales.txt");
                DefaultListModel modeloLista = (DefaultListModel) jl_eliminar_criminales.getModel();
                Criminal seleccionado = (Criminal) modeloLista.get(jl_expedientes.getSelectedIndex() + 1);
                jl_eliminar_criminales.setModel(modeloLista);
                DefaultComboBoxModel modelocombo = (DefaultComboBoxModel) cb_lista_modificar.getModel();
                modelocombo.removeElement(seleccionado);
                cb_lista_modificar.setModel(modelocombo);
                DefaultListModel modelolista = (DefaultListModel) jl_eliminar_criminales.getModel();
                modelolista.removeElement(seleccionado);
                jl_eliminar_criminales.setModel(modelolista);
                DefaultListModel modelolista2 = (DefaultListModel) jl_expedientes.getModel();
                modelolista2.removeElement(seleccionado);
                jl_expedientes.setModel(modelolista2);
                ap.getLista_criminales().remove(seleccionado);
                ap.escribirArchivo();
            } catch (IOException ex) {
                Logger.getLogger(lab6_Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jb_eliminarActionPerformed

    private void cb_lista_modificarItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_lista_modificarItemStateChanged
        if (evt.getStateChange() == 2) {
            DefaultComboBoxModel modelocombo = (DefaultComboBoxModel) cb_lista_modificar.getModel();
            Criminal cm = (Criminal) modelocombo.getSelectedItem();
            cb_lista_modificar.setModel(modelocombo);
            tf_nombreM.setText(cm.getNombre());
            tf_edadM.setText(String.valueOf(cm.getEdad()));
            tf_idM.setText(String.valueOf(cm.getNumero_identidad()));
            sp_celdaM.setValue(cm.getNumero_celda());
            sp_aniosM.setValue(cm.getAnos_cumplir());
        }
    }//GEN-LAST:event_cb_lista_modificarItemStateChanged

    private void jb_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_modificarActionPerformed
        DefaultComboBoxModel modelocombo = (DefaultComboBoxModel) cb_lista_modificar.getModel();
        Criminal criM = (Criminal) modelocombo.getSelectedItem();
        cb_lista_modificar.setModel(modelocombo);
        criM.setNombre(tf_nombreM.getText());
        criM.setEdad(Integer.parseInt(tf_edadM.getText()));
        criM.setNumero_celda((Integer) sp_celdaM.getValue());
        criM.setNumero_identidad(Integer.parseInt(tf_idM.getText()));
        criM.setAnos_cumplir((Integer) sp_aniosM.getValue());
        tf_nombreM.setText("");
        tf_idM.setText("");
        tf_edadM.setText("");
        sp_celdaM.setValue(0);
        sp_aniosM.setValue(0);
    }//GEN-LAST:event_jb_modificarActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(lab6_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lab6_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lab6_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lab6_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lab6_Principal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_lista_modificar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jb_agregar;
    private javax.swing.JButton jb_eliminar;
    private javax.swing.JButton jb_modificar;
    private javax.swing.JButton jb_ver_expe;
    private javax.swing.JList<String> jl_eliminar_criminales;
    private javax.swing.JList<String> jl_expedientes;
    private javax.swing.JSpinner sp_anios;
    private javax.swing.JSpinner sp_aniosM;
    private javax.swing.JSpinner sp_celda;
    private javax.swing.JSpinner sp_celdaM;
    private javax.swing.JTextArea ta_exp;
    private javax.swing.JTextField tf_edad;
    private javax.swing.JTextField tf_edadM;
    private javax.swing.JTextField tf_id;
    private javax.swing.JTextField tf_idM;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_nombreM;
    // End of variables declaration//GEN-END:variables
}
