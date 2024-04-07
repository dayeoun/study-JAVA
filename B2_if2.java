package Train240309;

public class B2_if2 {

	public static void main(String[] args) {
		
	 String a = "Man";
	 int b = 0;
	 
	 // 자바는 String을 비교할때 equal()을 이용합니다.
	 // 그 이유는 string은 다른 자료형과 다른 문자열 자료형이기 때문입니다.
	   // string은 class 기반에 비원시적인자료인데 내부적인함수 equal을 사용해야하고
	
	 if(a.equals("Man"))
		 //만약 a함수기 Man 인지 equals() 통해 확인한다.
	 { 
		 System.out.println("남자입니다");
	 }
	else 
	 {
		 System.out.println("남자가 아님");
	 }
	 if ( b == 3)
	 {
		 System.out.println("b는 3입니다");
	 }
	 else
	 {
		 System.out.println("3이 아닙니다.");
	 }
	 if(a.equalsIgnoreCase("man") && b == 0) {
		 //equalsIgnoreCase 는 대소문자 관련없이, String문자열이
		 //man인지 비교해주는 메서드.
	  System.out.println("참");
	}
	else 
	 {
		 System.out.println("거짓");
	 }
}
}