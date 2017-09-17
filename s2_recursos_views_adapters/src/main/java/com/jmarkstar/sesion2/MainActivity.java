package com.jmarkstar.sesion2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/** Este activy es el menu principal del app, contendrá botones que redigirá a otras pantallas,
 * cada pantalla tocará un tema en especifico.
 *
 * @author jmarkstar
 * */
public class MainActivity extends AppCompatActivity {

    private Button mBtnIrExplorarRecursos;
    private Button mBtnRelative1;
    private Button mBtnRelative2;
    private Button mBtnRByCB;
    private Button mBtnToast1;
    private Button mBtnToast2;
    private Button mBtnAdapter1;
    private Button mBtnAdapter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //esta linea de codigo es el que carga el layout.xml que tenemos en el recurso.
        setContentView(R.layout.activity_main);

        mBtnIrExplorarRecursos =(Button)findViewById(R.id.btn_recursos);
        mBtnRelative1 =(Button)findViewById(R.id.btn_relativelayout_1);
        mBtnRelative2 =(Button)findViewById(R.id.btn_relativelayout_2);
        mBtnRByCB =(Button)findViewById(R.id.btn_rb_y_ch);
        mBtnToast1 =(Button)findViewById(R.id.btn_toast_1);
        mBtnToast2 =(Button)findViewById(R.id.btn_toast_2);
        mBtnAdapter1 =(Button)findViewById(R.id.btn_adapter_1);
        mBtnAdapter2 =(Button)findViewById(R.id.btn_adapter_2);

        mBtnIrExplorarRecursos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Objeto Intent que nos permitirá ir a otro activity.
                Intent intent = new Intent( MainActivity.this, ExplorarRecursosActivity.class);
                startActivity(intent);
            }
        });

        mBtnRelative1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, RelativeLayout1Activity.class);
                startActivity(intent);
            }
        });

        mBtnRelative2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, RelativeLayout2Activity.class);
                startActivity(intent);
            }
        });

        mBtnRByCB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, RByCBActivity.class);
                startActivity(intent);
            }
        });

        /*** Basicamente los Toast son alertas con mensajes que mayormente son usados en temas de validaciones de campos y/o mensajes errores.
         *
         * */

        mBtnToast1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "Este es un mensaje Toast", Toast.LENGTH_SHORT).show();

            }
        });

        mBtnToast2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, R.string.toast_2_mensaje, Toast.LENGTH_LONG).show();
            }
        });

        mBtnAdapter1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, Adapter1Activity.class);
                startActivity(intent);
            }
        });

        mBtnAdapter2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent( MainActivity.this, RelativeLayout2Activity.class);
                //startActivity(intent);
            }
        });
    }
}
