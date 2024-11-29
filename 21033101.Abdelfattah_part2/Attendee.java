import java.util.List;

/**
 * This class represents an attendee of a conference.
 */
public class Attendee extends Entity implements Person, FeedbackProvider {
    private String email;
    private List<Session> schedule;

    /**
     * Constructs an Attendee with the specified ID, name, and email.
     * 
     * @param id    the ID of the attendee
     * @param name  the name of the attendee
     * @param email the email of the attendee
     */
    public Attendee(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    /**
     * Gets the email of the attendee.
     * 
     * @return the email of the attendee
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email of the attendee.
     * 
     * @param email the new email of the attendee
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets the schedule of the attendee.
     * 
     * @return the schedule of the attendee
     */
    public List<Session> getSchedule() {
        return schedule;
    }

    /**
     * Sets the schedule of the attendee.
     * 
     * @param schedule the new schedule of the attendee
     */
    public void setSchedule(List<Session> schedule) {
        this.schedule = schedule;
    }

    /**
     * Adds a session to the attendee's schedule.
     * 
     * @param session the session to be added
     */
    public void createSchedule(Session session) {
        schedule.add(session);
        System.out.println("Session added to schedule: " + session.getName());
    }

    /**
     * Provides feedback for the conference.
     * 
     * @param comments the feedback comments
     * @param rating   the feedback rating
     */
    public void provideFeedback(String comments, int rating) {
        System.out.println("Feedback provided: " + comments + " (Rating: " + rating + ")");
    }
}