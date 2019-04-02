/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package porrainterfaz;

import java.util.ArrayList;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Catalin 'uNKoLL' Ciurcanu
 */
public class Porra extends javax.swing.JFrame {
    private ArrayList<Apuesta> vApuestas;
    /**
     * Creates new form Porra
     */
    public Porra() {
        initComponents();
        texto_equipo1.setText("");
        texto_equipo2.setText("");
        vApuestas = new ArrayList<Apuesta>();
        sacarAleatorio();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        panel_principal = new javax.swing.JPanel();
        label_equipos = new javax.swing.JLabel();
        label_local = new javax.swing.JLabel();
        label_visitante = new javax.swing.JLabel();
        textField_local = new javax.swing.JTextField();
        textField_visitante = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        label_nombreApostante = new javax.swing.JLabel();
        label_apuesta = new javax.swing.JLabel();
        textField_nombre = new javax.swing.JTextField();
        score_1 = new javax.swing.JTextField();
        score_2 = new javax.swing.JTextField();
        label_separador = new javax.swing.JLabel();
        checkbox_pagado = new javax.swing.JCheckBox();
        btn_apuesta = new javax.swing.JButton();
        panel_estatico = new javax.swing.JPanel();
        jSeparator4 = new javax.swing.JSeparator();
        label_resultado = new javax.swing.JLabel();
        label_guion = new javax.swing.JLabel();
        resultado_equipo1 = new javax.swing.JLabel();
        resultado_equipo2 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea_resultados = new javax.swing.JTextArea();
        texto_equipo1 = new javax.swing.JLabel();
        texto_equipo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_principal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        label_equipos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label_equipos.setText("EQUIPOS");

        label_local.setText("Equipo Local:");

        label_visitante.setText("Equipo Visitante:");

        textField_local.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textField_localFocusLost(evt);
            }
        });
        textField_local.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField_localActionPerformed(evt);
            }
        });

        textField_visitante.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textField_visitanteFocusLost(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Apuestas");

        label_nombreApostante.setText("Nombre:");

        label_apuesta.setText("Apuesta:");

        label_separador.setText("-");

        checkbox_pagado.setText("Pagado");
        checkbox_pagado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkbox_pagadoActionPerformed(evt);
            }
        });

        btn_apuesta.setText("Añadir Apostante");
        btn_apuesta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_apuestaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel_principalLayout = new javax.swing.GroupLayout(panel_principal);
        panel_principal.setLayout(panel_principalLayout);
        panel_principalLayout.setHorizontalGroup(
            panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_principalLayout.createSequentialGroup()
                .addGroup(panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_principalLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(label_equipos)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panel_principalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_principalLayout.createSequentialGroup()
                                .addGroup(panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_nombreApostante)
                                    .addGroup(panel_principalLayout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel1))
                                    .addComponent(label_apuesta))
                                .addGap(25, 25, 25)
                                .addGroup(panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_apuesta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textField_nombre)
                                    .addGroup(panel_principalLayout.createSequentialGroup()
                                        .addGroup(panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(score_1)
                                            .addComponent(checkbox_pagado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(27, 27, 27)
                                        .addComponent(label_separador)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                        .addComponent(score_2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_principalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_local)
                            .addComponent(label_visitante))
                        .addGap(22, 22, 22)
                        .addGroup(panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textField_local)
                            .addComponent(textField_visitante))))
                .addContainerGap())
        );
        panel_principalLayout.setVerticalGroup(
            panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_principalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_equipos)
                .addGap(3, 3, 3)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_local)
                    .addComponent(textField_local, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_visitante)
                    .addComponent(textField_visitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_nombreApostante)
                    .addComponent(textField_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_apuesta)
                    .addGroup(panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(score_1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(score_2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(label_separador)))
                .addGap(18, 18, 18)
                .addComponent(checkbox_pagado)
                .addGap(18, 18, 18)
                .addComponent(btn_apuesta)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        label_resultado.setText("Resultado:");

        label_guion.setText("-");

        resultado_equipo1.setText("0");

        resultado_equipo2.setText("3");

        jToggleButton1.setText("Comprobar Apuestas");
        jToggleButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton1MouseClicked(evt);
            }
        });

        textArea_resultados.setColumns(20);
        textArea_resultados.setRows(5);
        jScrollPane1.setViewportView(textArea_resultados);

        texto_equipo1.setText("EQUIPO 1");

        texto_equipo2.setText("EQUIPO 2");

        javax.swing.GroupLayout panel_estaticoLayout = new javax.swing.GroupLayout(panel_estatico);
        panel_estatico.setLayout(panel_estaticoLayout);
        panel_estaticoLayout.setHorizontalGroup(
            panel_estaticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_estaticoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator4)
                .addContainerGap())
            .addGroup(panel_estaticoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToggleButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panel_estaticoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(panel_estaticoLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(resultado_equipo1)
                .addGap(90, 90, 90)
                .addComponent(label_guion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addComponent(resultado_equipo2)
                .addGap(43, 43, 43))
            .addGroup(panel_estaticoLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(label_resultado)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_estaticoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(texto_equipo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(texto_equipo2)
                .addGap(31, 31, 31))
        );
        panel_estaticoLayout.setVerticalGroup(
            panel_estaticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_estaticoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panel_estaticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(texto_equipo1)
                    .addComponent(texto_equipo2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label_resultado)
                .addGap(13, 13, 13)
                .addGroup(panel_estaticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resultado_equipo1)
                    .addComponent(label_guion)
                    .addComponent(resultado_equipo2))
                .addGap(18, 18, 18)
                .addComponent(jToggleButton1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_estatico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panel_estatico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void textField_localActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void checkbox_pagadoActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void textField_localFocusLost(java.awt.event.FocusEvent evt) {                                          
        texto_equipo1.setText(textField_local.getText());
        if(!(texto_equipo1.getText().equals(""))){
            textField_local.setEnabled(false);
        }
    }                                         

    private void textField_visitanteFocusLost(java.awt.event.FocusEvent evt) {                                              
        texto_equipo2.setText(textField_visitante.getText());
        if(!(texto_equipo2.getText().equals(""))){
            textField_visitante.setEnabled(false);
        }
    }                                             

    private void btn_apuestaMouseClicked(java.awt.event.MouseEvent evt) {                                         
        //AÑADIR APUESTA
        //score_2.getText();
        
        Pattern puntuacion = Pattern.compile("[0-9][0-9]?");
        Matcher equipo1 = puntuacion.matcher(String.valueOf(score_1.getText()));
        Matcher equipo2 = puntuacion.matcher(String.valueOf(score_2.getText()));
        if(!equipo1.matches() || !equipo2.matches()){
            score_1.setText("");
            score_2.setText("");
            JOptionPane.showMessageDialog(rootPane, "Puntuación introducida erroneamente");
        }else{
            vApuestas.add(new Apuesta(Integer.valueOf(score_1.getText()), Integer.valueOf(score_2.getText()), textField_nombre.getText(), checkbox_pagado.isSelected()));
        }
        textArea_resultados.setText(recorrerArray());
    }                                        

    private void jToggleButton1MouseClicked(java.awt.event.MouseEvent evt) {                                            
        comprobarApuesta();
    }                                           
    
    private void comprobarApuesta(){
        int equipo1 = Integer.valueOf(resultado_equipo1.getText());
        int equipo2 = Integer.valueOf(resultado_equipo2.getText());
        int victoria=0;
        String ganadores="";
        for (Apuesta apuesta : vApuestas) {
            if(apuesta.getLocal()==equipo1 && apuesta.getVisitante()==equipo2){
                ganadores += apuesta.toString();
                victoria++;
            }
        }
        
        textArea_resultados.setText("Tenemos: "+victoria+" Ganadores !!!\n"+ganadores);
    }
    
    private String recorrerArray(){
        String texto="";
        for (Apuesta apuesta : vApuestas) {
            texto += apuesta.toString();
        }
        return texto;
    }
    
    private void sacarAleatorio(){
        Random r = new Random();
        resultado_equipo1.setText(String.valueOf(r.nextInt(9)));
        resultado_equipo2.setText(String.valueOf(r.nextInt(9)));
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(Porra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Porra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Porra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Porra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Porra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btn_apuesta;
    private javax.swing.JCheckBox checkbox_pagado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel label_apuesta;
    private javax.swing.JLabel label_equipos;
    private javax.swing.JLabel label_guion;
    private javax.swing.JLabel label_local;
    private javax.swing.JLabel label_nombreApostante;
    private javax.swing.JLabel label_resultado;
    private javax.swing.JLabel label_separador;
    private javax.swing.JLabel label_visitante;
    private javax.swing.JPanel panel_estatico;
    private javax.swing.JPanel panel_principal;
    private javax.swing.JLabel resultado_equipo1;
    private javax.swing.JLabel resultado_equipo2;
    private javax.swing.JTextField score_1;
    private javax.swing.JTextField score_2;
    private javax.swing.JTextArea textArea_resultados;
    private javax.swing.JTextField textField_local;
    private javax.swing.JTextField textField_nombre;
    private javax.swing.JTextField textField_visitante;
    private javax.swing.JLabel texto_equipo1;
    private javax.swing.JLabel texto_equipo2;
    // End of variables declaration                   
}
