package com.driver;

public class Main {
    public static void main(String[] args) {
        Product p = new Product();

        // Task 3: Call method product(int x, int y)
        int result1 = p.product(2, 3);
        System.out.println("Result of product(int x, int y): " + result1);

        // Task 4: Call method product(int x, int y, int z)
        int result2 = p.product(2, 3, 4);
        System.out.println("Result of product(int x, int y, int z): " + result2);

        // Task 5: Call method product(double x, double y)
        double result3 = p.product(2.5, 3.5);
        System.out.println("Result of product(double x, double y): " + result3);
    }

    public static class Product {
        // Task 3: Method product(int x, int y)
        public int product(int x, int y) {
            return x * y;
        }

        // Task 4: Overloaded method product(int x, int y, int z)
        public int product(int x, int y, int z) {
            return x * y * z;
        }

        // Task 5: Overloaded method product(double x, double y)
        public double product(double x, double y) {
            return x * y;
        }
    }
}