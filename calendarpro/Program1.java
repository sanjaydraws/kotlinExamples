

import java.util.Calendar;

/**
 * CalendarOne
 */
 class Program1 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("time"+  calendar.getTime()); //Sun Apr 25 00:00:20 IST 2021
        

        // get method of calendar class 
        System.out.println("current clandar year"+ calendar.get(Calendar.YEAR)); // current clandar year2021
        System.out.println("current calendar day"+  calendar.get(Calendar.DATE));//current calendar day25
        System.out.println("current clendar minute"+  calendar.get(Calendar.MINUTE));//current clendar minute11
        System.out.println("current calendar second"+ calendar.get(Calendar.SECOND) );//current calendar second11


        //demonstrate getMaximum() method.

        int max= calendar.getMaximum(Calendar.DAY_OF_WEEK);
        System.out.println("Maximum number of days in a week: " + max); //7

         max = calendar.getMaximum(Calendar.WEEK_OF_YEAR);
        System.out.println("Maximum number of weeks in a year: " + max); //53

        //demonstrate getMinimum() method.

        int min = calendar.getMinimum(Calendar.DAY_OF_WEEK);
        System.out.println("Minimum number of days in week: " + min); // 1
          
        min = calendar.getMinimum(Calendar.WEEK_OF_YEAR);
        System.out.println("Minimum number of weeks in year: " + min); //1

        // =======================================
        
        calendar.add(Calendar.DATE, -15);
        System.out.println("15 days ago: " + calendar.getTime());//15 days ago: Sat Apr 10 17:35:47 IST 2021
        
        calendar.add(Calendar.MONTH, 4);
        System.out.println("4 Months later"+ calendar.getTime()); //4 Months laterTue Aug 10 17:35:47 IST 2021
        
        // calendar.add(Calendar.YEAR, 2);
        // System.out.println("2 years later: " + calendar.getTime());
        calendar.add(Calendar.YEAR, -2);
        System.out.println("2 years ago: " + calendar.getTime());//2 years ago: Sat Aug 10 17:35:47 IST 2019

        

        // calendar.clear();
  
        // // Displaying the final result
        // System.out.println("After clear method: "
        //                    + calendar.getTime());//After clear method: Thu Jan 01 00:00:00 IST 1970
    }
    
}