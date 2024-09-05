package ru.netology.practiceBlock61.services;
public class VacationCalc {
    public int calculate(int income, int expenses, int threshold) {
        int vacationMonthes = 0; // счётчик месяцев отдыха
        int totalAmount = 0; // количество денег на счету
        for (int month = 1; month < 12; month++) {
            if (totalAmount >= threshold) { // можем ли отдыхать?
                vacationMonthes++; // увеличиваем счётчик месяцев отдыха
                totalAmount = (totalAmount - expenses) / 3;
            } else {
                totalAmount = totalAmount + income - expenses;
            }
        }
        return vacationMonthes;
    }
}
