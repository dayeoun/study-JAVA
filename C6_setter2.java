package Train240309;

public class C6_setter2 {
	
	static class Lock {
		// 변수 설정
		private String password;
		
		// 생성자 설정
		public Lock(String p) {
			password = p;
		}
		
		// getPassword() 메서드 추가
		public String getPassword() {
			return password;
		}
		
		//메소드 설정
				// toString() 은 문자열을 반환하기 위해 사용
				//기본적으로 내장되어 있는 메서드
				//재정의하는 이유는 객체를 문자열로 표현할 때 특정한 형식을 사용하고자 할 때
				
				//String.format()toString() {
		
//		public String toString() {
//			 return String.format("Lock {password: %s } ",password);
//		}
		// format("Lock {password: %s } ",password
		// 대체할 수 있는 값/
		// 맨끝에 password가 있어, password에 지정된 문자열이 대체되서 출력
		// 맨끝에 password가 없으면 대체되지 않은상태로 문자열 그대로 출력됨
  //비밀번호 변경위해 세터 메서드를 추가.
		
		// setPassword 추가하기
		// setPassword() 메서드 추가
		public void setPassword(String pw) {
			password = pw;
		}
		
		//객체 내부의 password 변수에 직접 접근하지 않고, 
		//메서드를 통해 값을 설정함으로써 캡슐화를 유지
	
		// toString() 메서드 재정의
		@Override
		public String toString() {
			return String.format("Lock {password: %s }", password);
		}
	}

	public static void main(String[] args) {
		// 객체 및 변수 할당
		Lock lock = new Lock("123!@#");
		
		// 객체 비밀번호 변경
		lock.setPassword("654#@!");
		
		// 객체 정보 출력
		System.out.println(lock.toString());
	}
}