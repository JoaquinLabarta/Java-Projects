package igu;

public class Pantalla extends javax.swing.JFrame {
    public Pantalla() {
        initComponents();
        initializeVectors();
    }

    private void initializeVectors() {
        for (int i = 0; i < DIMF; i++) {
            vecName[i] = "";
            vecLastName[i] = "";
            vecDay[i] = "";
            vecPhone[i] = 0;
            vecDni[i] = 0;
            vecAddress[i] = "";
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        lastnameLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        lastnameTextField = new javax.swing.JTextField();
        dniLabel = new javax.swing.JLabel();
        dniTextField = new javax.swing.JTextField();
        phoneLabel = new javax.swing.JLabel();
        dayTextField = new javax.swing.JTextField();
        phoneTextField = new javax.swing.JTextField();
        addressLabel = new javax.swing.JLabel();
        addressTextField = new javax.swing.JTextField();
        dayLabel = new javax.swing.JLabel();
        uploadButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        countTextField = new javax.swing.JTextField();
        afterButton = new javax.swing.JButton();
        beforeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titulo.setFont(new java.awt.Font("Monospaced", 2, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(153, 102, 255));
        titulo.setText("Agenda Electronica");

        nameLabel.setText("Nombre de la persona");

        lastnameLabel.setText("Apellido de la persona");

        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });

        lastnameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnameTextFieldActionPerformed(evt);
            }
        });

        dniLabel.setText("Dni de la persona");

        dniTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dniTextFieldActionPerformed(evt);
            }
        });

        phoneLabel.setText("Telefono de la persona");

        dayTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayTextFieldActionPerformed(evt);
            }
        });

        phoneTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneTextFieldActionPerformed(evt);
            }
        });

        addressLabel.setText("Domicilio de la persona");

        addressTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTextFieldActionPerformed(evt);
            }
        });

        dayLabel.setText("Fecha de nacimiento de la persona");

        uploadButton.setText("Cargar");
        uploadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Indice");

        countTextField.setText("0");
        countTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countTextFieldActionPerformed(evt);
            }
        });

        afterButton.setText("After");
        afterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                afterButtonActionPerformed(evt);
            }
        });

        beforeButton.setText("Before");
        beforeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beforeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(153, 153, 153))
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dniTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addComponent(lastnameTextField)
                    .addComponent(lastnameLabel)
                    .addComponent(nameLabel)
                    .addComponent(dniLabel)
                    .addComponent(nameTextField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addressTextField)
                    .addComponent(phoneTextField)
                    .addComponent(phoneLabel)
                    .addComponent(dayLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addressLabel)
                    .addComponent(dayTextField))
                .addGap(27, 27, 27))
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(beforeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(countTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(uploadButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(afterButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(nameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lastnameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lastnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dniLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dniTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(dayLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(phoneLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addressLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uploadButton)
                    .addComponent(afterButton)
                    .addComponent(beforeButton))
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(countTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed

    }//GEN-LAST:event_nameTextFieldActionPerformed

    private void dayTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayTextFieldActionPerformed

    }//GEN-LAST:event_dayTextFieldActionPerformed

    private void uploadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadButtonActionPerformed
        String name = nameTextField.getText();
        String lastname = lastnameTextField.getText();
        int dni = Integer.parseInt(dniTextField.getText());
        long phone = Long.parseLong(phoneTextField.getText());
        String address = addressTextField.getText();
        String day = dayTextField.getText();
        int indice = Integer.parseInt(countTextField.getText());
        if (DIML < DIMF) {
            vecName[indice] = name;
            vecLastName[indice] = lastname;
            vecDni[indice] = dni;
            vecDay[indice] = day;
            vecPhone[indice] = phone;
            vecAddress[indice] = address;
            DIML++;
        }
        countTextField.setText(Integer.toString(DIML));
        nameTextField.setText("");
        lastnameTextField.setText("");
        dniTextField.setText("");
        dayTextField.setText("");
        phoneTextField.setText("");
        addressTextField.setText("");        
    }//GEN-LAST:event_uploadButtonActionPerformed

    private void lastnameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameTextFieldActionPerformed

    }//GEN-LAST:event_lastnameTextFieldActionPerformed

    private void dniTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dniTextFieldActionPerformed

    }//GEN-LAST:event_dniTextFieldActionPerformed

    private void phoneTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneTextFieldActionPerformed

    }//GEN-LAST:event_phoneTextFieldActionPerformed

    private void addressTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTextFieldActionPerformed

    }//GEN-LAST:event_addressTextFieldActionPerformed

    private void countTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countTextFieldActionPerformed
        
    }//GEN-LAST:event_countTextFieldActionPerformed

    private void beforeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beforeButtonActionPerformed
        int indice = Integer.parseInt(countTextField.getText());
        if(indice > 0){
            indice--;
            updateText(indice);
            countTextField.setText(Integer.toString(indice));
        }
    }//GEN-LAST:event_beforeButtonActionPerformed

    private void afterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_afterButtonActionPerformed
        int indice = Integer.parseInt(countTextField.getText());
        if(indice < DIMF){
            indice++;
            updateText(indice);
            countTextField.setText(Integer.toString(indice));
        }  
    }//GEN-LAST:event_afterButtonActionPerformed

    private void updateText(int indice){
        nameTextField.setText(vecName[indice]);
        dayTextField.setText(vecDay[indice]);
        lastnameTextField.setText(vecLastName[indice]);
        dniTextField.setText(Integer.toString(vecDni[indice]));
        phoneTextField.setText(Long.toString(vecPhone[indice]));
        addressTextField.setText(vecAddress[indice]);
    }
    
private final int DIMF = 3;
private int DIML = 0;
private String[] vecName = new String[DIMF];
private String[] vecLastName = new String[DIMF];
private String[] vecDay = new String[DIMF];
private long[] vecPhone = new long[DIMF];
private int[] vecDni = new int[DIMF];
private String[] vecAddress = new String[DIMF];        
        
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField addressTextField;
    private javax.swing.JButton afterButton;
    private javax.swing.JButton beforeButton;
    private javax.swing.JTextField countTextField;
    private javax.swing.JLabel dayLabel;
    private javax.swing.JTextField dayTextField;
    private javax.swing.JLabel dniLabel;
    private javax.swing.JTextField dniTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lastnameLabel;
    private javax.swing.JTextField lastnameTextField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JLabel titulo;
    private javax.swing.JButton uploadButton;
    // End of variables declaration//GEN-END:variables
}
