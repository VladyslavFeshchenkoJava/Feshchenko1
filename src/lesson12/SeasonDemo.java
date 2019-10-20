package lesson12;

public class SeasonDemo {
    public static void main(String[] args) {

        Seasons season = Seasons.SPRING;
        System.out.println(season);

        print();

        switch (season) {
            case SPRING:
                System.out.println("I love spring");
                break;
            case FALL:
                System.out.println("I love fall");
                break;
            case SUMMER:
                System.out.println("I love summer");
                break;
            case WINTER:
                System.out.println("I love Winter");
                break;
        }
    }

    public static void print() {

        Seasons[] seasons = Seasons.values();
        for (Seasons s : seasons) {
            System.out.println(s + " " + s.getAvgTmp() + " " + s.getDescription());
        }
    }
}
