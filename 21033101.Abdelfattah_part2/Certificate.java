/**
 * This class represents a certificate for an attendee.
 */
public class Certificate {
    private String attendeeId;
    private String content;

    /**
     * Constructs a Certificate with the specified attendee ID and content.
     * 
     * @param attendeeId the ID of the attendee
     * @param content    the content of the certificate
     */
    public Certificate(String attendeeId, String content) {
        this.attendeeId = attendeeId;
        this.content = content;
    }

    /**
     * Generates the certificate.
     */
    public void generateCertificate() {
        System.out.println("Certificate generated for Attendee ID: " + attendeeId);
    }

    /**
     * Gets the ID of the attendee.
     * 
     * @return the attendee ID
     */
    public String getAttendeeId() {
        return attendeeId;
    }

    /**
     * Gets the content of the certificate.
     * 
     * @return the content of the certificate
     */
    public String getContent() {
        return content;
    }
}