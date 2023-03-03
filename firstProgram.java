import java.util.*;
class firstProgram{
public static void main(String[] args)
{
System.out.println("Enter your name");
Scanner name = new Scanner(System.in);
String a = name.nextLine();
System.out.println(a);

System.out.println("Enter your initial");
String b = name.next();
System.out.println(b);

System.out.println("Enter your num");
int c = name.nextInt();
System.out.println(c);

System.out.println("Enter your pass");
String d = name.next();
System.out.println(d);

}
}