package apt1;

public class Gravity {
    public double falling(double time, double velo){
        double g = 9.8;

        return velo * time + 0.5 * g * time * time;
    }
}
