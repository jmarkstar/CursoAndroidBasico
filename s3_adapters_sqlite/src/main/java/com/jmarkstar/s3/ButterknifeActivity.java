package com.jmarkstar.s3;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ButterknifeActivity extends AppCompatActivity {

    @BindView(R.id.tv_titulo)
    TextView tvTitulo;
    @BindView(R.id.et_nombre)
    EditText etNombre;
    @BindView(R.id.et_apellidos)
    EditText etApellidos;
    @BindView(R.id.et_direccion)
    EditText etDireccion;
    @BindView(R.id.rg_hijos)
    RadioGroup rgHijos;
    @BindView(R.id.rg_cuantos_hijos)
    RadioGroup rgCuantosHijos;
    @BindView(R.id.ll_cuantos_hijos)
    LinearLayout llCuantosHijos;
    @BindView(R.id.cb_terms)
    CheckBox cbTerms;
    @BindView(R.id.m_btn_guardar)
    Button mBtnGuardar;

    public static void start(Context context) {
        Intent starter = new Intent(context, ButterknifeActivity.class);
        context.startActivity(starter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_butterknife);
        ButterKnife.bind(this);

        rgHijos.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int viewId) {
                if (viewId == R.id.rb_si) {
                    llCuantosHijos.setVisibility(View.VISIBLE);
                } else {
                    llCuantosHijos.setVisibility(View.GONE);
                }
            }
        });

        rgCuantosHijos.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if (i == R.id.rb_1)
                    Toast.makeText(ButterknifeActivity.this, R.string.opt_1_mensaje, Toast.LENGTH_SHORT).show();
                else if (i == R.id.rb_2_a_4)
                    Toast.makeText(ButterknifeActivity.this, R.string.opt_2_mensaje, Toast.LENGTH_SHORT).show();
                else if (i == R.id.rb_5_mas)
                    Toast.makeText(ButterknifeActivity.this, R.string.opt_3_mensaje, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @OnClick(R.id.m_btn_guardar)
    public void onViewClicked() {
        Toast.makeText(this, R.string.guardar_mensaje, Toast.LENGTH_SHORT).show();
    }

    @OnClick({R.id.tv_view_1, R.id.btn_view_2, R.id.iv_view_3})
    public void onMultiViewClicked() {
        Toast.makeText(this, R.string.compartido_mensaje, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
