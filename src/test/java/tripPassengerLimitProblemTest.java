import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import uberCodingInterview.tripPassengerLimitProblem;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumingThat;
import static utils.TestUtils.errorMsg;

class tripPassengerLimitProblemTest {

    @DisplayName("Calculates valid trips:")
    @ParameterizedTest(name= "{")
    @MethodSource("provideTrips")
    void test(int[][] array) {

    }

    static Stream<int[][]> provideTrips() {
        return Stream.of(
                new int[][]{{1, 2, 3}, {4, 5, 6}},
                new int[][]{{1, 2, 3}, {4, 5, 6}}
        );
    }


}
