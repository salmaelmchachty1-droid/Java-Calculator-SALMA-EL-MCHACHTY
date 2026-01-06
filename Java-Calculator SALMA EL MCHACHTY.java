public class Calculator extends javax.swing.JFrame {

    double firstnum;
    double secondnum;
    double result;
    String operations;

    public Calculator() {
        initComponents();
    }

    // Boutons chiffres
    private void jBtn1ActionPerformed(java.awt.event.ActionEvent evt) {
        jtxtDisplay.setText(jtxtDisplay.getText() + jBtn1.getText());
    }

    private void jBtn2ActionPerformed(java.awt.event.ActionEvent evt) {
        jtxtDisplay.setText(jtxtDisplay.getText() + jBtn2.getText());
    }

    private void jBtn3ActionPerformed(java.awt.event.ActionEvent evt) {
        jtxtDisplay.setText(jtxtDisplay.getText() + jBtn3.getText());
    }

    private void jBtn4ActionPerformed(java.awt.event.ActionEvent evt) {
        jtxtDisplay.setText(jtxtDisplay.getText() + jBtn4.getText());
    }

    private void jBtn5ActionPerformed(java.awt.event.ActionEvent evt) {
        jtxtDisplay.setText(jtxtDisplay.getText() + jBtn5.getText());
    }

    private void jBtn6ActionPerformed(java.awt.event.ActionEvent evt) {
        jtxtDisplay.setText(jtxtDisplay.getText() + jBtn6.getText());
    }

    private void jBtn7ActionPerformed(java.awt.event.ActionEvent evt) {
        jtxtDisplay.setText(jtxtDisplay.getText() + jBtn7.getText());
    }

    private void jBtn8ActionPerformed(java.awt.event.ActionEvent evt) {
        jtxtDisplay.setText(jtxtDisplay.getText() + jBtn8.getText());
    }

    private void jBtn9ActionPerformed(java.awt.event.ActionEvent evt) {
        jtxtDisplay.setText(jtxtDisplay.getText() + jBtn9.getText());
    }

    private void jBtn0ActionPerformed(java.awt.event.ActionEvent evt) {
        jtxtDisplay.setText(jtxtDisplay.getText() + jBtn0.getText());
    }

    // Opérations
    private void jBtnPlusActionPerformed(java.awt.event.ActionEvent evt) {
        firstnum = Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText("");
        operations = "+";
    }

    private void jBtnMinusActionPerformed(java.awt.event.ActionEvent evt) {
        firstnum = Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText("");
        operations = "-";
    }

    private void jBtnMultiplyActionPerformed(java.awt.event.ActionEvent evt) {
        firstnum = Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText("");
        operations = "*";
    }

    private void jBtnDivideActionPerformed(java.awt.event.ActionEvent evt) {
        firstnum = Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText("");
        operations = "/";
    }

    // Egal
    private void jBtnEqualsActionPerformed(java.awt.event.ActionEvent evt) {
        secondnum = Double.parseDouble(jtxtDisplay.getText());

        if (operations.equals("+"))
            result = firstnum + secondnum;
        else if (operations.equals("-"))
            result = firstnum - secondnum;
        else if (operations.equals("*"))
            result = firstnum * secondnum;
        else if (operations.equals("/"))
            result = firstnum / secondnum;

        jtxtDisplay.setText(String.valueOf(result));
    }

    // +/-
    private void jBtnPlusMinusActionPerformed(java.awt.event.ActionEvent evt) {
        double ops = Double.parseDouble(jtxtDisplay.getText());
        ops = ops * (-1);
        jtxtDisplay.setText(String.valueOf(ops));
    }
}
// by salma EL MCHACHTY