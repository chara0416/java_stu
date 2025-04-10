package s20404;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class WinImage3 {
	ImageIcon CatIcon = new ImageIcon("Img/cat.png");
	ImageIcon DogIcon = new ImageIcon("Img/dog.jpg");
	
	Image catImg = CatIcon.getImage();
    Image resizeCatImg = catImg.getScaledInstance(220, 230, Image.SCALE_SMOOTH);
    ImageIcon rCatIcon = new ImageIcon(resizeCatImg);
    
    Image dogImg = DogIcon.getImage();
    Image resizeDogImg = dogImg.getScaledInstance(220, 230, Image.SCALE_SMOOTH);
    ImageIcon rDogIcon = new ImageIcon(resizeDogImg);
    
    WinImage3() {
    	lbEvent();
    }
    
	JLabel lb = new JLabel();
	void setLabel(String title) {
		lb.setText(title);
		lb.setHorizontalAlignment(JLabel.CENTER);
		lb.setOpaque(true); // 배경색 불투명하게
        lb.setBackground(Color.lightGray); // 배경색 변경
	}
	
	void lbEvent() {
		lb.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				if(lb.getText() == "1")
				lb.setIcon(rCatIcon);
				else if(lb.getText() == "2")
				lb.setIcon(rDogIcon);
				lb.setText(null);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame fr = new JFrame("맞추기 게임");
		
		WinImage3 lb1 = new WinImage3();
		lb1.setLabel("1");
		lb1.lb.setBounds(20, 10, 220, 230);
		fr.add(lb1.lb);
		
		WinImage3 lb2 = new WinImage3();
		lb2.setLabel("2");
		lb2.lb.setBounds(250, 10, 220, 230);
		fr.add(lb2.lb);
		
		WinImage3 lb3 = new WinImage3();
		lb3.setLabel("2");
		lb3.lb.setBounds(20, 250, 220, 230);
		fr.add(lb3.lb);
		
		WinImage3 lb4 = new WinImage3();
		lb4.setLabel("1");
		lb4.lb.setBounds(250, 250, 220, 230);
		fr.add(lb4.lb);
		
        fr.setSize(600,600);
	    fr.setLayout(null);
	    fr.setVisible(true);
	    fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
