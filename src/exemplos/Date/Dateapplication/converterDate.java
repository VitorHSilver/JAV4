package Date.Dateapplication;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class converterDate {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        System.out.println("R1 = " + r1);

        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        System.out.println("R2 = " + r2);

        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        System.out.println("R3 = " + r3);

        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
        System.out.println("R4 = " + r4);

        System.out.println("d04 dia =" + d04.getDayOfMonth());
        System.out.println("d04 mês =" + d04.getMonthValue());
        System.out.println("d04 ano =" + d04.getYear());

        System.out.println("d05 hora =" + d05.getHour());
        System.out.println("d05 minuto =" + d05.getMinute());

        /*
         * Calculos com data
         * 
         * Acrescentando horas, dias, Mês e ano.
         * Subtraindo horas, dias, Mês e ano.
         */

        LocalDate pastWeekLocalDate = d04.minusDays(7); // MINUS para subtrair, dias no caso foram 7;
        System.out.println("pastWeekLocalDate :" + pastWeekLocalDate); // PLUS para acrescentar, dias no caso foram 7

        LocalDate nextWeekLocalDate = d04.plusDays(7);
        System.out.println("nextWeekLocalDate :" + nextWeekLocalDate);

        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
        System.out.println("pastWeekLocalDateTime :" + pastWeekLocalDateTime);

        LocalDateTime nextWeekLocalDateTime = d05.minusDays(7);
        System.out.println("nextWeekLocalDateTime :" + nextWeekLocalDateTime);

        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        System.out.println("pastWeekInstant :" + pastWeekInstant);

        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
        System.out.println("nextWeekInstant :" + nextWeekInstant);

        /*
         * Duração
         * 
         */
        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(null), d04.atStartOfDay(null)); // Convertendo um formato sem hora, como o localdate com segundo usando at.starofday
        System.out.println("T1 dias:" + t1.toDays());

        Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
        System.out.println("T2 dias:" + t2.toDays());

        Duration t3 = Duration.between(pastWeekInstant, d06);
        System.out.println("T3 dias:" + t3.toDays());
    }
}
