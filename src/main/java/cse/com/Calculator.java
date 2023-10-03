package cse.com;

import java.util.Scanner;

public class Calculator {
	private int solution;
    private int x;
    private int y;
    private char operators;

    public Calculator()    {        solution = 0;
        Scanner operators = new Scanner(System.in);
        Scanner operands = new Scanner(System.in);
    }
    public  static int addition(int x, int y)    {       return x + y;
    }   
    public static int subtraction(int x, int y)    {       return x * y;
    }
    public static int multiplication(int x, int y)
    {    
       return x * y;
    }
    public static int division(int x, int y)
    {
//https://1104-2405-201-e006-6273-8976-754b-7ae4-104c.ngrok-free.app 
       return x / y;
    }
}
