"""
Copyright (c) 2025 Ahmed R. Sadik, Honda Research Institute Europe GmbH 

This source code is licensed under the MIT License found in the
LICENSE file in the root directory of this source tree. This dataset contains smelly code for research and refactoring purposes.
"""


import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {
        double avgTime = measureExecutionTime();
        System.out.println("Average execution time over multiple runs: " + avgTime + " seconds");
    }

    public static double measureExecutionTime() {
        int runs = 10;
        List<Long> executionTimes = new ArrayList<>();

        for (int i = 0; i < runs; i++) {
            long startTime = System.nanoTime();

            Shop shop = new Shop();
            Customer customer = new Customer(shop);
            shop.orderPizza("Cheese");
            customer.complain("The pizza is too cold.");

            long endTime = System.nanoTime();
            long executionTime = endTime - startTime;
            executionTimes.add(executionTime);
        }

        double totalExecutionTime = 0;
        for (Long time : executionTimes) {
            totalExecutionTime += time;
        }

        return totalExecutionTime / runs / 1_000_000_000.0; // Convert nanoseconds to seconds
    }
}
