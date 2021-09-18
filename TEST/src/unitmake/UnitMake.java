package unitmake;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

//유닛을 생성하는 메소드가 담긴 클래스
public class UnitMake {
	Scanner sc = new Scanner(System.in);
	Random rd = new Random();

	public UnitBean 유닛설정() {

		UnitBean ub1 = new UnitBean();
		ub1.setName(sc.next());
		ub1.setAtk(랜덤숫자생성());
		ub1.setDef(랜덤숫자생성());
		ub1.setSp(랜덤숫자생성());
		int atk = ub1.getAtk();
		int def = ub1.getDef();
		int sp = ub1.getSp();
		ub1.setTier(티어판별(atk,def,sp));
		return ub1;
	}
	public int 랜덤숫자생성() {
		int rn;
		rn = rd.nextInt(100);
		return rn;
	}
	public String 티어판별(int atk, int def, int sp) {
		int avg = (atk+ def+ sp)/3;
		String 티어;
		if(avg < 50) {
			티어 = "E등급";
		}else if(avg < 60) {
			티어 = "D등급";
		}else if(avg < 70) {
			티어 = "C등급";
		}else if(avg < 80) {
			티어 = "B등급";
		}else if(avg < 90) {
			티어 = "A등급";
		}else {
			티어 = "S등급";
		}
		return 티어;
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
			System.out.println("티어:" + 유닛빈.getTier());
		}
	}
}
