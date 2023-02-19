package LambdaAssignment;

import java.util.Scanner;

@FunctionalInterface
interface Operation
{
	public double operation(int a,int b);
}
public class Assignment4Q1 {
    public double addition(int num1,int num2,Operation o){
    	return o.operation(num1, num2);
    }
    public double subtraction(int num1,int num2,Operation o){
    	return o.operation(num1, num2);
    }
    public double multiplication(int num1,int num2,Operation o){
    	return o.operation(num1, num2);
    }
    public double division(int num1,int num2,Operation o){
    	return o.operation(num1, num2);
    }
    public static void main(String[] args) 
    {
    	Assignment4Q1 obj = new Assignment4Q1();
    	Scanner kb=new Scanner(System.in);
    	System.out.println("Enter value of a:");
    	int a=kb.nextInt();
    	System.out.println("Enter value of a:");
    	int b=kb.nextInt();
    	System.out.println(obj.addition(a, b,(V,K)->a+b));
    	System.out.println(obj.subtraction(a, b,(V,K)->a-b));
    	System.out.println(obj.multiplication(a, b, (V,K)->a*b));
    	System.out.println(obj.division(a, b, (V,K)->a/b));
    	kb.close();
    }
}
