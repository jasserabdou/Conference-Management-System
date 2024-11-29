import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This class represents the UI for managing a conference.
 */
public class ConferenceManagementUI {
    // Data placeholders
    private static List<String> sessions = new ArrayList<>();
    private static List<String> attendees = new ArrayList<>();
    private static List<String> speakers = new ArrayList<>();
    private static Map<String, List<String>> attendance = new HashMap<>();

    /**
     * The main method to launch the conference management UI.
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // Main Frame
        JFrame frame = new JFrame("Conference Management System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 500);

        // Tabbed Pane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Adding Tabs
        tabbedPane.addTab("Conference Management", createConferencePanel());
        tabbedPane.addTab("Session Management", createSessionPanel());
        tabbedPane.addTab("Speaker Management", createSpeakerPanel());
        tabbedPane.addTab("Attendee Management", createAttendeePanel());

        frame.add(tabbedPane);
        frame.setVisible(true);
    }

    /**
     * Creates the Conference Management panel.
     * 
     * @return the conference management panel
     */
    private static JPanel createConferencePanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel label = new JLabel("Conference Management");
        label.setFont(new Font("Arial", Font.BOLD, 16));
        panel.add(label);

        JButton viewInfoButton = new JButton("View Conference Information");
        JButton registerAttendeeButton = new JButton("Register Attendee");
        JButton viewAttendeesButton = new JButton("View Attendees");

        panel.add(viewInfoButton);
        panel.add(registerAttendeeButton);
        panel.add(viewAttendeesButton);

        // Action Listeners
        viewInfoButton.addActionListener(e -> JOptionPane.showMessageDialog(panel,
                "Conference Name: GAF-AI 2025\nStart Date: 2025-12-01\nEnd Date: 2025-12-05"));

        registerAttendeeButton.addActionListener(e -> {
            String name = JOptionPane.showInputDialog(panel, "Enter Attendee Name:");
            String email = JOptionPane.showInputDialog(panel, "Enter Attendee Email:");
            attendees.add(name + " (" + email + ")");
            JOptionPane.showMessageDialog(panel, "Attendee Registered: " + name);
        });

        viewAttendeesButton.addActionListener(e -> {
            String attendeeList = String.join("\n", attendees);
            JOptionPane.showMessageDialog(panel,
                    "Registered Attendees:\n" + (attendeeList.isEmpty() ? "No attendees yet." : attendeeList));
        });

        return panel;
    }

    /**
     * Creates the Session Management panel.
     * 
     * @return the session management panel
     */
    private static JPanel createSessionPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel label = new JLabel("Session Management");
        label.setFont(new Font("Arial", Font.BOLD, 16));
        panel.add(label);

        JButton createSessionButton = new JButton("Create Session");
        JButton trackAttendanceButton = new JButton("Track Attendance");
        JButton viewSessionsButton = new JButton("View Sessions");

        panel.add(createSessionButton);
        panel.add(trackAttendanceButton);
        panel.add(viewSessionsButton);

        // Action Listeners
        createSessionButton.addActionListener(e -> {
            String sessionName = JOptionPane.showInputDialog(panel, "Enter Session Name:");
            sessions.add(sessionName);
            attendance.put(sessionName, new ArrayList<>());
            JOptionPane.showMessageDialog(panel, "Session Created: " + sessionName);
        });

        trackAttendanceButton.addActionListener(e -> {
            if (sessions.isEmpty() || attendees.isEmpty()) {
                JOptionPane.showMessageDialog(panel, "No sessions or attendees available to track attendance.");
                return;
            }

            String sessionName = (String) JOptionPane.showInputDialog(panel, "Select Session:",
                    "Track Attendance", JOptionPane.QUESTION_MESSAGE, null,
                    sessions.toArray(), sessions.get(0));
            if (sessionName == null)
                return;

            String attendeeName = (String) JOptionPane.showInputDialog(panel, "Select Attendee:",
                    "Track Attendance", JOptionPane.QUESTION_MESSAGE, null,
                    attendees.toArray(), attendees.get(0));
            if (attendeeName == null)
                return;

            attendance.get(sessionName).add(attendeeName);
            JOptionPane.showMessageDialog(panel,
                    "Attendance tracked for " + attendeeName + " in session " + sessionName);
        });

        viewSessionsButton.addActionListener(e -> {
            StringBuilder sessionInfo = new StringBuilder();
            for (String session : sessions) {
                sessionInfo.append("Session: ").append(session).append("\nAttendees:\n");
                List<String> sessionAttendees = attendance.get(session);
                sessionInfo.append(
                        sessionAttendees.isEmpty() ? "  None\n" : "  " + String.join(", ", sessionAttendees) + "\n");
            }
            JOptionPane.showMessageDialog(panel,
                    sessionInfo.toString().isEmpty() ? "No sessions yet." : sessionInfo.toString());
        });

        return panel;
    }

    /**
     * Creates the Speaker Management panel.
     * 
     * @return the speaker management panel
     */
    private static JPanel createSpeakerPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel label = new JLabel("Speaker Management");
        label.setFont(new Font("Arial", Font.BOLD, 16));
        panel.add(label);

        JButton registerSpeakerButton = new JButton("Register Speaker");
        JButton viewSpeakersButton = new JButton("View Speakers");

        panel.add(registerSpeakerButton);
        panel.add(viewSpeakersButton);

        // Action Listeners
        registerSpeakerButton.addActionListener(e -> {
            String name = JOptionPane.showInputDialog(panel, "Enter Speaker Name:");
            String bio = JOptionPane.showInputDialog(panel, "Enter Speaker Bio:");
            speakers.add(name + " - " + bio);
            JOptionPane.showMessageDialog(panel, "Speaker Registered: " + name);
        });

        viewSpeakersButton.addActionListener(e -> {
            String speakerList = String.join("\n", speakers);
            JOptionPane.showMessageDialog(panel,
                    "Speakers:\n" + (speakerList.isEmpty() ? "No speakers yet." : speakerList));
        });

        return panel;
    }

    /**
     * Creates the Attendee Management panel.
     * 
     * @return the attendee management panel
     */
    private static JPanel createAttendeePanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel label = new JLabel("Attendee Management");
        label.setFont(new Font("Arial", Font.BOLD, 16));
        panel.add(label);

        JButton generateCertificateButton = new JButton("Generate Attendance Certificate");
        JButton provideFeedbackButton = new JButton("Provide Feedback");

        panel.add(generateCertificateButton);
        panel.add(provideFeedbackButton);

        // Action Listeners
        generateCertificateButton.addActionListener(e -> {
            if (attendees.isEmpty()) {
                JOptionPane.showMessageDialog(panel, "No attendees available to generate certificates.");
                return;
            }

            String attendeeName = (String) JOptionPane.showInputDialog(panel, "Select Attendee:",
                    "Generate Certificate", JOptionPane.QUESTION_MESSAGE, null,
                    attendees.toArray(), attendees.get(0));
            if (attendeeName == null)
                return;

            JOptionPane.showMessageDialog(panel, "Certificate Generated for: " + attendeeName);
        });

        provideFeedbackButton.addActionListener(e -> {
            String feedback = JOptionPane.showInputDialog(panel, "Enter Feedback:");
            JOptionPane.showMessageDialog(panel, "Feedback Submitted: " + feedback);
        });

        return panel;
    }
}