import java.util.*;
class MainClass {  
    public static void main(String[] args) {  

        System.out.println("Value:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a[] = new int[x];
       
        for (int i = 0; i<a.length; i++) {  
            a[i] = sc.nextInt();
        }  
        for (int i= 0; i<a.length; i=i+2) {  
            
            System.out.print(a[i]);  
        }  
    }  
} 