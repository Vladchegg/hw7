package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// Задача 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

    // Задача 2
        String fullName1 = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName1);

    // Задача 3
        fullName = "Иванов Семён Семёнович";
        String fullName3 = fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника - " + fullName3);

    }
}
