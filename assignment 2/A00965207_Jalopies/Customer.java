/**
 * @author Hessam Ganjian
 * @author Student ID: A00965207
 * @version Assignment 2
 */
public class Customer
{
    private String firstName;
    private String lastName;
    private String driversLicense;
    private String address;
    private String phoneNumber;
    /**
     * Default constructor for objects of class Customer
     */
    public Customer()
    {
        
    }
    
     /**
     * Overloaded constructor for objects of class Customer
     * @param _firstName to initialize firstName field
     * @param _lastName to initialize lastName field
     * @param _driversLicense ail to initialize driversLicense field
     * @param _address to initialize address field
     * @param _phoneNumber to initialize phoneNumber field
     */
     public Customer(String _firstName,
                     String _lastName,
                     String _driversLicense,
                     String _address,
                     String _phoneNumber)
    {
        setFirstName(_firstName);
        setLastName(_lastName); 
        setDriversLicense(_driversLicense);    
        setAddress(_address);
        setPhoneNumber(_phoneNumber);    
    }
    
    /**
     * @return the firstName as String
     */
    public String getFirstName() {
        return firstName;
    }
    
    /**
     *@param _firstName sets the firstName as String
     */
    public void setFirstName(String _firstName) {
        if(_firstName != null)
        {
            firstName = _firstName;
        }
    }

    /**
     * @return the lastName as String
     */
    public String getLastName() {
        return lastName;
    }

    /**
     *@param _lastName sets the lastName as String
     */
    public void setLastName(String _lastName) {
        if(_lastName != null)
        {
            lastName = _lastName;
        }
    }
    
    /**
     * @return the driversLicense as String
     */
    public String getDriverLicense() {
        return driversLicense;
    }
    
    /**
     *@param _driversLicense sets the driversLicense as String
     */
    public void setDriversLicense(String _driversLicense) {
        if(_driversLicense != null)
        {
            driversLicense = _driversLicense;
        }
    }

    /**
     * @return the address as String
     */
    public String getAddress() {
        return address;
    }

    /**
     *@param _address sets the address as String
     */
    public void setAddress(String _address) {
        if(_address != null)
        {
            address = _address;
        }
    }
    
    /**
     * @return the phoneNumber as String
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    /**
     *@param _phoneNumber sets the phoneNumber as String
     */
    public void setPhoneNumber(String _phoneNumber) {
        phoneNumber = _phoneNumber;
    }
    
    /**
    * @return the FullName as String
    */
    public String getFullName(){
        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
        lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();
        return firstName + " " + lastName;
    }
    
}
