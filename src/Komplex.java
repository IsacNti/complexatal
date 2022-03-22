import java.util.Objects;

public class Komplex {
    double a;
    double b;


    public Komplex(double a, double b) {
    this.a = a;
    this.b = b;
    }

    @Override
    public String toString() {
        return "Komplex{" +
                "a=" + a +
                ", b=" + b + "i" +
                '}';
    }

    public Komplex add (Komplex add){
        add.a = a + add.a;
        add.b = b + add.b;
        return add;
    }

    public Komplex multiply(Komplex multiply) {
        multiply.a = a * multiply.a - b * multiply.b;
        multiply.b = b * multiply.a + multiply.b * a;
        return multiply;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Komplex komplex = (Komplex) o;
        return Double.compare(komplex.a, a) == 0 && Double.compare(komplex.b, b) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
}
