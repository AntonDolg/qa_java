package math;

public class ProgFirst {
    public static void main(String[] args) {
        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной" + s.l + " = " + s.area());


        String text = "british stylish";
        voice(text);
        //System.out.println("what is it?"+ "chokopai");
   }

    public static void voice(String newtext){
        System.out.println(newtext);
    }
}