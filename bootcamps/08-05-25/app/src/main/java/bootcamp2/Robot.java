package bootcamp2;

import java.util.ArrayList;

public class Robot {
    private ArrayList<ArmSegment> armSegments;
    private Claw claw;
    private Drive drive;

    public Robot(ArrayList<ArmSegment> armSegments, Claw claw, Drive drive) {
        this.armSegments = armSegments;
        this.claw = claw;
        this.drive = drive;
    }

    public ArrayList<ArmSegment> getArmSegments() {
        return armSegments;
    }

    public Claw getClaw() {
        return claw;
    }

    public Drive getDrive() {
        return drive;
    }
}