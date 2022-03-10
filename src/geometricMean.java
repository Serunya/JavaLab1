public class geometricMean {
    public static void main(String[] args) {
        int[] k = {-1,-2,3,-4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        long mul = 1;
        int count = 0;
        for(int i = 0;i < k.length;i++){
            if(k[i] < 0) {
                mul = mul * k[i];
                count++;
            }
        }
        double i = Math.pow(Math.abs(mul), 1./count);
        if(count % 2 != 0){
            i = i * (-1);
        }
        System.out.println(i);
    }
}
