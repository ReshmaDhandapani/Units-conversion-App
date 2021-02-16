package com.example.task1;

public class Currency {
    String From;
    String To;
    public double result;
    double temp;

    public Currency(String x, String y, String z) {
        From = x;
        To = y;
        temp = Double.parseDouble(z);
        if (From == "INR") {
            if (To == "INR") {
                result = temp;
            }
            else if (To == "EUR") {
                result = temp * 0.01;
            }
            else if (To == "USD") {
                result = temp * 0.01;
            }
            else if (To == "JPY") {
                result = temp * 1.42;
            }
            else if (To == "GBP") {
                result = temp * 0.01;
            }
            else if (To == "AUD") {
                result = temp * 0.02;
            }
            else if (To == "MXN") {
                result = temp * 0.27;
            }
            else if (To == "KWD") {
                result = temp * 0.0042;
            }
            else if (To == "SGD") {
                result = temp * 0.02;
            }
            else if (To == "MYR") {
                result = temp * 0.05;
            }
            else if (To == "AED") {
                result = temp * 0.05;
            }
        }
        else if(From == "EUR")
        {
            if (To == "INR") {
                result = temp * 89.66;
            }
            else if (To == "EUR") {
                result = temp;
            }
            else if (To == "USD") {
                result = temp * 1.22;
            }
            else if (To == "JPY") {
                result = temp * 127.07;
            }
            else if (To == "GBP") {
                result = temp * 0.90;
            }
            else if (To == "AUD") {
                result = temp * 1.58;
            }
            else if (To == "MXN") {
                result = temp * 24.47;
            }
            else if (To == "KWD") {
                result = temp * 0.37;
            }
            else if (To == "SGD") {
                result = temp * 1.62;
            }
            else if (To == "MYR") {
                result = temp * 4.93;
            }
            else if (To == "AED") {
                result = temp * 4.49;
            }

        }
        else if(From == "USD")
        {
            if (To == "INR") {
                result = temp * 73.34;
            }
            else if (To == "EUR") {
                result = temp * 0.82;
            }
            else if (To == "USD") {
                result = temp;
            }
            else if (To == "JPY") {
                result = temp * 103.94;
            }
            else if (To == "GBP") {
                result = temp * 0.74;
            }
            else if (To == "AUD") {
                result = temp * 1.29;
            }
            else if (To == "MXN") {
                result = temp * 20.02;
            }
            else if (To == "KWD") {
                result = temp * 0.30;
            }
            else if (To == "SGD") {
                result = temp * 1.33;
            }
            else if (To == "MYR") {
                result = temp * 4.03;
            }
            else if (To == "AED") {
                result = temp * 3.67;
            }
        }
        else if(From == "JPY")
        {
            if (To == "INR") {
                result = temp * 0.71;
            }
            else if (To == "EUR") {
                result = temp * 0.0079;
            }
            else if (To == "USD") {
                result = temp * 0.0096;
            }
            else if (To == "JPY") {
                result = temp;
            }
            else if (To == "GBP") {
                result = temp * 0.0071;
            }
            else if (To == "AUD") {
                result = temp * 0.01;
            }
            else if (To == "MXN") {
                result = temp * 0.19;
            }
            else if (To == "KWD") {
                result = temp * 0.0029;
            }
            else if (To == "SGD") {
                result = temp * 0.01;
            }
            else if (To == "MYR") {
                result = temp * 0.04;
            }
            else if (To == "AED") {
                result = temp * 0.04;
            }
        }
        else if(From == "GBP")
        {
            if (To == "INR") {
                result = temp * 99.49;
            }
            else if (To == "EUR") {
                result = temp * 1.11;
            }
            else if (To == "USD") {
                result = temp * 1.36;
            }
            else if (To == "JPY") {
                result = temp * 141.01;
            }
            else if (To == "GBP") {
                result = temp * 0.000001653439;
            }
            else if (To == "AUD") {
                result = temp * 1.75;
            }
            else if (To == "MXN") {
                result = temp * 27.16;
            }
            else if (To == "KWD") {
                result = temp * 0.41;
            }
            else if (To == "SGD") {
                result = temp * 1.80;
            }
            else if (To == "MYR") {
                result = temp * 5.47;
            }
            else if (To == "AED") {
                result = temp * 4.98;
            }
        }
        else if(From == "AUD")
        {
            if (To == "INR") {
                result = temp * 56.92;
            }
            else if (To == "EUR") {
                result = temp * 0.63;
            }
            else if (To == "USD") {
                result = temp * 0.78;
            }
            else if (To == "JPY") {
                result = temp * 80.67;
            }
            else if (To == "GBP") {
                result = temp * 0.57;
            }
            else if (To == "AUD") {
                result = temp;
            }
            else if (To == "MXN") {
                result = temp * 15.54;
            }
            else if (To == "KWD") {
                result = temp * 0.24;
            }
            else if (To == "SGD") {
                result = temp * 1.03;
            }
            else if (To == "MYR") {
                result = temp * 3.13;
            }
            else if (To == "AED") {
                result = temp * 2.85;
            }
        }
        else if(From == "MXN")
        {
            if (To == "INR") {
                result = temp * 3.66;
            }
            else if (To == "EUR") {
                result = temp * 0.04;
            }
            else if (To == "USD") {
                result = temp * 0.05;
            }
            else if (To == "JPY") {
                result = temp * 5.19;
            }
            else if (To == "GBP") {
                result = temp * 0.04;
            }
            else if (To == "AUD") {
                result = temp * 0.06;
            }
            else if (To == "MXN") {
                result = temp;
            }
            else if (To == "KWD") {
                result = temp * 0.02;
            }
            else if (To == "SGD") {
                result = temp * 0.07;
            }
            else if (To == "MYR") {
                result = temp * 0.20;
            }
            else if (To == "AED") {
                result = temp * 0.18;
            }
        }
        else if(From == "KWD")
        {
            if (To == "INR") {
                result = temp * 240.94;
            }
            else if (To == "EUR") {
                result = temp * 2.69;
            }
            else if (To == "USD") {
                result = temp * 3.29;
            }
            else if (To == "JPY") {
                result = temp * 341.47;
            }
            else if (To == "GBP") {
                result = temp * 2.42;
            }
            else if (To == "AUD") {
                result = temp * 4.23;
            }
            else if (To == "MXN") {
                result = temp * 65.76;
            }
            else if (To == "KWD") {
                result = temp;
            }
            else if (To == "SGD") {
                result = temp * 4.36;
            }
            else if (To == "MYR") {
                result = temp * 13.25;
            }
            else if (To == "AED") {
                result = temp * 12.07;
            }
        }
        else if(From == "SGD")
        {
            if (To == "INR") {
                result = temp * 55.31;
            }
            else if (To == "EUR") {
                result = temp * 0.62;
            }
            else if (To == "USD") {
                result = temp * 0.75;
            }
            else if (To == "JPY") {
                result = temp * 78.39;
            }
            else if (To == "GBP") {
                result = temp * 0.56;
            }
            else if (To == "AUD") {
                result = temp * 0.97;
            }
            else if (To == "MXN") {
                result = temp * 15.10;
            }
            else if (To == "KWD") {
                result = temp * 0.23;
            }
            else if (To == "SGD") {
                result = temp;
            }
            else if (To == "MYR") {
                result = temp * 3.04;
            }
            else if (To == "AED") {
                result = temp * 2.77;
            }
        }
        else if(From == "MYR")
        {
            if (To == "INR") {
                result = temp * 18.19;
            }
            else if (To == "EUR") {
                result = temp * 0.20;
            }
            else if (To == "USD") {
                result = temp * 0.025;
            }
            else if (To == "JPY") {
                result = temp * 25.78;
            }
            else if (To == "GBP") {
                result = temp * 0.18;
            }
            else if (To == "AUD") {
                result = temp * 0.32;
            }
            else if (To == "MXN") {
                result = temp * 4.96;
            }
            else if (To == "KWD") {
                result = temp * 0.08;
            }
            else if (To == "SGD") {
                result = temp * 0.33;
            }
            else if (To == "MYR") {
                result = temp;
            }
            else if (To == "AED") {
                result = temp * 0.91;
            }
        }
        else if(From == "AED")
        {
            if (To == "INR") {
                result = temp * 19.97;
            }
            else if (To == "EUR") {
                result = temp * 0.22;
            }
            else if (To == "USD") {
                result = temp * 0.27;
            }
            else if (To == "JPY") {
                result = temp * 28.30;
            }
            else if (To == "GBP") {
                result = temp * 0.20;
            }
            else if (To == "AUD") {
                result = temp * 0.35;
            }
            else if (To == "MXN") {
                result = temp * 5.45;
            }
            else if (To == "KWD") {
                result = temp * 0.08;
            }
            else if (To == "SGD") {
                result = temp * 0.00000003168809;
            }
            else if (To == "MYR") {
                result = temp * 0.36;
            }
            else if (To == "AED") {
                result = temp;
            }
        }
    }
}