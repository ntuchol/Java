public class BlockLetters {
public static void processIntegers(int x, int y) {
    if (x <= y) {
        int total = 0;          
        for(int i = x; i < y; i++) {
            System.out.print(i + ", ");
            total = total + i;
        }
        total = total + y;
        System.out.println(y);
        System.out.println("total = " + total);
    }
}
}