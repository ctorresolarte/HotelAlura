/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.alura.hotelAlura;

import com.alura.hotelAlura.conexionDB.ConnectionDB;
import com.alura.hotelAlura.views.menu;
import com.alura.hotelAlura.views.reg_habitacion;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme;
import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;

/**
 *
 * @author CRISTIAN
 */
public class Dashboard extends javax.swing.JFrame {

    ConnectionDB con;

    public Dashboard() throws ClassNotFoundException {
        initComponents();
        initStyles();
        

        con = new ConnectionDB("hotelalura");
        con.Conectar();
    }

    public void initStyles() {
        txt_titulo.putClientProperty("FlatLaf.style", "font: 30 semibold.font");
        txt_titulo.setForeground(Color.WHITE);

        title_username.putClientProperty("FlatLaf.styleClass", "h2");
        title_username.setForeground(new Color(0, 198, 230));

        title_password.putClientProperty("FlatLaf.styleClass", "h2");
        title_password.setForeground(new Color(0, 198, 230));

        label_title.putClientProperty("FlatLaf.style", "font: 25 semibold.font");
        label_title.setForeground(new Color(0, 198, 230));

        btn_inicioSesion.putClientProperty("FlatLaf.style", "font: $h4.font");
        btn_inicioSesion.setForeground(new Color(0, 198, 230));

        btn_salir.putClientProperty("FlatLaf.style", "font: $h4.font");
        btn_salir.setForeground(new Color(0, 198, 230));
        
        txt_usuario.putClientProperty("JTextField.placeholderText", "Ingrese el nombre de usuario.");
        txt_password.putClientProperty("JTextField.placeholderText", "Ingrese la contraseña.");
    }

    private void ShowJPanel(JPanel p) {
        p.setSize(1020, 656);
        p.setLocation(0, 0);

        background.removeAll();
        background.add(p, BorderLayout.CENTER);
        background.revalidate();
        background.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        label_imgPrincipal = new javax.swing.JLabel();
        label_title = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        title_username = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        title_password = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();
        btn_inicioSesion = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_titulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(255, 255, 255));

        label_imgPrincipal.setIcon(new javax.swing.ImageIcon("C:\\Users\\CRISTIAN\\Documents\\NetBeansProjects\\hotelAlura\\src\\main\\Resources\\img_login.png")); // NOI18N

        label_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_title.setText("INICIO DE SESION");

        jSeparator1.setBackground(new java.awt.Color(0, 198, 230));
        jSeparator1.setForeground(new java.awt.Color(0, 198, 230));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        title_username.setText("NOMBRE USUSARIO:");

        txt_usuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        title_password.setText("CONTRASEÑA");

        txt_password.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btn_inicioSesion.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        btn_inicioSesion.setText("INICIAR SESION");
        btn_inicioSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inicioSesionActionPerformed(evt);
            }
        });

        btn_salir.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        btn_salir.setText("SALIR");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\CRISTIAN\\Documents\\NetBeansProjects\\hotelAlura\\src\\main\\Resources\\logo-alura.png")); // NOI18N

        txt_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_titulo.setText("Hotel alura");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 841, Short.MAX_VALUE)
                .addGap(43, 43, 43))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(txt_titulo)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(label_imgPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(btn_inicioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(txt_password))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, backgroundLayout.createSequentialGroup()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(title_password, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
                                    .addComponent(title_username, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_usuario))))
                        .addGap(63, 63, 63))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(label_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_imgPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(label_title)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addComponent(jSeparator1)
                                .addGap(46, 46, 46))
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(title_username)
                                    .addGroup(backgroundLayout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(49, 49, 49)
                                .addComponent(title_password)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(backgroundLayout.createSequentialGroup()
                                        .addGap(105, 105, 105)
                                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(btn_inicioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 74, Short.MAX_VALUE)))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_inicioSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inicioSesionActionPerformed
        try {
            String user = txt_usuario.getText();
            String password = String.valueOf(txt_password.getPassword());
            String Query = "SELECT * FROM usuarios WHERE usuario = '" + user + "' and contraseña ='" + password + "'";
            Statement stmt = con.Conectar().createStatement();
            ResultSet rs = stmt.executeQuery(Query);
            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "El usuario esta en la base de datos");
               // ShowJPanel(new menu());
                ShowJPanel(new menu());

            } else {
                JOptionPane.showMessageDialog(this, "El usuario no existe en la base de datos");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_inicioSesionActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_salirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*Componentes de stilo de flat laf*/

        //inicializacion de flatlaf
        FlatMaterialLighterIJTheme.setup();
        //componente de redondeo en los botones
        UIManager.put("Button.arc", 999);

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Dashboard().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btn_inicioSesion;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel label_imgPrincipal;
    private javax.swing.JLabel label_title;
    private javax.swing.JLabel title_password;
    private javax.swing.JLabel title_username;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JLabel txt_titulo;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
