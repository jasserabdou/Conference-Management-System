public class Main {
    public static void main(String[] args) {
        // Create a conference
        Conference conference = new Conference("Tech Conference", "2023-10-15");

        // Create sessions
        Session session1 = new Session("AI and Machine Learning", "Dr. Smith", "10:00 AM");
        Session session2 = new Session("Cybersecurity", "Dr. Johnson", "2:00 PM");

        // Add sessions to the conference
        conference.openSession(session1);
        conference.openSession(session2);

        // Create attendees
        Attendee attendee1 = new Attendee("Alice", "alice@example.com");
        Attendee attendee2 = new Attendee("Bob", "bob@example.com");

        // Register attendees to the conference
        conference.registerAttendee(attendee1);
        conference.registerAttendee(attendee2);

        // Register attendees to sessions
        session1.registerAttendee(attendee1);
        session2.registerAttendee(attendee2);

        // Provide feedback for sessions
        Feedback feedback1 = new Feedback("1", "Great session on AI!", 5);
        Feedback feedback2 = new Feedback("2", "Very informative on cybersecurity.", 4);

        session1.addFeedback(feedback1);
        session2.addFeedback(feedback2);

        // Generate certificates for attendees
        Certificate certificate1 = new Certificate("1", "Certificate of Attendance for AI and Machine Learning");
        Certificate certificate2 = new Certificate("2", "Certificate of Attendance for Cybersecurity");

        certificate1.generateCertificate();
        certificate2.generateCertificate();

        // Print conference details
        System.out.println(conference);

        // Print session details
        session1.getSessionsDetails();
        session2.getSessionsDetails();

        // Print feedback details
        System.out.println(feedback1);
        System.out.println(feedback2);
    }
}