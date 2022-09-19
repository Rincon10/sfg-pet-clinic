package guru.springframework.sfgpetclinic.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.Set;

/**
 * Class Vet Created on 13/09/2022
 *
 * @Author Iván Camilo Rincon Saavedra
 */
@Entity
@Table(name = "vets")
public class Vet extends Person {

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "vets")
    private Set<Speciality> specialities;
}
