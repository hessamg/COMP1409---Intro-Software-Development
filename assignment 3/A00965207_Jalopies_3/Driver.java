/**
 * Test to check the inventory class
 * 
 * @author Hessam Ganjian
 * @author Student ID: A00965207
 * @version Assignment 3
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void test() {
		Vehicle vehicle1 = new Vehicle("1977CevCor", "Chevrolet", "Corvette", 1977);
		vehicle1.setDealerCost(8000.00);
		vehicle1.setSellingPrice(11000.00);
		vehicle1.calculateProfitMargin();
		
		Vehicle vehicle2 = new Vehicle("1970CevImp", "Chevrolet", "Impala", 1970);
		vehicle2.setDealerCost(150.00);
		vehicle2.setSellingPrice(400.00);
		vehicle2.calculateProfitMargin();
		
		Vehicle vehicle3 = new Vehicle("1980AmcJp", "American Motors", "Jeep", 1980);
		vehicle3.setDealerCost(900.00);
		vehicle3.setSellingPrice(2000.00);
		vehicle3.calculateProfitMargin();
		
		Vehicle vehicle4 = new Vehicle("1984AmcEgl", "American Motors", "Eagle", 1984);
		vehicle4.setDealerCost(1200.00);
		vehicle4.setSellingPrice(2000.00);
		vehicle4.calculateProfitMargin();
		
		Vehicle vehicle5 = new Vehicle("1977CevCor", "Chevrolet", "Corvette", 1979);
		vehicle5.setDealerCost(10000.00);
		vehicle5.setSellingPrice(15000.00);
		vehicle5.calculateProfitMargin();
		
		Vehicle vehicle6 = new Vehicle("2011CevMal", "Chevrolet", "Malibu", 2011);
		vehicle6.setDealerCost(15000.00);
		vehicle6.setSellingPrice(19000.00);
		vehicle6.calculateProfitMargin();
		
		Vehicle vehicle7 = new Vehicle("2011CevAca", "Chevrolet", "Acadia", 2011);
		vehicle7.setDealerCost(17000.00);
		vehicle7.setSellingPrice(22000.00);
		vehicle7.calculateProfitMargin();
		
		Vehicle vehicle8 = new Vehicle("1993CevBla", "Chevrolet", "Blazer", 1993);
		vehicle8.setDealerCost(3000.00);
		vehicle8.setSellingPrice(4500.00);
		vehicle8.calculateProfitMargin();
		
		Vehicle vehicle9 = new Vehicle("2005CevMal", "Chevrolet", "Malibu", 2005);
		vehicle9.setDealerCost(3750.00);
		vehicle9.setSellingPrice(6000.00);
		vehicle9.calculateProfitMargin();
		
		Customer customer = new Customer("daRby", "doG", "DL-1234567890", "K9 Woofer Road", "123-123-1234");
		PurchaseDate purchaseDate = new PurchaseDate(2014, 05, 20);
		VehiclePurchase purchase = new VehiclePurchase(customer, purchaseDate, vehicle1, true);
		Inventory inventory = new Inventory();
		inventory.addVehicle(vehicle1);
		inventory.addVehicle(vehicle2);
		inventory.addVehicle(vehicle3);
		inventory.addVehicle(vehicle4);
		inventory.addVehicle(vehicle5);
		inventory.addVehicle(vehicle6);
		inventory.addVehicle(vehicle7);
		inventory.addVehicle(vehicle8);
		inventory.addVehicle(vehicle9);
		
		inventory.displayInventory();
		
		inventory.searchByModel("Corvette");
		inventory.searchByYear(2011);
		inventory.searchByPrice(2000.00,6000.00);
		
	}

}
