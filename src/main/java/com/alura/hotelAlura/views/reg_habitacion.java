package com.alura.hotelAlura.views;

import com.alura.hotelAlura.DAOhabitacionIMPL;
import com.alura.hotelAlura.Dashboard;
import com.alura.hotelAlura.interfaces.DAOhabitaciones;
import com.alura.hotelAlura.models.Habitaciones;
import java.awt.Color;
import java.util.Date;
import javax.swing.JOptionPane;

public class reg_habitacion extends javax.swing.JPanel {

    /*Arreglo que contiene los productos del combobox */
    String habitaciones[] = {"sencilla", "doble", "acomodacion multiple", "suite"};
    double precios[] = {50000, 100000, 150000, 300000};

    double precio = 0;
    int cantidad = 0;

    public reg_habitacion() {
        initComponents();
        InitStyles();
    }

    public void InitStyles() {
        /*titulo registro habitaciones*/
        txt_titulo.putClientProperty("FlatLaf.style", "font: 32 $bold.font");
        txt_titulo.setForeground(new Color(13, 71, 161));

        txt_titulo.putClientProperty("FlatLaf.style", "font: 32 $bold.font");
        txt_titulo.setForeground(new Color(13, 71, 161));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg_habitaciones = new javax.swing.JPanel();
        txt_titulo = new javax.swing.JLabel();
        txt_FechaIngreso = new javax.swing.JLabel();
        date_ingreso = new com.toedter.calendar.JDateChooser();
        txt_fechaSalida = new javax.swing.JLabel();
        date_salida = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        Cbox_tipoHabitacion = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        spn_cantidadHabitaciones = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        Cbox_formaPago = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        lbl_valorPagar = new javax.swing.JLabel();
        btn_reservarHabitacion = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 255, 204));
        setPreferredSize(new java.awt.Dimension(748, 430));

        bg_habitaciones.setBackground(new java.awt.Color(255, 255, 255));
        bg_habitaciones.setForeground(new java.awt.Color(13, 71, 161));

        txt_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_titulo.setText("Registro habitaciones");

        txt_FechaIngreso.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        txt_FechaIngreso.setForeground(new java.awt.Color(13, 71, 161));
        txt_FechaIngreso.setText("Fecha ingreso:");

        date_ingreso.setDateFormatString("y-MM-d");

        txt_fechaSalida.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        txt_fechaSalida.setForeground(new java.awt.Color(13, 71, 161));
        txt_fechaSalida.setText("Fecha salida:");

        date_salida.setDateFormatString("y-MM-d");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(13, 71, 161));
        jLabel7.setText("Tipo habitacion:");

        Cbox_tipoHabitacion.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        Cbox_tipoHabitacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "sencilla", "doble", "acomodacion multiple", "suite" }));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(13, 71, 161));
        jLabel3.setText("cant habitacion:");

        spn_cantidadHabitaciones.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        spn_cantidadHabitaciones.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        spn_cantidadHabitaciones.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spn_cantidadHabitacionesStateChanged(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(13, 71, 161));
        jLabel4.setText("Forma de pago");

        Cbox_formaPago.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        Cbox_formaPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Efectivo", "Pago electronico", "Tarjeta credito", "Tarjeta debito" }));
        Cbox_formaPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cbox_formaPagoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(13, 71, 161));
        jLabel5.setText("Total a pagar");

        lbl_valorPagar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_valorPagar.setForeground(new java.awt.Color(0, 0, 0));
        lbl_valorPagar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_valorPagar.setText("$ 0");

        btn_reservarHabitacion.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        btn_reservarHabitacion.setForeground(new java.awt.Color(13, 71, 161));
        btn_reservarHabitacion.setIcon(new javax.swing.ImageIcon("C:\\Users\\CRISTIAN\\Documents\\NetBeansProjects\\hotelAlura\\src\\main\\Resources\\icon_guardar.png")); // NOI18N
        btn_reservarHabitacion.setText(" Reservar");
        btn_reservarHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reservarHabitacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bg_habitacionesLayout = new javax.swing.GroupLayout(bg_habitaciones);
        bg_habitaciones.setLayout(bg_habitacionesLayout);
        bg_habitacionesLayout.setHorizontalGroup(
            bg_habitacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_habitacionesLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(txt_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 742, Short.MAX_VALUE))
            .addGroup(bg_habitacionesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(txt_FechaIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                .addGap(21, 21, 21)
                .addComponent(date_ingreso, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5)
                .addComponent(Cbox_formaPago, 0, 190, Short.MAX_VALUE)
                .addGap(51, 51, 51))
            .addGroup(bg_habitacionesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(txt_fechaSalida, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                .addGap(31, 31, 31)
                .addComponent(date_salida, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                .addGap(1, 1, 1)
                .addComponent(lbl_valorPagar, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                .addGap(124, 124, 124))
            .addGroup(bg_habitacionesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cbox_tipoHabitacion, 0, 190, Short.MAX_VALUE)
                .addGap(120, 120, 120)
                .addComponent(btn_reservarHabitacion, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addGap(142, 142, 142))
            .addGroup(bg_habitacionesLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spn_cantidadHabitaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addGap(508, 508, 508))
        );
        bg_habitacionesLayout.setVerticalGroup(
            bg_habitacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_habitacionesLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(txt_titulo)
                .addGap(31, 31, 31)
                .addGroup(bg_habitacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bg_habitacionesLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txt_FechaIngreso))
                    .addComponent(date_ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bg_habitacionesLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(bg_habitacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(Cbox_formaPago, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(35, 35, 35)
                .addGroup(bg_habitacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bg_habitacionesLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txt_fechaSalida))
                    .addComponent(date_salida, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(lbl_valorPagar))
                .addGroup(bg_habitacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bg_habitacionesLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(bg_habitacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cbox_tipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_reservarHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(bg_habitacionesLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel7)))
                .addGap(2, 2, 2)
                .addGroup(bg_habitacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(spn_cantidadHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(109, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg_habitaciones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg_habitaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_reservarHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reservarHabitacionActionPerformed
        //validaciones para los campos
        if (date_ingreso.getDate() == null || date_salida.getDate() == null
            || Cbox_tipoHabitacion.getSelectedItem().toString().isEmpty()
            || spn_cantidadHabitaciones.getValue() == null
            || Cbox_formaPago.getSelectedItem().toString().isEmpty()) {

            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        Habitaciones habitacion = new Habitaciones();
        //obtener fechas ingresadas por el usuario
        Date fechaIngreso = date_ingreso.getDate();
        Date fechaSalida = date_salida.getDate();

        //convertir las fechas a formato de SQL DATE
        java.sql.Date sqlFechaIngreso = new java.sql.Date(fechaIngreso.getTime());
        java.sql.Date sqlFechaSalida = new java.sql.Date(fechaSalida.getTime());

        int cantHabitaciones = (int) spn_cantidadHabitaciones.getValue(); // Se obtiene el valor del spinner y se convierte a un entero

        habitacion.setFecha_ingreso(sqlFechaIngreso);
        habitacion.setFecha_salida(sqlFechaSalida);
        habitacion.setTipo_habitacion(Cbox_tipoHabitacion.getSelectedItem().toString());
        habitacion.setCant_habitaciones(cantHabitaciones);
        habitacion.setForma_pago(Cbox_formaPago.getSelectedItem().toString());
        habitacion.setValor((int) precio);

        try {
            DAOhabitaciones dao = new DAOhabitacionIMPL();
            dao.Registrar(habitacion);
            JOptionPane.showMessageDialog(this, "Registro exitoso");

            date_ingreso.setDate(null);
            date_salida.setDate(null);
            Cbox_tipoHabitacion.setSelectedIndex(0);
            spn_cantidadHabitaciones.setValue(0);
            Cbox_formaPago.setSelectedIndex(0);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al guardar el registro");
            System.out.println("Error al registrar " + e.getMessage());
        }
    }//GEN-LAST:event_btn_reservarHabitacionActionPerformed

    private void Cbox_formaPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cbox_formaPagoActionPerformed
        calcularPrecio();
    }//GEN-LAST:event_Cbox_formaPagoActionPerformed

    private void spn_cantidadHabitacionesStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spn_cantidadHabitacionesStateChanged
        calcularPrecio();
    }//GEN-LAST:event_spn_cantidadHabitacionesStateChanged

    public void calcularPrecio() {
        precio = precios[Cbox_tipoHabitacion.getSelectedIndex()];
        cantidad = Integer.parseInt(spn_cantidadHabitaciones.getValue().toString());

        lbl_valorPagar.setText(aMoneda(precio * cantidad));

    }

    public String aMoneda(double precio) {
        return "$ " + Math.round(precio) + " Pesos";
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Cbox_formaPago;
    private javax.swing.JComboBox<String> Cbox_tipoHabitacion;
    private javax.swing.JPanel bg_habitaciones;
    private javax.swing.JButton btn_reservarHabitacion;
    private com.toedter.calendar.JDateChooser date_ingreso;
    private com.toedter.calendar.JDateChooser date_salida;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lbl_valorPagar;
    private javax.swing.JSpinner spn_cantidadHabitaciones;
    private javax.swing.JLabel txt_FechaIngreso;
    private javax.swing.JLabel txt_fechaSalida;
    private javax.swing.JLabel txt_titulo;
    // End of variables declaration//GEN-END:variables
}
