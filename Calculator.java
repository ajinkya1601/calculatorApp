import java.util.Scanner;

public class Calculator {


    public static int add(int a, int b){
        return a+b;
    }

    public static int sub(int a, int b){
        if (a>b) return a-b;
        if (a<b) return b-a;
        return 0;
    }

    public static int mul(int a, int b){
        return a*b;
    }

    public static int div(int a, int b){
        return a/b;
    }

    static Scanner sc;
    public static void main(String[] args) {
		int a=10;
		int b=7;
        System.out.println(add(a,b));
        System.out.println(sub(a,b));
        System.out.println(mul(a,b));
        System.out.println(div(a,b));
    }
}
