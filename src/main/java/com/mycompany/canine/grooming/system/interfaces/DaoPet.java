package com.mycompany.canine.grooming.system.interfaces;

import com.mycompany.canine.grooming.system.Clases.Owner;
import com.mycompany.canine.grooming.system.Clases.Pet;

public interface DaoPet {

    public void registrarMascota(Pet pet, Owner owner);
}
