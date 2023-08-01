

public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.devide.apply(a, b); /* На данной строке ошибка при вызове метода devide при делении на ноль.
                                            Решил проблему через тернарный оператор */
        calc.println.accept(c);

        Worker.OnTaskDoneListener listener = System.out::println;
        Worker.OnTaskErrorListener listenerError = System.out::println;
        Worker worker = new Worker(listener, listenerError);
        worker.start();
    }
}
