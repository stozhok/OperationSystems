package funcs;

import java.util.Optional;

public class Operations {
    public static Optional<Double> trialFDouble(Integer x) {
        return Optional.of((double) x / 3);
    }

    public static Optional<Double> trialGDouble(Integer x) {
        return Optional.of((double) 3 / x);
    }

    public static Optional<Integer> trialFInteger(Integer x) {
        return Optional.of(x - 2);
    }

    public static Optional<Integer> trialGInteger(Integer x) {
        return Optional.of(x * (x - 1));
    }
}