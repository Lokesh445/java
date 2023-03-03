import java.util.*;
class ternaryoperator{
public static void main(String args[]){
int a=5,b=10;
String value=(a==b)?"the numbers are same":"the numbers are not same";

System.out.println(value);
a+=b;
b-=a;
System.out.println(a);
System.out.println(b);
}
}