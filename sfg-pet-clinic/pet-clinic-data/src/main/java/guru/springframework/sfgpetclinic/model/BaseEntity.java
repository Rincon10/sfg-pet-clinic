package guru.springframework.sfgpetclinic.model;

import java.io.Serializable;

/**
 * Class BaseEntity Created on 14/09/2022
 *
 * @Author Iván Camilo Rincon Saavedra
 */
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
