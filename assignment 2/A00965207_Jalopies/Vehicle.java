
/**
 * @author Hessam Ganjian
 * @author Student ID: A00965207
 * @version Assignment 2
 */
public class Vehicle
{
    private static final int CURRENT_YEAR = 2015;
	private static final int OLDEST_YEAR = 1970;
    
    private String stockCode;
    private String make;
    private String model;
    private int year;
    private double dealerCost;
    private double sellingPrice;
    private int profitMargin;

    /**
     * Default constructo for objects of class Vehicle
     */
    public Vehicle()
    {
       
    }
    
    /**
     * Overloaded constructor for objects of class Vehicle
     * @param _stockCode to initialize stockCodeument field
     * @param _make to initialize make field
     * @param _model ail to initialize model field
     * @param _year to initialize year field
     */ 
    public Vehicle(String _stockCode,
                   String _make,
                   String _model,
                   int _year) 
    {
        if (_stockCode !=null && _stockCode.trim().length() > 0){
            stockCode = _stockCode;
        }
        else{
            stockCode = "Unknown";
        }
        
        if (_make !=null && _make.trim().length() > 0){
             make = _make;
        }
        else{
            make = "Unknown";
        }
        
        if (_model !=null && _model.trim().length() > 0){
            model = _model;
        }
        else{
            model = "Unknown";
        }
        
        if( _year >= 1970 && _year <= CURRENT_YEAR){
            year = _year;
        }
        else{
            System.out.println("Year must be greater than 1970 and less than current year.");
            year = 0;
        }
   }

    /**
     * @return stockCode as a String
     */
    public String getStockCode() {
        return stockCode;
    }
    
    /**
     * @param _stockCode sets stockCode to a String
     */
    public void setStockCode(String _stockCode) {
        if (_stockCode !=null && _stockCode.trim().length() > 0){
            stockCode = _stockCode;
        }
        else{
            System.out.println("Invalid input - Stock Code cannot be NULL");
        }
    }
    
    /**
     * @return make as a String
     */
    public String getMake() {
        return make;
    }
    
    /**
     * @param _make sets make to a String
     */
    public void setMake(String _make) {
        if (_make !=null && _make.trim().length() > 0){
             make = _make;
        }
        else{
            System.out.println("Invalid input - Make cannot be NULL");
        }
    }
    
    /**
     * @return model as a String
     */
    public String getModel() {
        return model;
    }
    
    /**
     * @param _model sets model to a String
     */
    public void setModel(String _model) {
        if (_model !=null && _model.trim().length() > 0){
             model = _model;
        }
        else{
            System.out.println("Invalid input - Model cannot be NULL");
        }
    }
    
     /**
     * @return the year as an int
     */
    public int getYear() {
        return year;
    }
    
    /**
     * @param _year sets year to an int
     */
    public void setYear(int _year) {
        if( _year >= 1970 && _year <= CURRENT_YEAR){
            year = _year;
        }
        else{
            System.out.println("Year must be greater than 1970 and less than current year.");
        }
    }
    
    /**
     * @return the dealerCost as double
     */
    public double getDealerCost(){
        return dealerCost;
    }
    
    /**
     * @param _dealerCost sets dealerCost to double
     */
    public void setDealerCost(double _dealerCost){
        if( _dealerCost >=0){
            dealerCost = _dealerCost;
        }
        else{
            System.out.println("Dealer cost cannot be negative.");
        }
    }
    
    /**
     * @return the sellingPrice as double
     */
    public double getSellingPrice(){
         return sellingPrice;
    }
    
    /**
     * @param _standardSellingPrice garantees the sellingPrice is at least 25% higher than dealerCost
     */
    public void checkStandardSellingPrice(double _standardSellingPrice){
        if( _standardSellingPrice >= (dealerCost + (dealerCost/4))){
            sellingPrice = _standardSellingPrice;
        }
        else{
            System.out.println("The selling price is not at least 25% higher than dealer cost.");
            System.out.println("Dealer Cost: " + dealerCost);
            System.out.println("Selling Price: " + sellingPrice);
        }
    }
    
     /**
     * @param _sellingPrice sets sellingPrice to double
     */
    public void setSellingPrice(double _sellingPrice){
        if( _sellingPrice >=0){
            sellingPrice = _sellingPrice;
        }
        else{
            System.out.println("Selling price cannot be less than 0.");
        }
    }

    /**
     * @return the profitMargin as int
     */
    public int getProfitMargin(){
        return profitMargin;
    }
    
    /**
     * calculates the profit made on selling on a vehicle as percentage
     */
    public void calculateProfitMargin(){
        double calculateProfitMargin = ((sellingPrice - dealerCost) / sellingPrice) * 100;
        Long rounded = Math.round(calculateProfitMargin);
        profitMargin = Integer.valueOf(rounded.intValue());
    }
   
    /**
     *@return profit which calculates the profit made on selling on a vehicle
     */
    public double calculateProfit(){
        double profit;
        profit = sellingPrice - dealerCost;
        return profit;
    }
    
    /**
     * display Vehicle's full information to the console
     */
    public void printDetails(){
        System.out.println("Jalopies Are Us Vehicle Summary:");
        System.out.println("Vehicle: " + year + " " + make + " " + model);
        System.out.println("Stock Code: " + stockCode);
        System.out.println("Dealer Cost: $" + String.format( "%.2f",dealerCost));
        System.out.println("Selling Price: $" + String.format( "%.2f", sellingPrice));
        calculateProfitMargin();
        System.out.println("Profit Margin: " + profitMargin + "%");
        System.out.println("Dollar Profit: $" + String.format( "%.2f",calculateProfit()));
    }
}
