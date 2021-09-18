package swing;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class GuiSwing {

    public static void main(String[] args){
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("HelloWorld GUI");
//              x버튼
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setPreferredSize(new Dimension(400, 300));

//              label에다가 값 넣었고 Pane메소드에 추가 시킴
                JLabel label = new JLabel("Hello World!!", SwingConstants.CENTER);
                frame.getContentPane().add(label);

//              창 의 출력위치
                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
				frame.setLocation(dim.width/2-400/2, dim.height/2-300/2);

//				실행함수
				frame.pack();
				frame.setVisible(true);

            }
		});
	}
}
