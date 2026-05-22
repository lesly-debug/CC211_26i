import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;
public class cambios{
    public static void main(String[] args){
    GregorianCalendar fecha = new GregorianCalendar(2026,4,15);
    System.out.println(fecha.getTime());
    Date d = fecha.getTime();
    fecha.set(Calendar.MONTH,Calendar.JANUARY);
    fecha.set(Calendar.MONTH,5);
    System.out.println(fecha.getTime());
    }
}