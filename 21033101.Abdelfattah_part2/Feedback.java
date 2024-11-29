public class Feedback {
    private String attendeeId;
    private String comments;
    private Rating rating;

    public Feedback(String attendeeId, String comments, Rating rating) {
        this.attendeeId = attendeeId;
        this.comments = comments;
        this.rating = rating;
    }

    public String getComments() {
        return comments;
    }

    public Rating getRating() {
        return rating;
    }

    public String getAttendeeId() {
        return attendeeId;
    }
}
