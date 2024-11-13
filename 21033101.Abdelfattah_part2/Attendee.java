import java.util.ArrayList;
import java.util.List;

/**
 * The Attendee class represents an attendee of a conference with a name and
 * email.
 */
public class Attendee {
    private String name;
    private String email;
    private List<String> schedule;

    /**
     * Constructs a new Attendee with the specified name and email.
     *
     * @param name  the name of the attendee
     * @param email the email of the attendee
     * @throws IllegalArgumentException if the name or email is null or empty
     */
    public Attendee(String name, String email) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Attendee name cannot be null or empty");
        }
        if (email == null || email.isEmpty()) {
            throw new IllegalArgumentException("Attendee email cannot be null or empty");
        }
        this.name = name;
        this.email = email;
        this.schedule = new ArrayList<>();
    }

    /**
     * Returns the name of the attendee.
     *
     * @return the name of the attendee
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the email of the attendee.
     *
     * @return the email of the attendee
     */
    public String getEmail() {
        return email;
    }

    /**
     * Creates a schedule for the attendee.
     *
     * @param session the session to be added to the schedule
     */
    public void createSchedule(String session) {
        if (session == null || session.isEmpty()) {
            throw new IllegalArgumentException("Session cannot be null or empty");
        }
        schedule.add(session);
    }

    /**
     * Manages the schedule of the attendee by printing the current schedule.
     */
    public void manageSchedule() {
        System.out.println("Schedule for " + name + ":");
        for (String session : schedule) {
            System.out.println(session);
        }
    }

    /**
     * Returns a string representation of the attendee.
     *
     * @return a string representation of the attendee
     */
    @Override
    public String toString() {
        return "Attendee: " + name + " (Email: " + email + ")";
    }
}