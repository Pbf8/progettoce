// Generated with g9.

package it.unisalento.myairbnb.entities;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity
public class Seller implements Serializable {

    /** Primary key. */
    protected static final String PK = "idseller";

    /**
     * The optimistic lock. Available via standard bean get/set operations.
     */
    @Version
    @Column(name="LOCK_FLAG")
    private Integer lockFlag;

    /**
     * Access method for the lockFlag property.
     *
     * @return the current value of the lockFlag property
     */
    public Integer getLockFlag() {
        return lockFlag;
    }

    /**
     * Sets the value of the lockFlag property.
     *
     * @param aLockFlag the new value of the lockFlag property
     */
    public void setLockFlag(Integer aLockFlag) {
        lockFlag = aLockFlag;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false, precision=10)
    private int idseller;
    @Column(length=45)
    private String name;
    @Column(length=45)
    private String surname;
    @Column(length=45)
    private String email;
    @Column(nullable=false, length=45)
    private String username;
    @Column(nullable=false, length=100)
    private String pass;
    @OneToMany(mappedBy="seller")
    private Set<Apartment> apartment;
    @OneToMany(mappedBy="seller")
    private Set<Car> car;
    @OneToMany(mappedBy="seller")
    private Set<Experience> experience;

    /** Default constructor. */
    public Seller() {
        super();
    }

    /**
     * Access method for idseller.
     *
     * @return the current value of idseller
     */
    public int getIdseller() {
        return idseller;
    }

    /**
     * Setter method for idseller.
     *
     * @param aIdseller the new value for idseller
     */
    public void setIdseller(int aIdseller) {
        idseller = aIdseller;
    }

    /**
     * Access method for name.
     *
     * @return the current value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for name.
     *
     * @param aName the new value for name
     */
    public void setName(String aName) {
        name = aName;
    }

    /**
     * Access method for surname.
     *
     * @return the current value of surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Setter method for surname.
     *
     * @param aSurname the new value for surname
     */
    public void setSurname(String aSurname) {
        surname = aSurname;
    }

    /**
     * Access method for email.
     *
     * @return the current value of email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Setter method for email.
     *
     * @param aEmail the new value for email
     */
    public void setEmail(String aEmail) {
        email = aEmail;
    }

    /**
     * Access method for username.
     *
     * @return the current value of username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Setter method for username.
     *
     * @param aUsername the new value for username
     */
    public void setUsername(String aUsername) {
        username = aUsername;
    }

    /**
     * Access method for pass.
     *
     * @return the current value of pass
     */
    public String getPass() {
        return pass;
    }

    /**
     * Setter method for pass.
     *
     * @param aPass the new value for pass
     */
    public void setPass(String aPass) {
        pass = aPass;
    }

    /**
     * Access method for apartment.
     *
     * @return the current value of apartment
     */
    public Set<Apartment> getApartment() {
        return apartment;
    }

    /**
     * Setter method for apartment.
     *
     * @param aApartment the new value for apartment
     */
    public void setApartment(Set<Apartment> aApartment) {
        apartment = aApartment;
    }

    /**
     * Access method for car.
     *
     * @return the current value of car
     */
    public Set<Car> getCar() {
        return car;
    }

    /**
     * Setter method for car.
     *
     * @param aCar the new value for car
     */
    public void setCar(Set<Car> aCar) {
        car = aCar;
    }

    /**
     * Access method for experience.
     *
     * @return the current value of experience
     */
    public Set<Experience> getExperience() {
        return experience;
    }

    /**
     * Setter method for experience.
     *
     * @param aExperience the new value for experience
     */
    public void setExperience(Set<Experience> aExperience) {
        experience = aExperience;
    }

    /**
     * Compares the key for this instance with another Seller.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Seller and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Seller)) {
            return false;
        }
        Seller that = (Seller) other;
        if (this.getIdseller() != that.getIdseller()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Seller.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Seller)) return false;
        return this.equalKeys(other) && ((Seller)other).equalKeys(this);
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
        int i;
        int result = 17;
        i = getIdseller();
        result = 37*result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[Seller |");
        sb.append(" idseller=").append(getIdseller());
        sb.append("]");
        return sb.toString();
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    public Map<String, Object> getPrimaryKey() {
        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
        ret.put("idseller", Integer.valueOf(getIdseller()));
        return ret;
    }

}
