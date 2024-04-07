package Train240309;

public class B1_root {

	public static void main(String[] args) {
		//조건문과 반복문
		// 논리적인 흐름을 결정하는 기술.논리의 흐름
		
		
		// if 이용해서 특정 문자열 포함하는 것
		String a = "I lobe YOU";
		if(a.contains("Love")) {
			//만약(조건- 선언한 a변수에서 Love를 찾는 특정메소드 (contains)
			                                  //오직 spring에서 사용
         // love가 포함되면 실행 	                                                      		
			System.out.println("Me too");
		} else { //love가 포함안되면 실행하는부분
			System.out.println("I don't no");
		}
		

	}

}
