import java.util.ArrayList;
import java.util.List;

/**
 * The Session class represents a session in a conference with a title, speaker,
 * time, attendees, and feedbacks.
 */
public class Session {
    private String title;
    private String speaker;
    private String time;
    private List<Attendee> attendees;
    private List<Feedback> feedbacks;

    /**
     * Constructs a new Session with the specified title, speaker, and time.
     *
     * @param title   the title of the session
     * @param speaker the speaker of the session
     * @param time    the time of the session
     */
    public Session(String title, String speaker, String time) {
        this.title = title;
        this.speaker = speaker;
        this.time = time;
        this.attendees = new ArrayList<>();
        this.feedbacks = new ArrayList<>();
    }

    /**
     * Adds an attendee to the session.
     *
     * @param attendee the attendee to be added
     */
    public void addAttendee(Attendee attendee) {
        attendees.add(attendee);
    }

    /**
     * Returns the title of the session.
     *
     * @return the title of the session
     */
    public String getTitle() {
        return title;
    }

    /**
     * Returns the speaker of the session.
     *
     * @return the speaker of the session
     */
    public String getSpeaker() {
        return speaker;
    }

    /**
     * Returns the time of the session.
     *
     * @return the time of the session
     */
    public String getTime() {
        return time;
    }

    /**
     * Returns a list of attendees in the session.
     *
     * @return a list of attendees in the session
     */
    public List<Attendee> getAttendees() {
        return attendees;
    }

    /**
     * Adds feedback to the session.
     *
     * @param feedback the feedback to be added
     */
    public void addFeedback(Feedback feedback) {
        this.feedbacks.add(feedback);
    }

    /**
     * Registers an attendee for the session.
     *
     * @param attendee the attendee to be registered
     * @throws IllegalArgumentException if the attendee is null
     */
    public void registerAttendee(Attendee attendee) {
        if (attendee == null) {
            throw new IllegalArgumentException("Attendee cannot be null");
        }
        attendees.add(attendee);
    }

    /**
     * Prints the details of the session.
     */
    public void getSessionsDetails() {
        System.out.println("Title: " + title);
        System.out.println("Speaker: " + speaker);
        System.out.println("Time: " + time);
        System.out.println("Attendees: ");
        for (Attendee attendee : attendees) {
            System.out.println(attendee.getName());
        }
    }

    /**
     * Returns a list of feedbacks for the session.
     *
     * @return a list of feedbacks for the session
     */
    public List<Feedback> getFeedback() {
        return feedbacks;
    }
}