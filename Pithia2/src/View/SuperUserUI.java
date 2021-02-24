package View;
import Controllers.*;
import Main.Database;
import Model.*;
import java.io.*;
import java.util.ArrayList;
import javax.swing.*;

public class SuperUserUI extends javax.swing.JFrame {

    DefaultListModel dm = new DefaultListModel();
    
    public SuperUserUI() {
        initComponents();
        loadElements();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        printAnalytKatastasiFoititon = new javax.swing.JFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        consoleTextArea = new javax.swing.JTextArea();
        superUserUITabbedPane = new javax.swing.JTabbedPane();
        registeredUsersPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        usersList = new javax.swing.JList<>();
        deleteUserBtn = new javax.swing.JButton();
        printStudentsStatus = new javax.swing.JButton();
        addCoursePanel = new javax.swing.JPanel();
        onomaMathimatosLabel = new javax.swing.JLabel();
        kodikosMathimatosLabel = new javax.swing.JLabel();
        eksaminoSpinner = new javax.swing.JSpinner();
        eksaminoLabel = new javax.swing.JLabel();
        ectsSpinner = new javax.swing.JSpinner();
        oresLabel = new javax.swing.JLabel();
        ergastirioLabel = new javax.swing.JLabel();
        ectsLabel = new javax.swing.JLabel();
        ergastiriakoMerosComboBox = new javax.swing.JComboBox<>();
        onomaMathimatosField = new javax.swing.JTextField();
        oresDidaskaliasSpinner = new javax.swing.JSpinner();
        kodikosMathimatosField = new javax.swing.JTextField();
        addCourseBtn = new javax.swing.JButton();
        proapaitoumenoLabel = new javax.swing.JLabel();
        proapaitoumenoCombo = new javax.swing.JComboBox<>();
        addVathmosPanel = new javax.swing.JPanel();
        coursesCombo = new javax.swing.JComboBox<>();
        amLabel = new javax.swing.JLabel();
        vathmosLabel = new javax.swing.JLabel();
        addVathmosBtn = new javax.swing.JButton();
        vathmosSpinner = new javax.swing.JSpinner();
        mathimaLabel = new javax.swing.JLabel();
        studentsCombo = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        logoutBtn = new javax.swing.JButton();
        loggedInAsLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();

        consoleTextArea.setColumns(20);
        consoleTextArea.setRows(5);
        jScrollPane2.setViewportView(consoleTextArea);

        javax.swing.GroupLayout printAnalytKatastasiFoititonLayout = new javax.swing.GroupLayout(printAnalytKatastasiFoititon.getContentPane());
        printAnalytKatastasiFoititon.getContentPane().setLayout(printAnalytKatastasiFoititonLayout);
        printAnalytKatastasiFoititonLayout.setHorizontalGroup(
            printAnalytKatastasiFoititonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(printAnalytKatastasiFoititonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
                .addContainerGap())
        );
        printAnalytKatastasiFoititonLayout.setVerticalGroup(
            printAnalytKatastasiFoititonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(printAnalytKatastasiFoititonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        usersList.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jScrollPane1.setViewportView(usersList);

        deleteUserBtn.setFont(new java.awt.Font("Bookman Old Style", 1, 16)); // NOI18N
        deleteUserBtn.setText("ΔΙΑΓΡΑΦΗ ΧΡΗΣΤΗ");
        deleteUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteUserBtnActionPerformed(evt);
            }
        });

