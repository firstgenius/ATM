package ATM;

import lombok.SneakyThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ATMTest {
    ByteArrayOutputStream stream = new ByteArrayOutputStream();
    ATM atm ;
    @BeforeEach
    void setUp() {
        atm = new ATM();
        System.setOut(new PrintStream(stream));
    }

    @SneakyThrows
    @Test
    void process() {
        atm.process(120);
        assertTrue(stream.toString().contains("Please receive 6 of 20 UAH bills."));
        atm.process(125);
        assertTrue(stream.toString().contains("Please receive 1 of 5 UAH bills."));
        assertTrue(stream.toString().contains("Please receive 0 of 10 UAH bills."));
        assertTrue(stream.toString().contains("Please receive 6 of 20 UAH bills."));

    }
}