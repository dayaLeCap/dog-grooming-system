package com.mycompany.canine.grooming.system.Clases;

public class Owner {

    //atributes
    private int id_Owner;
    private String name;
    private String cellOwner;

    //builder
    public Owner() {
    }

    public Owner(int id_Owner, String name, String cellOwner) {
        this.id_Owner = id_Owner;
        this.name = name;
        this.cellOwner = cellOwner;
    }

    public int getId_Owner() {
        return id_Owner;
    }

    public void setId_Owner(int Id_Owner) {
        this.id_Owner = Id_Owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCellOwner() {
        return cellOwner;
    }

    public void setCellOwner(String cellOwner) {
        this.cellOwner = cellOwner;
    }

}
