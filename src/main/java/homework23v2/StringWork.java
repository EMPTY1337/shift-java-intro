package main.java.homework23v2;

import java.util.Scanner;

public class StringWork{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Получаем исходные данные
        String userText = getUserText(scanner);
        char symbolToRemove = getSymbolForRemoval(scanner);

        // Обрабатываем текст
        String cleanedText = cleanTextSpaces(userText);
        String modifiedText = modifyText(cleanedText, symbolToRemove);
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

            if (text.length() > 1) {
                return text;
            }
            System.out.println("Текст должен состоять минимум из 2 символов, попробуйте снова.");
        }
    }

    // Получение символа для удаления
    public static char getSymbolForRemoval(Scanner scanner) {
        while (true) {
            System.out.print("Какой символ заменить пробелами?: ");
            String input = scanner.nextLine();

            if (input.length() == 1) {
                char symbol = input.charAt(0);
                if (symbol != ' ') {
                    return symbol;
                }
            }
            System.out.println("Нужен один любой символ кроме пробела.");
        }
    }

    // Очистка лишних пробелов
    public static String cleanTextSpaces(String text) {
        StringBuilder result = new StringBuilder();
        boolean foundSpace = false;

        for (char currentChar : text.toCharArray()) {
            if (currentChar == ' ') {
                if (!foundSpace) {
                    result.append(currentChar);
                    foundSpace = true;
                }
            } else {
                result.append(currentChar);
                foundSpace = false;
            }
        }

        return result.toString().trim();
    }

    // Замена символов на пробелы
    public static String modifyText(String text, char targetSymbol) {
        char[] characters = text.toCharArray();
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] == targetSymbol) {
                characters[i] = ' ';
            }
        }
        return new String(characters);
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