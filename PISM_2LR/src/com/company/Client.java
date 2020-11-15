package com.company;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Client{

    private Client() {}

    public static void main(String[] args) {
        String host = (args.length < 1) ? null : args[0];
        try {
            Registry registry = LocateRegistry.getRegistry(host);
            Zodiac stub = (Zodiac) registry.lookup("Zodiac");
            String response = stub.getZodiac(getDate());
            System.out.println("response: " + response);
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }

    static String getDate(){
        System.out.println("Please, enter the date of birth in the following format: DD.MM");
        Scanner in = new Scanner(System.in);
        String date = in.nextLine();
        return date;
    }
}