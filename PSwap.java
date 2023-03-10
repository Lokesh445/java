import java.util.*;
class PSwap{
public static void main(String args[]){

      System.out.println("Enter the value");
	Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
	 System.out.println("Enter the value");
	 int b = sc.nextInt();
	System.out.println("before swapping numbers: "+a +"  "+ b);  
	  int c = a;
        a = b;
        b = c;
	System.out.println("the swapping of value is :"+ a +"  "+ b);
      
      
   }
}