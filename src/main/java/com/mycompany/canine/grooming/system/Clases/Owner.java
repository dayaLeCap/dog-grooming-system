package com.mycompany.canine.grooming.system.Clases;

public class Owner {

    //atributes
    private int id_duenio;
    private String nombre;
    private String cellDuenio;

    //builder
    public Owner() {
    }

    public Owner(int id_duenio, String nombre, String cellDuenio) {
        this.id_duenio = id_duenio;
        this.nombre = nombre;
        this.cellDuenio = cellDuenio;
    }

    public int getId_duenio() {
        return id_duenio;
    }

    public void setId_duenio(int id_duenio) {
        this.id_duenio = id_duenio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCellDuenio() {
        return cellDuenio;
    }

    public void setCellDuenio(String cellDuenio) {
        this.cellDuenio = cellDuenio;
    }

}
