import java.util.*;
class ReverseString{
   public static void main(String[] args){
      System.out.println("Enter the String : ");
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      String str1 = "";
      for (int i = 0; i < str.length(); i++) {
  str1 = str.charAt(i) + str1;
}

System.out.println("Reversed string: "+ str1);
}
}