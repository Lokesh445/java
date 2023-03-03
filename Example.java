import java.util.*;
class Example{
      
	public static void main(String args[]){
	
	String[] strAr1 = {"lokesh", "kathir", "sabari"};
      //for (int i=0; i<strAr1.length; i++){  
         //System.out.println(strAr1[i]);  
//} 
for(String a : strAr1){
     System.out.println(a);
}
	 System.out.println("enter the number");
       Scanner sc = new Scanner(System.in);
	 int num = sc.nextInt();
	 int [] arr=new int [num];
       for(int i=0;i<arr.length;i++){

	     System.out.println(arr[i]);
}
	
}

}
