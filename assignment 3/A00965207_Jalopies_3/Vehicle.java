/**
 * 
 * @author Bullwinkle Moose 
 * @version 1.0 
 */
import java.text.DecimalFormat;

public class Vehicle {

	private String stockCode;
	private String make;
	private String model;
	private int year;
	private double dealerCost;
	private double sellingPrice;
	private double profitMargin;
	
	private static final int CURRENT_YEAR = 2015;
	private static final int OLDEST_YEAR = 1970;


	/**
	 * Default Constructor for Objects of class Vehicle.
	 */
	public Vehicle() {

	}

	/**
	 * Constructor for Objects of class Vehicle.
	 * 
	 * @param vehicle stockCode to initialize stockCode field
	 * @param make to initialize make field
	 * @param model to initialize model field
	 * @param year to initialize year field
	 */
	public Vehicle(String stockCode, String make, String model, int year) {

		if (stockCode != null && stockCode.trim().length() > 0) {
			if (make != null && make.trim().length() > 0) {
				if (model != null && model.trim().length() > 0) {
					if (year >= OLDEST_YEAR && year <= CURRENT_YEAR) {

						this.stockCode = stockCode;
						this.make = make;
						this.model = model;
						this.year = year;
					}

				}
			}
		} else {
			new Vehicle();
		}
	}

	/**
	 * @return the vehicle stockCode as String
	 */
	public String getStockCode() {
		return stockCode;
	}

	/**
	 * @return the make as String
	 */
	public String getMake() {
		return make;
	}

	/**
	 * @return the model as String
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @return the year as int
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @return the dealerCost as double
	 */
	public double getdealerCost() {
		return dealerCost;
	}

	/**
	 * @return the sellingPrice as double
	 */
	public double getSellingPrice() {
		return sellingPrice;
	}

	/**
	 * @return the profit margin on the vehicle if sold, as double
	 */
	public double getProfitMargin() {
		return profitMargin;
	}

	/**
	 * @param vehicle stockCode sets the value for the stockCode field.
	 */
	public void setStockCode(String stockCode) {
		if (stockCode != null && stockCode.trim().length() > 0) {
			this.stockCode = stockCode;
		}else{
			
			System.out.println("invalid input");
		}
	}

	/**
	 * @param make sets the value for the make field.
	 */
	public void setMake(String make) {
		if (make != null && make.trim().length() > 0) {
			this.make = make;
		}else{
			
			System.out.println("invalid input");
		}
	}

	/**
	 * @param model sets the value for the model field.
	 */
	public void setModel(String model) {
		if (model != null && model.trim().length() > 0) {
			this.model = model;
		}else{
			
			System.out.println("invalid input");
		}
	}

	/**
	 * @param year sets the value for the year field
	 */
	public void setYear(int year) {
		if (year >= OLDEST_YEAR && year <= CURRENT_YEAR) {
			this.year = year;
		}else{
			
			System.out.println("invalid input");
		}
	}

	/**
	 * @param dealerCost sets the value for the dealerCost field
	 */
	public void setDealerCost(double dealerCost) {
		if (dealerCost >= 0) {
			this.dealerCost = dealerCost;
			
		} else {
			System.out.println("invalid input");
		}
	}

	/**
	 * @param sellingPrice sets the sellingPrice only if it is at least 25% than dealerCost
	 */
	public void checkStandardSellingPrice(double sellingPrice) {
		if (sellingPrice >= (dealerCost  * 1.25)) {
			this.sellingPrice = sellingPrice;
			
		} else {
			System.out.println("The dealer cost is: $" + dealerCost + ". Sale price $" + sellingPrice
					+ " is not high enough");
			
		}
	}

	/**
	 * @param sellingPrice sets the value for the sellingPrice field
	 */
	public void setSellingPrice(double sellingPrice) {
		if (sellingPrice >= 0) {
			this.sellingPrice = sellingPrice;
			
		} else {
			System.out.println("invalid input");
		}
	}

	/**
	 * calculates the profit margin for selling a vehicle
	 */
	public void calculateProfitMargin() {
		profitMargin = (sellingPrice - dealerCost) / sellingPrice;
	}
	
	/**
	 * @return the profit on selling a vehicle as a dollar value.
	 */
	public double calculateProfit() {
		return sellingPrice - dealerCost;
	}

	/**
	 * formats and displays all vehicle information.
	 */
	public void printDetails() {
		DecimalFormat formatter = new DecimalFormat("$0.00");
		DecimalFormat percentFormatter  = new DecimalFormat("0%");
		
		System.out.println("Vehicle: " + year + " " + make + " " + model);
		System.out.println("Stock Code:" + stockCode);
		System.out.println("Dealer Cost: " + formatter.format(dealerCost));
		System.out.println("Selling Price: " + formatter.format(sellingPrice));
		System.out.println("Profit Margin: " + percentFormatter.format(profitMargin));
		System.out.println("Dollar Profit: " + formatter.format(calculateProfit()));
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Vehicle [stockCode=" + stockCode + ", make=" + make
				+ ", model=" + model + ", year=" + year + ", dealerCost="
				+ dealerCost + ", sellingPrice=" + sellingPrice
				+ ", profitMargin=" + profitMargin + "]";
	}
	
	
}