package com.mycompany.canine.grooming.system.interfaces;

import com.mycompany.canine.grooming.system.Clases.Owner;
import com.mycompany.canine.grooming.system.Clases.Pet;

public interface DaoPet {

    public void registerPet(Owner owner, Pet pet);

    public void deletePet(Pet pet, Owner owner);

    public void modifyPetAndOwner(Owner owner, Pet pet);

    public Pet getPetInformation(int idPet);

    public Owner getOwnerInformation(int idOwner);
}
