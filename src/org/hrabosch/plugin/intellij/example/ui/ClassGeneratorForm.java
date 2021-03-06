package org.hrabosch.plugin.intellij.example.ui;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import org.hrabosch.plugin.intellij.example.model.GeneratedClass;

/**
 * Form for class definition.
 *
 * @author hrabosch
 */
public class ClassGeneratorForm {

  private JPanel mainPanel;
  private JLabel classNameLabel;
  private JTextField classNameTextField;
  private JLabel hasPsvmLabel;
  private JPanel classNamePanel;
  private JRadioButton yesRadioButton;
  private JRadioButton noRadioButton;
  private JPanel psvmPanel;

  private GeneratedClass generatedClass;

  public ClassGeneratorForm(GeneratedClass generatedClass) {
    this.generatedClass = generatedClass;
    yesRadioButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        generatedClass.setHasPsvm(true);
      }
    });
    noRadioButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        generatedClass.setHasPsvm(false);
      }
    });
    classNameTextField.getDocument().addDocumentListener(new DocumentListener() {
      @Override
      public void insertUpdate(DocumentEvent e) {
        generatedClass.setClassName(classNameTextField.getText());
      }

      @Override
      public void removeUpdate(DocumentEvent e) {
        generatedClass.setClassName(classNameTextField.getText());
      }

      @Override
      public void changedUpdate(DocumentEvent e) {
        generatedClass.setClassName(classNameTextField.getText());
      }
    });
  }

  public JComponent getContent() {
    return mainPanel;
  }

  {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
    $$$setupUI$$$();
  }

  /**
   * Method generated by IntelliJ IDEA GUI Designer
   * >>> IMPORTANT!! <<<
   * DO NOT edit this method OR call it in your code!
   *
   * @noinspection ALL
   */
  private void $$$setupUI$$$() {
    mainPanel = new JPanel();
    mainPanel.setLayout(new GridLayoutManager(2, 1, new Insets(0, 0, 0, 0), -1, -1));
    classNamePanel = new JPanel();
    classNamePanel.setLayout(new GridLayoutManager(1, 3, new Insets(0, 0, 0, 0), -1, -1));
    mainPanel.add(classNamePanel,
        new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null,
            null, 0, false));
    classNameLabel = new JLabel();
    classNameLabel.setText("Class name:");
    classNamePanel.add(classNameLabel,
        new GridConstraints(0, 0, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0,
            false));
    classNameTextField = new JTextField();
    classNamePanel.add(classNameTextField,
        new GridConstraints(0, 2, 1, 1, GridConstraints.ANCHOR_WEST,
            GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW,
            GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
    psvmPanel = new JPanel();
    psvmPanel.setLayout(new GridLayoutManager(1, 3, new Insets(0, 0, 0, 0), -1, -1));
    mainPanel.add(psvmPanel,
        new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null,
            null, 0, false));
    hasPsvmLabel = new JLabel();
    hasPsvmLabel.setText("public static void main?");
    psvmPanel.add(hasPsvmLabel,
        new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0,
            false));
    yesRadioButton = new JRadioButton();
    yesRadioButton.setSelected(false);
    yesRadioButton.setText("Yes");
    psvmPanel.add(yesRadioButton,
        new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    noRadioButton = new JRadioButton();
    noRadioButton.setSelected(true);
    noRadioButton.setText("No");
    psvmPanel.add(noRadioButton,
        new GridConstraints(0, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    ButtonGroup buttonGroup;
    buttonGroup = new ButtonGroup();
    buttonGroup.add(yesRadioButton);
    buttonGroup.add(noRadioButton);
  }

  /**
   * @noinspection ALL
   */
  public JComponent $$$getRootComponent$$$() {
    return mainPanel;
  }
}
