package com.alura.hotelAlura.views;

import com.alura.hotelAlura.DAOhuespedIMPL;
import com.alura.hotelAlura.interfaces.DAOhuespedes;
import com.alura.hotelAlura.models.Huespedes;
import java.awt.Color;
import javax.swing.JOptionPane;


public class reg_cliente extends javax.swing.JPanel {
    boolean isEdition = false;
    
    public reg_cliente() {
        initComponents();
        initStyles(null);
    }

    public reg_cliente(Huespedes huesped) {
        initComponents();
        isEdition = true;
        initStyles(huesped);
    }

    public void initStyles( Huespedes huesped) {
        txt_titulo.putClientProperty("FlatLaf.style", "font: 32 $bold.font");
        txt_titulo.setForeground(new Color(13, 71, 161));
        txt_nombre.putClientProperty("JTextField.placeholderText", "Ingrese el nombre.");
        txt_apellido.putClientProperty("JTextField.placeholderText", "Ingrese el apellido.");
        txt_numTelefono1.putClientProperty("JTextField.placeholderText", "Ingrese el numero de telefono.");
        txt_numDocumento.putClientProperty("JTextField.placeholderText", "Ingrese el numero de documento.");

        if (isEdition) {
            txt_titulo.setText("Editar huesped");
            btn_registrarCliente.setText("Guardar");

            if (huesped != null) {
                txt_nombre.setText(huesped.getNombre());
                txt_apellido.setText(huesped.getApellido());
                txt_numTelefono1.setText(huesped.getNumtelefono());
                txt_numDocumento.setText(huesped.getNumero_documento());
            }
        }
        //else{
        // txt_titulo.setText("Registro huesped");
        // }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_tituloHuespedes = new javax.swing.JPanel();
        txt_titulo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_apellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btn_registrarCliente = new javax.swing.JButton();
        txt_numDocumento = new javax.swing.JTextField();
        txt_numTelefono1 = new javax.swing.JTextField();
        Cbox_Nacionalidad = new javax.swing.JComboBox<>();
        Cbox_tipoDocumento = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(0, 153, 0));

        txt_tituloHuespedes.setBackground(new java.awt.Color(255, 255, 255));

