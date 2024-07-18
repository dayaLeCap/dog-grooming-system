package com.mycompany.canine.grooming.system.IGU;

import com.mycompany.canine.grooming.system.Clases.Owner;
import com.mycompany.canine.grooming.system.Clases.Pet;
import com.mycompany.canine.grooming.system.Clases.Validation;
import com.mycompany.canine.grooming.system.Methods.PetImplemented;
import java.awt.Color;
import javax.swing.JOptionPane;

public class refillData extends javax.swing.JPanel {
    
    public refillData() {
        initComponents();
        estilosIniciales();
    }
    
    private void estilosIniciales() {
        title.putClientProperty("FlatLaf.styleClass", "h1");
        title.setForeground(Color.black);
        txtDogName.putClientProperty("JTextField.placeholderText", "Enter the Dog's Name");
        txtRace.putClientProperty("JTextField.placeholderText", "Enter Dog Breed");
        txtColor.putClientProperty("JTextField.placeholderText", "Enter Dog Color");
        txtOwnersName.putClientProperty("JTextField.placeholderText", "Enter Dog Owner");
        txtCellOwner.putClientProperty("JTextField.placeholderText", "Enter the Owner's Cell Phone");
    }
    
    private void cleanFields() {
        String m = "";
        txtCellOwner.setText(m);
        txtColor.setText(m);
        txtDogName.setText(m);
        txtRace.setText(m);
        txtOwnersName.setText(m);
        txtObservations.setText(m);
        //para los combo box
        cbxAllergic.setSelectedIndex(0);
        cbxSpecialAttention.setSelectedIndex(0);
        
    }
    
