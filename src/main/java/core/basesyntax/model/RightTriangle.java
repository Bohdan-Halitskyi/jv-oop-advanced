package core.basesyntax.model;

public class RightTriangle extends Figure {
    private int base;
    private int height;

    public RightTriangle(String color, int base, int height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return (double) base * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName() + ", triangle: "
                + getArea() + "sq. units, color: " + getColor() + ", base: " + base
                + ", height: " + height);
    }
}
