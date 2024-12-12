package homework;

//Задание 1.
//Создайте строку через new - I study Basic Java!
//Напишите метод, который принимает в качестве параметра строку, передайте в этот метод строку, которую создали в п.1
//Распечатать последний символ строки. Используем метод String.charAt().
//Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
//Заменить все символы “а” на “о”.
//Преобразуйте строку к верхнему регистру.
//Преобразуйте строку к нижнему регистру.
//Вырезать строку Java c помощью метода String.substring().

    public class Str {
        public static void main(String[] args) {
            //1. Создаем строку через new
            String str = new String("I study Basic Java!");

            //2. Вызываем метод и передаем строку
            processString(str);
        }
        public static void processString(String input) {
            //3. Распечатываем последний символ строки
            char lastChar = input.charAt(input.length() - 1);

            System.out.println("Последний символ строки: " + lastChar);

            // 4. Проверить, содержит ли строка подстроку "Java"
            boolean containsJava = input.contains("Java");

            System.out.println("Содержит ли строка 'Java': " + containsJava);

            // 5. Заменить все символы "а" на "о"
            String replacedString = input.replace('a', 'o');

            System.out.println("Строка после замены 'a' на 'o': " + replacedString);

            // 6. Преобразовать строку в верхний регистр
            String upperCaseString = input.toUpperCase();

            System.out.println("Строка в верхнем регистре: " + upperCaseString);

            // 7. Преобразовать строку в нижний регистр
            String lowerCaseString = input.toLowerCase();

            System.out.println("Строка в нижнем регистре: " + lowerCaseString);

            // 8. Вырезать строку  "Java"
            String substring = input.substring(input.indexOf("Java"), input.indexOf("Java") + 4);

            System.out.println("Вырезанная строка: " + substring);
        }
    }




