package org.mikhailov;

/*
1. Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
вместо этого, необходимо повторно запросить у пользователя ввод данных.1
2. Если необходимо, исправьте данный код (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
3. Дан следующий код, исправьте его там, где требуется (задание 3 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
4. Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */
public class Main {

    public static void main(String[] args) {

    // Задание 1
    System.out.println("Задание 1");
    FloatReturner fr = new FloatReturner();
    System.out.println(fr.floatInput());
    System.out.println("");

    // Задание 2
    System.out.println("Задание 2");
    task2();
    System.out.println("");

    // Задание 3
    System.out.println("Задание 3");
    task3();
    System.out.println("");

    // Задание 4
    System.out.println("Задание 4");
    NoBlankspaceInputer nbi = new NoBlankspaceInputer();
    nbi.input();
    }

    /*
    Если я правильно понял смысл, мы хотим получать результат делеления восьмого элемента массива на число d.
    При d = 0 мы всегда будем получать исключение, никогда не увидим вывод в консоль, поскольку исполнение кода
    прервется строкой выше из-за исключения.
    Добавил объявлеине и инициализицию массива.
    Больше ошибок не вижу.
     */
    public static void task2() {
        try {
            int[] intArray = new int[]{1,2,3,4,5,6,7,8,9}; // объявил и инициализировал массив, на элемент которого есть ссылка дальше в коде
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
    public static void task3 () { // удалил "throws Exception" - нет необходимости пробрасывать исключения, они и так обрабатываются в методе
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        // Изменил порядок. Супер-класс в конец, иначе обработка иключений-наследников никогда не произойдет.
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }

    }
    // В этом методе не может возникнуть FileNotFoundException, не нужно его пробрасывать
    public static void printSum(Integer a, Integer b) //throws FileNotFoundException
    {
        System.out.println(a + b);
    }

}

