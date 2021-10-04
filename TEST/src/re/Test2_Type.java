package re;

public class Test2_Type {

	public static void main(String[] args) {

		//기본타입
		int i = 1;
		float f = 1.0f;
		double d = 1.2;
		boolean b = true;
		char c = 'a';
		System.out.println("<<기본타입을 설명합니다.>>");
		System.out.println("int는\n"+i);
		System.out.println("float는 f붙이기\n"+f);
		System.out.println("double은 f없이도 소수 가능\n" +d);
		System.out.println("boolean은 참 거짓\n" + b);
		System.out.println("char은 한문자만\n" + c);

		//레퍼런스타입
		Integer ii = 1;
		Float ff = 1.0f;
		Double dd = 1.0;
		Boolean bb = true;
		Character cc = 'c';
		String ss = "안녕하세요";
		System.out.println("<<퍼런스을 설명합니다.>>");
		System.out.println("Integer는\n"+ii);
		System.out.println("Float는 f붙이기\n"+ff);
		System.out.println("Double은 f없이도 소수 가능\n" +dd);
		System.out.println("Boolean은 참 거짓\n" + bb);
		System.out.println("Character은 한문자만\n" + cc);
		System.out.println("String은 문자\n" + ss);

	}

}
