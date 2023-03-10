import java.util.*;
class PPalindrome{

 public static void main(String[] args) {

       System.out.println("enter the string");
       Scanner sc = new Scanner(System.in);
       String a = sc.nextLine();
       String b = "";
 
for(int i=a.length()-1;i>=0;i--){
    b = b + a.charAt(i);
  }
if (a.equals(b)){
         System.out.println(a+" is a palindrome");
         }
      else{
         System.out.println(a+" is not a palindrome");
          }

   }

}