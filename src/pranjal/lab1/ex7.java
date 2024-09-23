package pranjal.lab1;

public class ex7 {
	public static boolean checkNumber(int number) {
      
        String numStr = String.valueOf(number);
       
        for (int i = 0; i < numStr.length() - 1; i++) {
            if (numStr.charAt(i) > numStr.charAt(i + 1)) {
                return false; 
            }
        }
        return true;
    }

   
    public static void main(String[] args) {
        int number = 1234; 
        boolean result = checkNumber(number);
        System.out.println(result);
    }
}
