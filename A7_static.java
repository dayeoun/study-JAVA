package Train240309;

public class A7_static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int a = 50;
	int b = 60;
	
	System.out.println("최대값은 " + max(a,b) +"입니다");
		

	}

	
	// 반환형 , 함수이름 , 매개변수
static  int max(int a, int b) {
        	int result= (a>b)  ? a : b;
        	return result;
       // 함수(매개변수1,매개변수2)
         //새변수 설정=a가 b보다 크면? a. 아니면 b
        }
 // public에 static 있으면, 함수 맨 앞도 동일하게 static 있어야함 

}
