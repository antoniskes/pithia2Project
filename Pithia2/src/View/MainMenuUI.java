package View;
import Controllers.*;
import Model.*;
import java.io.*;
import java.util.*;
import Main.*;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
public class MainMenuUI extends javax.swing.JFrame {

    public MainMenuUI() {
        initComponents();
        loadElements();
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logoutBtn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        semesterLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        mailLabel = new javax.swing.JLabel();
        onomatepwnymoLabel = new javax.swing.JLabel();
        eksaminoLabel = new javax.swing.JLabel();
        AMLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        vathmologiesTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        coursesCombo = new javax.swing.JComboBox<>();
        addCourseBtn = new javax.swing.JButton();
        infoLabel = new javax.swing.JLabel();
        courseNameLabel = new javax.swing.JLabel();
        courseIdLabel = new javax.swing.JLabel();
        courseSemesterLabel = new javax.swing.JLabel();
        labLabel = new javax.swing.JLabel();
        ectsLabel = new javax.swing.JLabel();
        onomaMathimatosLabel = new javax.swing.JLabel();
        kodikosMathimatosLabel = new javax.swing.JLabel();
        eksaminoMathimatosLabel = new javax.swing.JLabel();
        ergastiriakoMerosLabel = new javax.swing.JLabel();
        ECTSLabel = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        coursesList = new javax.swing.JList<>();
        loggedInAsLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        logoutBtn.setFont(new java.awt.Font("Bookman Old Style", 1, 16)); // NOI18N
        logoutBtn.setText("ΑΠΟΣΥΝΔΕΣΗ");
        logoutBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        jPanel1.setPreferredSize(new java.awt.Dimension(2050, 407));

        nameLabel.setFont(new java.awt.Font("Bookman Old Style", 0, 16)); // NOI18N
        nameLabel.setText("ΟΝΟΜΑΤΕΠΩΝΥΜΟ:");

        semesterLabel.setFont(new java.awt.Font("Bookman Old Style", 0, 16)); // NOI18N
        semesterLabel.setText("ΕΞΑΜΗΝΟ:");

        idLabel.setFont(new java.awt.Font("Bookman Old Style", 0, 16)); // NOI18N
        idLabel.setText("ΑΜ:");

        mailLabel.setFont(new java.awt.Font("Bookman Old Style", 0, 16)); // NOI18N
        mailLabel.setText("e-mail:");

        onomatepwnymoLabel.setFont(new java.awt.Font("Bookman Old Style", 0, 16)); // NOI18N
        onomatepwnymoLabel.setText("ΟΝΟΜΑΤΕΠΩΝΥΜΟ ΦΟΙΤΗΤΗ");

        eksaminoLabel.setFont(new java.awt.Font("Bookman Old Style", 0, 16)); // NOI18N
        eksaminoLabel.setText("ΕΞΑΜΗΝΟ ΦΟΙΤΗΤΗ");

        AMLabel.setFont(new java.awt.Font("Bookman Old Style", 0, 16)); // NOI18N
        AMLabel.setText("100001");

        emailLabel.setFont(new java.awt.Font("Bookman Old Style", 0, 16)); // NOI18N
        emailLabel.setText("email@it.teithe.gr");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(semesterLabel)
                    .addComponent(nameLabel)
                    .addComponent(idLabel)
                    .addComponent(mailLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(onomatepwnymoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(eksaminoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AMLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(emailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(331, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(onomatepwnymoLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(semesterLabel)
                    .addComponent(eksaminoLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel)
                    .addComponent(AMLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mailLabel)
                    .addComponent(emailLabel))
                .addContainerGap(285, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Στοιχεία Φοιτητή", jPanel1);

        vathmologiesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Κωδικός", "Τίτλος μαθήματος", "Βαθμός"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(vathmologiesTable);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(363, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );

        jTabbedPane1.addTab("Βαθμολογίες", jPanel3);

        jPanel2.setRequestFocusEnabled(false);

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 16)); // NOI18N
        jLabel1.setText("Η ΔΗΛΩΣΗ ΜΟΥ");

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 1, 16)); // NOI18N
        jLabel2.setText("ΠΡΟΣΘΗΚΗ ΜΑΘΗΜΑΤΟΣ ΣΤΗ ΔΗΛΩΣΗ ΜΟΥ");

        coursesCombo.setFont(new java.awt.Font("Bookman Old Style", 0, 16)); // NOI18N
        coursesCombo.setToolTipText("");
        coursesCombo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        coursesCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                coursesComboItemStateChanged(evt);
            }
        });
        coursesCombo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                coursesComboMouseEntered(evt);
            }
        });

        addCourseBtn.setFont(new java.awt.Font("Bookman Old Style", 1, 16)); // NOI18N
        addCourseBtn.setText("ΠΡΟΣΘΗΚΗ");
        addCourseBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addCourseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCourseBtnActionPerformed(evt);
            }
        });

        infoLabel.setFont(new java.awt.Font("Bookman Old Style", 1, 16)); // NOI18N
        infoLabel.setText("ΠΛΗΡΟΦΟΡΙΕΣ ΜΑΘΗΜΑΤΟΣ");

        courseNameLabel.setFont(new java.awt.Font("Bookman Old Style", 0, 16)); // NOI18N
        courseNameLabel.setText("ΟΝΟΜΑ ΜΑΘΗΜΑΤΟΣ:");

        courseIdLabel.setFont(new java.awt.Font("Bookman Old Style", 0, 16)); // NOI18N
        courseIdLabel.setText("ΚΩΔΙΚΟΣ ΜΑΘΗΜΑΤΟΣ:");

        courseSemesterLabel.setFont(new java.awt.Font("Bookman Old Style", 0, 16)); // NOI18N
        courseSemesterLabel.setText("ΕΞΑΜΗΝΟ:");

        labLabel.setFont(new java.awt.Font("Bookman Old Style", 0, 16)); // NOI18N
        labLabel.setText("ΕΧΕΙ ΕΡΓΑΣΤΗΡΙΑΚΟ ΜΕΡΟΣ:");

        ectsLabel.setFont(new java.awt.Font("Bookman Old Style", 0, 16)); // NOI18N
        ectsLabel.setText("ECTS:");

        onomaMathimatosLabel.setFont(new java.awt.Font("Bookman Old Style", 0, 16)); // NOI18N
        onomaMathimatosLabel.setText("-"); // NOI18N

        kodikosMathimatosLabel.setFont(new java.awt.Font("Bookman Old Style", 0, 16)); // NOI18N
        kodikosMathimatosLabel.setText("-");

        eksaminoMathimatosLabel.setFont(new java.awt.Font("Bookman Old Style", 0, 16)); // NOI18N
        eksaminoMathimatosLabel.setText("-");

        ergastiriakoMerosLabel.setFont(new java.awt.Font("Bookman Old Style", 0, 16)); // NOI18N
        ergastiriakoMerosLabel.setText("-");

        ECTSLabel.setFont(new java.awt.Font("Bookman Old Style", 0, 16)); // NOI18N
        ECTSLabel.setText("-");

        jScrollPane2.setViewportView(coursesList);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator4)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(119, 119, 119)
                                        .addComponent(infoLabel))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(coursesCombo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addComponent(addCourseBtn)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(10, 10, 10))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(courseSemesterLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(courseIdLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(courseNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ectsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(eksaminoMathimatosLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ergastiriakoMerosLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(kodikosMathimatosLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ECTSLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(onomaMathimatosLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel1)
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(coursesCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addCourseBtn))
                                .addGap(64, 64, 64)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(infoLabel)
                                .addGap(50, 50, 50)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(courseNameLabel)
                                    .addComponent(onomaMathimatosLabel))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(courseIdLabel)
                                    .addComponent(kodikosMathimatosLabel))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(courseSemesterLabel)
                                    .addComponent(eksaminoMathimatosLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labLabel)
                                    .addComponent(ergastiriakoMerosLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ectsLabel)
                                    .addComponent(ECTSLabel))))))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Δήλωση μαθημάτων", jPanel2);

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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(loggedInAsLabel)
                        .addGap(18, 18, 18)
                        .addComponent(usernameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 468, Short.MAX_VALUE)
                        .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(loggedInAsLabel)
                        .addComponent(usernameLabel))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
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
        new LoginUI().setVisible(true); // create and appear new LoginUI
    }//GEN-LAST:event_logoutBtnActionPerformed

    DefaultListModel liss = new DefaultListModel();
    private void addCourseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCourseBtnActionPerformed
        String courseToRegister = coursesCombo.getSelectedItem().toString();
        DilosiMathimatonCON.courseRegistration(loggedInStudent, -100.0, courseToRegister);//-100.0 vathmos means that teacher hasn't input vathmos yet
        
        loadDilomenaMathimataList();//reload coursesList
        fillCoursesCombo();//reload cousesCombo so that newly registered course is not shown in combo
        loadVathmologiesTable(); //reload vathmologies table
    }//GEN-LAST:event_addCourseBtnActionPerformed

    private void coursesComboMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_coursesComboMouseEntered
                
    }//GEN-LAST:event_coursesComboMouseEntered

    private void coursesComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_coursesComboItemStateChanged
        String selectedCourse = coursesCombo.getSelectedItem().toString();
        Mathima selectedMathimaObj;
        for (Mathima mathimaObj : Database.appDatabase.database.mathimata)
        {
            String onomaMathimatos = mathimaObj.getOnomaMathimatos();
            if (onomaMathimatos.equalsIgnoreCase(selectedCourse)){            
                selectedMathimaObj = mathimaObj;
                onomaMathimatosLabel.setText(selectedMathimaObj.getOnomaMathimatos());
                kodikosMathimatosLabel.setText(String.valueOf(selectedMathimaObj.getKodikosMathimatos()));
                eksaminoMathimatosLabel.setText(String.valueOf(selectedMathimaObj.getEksamino()));
                ergastiriakoMerosLabel.setText(Boolean.toString(selectedMathimaObj.isErgastiriakoMeros()));
                ECTSLabel.setText(String.valueOf(selectedMathimaObj.getECTS()));
               break;
            }
        }
        
        
                
    }//GEN-LAST:event_coursesComboItemStateChanged
    //My methods
    public void loadElements()
    {
        usernameLabel.setText(LoginUI.loggedInAccount.getUsername());
        fillCoursesCombo();
        loadVathmologiesTable();
        loadDilomenaMathimataList();
        loadStudentDetails();
    }
    public void loadStudentDetails()
    {
        Object[] details = ProsopikaStoixeiaCON.getDetails(loggedInStudent);        
        AMLabel.setText(details[0].toString());
        eksaminoLabel.setText(details[1].toString());
        onomatepwnymoLabel.setText(details[2].toString());
        usernameLabel.setText(details[3].toString());
        
    }
    public void fillCoursesCombo(){        
       for( Mathima mathima : courses)
       {        
            String onomaMathimatos = mathima.getOnomaMathimatos();
            
            //if already registered to course, don't show it in coursesCombo
            //checks if student is registered in this course)
            if (! (isCourseRegistered(onomaMathimatos)) )//if not registered then add it to combo
                coursesCombo.addItem(onomaMathimatos);
       }
       
    }
    
    public void loadDilomenaMathimataList()
    {
        DefaultListModel listModel = new DefaultListModel();
        for (Mathima mathima : dilomenaMathimata)
        {
            listModel.addElement(mathima.getOnomaMathimatos());
        }                       
       coursesList.setModel(listModel);       
    }
    public void loadVathmologiesTable()
    {        
        String columns[] = {"Κωδικός μαθήματος","Όνομα μαθήματος","Βαθμός"};
        DefaultTableModel tableModel = new DefaultTableModel(columns, 0);//rows=0
        int size = vathmologies.length;
        if (vathmologies[0][0] != null)//if vathmologies is NOT empty
        {
            int i=0;
            while (vathmologies[i][0] != null)
            {
                Mathima course = (Mathima) vathmologies[i][0];
                double vathmos = (double) vathmologies[i][1];
                
                Object[] rows = {course.getKodikosMathimatos(), course.getOnomaMathimatos(), vathmos};
                tableModel.addRow(rows);//add new row to table model, each row is another course

                i++;     
            }
        }
        
        vathmologiesTable.setModel(tableModel);
    }
    private boolean isCourseRegistered(String onomaMathimatos)
    {
        for (Mathima mathima : dilomenaMathimata)
        {
            if (mathima.getOnomaMathimatos().equalsIgnoreCase(onomaMathimatos))
                return true;
        }
        return false;
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
            java.util.logging.Logger.getLogger(MainMenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenuUI().setVisible(true);
            }           
        });              
    }
    //variables
    Foititis loggedInStudent = (Foititis) LoginUI.loggedInAccount;//I downcast to Foititis because MainMenuUI is always used by students
    Object[][] vathmologies = loggedInStudent.getVathmologies();
    ArrayList <Mathima> dilomenaMathimata = loggedInStudent.getDilomenaMathimata();
    ArrayList <Mathima> courses = Database.appDatabase.database.mathimata;
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AMLabel;
    private javax.swing.JLabel ECTSLabel;
    private javax.swing.JButton addCourseBtn;
    private javax.swing.JLabel courseIdLabel;
    private javax.swing.JLabel courseNameLabel;
    private javax.swing.JLabel courseSemesterLabel;
    private javax.swing.JComboBox<String> coursesCombo;
    private javax.swing.JList<String> coursesList;
    private javax.swing.JLabel ectsLabel;
    private javax.swing.JLabel eksaminoLabel;
    private javax.swing.JLabel eksaminoMathimatosLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel ergastiriakoMerosLabel;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel kodikosMathimatosLabel;
    private javax.swing.JLabel labLabel;
    private javax.swing.JLabel loggedInAsLabel;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JLabel mailLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel onomaMathimatosLabel;
    private javax.swing.JLabel onomatepwnymoLabel;
    private javax.swing.JLabel semesterLabel;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTable vathmologiesTable;
    // End of variables declaration//GEN-END:variables

 
}
