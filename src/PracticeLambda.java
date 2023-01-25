public class PracticeLambda {
    @FunctionalInterface
    interface  Print{
        void myPrint(String msg);
    }

    interface Add{
      int  add(int x, int y);
    }

    public static void main(String[] args) {

        Print print = e -> System.out.println("this is what prints " + e);
        print.myPrint("booorong");

        Add add = (e, d )-> {
            int total = e + d;
            return total;
        };

        System.out.println(add.add(5, 6));
    }
}
