package Train240309;



public class E1_array {
	
	
    

    public static void main(String[] args) {
   
    	//배열 index 설정
    	int [] array =new int[100];
    	
    	// 배열 범위
    	for(int i=0; i<100; i++) {
    		
    		//배열 각각 범위
    		 array[i] = (int) (Math.random() * 100 + 1);
    	}
    	
    	int sum=0;
    	for(int i =0; i<100; i++) {
    		sum += array[i];
    	}
    	
    	System.out.println("100개의 랜덤점수의 평균값은" + sum / 100 + "입니다");
    	}
    }
