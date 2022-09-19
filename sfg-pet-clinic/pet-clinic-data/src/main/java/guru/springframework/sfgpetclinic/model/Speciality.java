package guru.springframework.sfgpetclinic.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Class Speciality Created on 19/09/2022
 *
 * @Author Iván Camilo Rincon Saavedra
 */
@Entity
@Table(name = "specialities")
public class Speciality extends BaseEntity {

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "vet_specialities", joinColumns = @JoinColumn(name = "vet_id"),
            inverseJoinColumns = @JoinColumn(name = "speciality_id"))
    private final Set<Vet> vets = new HashSet<>();


}
