package com.company.Template;

abstract class Calculator {
    abstract int calculateTimeOnPlatform(int n, int m);

    abstract double calculateActivity(int a, int b, int c);
    
    public final void Calculations() {
        Calculator admin = new Admin();
        System.out.println("Time on the platform for admin: ");
        System.out.println(admin.calculateTimeOnPlatform(115, 79));
        System.out.println("Activity on the platform for admin: ");
        System.out.println(admin.calculateActivity(12, 71, 11));
        
        Calculator customer = new Customer();
        System.out.println("Time on the platform for customer: ");
        System.out.println(customer.calculateTimeOnPlatform(24, 46));
        System.out.println("Activity on the platform for customer: ");
        System.out.println(customer.calculateActivity(5, 16, 9));
    }
}
