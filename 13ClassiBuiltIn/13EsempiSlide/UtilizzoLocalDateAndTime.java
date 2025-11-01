import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class UtilizzoLocalDateAndTime {
    public static void main(String[] args) {
        LocalDate dataAdesso = LocalDate.now();


        LocalDate data0 = LocalDate.of(-100, 1, 1);
        System.out.println("Data 0: " + data0);//Data 0: -0100-01-01
        System.out.println(data0.getEra());//BCE

        // L'86esimo giorno del 2017 (27-Mar-2017)
        LocalDate data1 = LocalDate.ofYearDay(2017, 86);
        // 10 agosto 2013
        LocalDate data2 = LocalDate.of(2013, Month.AUGUST, 10);

        System.out.println("Data adesso: " + dataAdesso);
        System.out.println(data2.getEra());//CE
        System.out.println(data1 + " viene prima del " + data2 + "? " + data1.isBefore(data2));// false
        
        /*
        Data 0: -0100-01-01
        BCE
        Data adesso: 2025-01-07
        CE
        2017-03-27 viene prima del 2013-08-10? false
        */


        //---
        System.out.println("\n");
        
        LocalTime oraAdesso = LocalTime.now();
        // 22:33:44
        LocalTime ora1 = LocalTime.of(22, 33, 44);
        // 4503esimo secondo del giorno (1:15:03)
        LocalTime ora2 = LocalTime.ofSecondOfDay(4503);

        System.out.println("Ora adesso: " + oraAdesso);
        System.out.println(ora1 + " viene dopo delle " + ora2 + "? " + ora1.isAfter(ora2));

        /*
        Ora adesso: 18:50:40.037866800
        22:33:44 viene dopo delle 01:15:03? true
        */
    }
}
