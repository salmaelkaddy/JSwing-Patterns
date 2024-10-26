import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MakeOrder extends JFrame {
    private JButton makeOrderButton;
    public JPanel Make;

    public MakeOrder() {
        makeOrderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Drink d = new Drink();

            }
        });
    }
}
