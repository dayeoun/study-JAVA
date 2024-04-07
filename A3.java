package Train240309;

public class A3 {

	public static void main(String[] args) {
      
		// 아스키코트 기반의 char형을 사용해 a 부터 z까지
		// 출력하는 프로그램을 작성
		// 반복문 응용해서
		
		//for(char i = 'a';  i <= 'z'; i++ )
			// i는 a부터 출발해서 i가 z에 도달할 때 까지
			// i를 1씩 증가시키면서,
			// i는 z 이하. 
		    //아스키코드는 알파넷이 숫자로 되어있음.
		//System.out.println(i + " ");	
		

//		for(char i = 'c'; i<='f'; i++ )
//			System.out.println(i);
//		
		//10진수를 10진수,8진수,16진수로 바꾸기
		int a = 200;
		System.out.println("10진수 :" + a);
		System.out.println("8진수 : %o\n" + a);
		//%o 는 형식지정자, 의미: 10진수를 8진수로
		//a 값이 %에 위치하게됨,
		System.out.println("16진수 :%x" + a);
		//%o 는 형식지정자, 의미: 10진수를 16진수로
				//a 값이 %에 위치하게됨,
		
		
		
   }
}