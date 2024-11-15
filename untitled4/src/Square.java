public class Square extends  Parallelogram implements Figure {
    private final double a;

    public Square(double a) {
        this.a = a;
    }


    @Override
    public double getArea() {
        return a*a;
    }

}
