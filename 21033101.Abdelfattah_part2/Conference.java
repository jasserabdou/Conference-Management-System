import java.util.List;

public class Conference {
    private String name;
    private String startDate;
    private String endDate;
    private List<Session> sessions;
    private List<Attendee> attendees;

    public void openSession(Session session) {
        sessions.add(session);
        System.out.println("Session opened: " + session.getName());
    }

    public void registerAttendee(Attendee attendee) {
        attendees.add(attendee);
        System.out.println("Attendee registered: " + attendee.getName());
    }

    public String getName() {
        return name;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }
}
