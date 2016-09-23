package com.readsensor.yuwono.freddy.read_sensor_all;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextView textView2,textView4;
    private SensorManager mgr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView2=(TextView)findViewById(R.id.textView2);
        textView4=(TextView)findViewById(R.id.textView4);
        mgr = (SensorManager) getSystemService(SENSOR_SERVICE);
        List<Sensor> sensors = mgr.getSensorList(Sensor.TYPE_ALL);
        textView2.setText(String.valueOf(sensors.size()));

        for(int x=0;x<sensors.size();x++)
        {
            textView4.append("no "+ (x+1)+" "+" nama sensor "+sensors.get(x).getName()+"\n"+" vendor "+sensors.get(x).getVendor()+"\n version "+sensors.get(x).getVersion()+"\n");
        }

    }

}