        txt_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_titulo.setText("Registro huespedes");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(13, 71, 161));
        jLabel3.setText("Nombre:");

        txt_nombre.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(13, 71, 161));
        jLabel4.setText("Apellido");

        txt_apellido.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txt_apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apellidoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(13, 71, 161));
        jLabel5.setText("Tipo documento");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(13, 71, 161));
        jLabel6.setText("Numero documento:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(13, 71, 161));
        jLabel7.setText("Numero tel.");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(13, 71, 161));
        jLabel8.setText("Nacionalidad");

        btn_registrarCliente.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        btn_registrarCliente.setForeground(new java.awt.Color(13, 71, 161));
        btn_registrarCliente.setIcon(new javax.swing.ImageIcon("C:\\Users\\CRISTIAN\\Documents\\NetBeansProjects\\hotelAlura\\src\\main\\Resources\\icon_guardar.png")); // NOI18N
        btn_registrarCliente.setText("  Registrar");
        btn_registrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarClienteActionPerformed(evt);
            }
        });

        txt_numDocumento.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txt_numDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_numDocumentoActionPerformed(evt);
            }
        });

        txt_numTelefono1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txt_numTelefono1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_numTelefono1ActionPerformed(evt);
            }
        });

        Cbox_Nacionalidad.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Cbox_Nacionalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione nacionalidad", "Irlandesa", "Tailandesa", "Islandesa", "Peruana", "Sudafricana", "Eslovena", "Belga", "Rusa", "Portuguesa", "India", "Coreana", "Suiza", "Italiana", "Colombiana", "Neozelandesa", "Japonesa", "Ecuatoriana", "Brasileña", "Galesa", "Checa", "Chilena", "Turca", "Canadiense", "Mexicana", "Malasia" }));

        Cbox_tipoDocumento.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Cbox_tipoDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DNI", "CC", "RG", "TI", "SSN", "NIE", "Pasaporte" }));

        javax.swing.GroupLayout txt_tituloHuespedesLayout = new javax.swing.GroupLayout(txt_tituloHuespedes);
        txt_tituloHuespedes.setLayout(txt_tituloHuespedesLayout);
        txt_tituloHuespedesLayout.setHorizontalGroup(
            txt_tituloHuespedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txt_tituloHuespedesLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(txt_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(txt_tituloHuespedesLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addGap(279, 279, 279)
                .addComponent(jLabel7))
            .addGroup(txt_tituloHuespedesLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(txt_numTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(txt_tituloHuespedesLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addGap(282, 282, 282)
                .addComponent(jLabel6))
            .addGroup(txt_tituloHuespedesLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(txt_numDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(txt_tituloHuespedesLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel5)
                .addGap(218, 218, 218)
                .addComponent(jLabel8))
            .addGroup(txt_tituloHuespedesLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(Cbox_tipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(218, 218, 218)
                .addComponent(Cbox_Nacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(txt_tituloHuespedesLayout.createSequentialGroup()
                .addGap(380, 380, 380)
                .addComponent(btn_registrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        txt_tituloHuespedesLayout.setVerticalGroup(
            txt_tituloHuespedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txt_tituloHuespedesLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(txt_titulo)
                .addGap(11, 11, 11)
                .addGroup(txt_tituloHuespedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7))
                .addGap(6, 6, 6)
                .addGroup(txt_tituloHuespedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_numTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(txt_tituloHuespedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addGap(6, 6, 6)
                .addGroup(txt_tituloHuespedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_numDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(txt_tituloHuespedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8))
                .addGap(6, 6, 6)
                .addGroup(txt_tituloHuespedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cbox_tipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cbox_Nacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_registrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_tituloHuespedes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_tituloHuespedes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_registrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarClienteActionPerformed
        String nombre = txt_nombre.getText();//
        String apellido = txt_apellido.getText();//
        String tipoDocumento = Cbox_tipoDocumento.getSelectedItem().toString();//
        String numDocumento = txt_numDocumento.getText();//
        String numTelefono = txt_numTelefono1.getText();//
        String nacionalidad = Cbox_Nacionalidad.getSelectedItem().toString();

        //validaciones para los campos
        if (nombre.isEmpty() || apellido.isEmpty() || tipoDocumento.isEmpty() || numDocumento.isEmpty() || numTelefono.isEmpty() || nacionalidad.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            txt_nombre.requestFocus();
            return;
        }
        Huespedes huesped = new Huespedes();
        huesped.setNombre(nombre);
        huesped.setApellido(apellido);
        huesped.setTipo_documento(tipoDocumento);
        huesped.setNumero_documento(numDocumento);
        huesped.setNumtelefono(numTelefono);
        huesped.setNacionalidad(nacionalidad);

        try {
            DAOhuespedes dao = new DAOhuespedIMPL();
            dao.Registrar(huesped);

            JOptionPane.showMessageDialog(this, "registro exitoso.\n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);

            //vaciar los campos al terminar el registro
            txt_nombre.setText("");
            txt_apellido.setText("");
            Cbox_tipoDocumento.setSelectedIndex(0);
            txt_numDocumento.setText("");
            txt_numTelefono1.setText("");
            Cbox_Nacionalidad.setSelectedIndex(0);;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al guardar el registro.\n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            System.out.println("Error al registrar " + e.getMessage());
        }

    }//GEN-LAST:event_btn_registrarClienteActionPerformed

    private void txt_apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apellidoActionPerformed

    private void txt_numDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_numDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_numDocumentoActionPerformed

    private void txt_numTelefono1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_numTelefono1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_numTelefono1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Cbox_Nacionalidad;
    private javax.swing.JComboBox<String> Cbox_tipoDocumento;
    private javax.swing.JButton btn_registrarCliente;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_numDocumento;
    private javax.swing.JTextField txt_numTelefono1;
    private javax.swing.JLabel txt_titulo;
    private javax.swing.JPanel txt_tituloHuespedes;
    // End of variables declaration//GEN-END:variables
}
