package guru.springframework.sfgpetclinic.model;

import java.time.LocalDate;

/**
 * Class Pet Created on 13/09/2022
 *
 * @Author Iván Camilo Rincon Saavedra
 */
public class Pet extends BaseEntity {

    private PetType petType;
    private Owner owner;
    private LocalDate birthDay;

    public Pet() {
    }

    public Pet(PetType petType, Owner owner, LocalDate birthDay) {
        this.petType = petType;
        this.owner = owner;
        this.birthDay = birthDay;
    }

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }
}
