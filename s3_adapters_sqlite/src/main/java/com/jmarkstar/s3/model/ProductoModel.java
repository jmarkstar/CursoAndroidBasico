package com.jmarkstar.s3.model;

/**
 * Created by jmarkstar on 9/21/17.
 */

public class ProductoModel {
    public static final String TABLE_NAME = "producto";
    public static final String ID_FIELD = "_id";
    public static final String NOMBRE_FIELD = "nombre";
    public static final String CATEGORIA_FIELD = "categoria";
    public static final String STOCK_FIELD = "stock";

    private int id;
    private String nombre;
    private String categoria;
    private int stock;

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "ProductoModel{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", categoria='" + categoria + '\'' +
                ", stock=" + stock +
                '}';
    }
}
