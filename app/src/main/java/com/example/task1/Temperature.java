package com.example.task1;

public class Temperature {
    String selected;
    double temp;
    double result;
    public Temperature(String x,String y)
    {
        selected = x;
        temp = Double.parseDouble(y);
        if(selected == "celsiustofahrenheit")
        {
            result = (temp*9)/5+32;
        }
        else if(selected == "fahrenheittocelsius")
        {
            result = (temp-32)*5/9;
        }
        else if(selected == "fahrenheittokelvin")
        {
            result = (temp-32)/1.8+273.15;
        }
        else if(selected == "celsiustokelvin")
        {
            result = temp + 273.15;
        }
        else if(selected == "kelvintocelsius")
        {
            result = temp + 273.15;
        }
        else if(selected == "kelvintofahrenheit")
        {
            result = (temp * 1.8) - 459.67;
        }
        else
        {
            result = temp;
        }
    }

}
