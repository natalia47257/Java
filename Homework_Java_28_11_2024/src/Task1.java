//Task№1
//Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в переменные m и n.
//Числа могут быть, как целочисленные, так и дробные.
//Например :
//ввод : m=10.5, n=10.45
//вывод: Число 10.45 ближе к 10.

public class Task1 {
    public static void main(String[] args) {
        double m = 10.5;
        double n = 10.45;

        double diffM = Math.abs(10 - m);
        double diffN = Math.abs(10 - n);

        if (diffM < diffN) {
            System.out.println("Число " + m + " ближе к 10.0");
        } else if (diffN < diffM) {
            System.out.println("Число " + n + " ближе к 10.0");
        } else {
            System.out.println("Оба числа находятся на одинаковом расстоянии от 10.0");
        }
    }
}