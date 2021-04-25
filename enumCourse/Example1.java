

/**
 * This enum is declared in the Season.java file.
 * But you can also declare it inside another class:
*/


 class Day {
    public Season season;
    public String getSeason() {
        return season.name();
    }

    public void setSeason(Season season) {
        this.season = season;
    }
    
}

public class Example1{
    public static void main(String[] args) {
        Day D1 = new Day();
        D1.setSeason(Season.SPRING);
        System.out.println(D1.getSeason());
    }
}

