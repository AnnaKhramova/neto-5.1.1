import core.Calculator;

public class Main {

    public static void main(String[] args) {
        // В исходном коде возникала ошибка деления на ноль.
        // Поэтому необходимо обрабатывать ArithmeticException
        // в блоке try-catch.
        //
        // Также, чтобы этот код работал, переменные
        // класса Calculator должны быть публичными.
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.devide.apply(a, b);

        calc.println.accept(c);
    }

}