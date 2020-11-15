package com.company;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Zodiac extends Remote {
    String getZodiac(String date) throws RemoteException;
}
