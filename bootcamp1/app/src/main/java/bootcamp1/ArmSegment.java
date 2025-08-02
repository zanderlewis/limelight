package bootcamp1;

import java.util.ArrayList;
import java.util.Arrays;

public class ArmSegment {
    private String type;
    private ArrayList<String> allowedTypes = new ArrayList<>(Arrays.asList("Base", "Fixed"));
    private String id; // Unique identifier for the segment
    private double extensionLength = 0; // Length of extension in mm
    private double rotationAngle = 0; // Rotation angle in degrees
    private double segmentLength; // Length of the segment in mm

    private void checkType(String type) {
        if (!this.allowedTypes.contains(type)) {
            System.out.println("Invalid type: " + type);
            System.out.println("Allowed types are:");
            for (String _type : allowedTypes) {
                System.out.println("  - " + _type);
            }
            System.exit(1); // Error
        }
    }

    public ArmSegment(String type, String id, double segmentLength) {
        checkType(type);
        this.type = type;
        this.id = id;
        this.segmentLength = segmentLength;
    }

    public String getType() {
        return this.type;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void setType(String type) {
        checkType(type);
        this.type = type;
    }

    public double getExtensionLength() {
        return this.extensionLength;
    }

    public void setExtensionLength(double length) {
        this.extensionLength = length;
    }

    public double getRotationAngle() {
        return this.rotationAngle;
    }

    public void setRotationAngle(double angle) {
        this.rotationAngle = angle;
    }

    public double getSegmentLength() {
        return this.segmentLength;
    }

    public void setSegmentLength(double length) {
        this.segmentLength = length;
    }

    private double normalizeAngle(double angle) {
        while (angle < 0) {
            angle += 360;
        }
        while (angle >= 360) {
            angle -= 360;
        }
        return angle;
    }

    // Type specific methods
    public void rotate(double angle) {
        if (this.type.equals("Base")) {
            // Rotate the base based on provided angle
            System.out.println("Rotating base by " + angle + " degrees.");
            this.rotationAngle = normalizeAngle(this.rotationAngle + angle);
        } else if (this.type.equals("Fixed")) {
            // Fixed segment does not rotate
            System.out.println("Fixed segment cannot rotate.");
            System.exit(1); // Error
        }
    }

    public void extend(double length) {
        System.out.println("Extending segment of id " + this.id + " by " + length + " mm.");
        this.extensionLength += length;
    }

    public void retract(double length) {
        if (this.extensionLength - length < 0) {
            System.out.println("Cannot retract beyond zero extension.");
            System.exit(1); // Error
        }
        System.out.println("Retracting segment of id " + this.id + " by " + length + " mm.");
        this.extensionLength -= length;
    }
}