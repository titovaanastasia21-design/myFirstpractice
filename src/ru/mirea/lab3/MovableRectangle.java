package ru.mirea.lab3;

public class MovableRectangle implements Movable {

    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2,
                            int xSpeed, int ySpeed) {
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    // Проверка, что скорости обеих точек одинаковые
    private boolean sameSpeed() {
        return topLeft.xSpeed == bottomRight.xSpeed
                && topLeft.ySpeed == bottomRight.ySpeed;
    }

    @Override
    public void moveUp() {
        if (!sameSpeed()) {
            System.out.println("Ошибка: скорости точек различаются!");
            return;
        }
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        if (!sameSpeed()) {
            System.out.println("Ошибка: скорости точек различаются!");
            return;
        }
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        if (!sameSpeed()) {
            System.out.println("Ошибка: скорости точек различаются!");
            return;
        }
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        if (!sameSpeed()) {
            System.out.println("Ошибка: скорости точек различаются!");
            return;
        }
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    @Override
    public String toString() {
        return "MovableRectangle(topLeft=" + topLeft
                + ", bottomRight=" + bottomRight + ")";
    }
}