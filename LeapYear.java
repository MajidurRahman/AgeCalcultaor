package agecalculatormr;
class LeapYear {
    int bathMonth,bathYear,currentMonth,currentYear;
    int leapYearCount=0;
   
    LeapYear(){
        this.bathMonth=-1;
        this.bathYear=-1;
        this.currentMonth=-1;
        this.currentYear=-1;
    }
    LeapYear(int bathMonth,int bathYear,int currentMonth,int currentYear){
        this.bathMonth=bathMonth;
        this.bathYear=bathYear;
        this.currentMonth=currentMonth;
        this.currentYear=currentYear;
        
    }
    
    int LeapYear(){
        int bathMonthLess=bathMonth;
        int currentMonthLess=currentMonth;
        for (int i = bathYear; i <= currentYear; i++) {
            if((i%4==0 && i%100!=0 || i%400==0) && bathMonthLess<=2){
            leapYearCount++;
               //System.out.println("Lear Year: "+i);
            }bathMonthLess=0;
        }
        if((currentYear%4==0 && currentYear%100!=0 || currentYear%400==0) && currentMonthLess<=2){
            leapYearCount--;
        }
       //System.out.println("Total Leap Year: "+leapYearCount);
       return leapYearCount;
    }
    
    void Display(){
        System.out.println(LeapYear());
       
    }
}
