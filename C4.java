//public class C4{
//	
//	public static void main(String[] args) {
//        // 주어진 정수들 중에서 가장 큰 값을 출력
//        System.out.println(" 345 , 567, 798) 중에서 가장 큰 값은 : " + findMax(345, 567, 798));
//    }
//	
//	// 주어진 두 정수 중에서 큰 값을 반환하는 메서드
//	// (condition) ? (value if true) : (value if false)
//	// 만약 condition이 true이면 value if true를 반환하고,
//	// 그렇지 않으면 value if false를 반환
//	// 즉, 만약 a가 b보다 크다면 a를 반환하고, 그렇지 않으면 b를 반환
//	public static int max(int a, int b) {
//        return (a > b) ? a : b;
//    }
//
//    // 주어진 세 정수 중에서 가장 큰 값을 반환하는 메서드
//    public static int findMax(int a, int b, int c) {
//        int result = max(a, b);
//        result = max(result, c);
//        return result;
////    
//}
// 주어진 코드를 살펴보면 findMax 메서드를 호출하는 main 메서드에서 컴파일 오류가 발생할 가능성이 있습니다. 이유는 findMax 메서드가 클래스 내부에 선언되어 있기 때문입니다.
//  따라서 메서드를 호출하기 전에 선언되어야 합니다.

public class C4 {
    // 주어진 두 정수 중에서 큰 값을 반환하는 메서드
    // (condition) ? (value if true) : (value if false)
    // 만약 condition이 true이면 value if true를 반환하고,
    // 그렇지 않으면 value if false를 반환
    // 즉, 만약 a가 b보다 크다면 a를 반환하고, 그렇지 않으면 b를 반환
    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    // 주어진 세 정수 중에서 가장 큰 값을 반환하는 메서드
    public static int findMax(int a, int b, int c) {
        int result = max(a, b);
        result = max(result, c);
        return result;
    }

    public static void main(String[] args) {
        // 주어진 정수들 중에서 가장 큰 값을 출력
        System.out.println(" 345 , 567, 798) 중에서 가장 큰 값은 : " + findMax(345, 567, 798));
    }
}



