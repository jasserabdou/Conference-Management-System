/**
 * The Certificate class represents a certificate issued to an attendee.
 */
public class Certificate {
    private String attendeeId;
    private String content;

    /**
     * Constructs a new Certificate with the specified attendee ID and content.
     *
     * @param attendeeId the ID of the attendee receiving the certificate
     * @param content    the content of the certificate
     * @throws IllegalArgumentException if the attendeeId or content is null or
     *                                  empty
     */
    public Certificate(String attendeeId, String content) {
        if (attendeeId == null || attendeeId.isEmpty()) {
            throw new IllegalArgumentException("Attendee ID cannot be null or empty");
        }
        if (content == null || content.isEmpty()) {
            throw new IllegalArgumentException("Content cannot be null or empty");
        }
        this.attendeeId = attendeeId;
        this.content = content;
    }

    /**
     * Generates the certificate by printing the certificate details.
     */
    public void generateCertificate() {
        System.out.println("Certificate for Attendee ID: " + attendeeId);
        System.out.println("Content: " + content);
    }

    /**
     * Returns a string representation of the certificate.
     *
     * @return a string representation of the certificate
     */
    @Override
    public String toString() {
        return "Certificate{" +
                "attendeeId='" + attendeeId + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}