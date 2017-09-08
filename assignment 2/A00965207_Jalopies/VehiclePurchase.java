
/**
 * @author Hessam Ganjian
 * @author Student ID: A00965207
 * @version Assignment 2
 */
public class VehiclePurchase
{
    private Customer customer;
    private PurchaseDate purchaseDate;
    private Vehicle vehiclePurchased;
    private boolean servicePackage;
    public static final double SERVICE_FEE = 500.00;
    
    /**
     * Default constructo for objects of class VehiclePurchase
     */
    public VehiclePurchase(Customer customer,
                           PurchaseDate purchaseDate,
                           Vehicle vehiclePurchased,
                           boolean servicePackage)
    {
        this.customer = customer;
        this.purchaseDate = purchaseDate;
        this.vehiclePurchased = vehiclePurchased;
        this.servicePackage = servicePackage;
    }
    
    /**
     * @return the customer as a Customer
     */
    public Customer getCustomer() {
        return customer;
    }
    
    /**
     * @return the purchaseDate as a PurchaseDate
     */
    public PurchaseDate getPurchaseDate() {
        return purchaseDate;
    }
    
    /**
     * @return the vehiclePurchased as a Vehicle
     */
    public Vehicle getVehiclePurchased() {
        return vehiclePurchased;
    }
    
    /**
     * @return the servicePackage as a boolean
     */
    public boolean isServicePackage() {
        return servicePackage;
    }
    
    /**
     * @param _servicePackage sets servicePackage to a boolean
     */
    public void setServicePackage(boolean _servicePackage) {
         servicePackage = _servicePackage;
    }
    
    public void calculatePurchasePrice(double purchasePrice){
       if(servicePackage) {
            purchasePrice += SERVICE_FEE; 
        } 
        vehiclePurchased.setSellingPrice(purchasePrice);
    }
    
    /**
     * display VehiclePurchase's full information to the console
     */
    public void displayDetails(){
        System.out.println("Customer: " + customer.getFullName() );
        System.out.println("Purchase Date: " + purchaseDate.getFullDate());
        System.out.print("Vehicle Description: ");
        vehiclePurchased.printDetails();
        if(servicePackage){
            System.out.println("SERVICE PACKAGE INCLUDED\n");
        }else
        {
            System.out.println("SERVICE PACKAGE NOT INCLUDED\n");
        }
    }
}
