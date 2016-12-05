public class MyProgram {
 public static void main(String[] args) {
     Woo w = new Woo();
   System.out.println(w.one() + " " + w.two() + " " + w.extra());
   Woo y1 = new Yoo();
   System.out.println(y1.one() + " " + y1.two() + " " + y1.extra()); 
   Yoo y2 = new Yoo();
   System.out.println(y2.one() + " " + y2.two() + " " + y2.extra()); 
   Zoo z = new Yoo();
   System.out.println(z.one() + " " + z.two() + " " + z.extra()); 
   
 }
}
