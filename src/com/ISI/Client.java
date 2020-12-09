package com.ISI;
import java.rmi.Naming;
import java.rmi.Remote;
import java.util.*;

public class Client {
    public static void main(String[] args) {
        System.out.println("Client starting up ");
        try {
            Remote service = Naming.lookup("rmi://localhost:1100/Service");
            if (service instanceof Service) {
                List<String> list = Arrays.asList("Ayoub", "Youssef","Ayoub", "Mohammed" ,"Oussama","Youssef");
                Set<String> set = ((Service) service).noDuplicate(list);
                System.out.println(set);
            }
        } catch (Exception e) {
            e.printStackTrace();
    }
}
}

