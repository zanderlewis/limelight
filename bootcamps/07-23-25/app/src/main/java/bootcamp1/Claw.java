package bootcamp1;

public class Claw {
    private String attachedId; // ID of the arm segment to which the claw is attached
    private boolean isOpen = false; // State of the claw

    public Claw(String armSegmentId) {
        attach(armSegmentId);
    }

    public String getAttachedId() {
        return attachedId;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void attach(String armSegmentId) {
        this.attachedId = armSegmentId;
        System.out.println("Claw attached to arm segment with ID: " + armSegmentId);
    }
    
    public void open() {
        System.out.println("Claw " + attachedId + " is opening.");
        this.isOpen = true;
    }

    public void close() {
        System.out.println("Claw " + attachedId + " is closing.");
        this.isOpen = false;
    }
}