package task1;

import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) ->
    {
        int result = x + y;
        System.out.println(x + "+" + y + "=" + result);
        return result;
    };

    BinaryOperator<Integer> minus = (x, y) -> {
        int result = x - y;
        System.out.println(x + "-" + y + "=" + result);
        return result;
    };

    BinaryOperator<Integer> devide = (x, y) -> {
        int result = 0;
        try  {
            result = x / y;
        } catch (ArithmeticException exception) {
            System.out.println("Деление на ноль");
        }
        System.out.println(x + "/" + y + "=" + result);
        return result;
    };

    UnaryOperator<Integer> pow = x -> {
        int result = x;
        System.out.println(x + "(pow)=" + result);
        return result;
    };

    UnaryOperator<Integer> abs = x -> {
        int result = x > 0 ? x : x * -1;
        System.out.println(x + "(abs)=" + result);
        return result;
    };

    Predicate<Integer> isPositive = x -> {
        boolean result = x > 0;
        System.out.println(x + " " + (result ? "положительное" : "отрицательное"));
        return result;
    };

}

