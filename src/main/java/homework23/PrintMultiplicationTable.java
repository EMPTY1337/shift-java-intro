package main.java.homework23;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintMultiplicationTable {
    public static void main(String[] args) {
        // Создаем сканер для чтения ввода с клавиатуры
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем у пользователя первое число
        System.out.print("Введите первое число: ");
        int firstNumber = scanner.nextInt(); // Читаем первое число

        // Запрашиваем у пользователя второе число
        System.out.print("Введите второе число: ");
        int secondNumber = scanner.nextInt(); // Читаем второе число

        // Запрашиваем шаг и проверяем что он положительный или не равен 0
        int step;
        do {
            System.out.print("Введите шаг: ");
            step = scanner.nextInt();
            if (step <= 0) {
                System.out.println("Шаг должен быть положительным или не 0.");
            }
        } while (step <= 0); // Повторяем пока шаг не станет положительным или больше 0

        // Вызываем функцию для печати таблицы умножения
        printMultiplicationTable(firstNumber, secondNumber, step);

        scanner.close();
    }

    // Функция для вычисления ширины поля результата умножения
    public static int getCellWidth(int number) {
        String data = String.valueOf(number);
        return data.length();
    }

    // Функция печатает таблицу умножения
    public static void printMultiplicationTable(int firstNumber, int secondNumber, int step) {
        // Находим меньшее число из двух введенных
        int min = Math.min(firstNumber, secondNumber);
        // Находим большее число из двух введенных
        int max = Math.max(firstNumber, secondNumber);

        // Вычисляем сколько чисел будет в таблице
        int count = 1;
        int current = min;
        while (current < max) {
            count++;
            current += step;
        }

        // Создаем массив для хранения всех чисел которые будут в таблице
        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            numbers[i] = min + i * step;
        }

        // Находим самую широкую ячейку в таблице
        int maxWidth = 0;
        // Перебираем все возможные произведения чисел (все ячейки таблицы)
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                int result = numbers[i] * numbers[j];
                // Узнаем ширину этого числа (сколько символов занимает)
                int width = getCellWidth(result);
                // Если нашли число шире текущего максимума переписываем в maxWidth
                if (width > maxWidth) {
                    maxWidth = width;
                }
            }
        }
        // Добавляем пробелы чтобы числа визуально не касались друг друга)
        maxWidth += 2;

        try (PrintWriter writer = new PrintWriter(new FileWriter("multiplication_table.txt"))) {

            // Печатаем первую строку таблицы В КОНСОЛЬ И В ФАЙЛ
            System.out.printf("%" + maxWidth + "s", "");
            writer.printf("%" + maxWidth + "s", "");

            for (int i = 0; i < numbers.length; i++) {
                System.out.printf("%" + maxWidth + "d", numbers[i]);
                writer.printf("%" + maxWidth + "d", numbers[i]);
            }

            System.out.println();
            writer.println();

            // Печатаем саму таблицу умножения В КОНСОЛЬ И В ФАЙЛ
            for (int i = 0; i < count; i++) {
                System.out.printf("%" + maxWidth + "d", numbers[i]);
                writer.printf("%" + maxWidth + "d", numbers[i]);

                for (int j = 0; j < count; j++) {
                    int result = numbers[i] * numbers[j];
                    System.out.printf("%" + maxWidth + "d", result);
                    writer.printf("%" + maxWidth + "d", result);
                }

                System.out.println();
                writer.println();
            }

            System.out.println("Таблица успешно сохранена в файл: multiplication_table.txt");

        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}



