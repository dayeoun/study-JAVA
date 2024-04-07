package Train240309;

public class C3 {

	public static void main(String[] args) {
	System.out.println("Hello world의 마지막 단어는" + function("Hello world"));
		
		//lenght() 를 이용해서 문자열의 특정 문자를 얻기
		
		

	}

	private static char function(String input) {
		return input.charAt(input.length() - 1);
		
	}

}
