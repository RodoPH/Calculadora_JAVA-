public class Calcula extends javax.swing.JFrame {
    
    String txt1,signo,txt2;
    
    public Calcula() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtPantalla = new javax.swing.JLabel();
        btnNum1 = new javax.swing.JButton();
        btnNum2 = new javax.swing.JButton();
        btnNum3 = new javax.swing.JButton();
        btnNum4 = new javax.swing.JButton();
        btnNum5 = new javax.swing.JButton();
        btnNum6 = new javax.swing.JButton();
        btnNum7 = new javax.swing.JButton();
        btnNum9 = new javax.swing.JButton();
        btnNum0 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        btnPor = new javax.swing.JButton();
        btnCuadrado = new javax.swing.JButton();
        btnPunto = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtPantalla.setBackground(new java.awt.Color(102, 102, 255));
        txtPantalla.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        txtPantalla.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtPantalla.setText("0");
        txtPantalla.setVerifyInputWhenFocusTarget(false);

        btnNum1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnNum1.setText("1");
        btnNum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum1ActionPerformed(evt);
            }
        });

        btnNum2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnNum2.setText("2");
        btnNum2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum1ActionPerformed(evt);
            }
        });

        btnNum3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnNum3.setText("3");
        btnNum3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum1ActionPerformed(evt);
            }
        });

        btnNum4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnNum4.setText("4");
        btnNum4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum1ActionPerformed(evt);
            }
        });

        btnNum5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnNum5.setText("5");
        btnNum5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum1ActionPerformed(evt);
            }
        });

        btnNum6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnNum6.setText("6");
        btnNum6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum1ActionPerformed(evt);
            }
        });

        btnNum7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnNum7.setText("7");
        btnNum7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum1ActionPerformed(evt);
            }
        });

        btnNum9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnNum9.setText("9");
        btnNum9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum1ActionPerformed(evt);
            }
        });

        btnNum0.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnNum0.setText("0");
        btnNum0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum1ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton10.setText("+");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton11.setText("-");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton12.setText("/");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        btnPor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnPor.setText("*");
        btnPor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPorActionPerformed(evt);
            }
        });

        btnCuadrado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCuadrado.setText("^2");
        btnCuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuadradoActionPerformed(evt);
            }
        });

        btnPunto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnPunto.setText(".");
        btnPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuntoActionPerformed(evt);
            }
        });

        btnIgual.setText("=");
        btnIgual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIgualMouseEntered(evt);
            }
        });
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });

        btnBorrar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBorrar.setText("C");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnNum4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnNum5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                                            .addComponent(btnNum1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnNum2, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                                            .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnNum6, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                                    .addComponent(btnNum3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnNum7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnPunto)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnNum9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnNum0, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCuadrado)
                                    .addComponent(btnPor, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBorrar)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(txtPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton10)
                            .addComponent(jButton11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNum1)
                            .addComponent(btnNum2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNum4)
                            .addComponent(btnNum5)
                            .addComponent(btnNum6)
                            .addComponent(btnCuadrado, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNum7)
                            .addComponent(btnNum9)
                            .addComponent(btnNum0))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 16, Short.MAX_VALUE)
                        .addComponent(btnPunto))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton12)
                            .addComponent(btnBorrar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNum3)
                            .addComponent(btnPor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        jButton12.setToolTipText("División");
       
        if(!txtPantalla.getText().equals("")){
        txt1 = txtPantalla.getText();
        signo = "/";
        txtPantalla.setText("");
    }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
        btnIgual.setToolTipText("Mostrar resultado");
        
        String resultado;
        txt2 = txtPantalla.getText();
        if(!txt2.equals("")){
            resultado = calcula(txt1,txt2,signo);
            txtPantalla.setText(resultado);
        }
    }//GEN-LAST:event_btnIgualActionPerformed
    
    public String calcula(String m1,String m2,String signo){
        Double resultado = 0.0;
        String respuesta;
        if(signo.equals("-")){
            resultado = Double.parseDouble(txt1) - Double.parseDouble(txt2);
        }
        if(signo.equals("*")){
            resultado = Double.parseDouble(txt1) * Double.parseDouble(txt2);
        }
        
        if(signo.equals("/")){
            
          resultado = Double.parseDouble(txt1) / Double.parseDouble(txt2);
            
        }
        if(signo.equals("+")){
            resultado = Double.parseDouble(txt1) + Double.parseDouble(txt2);
        }
            respuesta = resultado.toString();
            return respuesta;
    }
    private void btnNum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum1ActionPerformed
      
        if("0".equals(txtPantalla.getText()))
            txtPantalla.setText("");
       javax.swing.JButton source = (javax.swing.JButton)evt.getSource();
       Integer X = Integer.parseInt(source.getText());
       txtPantalla.setText(txtPantalla.getText() + X.toString());
       
    }//GEN-LAST:event_btnNum1ActionPerformed

    private void btnPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntoActionPerformed
        String cadena = txtPantalla.getText();
        if (cadena.length()<=0){
            txtPantalla.setText("0.");
        }else
        {
            if(!punto(txtPantalla.getText())){
                txtPantalla.setText(txtPantalla.getText() + ".");
            }
        }
        
    }//GEN-LAST:event_btnPuntoActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
         btnBorrar.setToolTipText("Borrar");
        String cadena = txtPantalla.getText();
        if(cadena.length()> 0){
            cadena =cadena.substring(0,cadena.length()-1);
            txtPantalla.setText(cadena);
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
         jButton10.setToolTipText("Suma");
        if(!txtPantalla.getText().equals("")){
        txt1 = txtPantalla.getText();
        signo = "+";
        txtPantalla.setText("");
    }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
         jButton11.setToolTipText("Resta");
         
        if(!txtPantalla.getText().equals("")){
        txt1= txtPantalla.getText();
        signo = "-";
        txtPantalla.setText("");
    }    }//GEN-LAST:event_jButton11ActionPerformed

    private void btnPorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPorActionPerformed
        btnPor.setToolTipText("Multiplicación");
        if(!txtPantalla.getText().equals("")){
        txt1 = txtPantalla.getText();
        signo = "*";
        txtPantalla.setText("");
    }    }//GEN-LAST:event_btnPorActionPerformed

    private void btnCuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuadradoActionPerformed
      
        btnCuadrado.setToolTipText("Elevar al cuadrado");
        
        if(!txtPantalla.getText().equals("")){
        double cuadra;
        txt1 = txtPantalla.getText();
        cuadra = Double.parseDouble(txt1);
        cuadra = cuadra*cuadra;
        txtPantalla.setText(Double.toString(cuadra));
    }    }//GEN-LAST:event_btnCuadradoActionPerformed

    private void btnIgualMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIgualMouseEntered
     
        btnIgual.setToolTipText("Mostrar resultado");
    }//GEN-LAST:event_btnIgualMouseEntered
    public boolean punto (String cadena){
        boolean resultado = false;
        for(int i = 0; i<cadena.length();i++){
            if (cadena.substring(i,i+1).equals(".")){
                resultado=true;
                break;
            }
        }
        return resultado;
    }
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Calcula().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCuadrado;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnNum0;
    private javax.swing.JButton btnNum1;
    private javax.swing.JButton btnNum2;
    private javax.swing.JButton btnNum3;
    private javax.swing.JButton btnNum4;
    private javax.swing.JButton btnNum5;
    private javax.swing.JButton btnNum6;
    private javax.swing.JButton btnNum7;
    private javax.swing.JButton btnNum9;
    private javax.swing.JButton btnPor;
    private javax.swing.JButton btnPunto;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtPantalla;
    // End of variables declaration//GEN-END:variables
}
