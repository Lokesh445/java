import java.io.*;
public class Output{
    public static void main(String args[])throws IOException{
         ByteArrayOutputStream bOutput = new ByteArrayOutputStream(12);//in this line we create a object for byte array class

        while(bOutput.size()!=0){//in while loop we given a condition that size not equal to zero
            bOutput.write(System.in.read());//system.in is used to get input from the user
        }
        byte b[] = bOutput.toByteArray();//byte b is a array class that used to store values in b and convert it into byte
        System.out.println("Print the content");//it prints the statement
        for(int x=0;x<b.length;x++){//as we know the length so we use for loop and initialize to zero,x is lesser than or equal to b.length and increment
            System.out.print((char)b[x] +" ");//it prints output as char
        }
        System.out.println("  "); //it prints some space

        int c;//here we declare a new variable

        ByteArrayInputStream bInput = new ByteArrayInputStream(b);//in this we created a object for bytearray inputStream and pass the values to b
        System.out.println("Converting characters to upper case");//prints the statements
        for(int y=0;y<1;y++){//in this loop we intialized y as 0,and condition y<1,and its incremented
            while((c = bInput.read())!= -1){//in while loop ,the inputb that are readed will store in c which is not equal to-1(it is the end of the file so we use -1)
                System.out.println(Character.toUpperCase((char)c));//in this statement the input are converted to uppercase
            }
            bInput.reset();//it uses to reset the program for next use.
        }

    }
}