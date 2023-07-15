package org.example;
import org.example.Controller.Controller;


public class Main {
    public static void main(String[] args) {

        Controller ct = new Controller();
        boolean triger = true;
        while (triger){
            try {
                triger = ct.start();
            } catch (Exception e) {
                e.printStackTrace();
                System.err.println(e);
                triger = false;
            }
        }






    }
}