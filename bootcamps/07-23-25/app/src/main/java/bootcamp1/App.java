package bootcamp1;

import java.util.ArrayList;
import java.util.Arrays;

import bootcamp1.ArmSegment;
import bootcamp1.Claw;
import bootcamp1.Drive;
import bootcamp1.Robot;

// Main Interface
@SuppressWarnings("unused")
public class App {
    // Helper functions
    public double cmToMm(double cm) {
        return cm * 10;
    }

    public double mmToCm(double mm) {
        return mm / 10;
    }

    // Test conversion methods
    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.cmToMm(1));
        System.out.println(app.mmToCm(10));

        // Create arm segments with segment lengths
        ArmSegment baseSegment = new ArmSegment("Base", "base", 100);
        ArmSegment middleSegment = new ArmSegment("Fixed", "middle", 80);
        ArmSegment endSegment = new ArmSegment("Fixed", "end", 60);
        ArrayList<ArmSegment> armSegments = new ArrayList<>(Arrays.asList(baseSegment, middleSegment, endSegment));

        // Create claw
        Claw claw = new Claw(endSegment.getId());

        // Create drive system
        Drive drive = new Drive();

        // Create robot
        Robot robot = new Robot(armSegments, claw, drive);

        // Test robot functionality
        System.out.println("Robot created with segments:");
        for (ArmSegment segment : robot.getArmSegments()) {
            System.out.println("  - " + segment.getType() + " segment with ID: " + segment.getId() +
                ", length: " + segment.getSegmentLength() + "mm, extension: " + segment.getExtensionLength() +
                "mm, angle: " + segment.getRotationAngle() + "°");
        }
        robot.getClaw().open();
        System.out.println("Claw state: " + (robot.getClaw().isOpen() ? "Open" : "Closed"));
        robot.getClaw().close();
        System.out.println("Claw state: " + (robot.getClaw().isOpen() ? "Open" : "Closed"));
        robot.getDrive().moveForward(app.cmToMm(10));
        robot.getDrive().turnLeft(90);
        baseSegment.rotate(45);
        middleSegment.extend(app.cmToMm(5));
        endSegment.extend(app.cmToMm(3));

        // Print updated arm segment states
        System.out.println("Updated arm segment states:");
        for (ArmSegment segment : robot.getArmSegments()) {
            System.out.println("  - " + segment.getType() + " segment with ID: " + segment.getId() +
                ", length: " + segment.getSegmentLength() + "mm, extension: " + segment.getExtensionLength() +
                "mm, angle: " + segment.getRotationAngle() + "°");
        }
        // Test retraction
        endSegment.retract(app.cmToMm(2));
        System.out.println("After retraction:");
        System.out.println("  - " + endSegment.getType() + " segment with ID: " + endSegment.getId() +
            ", length: " + endSegment.getSegmentLength() + "mm, extension: " + endSegment.getExtensionLength() +
            "mm, angle: " + endSegment.getRotationAngle() + "°");
    }
}