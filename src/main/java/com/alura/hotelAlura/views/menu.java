package com.alura.hotelAlura.views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import javax.swing.JPanel;

/**
 *
 * @author CRISTIAN
 */
public class menu extends javax.swing.JPanel {

    /**
     * Creates new form vista2
     */
    public menu() {
        initComponents();
        InitContent();
        setDate();
        InitStyles();
    }

    public void InitContent() {
        ShowJPanel(new Principal());
    }

    public void InitStyles() {
        /*texto fecha*/
        dateText.putClientProperty("FlatLaf.style", "font:24 $light.font");
        dateText.setForeground(Color.WHITE);

        titulo.putClientProperty("FlatLaf.style", "font: 32 $bold.font");
        titulo.setForeground(new Color(13, 71, 161));

        /*texto navegacion*/
        navText.putClientProperty("FlatLaf.style", "font:bold $h3.regular.font");
        navText.setForeground(Color.WHITE);

        /*texto fecha*/
        dateText.putClientProperty("FlatLaf.style", "font:24 $light.font");
        dateText.setForeground(Color.WHITE);
    }

    private void ShowJPanel(JPanel p) {
        p.setSize(700, 400);
        p.setLocation(0, 0);

        panel_principal.removeAll();
        panel_principal.add(p, BorderLayout.CENTER);
        panel_principal.revalidate();
        panel_principal.repaint();
    }

