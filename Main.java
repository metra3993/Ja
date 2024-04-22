package org.example;

import java.util.Scanner;

public class Main {
    public static class PrisonUtils {
        private static int numberOfPrisoners = 0;
        private static SecurityLevel securityLevel = SecurityLevel.MEDIUM; // По умолчанию - средний уровень безопасности

        // Функция для добавления нового заключенного
        public static void addPrisoner() {
            numberOfPrisoners++;
            System.out.println("Заключенный добавлен. Текущее количество заключенных: " + numberOfPrisoners);
        }

        // Функция для добавления нескольких заключенных за один раз
        public static void addMultiplePrisoners(int count) {
            numberOfPrisoners += count;
            System.out.println(count + " заключенных добавлено. Текущее количество заключенных: " + numberOfPrisoners);
        }

        // Функция для освобождения заключенного
        public static void releasePrisoner() {
            if (numberOfPrisoners > 0) {
                numberOfPrisoners--;
                System.out.println("Заключенный освобожден. Текущее количество заключенных: " + numberOfPrisoners);
            } else {
                System.out.println("Нет заключенных для освобождения.");
            }
        }

        // Функция для освобождения всех заключенных
        public static void releaseAllPrisoners() {
            numberOfPrisoners = 0;
            System.out.println("Все заключенные освобождены.");
        }

        // Метод для изменения уровня безопасности тюрьмы
        public static void changeSecurityLevel(SecurityLevel level) {
            securityLevel = level;
            System.out.println("Уровень безопасности изменен на: " + securityLevel);
        }

        // Функция для отображения текущего количества заключенных
        public static void displayNumberOfPrisoners() {
            System.out.println("Текущее количество заключенных: " + numberOfPrisoners);
        }

        // Функция для отображения текущего уровня безопасности
        public static void displaySecurityLevel() {
            System.out.println("Текущий уровень безопасности: " + securityLevel);
        }

        // Функция для отображения общего состояния тюрьмы
        public static void displayPrisonState() {
            displayNumberOfPrisoners();
            displaySecurityLevel();
        }

        // Метод main для демонстрации работы функций
        public static void main(String[] args) {
        }

        public enum SecurityLevel {
            LOW,
            MEDIUM,
            HIGH
        }
    }
}
