package agecalculatormr;
class AgeCalculator extends TotalDayCalculator {
    
    AgeCalculator(){
        super();
    }
    AgeCalculator(int bathMonth,int bathYear,int currentMonth,int currentYear,int bathDay,int currentDay){
        super(bathMonth,bathYear,currentMonth,currentYear,bathDay,currentDay);
    }
    
    
    void AgeCalculator(){
        int day,month,year;
        int dayCounter=0,monthCounter=0,yearCounter=0;
        if(this.currentDay<=this.bathDay){
            if(this.currentDay==this.bathDay){
               
            }
            else{
                this.currentDay+=this.months[this.currentMonth-1];
                System.out.println(this.months[this.currentMonth-2]);
                System.out.println("currentDay: "+this.currentDay);
            dayCounter++;
            }
        }
        if(this.currentMonth<=this.bathMonth){
            if(this.currentMonth==this.bathMonth){
                
            }
            else{
                this.currentMonth+=12;
                monthCounter++;
            }
        }
        day=this.currentDay-this.bathDay;
        month=(this.currentMonth-this.bathMonth)-dayCounter;
        year=(this.currentYear-this.bathYear)-monthCounter;
        System.out.println(day+" dd "+month+" mm "+year+" yy");
        
    }
    
    void Display(){
        AgeCalculator();
    }
}
