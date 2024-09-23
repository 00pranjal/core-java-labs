package pranjal.lab1;

public class ex8 {
	
	public static boolean checkNumber(int n) {
        
        
        while (n > 1) {
            if (n % 2 != 0) {
                return false; 
            }
            n /= 2; 
        }
        
        return true;
    }


    public static void main(String[] args) {
        int number = 16; 
        boolean result = checkNumber(number);
        System.out.println(result);
    }

}
