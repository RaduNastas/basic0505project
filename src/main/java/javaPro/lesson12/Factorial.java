package javaPro.lesson12;

import java.math.BigDecimal;

@FunctionalInterface
public interface Factorial {
    BigDecimal compute(int number);
}