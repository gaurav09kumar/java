public class ECC_14_AlarmClock {
   public static void main(String[] args) {
        int day_of_week = 3;
        boolean onVac = true ;
        System.out.println(ringAlarm(day_of_week, onVac));
    }

    public static String ringAlarm(int dayOfWeek, boolean onVac) {
        
    	if (dayOfWeek<0 && dayOfWeek>6 || onVac!=true||false)
        {
        	return "Invalid Inputs";
        	
        }
    else if (dayOfWeek<=5 && dayOfWeek>=1 && onVac==true)
        {
         return "10:00";
        }
        else if (dayOfWeek<5 && dayOfWeek>1 && onVac==false)
        {
        	return "07:00";
        }
        else if(dayOfWeek==0 || dayOfWeek==6 && onVac==true)
        {
        	return "OFF";
        }
        else if(dayOfWeek==0 || dayOfWeek==6 && onVac==false)
        {
        	return "10:00";
        }
    
        return "";
    }
}