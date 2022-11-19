package assignment1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Solution {

    public String getNextDate(int year, int month, int date)
    {
        String inputDate = Integer.toString(year) + "/" + Integer.toString(month) + "/" + Integer.toString(date);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

        Calendar calendar = Calendar.getInstance();
        try{
            calendar.setTime(sdf.parse(inputDate));

        }catch(ParseException e){
            e.printStackTrace();
        }

        calendar.add(Calendar.DAY_OF_MONTH, 1);

        return sdf.format(calendar.getTime());
    }

}
