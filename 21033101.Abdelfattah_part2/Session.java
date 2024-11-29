import java.util.List;

/**
 * The Session class represents a session at the conference.
 */
public class Session {
    private String id;
    private String name;
    private Speaker speaker;
    private String date;
    private String time;
    private String room;
    private List<Attendee> attendees;
    private EventType eventType;

    /**
     * Constructs a new Session with the specified details.
     * 
     * @param id        the unique identifier for the session
     * @param name      the name of the session
     * @param speaker   the speaker for the session
     * @param eventType the type of event
     */
    public Session(String id, String name, Speaker speaker, EventType eventType) {
        this.id = id;
        this.name = name;
        this.speaker = speaker;
        this.eventType = eventType;
    }

    /**
     * Registers an attendee for the session.
     * 
     * @param attendee the attendee to register
     */
    public void registerAttendance(Attendee attendee) {
        attendees.add(attendee);
        System.out.println(attendee.getName() + " attended session: " + name);
    }

    /**
     * Prints the details of the session.
     */
    public void getSessionDetails() {
        System.out.println("Session: " + name + " (" + eventType + ")");
        System.out.println("Speaker: " + speaker.getName());
    }

    /**
     * Gets the name of the session.
     * 
     * @return the name of the session
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the unique identifier of the session.
     * 
     * @return the unique identifier of the session
     */
    public String getId() {
        return id;
    }

    /**
     * Gets the date of the session.
     * 
     * @return the date of the session
     */
    public String getDate() {
        return date;
    }

    /**
     * Gets the time of the session.
     * 
     * @return the time of the session
     */
    public String getTime() {
        return time;
    }

    /**
     * Gets the room where the session will be held.
     * 
     * @return the room where the session will be held
     */
    public String getRoom() {
        return room;
    }
}