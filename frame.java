package s20404;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frame {

	public static void main(String[] args) {
        JFrame frame = new JFrame("응프개발0403");
        
        JLabel nameLabel = new JLabel("이름:");
        nameLabel.setBounds(20, 30, 60, 30);
        frame.add(nameLabel);
        
        JTextField nameField = new JTextField();
        nameField.setBounds(80, 30, 180, 30);
        frame.add(nameField);
        
        JLabel ageLabel = new JLabel("나이:");
        ageLabel.setBounds(20, 70, 60, 30);
        frame.add(ageLabel);
        
        JTextField ageField = new JTextField();
        ageField.setBounds(80, 70, 180, 30);
        frame.add(ageField);
        
        JLabel addressLabel = new JLabel("주소:");
        addressLabel.setBounds(20, 110, 60, 30);
        frame.add(addressLabel);
        
        JTextField addressField = new JTextField();
        addressField.setBounds(80, 110, 180, 30);
        frame.add(addressField);
        
        JButton inputBtn = new JButton("입력완료");
        inputBtn.setBounds(20, 160, 90, 30);
        frame.add(inputBtn);
        
        JButton clearBtn = new JButton("삭제");
        clearBtn.setBounds(120, 160, 80, 30);
        frame.add(clearBtn);
        
        JButton exitBtn = new JButton("종료");
        exitBtn.setBounds(210, 160, 80, 30);
        frame.add(exitBtn);
        
        JLabel output = new JLabel();
        output.setBounds(20, 210, 260, 30);
        frame.add(output);
        
        inputBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String age = ageField.getText();
                String address = addressField.getText();
                
                output.setText(name + " (" + age + "세, " + address + ")");
            }
        });
        
        clearBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nameField.setText("");
                ageField.setText("");
                addressField.setText("");
                output.setText("");
            }
        });
        
        exitBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
