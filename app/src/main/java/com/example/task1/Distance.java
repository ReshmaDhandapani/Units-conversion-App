package com.example.task1;
public class Distance {
    String From;
    String To;
    public double result;
    double temp;

    public Distance(String x, String y, String z) {
        From = x;
        To = y;
        temp = Double.parseDouble(z);
        if (From == "inch") {
            if (To == "inch") {
                result = temp;
            }
            else if (To == "feet") {
                result = temp * 0.083333333333333;
            }
            else if (To == "yard") {
                result = temp * 0.02777778;
            }
            else if (To == "mile") {
                result = temp * 0.00001578283;
            }
            else if (To == "millimetre") {
                result = temp * 25.4;
            }
            else if (To == "centimetre") {
                result = temp * 2.54;
            }
            else if (To == "meter") {
                result = temp * 0.0254;
            }
            else if (To == "kilometer") {
                result = temp * 0.0000254;
            }
        }
        else if(From == "feet")
        {
            if (To == "inch") {
                result = temp * 12;
            }
            else if (To == "feet") {
                result = temp;
            }
            else if (To == "yard") {
                result = temp * 0.3333333;
            }
            else if (To == "mile") {
                result = temp * 0.0001893939;
            }
            else if (To == "millimetre") {
                result = temp * 304.8;
            }
            else if (To == "centimetre") {
                result = temp * 30.48;
            }
            else if (To == "meter") {
                result = temp * 0.3048;
            }
            else if (To == "kilometer") {
                result = temp * 0.0003048;
            }
        }
        else if(From == "yard")
        {
            if (To == "inch") {
                result = temp * 36;
            }
            else if (To == "feet") {
                result = temp * 3;
            }
            else if (To == "yard") {
                result = temp;
            }
            else if (To == "mile") {
                result = temp * 0.0005681818;
            }
            else if (To == "millimetre") {
                result = temp * 914.4;
            }
            else if (To == "centimetre") {
                result = temp * 91.44;
            }
            else if (To == "meter") {
                result = temp * 0.9144;
            }
            else if (To == "kilometer") {
                result = temp * 0.0009144;
            }
        }
        else if(From == "mile")
        {
            if (To == "inch") {
                result = temp * 63360;
            }
            else if (To == "feet") {
                result = temp * 5280;
            }
            else if (To == "yard") {
                result = temp * 1760;
            }
            else if (To == "mile") {
                result = temp;
            }
            else if (To == "millimetre") {
                result = temp * 1609344;
            }
            else if (To == "centimetre") {
                result = temp * 16093.4;
            }
            else if (To == "meter") {
                result = temp * 1609.344;
            }
            else if (To == "kilometer") {
                result = temp * 1.609344;
            }
        }
        else if(From == "millimetre")
        {
            if (To == "inch") {
                result = temp * 0.03937008;
            }
            else if (To == "feet") {
                result = temp * 0.00328084;
            }
            else if (To == "yard") {
                result = temp * 0.001093613;
            }
            else if (To == "mile") {
                result = temp * 0.0000006213712;
            }
            else if (To == "millimetre") {
                result = temp;
            }
            else if (To == "centimetre") {
                result = temp * 0.1;
            }
            else if (To == "meter") {
                result = temp * 0.001;
            }
            else if (To == "kilometer") {
                result = temp * 0.000001;
            }
        }
        else if(From == "centimetre")
        {
            if (To == "inch") {
                result = temp * 0.3937008;
            }
            else if (To == "feet") {
                result = temp * 0.0328084;
            }
            else if (To == "yard") {
                result = temp * 0.01093613;
            }
            else if (To == "mile") {
                result = temp * 0.000006213712;
            }
            else if (To == "millimetre") {
                result = temp * 10;
            }
            else if (To == "centimetre") {
                result = temp;
            }
            else if (To == "meter") {
                result = temp * 0.01;
            }
            else if (To == "kilometer") {
                result = temp * 0.00001;
            }
        }
        else if(From == "meter")
        {
            if (To == "inch") {
                result = temp * 39.37008;
            }
            else if (To == "feet") {
                result = temp * 3.28084;
            }
            else if (To == "yard") {
                result = temp * 1.093613;
            }
            else if (To == "mile") {
                result = temp * 0.0006213712;
            }
            else if (To == "millimetre") {
                result = temp * 1000;
            }
            else if (To == "centimetre") {
                result = temp * 100;
            }
            else if (To == "meter") {
                result = temp;
            }
            else if (To == "kilometer") {
                result = temp * 0.001;
            }
        }
        else if(From == "kilometer")
        {
            if (To == "inch") {
                result = 39370.08 * temp;
            }
            else if (To == "feet") {
                result = temp * 3280.84;
            }
            else if (To == "yard") {
                result = temp * 1093.613;
            }
            else if (To == "mile") {
                result = temp * 0.6213712;
            }
            else if (To == "millimetre") {
                result = temp * 1000000;
            }
            else if (To == "centimetre") {
                result = temp * 100000;
            }
            else if (To == "meter") {
                result = temp * 1000;
            }
            else if (To == "kilometer") {
                result = temp;
            }
        }

    }
}
