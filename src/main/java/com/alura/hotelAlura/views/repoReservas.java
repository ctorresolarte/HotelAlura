/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.alura.hotelAlura.views;

import com.alura.hotelAlura.DAOhabitacionIMPL;
import com.alura.hotelAlura.interfaces.DAOhabitaciones;
import com.alura.hotelAlura.models.Habitaciones;
import java.awt.BorderLayout;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CRISTIAN
 */
public class repoReservas extends javax.swing.JPanel {

    public repoReservas() {
        initComponents();
        LoadReservas();
    }

    private void LoadReservas() {
        try {
            DAOhabitaciones dao = new DAOhabitacionIMPL();
            DefaultTableModel model = (DefaultTableModel) tableReservas.getModel();
            dao.Listar().forEach((u) -> model.addRow(new Object[]{
                u.getId_habitacion(),
                u.getId_cliente(),
                u.getFecha_ingreso(),
                u.getFecha_salida(),
                u.getTipo_habitacion(),
                u.getCant_habitaciones(),
                u.getForma_pago(),
                u.getValor()}));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg_fondoTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableReservas = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        btn_borrarHabitacion = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        bg_fondoTabla.setBackground(new java.awt.Color(255, 255, 255));

        tableReservas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id_habitacion", "id_cliente", "fecha_ingreso", "fecha_salida", "tipo_habitacion", "cant_habitaciones", "froma_pago", "valor"
            }
        ));
        jScrollPane1.setViewportView(tableReservas);
        if (tableReservas.getColumnModel().getColumnCount() > 0) {
            tableReservas.getColumnModel().getColumn(0).setHeaderValue("id_habitacion");
            tableReservas.getColumnModel().getColumn(1).setHeaderValue("id_cliente");
            tableReservas.getColumnModel().getColumn(2).setHeaderValue("fecha_ingreso");
            tableReservas.getColumnModel().getColumn(3).setHeaderValue("fecha_salida");
            tableReservas.getColumnModel().getColumn(4).setHeaderValue("tipo_habitacion");
            tableReservas.getColumnModel().getColumn(5).setHeaderValue("cant_habitaciones");
            tableReservas.getColumnModel().getColumn(6).setHeaderValue("froma_pago");
            tableReservas.getColumnModel().getColumn(7).setHeaderValue("valor");
        }

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton2.setText("Buscar");

        btn_borrarHabitacion.setText("Borrar");
        btn_borrarHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarHabitacionActionPerformed(evt);
            }
        });

        jButton4.setText("Editar");

        javax.swing.GroupLayout bg_fondoTablaLayout = new javax.swing.GroupLayout(bg_fondoTabla);
        bg_fondoTabla.setLayout(bg_fondoTablaLayout);
        bg_fondoTablaLayout.setHorizontalGroup(
            bg_fondoTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_fondoTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(bg_fondoTablaLayout.createSequentialGroup()
                .addGap(516, 516, 516)
                .addComponent(btn_borrarHabitacion, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                .addGap(26, 26, 26)
                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg_fondoTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        bg_fondoTablaLayout.setVerticalGroup(
            bg_fondoTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_fondoTablaLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(bg_fondoTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bg_fondoTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_borrarHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 85, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg_fondoTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg_fondoTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btn_borrarHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarHabitacionActionPerformed
        DAOhabitaciones dao = new DAOhabitacionIMPL();
        DefaultTableModel model = (DefaultTableModel) tableReservas.getModel();
        for (int i : tableReservas.getSelectedRows()) {
            try {
                dao.Eliminar((int) (tableReservas.getValueAt(i, 0)));
                model.removeRow(i);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_btn_borrarHabitacionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg_fondoTabla;
    private javax.swing.JButton btn_borrarHabitacion;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tableReservas;
    // End of variables declaration//GEN-END:variables
}
