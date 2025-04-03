package s20404;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class frame {
    public static void main(String[] args) {
        JFrame fr = new JFrame("응프개발0403");
        
        // 이름 레이블과 텍스트필드
        JLabel nameLabel = new JLabel("이름:");
        nameLabel.setBounds(20, 30, 60, 30);
        fr.add(nameLabel);
        
        JTextField nameField = new JTextField();
        nameField.setBounds(80, 30, 180, 30);
        fr.add(nameField);
        
        // 나이 레이블과 텍스트필드
        JLabel ageLabel = new JLabel("나이:");
        ageLabel.setBounds(20, 70, 60, 30);
        fr.add(ageLabel);
        
        JTextField ageField = new JTextField();
        ageField.setBounds(80, 70, 180, 30);
        fr.add(ageField);
        
        // 주소 레이블과 텍스트필드
        JLabel addressLabel = new JLabel("주소:");
        addressLabel.setBounds(20, 110, 60, 30);
        fr.add(addressLabel);
        
        JTextField addressField = new JTextField();
        addressField.setBounds(80, 110, 180, 30);
        fr.add(addressField);
        
        // 결과 출력 레이블
        JLabel resultLabel = new JLabel("");
        resultLabel.setBounds(20, 150, 260, 30);
        resultLabel.setBorder(BorderFactory.createLineBorder(Color.RED));
        fr.add(resultLabel);
        
        // 입력완료 버튼
        JButton submitBtn = new JButton("입력완료");
        submitBtn.setBounds(15, 200, 90, 30);
        fr.add(submitBtn);
        
        submitBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String age = ageField.getText();
                String address = addressField.getText();
                
                resultLabel.setText(name + " (" + age + "세, " + address + ")");
            }
        });
        
        // 삭제 버튼
        JButton clearBtn = new JButton("삭제");
        clearBtn.setBounds(110, 200, 90, 30);
        fr.add(clearBtn);
        
        clearBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nameField.setText("");
                ageField.setText("");
                addressField.setText("");
                resultLabel.setText("");
            }
        });
        
        // 종료 버튼
        JButton exitBtn = new JButton("종료");
        exitBtn.setBounds(205, 200, 90, 30);
        fr.add(exitBtn);
        
        exitBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        // 프레임 설정
        fr.setSize(300, 300);
        fr.setLayout(null);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
