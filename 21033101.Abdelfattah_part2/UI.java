import javax.swing.*;
import java.awt.*;

public class UI {
    private JFrame frame;
    private JTextField conferenceNameField;
    private JTextField conferenceDateField;
    private JTextField speakerNameField;
    private JTextField speakerBioField;
    private JTextField attendeeNameField;
    private JTextField attendeeEmailField;
    private JTextArea outputArea;

    public UI() {
        frame = new JFrame("Conference Management System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 500);
        frame.setLayout(new BorderLayout(10, 10));

        // Input panel
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Conference section
        JLabel conferenceNameLabel = new JLabel("Conference Name:");
        conferenceNameField = new JTextField(15);
        conferenceNameField.setToolTipText("Enter the name of the conference");

        JLabel conferenceDateLabel = new JLabel("Conference Date:");
        conferenceDateField = new JTextField(15);
        conferenceDateField.setToolTipText("Enter the date of the conference (e.g., YYYY-MM-DD)");

        JButton createConferenceButton = new JButton("Create Conference");
        createConferenceButton.addActionListener(e -> createConference());

        // Speaker section
        JLabel speakerNameLabel = new JLabel("Speaker Name:");
        speakerNameField = new JTextField(15);
        speakerNameField.setToolTipText("Enter the name of the speaker");

        JLabel speakerBioLabel = new JLabel("Speaker Bio:");
        speakerBioField = new JTextField(15);
        speakerBioField.setToolTipText("Enter a short bio for the speaker");

        JButton registerSpeakerButton = new JButton("Register Speaker");
        registerSpeakerButton.addActionListener(e -> registerSpeaker());

        // Attendee section
        JLabel attendeeNameLabel = new JLabel("Attendee Name:");
        attendeeNameField = new JTextField(15);
        attendeeNameField.setToolTipText("Enter the name of the attendee");

        JLabel attendeeEmailLabel = new JLabel("Attendee Email:");
        attendeeEmailField = new JTextField(15);
        attendeeEmailField.setToolTipText("Enter the email of the attendee");

        JButton registerAttendeeButton = new JButton("Register Attendee");
        registerAttendeeButton.addActionListener(e -> registerAttendee());

        // Add components to input panel
        gbc.gridx = 0;
        gbc.gridy = 0;
        inputPanel.add(conferenceNameLabel, gbc);
        gbc.gridx = 1;
        inputPanel.add(conferenceNameField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        inputPanel.add(conferenceDateLabel, gbc);
        gbc.gridx = 1;
        inputPanel.add(conferenceDateField, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        inputPanel.add(createConferenceButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        inputPanel.add(speakerNameLabel, gbc);
        gbc.gridx = 1;
        inputPanel.add(speakerNameField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        inputPanel.add(speakerBioLabel, gbc);
        gbc.gridx = 1;
        inputPanel.add(speakerBioField, gbc);

        gbc.gridx = 1;
        gbc.gridy = 5;
        inputPanel.add(registerSpeakerButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 6;
        inputPanel.add(attendeeNameLabel, gbc);
        gbc.gridx = 1;
        inputPanel.add(attendeeNameField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 7;
        inputPanel.add(attendeeEmailLabel, gbc);
        gbc.gridx = 1;
        inputPanel.add(attendeeEmailField, gbc);

        gbc.gridx = 1;
        gbc.gridy = 8;
        inputPanel.add(registerAttendeeButton, gbc);

        // Output area
        outputArea = new JTextArea(10, 40);
        outputArea.setEditable(false);
        outputArea.setBorder(BorderFactory.createTitledBorder("Output"));
        JScrollPane scrollPane = new JScrollPane(outputArea);

        // Add panels to frame
        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Display the frame
        frame.setVisible(true);
    }

    private void createConference() {
        String name = conferenceNameField.getText();
        String date = conferenceDateField.getText();
        if (name.isEmpty() || date.isEmpty()) {
            outputArea.append("Please fill in all conference details.\n");
            return;
        }
        try {
            Conference conference = new Conference(name, date);
            outputArea.append("Conference created: " + conference + "\n");
        } catch (IllegalArgumentException e) {
            outputArea.append("Error: " + e.getMessage() + "\n");
        }
    }

    private void registerSpeaker() {
        String name = speakerNameField.getText();
        String bio = speakerBioField.getText();
        if (name.isEmpty() || bio.isEmpty()) {
            outputArea.append("Please fill in all speaker details.\n");
            return;
        }
        try {
            Speaker speaker = new Speaker(name, bio);
            outputArea.append("Speaker registered: " + speaker + "\n");
        } catch (IllegalArgumentException e) {
            outputArea.append("Error: " + e.getMessage() + "\n");
        }
    }

    private void registerAttendee() {
        String name = attendeeNameField.getText();
        String email = attendeeEmailField.getText();
        if (name.isEmpty() || email.isEmpty()) {
            outputArea.append("Please fill in all attendee details.\n");
            return;
        }
        try {
            Attendee attendee = new Attendee(name, email);
            outputArea.append("Attendee registered: " + attendee + "\n");
        } catch (IllegalArgumentException e) {
            outputArea.append("Error: " + e.getMessage() + "\n");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(UI::new);
    }
}
