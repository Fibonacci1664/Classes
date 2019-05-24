package com.davegreen;

/**
 * Created by daveg on 06/06/2017.
 */
public class Car
{
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model)      // Setter
    {
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("M Class"))
        {
            this.model = model;
        }
        else
        {
            this.model = "Unknown";
        }
    }

    public String getModel()                // Getter
    {
        return this.model;
    }
}
