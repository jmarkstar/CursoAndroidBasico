package com.jmarkstar.s4.greendao;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.jmarkstar.s4.R;
import java.util.List;

/**
 * Created by Alumno on 30/09/2017.
 */
public class MyEntityAdapter extends RecyclerView.Adapter<MyEntityAdapter.EntityVH>{

    private List<MyEntity> entities;

    public void addList(List<MyEntity> entities){
        this.entities = entities;
    }

    @Override public EntityVH onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_green_dao_lista_item, parent, false);
        return new EntityVH(view);
    }

    @Override public void onBindViewHolder(EntityVH holder, int position) {
        MyEntity entity = entities.get(position);
        holder.tvName.setText(entity.getName());
        holder.tvLastName.setText(entity.getLastName());
    }

    @Override public int getItemCount() {
        return entities!=null?entities.size():0;
    }

    public class EntityVH extends RecyclerView.ViewHolder{

        TextView tvName, tvLastName;

        public EntityVH(View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_name);
            tvLastName = itemView.findViewById(R.id.tv_lastname);
        }
    }
}
