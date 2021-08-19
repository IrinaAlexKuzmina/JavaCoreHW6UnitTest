public class Main {

    public static void main(String[] args){

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.divide.apply(a, b); // на 0 делить нельзя => если делить на очень малькое число, получаем +/- бесконечность,
                                        // в зависимости от знака делимого числа
        boolean d = calc.isPositive.test(8);

        calc.println.accept(c);
        System.out.println(d);
    }
}
