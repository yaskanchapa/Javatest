package game;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Display {

	private JFrame frame;
	private String title;
	private int width, height;

//	값 설정
	public Display(String title, int width, int height) {
		this.title = title;
		this.width = width;
		this.height = height;

		createDisplay();
	}

//	윈도우 설정
	public void createDisplay() {
		frame = new JFrame(title);
		frame.setSize(width,height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
//		켄버스
		Canvas canvas = new Canvas();
		canvas.setPreferredSize(new Dimension(width,height));
		canvas.setMaximumSize(new Dimension(width,height));
		canvas.setMinimumSize(new Dimension(width,height));
//		켄버스를 추가(켄버스(도화지)에 그린후 프레임에 끼운단 이미지)
		frame.add(canvas); //프레임에 끼우기(add)
		frame.pack(); //pack메서드 호출


	}
}
