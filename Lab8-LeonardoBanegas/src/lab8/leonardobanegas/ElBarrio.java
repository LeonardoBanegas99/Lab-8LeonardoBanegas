package lab8.leonardobanegas;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class ElBarrio extends javax.swing.JFrame {

    Administrador adminerick = new Administrador("erick123", "321kcire");
    Clientes cllog;
    private ArrayList<Clientes> clientes = new ArrayList();
    private ArrayList<Producto> productos = new ArrayList();
    Dba db = new Dba("./base.accdb");

    public ElBarrio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FrameRegistro = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfUsuarioNombre = new javax.swing.JTextField();
        tfUsuarioCuenta = new javax.swing.JTextField();
        tfUsuarioContrasena = new javax.swing.JTextField();
        tfUsuarioNumIdentidad = new javax.swing.JTextField();
        tfUsuarioSaldo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnRegistrarUsuario = new javax.swing.JButton();
        FrameIngresar = new javax.swing.JFrame();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Contraseña = new javax.swing.JLabel();
        tfIngresarCuenta = new javax.swing.JTextField();
        tfIngresarContrasena = new javax.swing.JTextField();
        btnIngresarUsuario = new javax.swing.JButton();
        FrameAdmin = new javax.swing.JFrame();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        tfProductoNombre = new javax.swing.JTextField();
        tfProductoCantidad = new javax.swing.JTextField();
        tfProductoPrecio = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaProductos = new javax.swing.JList<>();
        jLabel14 = new javax.swing.JLabel();
        POPUPProductos = new javax.swing.JPopupMenu();
        Modificar = new javax.swing.JMenuItem();
        Eliminar = new javax.swing.JMenuItem();
        btnRegistrarse = new javax.swing.JButton();
        btnIngresar = new javax.swing.JButton();

        FrameRegistro.setPreferredSize(new java.awt.Dimension(500, 500));
        FrameRegistro.setSize(new java.awt.Dimension(500, 500));

        jLabel1.setText("Nombre");

        jLabel2.setText("Cuenta");

        jLabel3.setText("Contraseña");

        jLabel4.setText("Numero de Identidad");

        jLabel5.setText("Saldo Disponible");

        jLabel6.setText("Registro de Clientes");

        btnRegistrarUsuario.setText("Registrar");
        btnRegistrarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarUsuarioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout FrameRegistroLayout = new javax.swing.GroupLayout(FrameRegistro.getContentPane());
        FrameRegistro.getContentPane().setLayout(FrameRegistroLayout);
        FrameRegistroLayout.setHorizontalGroup(
            FrameRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameRegistroLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(FrameRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(FrameRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfUsuarioNombre)
                    .addComponent(tfUsuarioCuenta)
                    .addComponent(tfUsuarioContrasena)
                    .addComponent(tfUsuarioNumIdentidad)
                    .addComponent(tfUsuarioSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))
                .addGap(44, 44, 44))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameRegistroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(173, 173, 173))
            .addGroup(FrameRegistroLayout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(btnRegistrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(186, Short.MAX_VALUE))
        );
        FrameRegistroLayout.setVerticalGroup(
            FrameRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameRegistroLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(FrameRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfUsuarioNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(FrameRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfUsuarioCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(FrameRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfUsuarioContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(FrameRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfUsuarioNumIdentidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(FrameRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfUsuarioSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(btnRegistrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        FrameIngresar.setPreferredSize(new java.awt.Dimension(500, 500));
        FrameIngresar.setSize(new java.awt.Dimension(500, 500));

        jLabel7.setFont(new java.awt.Font("Gadugi", 0, 36)); // NOI18N
        jLabel7.setText("Ingresar");

        jLabel8.setText("Cuenta");

        Contraseña.setText("Contraseña");

        btnIngresarUsuario.setText("Ingresar");
        btnIngresarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIngresarUsuarioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout FrameIngresarLayout = new javax.swing.GroupLayout(FrameIngresar.getContentPane());
        FrameIngresar.getContentPane().setLayout(FrameIngresarLayout);
        FrameIngresarLayout.setHorizontalGroup(
            FrameIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameIngresarLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(FrameIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FrameIngresarLayout.createSequentialGroup()
                        .addComponent(Contraseña)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addComponent(tfIngresarContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FrameIngresarLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfIngresarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(109, 109, 109))
            .addGroup(FrameIngresarLayout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addGroup(FrameIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(FrameIngresarLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnIngresarUsuario)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FrameIngresarLayout.setVerticalGroup(
            FrameIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameIngresarLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel7)
                .addGap(55, 55, 55)
                .addGroup(FrameIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tfIngresarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(FrameIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Contraseña)
                    .addComponent(tfIngresarContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(btnIngresarUsuario)
                .addContainerGap(173, Short.MAX_VALUE))
        );

        FrameAdmin.setPreferredSize(new java.awt.Dimension(800, 600));
        FrameAdmin.setSize(new java.awt.Dimension(800, 600));

        jLabel9.setText("Nombre");

        jLabel10.setText("Cantidad");

        jLabel11.setText("Precio");

        jLabel12.setText("Fecha de Caducidad");

        jLabel13.setFont(new java.awt.Font("Gadugi", 0, 36)); // NOI18N
        jLabel13.setText("Agregar Producto");

        jButton1.setText("Agregar Producto");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        ListaProductos.setModel(new DefaultListModel());
        ListaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListaProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ListaProductos);

        jLabel14.setText("Productos");

        javax.swing.GroupLayout FrameAdminLayout = new javax.swing.GroupLayout(FrameAdmin.getContentPane());
        FrameAdmin.getContentPane().setLayout(FrameAdminLayout);
        FrameAdminLayout.setHorizontalGroup(
            FrameAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameAdminLayout.createSequentialGroup()
                .addGroup(FrameAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FrameAdminLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel13))
                    .addGroup(FrameAdminLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jButton1))
                    .addGroup(FrameAdminLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(FrameAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(44, 44, 44)
                        .addGroup(FrameAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tfProductoNombre)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfProductoCantidad)
                            .addComponent(tfProductoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(FrameAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameAdminLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(156, 156, 156))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameAdminLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))))
        );
        FrameAdminLayout.setVerticalGroup(
            FrameAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameAdminLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(FrameAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FrameAdminLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addGroup(FrameAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(tfProductoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(FrameAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfProductoCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(FrameAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfProductoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(22, 22, 22)
                        .addGroup(FrameAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(jButton1))
                    .addGroup(FrameAdminLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(210, Short.MAX_VALUE))
        );

        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });
        POPUPProductos.add(Modificar);

        Eliminar.setText("Eliminar");
        POPUPProductos.add(Eliminar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("El Barrio");
        setPreferredSize(new java.awt.Dimension(400, 400));
        setResizable(false);
        setSize(new java.awt.Dimension(400, 400));

        btnRegistrarse.setText("Registrarse");
        btnRegistrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarseMouseClicked(evt);
            }
        });
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });

        btnIngresar.setText("Ingresar");
        btnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIngresarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(btnRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(160, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarseActionPerformed

    private void btnRegistrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarseMouseClicked
        FrameRegistro.pack();
        FrameRegistro.setLocationRelativeTo(null);
        FrameRegistro.setVisible(true);
    }//GEN-LAST:event_btnRegistrarseMouseClicked

    private void btnRegistrarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarUsuarioMouseClicked
        String nombre = tfUsuarioNombre.getText();
        String cuenta = tfUsuarioCuenta.getText();
        String contrasena = tfUsuarioContrasena.getText();
        String numidentidad = tfUsuarioNumIdentidad.getText();
        int saldo = Integer.parseInt(tfUsuarioSaldo.getText());
        db.conectar();
        clientes.add(new Clientes(nombre, cuenta, contrasena, numidentidad, saldo));
        try {
            db.query.execute("INSERT INTO Clientes"
                    + " (Nombre,Cuenta,Contraseña,Identidad, Saldo)"
                    + "VALUES ('" + nombre + "', '" + cuenta + "', '" + contrasena + "', '" + numidentidad + "', " + saldo + " )");
            db.commit();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        db.desconectar();
        tfUsuarioNombre.setText("");
        tfUsuarioCuenta.setText("");
        tfUsuarioContrasena.setText("");
        tfUsuarioNumIdentidad.setText("");
        tfUsuarioSaldo.setText("");
        JOptionPane.showMessageDialog(this, "Cliente Agregado");

    }//GEN-LAST:event_btnRegistrarUsuarioMouseClicked

    private void btnIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseClicked
        FrameIngresar.pack();
        FrameIngresar.setLocationRelativeTo(null);
        FrameIngresar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnIngresarMouseClicked

    private void btnIngresarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarUsuarioMouseClicked
        String cuen = tfIngresarCuenta.getText();
        String contra = tfIngresarContrasena.getText();
        db.conectar();
        if (cuen.equals(adminerick.getUsuario()) && contra.equals(adminerick.getContrasena())) {
            FrameIngresar.setVisible(false);
            FrameAdmin.pack();
            FrameAdmin.setLocationRelativeTo(null);
            FrameAdmin.setVisible(true);
        }
        try {
            db.query.execute("select Cuenta, Contraseña from Clientes");
            ResultSet rs = db.query.getResultSet();
            while (rs.next()) {
                if (rs.getString(1).equals(cuen) && rs.getString(2).equals(contra)) {
                    JOptionPane.showMessageDialog(FrameIngresar, "Ingreso con Exito");

                }
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        db.desconectar();
    }//GEN-LAST:event_btnIngresarUsuarioMouseClicked

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed

    }//GEN-LAST:event_jButton1KeyPressed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        String nombre = tfProductoNombre.getText();
        int cantidad = Integer.parseInt(tfProductoCantidad.getText());
        int precio = Integer.parseInt(tfProductoPrecio.getText());
        DateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        Date fechacad = jDateChooser1.getDate();
        String fechastring = formato.format(jDateChooser1.getDate());

        db.conectar();
        System.out.println("conecto1");
        Producto prod = new Producto(nombre, cantidad, precio, fechacad);
        productos.add(prod);
        DefaultListModel modelo = new DefaultListModel();
        modelo.addElement(prod);
        ListaProductos.setModel(modelo);
        try {
            db.query.execute("INSERT INTO Productos"
                    + " (Cantidad,Precio,Caducidad,Nombre)"
                    + "VALUES (" + cantidad + ", " + precio + ", '" + fechastring + "', '" + nombre + "' )");
            db.commit();
            System.out.println("agrego");

        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        db.desconectar();
    }//GEN-LAST:event_jButton1MouseClicked

    private void ListaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaProductosMouseClicked
        if (evt.isMetaDown()) {
            POPUPProductos.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_ListaProductosMouseClicked

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        int x = ListaProductos.getSelectedIndex();
        DefaultListModel modelo = new DefaultListModel();
        Producto prod = (Producto) modelo.getElementAt(x);
        String nombre = JOptionPane.showInputDialog(FrameAdmin, "Nombre Nuevo");
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog(FrameAdmin, "Cantidad Nueva"));
        int precio = Integer.parseInt(JOptionPane.showInputDialog(FrameAdmin, "Precio Nuevo"));
        DateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        Date fechacad = prod.getFechacaducidad();
        String fechastring = formato.format(fechacad);

        try {
            db.query.execute("update Producto set nombre='" + nombre + "' where nombre='" + prod.getNombre() + "'");
            db.commit();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        db.desconectar();
    }//GEN-LAST:event_ModificarActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(ElBarrio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ElBarrio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ElBarrio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ElBarrio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ElBarrio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Contraseña;
    private javax.swing.JMenuItem Eliminar;
    private javax.swing.JFrame FrameAdmin;
    private javax.swing.JFrame FrameIngresar;
    private javax.swing.JFrame FrameRegistro;
    private javax.swing.JList<String> ListaProductos;
    private javax.swing.JMenuItem Modificar;
    private javax.swing.JPopupMenu POPUPProductos;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnIngresarUsuario;
    private javax.swing.JButton btnRegistrarUsuario;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tfIngresarContrasena;
    private javax.swing.JTextField tfIngresarCuenta;
    private javax.swing.JTextField tfProductoCantidad;
    private javax.swing.JTextField tfProductoNombre;
    private javax.swing.JTextField tfProductoPrecio;
    private javax.swing.JTextField tfUsuarioContrasena;
    private javax.swing.JTextField tfUsuarioCuenta;
    private javax.swing.JTextField tfUsuarioNombre;
    private javax.swing.JTextField tfUsuarioNumIdentidad;
    private javax.swing.JTextField tfUsuarioSaldo;
    // End of variables declaration//GEN-END:variables
}
