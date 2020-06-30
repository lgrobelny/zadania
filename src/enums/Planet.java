package enums;

public enum Planet {

    MERCURY(123234), VENUS(345456.54), EARTH(234345435);

    private double radius;

    Planet(double radius) {
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }
    @Override
    public String toString(){
        return super.toString() + " has radius " + radius;
    }
}
