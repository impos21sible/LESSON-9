public class Circle implements Figure {
    // Радиус круг
    private double r ;

    public Circle(double r) {
        this.r = r;
    }
    @Override
    public double getArea(){
        return Math.PI * r * r;
    }



}