package agecalculatormr;
public class AgeCalculatorMR {
    public static void main(String[] args) {
        LeapYear leapY= new LeapYear();
        TotalDayCalculator dayC=new TotalDayCalculator();
        AgeCalculator age=new AgeCalculator();
        
        dayC.bathDay=29;
        leapY.bathMonth=2;
        leapY.bathYear=1904;
        
        dayC.currentDay=27;
        leapY.currentMonth=3;
        leapY.currentYear=2022;
        
        //leapY.Display();
        
        dayC.bathMonth=leapY.bathMonth;
        dayC.bathYear=leapY.bathYear;
        dayC.currentMonth=leapY.currentMonth;
        dayC.currentYear=leapY.currentYear;
        
        
        
        
        age.bathDay=dayC.bathDay;
        age.bathMonth=dayC.bathMonth;
        age.bathYear=dayC.bathYear;
        
        age.currentDay=dayC.currentDay;
        age.currentMonth=dayC.currentMonth;
        age.currentYear=dayC.currentYear;
        
        
//        
       age.Display();
        dayC.Display();
    }
    
}
