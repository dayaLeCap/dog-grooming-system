package com.mycompany.canine.grooming.system.Clases;

public class Owner {

    //atributes
    private int idOwner;
    private String name;
    private String cellOwner;

    //builder
    public Owner() {
    }

    public Owner(int id_Owner, String name, String cellOwner) {
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

    public String getCellOwner() {
        return cellOwner;
    }

    public void setCellOwner(String cellOwner) {
        this.cellOwner = cellOwner;
    }

}
