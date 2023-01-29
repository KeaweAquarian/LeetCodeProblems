import java.util.HashMap;

interface Printable{
    void print(String string);
}


public class Practice {
//    public static void main(String[] args) {
//        Printable printable = e -> System.out.println(e);
//
//        printable.print("hello");
//    }




    public static void main(String... args) {
        HashMap<TestClass, String> a = new HashMap();
        a.put(new TestClass("a"), "a");
        a.put(new TestClass("b"), "b");
        System.out.println(a.get(new TestClass("a")) + " " + a.get(new TestClass("b")));


    }
    static class TestClass{
        public String name;
        public TestClass(String name){this.name = name;}
        public boolean equals(Object o){return true;}
        public int hashCode(){return 0;}
    }
}
