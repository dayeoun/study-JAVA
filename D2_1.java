package Train240309;

public class D2_1 {
	
	
	public static int finonacci(int number) {
		
        if(number == 1) {
			
			return 1;
		}
		else if(number == 2) {
			
			return 2;
		}
		else 
		{
			return finonacci(number -1) + finonacci(number -2);
		//피보나치수열은 전의 값과 그 전전의값을 더해서 나온 결과가 현재이기 때문이다	
		}
	}
//때에 따라서 간결한 코드를 제공하지만, 수치가 올라가면 올라갈 수록 연산의 양이 매우 늘어나서 컴퓨터에 치명적
	public static void main(String[] args) {
		System.out.println("피보나치 수열의 -1함수는 " +
	  finonacci(-1) + "입니다");
	  		

	}

}
