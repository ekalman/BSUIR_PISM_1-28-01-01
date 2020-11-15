package com.company.Template;

public class Admin extends Calculator{
    public int calculateTimeOnPlatform(int n, int m) {
        int time = (int)Math.pow(n, 2) + m;
        return time;
    }

    public double calculateActivity(int a, int b, int c) {
        double activity = a * Math.min(b, c);
        return activity;
    }
}
