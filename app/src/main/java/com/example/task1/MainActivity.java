package com.example.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String[] choice = { "Temperature","Currency" ,"Distance","Time","Number"};
    String[] temp = {"Celsius", "Fahrenheit" ,"Kelvin"};
    String[] curr = {"INR","EUR","USD","JPY","GBP","AUD","MXN","KWD","SGD","MYR","AED"};
    String[] time = {"Sec","Min","Hour","Day","Week","Month","Year"};
    String[] num = {"Bin","Qui","Oct","Dec","Hex"};
    String[] dis = {"inch","feet","yard","mile","millimetre","centimetre","meter","kilometer"};
//    Button button;
//    EditText et1;
//    TextView result;
    double a;
    Temperature temperature;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner mySpinner = (Spinner) findViewById(R.id.spinner1);
        Spinner mySpinner1 = (Spinner) findViewById(R.id.spinner2);
        Spinner mySpinner2 = (Spinner) findViewById(R.id.spinner3);
        Button button;
        EditText et1;
        TextView result;
        ArrayAdapter myAdopter;
        myAdopter = new ArrayAdapter(this,android.R.layout.simple_spinner_item,choice);
        ArrayAdapter myAdopter1;
        myAdopter1 = new ArrayAdapter(this,android.R.layout.simple_spinner_item,temp);
        ArrayAdapter myAdopter2;
        myAdopter2 = new ArrayAdapter(this,android.R.layout.simple_spinner_item,curr);
        ArrayAdapter myAdopter3;
        myAdopter3 = new ArrayAdapter(this,android.R.layout.simple_spinner_item,dis);
        ArrayAdapter myAdopter4;
        myAdopter4 = new ArrayAdapter(this,android.R.layout.simple_spinner_item,time);
        ArrayAdapter myAdopter5;
        myAdopter5 = new ArrayAdapter(this,android.R.layout.simple_spinner_item,num);
        et1=(EditText)findViewById(R.id.textView2);
        result =(TextView)findViewById(R.id.textView3);
        button = (Button) findViewById(R.id.button);

        myAdopter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdopter);
        mySpinner.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        myAdopter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        mySpinner1.setAdapter(myAdopter1);
                        mySpinner2.setAdapter(myAdopter1);
                        break;
                    case 1:
                        myAdopter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        mySpinner1.setAdapter(myAdopter2);
                        mySpinner2.setAdapter(myAdopter2);
                        break;
                    case 2:
                        myAdopter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        mySpinner1.setAdapter(myAdopter3);
                        mySpinner2.setAdapter(myAdopter3);
                        break;
                    case 3:
                        myAdopter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        mySpinner1.setAdapter(myAdopter4);
                        mySpinner2.setAdapter(myAdopter4);
                        break;
                    case 4:
                        myAdopter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        mySpinner1.setAdapter(myAdopter5);
                        mySpinner2.setAdapter(myAdopter5);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String type = mySpinner.getSelectedItem().toString();
                String From = mySpinner1.getSelectedItem().toString();
                String To = mySpinner2.getSelectedItem().toString();
                if (et1.getText().toString().matches("[-+]?[0-9]*\\.?[0-9]+"))
                {
                    switch(type)
                    {
                        case "Temperature":
                            if(From=="Celsius" && To=="Fahrenheit")
                            {
                                temperature = new Temperature("celsiustofahrenheit",  et1.getText().toString());
                                result.setText(temperature.result+" degree F");
                            }
                            else if(From=="Fahrenheit" && To=="Celsius")
                            {
                                temperature = new Temperature("fahrenheittocelsius", et1.getText().toString());
                                result.setText(temperature.result+" degree C");
                            }
                            else if(From=="Fahrenheit" && To=="Kelvin")
                            {
                                temperature = new Temperature("fahrenheittokelvin", et1.getText().toString());
                                result.setText(temperature.result+" degree K");
                            }
                            else if(From=="Kelvin" && To=="Celsius")
                            {
                                temperature = new Temperature("kelvintocelsius", et1.getText().toString());
                                result.setText(temperature.result+" degree C");
                            }
                            else if(From=="Kelvin" && To=="Fahrenheit")
                            {
                                temperature = new Temperature("kelvintofahrenheit", et1.getText().toString());
                                result.setText(temperature.result+" degree F");
                            }
                            else if(From=="Celsius" && To=="Kelvin")
                            {
                                temperature = new Temperature("celsiustokelvin", et1.getText().toString());
                                result.setText(temperature.result+" degree K");
                            }
                            break;
                        case "Currency":
                            Currency c = new Currency(From,To,et1.getText().toString());
                            result.setText(Double.toString(c.result));
                            break;
                        case "Distance":
                            Distance d = new Distance(From,To,et1.getText().toString());
                            result.setText(Double.toString(d.result));
                            break;
                        case "Time":
                            Time t = new Time(From,To,et1.getText().toString());
                            result.setText(Double.toString(t.result));
                            break;
                        case "Number":
                            System.out.println("d");
                            break;

                    }
                }
                else
                {
                    System.out.println("\nENTER ONLY NUMBERS");
                }
            }
        });
    }
}