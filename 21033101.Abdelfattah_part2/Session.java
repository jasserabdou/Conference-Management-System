import java.util.List;

public class Session {
    private String id;
    private String name;
    private Speaker speaker;
    private String date;
    private String time;
    private String room;
    private List<Attendee> attendees;
    private EventType eventType;

    public Session(String id, String name, Speaker speaker, EventType eventType) {
        this.id = id;
        this.name = name;
        this.speaker = speaker;
        this.eventType = eventType;
    }

    public void registerAttendance(Attendee attendee) {
        attendees.add(attendee);
        System.out.println(attendee.getName() + " attended session: " + name);
    }

    public void getSessionDetails() {
        System.out.println("Session: " + name + " (" + eventType + ")");
        System.out.println("Speaker: " + speaker.getName());
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getRoom() {
        return room;
    }
}