        printStudentsStatus.setText("ΕΚΤΥΠΩΣΗ ΑΝΑΛΥΤΙΚΗΣ ΚΑΤΑΣΤΑΣΗΣ ΦΟΙΤΗΤΩΝ");
        printStudentsStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printStudentsStatusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout registeredUsersPanelLayout = new javax.swing.GroupLayout(registeredUsersPanel);
        registeredUsersPanel.setLayout(registeredUsersPanelLayout);
        registeredUsersPanelLayout.setHorizontalGroup(
            registeredUsersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registeredUsersPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(registeredUsersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteUserBtn)
                    .addComponent(printStudentsStatus))
                .addContainerGap(392, Short.MAX_VALUE))
        );
        registeredUsersPanelLayout.setVerticalGroup(
            registeredUsersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registeredUsersPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(registeredUsersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registeredUsersPanelLayout.createSequentialGroup()
                        .addComponent(deleteUserBtn)
                        .addGap(18, 18, 18)
                        .addComponent(printStudentsStatus))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        superUserUITabbedPane.addTab("Εγγεγραμμένοι Χρήστες", registeredUsersPanel);

        onomaMathimatosLabel.setFont(new java.awt.Font("Bookman Old Style", 0, 16)); // NOI18N
        onomaMathimatosLabel.setText("Όνομα μαθήματος:");

        kodikosMathimatosLabel.setFont(new java.awt.Font("Bookman Old Style", 0, 16)); // NOI18N
        kodikosMathimatosLabel.setText("Κωδικός μαθήματος:");

        eksaminoSpinner.setFont(new java.awt.Font("Bookman Old Style", 0, 16)); // NOI18N
        eksaminoSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 9, 1));

        eksaminoLabel.setFont(new java.awt.Font("Bookman Old Style", 0, 16)); // NOI18N
        eksaminoLabel.setText("Εξάμηνο:");

        ectsSpinner.setFont(new java.awt.Font("Bookman Old Style", 0, 16)); // NOI18N
        ectsSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 20, 1));

        oresLabel.setFont(new java.awt.Font("Bookman Old Style", 0, 16)); // NOI18N
        oresLabel.setText("Ώρες Διδασκαλίας:");

        ergastirioLabel.setFont(new java.awt.Font("Bookman Old Style", 0, 16)); // NOI18N
        ergastirioLabel.setText("Εργαστηριακό Μέρος:");

        ectsLabel.setFont(new java.awt.Font("Bookman Old Style", 0, 16)); // NOI18N
        ectsLabel.setText("ECTS:");

        ergastiriakoMerosComboBox.setFont(new java.awt.Font("Bookman Old Style", 0, 16)); // NOI18N
        ergastiriakoMerosComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ΟΧΙ", "ΝΑΙ" }));

        onomaMathimatosField.setFont(new java.awt.Font("Bookman Old Style", 0, 16)); // NOI18N

        oresDidaskaliasSpinner.setFont(new java.awt.Font("Bookman Old Style", 0, 16)); // NOI18N
        oresDidaskaliasSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 8, 1));

        kodikosMathimatosField.setFont(new java.awt.Font("Bookman Old Style", 0, 16)); // NOI18N
        kodikosMathimatosField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                kodikosMathimatosFieldKeyTyped(evt);
            }
        });

        addCourseBtn.setFont(new java.awt.Font("Bookman Old Style", 1, 16)); // NOI18N
        addCourseBtn.setText("Προσθήκη");
        addCourseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCourseBtnActionPerformed(evt);
            }
        });

        proapaitoumenoLabel.setFont(new java.awt.Font("Bookman Old Style", 0, 16)); // NOI18N
        proapaitoumenoLabel.setText("Προαπαιτούμενο μάθημα:");

        proapaitoumenoCombo.setFont(new java.awt.Font("Bookman Old Style", 0, 16)); // NOI18N
        proapaitoumenoCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                proapaitoumenoComboItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout addCoursePanelLayout = new javax.swing.GroupLayout(addCoursePanel);
        addCoursePanel.setLayout(addCoursePanelLayout);
        addCoursePanelLayout.setHorizontalGroup(
            addCoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addCoursePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addCoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(proapaitoumenoLabel)
                    .addComponent(ectsLabel)
                    .addComponent(onomaMathimatosLabel)
                    .addComponent(ergastirioLabel)
                    .addComponent(eksaminoLabel)
                    .addComponent(kodikosMathimatosLabel)
                    .addComponent(oresLabel))
                .addGap(18, 18, 18)
                .addGroup(addCoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(eksaminoSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ergastiriakoMerosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ectsSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oresDidaskaliasSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(onomaMathimatosField)
                    .addComponent(kodikosMathimatosField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(proapaitoumenoCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(120, 120, 120)
                .addComponent(addCourseBtn)
                .addContainerGap(229, Short.MAX_VALUE))
        );
        addCoursePanelLayout.setVerticalGroup(
            addCoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addCoursePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addCoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(onomaMathimatosLabel)
                    .addComponent(onomaMathimatosField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(addCoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kodikosMathimatosLabel)
                    .addComponent(kodikosMathimatosField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addCoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eksaminoLabel)
                    .addComponent(eksaminoSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addCoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oresLabel)
                    .addComponent(oresDidaskaliasSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addCoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ergastirioLabel)
                    .addComponent(ergastiriakoMerosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addCoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ectsLabel)
                    .addComponent(ectsSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addCoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(proapaitoumenoLabel)
                    .addComponent(proapaitoumenoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addCourseBtn))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        superUserUITabbedPane.addTab("Προσθήκη μαθήματος", addCoursePanel);

        coursesCombo.setFont(new java.awt.Font("Bookman Old Style", 0, 16)); // NOI18N
        coursesCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                coursesComboItemStateChanged(evt);
            }
        });

        amLabel.setFont(new java.awt.Font("Bookman Old Style", 0, 16)); // NOI18N
        amLabel.setText("ΑΜ Φοιτητή:");

        vathmosLabel.setFont(new java.awt.Font("Bookman Old Style", 0, 16)); // NOI18N
        vathmosLabel.setText("Βαθμολογία Φοιτητή:");

        addVathmosBtn.setFont(new java.awt.Font("Bookman Old Style", 1, 16)); // NOI18N
        addVathmosBtn.setText("ΥΠΟΒΟΛΗ");
        addVathmosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addVathmosBtnActionPerformed(evt);
            }
        });

        vathmosSpinner.setFont(new java.awt.Font("Bookman Old Style", 1, 16)); // NOI18N
        vathmosSpinner.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 10.0d, 1.0d));

        mathimaLabel.setFont(new java.awt.Font("Bookman Old Style", 0, 16)); // NOI18N
        mathimaLabel.setText("Διδασκόμενο Μάθημα:");

        studentsCombo.setFont(new java.awt.Font("Bookman Old Style", 1, 16)); // NOI18N

        javax.swing.GroupLayout addVathmosPanelLayout = new javax.swing.GroupLayout(addVathmosPanel);
        addVathmosPanel.setLayout(addVathmosPanelLayout);
        addVathmosPanelLayout.setHorizontalGroup(
            addVathmosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addVathmosPanelLayout.createSequentialGroup()
                .addGroup(addVathmosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addVathmosPanelLayout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(addVathmosBtn))
                    .addGroup(addVathmosPanelLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(addVathmosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(amLabel)
                            .addComponent(vathmosLabel)
                            .addComponent(mathimaLabel))
                        .addGap(18, 18, 18)
                        .addGroup(addVathmosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(vathmosSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(coursesCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(studentsCombo, 0, 240, Short.MAX_VALUE))))
                .addContainerGap(416, Short.MAX_VALUE))
        );
        addVathmosPanelLayout.setVerticalGroup(
            addVathmosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addVathmosPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(addVathmosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(coursesCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mathimaLabel))
                .addGap(49, 49, 49)
                .addGroup(addVathmosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amLabel)
                    .addComponent(studentsCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(addVathmosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vathmosLabel)
                    .addComponent(vathmosSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(addVathmosBtn)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        superUserUITabbedPane.addTab("Εισαγωγή Βαθμολογίας", addVathmosPanel);

        logoutBtn.setFont(new java.awt.Font("Bookman Old Style", 1, 16)); // NOI18N
        logoutBtn.setText("ΑΠΟΣΥΝΔΕΣΗ");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        loggedInAsLabel.setFont(new java.awt.Font("Bookman Old Style", 0, 16)); // NOI18N
        loggedInAsLabel.setText("Συνδεδεμένος ως:");

        usernameLabel.setFont(new java.awt.Font("Bookman Old Style", 0, 16)); // NOI18N
        usernameLabel.setText("username");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(loggedInAsLabel)
                        .addGap(18, 18, 18)
                        .addComponent(usernameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logoutBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(superUserUITabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoutBtn)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(loggedInAsLabel)
                        .addComponent(usernameLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(superUserUITabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        try {
            LogoutCON.logout();
        } catch (IOException ex) {
            System.out.println("IOException in logoutBtnActionPerformed");//Logger.getLogger(MainMenuUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException logoutBtnActionPerformed");//Logger.getLogger(MainMenuUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        setVisible(false); //closes MainMenuUI
        dispose(); //disposes MainMenuUI
        new LoginUI().setVisible(true);
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void deleteUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteUserBtnActionPerformed
        int userToDelete = usersList.getSelectedIndex();//get index of select user to delete        
        Logariasmos accountToDelete = (Logariasmos) accountsListObjects.get(userToDelete); //get account object of selected index
        if (loggedInAccount.equals(accountToDelete))
            JOptionPane.showMessageDialog(rootPane, "You can't delete your account");
        else{
            DeleteUsersCON.deleteUser(accountToDelete);
            loadUsersList(); //reload list
        }
                    
    }//GEN-LAST:event_deleteUserBtnActionPerformed

    private void kodikosMathimatosFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kodikosMathimatosFieldKeyTyped
       
    }//GEN-LAST:event_kodikosMathimatosFieldKeyTyped

    private void addCourseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCourseBtnActionPerformed
        String onomaMathimatos = onomaMathimatosField.getText();
        String kodikosMathimatos = kodikosMathimatosField.getText();
        int eksamino = (int)eksaminoSpinner.getValue();
        int oresDidaskalias = (int)oresDidaskaliasSpinner.getValue();
        String ergastirio = ergastiriakoMerosComboBox.getSelectedItem().toString();
        boolean ergastiriakoMeros =  ergastirio.equalsIgnoreCase("ΝΑΙ");
        int ECTS = (int) ectsSpinner.getValue();
        
        Mathima proapaitoumenoMathima = null;
        if (! (proapaitoumenoCombo.getSelectedItem().toString() == "-"))
        {
            for (Mathima mathimaObj : Database.appDatabase.database.mathimata)
        {
            String onoma = mathimaObj.getOnomaMathimatos();
            if (onomaMathimatos.equalsIgnoreCase(proapaitoumenoCombo.getSelectedItem().toString()))
            {
               proapaitoumenoMathima = mathimaObj;
            }            
        }
        }
        AddNewCourseCON.addNewCourse(onomaMathimatos, kodikosMathimatos, eksamino, oresDidaskalias, ergastiriakoMeros, ECTS, proapaitoumenoMathima);
    }//GEN-LAST:event_addCourseBtnActionPerformed

    private void addVathmosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addVathmosBtnActionPerformed
        Foititis studentToAddScore = students.get(studentsCombo.getSelectedIndex());        
        double vathmos = (double) vathmosSpinner.getValue();
        String onomaMathimatos = coursesCombo.getSelectedItem().toString();
        if ( onomaMathimatos.isEmpty() || onomaMathimatos.equalsIgnoreCase("ΕΠΙΛΟΓΗ ΜΑΘΗΜΑΤΟΣ") )            
            JOptionPane.showMessageDialog(rootPane, "You have not selected  course");
        else
        {
            Kathigitis teacher = (Kathigitis) loggedInAccount;            
            EisagogiVathmologiasCON.addVathmos(teacher, studentToAddScore, vathmos, onomaMathimatos);
            JOptionPane.showMessageDialog(rootPane, "Success");
        }            
    }//GEN-LAST:event_addVathmosBtnActionPerformed

    private void coursesComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_coursesComboItemStateChanged
        fillStudentsCombo(); //load students registered to this course
    }//GEN-LAST:event_coursesComboItemStateChanged

    private void proapaitoumenoComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_proapaitoumenoComboItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_proapaitoumenoComboItemStateChanged

    private void printStudentsStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printStudentsStatusActionPerformed
        String strToPrint = printAnalytKatastFoititon.printCL();
        consoleTextArea.setText(strToPrint);
        printAnalytKatastasiFoititon.setVisible(true);
        
    }//GEN-LAST:event_printStudentsStatusActionPerformed

    public void loadElements()
    {
        setVisibilities();
        if (! (loggedInAccount instanceof Kathigitis))
        { //load registered Users only if logged in account isn't teacher
          //only Grammateia & Diaxeiristis can see registered users
            loadUsersList();            
        }
        if (! (loggedInAccount instanceof Diaxeiristis)) //loggedInAccount instanceof Kathigitis or Grammateia
        {
            //only Grammateia or Kathigitis can insert vathmos to student
            fillCoursesCombo();            
            setVathmosSpinnerModel(); // set vathmosSpinner model only when needed (loggedInAccount Kathigitis or Grammateia)
            
        }
        if (loggedInAccount instanceof Diaxeiristis)
            fillProapaitoumenoCombo();
            
    }
    public void fillProapaitoumenoCombo()
    {
            proapaitoumenoCombo.addItem("-");
            for( Mathima mathima : courses)
            {
                 String onomaMathimatos = mathima.getOnomaMathimatos();           
                 proapaitoumenoCombo.addItem(onomaMathimatos);
            }
             
    }
    public void setVathmosSpinnerModel()
    {
        SpinnerNumberModel model = new SpinnerNumberModel(0.0, 0.0, 10.0, 0.1);
        vathmosSpinner.setModel(model);
    }
    public void setVisibilities()
    {
        usernameLabel.setText(loggedInAccount.getUsername());
        if (loggedInAccount instanceof Grammateia)
        { //Grammateia can't delete users or add new courses
            deleteUserBtn.setVisible(false);
            addCoursePanel.remove(this);
        }
        else if (loggedInAccount instanceof Kathigitis)
        { //Kathigitis can't see all registered users or add a new course
            superUserUITabbedPane.setEnabledAt(0, false);//disables registeredUsersPanel
            superUserUITabbedPane.setEnabledAt(1, false);//disables addCoursePanel
            superUserUITabbedPane.setSelectedIndex(2);
        }
        else if (loggedInAccount instanceof Diaxeiristis)
        { //Admin can't addVathmos            
            superUserUITabbedPane.setEnabledAt(2, false);
        }
    }
    public void loadUsersList()
    {        
        DefaultListModel accountsListUsernames = new DefaultListModel();//to keep account username
        for (Logariasmos account : accounts)
        {
            accountsListObjects.add(account);
            accountsListUsernames.addElement(account.getUsername());
        }
        usersList.setModel(accountsListUsernames);
        
    }
    public void fillCoursesCombo()
    {   
        coursesCombo.addItem("ΕΠΙΛΟΓΗ ΜΑΘΗΜΑΤΟΣ");
        if (loggedInAccount instanceof Grammateia)
        {
            for( Mathima mathima : courses)
            {
                 String onomaMathimatos = mathima.getOnomaMathimatos();           
                 coursesCombo.addItem(onomaMathimatos);
            }
        }
        else if (loggedInAccount instanceof Kathigitis) //Teacher can add score only to a course he/she teaches
        {
            ArrayList <Mathima> didaskomenaMathimata = ((Kathigitis)loggedInAccount).getDidaskomenaMathimata();
            for( Mathima mathima : didaskomenaMathimata)
            {
                 String onomaMathimatos = mathima.getOnomaMathimatos();           
                 coursesCombo.addItem(onomaMathimatos);
            }
        }                
    }
    public void fillStudentsCombo()
    {   // combo box will show ONLY students that are registered to the selected course
        studentsCombo.removeAllItems();
        students = new ArrayList<>(); //reset array every time combo box is loaded (because loaded students change based on selected course)
        for (Logariasmos account : accounts)
        {
            if (account instanceof Foititis)
            {
                Foititis student = (Foititis) account;
                if ( checkStudentCourseRegistration(student, coursesCombo.getSelectedItem().toString()) )
                {
                    String am = String.valueOf(student.getAM());
                    studentsCombo.addItem(am);
                    students.add(student);
                }                                    
            }            
        }        
    }
    public boolean checkStudentCourseRegistration(Foititis student, String onomaMathimatos)
    {
        Mathima mathima = student.getDilomenoMathima(onomaMathimatos);
        if (mathima == null)
            return false; //student IS NOT registered to this course
        else
            return true; //student IS registered to this course
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
            java.util.logging.Logger.getLogger(SuperUserUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuperUserUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuperUserUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuperUserUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

          
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SuperUserUI().setVisible(true);
            }
        });
    }
    //variables
    ArrayList <Foititis> students; //keep objects of students
    Logariasmos loggedInAccount = LoginUI.loggedInAccount; //keep logged in account
    ArrayList <Logariasmos> accountsListObjects = new ArrayList<>(); // keep objects of accounts
    ArrayList <Mathima> courses = Database.appDatabase.database.mathimata; //keep courses array    
    ArrayList <Logariasmos> accounts = Database.appDatabase.database.accounts; //keep accounts array
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCourseBtn;
    private javax.swing.JPanel addCoursePanel;
    private javax.swing.JButton addVathmosBtn;
    private javax.swing.JPanel addVathmosPanel;
    private javax.swing.JLabel amLabel;
    private javax.swing.JTextArea consoleTextArea;
    private javax.swing.JComboBox<String> coursesCombo;
    private javax.swing.JButton deleteUserBtn;
    private javax.swing.JLabel ectsLabel;
    private javax.swing.JSpinner ectsSpinner;
    private javax.swing.JLabel eksaminoLabel;
    private javax.swing.JSpinner eksaminoSpinner;
    private javax.swing.JComboBox<String> ergastiriakoMerosComboBox;
    private javax.swing.JLabel ergastirioLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField kodikosMathimatosField;
    private javax.swing.JLabel kodikosMathimatosLabel;
    private javax.swing.JLabel loggedInAsLabel;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JLabel mathimaLabel;
    private javax.swing.JTextField onomaMathimatosField;
    private javax.swing.JLabel onomaMathimatosLabel;
    private javax.swing.JSpinner oresDidaskaliasSpinner;
    private javax.swing.JLabel oresLabel;
    private javax.swing.JFrame printAnalytKatastasiFoititon;
    private javax.swing.JButton printStudentsStatus;
    private javax.swing.JComboBox<String> proapaitoumenoCombo;
    private javax.swing.JLabel proapaitoumenoLabel;
    private javax.swing.JPanel registeredUsersPanel;
    private javax.swing.JComboBox<String> studentsCombo;
    private javax.swing.JTabbedPane superUserUITabbedPane;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JList<String> usersList;
    private javax.swing.JLabel vathmosLabel;
    private javax.swing.JSpinner vathmosSpinner;
    // End of variables declaration//GEN-END:variables
}
