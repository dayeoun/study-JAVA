package Train240309;

public class D1_1 { 
	
	public static int factorial(int number) {

		// 재귀함수 : 경우에따라 간결하게 함수를 표현
		// 자기안에 자기가 있다.
		// 머리속으로 그림을 그려가며, 함수를 이해하는게 중요함
		if(number == 1)
		return 1;
		
		else
			return number * factorial(number - 1);

	}

	public static void main(String[] args) {

		System.out.println("10팩토리얼은" + factorial(10));
	}

}