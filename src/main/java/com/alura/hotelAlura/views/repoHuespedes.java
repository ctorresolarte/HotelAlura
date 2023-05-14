package com.alura.hotelAlura.views;

import com.alura.hotelAlura.DAOhuespedIMPL;
import com.alura.hotelAlura.interfaces.DAOhuespedes;
import com.alura.hotelAlura.models.Huespedes;
import java.awt.BorderLayout;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class repoHuespedes extends javax.swing.JPanel {

    public repoHuespedes() {
        initComponents();
        LoadUsers();
        InitStyles();

    }

    private void ShowJPanel(JPanel p) {
        p.setSize(748, 430);
        p.setLocation(0, 0);

        bg_tablaHuespedes.removeAll();
        bg_tablaHuespedes.add(p, BorderLayout.CENTER);
        bg_tablaHuespedes.revalidate();
        bg_tablaHuespedes.repaint();
    }

    private void InitStyles() {
        txt_searchBar.putClientProperty("JTextField.placeholderText", "Ingrese el nombre del cliente a buscar.");
    }

    private void LoadUsers() {
        try {
            DAOhuespedes dao = new DAOhuespedIMPL();
            DefaultTableModel model = (DefaultTableModel) tableHuespedes.getModel();
            dao.Listar().forEach((u) -> model.addRow(new Object[]{
                u.getId_cliente(),
                u.getNombre(),
                u.getApellido(),
                u.getTipo_documento(),
                u.getNumero_documento(),
                u.getNumtelefono(),
                u.getNacionalidad()}));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg_tablaHuespedes = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableHuespedes = new javax.swing.JTable();
        txt_searchBar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btn_borrarHuesped = new javax.swing.JButton();
        btn_editarHuesped = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 51));

        bg_tablaHuespedes.setBackground(new java.awt.Color(255, 255, 255));

        tableHuespedes.setBackground(new java.awt.Color(255, 255, 255));
        tableHuespedes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Nombre", "Apellido", "Tipo documento", "Num documento", "Telefono", "Nacionalidad"
            }
        ));
        jScrollPane1.setViewportView(tableHuespedes);

        jButton1.setText("Buscar");

        btn_borrarHuesped.setText("Borrar");
        btn_borrarHuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarHuespedActionPerformed(evt);
            }
        });

        btn_editarHuesped.setText("Editar");
        btn_editarHuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarHuespedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bg_tablaHuespedesLayout = new javax.swing.GroupLayout(bg_tablaHuespedes);
        bg_tablaHuespedes.setLayout(bg_tablaHuespedesLayout);
        bg_tablaHuespedesLayout.setHorizontalGroup(
            bg_tablaHuespedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_tablaHuespedesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addGap(6, 6, 6))
            .addGroup(bg_tablaHuespedesLayout.createSequentialGroup()
                .addGap(510, 510, 510)
                .addComponent(btn_borrarHuesped, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(23, 23, 23)
                .addComponent(btn_editarHuesped, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(7, 7, 7))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg_tablaHuespedesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        bg_tablaHuespedesLayout.setVerticalGroup(
            bg_tablaHuespedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_tablaHuespedesLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(bg_tablaHuespedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_searchBar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                .addGap(6, 6, 6)
                .addGroup(bg_tablaHuespedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_borrarHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_editarHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg_tablaHuespedes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg_tablaHuespedes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_borrarHuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarHuespedActionPerformed
        DAOhuespedes dao = new DAOhuespedIMPL();
        DefaultTableModel model = (DefaultTableModel) tableHuespedes.getModel();
        if (tableHuespedes.getSelectedRows().length < 1) {
            JOptionPane.showMessageDialog(this, "Debe selecccionar el usuario a editar. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
        } else {
            for (int i : tableHuespedes.getSelectedRows()) {
                try {
                    dao.Eliminar((int) (tableHuespedes.getValueAt(i, 0)));
                    model.removeRow(i);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }

        //LoadUsers();
    }//GEN-LAST:event_btn_borrarHuespedActionPerformed

    private void btn_editarHuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarHuespedActionPerformed
        if (tableHuespedes.getSelectedRow() > -1) {
            try {
                int userID = (int) tableHuespedes.getValueAt(tableHuespedes.getSelectedRow(), 0);
                DAOhuespedes dao = new DAOhuespedIMPL();
                ShowJPanel(new reg_cliente(dao.getHuespedesById(userID)));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe selecccionar el usuario a editar. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_editarHuespedActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg_tablaHuespedes;
    private javax.swing.JButton btn_borrarHuesped;
    private javax.swing.JButton btn_editarHuesped;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableHuespedes;
    private javax.swing.JTextField txt_searchBar;
    // End of variables declaration//GEN-END:variables
}
