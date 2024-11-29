import java.util.List;

public class Attendee extends Entity implements Person, FeedbackProvider {
    private String email;
    private List<Session> schedule;

    public Attendee(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Session> getSchedule() {
        return schedule;
    }

    public void setSchedule(List<Session> schedule) {
        this.schedule = schedule;
    }

    public void createSchedule(Session session) {
        schedule.add(session);
        System.out.println("Session added to schedule: " + session.getName());
    }

    public void provideFeedback(String comments, int rating) {
        System.out.println("Feedback provided: " + comments + " (Rating: " + rating + ")");
    }
}
