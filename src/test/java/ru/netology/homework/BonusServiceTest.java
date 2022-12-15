package ru.netology.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class BonusServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    void shouldCalculateForRegisteredAndUnderLimit(long expected, long amount, boolean registered) {
        BonusService service = new BonusService();

        long actual = service.calculate(amount, registered);

        Assertions.assertEquals(expected, actual);
    }
}