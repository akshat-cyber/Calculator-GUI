package com.fatdevs.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public TextView textView;
public String ac(View view){
    return " ";
}
    public String back(View view){
        return " ";
    }
    public String minusPlus(View view){
        return " ";
    }
    public String divide(View view){
        textView.append(" ");
        return " ";
    }
    public int eight(View view){
textView.append("8");
  return 8;
    }
    public int seven(View view){
        textView.append("7");
        return 7;
    }
    public int nine(View view){
        textView.append("9");
        return 9;
    }

    public int five(View view){
        textView.append("5");
    return 5;
    }
    public int four(View view){
        textView.append("4");
    return 4;
    }
    public int three(View view){textView.append("3");
return 3;
    }
    public int two(View view){textView.append("2");
return 2;
    }

    public int one(View view){textView.append("1");
        return 1;
    }
    public int zero(View view){textView.append("0");
return 0;
    }

    public String point(View view){
return ".";
    }
    public String add(View view){
        return "+";
    }
    public String sub(View view){
        return "-";
    }
    public String  equal(View view){
return "=";
}
    public String mod(View view){
        textView.append(" ");
        return " ";
    }
    public String multiply(View view) {
        textView.append(" ");
        return " ";
    }
    public int six(View view){
    textView.append("6");
    return 6;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.screenAct);
         // button 56 + 495
        /*
        *
        *
        * */
 for(int i=0;i<4;i++){
     for (int j = 0; j < 4; j++) {

     }
 }
}
}
