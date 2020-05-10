package Digitact.Backend.Model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "users")
public abstract class User implements IUser, Serializable {

    private static final long serialVersionUID = -2343243243242432341L;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    protected long id;

    @Column(name = "firstname")
    protected String firstName;

    @Column(name = "lastname")
    protected String lastName;

    protected User() {
    }

    public User(String firstName, String lastName) {
        //super(firstName, lastName);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /* Returns the string representation of the User.*/
    @Override
    public String toString() {
        return String.format("User[id=%d, firstname=%s, lastname=%s]",
                id,firstName,lastName );
    }
}
