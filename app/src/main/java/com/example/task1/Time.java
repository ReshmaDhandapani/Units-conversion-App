package com.example.task1;
public class Time {
    String From;
    String To;
    public double result;
    double temp;

    public Time(String x, String y, String z) {
        From = x;
        To = y;
        temp = Double.parseDouble(z);
        if (From == "Sec") {
            if (To == "Sec") {
                result = temp;
            }
            else if (To == "Min") {
                result = temp * 0.01666667;
            }
            else if (To == "Hour") {
                result = temp * 0.0002777778;
            }
            else if (To == "Day") {
                result = temp * 0.00001157407;
            }
            else if (To == "Week") {
                result = temp * 0.000001653439;
            }
            else if (To == "Month") {
                result = temp * 0.0000003802571;
            }
            else if (To == "Year") {
                result = temp * 0.00000003168809;
            }
        }
        else if(From == "Min")
        {
            if (To == "Sec") {
                result = temp * 60;
            }
            else if (To == "Min") {
                result = temp;
            }
            else if (To == "Hour") {
                result = temp * 0.01666667;
            }
            else if (To == "Day") {
                result = temp * 0.0006944444;
            }
            else if (To == "Week") {
                result = temp * 0.00009920635;
            }
            else if (To == "Month") {
                result = temp * 0.00002281542;
            }
            else if (To == "Year") {
                result = temp * 0.000001901285;
            }

        }
        else if(From == "Hour")
        {
            if (To == "Sec") {
                result = temp * 3600;
            }
            else if (To == "Min") {
                result = temp * 60;
            }
            else if (To == "Hour") {
                result = temp;
            }
            else if (To == "Day") {
                result = temp * 0.04166667;
            }
            else if (To == "Week") {
                result = temp * 0.005952381;
            }
            else if (To == "Month") {
                result = temp * 0.001368925;
            }
            else if (To == "Year") {
                result = temp * 0.0001140771;
            }
        }
        else if(From == "Day")
        {
            if (To == "Sec") {
                result = temp * 86400;
            }
            else if (To == "Min") {
                result = temp * 1440;
            }
            else if (To == "Hour") {
                result = temp * 24;
            }
            else if (To == "Day") {
                result = temp;
            }
            else if (To == "Week") {
                result = temp * 0.1428571;
            }
            else if (To == "Month") {
                result = temp * 0.03285421;
            }
            else if (To == "Year") {
                result = temp * 0.002737851;
            }
        }
        else if(From == "Week")
        {
            if (To == "Sec") {
                result = temp * 604800;
            }
            else if (To == "Min") {
                result = temp * 10080;
            }
            else if (To == "Hour") {
                result = temp * 168;
            }
            else if (To == "Day") {
                result = temp * 7;
            }
            else if (To == "Week") {
                result = temp;
            }
            else if (To == "Month") {
                result = temp * 0.2299795;
            }
            else if (To == "Year") {
                result = temp * 0.01916496;
            }
        }
        else if(From == "Month")
        {
            if (To == "Sec") {
                result = temp * 0.00000003168809;
            }
            else if (To == "Min") {
                result = temp * 43830;
            }
            else if (To == "Hour") {
                result = temp * 730.0;
            }
            else if (To == "Day") {
                result = temp * 30.4375;
            }
            else if (To == "Week") {
                result = temp * 4.348214;
            }
            else if (To == "Month") {
                result = temp;
            }
            else if (To == "Year") {
                result = temp * 0.8333333;
            }
        }
        else if(From == "Year")
        {
            if (To == "Sec") {
                result = temp * 31557600;
            }
            else if (To == "Min") {
                result = temp * 525960;
            }
            else if (To == "Hour") {
                result = temp * 8766;
            }
            else if (To == "Day") {
                result = temp * 365.25;
            }
            else if (To == "Week") {
                result = temp * 52.17857;
            }
            else if (To == "Month") {
                result = temp * 12;
            }
            else if (To == "Year") {
                result = temp;
            }
        }

    }
}