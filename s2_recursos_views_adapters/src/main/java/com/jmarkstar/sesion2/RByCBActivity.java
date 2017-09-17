package com.jmarkstar.sesion2;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class RByCBActivity extends AppCompatActivity {

    private RadioGroup mRgColores;
    private Spinner mSpPaises;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rby_cb);

        mRgColores = (RadioGroup)findViewById(R.id.rg_colores);
        mSpPaises = (Spinner)findViewById(R.id.sp_paises);

        //Este listener escucha cada seleccion que hace el usuario
        mRgColores.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                switch (checkedId){
                    case R.id.rb_verde:
                        Toast.makeText(RByCBActivity.this, "EL Color seleccionado es Verde", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rb_amarillo:
                        Toast.makeText(RByCBActivity.this, "EL Color seleccionado es Amarillo", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rb_azul:
                        Toast.makeText(RByCBActivity.this, "EL Color seleccionado es Azul", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rb_rojo:
                        Toast.makeText(RByCBActivity.this, "EL Color seleccionado es Rojo", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rb_purpura:
                        Toast.makeText(RByCBActivity.this, "EL Color seleccionado es Purpura", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        Toast.makeText(RByCBActivity.this, "Color incorrecto", Toast.LENGTH_SHORT).show();
                }
            }
        });


        //Obteniendo de datos del recurso xml y cargandolos al Spinner.

        //Lista de datos
        String[] paises = getResources().getStringArray(R.array.paises);

        //Preparando Adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, paises);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //Inserando el adapter al Spinner
        mSpPaises.setAdapter(adapter);
    }

    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();

        switch(view.getId()) {
            case R.id.cb_libro_1:
                if (checked){
                    Toast.makeText(this, "Libro 1 seleccionado", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.cb_libro_2:
                if (checked){
                    Toast.makeText(this, "Libro 2 seleccionado", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.cb_libro_3:
                if (checked){
                    Toast.makeText(this, "Libro 3 seleccionado", Toast.LENGTH_SHORT).show();
                }
                break;
            default:
        }
    }
}
