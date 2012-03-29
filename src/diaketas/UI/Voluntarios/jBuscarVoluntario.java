/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package diaketas.UI.Voluntarios;

import diaketas.Modelo.Gestores.Gestor_de_voluntarios;
import diaketas.UI.UI;
import diaketas.Modelo.ONG.ONG;
import diaketas.Modelo.ONG.Voluntario;
import javax.swing.JOptionPane;

/**
 *
 * @author cesar
 */
public class jBuscarVoluntario extends javax.swing.JPanel {

    /*Si true, redirige a consultar
     * Si false, redirige a modificar
     */
    private boolean consultar_modificar;
    jConsultarVoluntario consultarVoluntario;
    jModificarVoluntario modificarVoluntario;

    
    /**
     * Creates new form jBuscarBeneficiario
     */
    public jBuscarVoluntario() {
        initComponents();
    }

    public void modificar(){
        consultar_modificar = false;
    }
    
    public void consultar(){
        consultar_modificar = true;
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
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        NIF = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Voluntarios");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Buscar Voluntario por NIF");

        jLabel2.setText("NIF");

        NIF.setColumns(9);

        jButton1.setText("Consultar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel3)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(41, 41, 41)
                                                .addComponent(NIF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(149, 149, 149))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(jButton1)))
                        .addGap(0, 182, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(NIF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(272, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (NIF.getText().compareTo("") == 0){
                JOptionPane.showMessageDialog(this, "El NIF del voluntario a buscar no se ha introducido.", "NIF Voluntario", JOptionPane.ERROR_MESSAGE);
        }
        else
        {

            //Consulto los datos del voluntario introducido
            Voluntario v = diaketas.diaketas.gestorVoluntarios.consultarVoluntario(NIF.getText().toUpperCase());
            
            if(v==null)
            {
                JOptionPane.showMessageDialog(this, "No se ha encontrado ningún voluntario con ese NIF.",
                    "NIF Voluntario", JOptionPane.ERROR_MESSAGE); 
            }
            else
            {
                //si ha encontrado un voluntario con ese NIF...

                if (consultar_modificar)    //Si habia pulsado la opcion de consultar voluntario...
                {
                    consultarVoluntario = new jConsultarVoluntario( v );
                    UI.jPrincipal.remove(consultarVoluntario);
                    UI.jPrincipal.add("ConsultarVoluntario", consultarVoluntario); 
                    UI.cl.show(UI.jPrincipal, "ConsultarVoluntario");
                }
                else    //Si habia pulsado la opcion de modificar voluntario...
                {
                    //llamo al jPanel de modificarVoluntario pasandole como argumento el objeto voluntario encontrado
                    modificarVoluntario = new jModificarVoluntario( v );
                    
                    UI.jPrincipal.remove(modificarVoluntario);
                    UI.jPrincipal.add("ModificarVoluntario", modificarVoluntario); 

                    

                    UI.cl.show(UI.jPrincipal, "ModificarVoluntario");  
                }
                // TODO add your handling code here:
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NIF;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
