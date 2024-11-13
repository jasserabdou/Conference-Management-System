import java.util.ArrayList;
import java.util.List;

/**
 * The Conference class represents a conference event with a name, date,
 * sessions, and attendees.
 */
public class Conference {
    private String name;
    private String date;
    private List<Session> sessions;
    private List<Attendee> attendees;

    /**
     * Constructs a new Conference with the specified name and date.
     *
     * @param name the name of the conference
     * @param date the date of the conference
     * @throws IllegalArgumentException if the name or date is null or empty
     */
    public Conference(String name, String date) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Conference name cannot be null or empty");
        }
        if (date == null || date.isEmpty()) {
            throw new IllegalArgumentException("Conference date cannot be null or empty");
        }
        this.name = name;
        this.date = date;
        this.sessions = new ArrayList<>();
        this.attendees = new ArrayList<>();
    }

    /**
     * Returns the name of the conference.
     *
     * @return the name of the conference
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the date of the conference.
     *
     * @return the date of the conference
     */
    public String getDate() {
        return date;
    }

    /**
     * Returns a list of sessions in the conference.
     *
     * @return a list of sessions in the conference
     */
    public List<Session> getSessions() {
        return new ArrayList<>(sessions);
    }

    /**
     * Returns a list of attendees registered for the conference.
     *
     * @return a list of attendees registered for the conference
     */
    public List<Attendee> getAttendees() {
        return new ArrayList<>(attendees);
    }

    /**
     * Adds a session to the conference.
     *
     * @param session the session to be added
     * @throws IllegalArgumentException if the session is null
     */
    public void openSession(Session session) {
        if (session == null) {
            throw new IllegalArgumentException("Session cannot be null");
        }
        sessions.add(session);
    }

    /**
     * Registers an attendee for the conference.
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
     * Returns a string representation of the conference.
     *
     * @return a string representation of the conference
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Conference{name='").append(name).append("', date='").append(date).append("'");

        if (!sessions.isEmpty()) {
            sb.append(", sessions=").append(sessions);
        }

        if (!attendees.isEmpty()) {
            sb.append(", attendees=").append(attendees);
        }

        sb.append("}");
        return sb.toString();
    }
}