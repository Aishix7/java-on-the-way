import java.util.Scanner;

public class sample {
    public static void main(String[] args) {
        int num1,num2;
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        
	    sample sums = new sample();
	    Calculator cal = new Calculator();
	    Calculator cal1 = new Calculator();
	    
	    int res = sums.add(num1,num2);
	    int result = cal.addition(res,num2);
	    
	    cal.num = 8;
	    
	    System.out.println(cal.num);
	    System.out.println(cal1.num);
	    
		System.out.println("Main result is: " + res);
		System.out.println("Calculator result is: " + result);
	}
	public int add(int n1,int n2){
        int sumation = n1 + n2;
        System.out.println("I was called first : Inside the Main method");
        return sumation;
    }
}
class Calculator{
    int num = 5;
    public int addition(int n1,int n2){
        
        int sum = n1 + n2;
        System.out.println("I was called Second : Inside the Calculator method");
        return sum;
    }
}
