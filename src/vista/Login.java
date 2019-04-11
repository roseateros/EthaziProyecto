/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ValidarLogin;

/**
 *
 * @author acebin
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    
    ValidarLogin datosLogin = new ValidarLogin();
    
    
    public Login() {
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

        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        dni = new javax.swing.JTextField();
        iniciarSesion = new javax.swing.JButton();
        registrarse = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        contrasena = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        invalido2 = new javax.swing.JLabel();
        invalido1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        cambiarContraseña = new javax.swing.JMenuItem();
        leyendaDatos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Inicie sesión");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 160, 10));

        dni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dniActionPerformed(evt);
            }
        });
        dni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dniKeyTyped(evt);
            }
        });
        getContentPane().add(dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 110, -1));

        iniciarSesion.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        iniciarSesion.setText("Iniciar sesión");
        iniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(iniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 110, -1));

        registrarse.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        registrarse.setText("Registrarse");
        registrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarseActionPerformed(evt);
            }
        });
        getContentPane().add(registrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 110, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DNI");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 40, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contraseña");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("¿Aún no estás registrado?");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        contrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contrasenaActionPerformed(evt);
            }
        });
        getContentPane().add(contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 110, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 160, 10));

        invalido2.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        invalido2.setForeground(new java.awt.Color(255, 0, 51));
        invalido2.setText("Inválido");
        getContentPane().add(invalido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, -1, -1));

        invalido1.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        invalido1.setForeground(new java.awt.Color(255, 0, 51));
        invalido1.setText("Inválido");
        getContentPane().add(invalido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, -1));

        jMenu1.setText("Ayuda");

        cambiarContraseña.setText("He olvidado la contraseña");
        cambiarContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarContraseñaActionPerformed(evt);
            }
        });
        jMenu1.add(cambiarContraseña);

        leyendaDatos.setText("Acerca de los datos");
        jMenu1.add(leyendaDatos);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dniActionPerformed

        // para saltar de recuadro al puslar enter
        dni.transferFocus();

    }//GEN-LAST:event_dniActionPerformed

    private void dniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dniKeyTyped
        // Este evento servirá para controlar el uso de numero en el campo de nombre/usuario

    }//GEN-LAST:event_dniKeyTyped

    private void iniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarSesionActionPerformed
        /*
        ValidarLogin datosLogin = new ValidarLogin();

        this.miDNI = dni.getText();

        pass = String.valueOf(contrasena.getPassword());

        datosLogin.validarDNI(miDNI, this.invalido2);
        datosLogin.validarPass(pass, this.invalido1);

        try{
            if(datosLogin.verificarCliente(pass, miDNI, dispose)==true){dispose();}
        }catch(SQLException ex){
            System.out.println("sad"); // aqui va el mensaje que yo quiera
        }
        datosLogin.datosIncorrectos();*/
        
        datosLogin.validarDNI(this.dni, this.invalido1);
        datosLogin.validarPass(this.contrasena, jLabel1);
        
        
    }//GEN-LAST:event_iniciarSesionActionPerformed

    private void registrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarseActionPerformed
        //AQUI VOY A PROBAR LA CONEXION A DB

        /*Registro miRegistro = new Registro();
        miRegistro.setVisible(true);
        dispose();*/
    }//GEN-LAST:event_registrarseActionPerformed

    private void contrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contrasenaActionPerformed
        contrasena.transferFocus(); // para saltar de recuadro al puslar enter
    }//GEN-LAST:event_contrasenaActionPerformed

    private void cambiarContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarContraseñaActionPerformed
        // TODO add your handling code here:
      /*  CambiarPass cambiar = new CambiarPass();
        cambiar.setVisible(true);
        dispose();*/
    }//GEN-LAST:event_cambiarContraseñaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem cambiarContraseña;
    private javax.swing.JPasswordField contrasena;
    private javax.swing.JTextField dni;
    private javax.swing.JButton iniciarSesion;
    private javax.swing.JLabel invalido1;
    private javax.swing.JLabel invalido2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JMenuItem leyendaDatos;
    private javax.swing.JButton registrarse;
    // End of variables declaration//GEN-END:variables
}