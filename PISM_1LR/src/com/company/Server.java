package com.company;

import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server implements Zodiac{

    public Server() {}

    public String getZodiac(String date) {
        String day_substring = date.substring(0, 2);
        int day = Integer.parseInt(day_substring);
        String month = date.substring(3);
        String sign = "";

        switch (month) {
            case "12":
                if (day < 22)
                    sign = "Sagittarius";
                else
                    sign = "capricorn";
                break;
            case "01":
                if (day < 20)
                    sign = "Capricorn";
                else
                    sign = "aquarius";
                break;
            case "02":
                if (day < 19)
                    sign = "Aquarius";
                else
                    sign = "pisces";
                break;
            case "03":
                if (day < 21)
                    sign = "Pisces";
                else
                    sign = "Aries";
                break;
            case "04":
                if (day < 20)
                    sign = "Aries";
                else
                    sign = "Taurus";
                break;
            case "05":
                if (day < 21)
                    sign = "Taurus";
                else
                    sign = "Gemini";
                break;
            case "06":
                if (day < 21)
                    sign = "Gemini";
                else
                    sign = "Cancer";
                break;
            case "07":
                if (day < 23)
                    sign = "Cancer";
                else
                    sign = "Leo";
                break;
            case "08":
                if (day < 23)
                    sign = "Leo";
                else
                    sign = "Virgo";
                break;
            case "09":
                if (day < 23)
                    sign = "Virgo";
                else
                    sign = "Libra";
                break;
            case "10":
                if (day < 23)
                    sign = "Libra";
                else
                    sign = "Scorpio";
                break;
            case "11":
                if (day < 22)
                    sign = "Scorpio";
                else
                    sign = "Sagittarius";
                break;
            default:
                sign = "Дурашка, которая не умеет вводить даты";
                break;
        }
        return "You are " + sign + "!";
    }

    public static void main(String args[]) {
        try {
            Server obj = new Server();
            Zodiac stub = (Zodiac) UnicastRemoteObject.exportObject(obj, 0);
            Registry registry = LocateRegistry.createRegistry( 1099);
            registry.bind("Zodiac", stub);
            System.err.println("Server ready");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}