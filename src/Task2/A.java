package Task2;

public class A extends Marks {

    private int math;
    private int history;
    private int science;

    A(int math, int history, int science) {
        this.math = math;
        this.history = history;
        this.science = science;
    }

    @Override
    double getPercentage() {
        return (math + history + science) / 3;
    }
}
