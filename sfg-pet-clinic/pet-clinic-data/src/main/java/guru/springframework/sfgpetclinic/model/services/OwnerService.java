package guru.springframework.sfgpetclinic.model.services;

import guru.springframework.sfgpetclinic.model.Owner;

import java.util.Set;

/**
 * Interface OwnerService Created on 14/09/2022
 *
 * @Author Iván Camilo Rincon Saavedra
 */
public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
