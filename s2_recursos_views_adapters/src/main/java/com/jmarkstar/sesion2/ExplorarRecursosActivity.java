package com.jmarkstar.sesion2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/** Este acivity muestra los datos de los recursos xml de la carpeta values.
 * @author jmarkstar
 * */
public class ExplorarRecursosActivity extends AppCompatActivity {

    //Como tenemos varios TextView, estoy declarandolos en una sola linea.
    private TextView tvString, tvInteger, tvBooleano1, tvBooleano2, tvArrayInteger, tvArrayString;
    private ImageView ivDrawableGenerico, ivIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explorar_recursos);

        //Conectando los objetos TextView con los Views creados en los XML.
        tvString = (TextView)findViewById(R.id.tv_string);
        tvInteger =(TextView)findViewById(R.id.tv_integer);
        tvBooleano1 =(TextView)findViewById(R.id.tv_booleano_1);
        tvBooleano2 =(TextView)findViewById(R.id.tv_booleano_2);
        tvArrayInteger =(TextView)findViewById(R.id.tv_array_integer);
        tvArrayString =(TextView)findViewById(R.id.tv_array_string);
        ivDrawableGenerico = (ImageView)findViewById(R.id.iv_my_drawable);
        ivIcon = (ImageView)findViewById(R.id.iv_my_icon);

        //Obteniendo un String desde el archivo value/string.xml y luego insertando el valor en
        // el TextView tvString.
        String autor = getResources().getString(R.string.autor);
        tvString.setText(autor);

        //Obteniendo un Integer desde el archivo value/integer.xml y luego insertando el valor en el
        //TextView tvInteger.
        Integer miNumero = getResources().getInteger(R.integer.ejemplo_integer);
        //Como no podemos insertar datos de tipo Integer en un TextView, primero lo convertimos a String y luego lo añadimos.
        String miNumeroString = String.valueOf(miNumero);
        tvInteger.setText(miNumeroString);

        //Obteniendo los Booleanos desde el archivo value/bools.xml
        Boolean booleano1 = getResources().getBoolean(R.bool.ejemplo_booleano_1);
        Boolean booleano2 = getResources().getBoolean(R.bool.ejemplo_booleano_2);
        //Tampoco podemos insertar datos de tipo Boolean, entonces primero lo convertimos a String.
        String miBooleano1String = String.valueOf(booleano1);
        String miBooleano2String = String.valueOf(booleano2);
        tvBooleano1.setText(miBooleano1String);
        tvBooleano2.setText(miBooleano2String);

        //Obteniendo un array de enteros desde el archivo values/arrays.xml
        int [] numerosPrimos = getResources().getIntArray(R.array.numeros_primos);
        //vamos a crear un String y poner los numeros allí separados por un espacio en banco, para luego mostrarlo en
        // el TextView tvArrayInteger.
        String arrayIntegerString = "";
        for(int item : numerosPrimos){
            arrayIntegerString = arrayIntegerString + item +" ";
        }
        tvArrayInteger.setText(arrayIntegerString);

        //Obteniendo un array de Strings desde el archivo values/arrays.xml
        String[] paises = getResources().getStringArray(R.array.paises);
        String paisesString = "";
        for(String pais : paises){
            paisesString = paisesString + pais +" ";
        }
        tvArrayString.setText(paisesString);

        //Obteniendo y insertando un Drawable en un ImageView
        ivDrawableGenerico.setImageResource(R.drawable.cat);
        ivIcon.setImageResource(R.drawable.ic_face);
    }
}
