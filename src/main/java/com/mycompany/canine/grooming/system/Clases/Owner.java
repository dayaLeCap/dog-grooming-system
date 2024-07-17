package com.mycompany.canine.grooming.system.Clases;

public class Owner {

    //atributes
    private int idOwner;
    private String name;
    private int cellOwner;

    //builder
    public Owner() {
    }

    public Owner(int id_Owner, String name, int cellOwner) {
        this.idOwner = id_Owner;
        this.name = name;
        this.cellOwner = cellOwner;
    }

    public int getId_Owner() {
        return idOwner;
    }

    public void setId_Owner(int Id_Owner) {
        this.idOwner = Id_Owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCellOwner() {
        return cellOwner;
    }

    public void setCellOwner(int cellOwner) {
        this.cellOwner = cellOwner;
    }

}
