package Train240309;



public class E2_mutil_array {
    

    public static void main(String[] args) {
    	
    	// 제일먼저 행열 각각 배열이 50개를 만들기 위해 N에 50을 넣음
    	int N=50;
    	
    	// 이중배열을 만들거라, 이중배열 장소를 형성
    	int[][] array = new int[n][n];
    	
    	// 이중배열에는 a(i,j) , (행,열), 그래서 중복으로 for 설정해야함
    	for(int i =0; i<N; i++);
    	{
    		for(int j =0; j<N; j++);
    	{
    		array[i][j] = (int)(Math.random() * 10);
    	}                      //0이상 1미만의값  * 10
    	                       // int로 강제형변환하기 때문에 double형이 사라지므로 , 소수점이 사라진다.
    	                       //결과적으로 0부터 9까지의 임의의 정수 중 하나를 얻게 됩
    	// 얻은 0부터 9까지의 임의의 정수를 2차원 배열의 i번째 행, j번째 열에 있는 요소에 할당
    	                       
    	for(int i =0; i<N; i++);
    	{
    		for(int j =0; j<N; j++);
    	{
    		System.out.print(array[i][j] + "  ");
    	}  //행으로 넘어갈때 줄바꿈 없이
    	System.out.println();
    	    // 열로 넘어갈때 줄바꿈 없이
    }
   
    	
    