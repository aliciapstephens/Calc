import java.util.*;
import java.util.Scanner;
public class Calculator {
    private static int num1;
    public static void main(String[] args)
    {
        System.out.println("5 and 4:");
        Scanner inp= new Scanner(System.in);
        num1 = inp.nextInt();
        num2 = inp.nextInt();
        int ans;
        System.out.println("Enter your selection: 1 for Addition, 2 for substraction 3 for Multiplication,  4 for division and 5 for square:");
        int choose;
        choose = inp.nextInt();
        switch (choose){
        case 1:
                int y = 4;
                int x = 5;
                System.out.println(add( x, y));
            break;
        case 2:
            System.out.println(sub( num1,num2));
            break;      
        case 3:
            System.out.println(mult( num1,num2));
            break;
        case 4:
            System.out.println(div( num1,num2));
            break;
        case 5:
            System.out.println("Your squared number is: " + square(num));
	}
        }

    }
    public static int add(int x, int y)
    {
        int result = x + y;
        return result;
    }
    public static int sub(int x, int y)
    {
        int result = x-y;
        return result;
    }
    public static int mult(int x, int y)
    {
        int result = x*y;
        return result;
    }
    public static int div(int x, int y)
    {
        int result = x/y;
        return result;
    }
}
	public static int square(int num) 
	{
		return num * num;
	}
}