    private void registerData() {
        String field = Validation.fieldValidations(txtDogName, txtRace, txtColor, cbxAllergic, cbxSpecialAttention, txtOwnersName, txtCellOwner, txtObservations);
        
        if (field.equals("")) {
            //int customer_number;

            PetImplemented petImplemented = new PetImplemented();
            
            Owner owner = new Owner();
            //owner attributes
            //int idOwner;
            String nameOwner;
            int cellOwner;

            //Owner
            nameOwner = txtOwnersName.getText();
            cellOwner = Integer.parseInt(txtCellOwner.getText());
            owner.setName(nameOwner);
            owner.setCellOwner(cellOwner);
            
            Pet pet = new Pet();
            //pet attributes
            String name;
            String race;
            String color;
            String allergic;
            String special_attention;
            String observations;
            //Let's obtain the data through the fields that are in the form
            name = txtDogName.getText();
            race = txtRace.getText();
            color = txtColor.getText();
            allergic = cbxAllergic.getSelectedItem().toString();
            special_attention = cbxSpecialAttention.getSelectedItem().toString();
            observations = txtObservations.getText();

            //we set the data to the objects
            pet.setName(name);
            pet.setRace(race);
            pet.setColor(color);
            pet.setAllergic(allergic);
            pet.setSpecial_attention(special_attention);
            pet.setObservations(observations);
            pet.setOwner(owner);

            //we invoke the register-Pet method
            petImplemented.registerPet(owner, pet);
            JOptionPane.showMessageDialog(null, "Pet Successfully Registered", "dog name", JOptionPane.INFORMATION_MESSAGE);
            this.cleanFields();
        } else {
            JOptionPane.showMessageDialog(null, "VERIFY THE DATA IN THE FIELD: " + field, field, HEIGHT);
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        bg = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        dateLbl = new javax.swing.JLabel();
        txtDogName = new javax.swing.JTextField();
        authorLbl = new javax.swing.JLabel();
        txtRace = new javax.swing.JTextField();
        catLbl = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        edLbl = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        langLbl = new javax.swing.JLabel();
        pagsLbl = new javax.swing.JLabel();
        txtOwnersName = new javax.swing.JTextField();
        descLbl = new javax.swing.JLabel();
        txtCellOwner = new javax.swing.JTextField();
        stockLbl = new javax.swing.JLabel();
        btnIncrese = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtObservations = new javax.swing.JTextArea();
        cbxAllergic = new javax.swing.JComboBox<>();
        cbxSpecialAttention = new javax.swing.JComboBox<>();
        btnClean = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setBackground(new java.awt.Color(255, 255, 255));

        bg.setBackground(new java.awt.Color(255, 255, 255));

        title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/huella.png"))); // NOI18N
        title.setText("Data register");

        dateLbl.setText("Name");

        authorLbl.setText("Race");

        catLbl.setText("Color");

        edLbl.setText("Allergic");

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setPreferredSize(new java.awt.Dimension(200, 10));

        langLbl.setText("Special attention");

        pagsLbl.setText("Owner's name");

        txtOwnersName.setToolTipText("");

        descLbl.setText("Cel. Owner");

        txtCellOwner.setToolTipText("");

        stockLbl.setText("Observations");
        stockLbl.setToolTipText("");

        btnIncrese.setBackground(new java.awt.Color(255, 51, 51));
        btnIncrese.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnIncrese.setForeground(new java.awt.Color(255, 255, 255));
        btnIncrese.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/enviar.png"))); // NOI18N
        btnIncrese.setText("Increase");
        btnIncrese.setBorderPainted(false);
        btnIncrese.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnIncrese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncreseActionPerformed(evt);
            }
        });

        txtObservations.setColumns(20);
        txtObservations.setRows(5);
        jScrollPane2.setViewportView(txtObservations);

        cbxAllergic.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "YEAH", "NO" }));

        cbxSpecialAttention.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "YEAH", "NO" }));

        btnClean.setBackground(new java.awt.Color(255, 51, 51));
        btnClean.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnClean.setForeground(new java.awt.Color(255, 255, 255));
        btnClean.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/herramienta-de-borrador.png"))); // NOI18N
        btnClean.setText("Clean");
        btnClean.setBorderPainted(false);
        btnClean.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtColor)
                                    .addComponent(txtRace)
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addComponent(authorLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(233, 233, 233))
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addComponent(catLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(213, 213, 213))
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addComponent(dateLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(161, 161, 161))
                                    .addComponent(txtDogName)
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addComponent(edLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(227, 227, 227)))
                                .addGap(68, 68, 68))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(cbxAllergic, 0, 0, Short.MAX_VALUE)
                                .addGap(288, 288, 288)))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(langLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(300, 300, 300))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(pagsLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(295, 295, 295))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(descLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(278, 278, 278))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                                .addComponent(stockLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(319, 319, 319))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCellOwner, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtOwnersName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bgLayout.createSequentialGroup()
                                        .addComponent(btnIncrese, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnClean, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(130, 130, 130))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(cbxSpecialAttention, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(344, 344, 344))))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(493, 493, 493))))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(langLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbxSpecialAttention, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(pagsLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtOwnersName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(descLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCellOwner, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(stockLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnIncrese, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnClean, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(22, 22, 22))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(dateLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDogName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(authorLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRace, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(catLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbxAllergic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 820, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnIncreseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncreseActionPerformed
        this.registerData();
    }//GEN-LAST:event_btnIncreseActionPerformed

    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed
        this.cleanFields();
    }//GEN-LAST:event_btnCleanActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel authorLbl;
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnIncrese;
    private javax.swing.JLabel catLbl;
    private javax.swing.JComboBox<String> cbxAllergic;
    private javax.swing.JComboBox<String> cbxSpecialAttention;
    private javax.swing.JLabel dateLbl;
    private javax.swing.JLabel descLbl;
    private javax.swing.JLabel edLbl;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel langLbl;
    private javax.swing.JLabel pagsLbl;
    private javax.swing.JLabel stockLbl;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtCellOwner;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtDogName;
    private javax.swing.JTextArea txtObservations;
    private javax.swing.JTextField txtOwnersName;
    private javax.swing.JTextField txtRace;
    // End of variables declaration//GEN-END:variables
}
