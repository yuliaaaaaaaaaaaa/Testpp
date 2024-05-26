package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @BeforeAll
    public static void setUp() {
        System.out.println("Before All");
    }

    @BeforeEach
    public void setUpEach() {
        System.out.println("Before Each");
    }
    @AfterAll
    public static void afterAll() {
        System.out.println("After All");
    }
    @AfterEach
    public void afterEach() {
        System.out.println("After Each");
    }
    @Test
    @DisplayName("Проверка суммирования 1")
    @Timeout(10)
    void sum1() {
        Calc calc = new Calc();
        int result = calc.sum(1,6);
        Assertions.assertEquals(7, result, "Не тот ответ");
    }
    @RepeatedTest(10)
    @DisplayName("Проверка суммирования 2")
    @Timeout(10)
    void sum2() {
        Calc calc = new Calc();
        int result = calc.sum(1,6);
        Assertions.assertEquals(7, result, "Не тот ответ");
    }

    @ParameterizedTest(name = "#{index} - сложение {0} и {1}, ожидаем {2}")
    @CsvSource({"1, 2, 3", "-1, 2, 1", "0, 0, 0"})
    @DisplayName("Проверка суммирования 3")
    @Tag("param")
    void sum3(int a, int b,int expectedResult) {
        Calc calc = new Calc();
        int result = calc.sum(a,b);
        Assertions.assertEquals(expectedResult, result, "Не тот ответ");
    }


    @ParameterizedTest(name = "#{index} - вычитание {0} и {1}, ожидаем {2}")
    @CsvSource({"8, 2, 6", "-10, -6, -4", "5, 0, 5"})
    @DisplayName("Проверка вычитания")
    @Tag("minus")
    void minus1(int a, int b,int expectedResult) {
        Calc calc = new Calc();
        int result = calc.minus(a,b);
        Assertions.assertEquals(expectedResult, result, "Не тот ответ");
    }

    @Test
    @DisplayName("Проверка вычитания 2")
    @Tag("minus")
    void minus2() {
        Calc calc = new Calc();
        int result = calc.minus(8,2);
        Assertions.assertEquals(6, result, "Не тот ответ");
    }
}