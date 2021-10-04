package re;

import java.util.ArrayList;
import java.util.List;

public class Test4_List {

	public static void main(String[] args) {

		List<String> foodList = new ArrayList<String>();

		foodList.add("만두");
		foodList.add("피자");
		foodList.add("햄버거");
		foodList.add("치킨");

		for(String foodname:foodList) {
			System.out.println(foodname);
		}
	}

}
