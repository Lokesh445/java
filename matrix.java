import java.util.*;

class matrix{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter array one size : ");
      int arr = sc.nextInt();
      System.out.println("Enter second array size : ");
      int arr1 = sc.nextInt();
	System.out.println("Enter third array size : ");
      int arr2 = sc.nextInt();

 	System.out.println("Enter the array values : ");
      int x[][][] = new int[arr][arr1][arr2];
       for(int i=0;i<arr;i++){
            for(int j=0;j<arr1;j++){
			for(int k=0;k<arr2;k++){
					x[i][j][k] = sc.nextInt();

                     }
                  }
              } 

       for(int i=0;i<arr;i++){
            for(int j=0;j<arr1;j++){
			for(int k=0;k<arr2;k++){
          			System.out.print(x[i][j][k]+" ");
                    }System.out.println();
              
                  }System.out.println();
              } 
      }
}