import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class App {
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame("Olá, Mundo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(null);

        
        JLabel label = new JLabel("Olá, Mundo!!!", JLabel.CENTER);
        label.setBounds(28, 100, 360, 40);

        frame.add(label);

        JTextField textField = new JTextField();
        textField.setBounds(20, 180, 360, 40);
        frame.add(textField);
        

        JButton button = new JButton("Botão");
        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null, "Botão Acionado!");
            }
        });
        button.setBounds(20, 130, 360, 40);
        frame.add(button);
        
        frame.setVisible(true);
    }
}
