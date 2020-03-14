package epam_task_calculator;
import java.lang.Math;
public class Operator {
	double add(double a,double b)
	{
		return a+b;
	}
	double sub(double a,double b)
	{
		return Math.abs(a-b);
	}
	double mul(double a,double b)
	{
		return a*b;
	}
	double div(double a,double b)
	{
		return a/b;
	}
}
