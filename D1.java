package Train240309;

public class D1 {
   //pactorial
   // 5! = 5 * 4 * 3 * 2 * 1 = 120
	// 6! = 720
	public static int factorial(int number) {
		int sum = 1;
		for(int i =2; i<= number; i++)
			
		{
			sum *= i;
			// sum 변수에 i 값을 곱하고, 그 결과를 다시 sum에 저장
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		System.out.println("10팩토리얼은 " + factorial(10));
	}

}
