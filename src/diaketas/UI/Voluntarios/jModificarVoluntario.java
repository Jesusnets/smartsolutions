/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package diaketas.UI.Voluntarios;

import ValidarCampos.ValidarCampos;
import diaketas.UI.UI;
import diaketas.Modelo.ONG.ONG;
import diaketas.Modelo.Gestores.Gestor_de_voluntarios;
import diaketas.Modelo.ONG.Voluntario;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author cesar
 */
public class jModificarVoluntario extends javax.swing.JPanel {

    jConfirmarModificacion confirmarModificacion;
    
    /**
     * Creates new form jAltaBeneficiario
     * @param v 
     */
    public jModificarVoluntario(Voluntario v) {
        initComponents();
        
                
        //Ponemos por defecto los datos del voluntario a modificar
        
        NIF.setText(v.NIF_CIF);
        Nombre.setText(v.Nombre);
        Apellidos.setText(v.Apellidos);        
        Nacionalidad.setText(v.Nacionalidad);
        
        Poblacion.setText(v.Domicilio);
        Domicilio.setText(v.Domicilio);
        Email.setText(v.Email);
        Obs.setText(v.Observaciones);
        
        CodPost.setText( Integer.toString(v.Codigo_Postal) );
        Telefono.setText(Integer.toString(v.Telefono));
        

// Representamos la fecha, pasandola de tipo Date a String, como Fecha_Inicio y FechaDesac no pueden ser null, no tendremos problemas
        SimpleDateFormat formatoFecha=new java.text.SimpleDateFormat("dd/MM/yy");
               
        FechaInicio.setText(formatoFecha.format(v.Fecha_Inicio));
        FechaNac.setText(formatoFecha.format(v.FechaNac));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        botonOK = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        NIF1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        botonCancelar = new javax.swing.JButton();
        Observaciones_Datos_Personales_SB = new javax.swing.JScrollPane();
        Obs = new javax.swing.JTextArea();
        Poblacion = new javax.swing.JTextField();
        FechaNac = new javax.swing.JFormattedTextField();
        Domicilio = new javax.swing.JTextField();
        CodPost = new javax.swing.JTextField();
        Nacionalidad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Apellidos = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        NIF = new javax.swing.JTextField();
        Telefono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        FechaInicio = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Voluntarios");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Modificar a un voluntario");

