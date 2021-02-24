package View;
import java.awt.Color;
import javax.swing.JFrame;
import Controllers.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
 public class NewAccountUI extends javax.swing.JFrame {

    public NewAccountUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createNewAccLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        accountDetailsLabel = new javax.swing.JLabel();
        fullNameLabel = new javax.swing.JLabel();
        fullNameField = new javax.swing.JTextField();
        amLabel = new javax.swing.JLabel();
        amField = new javax.swing.JTextField();
        semesterLabel = new javax.swing.JLabel();
        createAccountBtn = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        semesterSpinner = new javax.swing.JSpinner();
        haveAccLabel = new javax.swing.JLabel();
        passwdLabel = new javax.swing.JLabel();
        confirmPasswdLabel = new javax.swing.JLabel();
        passwdField = new javax.swing.JPasswordField();
        confirmPasswdField = new javax.swing.JPasswordField();
        loginBtn = new javax.swing.JButton();
        photoLabel = new javax.swing.JLabel();
        fullNameOK = new javax.swing.JLabel();
        amOK = new javax.swing.JLabel();
        passwdOK = new javax.swing.JLabel();
        confirmPasswdOK = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        generatedUsernameField = new javax.swing.JTextField();
        errorTextLabel = new javax.swing.JLabel();
        onOK = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        createNewAccLabel.setFont(new java.awt.Font("Bookman Old Style", 0, 16)); // NOI18N
        createNewAccLabel.setText("Δημιουργία Νέου Λογαριασμού");
        createNewAccLabel.setToolTipText("");

        accountDetailsLabel.setFont(new java.awt.Font("Bookman Old Style", 0, 16)); // NOI18N
        accountDetailsLabel.setText("Στοιχεία Λογαριασμού Φοιτητή");

        fullNameLabel.setFont(new java.awt.Font("Bookman Old Style", 0, 16)); // NOI18N
        fullNameLabel.setText("Ονοματεπώνυμο:");

        fullNameField.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        fullNameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fullNameFieldFocusLost(evt);
            }
        });

        amLabel.setFont(new java.awt.Font("Bookman Old Style", 0, 16)); // NOI18N
        amLabel.setText("Αριθμός Μητρώου:");

        amField.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        amField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                amFieldFocusLost(evt);
            }
        });
        amField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                amFieldKeyTyped(evt);
            }
        });

        semesterLabel.setFont(new java.awt.Font("Bookman Old Style", 0, 16)); // NOI18N
        semesterLabel.setText("Εξάμηνο:");

        createAccountBtn.setFont(new java.awt.Font("Bookman Old Style", 1, 16)); // NOI18N
        createAccountBtn.setText("Δημουργία Λογαριασμού");
        createAccountBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAccountBtnActionPerformed(evt);
            }
        });

        semesterSpinner.setFont(new java.awt.Font("Bookman Old Style", 0, 16)); // NOI18N
        semesterSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 16, 1));

        haveAccLabel.setFont(new java.awt.Font("Bookman Old Style", 0, 16)); // NOI18N
        haveAccLabel.setText("Έχεις ήδη λογαριασμό;");
        haveAccLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                haveAccLabelMouseClicked(evt);
            }
        });

        passwdLabel.setFont(new java.awt.Font("Bookman Old Style", 0, 16)); // NOI18N
        passwdLabel.setText("Κωδικός:");

        confirmPasswdLabel.setFont(new java.awt.Font("Bookman Old Style", 0, 16)); // NOI18N
        confirmPasswdLabel.setText("Επαλήθευση Κωδικού:");

        passwdField.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        passwdField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwdFieldFocusLost(evt);
            }
        });

        confirmPasswdField.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        confirmPasswdField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                confirmPasswdFieldFocusLost(evt);
            }
        });
        confirmPasswdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmPasswdFieldActionPerformed(evt);
            }
        });

        loginBtn.setFont(new java.awt.Font("Bookman Old Style", 1, 16)); // NOI18N
        loginBtn.setText("ΕΙΣΟΔΟΣ ΧΡΗΣΤΗ");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        photoLabel.setFont(new java.awt.Font("Bookman Old Style", 0, 16)); // NOI18N
        photoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/resources/IHU-LOGO.png"))); // NOI18N

        fullNameOK.setFont(new java.awt.Font("Bookman Old Style", 1, 16)); // NOI18N
        fullNameOK.setForeground(java.awt.Color.red);

        amOK.setFont(new java.awt.Font("Bookman Old Style", 1, 16)); // NOI18N
        amOK.setForeground(java.awt.Color.red);

        passwdOK.setFont(new java.awt.Font("Bookman Old Style", 1, 16)); // NOI18N
        passwdOK.setForeground(java.awt.Color.red);

        confirmPasswdOK.setFont(new java.awt.Font("Bookman Old Style", 1, 16)); // NOI18N
        confirmPasswdOK.setForeground(java.awt.Color.red);

        usernameLabel.setFont(new java.awt.Font("Bookman Old Style", 0, 16)); // NOI18N
        usernameLabel.setText("Όνομα Χρήστη:");

        generatedUsernameField.setEditable(false);
        generatedUsernameField.setFont(new java.awt.Font("Bookman Old Style", 0, 16)); // NOI18N
        generatedUsernameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                generatedUsernameFieldFocusLost(evt);
            }
        });

        errorTextLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        onOK.setFont(new java.awt.Font("Bookman Old Style", 1, 16)); // NOI18N
        onOK.setForeground(java.awt.Color.red);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(photoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(createNewAccLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addComponent(accountDetailsLabel)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(haveAccLabel)
                                .addGap(18, 18, 18)
                                .addComponent(loginBtn)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jSeparator1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(passwdLabel)
                                            .addComponent(fullNameLabel)
                                            .addComponent(amLabel)
                                            .addComponent(semesterLabel)
                                            .addComponent(confirmPasswdLabel)
                                            .addComponent(usernameLabel))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(semesterSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(fullNameField)
                                            .addComponent(amField)
                                            .addComponent(passwdField, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                            .addComponent(confirmPasswdField)
                                            .addComponent(generatedUsernameField)))
                                    .addComponent(jSeparator2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fullNameOK, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                                    .addComponent(amOK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(passwdOK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(confirmPasswdOK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(onOK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(137, 137, 137))))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(createAccountBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(errorTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 192, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(createNewAccLabel)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(accountDetailsLabel)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fullNameOK, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(fullNameLabel)
                                .addComponent(fullNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(amOK, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(amLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(amField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(semesterLabel)
                            .addComponent(semesterSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usernameLabel)
                            .addComponent(generatedUsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(onOK, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(photoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwdLabel)
                    .addComponent(passwdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwdOK, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmPasswdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmPasswdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmPasswdOK, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(createAccountBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(errorTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(haveAccLabel)
                    .addComponent(loginBtn))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createAccountBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAccountBtnActionPerformed
        if (verifyFields())
        {
            String username = generatedUsernameField.getText();
            String password = new String(passwdField.getPassword());
            String onomatEpwnymo = fullNameField.getText();
            int AM = Integer.getInteger(amField.getText());
            int eksamino = (int) semesterSpinner.getValue();

            StringBuilder sb = new StringBuilder();
            sb.append(username);
            sb.append("@it.teithe.gr");

            String email = sb.toString();

            try {    
                NewAccountCON.createNewAccount(username, password, onomatEpwnymo, AM, eksamino, email);
            } catch (IOException ex) {
                System.out.println("IOException in logoutBtnActionPerformed");
            } catch (ClassNotFoundException ex) {
                System.out.println("ClassNotFoundException");
            }
        }
        
    }//GEN-LAST:event_createAccountBtnActionPerformed

    private void amFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amFieldKeyTyped
        // allow only numbers
       if(!Character.isDigit(evt.getKeyChar()))
           evt.consume();
    }//GEN-LAST:event_amFieldKeyTyped
    
    private void haveAccLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_haveAccLabelMouseClicked
        
        LoginUI lf = new LoginUI();
        lf.setVisible(true);
        lf.pack();
        lf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_haveAccLabelMouseClicked

    private void fullNameFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fullNameFieldFocusLost
        if (fullNameField.getText().length()<2){//checks if username is invalid
            fullNameOK.setText("!");
            fullNameField.setForeground(Color.red);
        }
        else{//if full name valid, restore everything back to normal
            fullNameOK.setText("");
            fullNameField.setForeground(Color.gray);
        }             
    }//GEN-LAST:event_fullNameFieldFocusLost

    private void amFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_amFieldFocusLost
        if (amField.getText().length()<5){//checks if AM is invalid
            amOK.setText("!");
            amField.setForeground(Color.red);
        }
        else{//if am valid, restore everything back to normal
            amOK.setText("");
            amField.setForeground(Color.gray);
            String generatedUsername = NewAccountCON.usernameGeneration(Integer.parseInt(amField.getText()));
            generatedUsernameField.setText(generatedUsername);
        }    
    }//GEN-LAST:event_amFieldFocusLost

    private void passwdFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwdFieldFocusLost
        if (passwdField.getPassword().length<4){//checks if password is invalid
            passwdOK.setText("!");
            passwdField.setForeground(Color.red);            
        }
        else{//if passwd valid, restore everything back to normal
            passwdOK.setText("");
            passwdField.setForeground(Color.gray);
        }
    }//GEN-LAST:event_passwdFieldFocusLost

    private void confirmPasswdFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirmPasswdFieldFocusLost
        if (!confirmPasswdField.getPassword().equals(passwdField.getPassword())){//checks if password is invalid
            confirmPasswdOK.setText("!");
            confirmPasswdField.setForeground(Color.red);            
        }
        else{//if passwd valid, restore everything back to normal
            confirmPasswdOK.setText("");
            confirmPasswdField.setForeground(Color.gray);
        }
    }//GEN-LAST:event_confirmPasswdFieldFocusLost

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        LoginUI lf = new LoginUI();
        lf.setVisible(true);
        lf.pack();
        lf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose(); // TODO add your handling code here:
        
    }//GEN-LAST:event_loginBtnActionPerformed

    private void confirmPasswdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmPasswdFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmPasswdFieldActionPerformed

    private void generatedUsernameFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_generatedUsernameFieldFocusLost
        if (generatedUsernameField.getText().length()<1){//checks if username is invalid
            onOK.setText("!");
            generatedUsernameField.setForeground(Color.red);
        }
        else{//if full name valid, restore everything back to normal
            onOK.setText("");
            generatedUsernameField.setForeground(Color.gray);
        }
    }//GEN-LAST:event_generatedUsernameFieldFocusLost
    
    public boolean amValidity(){
        int am = Integer.getInteger(amField.getText());
        if (am>100001 && am<259999)
            return true;
        else
            return false;
    }
    public boolean verifyFields()
    {
        String fname = fullNameField.getText();
        String id = amField.getText();
        String pass1 = String.valueOf(passwdField.getPassword());
        String pass2 = String.valueOf(confirmPasswdField.getPassword());
        
    // check empty fields
        if(fname.trim().equals("") || id.trim().equals("") || pass1.trim().equals("") || pass2.trim().equals(""))
        {
            errorTextLabel.setText("One Or More Fields Are Empty");
            errorTextLabel.setForeground(Color.red);
            return false;
        }
        
        // check if the two password are equals or not
        else if(!pass1.equals(pass2))
        {
           errorTextLabel.setText("Password Doesn't Match! Confirm Password!");
           errorTextLabel.setForeground(Color.red);
           return false;
        }
        
        // if everything is ok
        else{
            return true;
        }
    }
    
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
            java.util.logging.Logger.getLogger(NewAccountUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewAccountUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewAccountUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewAccountUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewAccountUI().setVisible(true);
                 JFrame parent = new JFrame();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accountDetailsLabel;
    private javax.swing.JTextField amField;
    private javax.swing.JLabel amLabel;
    private javax.swing.JLabel amOK;
    private javax.swing.JPasswordField confirmPasswdField;
    private javax.swing.JLabel confirmPasswdLabel;
    private javax.swing.JLabel confirmPasswdOK;
    private javax.swing.JButton createAccountBtn;
    private javax.swing.JLabel createNewAccLabel;
    private javax.swing.JLabel errorTextLabel;
    private javax.swing.JTextField fullNameField;
    private javax.swing.JLabel fullNameLabel;
    private javax.swing.JLabel fullNameOK;
    private javax.swing.JTextField generatedUsernameField;
    private javax.swing.JLabel haveAccLabel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton loginBtn;
    private javax.swing.JLabel onOK;
    private javax.swing.JPasswordField passwdField;
    private javax.swing.JLabel passwdLabel;
    private javax.swing.JLabel passwdOK;
    private javax.swing.JLabel photoLabel;
    private javax.swing.JLabel semesterLabel;
    private javax.swing.JSpinner semesterSpinner;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
