public class HelloWorld {
    public static void processIntegers () {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter three numbers: ");
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();

    if (a <= b) {
        if (b > c) {
            System.out.println("diamond");
        } else {
            System.out.println("ruby");
        }
        System.out.println("pearl");
    } else if (b >= c) {
        if (a < b) {
            System.out.println("copper");
        } else if (b == c) {
            System.out.println("bronze");
        }
        System.out.println("silver");
        if (a < c) {
            System.out.println("gold");
        }
    } else {
        System.out.println("penny");
        if (a == b) {
            System.out.println("dime");
        } else {
            System.out.println("nickel");
        }
    }
    System.out.println("done");
}