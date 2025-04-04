package s20404;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class WinImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame fr = new JFrame();
		ImageIcon CatIcon = new ImageIcon("Img/cat.png");
		ImageIcon DogIcon = new ImageIcon("Img/dog.jpg");
		
		JLabel lb1 = new JLabel();
		lb1.setBounds(10, 10, 218, 231);
		lb1.setIcon(CatIcon);
        fr.add(lb1);
        
        Image catImg = CatIcon.getImage();
        Image resizeCatImg = catImg.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon rCatIcon = new ImageIcon(resizeCatImg);
        
        JLabel lb2 = new JLabel(rCatIcon);
		lb2.setBounds(240, 10, 100, 100);
		//lb2.setIcon(CatIcon);
        fr.add(lb2);
        
        JLabel lb3 = new JLabel();
		lb3.setBounds(10, 250, 225, 225);
		lb3.setIcon(DogIcon);
        fr.add(lb3);
        
        Image dogImg = DogIcon.getImage();
        Image resizeDogImg = dogImg.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon rDogIcon = new ImageIcon(resizeDogImg);
        
        JLabel lb4 = new JLabel(rDogIcon);
		lb4.setBounds(240, 250, 100, 100);
		//lb4.setIcon(DogIcon);
        fr.add(lb4);
        
        fr.setSize(600,600);
	    fr.setLayout(null);
	    fr.setVisible(true);
	    fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
	     

	}
}
