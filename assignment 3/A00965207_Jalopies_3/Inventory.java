import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

/**
 * @author Hessam Ganjian
 * @author Student ID: A00965207
 * @version Assignment 3
 */
public class Inventory
{
    // instance variables 
    private static ArrayList<Vehicle> vehicles;
    
    /**
     * Constructor for objects of class Inventory
     */
    public Inventory()
    {
        vehicles = new ArrayList<Vehicle>();
    }

    /**
     * @return Gets the Array of Vehicles
     */
    public static ArrayList<Vehicle> getVehicles()
    {
        return vehicles;
    }

    /**
     * @param _vehicles used to set the value of the vehicles array
     */
    public static void setVehicles(ArrayList<Vehicle> _vehicles)
    {
        vehicles = _vehicles;
    }
    
     /**
     * @param vehicles used to add a vehile to the inventory
     */
    public void addVehicle(Vehicle vehicle){
        if(vehicle != null) {
            vehicles.add(vehicle);
        } else {
            System.out.println("Vehicle cannot be null.");
        }
    }
    
    /**
     * @param model used to display all vehicles with given model
     */
    public void searchByModel(String model)
    {
        int check = 0;
        System.out.println("Listing the results for searching by Vehicle model:\n\nSearching for: "+ model);
        ArrayList<Vehicle> results = new ArrayList<Vehicle>();
        for(Vehicle vehicle : vehicles) {
            if(vehicle.getModel().equals(model)) {
                results.add(vehicle);
                check++;
            }
        }
        if(check == 0){
                System.out.println("No match found\n");
            }
        displaySearchResults(results);
    }
    
    /**
     * @param year used to display all vehicles of given year
     */
    public void searchByYear(int year)
    {
        System.out.println("Listing the results for searching by Vehicle year:\n\nSearching for: "+ year);
        int check = 0;
        ArrayList<Vehicle> results = new ArrayList<Vehicle>();
        for(Vehicle vehicle : vehicles) {
            if(vehicle.getYear() == year) {
                results.add(vehicle);
                check++;
            }
           
        }
        if(check == 0){
                System.out.println("No match found\n");
            }
        displaySearchResults(results);
    }
    
    /**
     * Displays all vehicles in a given price range
     * @param minPrice used to set the starting price to search by
     * @param maxPrice used to set the max price to search by
     */
    public void searchByPrice(double minPrice, double maxPrice)
    {
        int check = 0;
        System.out.println("Listing the results for searching by Vehicle price range:\n\nSearching for vehicles from  $"+ minPrice +" to $" + maxPrice);
        ArrayList<Vehicle> results = new ArrayList<Vehicle>();
        for(Vehicle vehicle : vehicles) {
            if(minPrice <= vehicle.getSellingPrice() && maxPrice >= vehicle.getSellingPrice()) {
                results.add(vehicle);
                check++;
            }
        }
        if(check == 0){
                System.out.println("No match found\n");
            }
        displaySearchResults(results);
    }
    
    /**
     * @param results Prints the contents of results array to screen
     */
    public void displaySearchResults(ArrayList<Vehicle> results)
    {
        for(Vehicle vehicle : results) {
            vehicle.printDetails();
            System.out.println();
        }
    }
    
    /**
     * @param stockCode used to remove a vehicle by stock code
     */
    public static void removeVehicle(String stockCode)
    {
        Iterator<Vehicle> it = vehicles.iterator();
        while(it.hasNext()) {
            if(it.next().getStockCode().equals(stockCode)) {
                it.remove();
            }
        }
    }
    
    /**
     * @return gets the total number of vehicles in inventory
     */
    public String inventoryCount()
    {
        return "There are currently " + vehicles.size() + " vehicles on the lot.";
    }
    
    /**
     * @return gets the total dollar amount of inventory
     */
    public String inventoryValue()
    {
        double inventoryValue = 0;
        for(Vehicle vehicle : vehicles) {
            inventoryValue += vehicle.getdealerCost();
        }
        return "You have $" + inventoryValue + " in stock.";
    }

    /**
     * Displays all inventory to screen
     */
    public void displayInventory()
    {
        System.out.println(inventoryCount());
        System.out.println("\nJalopies Are Us Vehicle Summary:\n");
        for(Vehicle vehicle : vehicles) {
            vehicle.printDetails();
            System.out.println();
        }
    }
}
