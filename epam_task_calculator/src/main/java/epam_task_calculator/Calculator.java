package epam_task_calculator;
import java.util.Scanner;
public class Calculator {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		double num1=s.nextDouble();
		System.out.println("Enter 2nd number: ");
		double num2=s.nextDouble();
		System.out.println("Enter the operator('+,-,/,*'):");
		char c=s.next().charAt(0);
		boolean flag=true;
		double res=0;
		Operator o= new Operator();
		while(flag)
		{
			if(c=='+')
			{
				flag=false;
				res=o.add(num1,num2);
			}
			else if(c=='-')
			{
				flag=false;
				res=o.sub(num1,num2);
			}
			else if(c=='*')
			{
				flag=false;
				res=o.mul(num1,num2);
			}
			else if(c=='/')
			{
				flag=false;
				res=o.div(num1,num2);
			}
			else
			{
				System.out.println("Enter only operators in (+,-,*,/)");
			}
		}
		System.out.println("Result is "+res);
		s.close();
		
	}
}
