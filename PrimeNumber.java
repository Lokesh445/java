import java.util.*;
class PrimeNumber{
   public static void main(String[] args){
      System.out.println("Enter the Number : ");
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int count;

  for (int i = 1; i <= a; i++) {
   count = 0;
   for (int j = 2; j <= i / 2; j++) {
    if (i % j == 0) {
     count++;
     break;
    }
   }

   if (count == 0) {
    System.out.println(i);
   }

  }
}
}