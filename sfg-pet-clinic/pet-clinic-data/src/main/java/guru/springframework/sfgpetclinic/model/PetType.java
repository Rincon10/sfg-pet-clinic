package guru.springframework.sfgpetclinic.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Class PetType Created on 13/09/2022
 *
 * @Author Iván Camilo Rincon Saavedra
 */
@Entity
@Table(name = "types")
public class PetType extends BaseEntity {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
