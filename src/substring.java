public class substring {
    public static void main(String[] args) {
        found("Прииивет мир!","ии");
    }
    static void found(String str, String substr){
        int temp = 0;
        int count = 0;
        do{
            temp = str.indexOf(substr,temp+1);
            count++;
        }while(temp != -1);
        System.out.println(count - 1);
    }
}
