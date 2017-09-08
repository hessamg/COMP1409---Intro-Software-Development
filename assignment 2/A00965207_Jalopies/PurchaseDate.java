
/**
 * @author Hessam Ganjian
 * @author Student ID: A00965207
 * @version Assignment 2
 */
public class PurchaseDate
{
    private static final int CURRENT_YEAR = 2016;
    private static final int FIRST_DAY = 1;
    private static final int LAST_DAY = 31;
    private static final int JANUARY = 1;
    private static final int DECEMBER = 12;    
    
    private int year;
    private int month;
    private int day;
    /**
     * Default constructor for objects of class PurchaseDate
     */
    public PurchaseDate()
    {
        
    }
    
    /**
     * Overloaded constructor for objects of class PurchaseDate
     * @param theYear to initialize year field
     * @param theMonth to initialize month field
     * @param theDay to initialize day field
     */
    public PurchaseDate(int theYear, int theMonth, int theDay){
        if( theYear <= CURRENT_YEAR){
            if( theMonth >= JANUARY && theMonth <= DECEMBER){
                 if( theDay >= FIRST_DAY && theDay <= LAST_DAY){
                    year = theYear;
                    month = theMonth;
                    day = theDay;
                }
            }
        }else
        {
            month = JANUARY;
            year = CURRENT_YEAR;
            day = FIRST_DAY;
        }
    }
    
    /**
     * @return the year as an int
     */
    public int getYear() {
        return year;
    }
    
    /**
     * @param theYear sets year to an int
     */
    public void setYear(int theYear) {
        if( theYear <= CURRENT_YEAR){
            year = theYear;
        }
    }
    
    /**
     * @return the month as an int
     */
    public int getMonth() {
        return month;
    }
    
    /**
     * @param theMonth sets month to an int
     */
    public void setMonth(int theMonth) {
         if( theMonth >= JANUARY && theMonth <= DECEMBER){
            month = theMonth;
        }
    }
    
    /**
     * @return the day as an int
     */
    public int getDay() {
        return day;
    }
    
    /**
     * @param theDay sets day to an int
     */
    public void setDay(int theDay) {
        if( theDay >= FIRST_DAY && theDay <= LAST_DAY){
            day = theDay;
        }
    }
    
    /**
    * @return the getFullDate as String
    */
     public String getFullDate(){
        String fullDate;
        if(month < 10) {
            fullDate = year + "-0" + month;
        }
        else {
            fullDate = year + "-" + month;
        }
        
        if(day < 10) {
            fullDate = fullDate + "-0" + day;
        }
        else {
            fullDate = fullDate + "-" + day;
        }
        
        return fullDate;
    }
}
