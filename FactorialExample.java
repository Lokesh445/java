import java.util.*;
class FactorialExample{
   public static void main(String[] args){
      System.out.println("Enter the Number : ");
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt(); 
      int b =1;    
      for(int i=1;i<=a;i++){    
      b=b*i;    
  }    
      System.out.println("Factorial of " + a + " is " + b);
}
}