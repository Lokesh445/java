import java.util.*;
class marks{
public static void main(String args[]){
System.out.println("Enter the marks:");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
if(a<=35){
System.out.println("Grade c");
}else if((a>35) && (a<=60)){
System.out.println("Grade b");
}else if((a>60) && (a<=85)){
System.out.println("Grade a");
}else if(a>85) && (a<=100){
System.out.println("Grade a+");
}else if(a>100){
System.out.println("invalid");
}
}
}