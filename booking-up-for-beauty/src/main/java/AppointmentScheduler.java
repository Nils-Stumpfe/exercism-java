import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class AppointmentScheduler {

    private LocalDate since = LocalDate.of(2012, 9, 15);

    public LocalDateTime schedule(String appointmentDateDescription) {
        return LocalDateTime.parse(appointmentDateDescription);
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
      return appointmentDate.isBefore(LocalDateTime.now());
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        return (appointmentDate.getHour() >= 12 && appointmentDate.getHour() < 18) ? true : false;
    }

    // Formatter benutzen.
    public String getDescription(LocalDateTime appointmentDate) {
        return String.format("You have an appointment on %s, at %s.", 
                                                                DateTimeFormatter.ofPattern("EEEE, MMMM dd, Y").format(datetime),
                                                                (appointmentDate.getHour() > 12) ? appointmentDate.getHour()-12 : appointmentDate.getHour(),
                                                                (appointmentDate.getHour() > 12) ? "PM" : "AM");
    }

    public LocalDate getAnniversaryDate() {
        return LocalDate.of(LocalDate.now().getYear(), since.getMonthValue(), since.getDayOfMonth());
    }

    public static void main(String[] args) {
        LocalDateTime datetime = LocalDateTime.of(2007, 12, 3, 22, 15, 30);

        System.out.println(DateTimeFormatter.ofPattern("EEEE, MMMM dd, Y").format(datetime));

    }
}
