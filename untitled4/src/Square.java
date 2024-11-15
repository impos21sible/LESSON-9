public class Square extends  Parallelogram {
    private final double a;

    public Square(double a) {
        this.a = a;
    }


    @Override
    public double getArea() {
        return a*a;
    }

}
