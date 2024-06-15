public class Result {

    private double average;

    private int difference;

    private boolean isAlarm;

    public Result(double average, int difference, boolean isAlarm) {
        this.average = average;
        this.difference = difference;
        this.isAlarm = isAlarm;
    }

    @Override
    public String toString() {
        return "Result{" +
                "average=" + average +
                ", difference=" + difference +
                ", isAlarm=" + isAlarm +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Result result = (Result) o;

        if (Double.compare(average, result.average) != 0) return false;
        if (difference != result.difference) return false;
        return isAlarm == result.isAlarm;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(average);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + difference;
        result = 31 * result + (isAlarm ? 1 : 0);
        return result;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public int getDifference() {
        return difference;
    }

    public void setDifference(int difference) {
        this.difference = difference;
    }

    public boolean isAlarm() {
        return isAlarm;
    }

    public void setAlarm(boolean alarm) {
        isAlarm = alarm;
    }
}
