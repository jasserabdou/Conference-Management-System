public class Certificate {
    private String attendeeId;
    private String content;

    public Certificate(String attendeeId, String content) {
        this.attendeeId = attendeeId;
        this.content = content;
    }

    public void generateCertificate() {
        System.out.println("Certificate generated for Attendee ID: " + attendeeId);
    }

    public String getAttendeeId() {
        return attendeeId;
    }

    public String getContent() {
        return content;
    }
}
