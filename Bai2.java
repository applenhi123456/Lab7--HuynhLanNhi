public class Bai2 {
public interface Moveable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}

public class MoveablePoint implements Moveable {
    private int x, y, xSpeed, ySpeed;

    public MoveablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        y -= ySpeed;
    }

    @Override
    public void moveDown() {
        y += ySpeed;
    }

    @Override
    public void moveLeft() {
        x -= xSpeed;
    }

    @Override
    public void moveRight() {
        x += xSpeed;
    }

    @Override
    public String toString() {
        return String.format("MoveablePoint at (%d, %d)", x, y);
    }
}

public class MoveableCircle implements Moveable {
    private int radius;
    private MoveablePoint center;

    public MoveableCircle(MoveablePoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    @Override
    public String toString() {
        return String.format("MoveableCircle with center %s and radius %d", center.toString(), radius);
    }
    public static void main(String[] args) {
    MoveablePoint point = new MoveablePoint();
    MoveableCircle circle = new MoveableCircle();
    circle.moveRight();
    point.moveUp();
    System.out.println(""); 
    System.out.println(""); 
}
}
}

