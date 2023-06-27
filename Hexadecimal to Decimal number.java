// Program for converting Hexadecimal number to Octal number
public class Main{
    public static void main(String[] args){
        String hex_value="25"; // It is an hexadecimal value.
        int dec;
        dec=Integer.parseInt(hex_value,16);  // In this the hexadecimal value is getting convertd to decimal
        System.out.print("Hexadecimal value is: "+dec);
    }

}
