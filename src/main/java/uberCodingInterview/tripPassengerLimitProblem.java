package uberCodingInterview;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;

public class tripPassengerLimitProblem {
    public static void main(String[] args) {
        int[][] tripsArray = { {1, 3, 5}, {2, 8, 10}, {6, 15, 20}, {1, 22, 27} };
        System.out.println(validTripCheckerNaiveApproach(tripsArray, 4));
        System.out.println(validTripChecker(tripsArray, 4));
        System.out.println(validTripCheckerWithHashMap(tripsArray, 4));
    }
    public static boolean validTripCheckerNaiveApproach(int[][] trips, int passengerLimit) {
        int numberOfPassengers = 0;
        for (int actualTripKilometer = 0; actualTripKilometer <= 1000; actualTripKilometer++) {
            for (int[] trip : trips) {
                if (trip[1] == actualTripKilometer) {
                    numberOfPassengers += trip[0];
                }
                if (trip[2] == actualTripKilometer) {
                    numberOfPassengers -= trip[0];
                }
            }
            if (numberOfPassengers > passengerLimit) { return false; }
        }
        return true;
    }

    public static boolean validTripChecker(int[][] trips, int passengerLimit) {
        ArrayList<Integer> passengersAtKilometer = new ArrayList<>(Collections.nCopies(1001, 0));
        for (int[] trip : trips) {
           int currentPassengers = passengersAtKilometer.get(trip[1]);
           passengersAtKilometer.set(trip[1], currentPassengers + trip[0]);
           passengersAtKilometer.set(trip[2], currentPassengers - trip[0]);
        }
        int numberOfPassengers = 0;
        for (int passengerCount : passengersAtKilometer) {
            numberOfPassengers += passengerCount;
            if (numberOfPassengers > passengerLimit) {
                return false;
            }
        }
        return true;
    }

    public static boolean validTripCheckerWithGraphs(int[][] trips, int passengerLimit) {
        return true;
    }

    public static boolean validTripCheckerWithHashMap(int[][] trips, int passengerLimit) {
        HashMap<Integer, Integer> hashMap = new HashMap<>(1000);
        for (int[] trip : trips) {
            for (int i = trip[1]; i <= trip[2]; i++) {
                hashMap.put(i, trip[0]);
            }
        }
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() > passengerLimit) {
                return false;
            }
        }
        return true;
    }
}


