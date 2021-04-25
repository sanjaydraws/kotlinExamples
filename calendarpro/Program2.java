import java.util.Calendar;

class Program2{
    public static void main(String[] args) {
        
        System.out.println("check timestanmp  " + new Program2().checkTimeStamp() );

    }
    public boolean checkTimeStamp(){
        // past 
        Calendar pastCalendar = Calendar.getInstance();
        pastCalendar.add(Calendar.YEAR, -1);
        System.out.println("past calendar time : " + pastCalendar.getTime()); //past calendar time : Sat Apr 25 18:35:10 IST 2020
        System.out.println("past calendar timestamp : " + pastCalendar.getTimeInMillis()); //past calendar timestamp : 1587819910202


        // current
        Calendar currentCalendar = Calendar.getInstance();
        System.out.println("current time : " + currentCalendar.getTime()); //current time : Sun Apr 25 18:35:49 IST 2021
        System.out.println("current calendar: " + currentCalendar.getTimeInMillis()); //1619355949194
        return  pastCalendar.getTimeInMillis() < currentCalendar.getTimeInMillis();
    }
}