import java.util.*;

class CylinderExample{
   public static void main(String[] args){
     System.out.println("Enter the values");
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the Radius : ");
     double a = sc.nextDouble();
     System.out.println("Enter the Height : ");
     double b = sc.nextDouble();
     double Vol = 3.14*a*b;
     System.out.println(Vol);
}
}