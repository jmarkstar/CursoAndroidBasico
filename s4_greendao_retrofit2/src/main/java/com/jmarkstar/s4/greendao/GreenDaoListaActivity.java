package com.jmarkstar.s4.greendao;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.jmarkstar.s4.R;
import com.jmarkstar.s4.S4Application;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class GreenDaoListaActivity extends AppCompatActivity {

    @BindView(R.id.rv_lista) RecyclerView rvLista;

    private MyEntityAdapter adapter;

    private DaoSession daoSession;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_green_dao_lista);
        ButterKnife.bind(this);

        S4Application s4Application = (S4Application)getApplication();
        daoSession = s4Application.getDaoSession();

        rvLista.setLayoutManager(new LinearLayoutManager(this));
        rvLista.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

        adapter = new MyEntityAdapter();
    }

    @Override protected void onResume() {
        super.onResume();
        adapter.addList(daoSession.getMyEntityDao().loadAll());
    }

    @OnClick(R.id.btn_agregar)
    public void onViewClicked() {

    }
}
