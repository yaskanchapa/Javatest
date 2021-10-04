package re;

import java.util.HashMap;
import java.util.Map;

public class Test5_Map {

	public static void main(String[] args) {

		Map<String,String> unitMap = new HashMap<String,String>();

		unitMap.put("테란","마린");
		unitMap.put("저그","저글링");
		unitMap.put("프로토스","질럿");

		for(String name : unitMap.keySet()) {
			System.out.println("현재 key값:"+name);
			System.out.println("현재 key값의 값:"+unitMap.get(name));
		}
	}
}
