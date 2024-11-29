/**
 * The Feedback class represents feedback provided by an attendee.
 */
public class Feedback {
    private String attendeeId;
    private String comments;
    private Rating rating;

    /**
     * Constructs a new Feedback with the specified details.
     * 
     * @param attendeeId the ID of the attendee providing the feedback
     * @param comments   the comments for the feedback
     * @param rating     the rating for the feedback
     */
    public Feedback(String attendeeId, String comments, Rating rating) {
        this.attendeeId = attendeeId;
        this.comments = comments;
        this.rating = rating;
    }

    /**
     * Gets the comments for the feedback.
     * 
     * @return the comments for the feedback
     */
    public String getComments() {
        return comments;
    }

    /**
     * Gets the rating for the feedback.
     * 
     * @return the rating for the feedback
     */
    public Rating getRating() {
        return rating;
    }

    /**
     * Gets the ID of the attendee providing the feedback.
     * 
     * @return the ID of the attendee
     */
    public String getAttendeeId() {
        return attendeeId;
    }
}