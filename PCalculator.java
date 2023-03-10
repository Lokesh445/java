import java.util.*;
class PCalculator{
public static void main(String args[]){
    System.out.println("Select operations + - * %");
	Scanner sc = new Scanner(System.in);
       char op = sc.next().charAt(0);
   System.out.println("enter  the value");
      int b = sc.nextInt();
      int c = sc.nextInt();

switch(op){

   case '+':  System.out.println("The value is" + (b+c));
    break;
  case '-': System.out.println("The value is" + (b-c));
    break;
  case '*': System.out.println("The value is" + (b*c));
    break;
  case '%': System.out.println("The value is" + (b%c));
    break;
  default:
    System.out.println("invalid");
}

  }
}


