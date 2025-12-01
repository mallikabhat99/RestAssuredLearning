package restassured.interview;

public class PrimeNumbers {
    public static void main(String[] args) {
        int num = 30;  // Define the upper limit
        int count;  // Initialize counter for divisibility checks
        // Iterate from 1 up to 'num' to identify prime numbers
        for(int i=1;i<=num;i++){
            count = 0;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    count++;
                    break;
                }
            }
            if(count==0){
                System.out.println(i);
            }
        }
    }
}
//0k