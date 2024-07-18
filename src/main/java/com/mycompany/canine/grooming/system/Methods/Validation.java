package com.mycompany.canine.grooming.system.Methods;

import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Validation {

    public static String fieldValidations(JTextField txtDogName, JTextField txtRace,
            JTextField txtColor, JComboBox cbxAllergic, JComboBox cbxSpecialAttention,
            JTextField txtOwnersName, JTextField txtCellOwner, JTextArea txtObservations) {

        if (txtDogName.getText().trim().isEmpty()) {
            txtDogName.requestFocus();
            return "DOG NAME";
        }

        if (txtRace.getText().trim().isEmpty()) {
            txtRace.requestFocus();
            return "RACE";
        }

        if (txtColor.getText().trim().isEmpty()) {
            txtColor.requestFocus();
            return "COLOR";
        }

        if (cbxAllergic.getSelectedItem().equals("-")) {
            cbxAllergic.requestFocus();
            return "ALLERGIC";
        }
        if (cbxSpecialAttention.getSelectedItem().equals("-")) {
            cbxSpecialAttention.requestFocus();
            return "Special Attention";
        }

        if (txtOwnersName.getText().trim().isEmpty()) {
            txtOwnersName.requestFocus();
            return "OWNERS NAME";
        }

        try {

            int n = Integer.parseInt(txtCellOwner.getText());
            
            if ( n < 0 || txtCellOwner.getText().trim().isEmpty()) {
                txtCellOwner.requestFocus();
                return "CELL OWNER";
            }
        } catch (NumberFormatException e) {
                return "CELL OWNER";
        }

        if (txtObservations.getText().trim().isEmpty()) {
            txtObservations.requestFocus();
            return "OBSERVATIONS";
        }
        return "";
    }

}
