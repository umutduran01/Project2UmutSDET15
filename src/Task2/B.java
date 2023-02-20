package Task2;

public class B extends Marks {

    private int math;
    private int history;
    private int science;
    private int music;

    public B(int math, int history, int science, int music) {
        this.math = math;
        this.history = history;
        this.science = science;
        this.music = music;
    }

    @Override
    double getPercentage() {
        return (math + history + science + music) / 4;
    }
}
