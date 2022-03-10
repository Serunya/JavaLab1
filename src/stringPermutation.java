public class stringPermutation {
    public static void main(String[] args) {
        Perumutation("Привет");
    }

    static void Perumutation(String str){
        char[] arr = str.toCharArray();
        for(int i = 0; i < str.length();i++){
            for(int k = i; k < str.length();k++){
                System.out.print(arr[k]);
            }
            for(int j = 0; j < i; j++){
                System.out.print(arr[j]);
            }
            System.out.println();
        }
    }
}

