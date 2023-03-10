import java.util.*;
class PPrimeNumber{

 public static void main(String[] args) {
  System.out.println("enter the values :");
  Scanner sc = new Scanner(System.in);
  int a = sc.nextInt();

  int b;

  for (int i = 1; i <= a; i++) {
   b = 0;
   for (int j = 2; j <= i / 2; j++) {
    if (i % j == 0) {
     b++;
    }
   }

   if (b == 0) {
    System.out.println(i);
   }

  }
 }
}