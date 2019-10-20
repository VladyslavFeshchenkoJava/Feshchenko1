package lesson12;

public enum Seasons {
    WINTER(-10), SPRING(15), SUMMER(25) {
        @Override
        public String getDescription() {
            return "Warm season";
        }
    }, FALL(10);

    private double avgTmp;

    Seasons(double avgTmp) {
        this.avgTmp = avgTmp;
    }

    public double getAvgTmp() {
        return avgTmp;
    }

    public String getDescription() {

        return "Cold season";
    }
}
