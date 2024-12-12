package homework;
// № 2
//Создайте методы с математическими операциями +, -, *, /
//Каждый метод принимает два числа в параметрах и возвращает результат
//Вызовите все методы в main
//Результат распечатайте в консоль

public class Calculator {
    public static void calc(String[] args) {
        double num1 = 10;
        double num2 = 5;
    }

    // Метод сложения
    public static double add(double a, double b) {
        return a + b;
    }

    // Метод вычитания
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Метод умножения
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Метод деления
    public static double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Ошибка: деление на ноль!");
            return Double.NaN; // Возвращает "не число", если деление невозможно
        }
    }
    public static void main(String[] args) {
        // Примеры чисел
        double num1 = 10;
        double num2 = 5;

        // Вызов методов
        double sum = add(num1, num2);
        double difference = subtract(num1, num2);
        double product = multiply(num1, num2);
        double quotient = divide(num1, num2);

        // Вывод результатов
        System.out.println("Сложение: " + sum);
        System.out.println("Вычитание: " + difference);
        System.out.println("Умножение: " + product);
        System.out.println("Деление: " + quotient);
    }
}




