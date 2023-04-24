package week08;

import java.util.Scanner;

class AddZeroException extends Exception {
	public AddZeroException() {
        System.out.println("AddZeroException");
    }
}
class SubtractZeroException extends Exception {
	public SubtractZeroException() {
    	System.out.println("SubtractZeroException");
    }
}
class OutOfRangeException extends Exception {
	public OutOfRangeException() {
    	System.out.println("OutOfRangeException");
    }
} 

public class SimpleCalculator {
	private static final int MIN_VALUE = 0;
    private static final int MAX_VALUE = 1000;
    
   
       
    public static int add(int a, int b) throws AddZeroException, OutOfRangeException {
        if (a == 0 || b == 0) {
            throw new AddZeroException();
        }

        if (a < MIN_VALUE || a > MAX_VALUE || b < MIN_VALUE || b > MAX_VALUE||a+b>MAX_VALUE||a+b<MIN_VALUE) {
            throw new OutOfRangeException();
        }

        return a + b;
    }    
    public static int subtract(int a, int b) throws SubtractZeroException, OutOfRangeException {
        if (a == 0 || b == 0) {
            throw new SubtractZeroException();
        }

        if (a < MIN_VALUE || a > MAX_VALUE || b < MIN_VALUE || b > MAX_VALUE||a-b>MAX_VALUE||a-b<MIN_VALUE) {
            throw new OutOfRangeException();
        }

        return a - b;
    }
    
	public static void main(String[] args){
		String input;
		Scanner scanner=new Scanner(System.in);
		input=scanner.nextLine();
		String[] n;
		
		if (input.contains("+")) {
            n = input.split("\\+");
            int a = Integer.parseInt(n[0]);
            int b = Integer.parseInt(n[1]);
            try {
                System.out.println(add(a, b));
            } catch (AddZeroException e1) {
            	
            } catch(OutOfRangeException e2) {
            	
            }
        } 
		else if (input.contains("-")) {
            n = input.split("\\-");
            int a = Integer.parseInt(n[0]);
            int b = Integer.parseInt(n[1]);
            try {
                System.out.println(subtract(a, b));
            } catch (SubtractZeroException e1) {

            } catch(OutOfRangeException e2) {

            }
        }
		else
			System.exit(0);
	}
	
}
