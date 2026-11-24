//package mypack;
  class Calculator {
    public int a,b;
    public Calculator()
    {
        a=10;
        b=5;
    }
    public Calculator(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    public void sum()
    {
        System.out.println("The sum is:"+(a+b));
    }
    public void subtract()
    {
        System.out.println("The difference is:"+(a-b));
    }
    public void product()
    {
        System.out.println("The product is:"+(a*b));
    }
    public void division()
    {
        System.out.println("The quotient is:"+(a/b));
    }
}
//package mypackaccess;
//import mypack.Calculator;
public class CalculatorDemo{
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.sum();
        c1.subtract();
        c1.product();
        c1.division();

        Calculator c2 = new Calculator(4,3);
        c2.sum();
        c2.subtract();
        c2.product();
        c2.division();

    }
}
