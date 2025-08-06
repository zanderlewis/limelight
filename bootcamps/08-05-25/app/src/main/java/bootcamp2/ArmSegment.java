package bootcamp2;

import java.util.ArrayList;
import java.util.Arrays;
import bootcamp2.SegmentType;

public class ArmSegment {
    private SegmentType type;
    private String id; // Unique identifier for the segment
    private double extensionLength = 0; // Length of extension in mm
    private double rotationAngle = 0; // Rotation angle in degrees
    private double segmentLength; // Length of the segment in mm

    public ArmSegment(SegmentType type, String id, double segmentLength) {
        this.type = type;
        this.id = id;
        this.segmentLength = segmentLength;
    }

    public SegmentType getType() {
        return this.type;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void setType(SegmentType type) {
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
        if (this.type == SegmentType.BASE) {
            // Rotate the base based on provided angle
            System.out.println("Rotating base by " + angle + " degrees.");
            this.rotationAngle = normalizeAngle(this.rotationAngle + angle);
        } else if (this.type == SegmentType.FIXED) {
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