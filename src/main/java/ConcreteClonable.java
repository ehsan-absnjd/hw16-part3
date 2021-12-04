import java.util.Objects;

public class ConcreteClonable implements Clonable{
    private String name;
    private int age;

    public ConcreteClonable(String name, int age) {
        this.name=name;
        this.age=age;
    }

    public ConcreteClonable(ConcreteClonable base) {
        this.age=base.age;
        this.name=base.name;
    }

    @Override
    public Clonable clone() {

        return new ConcreteClonable(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConcreteClonable that = (ConcreteClonable) o;
        return age == that.age && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
