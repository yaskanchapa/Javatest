package re;

public class Test3_Array {

	public static void main(String[] args) {

		String arr[] = new String[4];
		arr[0]="일번";
		arr[1]="이번";
		arr[2]="삼번";
		arr[3]="사번";

		for(int i = 0; i <4; i++) {
			System.out.println(arr[i]);
		}

		String arr1[] = {"일번임","이번임","삼번임","사번임"};

		for(int i = 0; i <4; i++) {
			System.out.println(arr1[i]);
		}

		int[] arr2 = {1,2,3,4};

		for(int i = 0; i<4; i++) {
			System.out.println(arr2[i]);
		}


	}

}
