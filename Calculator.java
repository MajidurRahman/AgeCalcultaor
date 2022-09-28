package agecalculatormr;
class TotalDayCalculator extends LeapYear {
    int [] months={31,28,31,30,31,30,31,31,30,31,30,31};
    int bathDay;
    int currentDay;
    
    TotalDayCalculator(){
        super();
        this.bathDay=-1;
        this.currentDay=-1;
        //System.out.println("Fack");
    }
    
    TotalDayCalculator(int bathMonth,int bathYear,int currentMonth,int currentYear,int bathDay,int currentDay){
        super(bathMonth,bathYear,currentMonth,currentYear);
        this.bathDay=bathDay;
        this.bathDay=currentDay;
        //System.out.println("Hellow");
    }
    
    int dayCount(){
        int bathM=this.bathMonth,sum=0,currentM=months.length;
        int bathMonthTotalDay,currentMonthTotalDay,totalDay;
        
        for (int i = this.bathYear; i <= this.currentYear; i++) {
            if(i==this.currentYear){
                currentM=this.currentMonth;
            }
            for (int j = bathM; j < currentM; j++) {
                sum+=months[j];
            }bathM=0;
        }
        //System.out.println(sum);
        bathMonthTotalDay=months[this.bathMonth-1]-bathDay;
        currentMonthTotalDay=months[this.currentMonth-1]-currentDay;
        
        totalDay=(sum+bathMonthTotalDay+this.LeapYear())-currentMonthTotalDay;
        return totalDay;
    }
    
   void Display(){
       System.out.println("Total Day: "+dayCount());
   }
}
    
    

