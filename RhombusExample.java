import java.util.*;
class RhombusExample{
   public static void main(String[] args){
      System.out.println("Enter the two diaginal values");
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the diagonal1 : ");
      double a = sc.nextDouble();
      System.out.println("Enter the diagonal2 : ");
      double b = sc.nextDouble();
      double Area = (a*b)/2;
      System.out.println(Area);
}
}