import java.util.*;
class PalindromeExample{
   public static void main(String[] args){
    System.out.println("Enter the String : ");
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int length = str.length();
    String str2 = "";
      for ( int i = length - 1; i >= 0; i-- ){
         str2 = str2 + str.charAt(i);
        }
 
      if (str.equals(str2)){
         System.out.println(str+" is a palindrome");
         }
      else{
         System.out.println(str+" is not a palindrome");
          }
    
}
}