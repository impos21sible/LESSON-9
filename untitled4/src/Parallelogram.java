public abstract class Parallelogram implements Figure {
    private double height;
    private double weight;

    public Parallelogram(double a, double b) {
        this.height = a;
        this.weight = b;
    }

    public double getArea() {
        return height * weight;
    }

}
