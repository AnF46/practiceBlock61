package ru.netology.practiceBlock61.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class VacationCalcTest {

    @ParameterizedTest
    @CsvSource({
            "Small Salary, 3, 10000, 3000, 20000",
            "Big Salary, 2, 100000, 60000, 150000"
    })

    public void test(String test, int expected, int income, int expenses, int threshold){
        VacationCalc service = new VacationCalc();

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);


    }

    //income 10 тысяч руб.,
    // expenses 3 тысячи руб.,
    // threshold 20 тысяч руб.,
    // то отдохнуть удастся три месяца в году
}
