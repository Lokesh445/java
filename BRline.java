import java.io.*;
public class BRline{
public static void main(String args[]) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String str;
System.out.println("Enter the lines of the text:");
System.out.println("enter 'end' to quit:");
do{
  str = br.readLine();
  System.out.println(str);

}while(!str.contains("end"));
}

}