package example;
import java.util.*;
public class Operators {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a =11 ,b= 23 , c= 55;
		int sum = a+b;
		int diff = a-b;
		int multiply = a*b;
		int reamanant = a%b;
		double devide = a/b;
		System.out.println("sum is "+ sum);
		System.out.println("diff is "+ diff);
		System.out.println("multiply is "+ multiply);
		System.out.println("reamanant is "+ reamanant);
		System.out.println("devide is "+ devide);
		System.out.println(a+b*c);//execute lesft to right
		System.out.println(a-b/c);//precedance given to (). after that *,/,%
		System.out.println((a/b)*b);
		
		
		}
			
	

	}

}