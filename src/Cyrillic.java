public class Cyrillic {
    public static void main(String[] args){
        tableWithChar((byte) 16,(byte) 16, (char)0x0400);
        System.out.println();
        tableWithChar((byte) 2,(byte) 16, (char)0x20a0);
    }

    static void tableWithChar(byte Row, byte Columns, char StartSymbol){
        char a = StartSymbol;
        System.out.print(Integer.toHexString(a) + " ");
        // Первая строка
        for(byte i = 0; i < Columns; i++){
            System.out.print(Integer.toHexString(i) + " ");
        }
        System.out.println();
        for(byte i = 0; i < Row; i++){
            System.out.print((Integer.toHexString(a)) + " ");
            System.out.print(a + " ");
            for(byte j = 1; j < Columns; j++){
                System.out.print(a + " ");
                a++;
            }
            System.out.print('\n');
        }
    }
}
