package com.mycompany.canine.grooming.system.Clases;

public class Pet {

    //atributes
    private int customer_number;
    private String name;
    private String race;
    private String color;
    private String allergic;
    private String special_attention;
    private String observations;

    private Owner owner;

    public Pet() {
    }

    public Pet(int customer_number, String name, String race, String color, String allergic, String special_attention, String observations, Owner owner) {
        this.customer_number = customer_number;
        this.name = name;
        this.race = race;
        this.color = color;
        this.allergic = allergic;
        this.special_attention = special_attention;
        this.observations = observations;
        this.owner = owner;
    }

    public int getCustomer_number() {
        return customer_number;
    }

    public void setCustomer_number(int customer_number) {
        this.customer_number = customer_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAllergic() {
        return allergic;
    }

    public void setAllergic(String allergic) {
        this.allergic = allergic;
    }

    public String getSpecial_attention() {
        return special_attention;
    }

    public void setSpecial_attention(String special_attention) {
        this.special_attention = special_attention;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

}
