// Octal to decimal.
//public class Main{
//    public static void main(String[] args){
//        int dec=0,rem,j=1;
//        int num=10;
//        while(num>0){
//            rem=num%10;
//            dec=dec+rem*j;
//            j=j*8;
//            num /=10;
//        }
//        System.out.print(dec);
//    }
//}

//Octal number to decimal number.
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        String hex_num;
        String oct_num="100";
        int dec;
        dec=Integer.parseInt(oct_num,8);  // Integer.parseInt() is used to convert in decimal number
        hex_num=Integer.toHexString(dec);  // Integer.toHexString() is used to convert the number in hexadecimal.
        System.out.print("Hexadecimal is equivalent to: "+hex_num);
    }
}

