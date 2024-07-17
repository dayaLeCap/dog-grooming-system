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

}
