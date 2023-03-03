import java.util.*;
class VowelOrConsonant{
   public static void main(String[] args){
      System.out.println("Enter the Letter : ");
      Scanner sc = new Scanner(System.in);
      char c = sc.nextLine().charAt(0);
      switch(c){
        case 'a':
           System.out.println("The entered letter is a Vowel");
           break;
        case 'e':
           System.out.println("The entered letter is a Vowel");
           break;
        case 'i':
           System.out.println("The entered letter is a Vowel");
           break;
        case 'o':
           System.out.println("The entered letter is a Vowel");
           break;
        case 'u':
           System.out.println("The entered letter is a Vowel");
           break;
        default:
           System.out.println("The entered letter is a Consonant");
}
}
}