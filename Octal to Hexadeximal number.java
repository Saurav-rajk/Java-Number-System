// Program for converting octal number to decimal number
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



