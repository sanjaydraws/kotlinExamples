import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Program1 {
    public static void main(String[] args) {
        // Date utilDate = new Date();
        // System.out.println("java.util.Date is : " + utilDate); // current date Fri May 14 23:39:19 IST 2021

        // java.sql.Date sqlDate = convert(utilDate);
        // System.out.println("java.sql.Date is : " + sqlDate); // 2021-05-14

        // DateFormat df = new SimpleDateFormat("dd/MM/YYYY - hh:mm:ss");
        // System.out.println("dateFormated date is : " + df.format(utilDate)); //14/05/2021 - 11:52:35

            // ================================================
        // the format string yyyy/MM/dd hh:mm.ss,receive output  2016/04/19 11:45.36
        
        // define the format to use
        String formatString = "yyyy/MM/dd hh:mm.ss";
        // get a current date object
        Date date = Calendar.getInstance().getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(formatString);
        String formatted = simpleDateFormat.format(date) ;
        System.out.println(formatted); ///2021/05/15 04:19.13

        // in single line 
        System.out.println(new SimpleDateFormat("yyyy/MM/dd hh:mm.ss").format(Calendar.getInstance().getTime())); //2021/05/15 04:22.22


        for(Datasnapshot post : datasnapshot.getChildren()){
            
        }
         
    }
   
    private static java.sql.Date convert(java.util.Date uDate) {
        java.sql.Date sDate = new java.sql.Date(uDate.getTime());
        return sDate;
    }
}
