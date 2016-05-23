package com.recreu.recreu.Modelos;

/**
 * Created by alamatita on 22-05-16.
 */
public class Tipo {
    private int tipoId;
    private String nombreTipo;
    private Categoria categoria;

    public Tipo(String nombre,int tipoId){
        this.tipoId=tipoId;
    }

    public int getTipoId() {
        return tipoId;
    }

    public String getNombreTipo() {
        return nombreTipo;
    }


    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

}