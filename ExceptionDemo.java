class MyException extends Exception {
  private String detail;
  MyException(String a) {
  detail = a;
  }
  public String toString() {
  return "MyException[" + detail + "]";
  }
}
public class ExceptionDemo {
 static void compute(int a,int b) throws MyException {
  try
  {
    if(b==0)
      throw new MyException("Trying to divide by zero");
    else
    {
      int result=a/b;
      System.out.println("The result is: "+result);
    }
  }
  finally
  {
     System.out.println("In finally block");
  }
}
public static void main(String args[]) {
try {
//compute(1,0);
compute(20,5);
} catch (MyException e) {
 
 System.out.println("Caught " + e);
}
}
}
