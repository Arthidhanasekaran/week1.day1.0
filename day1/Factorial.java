package week1.day1;

public class Factorial {

	public static void main(String[] args) {
        int num = 5;
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
        	factorial = factorial * i;
		}
        System.out.println("The factorial of "+num+ " is:" +factorial);
	}

}