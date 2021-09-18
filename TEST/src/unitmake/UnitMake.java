package unitmake;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

//유닛을 생성하는 메소드가 담긴 클래스
public class UnitMake {

	public UnitBean 유닛설정() {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		UnitBean ub1 = new UnitBean();
		ub1.setName(sc.next());
		ub1.setAtk(rd.nextInt(100));
		ub1.setDef(rd.nextInt(100));
		ub1.setSp(rd.nextInt(100));
		return ub1;
	}

	List<UnitBean> 유닛리스트 = new ArrayList<UnitBean>();
	public List<UnitBean> 리스트담기() {
		유닛리스트.add(유닛설정());
		System.out.println("유닛의 정보가 리스트에 저장되었습니다.\n");
		return 유닛리스트;
	}

	public void 유닛생성() {
		System.out.println("유닛은 3마리까지 생성가능합니다.능력치는 랜덤부여됩니다.");
		for(int i = 1; i < 4; i++) {
			System.out.println("<<"+i+"번째 유닛을 생성합니다>>");
			System.out.println("유닛명을 입력해주세요");
			리스트담기();
		}
		System.out.println("------------유닛생성이 완료되었습니다.------------");
		System.out.println("<<<<<<현재 리스트에 담긴 유닛은 이하와 같습니다.>>>>>>");
		출력();
	}

	public void 출력() {
		for(UnitBean 유닛빈 : 유닛리스트) {
			System.out.println("<<유닛명:" + 유닛빈.getName()+">>");
			System.out.println("공력력:" + 유닛빈.getAtk());
			System.out.println("수비력:" + 유닛빈.getDef());
			System.out.println("방어력:" + 유닛빈.getSp());
		}
	}
}
