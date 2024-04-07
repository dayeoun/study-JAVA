package Train240309;

public class D2 {

	public static int finonacci(int number) {
		int one=1;
		int two=2;
		int result = -1; // -1 넣은건 피보나치 수열에 문제가 생겼다는걸 알려주는 보험용으로 만듬
		
		if(number == 1) {
			
			return one;
		}
		else if(number == 2) {
			
			return two;
		}
		else {
			
			for(int i = 2;  i<number; i++)
			{
				result = one + two;
				one = two;
				two = result;
			}
		}
		return result;
	}
   	

	public static void main(String[] args) {
		System.out.println("피보나치 10번째 수열은" + finonacci(10));

	}

}
