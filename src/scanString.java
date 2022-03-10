public class scanString {
    public static void main(String[] args) {
        String str = "૨૨255апрыФФFfdsё";
        scanner(str);
    }
    static void scanner(String str){
        char[] chArray = str.toCharArray();
        short tower = 0;
        short lower = 0;
        short arabicNumberals = 0;
        short otherNumerals = 0;
        short other = 0;

        for(int i = 0; i < str.length(); i++){
            short code = (short)chArray[i];
            if(Character.isDigit(chArray[i])){
                if(code >= 48 & code <= 57) {
                    arabicNumberals++;
                } else{
                    otherNumerals++;
                }
            } else if((code >= 65 & code <= 90) | (code >= 1040 & code <= 1071)){
                tower++;
            }else if((code >= 'a' & code <= 'z') | (code >= 1072 & code <= 1103)){
                lower++;
            }else {
                other++;
            }

        }
        System.out.println("Арабских цифр: \t\t" + arabicNumberals + "\nНе арабских цифр: \t" + otherNumerals
                + "\nСтрочных букв:\t\t" + lower + "\nЗаглавных букв: \t" + tower + "\nОстальных символов: " + other);
    }
}
