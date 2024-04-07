package Train240309;

public class B5 {
    final static int N = 15;

    public static void main(String[] args) {
        //for문 통해 원을 표현해보기
        // x^2 + y^2 = r^2  (^2는 제곱)
        for (int i = -N; i <= N; i++)
        {
            for (int j = -N; j <= N; j++)
            {
                if (i * i + j * j <= N * N) 
                {
                    System.out.print("*");
                } else 
                {
                    System.out.print(" ");
                }
            }
            System.out.println(); // 줄 바꿈 추가
        }
    }
}
