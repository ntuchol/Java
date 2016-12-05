public class MethodToOurMadness {

public static void printEvens(int a, int b) {
    int i = a; 
    while (i <= b) {
        boolean isEven = (i % 2 == 0);       
        if(isEven) {
            System.out.print(i + " ");
        }
        i++;
    }
    System.out.println();
}
}