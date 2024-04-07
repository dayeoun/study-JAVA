package Train240309;

public class B4_for {
	
	final static int N = 30;

	public static void main(String[] args) {
		
//for 문 : i를 초기화, i의 조건범위, 조건에 속하는동안 연산부분
		for(int i = N; i > 0; i--) {
			//         i가 0이상일때까지 반복된다. 즉 0이면 반복종료
//			i가 0이상일때, i에 값1을 뺀다.
			 
			// System.out.print("*");
//			 i가 한번 반복할때마다 *이 출력,
//			 총 30*이 출력. 
////		
			
			// 30에서 1씩 감소된다, 0이하가 될때까지 반복. 그리고
			// 반복 for통해 i가 29일때 * 29개 표기하고, 그뒤에 1개씩 감소하는 
			//결과로 반복되서 보여줌
			for(int j = i; j > 0; j--) {
				System.out.print("#");
			}
			
			System.out.println();
  	}
	}
}
