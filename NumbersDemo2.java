import javax.swing.JOptionPane;
import java.util.*;
public class NumbersDemo2
/**
*Created by Christopher Camillucci
*
*/
{
	public static void main(String[] Args)
	{
		Scanner enter = new Scanner(System.in);
		System.out.println("Enter an integer:  ");
		int a = enter.nextInt();
		System.out.println("Enter another integer:  ");
		int b = enter.nextInt();
		displayTwiceTheNumber(a, b);
		displayNumberPlusFive(a, b);
		displayNumberSquared(a, b);
	}
	public static void displayTwiceTheNumber(int a, int b)
	{
		System.out.println("Integer a is " + a + " and integer b is " + b);
		System.out.println("Display two times the integer");
		System.out.println(a + " * 2 = " + (a * 2) + " and " + b + " * 2 = " + (b * 2));
	}
	public static void displayNumberPlusFive(int a, int b)
	{
		System.out.println("Display integer plus five");
		System.out.println("Integer a = " + a + " + " + 5 + " = " + (a + 5));
		System.out.println("Integer b = " + b + " = " + 5 + " = " + (b + 5));
	}
	public static void displayNumberSquared(int a, int b)
	{
		System.out.println("Display the integer squared");
		System.out.println("Integer a = " + (a * a));
		System.out.println("Integer b = " + (b * b));
	}
}