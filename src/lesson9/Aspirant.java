package lesson9;

public class Aspirant extends Student {
    String scienceWork;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String scienceWork) {
        super(firstName, lastName, group, averageMark);
        this.scienceWork = scienceWork;
    }

    public Aspirant(String scienceWork) {
        this.scienceWork = scienceWork;
    }

    @Override
    int getScholarship(double averageMark) {

        if (averageMark == 5) {

            return 200;
        } else {
            return 180;
        }
    }
}
