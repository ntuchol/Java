/*
 * Test program for PS 4, problem 3.
 *
 * Put this program in the same folder as your StringManipulator.java.
 *
 * If it doesn't compile, that means that one or more of your methods
 * does not have the correct header -- i.e., either the name, the 
 * return type, or the parameters are incorrect.
 *
 * The correct results to these method calls are given in the assignment.
 * 
 * We encourage you to add additional test cases.
 */

public class Test {
    public static void main(String[] args) {
        System.out.println("** part a **");
        StringManipulator.printEveryOther(" !NataliaTucholska");
        System.out.println();
        
        System.out.println("** part b **");
        StringManipulator.printDiagonal(" ekkkkk   yo momma is a fool!!");
        System.out.println();
        
        System.out.println("** part c **");
        int len = StringManipulator.longerLength("b edrum", "r edrum");
        System.out.println(len);
        System.out.println();
        
        System.out.println("** part d, example 1 **");
        String str1 = StringManipulator.interleave("aaaa", "bbbb");
        System.out.println(str1);
        
        System.out.println("** part d, example 2 **");
        String str2 = StringManipulator.interleave("hello", "world");
        System.out.println(str2);
        
        System.out.println("** part d, example 3 **");
        String str3 = StringManipulator.interleave("leaving", "NOW");
        System.out.println(str3);
        
        System.out.println("** part d, example 4 **");
        String str4 = StringManipulator.interleave("", "hello");
        System.out.println(str4);
        
        String str5 = StringManipulator.interleave("redness", "  ");
        System.out.println(str5);
        
        String str6 = StringManipulator.interleave("", "");
        System.out.println(str6);
    }
}