package main.java.homework23v2;

import java.util.Scanner;

public class StringWork{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Получаем исходные данные
        String userText = getUserText(scanner);
        String symbolToRemove = getSymbolForRemoval(scanner);

        // Обрабатываем текст
        String cleanedText = cleanTextSpaces(userText);
        String modifiedText = replaceSymbol(cleanedText, symbolToRemove);
        String finalText = cleanTextSpaces(modifiedText);

        // Показываем итог
        showComparison(userText, finalText);

        scanner.close();
    }

    // Получение текста от пользователя
    public static String getUserText(Scanner scanner) {
        while (true) {
            System.out.print("Введите ваш текст: ");
            String text = scanner.nextLine();
            if (text.length() > 1 && text.matches("^[a-zA-Zа-яА-Я0-9.,!?:; ]+$") && !text.contains("  ")) {
                return text;
            }
            System.out.println("Текст должен состоять минимум из 2 символов, содержать только буквы (латиница/кириллица), цифры, знаки препинания (. , ! ? : ;) и одиночные пробелы.");
        }
    }

    // Получение символа для удаления
    public static String getSymbolForRemoval(Scanner scanner) {
        while (true) {
            System.out.print("Какой символ заменить пробелами?: ");
            String input = scanner.nextLine();

            if (input.length() == 1 && !input.equals(" ")) {
                return input;
            }
            System.out.println("Нужен один любой символ кроме пробела.");
        }
    }

    // Очистка лишних пробелов
    public static String cleanTextSpaces(String text) {
        return text.replaceAll("\\s+", " ");
    }


    // Замена символов на пробелы
    public static String replaceSymbol(String text, String targetSymbol) {
        return text.replace(targetSymbol, " ");
    }


    // Сравнение и вывод результатов
    public static void showComparison(String before, String after) {
        if (before.equals(after)) {
            System.out.println("Текст остался без изменений");
        } else {
            System.out.println("До обработки: " + before);
            System.out.println("После обработки: " + after);
        }
    }
}