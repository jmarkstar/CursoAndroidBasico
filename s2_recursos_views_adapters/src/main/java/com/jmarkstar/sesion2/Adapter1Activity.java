package com.jmarkstar.sesion2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class Adapter1Activity extends AppCompatActivity {

    private ListView mLvPaises;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter1);

        mLvPaises = (ListView)findViewById(R.id.lv_paises);

        String[] paises = getResources().getStringArray(R.array.paises);

        ListAdapter adaptador = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, paises);
        mLvPaises.setAdapter(adaptador);
    }
}
