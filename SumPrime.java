
public class SumPrime {
	 
    public static void main(String args[]){
         
        int num = 2;
        int count = 0;
        long sum = 0;
        while(count < 1000){
            if(isPrimeNumber(num)){
                sum += num;
                count++;
            }
            num++;
        }
        System.out.println(sum);
        
       /* System.out.println("numbers are");
        for(int i=0;i<count;i++) {
        	System.out.println(num);
        	num++;
        }*/	
    }
     
    private static boolean isPrimeNumber(int number){
         
        for(int i=2; i<=number/2; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}