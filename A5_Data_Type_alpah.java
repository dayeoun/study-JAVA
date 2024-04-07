package Train240309;

public class A5_Data_Type_alpah {
	public static void main(String[] args) {
	
	
	
	//기본적으로 정수를 나타내는 자료형이 많은 이유은
	//긱 자료형이 차지하는 메모리 공간 크기가 다르기 때문
	// double형이라고 해도 과도하게 큰 수 저장하면 잘못된 결과가 나옴
	// 소수점 표기형식을 지수형식으로 출력하고 싶으면 %e 를 ㅣㅇ용하면됨
	// 자바에서 string은 클래스 기반의 비원시적인 자료형이다
	
	int a = 10;
	System.out.println("현재의 a는" + a + "입니다");
	a++; // 후위증가. 값을 먼저 내놓고, 그 뒤에 1더하기
	
	System.out.println("현재의 a는" + a + "입니다"); //11
	System.out.println("현재의 a는" + ++a + "입니다"); //12
	System.out.println("현재의 a는" + a++ + "입니다"); // 12
	System.out.println("현재의 a는" + a + "입니다"); // 13
	
	 

    }
}
