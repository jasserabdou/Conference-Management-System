import java.util.List;

/**
 * This class represents a conference with a name, start date, end date,
 * sessions, and attendees.
 */
public class Conference {
    private String name;
    private String startDate;
    private String endDate;
    private List<Session> sessions;
    private List<Attendee> attendees;

    /**
     * Opens a new session and adds it to the list of sessions.
     * 
     * @param session the session to be opened
     */
    public void openSession(Session session) {
        sessions.add(session);
        System.out.println("Session opened: " + session.getName());
    }

    /**
     * Registers a new attendee and adds them to the list of attendees.
     * 
     * @param attendee the attendee to be registered
     */
    public void registerAttendee(Attendee attendee) {
        attendees.add(attendee);
        System.out.println("Attendee registered: " + attendee.getName());
    }

    /**
     * Gets the name of the conference.
     * 
     * @return the name of the conference
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the start date of the conference.
     * 
     * @return the start date of the conference
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Gets the end date of the conference.
     * 
     * @return the end date of the conference
     */
    public String getEndDate() {
        return endDate;
    }
}