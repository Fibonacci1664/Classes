package com.davegreen;

public class Main
{

    public static void main(String[] args)
    {
        Car porsche = new Car();
        Car mercedes = new Car();
        porsche.setModel("911");
        System.out.println("Model is " + porsche.getModel());
    }
}
