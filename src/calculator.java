import java.util.Scanner;

public class calculator {
    public static void main(String[] args){
        int number = getNumber();
        convertNumber(number);
    }

    static int getNumber(){
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = in.nextInt();
        in.close();
        return number;
    }

    static void convertNumber(int number){
        System.out.println(number + " in binary = " + Integer.toBinaryString(number));
        System.out.println(number + " in octal =  " + Integer.toOctalString(number));
        System.out.println(number + " in hexadecimal = " + Integer.toHexString(number));
    }

}
