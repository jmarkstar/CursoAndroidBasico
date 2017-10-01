package com.jmarkstar.s4.greendao;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by jmarkstar on 30/09/2017.
 */
@Entity
public class MyEntity {

    @Id(autoincrement = true)
    private long id;

    private String name;
    private Integer lastName;

    @Generated(hash = 628826244)
    public MyEntity(long id, String name, Integer lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

    @Generated(hash = 958988922)
    public MyEntity() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLastName() {
        return lastName;
    }

    public void setLastName(Integer lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "MyEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName=" + lastName +
                '}';
    }
}
