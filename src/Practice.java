interface Printable{
    void print(String string);
}


public class Practice {
    public static void main(String[] args) {
        Printable printable = e -> System.out.println(e);

        printable.print("hello");
    }



}
