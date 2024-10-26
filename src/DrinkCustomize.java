import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrinkCustomize extends JFrame {
    private JButton Add;
    private JCheckBox milkCheckBox;
    private JCheckBox whippedCreamCheckBox;
    public JPanel cpanel;

    public DrinkCustomize() {
        Add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(milkCheckBox.isSelected() || whippedCreamCheckBox.isSelected()) {
                    JOptionPane.showMessageDialog(cpanel, "Added successfully to your order!", "Customized", JOptionPane.INFORMATION_MESSAGE);
                    MakeOrder mo = new MakeOrder();
                    mo.setTitle("Customize");
                    mo.setContentPane(mo.Make);
                    mo.setVisible(true);
                } else{
                    JOptionPane.showMessageDialog(cpanel, "Please select a milk and a whipped cream");
                }
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
