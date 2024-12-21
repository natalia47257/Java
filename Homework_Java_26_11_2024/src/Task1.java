import java.util.Scanner;
// 1 уровень сложности: Домашнее задание 4.
//№1
//Введите 2 слова, воспользуйтесь сканером, состоящие из четного количества букв (проверьте количество букв в слове).
//Нужно получить слово, состоящее из первой половины первого слова и второй половины второго слова. распечатать на консоль.
//Например:
//ввод - mama, papa
//вывод - mapa

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое слово с четным количеством букв:");
        String word1 = scanner.nextLine();

        System.out.println("Введите второе слово с четным количеством букв:");
        String word2 = scanner.nextLine();

        if (word1.length() % 2 == 0 && word2.length() % 2 == 0) {
            String firstHalf = word1.substring(0, word1.length() / 2);
            String secondHalf = word2.substring(word2.length() / 2);
            String result = firstHalf + secondHalf;

            System.out.println("Результат: " + result);
        } else {
            System.out.println("Оба слова должны состоять из четного количества букв.");
        }

        scanner.close();
    }
}