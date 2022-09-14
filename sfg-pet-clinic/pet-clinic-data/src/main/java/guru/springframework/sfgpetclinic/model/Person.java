package guru.springframework.sfgpetclinic.model;

/**
 * Class Person Created on 13/09/2022
 *
 * @Author Iván Camilo Rincon Saavedra
 */
public class Person extends BaseEntity {

    private String fisrtName;
    private String lastName;

    public Person() {
    }

    public Person(String fisrtName, String lastName) {
        this.fisrtName = fisrtName;
        this.lastName = lastName;
    }



    public String getFisrtName() {
        return fisrtName;
    }

    public void setFisrtName(String fisrtName) {
        this.fisrtName = fisrtName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
