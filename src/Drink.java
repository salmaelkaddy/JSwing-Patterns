import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Drink extends JFrame  {
    private JButton addDrinkButton;
    private JCheckBox espressoCheckBox;
    private JCheckBox frenchCoffeeCheckBox;
    public JPanel panelMain;

    public Drink() {
        addDrinkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(espressoCheckBox.isSelected() || frenchCoffeeCheckBox.isSelected()) {
                    DrinkCustomize drinkCustomize = new DrinkCustomize();
                    drinkCustomize.setTitle("Customize");
                    drinkCustomize.setContentPane(drinkCustomize.cpanel);
                    drinkCustomize.setVisible(true);

                }else{
                    JOptionPane.showMessageDialog(null, "Please select espresso or french coffee");
                }
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
