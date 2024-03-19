package uberCodingInterview;

import java.util.HashMap;
import java.util.Map;

public class tripPassengerLimitProblem {
    public static void main(String[] args) {
        int[][] tripsArray = { {1, 56, 123}, {2, 69, 104}, {1, 154, 620}, {1, 742, 999}};
        System.out.println(validTripChecker(tripsArray));
        System.out.println(validTripCheckerWithHashMap(tripsArray));
    }
    public static boolean validTripChecker(int[][] trips) {
        int numberOfPassengers = 0;
        int passengerLimit = 4;
        for (int actualTripKilometer = 0; actualTripKilometer <= 1000; actualTripKilometer++) {
            for (int i = 0; i < trips.length; i++) {
                if (trips[i][1] == actualTripKilometer) {
                    numberOfPassengers += trips[i][0];
                }
                if (trips[i][2] == actualTripKilometer) {
                    numberOfPassengers -= trips[i][0];
                }
            }
            if (numberOfPassengers > passengerLimit) { return false; }
            actualTripKilometer += 1;
        }
        return true;
    }

    public static boolean validTripCheckerWithHashMap(int[][] trips) {
        HashMap<Integer, Integer> hashMap = new HashMap<>(1000);
        for (int[] trip : trips) {
            for (int i = trip[1]; i <= trip[2]; i++) {
                hashMap.put(i, trip[0]);
            }
        }
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() > 4) {
                return false;
            }
        }
        return true;
    }
}


