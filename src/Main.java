public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1,2);
        int b = calc.minus.apply(1,1);
        int c = calc.devide.apply(4, 2);

        //v pole apply mi ne peredali cifri,  v mesto cifr a i b

        calc.println.accept(c);
    }
}
