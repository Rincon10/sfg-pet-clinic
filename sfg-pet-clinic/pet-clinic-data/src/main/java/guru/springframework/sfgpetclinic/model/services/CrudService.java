package guru.springframework.sfgpetclinic.model.services;

import java.util.Set;

/**
 * Class CrudService Created on 14/09/2022
 *
 * @Author Iván Camilo Rincon Saavedra
 */
public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById( ID id);

    T save(T object);

    void delete( T object );

    void deleteById( ID id);
}