        botonOK.setText("Ok");
        botonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOKActionPerformed(evt);
            }
        });

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        NIF1.setBackground(new java.awt.Color(255, 255, 153));
        NIF1.setColumns(20);

        jLabel14.setText("DNI del voluntario actual");

        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        Obs.setColumns(20);
        Obs.setRows(5);
        Obs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ObsKeyTyped(evt);
            }
        });
        Observaciones_Datos_Personales_SB.setViewportView(Obs);

        Poblacion.setColumns(9);
        Poblacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PoblacionKeyTyped(evt);
            }
        });

        FechaNac.setColumns(9);
        FechaNac.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        FechaNac.setText("d/mm/aa");

        Domicilio.setColumns(30);
        Domicilio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DomicilioKeyTyped(evt);
            }
        });

        CodPost.setColumns(9);
        CodPost.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CodPostKeyTyped(evt);
            }
        });

        Nacionalidad.setColumns(30);
        Nacionalidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NacionalidadKeyTyped(evt);
            }
        });

        jLabel8.setText("Email");

        jLabel16.setText("Observaciones");

        Nombre.setColumns(20);
        Nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NombreKeyTyped(evt);
            }
        });

        jLabel5.setText("Apellidos");

        jLabel10.setText("Población");

        jLabel12.setText("Teléfono");

        Apellidos.setColumns(30);
        Apellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ApellidosKeyTyped(evt);
            }
        });

        jLabel9.setText("Domicilio");

        Email.setColumns(20);
        Email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                EmailKeyTyped(evt);
            }
        });

        jLabel4.setText("Nombre");

        jLabel13.setText("Codigo postal");

        jLabel7.setText("Nacionalidad");

        NIF.setColumns(9);
        NIF.setEditable(false);
        NIF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NIFKeyTyped(evt);
            }
        });

        Telefono.setColumns(9);
        Telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TelefonoKeyTyped(evt);
            }
        });

        jLabel6.setText("Fecha nacimiento");

        jLabel2.setText("NIF");

        FechaInicio.setColumns(9);
        FechaInicio.setEditable(false);
        FechaInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        FechaInicio.setText("d/mm/aa");

        jLabel11.setText("Fecha inicio");

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diaketas/Iconos/Voluntario.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel14)
                        .addGap(25, 25, 25)
                        .addComponent(NIF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(botonOK)
                        .addGap(54, 54, 54)
                        .addComponent(botonCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(930, 930, 930)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(18, 18, 18)
                                .addComponent(Observaciones_Datos_Personales_SB, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Nacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NIF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel9))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Domicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Poblacion, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CodPost, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(35, 35, 35)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(NIF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10)
                                .addComponent(Poblacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(Domicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(Apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(FechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel12)
                                .addComponent(Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(Nacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(CodPost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(Observaciones_Datos_Personales_SB, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NIF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonOK)
                        .addComponent(botonCancelar)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOKActionPerformed
        // TODO add your handling code here:
   
        
        ////////////////////////////////////////////////////////////////////////
        //compruebo los campos introducidos: 
        //->en los campos NOT NULL se pide que se introduzca el dato
        //->en los campos que pueden ser NULL, se introduce un 0 si es un int y "" si es un String
        //NIF1:NOT NULL 
        //NIF:NOT NULL
        //Nombre:NOT NULL
        //Apellidos:NULL
        //Poblacion:NULL
        //Email:NULL
        //Telefono:NULL
        //Nacionalidad:NOT NULL
        //Domicilio:NOT NULL
        //CodPost:NOT NULL
        //Obs:NULL
        
        //Fecha_Nacimiento: NOT NULL
        //Fecha_Inicio: NOT NULL
        
        boolean continuar=true;
        
        if (NIF1.getText().compareTo("") == 0)
        {
            JOptionPane.showMessageDialog(this, "El NIF del voluntario actual no se ha introducido.", "NIF Voluntario", JOptionPane.ERROR_MESSAGE);
            continuar = false;
        }
        else if (NIF.getText().compareTo("") == 0)
        {
            JOptionPane.showMessageDialog(this, "El NIF del Voluntario no se ha introducido.", "NIF Voluntario", JOptionPane.ERROR_MESSAGE);
            continuar = false;
        }
        else if (Nombre.getText().compareTo("") == 0)
        {
            JOptionPane.showMessageDialog(this, "El nombre del Voluntario no se ha introducido.", "Nombre Voluntario", JOptionPane.ERROR_MESSAGE);
            continuar = false;        
        }
        else if (Nacionalidad.getText().compareTo("") == 0)
        {
            JOptionPane.showMessageDialog(this, "La nacionalidad del Voluntario no se ha introducido.", "Nacionalidad Voluntario", JOptionPane.ERROR_MESSAGE);
            continuar = false;
        }
        else if (Domicilio.getText().compareTo("") == 0)
        {
            JOptionPane.showMessageDialog(this, "El domicilio no se ha introducido.", "Domicilio Voluntario", JOptionPane.ERROR_MESSAGE);
            continuar = false;
        }
        else if (CodPost.getText().compareTo("") == 0)
        {
            JOptionPane.showMessageDialog(this, "El codigo postal no se ha introducido.", "Codigo postal Voluntario", JOptionPane.ERROR_MESSAGE);
            continuar = false;
        }
        
        //si despues de todo esto, continuar==true, todos los datos se han introducido correctamente
        
        //ahora relleno los campos que el usuario se ha podido dejar sin rellenar
        if (Apellidos.getText().compareTo("") == 0)
        {
            Apellidos.setText("");
        }
        if (Poblacion.getText().compareTo("") == 0)
        {
            Poblacion.setText("");
        }
        if (Email.getText().compareTo("") == 0)
        {
            Email.setText("");
        }
        if (Obs.getText().compareTo("") == 0)
        {
            Obs.setText("");
        }

        //el telefono, lo comprobare a la hora de pasarselo como parametro a la funcion, si el campo esta vacio
        //le pasare un int 0 y si tiene algo, lo transformo a int

        //ahora compruebo si el formato del email, codigoPostal y telefono es el correcto
        if(continuar)
        {
            if ( !ValidarCampos.isInteger(CodPost.getText()) )
            {
                System.out.println("Codigo postal incorrecto\n");
                JOptionPane.showMessageDialog(this, "El codigo postal no es correcto. Debe ser un numero.", "Codigo postal Invalido", JOptionPane.ERROR_MESSAGE);
                continuar = false;
            }
            else if( !ValidarCampos.isEmail(Email.getText()) )
            {
                System.out.println("Email incorrecto\n");
                JOptionPane.showMessageDialog(this, "El email no es correcto.", "Email Invalido", JOptionPane.ERROR_MESSAGE);
                continuar = false;
            }
            
            else if( !ValidarCampos.isInteger(Telefono.getText()) )
            {
                System.out.println("Telefono incorrecto\n");
                JOptionPane.showMessageDialog(this, "El telefono no es correcto. Debe ser un numero.", "Telefono Invalido", JOptionPane.ERROR_MESSAGE);
                continuar = false;
            }
        }
        
        int telefonoPasado=0;
        
        if(continuar)
        {
            
            if( Telefono.getText().compareTo("")==0 )   //si me pasan una cadena vacia le paso un int=0
            {
                telefonoPasado = 0;
            }
            else
            {
                telefonoPasado = Integer.parseInt(Telefono.getText());
            }
        }
        
        if(continuar)   //si todos los datos se han introducido correctamente...
        {
        
            //Conversion de la fecha, hay que transformar FechaNac
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yy");

            Date Fecha_Nac = null;
            
            System.out.println("fecha nacimiento: "+FechaNac.getText());
            
            if ( FechaNac.getText().compareTo("d/mm/aa") != 0 && FechaNac.getText().compareTo("") != 0)   //si el campo fecha tiene escrito algo distinto de "d/mm/aa" y " "
            {

                try {
                    Fecha_Nac = formatoFecha.parse(FechaNac.getText());

                } catch (ParseException ex) {
                    Logger.getLogger(jAltaVoluntario.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(this, "Fecha de nacimiento incorrecta, utilice formato dd/MM/yy.", "Fecha de Nacimiento", JOptionPane.ERROR_MESSAGE);
                }
            }
            else     //si la fecha esta vacia...
            {
                JOptionPane.showMessageDialog(this, "No se ha introducido la fecha de nacimiento.", "Fecha de nacimiento", JOptionPane.ERROR_MESSAGE);
                continuar = false;
            }



            //llamo a la funcion que se va a encargar de hacer la modificacion del voluntario

            boolean exito=true;
            boolean existe_vol=false;
            if( continuar )   //si todos los datos introducidos son correctos, llamo a las funciones
            {

                //primero compruebo si el dni del voluntario actual existe en el sistema
                existe_vol = diaketas.diaketas.ong.gestorVoluntarios.comprobarExistenciaVoluntario((String)NIF1.getText().toUpperCase());

                if(existe_vol)
                {
                    
                    exito = diaketas.diaketas.ong.gestorVoluntarios.modificarVoluntario( (String)Nombre.getText(), (String)Apellidos.getText(), (String)NIF.getText().toUpperCase(), telefonoPasado, (String)Domicilio.getText(), (String)Poblacion.getText(), (String)Email.getText(), (String)Nacionalidad.getText(), Fecha_Nac, Integer.parseInt(CodPost.getText()), (String)Obs.getText(), (String)NIF1.getText().toUpperCase() );

                }
                else
                {
                    JOptionPane.showMessageDialog(this, "No se ha encontrado el DNI del voluntario actual.", "Error DNI voluntario", JOptionPane.ERROR_MESSAGE);
                    exito = false;
                }
            }



            if(exito &&  existe_vol && continuar)    //si la operacion se ha realizado con exito y se habian introducido todos los datos
            {
                //MODIFICACION VOLUNTARIO REALIZADA
                confirmarModificacion = new jConfirmarModificacion();
                UI.jPrincipal.remove(confirmarModificacion);
                UI.jPrincipal.add("ConfirmarModificacion", confirmarModificacion); 
                UI.cl.show(UI.jPrincipal, "ConfirmarModificacion");
       
            }
            else if(!exito)
            {
                JOptionPane.showMessageDialog(this, "No se ha podido realizar correctamente la modificacion.", "Error modificacion", JOptionPane.ERROR_MESSAGE);
            }
        
        }//continuar
        
        ////////////////////////////////////////////////////////////////////////
        
                    
           
           
            
    }//GEN-LAST:event_botonOKActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        // TODO add your handling code here:
        
        UI.cl.show(UI.jPrincipal, "Diaketas");

    }//GEN-LAST:event_botonCancelarActionPerformed

    private void ObsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ObsKeyTyped
        if (Obs.getText().length() == 250) {
            evt.consume();
        }
    }//GEN-LAST:event_ObsKeyTyped

    private void PoblacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PoblacionKeyTyped
        // TODO add your handling code here:
        if (Poblacion.getText().length() == 20) {
            evt.consume();
        }

    }//GEN-LAST:event_PoblacionKeyTyped

    private void DomicilioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DomicilioKeyTyped
        // TODO add your handling code here:
        if (Domicilio.getText().length() == 50) {
            evt.consume();
        }

    }//GEN-LAST:event_DomicilioKeyTyped

    private void CodPostKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CodPostKeyTyped
        // TODO add your handling code here:
        if (CodPost.getText().length() == 5) {
            evt.consume();
        }
    }//GEN-LAST:event_CodPostKeyTyped

    private void NacionalidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NacionalidadKeyTyped
        // TODO add your handling code here:

        if (Nacionalidad.getText().length() >= 20) {
            evt.consume();
        }
    }//GEN-LAST:event_NacionalidadKeyTyped

    private void NombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NombreKeyTyped
        // TODO add your handling code here:
        if (Nombre.getText().length() >= 20) {
            evt.consume();
        }
    }//GEN-LAST:event_NombreKeyTyped

    private void ApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ApellidosKeyTyped
        // TODO add your handling code here:
        if (Apellidos.getText().length() >= 30) {
            evt.consume();
        }
    }//GEN-LAST:event_ApellidosKeyTyped

    private void EmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EmailKeyTyped
        // TODO add your handling code here:
        if (Email.getText().length() == 30) {
            evt.consume();
        }
    }//GEN-LAST:event_EmailKeyTyped

    private void NIFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NIFKeyTyped
        // TODO add your handling code here:

        if (NIF.getText().length() >= 9) {
            evt.consume();
        }
    }//GEN-LAST:event_NIFKeyTyped

    private void TelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TelefonoKeyTyped
        // TODO add your handling code here:
        if (Telefono.getText().length() == 9) {
            evt.consume();
        }
    }//GEN-LAST:event_TelefonoKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Apellidos;
    private javax.swing.JTextField CodPost;
    private javax.swing.JTextField Domicilio;
    private javax.swing.JTextField Email;
    private javax.swing.JFormattedTextField FechaInicio;
    private javax.swing.JFormattedTextField FechaNac;
    private javax.swing.JTextField NIF;
    private javax.swing.JTextField NIF1;
    private javax.swing.JTextField Nacionalidad;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextArea Obs;
    private javax.swing.JScrollPane Observaciones_Datos_Personales_SB;
    private javax.swing.JTextField Poblacion;
    private javax.swing.JTextField Telefono;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonOK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
