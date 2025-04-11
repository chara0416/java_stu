package s20404;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CardGame {
	int cardNum;				// 카드의 위치번호
	int imgNum;					// 카드에 표시할 이미지 번호
	int cardWidth, cardHeight;	// 카드 가로 세로 사이즈
	boolean cardStatus = false; // 엎어진 상태 false 
	
	ImageIcon imgA ;
	Image imgA_1 ;
    Image imgA_2;
    ImageIcon cardImage;
    
    JLabel cardLabel;
    
    CardGame(int cardN, int imgN){ // 카드가 생성될때 카드번호, 이미지번호를 받음
    	cardNum = cardN;
    	imgNum = imgN;
    	cardWidth = 200; // 카드 가로크기
    	cardHeight = 200; // 카드 세로크기
    	
    	imgA = new ImageIcon("img/"+imgN+".jpg"); // 파일이름 : img/2.jpg
    	imgA_1 = imgA.getImage();
        imgA_2 = imgA_1.getScaledInstance(225, 225, Image.SCALE_SMOOTH);
        cardImage = new ImageIcon(imgA_2);
        
        cardLabel = new JLabel();
        setLabel(); //라벨의 초기 세팅 메소드
        lbEvent(); 
    }
	
	void setLabel() {
		cardLabel.setOpaque(true); // 불투명도
		cardLabel.setBackground(Color.LIGHT_GRAY);
		
		int x =(cardWidth+10)*(cardNum-1) + 10;
		cardLabel.setBounds(x , 10, cardWidth, cardHeight);
		
	}
	
	void lbEvent() {
		cardLabel.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				cardLabel.setIcon(cardImage);
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
		
		// card 를 배열로 생성
		// 이미지번호를 랜덤으로 입력, 2개씩만 입력되도록
		// frame add 도 반복문 처리
		// 맞았는지 판단하고, 틀리면 다시 뒤짚히기
		CardGame card1 = new CardGame(1, 1); //1번카드, 이미지 번호 1
		CardGame card2 = new CardGame(2, 2); //2번카드, 이미지 번호 2
		CardGame card3 = new CardGame(3, 2); //3번카드, 이미지 번호 2
		CardGame card4 = new CardGame(4, 1); //4번카드, 이미지 번호 1
		fr.add(card1.cardLabel);
		fr.add(card2.cardLabel);
		fr.add(card3.cardLabel);
		fr.add(card4.cardLabel);
		
		fr.setSize(900,300);
	    fr.setLayout(null);
	    fr.setVisible(true);
	    fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
