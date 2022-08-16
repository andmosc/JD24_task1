package task1;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        calc.plus.apply(15,10);
        calc.minus.apply(15,10);
        calc.devide.apply(15,5);
        calc.abs.apply(15);
        calc.pow.apply(2);
        calc.isPositive.test(-5);

    }
}


