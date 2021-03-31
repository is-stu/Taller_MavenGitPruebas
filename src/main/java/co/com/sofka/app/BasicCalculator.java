package co.com.sofka.app;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicCalculator {
    private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);

    public Long sum(Long number1, Long number2) {
        logger.info("Summing {} + {}", number1, number2);
        return number1 + number2;
    }

    //TODO: Resta, multiplicacion & division

    public Long subtraction(Long number1, Long number2) {
        logger.info("subtracting {} - {}", number1, number2);
        return number1 - number2;
    }

    public Long multiply(Long number1, Long number2) {
        logger.info("multiply {} * {}", number1, number2);
        return number1 * number2;
    }

    public Long divide(Long number1, Long number2) {
        logger.info("divide {} / {}", number1, number2);
        if (number2 == 0)
            return 0L;
        return number1 / number2;

    }
}
