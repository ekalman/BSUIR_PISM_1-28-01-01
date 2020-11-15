package com.company.Template;

public class Customer extends Calculator {
    public int calculateTimeOnPlatform(int n, int m) {
        int time = n + m;
        return time;
    }

    public double calculateActivity(int a, int b, int c) {
        double activity = a * Math.max(b, c);
        return activity;
    }
}
