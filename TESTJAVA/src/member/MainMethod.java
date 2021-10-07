package member;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class MainMethod {
//		JFrame : GUI 프로그램만들기
//		DefaultTableMode : 테이블 데이터 관리
//		JTable : 테이블 생성
//		JScrollPnae : 스크롤식 패널 생성
	public static void main(String[] args) {
		//[프레임생성]
		JFrame frm = new JFrame("유닛정보관리툴");
		setJFrameStyle(frm);

		//[테이블생성]
		String titleArray[] = {"유닛명","공격력","방어력","스피드","종족"};
		DefaultTableModel model = new DefaultTableModel(titleArray,0);//배열을 컬럼에 등록
		JTable table = new JTable(model);//테이블생성 컬럼데이터 반영
		JScrollPane scrollPane = new JScrollPane(table);//테이블 띄울 스크롤형 패널
		scrollPane.getViewport().setBackground(Color.DARK_GRAY);//패널색(뷰포트배경색)
		scrollPane.setBounds(0,0,800,350);//가로위치,세로위치,가로길이,세로길이

		//[입력부분설정]
		JTextField tfName = new JTextField(6);
		JTextField tfAtk = new JTextField(6);
		JTextField tfDef = new JTextField(6);
		JTextField tfSp = new JTextField(6);
		JRadioButton rb1 = new JRadioButton("테란");
		JRadioButton rb2 = new JRadioButton("저그");
		JRadioButton rb3 = new JRadioButton("프로토스");
		rb1.setSelected(true); // 초기 라디오버튼 선택되어 있도록

		//[패널에 입력부분설정 표시]
		JPanel input_flow_panel = new JPanel();
		input_flow_panel.setLayout(new FlowLayout());//윈도우 창 벗어날시 자동 줄바꿈 설정
		input_flow_panel.setBackground(Color.GRAY);//패널 백그라운드 색 설정

		input_flow_panel.add(new JLabel("유닛명"));//패널에 유닛명 출려
		input_flow_panel.add(tfName);//패널에 유닛명 입력란 표시
		input_flow_panel.add(new JLabel("공격력"));
		input_flow_panel.add(tfAtk);
		input_flow_panel.add(new JLabel("방어력"));
		input_flow_panel.add(tfDef);
		input_flow_panel.add(new JLabel("수비력"));
		input_flow_panel.add(tfSp);
		input_flow_panel.add(rb1);
		input_flow_panel.add(rb2);
		input_flow_panel.add(rb3);

		input_flow_panel.setBounds(0,350,800,50);

		//[추가버튼생성] [버튼설정함수 호출]
		JButton add_btn = new JButton("추가");
		setJButtonStyle(add_btn);
		JButton del_btn = new JButton("삭제");
		setJButtonStyle(del_btn);

		//[버튼 패널에 출력]
		JPanel btn_flow_panel = new JPanel(); //패널생성
		btn_flow_panel.setLayout(new FlowLayout()); //가운데 배치, 윈도우창벗어날 시 줄바꿈
		btn_flow_panel.add(add_btn);
		btn_flow_panel.add(del_btn);
		btn_flow_panel.setBackground(Color.LIGHT_GRAY);
		btn_flow_panel.setBounds(0,400,500,100);

		//[버튼클릭이벤트]
		ActionListener action = new ActionListener() {
			@Override //어노테이션 오버라이드했다는걸 표시위해
			public void actionPerformed(ActionEvent e) {
				//[추가버튼 이벤트 설정]
				if(e.getActionCommand().equals("추가")) {
					//[값 테이블에 추가]
					String info[] = new String[5]; //배열 만들기 크기설정에 주의
					info[0] = tfName.getText();
					info[1] = tfAtk.getText();
					info[2] = tfDef.getText();
					info[3] = tfSp.getText();
					if(rb1.isSelected()) {
						info[4] = "테란";
					}
					else if (rb2.isSelected()){
						info[4] = "저그";
					}
					else if(rb3.isSelected()) {
						info[4] = "프로토스";
					}
					//[테이블 모델에 텍스트들 삽입]
					model.addRow(info);

					//[입력후 필드값 초기화]
					tfName.setText("");
					tfAtk.setText("");
					tfDef.setText("");
					tfSp.setText("");
					rb1.setSelected(true);
					rb2.setSelected(false);
					rb3.setSelected(false);
				}
				else if(e.getActionCommand().equals("삭제")) {
					//[마지막줄 확인]
					int rowIndex = table.getSelectedRow();
					//[미선택시 리턴값 = -1]
					if(rowIndex == -1) {
						return;
					}
					model.removeRow(rowIndex);
				}
				//[라디오버튼 클릭시 이벤트 설정]
				else if(e.getActionCommand().equals("테란")) {
					if(rb1.isSelected()==true) {
						rb2.setSelected(false);
						rb3.setSelected(false);
					}
				}
				else if(e.getActionCommand().equals("저그")) {
					if(rb2.isSelected()==true) {
						rb1.setSelected(false);
						rb3.setSelected(false);
					}
				}
				else if(e.getActionCommand().equals("프로토스")) {
					if(rb3.isSelected()==true) {
						rb1.setSelected(false);
						rb2.setSelected(false);
					}
				}
			}
		};
		add_btn.addActionListener(action);
		del_btn.addActionListener(action);
		rb1.addActionListener(action);
		rb2.addActionListener(action);
		rb3.addActionListener(action);

		//[부모 프레임에다가 자식 컴포넌트 추가]
		frm.getContentPane().add(scrollPane, BorderLayout.CENTER);
		frm.getContentPane().add(input_flow_panel);
		frm.getContentPane().add(btn_flow_panel);


		//[부모 프레임이 보이도록 설정]
		frm.setVisible(true);
	}

	public static void setJFrameStyle(JFrame frame) {
		frame.setSize(500,500);
		frame.setBackground(Color.BLACK); // 백그라운드 색
		frame.setLocationRelativeTo(null); //화면 가운데 배치
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 닫기시 메모리에서 제거 되도록설정
		frame.setResizable(false); //창크기 고정
		frame.getContentPane().setLayout(null);//부모 레이아웃 설정
	}
	public static void setJButtonStyle(JButton btn) {
		btn.setBackground(Color.BLACK); // 백그라운드 색
		btn.setForeground(Color.WHITE); // 텍스트 색
		btn.setFont(new Font("맑은고딕",0,20)); //폰트정의
		btn.setHorizontalAlignment(JLabel.CENTER); //텍스트 가운데 표시
	}
}
