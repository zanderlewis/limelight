package bootcamp1;

public class Drive {
    public void moveForward(double distance) {
        System.out.println("Moving forward by " + distance + " mm.");
    }

    public void moveBackward(double distance) {
        System.out.println("Moving backward by " + distance + " mm.");
    }

    public void moveLeft(double distance) {
        System.out.println("Moving left by " + distance + " mm.");
    }

    public void moveRight(double distance) {
        System.out.println("Moving right by " + distance + " mm.");
    }

    public void turnLeft(double angle) {
        System.out.println("Turning left by " + angle + " degrees.");
    }

    public void turnRight(double angle) {
        System.out.println("Turning right by " + angle + " degrees.");
    }
}