    public void setDate() {
        /*Con este metodo se define un array que muesta los la fecha exacta en el programa,
        el problema es que me inica el dia en numero y yo ncesito que lo mueste con su nombre 
        y su numero correspondiente*/

        //LocalDate now = LocalDate.now();
        //int year = now.getYear();
        //int day = now.getDayOfMonth();
        // int month = now.getMonthValue();
        //String[] meses = {"enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        //dateText.setText("Hoy es "+day+" de "+ meses[month-1]+" de "+year);
        LocalDate now = LocalDate.now();
        Locale spanishLocale = new Locale("es", "ES");
        dateText.setText(now.format(DateTimeFormatter.ofPattern("'Hoy es' EEEE dd 'de' MMMM 'de' YYYY", spanishLocale)));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        panel_principal = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        menu_lateral = new javax.swing.JPanel();
        LogoAlura = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnPrincipal = new javax.swing.JButton();
        btnRegistroHuesped = new javax.swing.JButton();
        btnregistroHabitacion = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        btnReportes1 = new javax.swing.JButton();
        header = new javax.swing.JPanel();
        navText = new javax.swing.JLabel();
        dateText = new javax.swing.JLabel();

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setPreferredSize(new java.awt.Dimension(1024, 640));

        panel_principal.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panel_principalLayout = new javax.swing.GroupLayout(panel_principal);
        panel_principal.setLayout(panel_principalLayout);
        panel_principalLayout.setHorizontalGroup(
            panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panel_principalLayout.setVerticalGroup(
            panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 417, Short.MAX_VALUE)
        );

        titulo.setBackground(new java.awt.Color(255, 255, 255));
        titulo.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("HOTEL  ALURA");

        menu_lateral.setBackground(new java.awt.Color(13, 71, 161));
        menu_lateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LogoAlura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LogoAlura.setIcon(new javax.swing.ImageIcon("C:\\Users\\CRISTIAN\\Documents\\NetBeansProjects\\Biblioteca\\src\\main\\images\\logo-alura2.png")); // NOI18N
        menu_lateral.add(LogoAlura, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 282, 218));
        menu_lateral.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 233, 18));

        btnPrincipal.setBackground(new java.awt.Color(25, 118, 210));
        btnPrincipal.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        btnPrincipal.setIcon(new javax.swing.ImageIcon("C:\\Users\\CRISTIAN\\Documents\\NetBeansProjects\\Biblioteca\\src\\main\\images\\inicio.png")); // NOI18N
        btnPrincipal.setText("Principal");
        btnPrincipal.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 15, 1, 1, new java.awt.Color(0, 0, 0)));
        btnPrincipal.setBorderPainted(false);
        btnPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPrincipal.setIconTextGap(15);
        btnPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrincipalActionPerformed(evt);
            }
        });
        menu_lateral.add(btnPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 281, 294, 53));

        btnRegistroHuesped.setBackground(new java.awt.Color(25, 118, 210));
        btnRegistroHuesped.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnRegistroHuesped.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistroHuesped.setIcon(new javax.swing.ImageIcon("C:\\Users\\CRISTIAN\\Documents\\NetBeansProjects\\hotelAlura\\src\\main\\Resources\\iconUsers.png")); // NOI18N
        btnRegistroHuesped.setText("Registro huesped");
        btnRegistroHuesped.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 15, 1, 1, new java.awt.Color(0, 0, 0)));
        btnRegistroHuesped.setBorderPainted(false);
        btnRegistroHuesped.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistroHuesped.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnRegistroHuesped.setIconTextGap(15);
        btnRegistroHuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroHuespedActionPerformed(evt);
            }
        });
        menu_lateral.add(btnRegistroHuesped, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 294, 53));

        btnregistroHabitacion.setBackground(new java.awt.Color(25, 118, 210));
        btnregistroHabitacion.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnregistroHabitacion.setForeground(new java.awt.Color(255, 255, 255));
        btnregistroHabitacion.setIcon(new javax.swing.ImageIcon("C:\\Users\\CRISTIAN\\Documents\\NetBeansProjects\\hotelAlura\\src\\main\\Resources\\icon_cama.png")); // NOI18N
        btnregistroHabitacion.setText("Registro habitacion");
        btnregistroHabitacion.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 15, 1, 1, new java.awt.Color(0, 0, 0)));
        btnregistroHabitacion.setBorderPainted(false);
        btnregistroHabitacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnregistroHabitacion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnregistroHabitacion.setIconTextGap(15);
        btnregistroHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistroHabitacionActionPerformed(evt);
            }
        });
        menu_lateral.add(btnregistroHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 294, 53));

        btnReportes.setBackground(new java.awt.Color(25, 118, 210));
        btnReportes.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnReportes.setForeground(new java.awt.Color(255, 255, 255));
        btnReportes.setIcon(new javax.swing.ImageIcon("C:\\Users\\CRISTIAN\\Documents\\NetBeansProjects\\Biblioteca\\src\\main\\images\\iconsReports.png")); // NOI18N
        btnReportes.setText("Reportes Huespedes");
        btnReportes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 15, 1, 1, new java.awt.Color(0, 0, 0)));
        btnReportes.setBorderPainted(false);
        btnReportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReportes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnReportes.setIconTextGap(15);
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });
        menu_lateral.add(btnReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 294, 53));

        btnReportes1.setBackground(new java.awt.Color(25, 118, 210));
        btnReportes1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnReportes1.setForeground(new java.awt.Color(255, 255, 255));
        btnReportes1.setIcon(new javax.swing.ImageIcon("C:\\Users\\CRISTIAN\\Documents\\NetBeansProjects\\Biblioteca\\src\\main\\images\\iconsReports.png")); // NOI18N
        btnReportes1.setText("Reportes Reservas");
        btnReportes1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 15, 1, 1, new java.awt.Color(0, 0, 0)));
        btnReportes1.setBorderPainted(false);
        btnReportes1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReportes1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnReportes1.setIconTextGap(15);
        btnReportes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportes1ActionPerformed(evt);
            }
        });
        menu_lateral.add(btnReportes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 294, 53));

        header.setBackground(new java.awt.Color(25, 118, 210));
        header.setPreferredSize(new java.awt.Dimension(750, 150));

        navText.setText("Administracion/Control/Biblioteca");

        dateText.setText("Hoy es {dayname} {day} de {month} de {year}");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(navText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(headerLayout.createSequentialGroup()
                        .addComponent(dateText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(163, 163, 163)))
                .addGap(258, 258, 258))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(navText)
                .addGap(18, 18, 18)
                .addComponent(dateText)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(menu_lateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, 1024, Short.MAX_VALUE)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addComponent(panel_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 1006, Short.MAX_VALUE)
                                .addGap(12, 12, 12))))))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu_lateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 1318, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistroHuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroHuespedActionPerformed
        ShowJPanel(new reg_cliente());
    }//GEN-LAST:event_btnRegistroHuespedActionPerformed

    private void btnPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrincipalActionPerformed
        ShowJPanel(new Principal());
    }//GEN-LAST:event_btnPrincipalActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        ShowJPanel(new repoHuespedes());
    }//GEN-LAST:event_btnReportesActionPerformed

    private void btnregistroHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistroHabitacionActionPerformed
        ShowJPanel(new reg_habitacion());
    }//GEN-LAST:event_btnregistroHabitacionActionPerformed

    private void btnReportes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportes1ActionPerformed
        ShowJPanel(new repoReservas());
    }//GEN-LAST:event_btnReportes1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LogoAlura;
    private javax.swing.JPanel background;
    private javax.swing.JButton btnPrincipal;
    private javax.swing.JButton btnRegistroHuesped;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnReportes1;
    private javax.swing.JButton btnregistroHabitacion;
    private javax.swing.JLabel dateText;
    private javax.swing.JPanel header;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel menu_lateral;
    private javax.swing.JLabel navText;
    private javax.swing.JPanel panel_principal;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}