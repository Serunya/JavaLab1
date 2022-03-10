import java.util.Scanner;

public class Radar {
    public static void main(String[] args){
        int R;
        int r;
        if(args[0] != null){
            R = Integer.parseInt(args[0]);
            r = Integer.parseInt(args[1]);
        }else {
            R = 2;
            r = 5;
        }
        Point object = new Point(args); /*Для 3 задания ввести числа, Что бы вводить
        с клавиатуры оставить скобки пустыми;передать args для вовода аргументов команд. строки*/
        Radar(object,r,R);
    }

    public  static void Radar(Point object, int r, int R){
        Double dist = Math.sqrt(object.x*object.x + object.y*object.y);
        if(dist < r){
            System.out.println("Alarm");
        }else if(dist < R){
            System.out.println("Detected");
        }else{
            System.out.println("Didn't detect");
        }

    }
}

class Point{
    int x;
    int y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    Point(){
        Scanner in = new Scanner(System.in);
        System.out.print("Input a x:");
        this.x = in.nextInt();
        System.out.print("Input a y:");
        this.y = in.nextInt();
        in.close();
    }
    Point(String[] args){
        this.x = Integer.parseInt(args[2]);
        this.y = Integer.parseInt(args[3]);
    }

}
