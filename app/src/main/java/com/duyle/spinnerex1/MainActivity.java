package com.duyle.spinnerex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spNgonngu = findViewById(R.id.sp_ngonngu);
        String [] arrNgonngu = new String[] {
          "Tieng Viet",
          "Tieng Anh",
          "Tieng Han Quoc",
          "Tieng Nhat"
        };

        ArrayAdapter<String> adapterNgonngu = new ArrayAdapter<>(
                getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, arrNgonngu);

        spNgonngu.setAdapter(adapterNgonngu);

        spNgonngu.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String sNgonngu = arrNgonngu[i];
                Toast.makeText(MainActivity.this, sNgonngu, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        Spinner spNgonngu2 = findViewById(R.id.sp_ngonngu2);

        ArrayList<NgonNguModel> arrNgonNgu2 = new ArrayList<>();
        arrNgonNgu2.add(new NgonNguModel("Tieng Viet", R.drawable.ic_flag_vn));
        arrNgonNgu2.add(new NgonNguModel("Tieng Anh", R.drawable.ic_flag_eng));
        arrNgonNgu2.add(new NgonNguModel("Tieng Han", R.drawable.ic_flag_kr));
        arrNgonNgu2.add(new NgonNguModel("Tieng Nhat", R.drawable.ic_flag_japan));

        AdapterNgonNgu adapterNgonNgu2 = new AdapterNgonNgu(this, arrNgonNgu2);

        spNgonngu2.setAdapter(adapterNgonNgu2);

        // xu ly khi chon vao spinner2 thi hien thi Toast ngon ngu NSD chon


    }
}