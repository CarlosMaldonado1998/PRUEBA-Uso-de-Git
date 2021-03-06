package pryfraccion.CapaInterfaz;

import javax.swing.JOptionPane;
import pryfraccion.CapaNegocio.ClsFraccion;

public class WinFraccion extends javax.swing.JFrame {
    //ATRIBUTOS 
   int num, den;
   ClsFraccion frac1, frac2;
   int opcion;
   
    public WinFraccion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnNumerador = new javax.swing.JButton();
        BtnDenominador = new javax.swing.JButton();
        BtnResta = new javax.swing.JButton();
        BtnDivision = new javax.swing.JButton();
        BtnSuma = new javax.swing.JButton();
        BtnMultiplicacion = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        BtnLimpiar = new javax.swing.JButton();
        BtnIgual = new javax.swing.JButton();
        BtnInverso = new javax.swing.JButton();
        BtnValor = new javax.swing.JButton();
        txtPantalla = new javax.swing.JTextField();
        BtnInformación = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora de Fracciones");
        setBackground(new java.awt.Color(204, 255, 153));

        BtnNumerador.setBackground(new java.awt.Color(0, 153, 153));
        BtnNumerador.setText("Numerador");
        BtnNumerador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNumeradorActionPerformed(evt);
            }
        });

        BtnDenominador.setBackground(new java.awt.Color(0, 153, 153));
        BtnDenominador.setText("Denominador");
        BtnDenominador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDenominadorActionPerformed(evt);
            }
        });

        BtnResta.setBackground(new java.awt.Color(0, 153, 153));
        BtnResta.setText("-");
        BtnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRestaActionPerformed(evt);
            }
        });

        BtnDivision.setBackground(new java.awt.Color(0, 153, 153));
        BtnDivision.setText("/");
        BtnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDivisionActionPerformed(evt);
            }
        });

        BtnSuma.setBackground(new java.awt.Color(0, 153, 153));
        BtnSuma.setText("+");
        BtnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSumaActionPerformed(evt);
            }
        });

        BtnMultiplicacion.setBackground(new java.awt.Color(0, 153, 153));
        BtnMultiplicacion.setText("*");
        BtnMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMultiplicacionActionPerformed(evt);
            }
        });

        BtnSalir.setBackground(new java.awt.Color(0, 153, 153));
        BtnSalir.setText("SALIR");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        BtnLimpiar.setBackground(new java.awt.Color(0, 153, 153));
        BtnLimpiar.setText("LIMPIAR");
        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarActionPerformed(evt);
            }
        });

        BtnIgual.setBackground(new java.awt.Color(0, 153, 153));
        BtnIgual.setText("=");
        BtnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIgualActionPerformed(evt);
            }
        });

        BtnInverso.setBackground(new java.awt.Color(0, 153, 153));
        BtnInverso.setText("1 / n");
        BtnInverso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInversoActionPerformed(evt);
            }
        });

        BtnValor.setBackground(new java.awt.Color(0, 153, 153));
        BtnValor.setText("VALOR");
        BtnValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnValorActionPerformed(evt);
            }
        });

        txtPantalla.setBackground(new java.awt.Color(153, 255, 255));
        txtPantalla.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        txtPantalla.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPantalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPantallaActionPerformed(evt);
            }
        });

        BtnInformación.setForeground(new java.awt.Color(0, 51, 153));
        BtnInformación.setText("Información");
        BtnInformación.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInformaciónActionPerformed(evt);
            }
        });

        jMenuBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuBar1.setForeground(new java.awt.Color(255, 0, 0));

        jMenu1.setText("About");

        jMenuItem1.setText("Informacion ");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnNumerador, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(BtnDenominador, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnMultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtnDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BtnValor, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BtnIgual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtnResta, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BtnInverso, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(txtPantalla))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(BtnInformación)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnNumerador, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnDenominador, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnResta, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnInverso, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnMultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnValor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(BtnInformación, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnDenominadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDenominadorActionPerformed
        den = Integer.parseInt(txtPantalla.getText().trim());
        frac2 = new ClsFraccion(num,den);
        txtPantalla.setText(frac2.ver());
        txtPantalla.requestFocus();
    }//GEN-LAST:event_BtnDenominadorActionPerformed

    private void txtPantallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPantallaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPantallaActionPerformed

    private void BtnNumeradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNumeradorActionPerformed
        num = Integer.parseInt(txtPantalla.getText().trim());
        txtPantalla.setText(" ");
        txtPantalla.requestFocus();
    }//GEN-LAST:event_BtnNumeradorActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed
        txtPantalla.setText(" ");
        txtPantalla.requestFocus();
    }//GEN-LAST:event_BtnLimpiarActionPerformed

    private void BtnInversoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInversoActionPerformed
        frac2.inverso();
        txtPantalla.setText(frac2.ver());
        txtPantalla.requestFocus();
    }//GEN-LAST:event_BtnInversoActionPerformed

    private void BtnValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnValorActionPerformed
        txtPantalla.setText(String.valueOf(frac2.Valor()));
        txtPantalla.requestFocus();
    }//GEN-LAST:event_BtnValorActionPerformed

    private void BtnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSumaActionPerformed
        frac1 = new ClsFraccion(frac2);
        txtPantalla.setText(" ");
        txtPantalla.requestFocus();
        opcion = 1;
    }//GEN-LAST:event_BtnSumaActionPerformed

    private void BtnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRestaActionPerformed
        frac1 = new ClsFraccion(frac2);
        txtPantalla.setText(" ");
        txtPantalla.requestFocus();
        opcion = 2;
    }//GEN-LAST:event_BtnRestaActionPerformed

    private void BtnMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMultiplicacionActionPerformed
        frac1 = new ClsFraccion(frac2);
        txtPantalla.setText(" ");
        txtPantalla.requestFocus();
        opcion = 3;
    }//GEN-LAST:event_BtnMultiplicacionActionPerformed

    private void BtnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDivisionActionPerformed
        frac1 = new ClsFraccion(frac2);
        txtPantalla.setText(" ");
        txtPantalla.requestFocus();
        opcion = 4;
    }//GEN-LAST:event_BtnDivisionActionPerformed

    private void BtnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIgualActionPerformed
        switch(opcion){
            case 1:
                frac2 = frac1.suma(frac2);
                break;
            case 2:
                frac2 = frac1.resta(frac2);
                break;
            case 3:
                frac2 = frac1.multiplicacion(frac2);
                break;
            case 4:
                frac2 = frac1.division(frac2);
                break;
        }
        txtPantalla.setText(frac2.ver());
    }//GEN-LAST:event_BtnIgualActionPerformed

    private void BtnInformaciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInformaciónActionPerformed
        txtPantalla.setText("Este mensaje se ha comentado con add .");
    }//GEN-LAST:event_BtnInformaciónActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JOptionPane.showMessageDialog(null, "Creado por Carlos Maldonado"
                + " version 1.01.01.00");
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnDenominador;
    private javax.swing.JButton BtnDivision;
    private javax.swing.JButton BtnIgual;
    private javax.swing.JButton BtnInformación;
    private javax.swing.JButton BtnInverso;
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JButton BtnMultiplicacion;
    private javax.swing.JButton BtnNumerador;
    private javax.swing.JButton BtnResta;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JButton BtnSuma;
    private javax.swing.JButton BtnValor;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JTextField txtPantalla;
    // End of variables declaration//GEN-END:variables
}
