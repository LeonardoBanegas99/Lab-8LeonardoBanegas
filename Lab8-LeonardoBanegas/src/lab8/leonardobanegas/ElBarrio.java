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
        btnAgregarClientes = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListaClientes = new javax.swing.JList<>();
        jButton2 = new javax.swing.JButton();
        POPUPProductos = new javax.swing.JPopupMenu();
        Modificar = new javax.swing.JMenuItem();
        Eliminar = new javax.swing.JMenuItem();
        POPUPCliente = new javax.swing.JPopupMenu();
        ModificarCliente = new javax.swing.JMenuItem();
        EliminarCliente = new javax.swing.JMenuItem();
        FrameCliente = new javax.swing.JFrame();
        jScrollPane3 = new javax.swing.JScrollPane();
        ListaProductosCompra = new javax.swing.JList<>();
        jLabel16 = new javax.swing.JLabel();
        btnComprar = new javax.swing.JButton();
        tfCantidadaComprar = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        listacompras = new javax.swing.JList<>();
        jLabel18 = new javax.swing.JLabel();
        btnCheckOut = new javax.swing.JButton();
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

        btnAgregarClientes.setText("Agregar Clientes");
        btnAgregarClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarClientesMouseClicked(evt);
            }
        });

        jLabel15.setText("Clientes");

        ListaClientes.setModel(new DefaultListModel());
        ListaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListaClientesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(ListaClientes);

        jButton2.setText("Salir");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout FrameAdminLayout = new javax.swing.GroupLayout(FrameAdmin.getContentPane());
        FrameAdmin.getContentPane().setLayout(FrameAdminLayout);
        FrameAdminLayout.setHorizontalGroup(
            FrameAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameAdminLayout.createSequentialGroup()
                .addGroup(FrameAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameAdminLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAgregarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61))
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
                                    .addComponent(tfProductoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(FrameAdminLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jButton2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)))
                .addGroup(FrameAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameAdminLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(156, 156, 156))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameAdminLayout.createSequentialGroup()
                        .addGroup(FrameAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(102, 102, 102))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameAdminLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(162, 162, 162))))
        );
        FrameAdminLayout.setVerticalGroup(
            FrameAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameAdminLayout.createSequentialGroup()
                .addGap(44, 44, 44)
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
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAgregarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jButton2)
                .addGap(52, 52, 52))
            .addGroup(FrameAdminLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });
        POPUPProductos.add(Modificar);

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        POPUPProductos.add(Eliminar);

        ModificarCliente.setText("Modificar");
        ModificarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarClienteActionPerformed(evt);
            }
        });
        POPUPCliente.add(ModificarCliente);

        EliminarCliente.setText("Eliminar");
        EliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarClienteActionPerformed(evt);
            }
        });
        POPUPCliente.add(EliminarCliente);

        FrameCliente.setPreferredSize(new java.awt.Dimension(800, 600));
        FrameCliente.setResizable(false);
        FrameCliente.setSize(new java.awt.Dimension(800, 600));

        ListaProductosCompra.setModel(new DefaultListModel());
        jScrollPane3.setViewportView(ListaProductosCompra);

        jLabel16.setText("Productos");

        btnComprar.setText("Comprar");
        btnComprar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnComprarMouseClicked(evt);
            }
        });

        jLabel17.setText("Cantidad a Comprar");

        listacompras.setModel(new DefaultListModel());
        jScrollPane4.setViewportView(listacompras);

        jLabel18.setText("Compras");

        btnCheckOut.setText("CheckOut");

        javax.swing.GroupLayout FrameClienteLayout = new javax.swing.GroupLayout(FrameCliente.getContentPane());
        FrameCliente.getContentPane().setLayout(FrameClienteLayout);
        FrameClienteLayout.setHorizontalGroup(
            FrameClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameClienteLayout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(FrameClienteLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(FrameClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FrameClienteLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 91, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameClienteLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(FrameClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameClienteLayout.createSequentialGroup()
                                .addGroup(FrameClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnComprar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(FrameClienteLayout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addGap(18, 18, 18)
                                        .addComponent(tfCantidadaComprar)))
                                .addGap(115, 115, 115))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameClienteLayout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(211, 211, 211))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameClienteLayout.createSequentialGroup()
                                .addComponent(btnCheckOut)
                                .addGap(183, 183, 183))))))
        );
        FrameClienteLayout.setVerticalGroup(
            FrameClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addGroup(FrameClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FrameClienteLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FrameClienteLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(FrameClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfCantidadaComprar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addGap(68, 68, 68)
                        .addComponent(btnComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCheckOut)))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("El Barrio");
        setResizable(false);
        setSize(new java.awt.Dimension(400, 400));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(172, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarUsuarioMouseClicked
        String nombre = tfUsuarioNombre.getText();
        String cuenta = tfUsuarioCuenta.getText();
        String contrasena = tfUsuarioContrasena.getText();
        String numidentidad = tfUsuarioNumIdentidad.getText();
        int saldo = Integer.parseInt(tfUsuarioSaldo.getText());
        Clientes cliente = new Clientes(nombre, cuenta, contrasena, numidentidad, saldo);
        clientes.add(cliente);
        DefaultListModel modelo = (DefaultListModel) ListaClientes.getModel();
        modelo.addElement(cliente);
        ListaClientes.setModel(modelo);
        db.conectar();
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
            db.query.execute("select Cuenta, Contraseña,Nombre,Identidad,Saldo from Clientes");
            ResultSet rs = db.query.getResultSet();
            while (rs.next()) {
                if (rs.getString(1).equals(cuen) && rs.getString(2).equals(contra)) {
                    cllog = new Clientes(rs.getString(3), rs.getString(1), rs.getString(2), rs.getString(4), rs.getInt(5));
                    JOptionPane.showMessageDialog(FrameIngresar, "Ingreso con Exito");
                    FrameCliente.pack();
                    FrameCliente.setVisible(true);
                    FrameIngresar.setVisible(false);
                    FrameCliente.setLocationRelativeTo(null);
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
        DefaultListModel modelo = (DefaultListModel) ListaProductos.getModel();
        modelo.addElement(prod);
        ListaProductos.setModel(modelo);
        ListaProductosCompra.setModel(modelo);
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
        DefaultListModel modelo = (DefaultListModel) ListaProductos.getModel();
        Producto prod = (Producto) modelo.getElementAt(x);
        String nombre = JOptionPane.showInputDialog(FrameAdmin, "Nombre Nuevo");
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog(FrameAdmin, "Cantidad Nueva"));
        int precio = Integer.parseInt(JOptionPane.showInputDialog(FrameAdmin, "Precio Nuevo"));
        db.conectar();
        try {
            db.query.execute("update Productos set Nombre='" + nombre + "' where Nombre='" + prod.getNombre() + "'");
            db.query.execute("update Productos set Cantidad='" + cantidad + "' where Nombre='" + nombre + "'");
            db.query.execute("update Productos set Precio='" + precio + "' where Nombre='" + nombre + "'");
            db.commit();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        ((Producto) modelo.getElementAt(x)).setNombre(nombre);
        ((Producto) modelo.getElementAt(x)).setCantidad(cantidad);
        ((Producto) modelo.getElementAt(x)).setPrecio(precio);
        ListaProductos.setModel(modelo);
        ListaProductosCompra.setModel(modelo);
        db.desconectar();
    }//GEN-LAST:event_ModificarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        int x = ListaProductos.getSelectedIndex();
        DefaultListModel modelo = (DefaultListModel) ListaProductos.getModel();
        Producto prod = (Producto) modelo.getElementAt(x);
        db.conectar();
        try {
            db.query.execute("delete from Productos where Nombre='" + prod.getNombre() + "'");
            db.commit();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        modelo.removeElementAt(x);
        ListaProductos.setModel(modelo);
        ListaProductosCompra.setModel(modelo);
        db.desconectar();
    }//GEN-LAST:event_EliminarActionPerformed

    private void btnAgregarClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarClientesMouseClicked
        FrameRegistro.setVisible(true);
        FrameRegistro.pack();
        FrameRegistro.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnAgregarClientesMouseClicked

    private void ListaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaClientesMouseClicked
        if (evt.isMetaDown()) {
            POPUPCliente.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_ListaClientesMouseClicked

    private void ModificarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarClienteActionPerformed
        int x = ListaClientes.getSelectedIndex();
        DefaultListModel modelo = (DefaultListModel) ListaClientes.getModel();
        Clientes clien = (Clientes) modelo.getElementAt(x);
        String nombre = JOptionPane.showInputDialog(FrameAdmin, "Nombre Nuevo");
        String cuenta = JOptionPane.showInputDialog(FrameAdmin, "Cuenta Nuevo");
        String contrasena = JOptionPane.showInputDialog(FrameAdmin, "Contraseña Nuevo");
        String numidentidad = JOptionPane.showInputDialog(FrameAdmin, "Numero de Identidad Nuevo");
        int saldo = Integer.parseInt(JOptionPane.showInputDialog(FrameAdmin, "Saldo Nuevo"));
        db.conectar();
        try {
            db.query.execute("update Clientes set Nombre='" + nombre + "' where Nombre='" + clien.getNombre() + "'");
            db.query.execute("update Clientes set Cuenta='" + cuenta + "' where Nombre='" + nombre + "'");
            db.query.execute("update Clientes set Contraseña='" + contrasena + "' where Nombre='" + nombre + "'");
            db.query.execute("update Clientes set Identidad='" + numidentidad + "' where Nombre='" + nombre + "'");
            db.query.execute("update Clientes set Saldo='" + saldo + "' where Nombre='" + nombre + "'");
            db.commit();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        ((Clientes) modelo.getElementAt(x)).setNombre(nombre);
        ((Clientes) modelo.getElementAt(x)).setCuenta(cuenta);
        ((Clientes) modelo.getElementAt(x)).setContrasena(contrasena);
        ((Clientes) modelo.getElementAt(x)).setNumidentidad(numidentidad);
        ((Clientes) modelo.getElementAt(x)).setSaldodisponible(saldo);
        ListaClientes.setModel(modelo);
        db.desconectar();
    }//GEN-LAST:event_ModificarClienteActionPerformed

    private void EliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarClienteActionPerformed
        int x = ListaClientes.getSelectedIndex();
        DefaultListModel modelo = (DefaultListModel) ListaClientes.getModel();
        Clientes clien = (Clientes) modelo.getElementAt(x);
        db.conectar();
        try {
            db.query.execute("delete from Clientes where Nombre='" + clien.getNombre() + "'");
            db.commit();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        modelo.removeElementAt(x);
        ListaClientes.setModel(modelo);
        db.desconectar();
    }//GEN-LAST:event_EliminarClienteActionPerformed

    private void btnComprarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprarMouseClicked
        int cantidadcompra = Integer.parseInt(tfCantidadaComprar.getText());
        int x = ListaProductosCompra.getSelectedIndex();
        DefaultListModel modelo = (DefaultListModel) ListaProductosCompra.getModel();
        DefaultListModel modelocompras = (DefaultListModel) listacompras.getModel();
        Producto prod = (Producto) modelo.getElementAt(x);
        Date fe = prod.getFechacaducidad();
        Date actual = new Date();
        if ((fe.getYear() + 1900) > (actual.getYear() + 1900)) {
            if (prod.getCantidad() >= cantidadcompra) {
                if (prod.getPrecio() >= cllog.getSaldodisponible()) {
                    int cantidadori = prod.getCantidad();
                    int finalcantidad = cantidadori - cantidadcompra;
                    prod.setCantidad(cantidadori - cantidadcompra);
                    cllog.getProductos().add(prod);
                    modelocompras.addElement(prod);
                    int saldo = cllog.getSaldodisponible();
                    cllog.setSaldodisponible(saldo - prod.getPrecio());
                    JOptionPane.showMessageDialog(FrameCliente, "Producto Comprado");
                    
                    db.conectar();
                    try {
                        db.query.execute("update Productos set Cantidad='" + finalcantidad + "' where Nombre='" + prod.getNombre() + "'");
                        db.query.execute("update Clientes set Saldo='" + cllog.getSaldodisponible() + "' where Nombre='" + cllog.getNombre() + "'");
                        db.commit();
                    } catch (SQLException sqle) {
                        sqle.printStackTrace();
                    }
                } else {
                    JOptionPane.showMessageDialog(FrameCliente, "No hay suficiente saldo");
                }
            } else {
                JOptionPane.showMessageDialog(FrameCliente, "No hay suficiente cantidad");
            }
        } else if ((fe.getYear() + 1900) == (actual.getYear() + 1900)) {
            if ((fe.getMonth() > actual.getMonth())) {
                if (prod.getCantidad() >= cantidadcompra) {
                    if (prod.getPrecio() >= cllog.getSaldodisponible()) {
                        int cantidadori = prod.getCantidad();
                        int finalcantidad = cantidadori - cantidadcompra;
                        prod.setCantidad(cantidadori - cantidadcompra);
                        cllog.getProductos().add(prod);
                        modelocompras.addElement(prod);
                        int saldo = cllog.getSaldodisponible();
                        cllog.setSaldodisponible(saldo - prod.getPrecio());
                        JOptionPane.showMessageDialog(FrameCliente, "Producto Comprado");
                        db.conectar();
                        try {
                            db.query.execute("update Productos set Cantidad='" + finalcantidad + "' where Nombre='" + prod.getNombre() + "'");
                            db.query.execute("update Clientes set Saldo='" + cllog.getSaldodisponible() + "' where Nombre='" + cllog.getNombre() + "'");
                            db.commit();
                        } catch (SQLException sqle) {
                            sqle.printStackTrace();
                        }
                    } else {
                        JOptionPane.showMessageDialog(FrameCliente, "No hay suficiente saldo");
                    }
                } else {
                    JOptionPane.showMessageDialog(FrameCliente, "No hay suficiente cantidad");
                }
            } else if ((fe.getMonth() == actual.getMonth())) {
                if ((fe.getDay() > actual.getDay())) {
                    if (prod.getCantidad() >= cantidadcompra) {
                        if (prod.getPrecio() >= cllog.getSaldodisponible()) {
                            int cantidadori = prod.getCantidad();
                            int finalcantidad = cantidadori - cantidadcompra;
                            prod.setCantidad(cantidadori - cantidadcompra);
                            cllog.getProductos().add(prod);
                            modelocompras.addElement(prod);
                            int saldo = cllog.getSaldodisponible();
                            cllog.setSaldodisponible(saldo - prod.getPrecio());
                            JOptionPane.showMessageDialog(FrameCliente, "Producto Comprado");
                            db.conectar();
                            try {
                                db.query.execute("update Productos set Cantidad='" + finalcantidad + "' where Nombre='" + prod.getNombre() + "'");
                                db.query.execute("update Clientes set Saldo='" + cllog.getSaldodisponible() + "' where Nombre='" + cllog.getNombre() + "'");
                                db.commit();
                            } catch (SQLException sqle) {
                                sqle.printStackTrace();
                            }
                        } else {
                            JOptionPane.showMessageDialog(FrameCliente, "No hay suficiente saldo");
                        }
                    } else {
                        JOptionPane.showMessageDialog(FrameCliente, "No hay suficiente cantidad");
                    }
                } else if ((fe.getDay() == actual.getDay())) {
                    JOptionPane.showMessageDialog(FrameCliente, "Producto Vencido, no puedo Comprarse");
                } else {
                    JOptionPane.showMessageDialog(FrameCliente, "Producto Vencido, no puedo Comprarse");
                }
            } else {
                JOptionPane.showMessageDialog(FrameCliente, "Producto Vencido, no puedo Comprarse");
            }
        } else {
            JOptionPane.showMessageDialog(FrameCliente, "Producto Vencido, no puedo Comprarse");
        }
        tfCantidadaComprar.setText("");
        listacompras.setModel(modelocompras);
    }//GEN-LAST:event_btnComprarMouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        FrameAdmin.setVisible(false);
        FrameIngresar.setVisible(true);
        FrameIngresar.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton2MouseClicked
    
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
    private javax.swing.JMenuItem EliminarCliente;
    private javax.swing.JFrame FrameAdmin;
    private javax.swing.JFrame FrameCliente;
    private javax.swing.JFrame FrameIngresar;
    private javax.swing.JFrame FrameRegistro;
    private javax.swing.JList<String> ListaClientes;
    private javax.swing.JList<String> ListaProductos;
    private javax.swing.JList<String> ListaProductosCompra;
    private javax.swing.JMenuItem Modificar;
    private javax.swing.JMenuItem ModificarCliente;
    private javax.swing.JPopupMenu POPUPCliente;
    private javax.swing.JPopupMenu POPUPProductos;
    private javax.swing.JButton btnAgregarClientes;
    private javax.swing.JButton btnCheckOut;
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnIngresarUsuario;
    private javax.swing.JButton btnRegistrarUsuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList<String> listacompras;
    private javax.swing.JTextField tfCantidadaComprar;
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
