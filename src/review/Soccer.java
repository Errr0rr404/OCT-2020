package review;

public class Soccer {

    private static Soccer soccer;

    private Soccer() {

    }

    public static Soccer getInstance() {
        if (soccer == null) {
            soccer = new Soccer();
        }
        return soccer;
    }

    public void printTeam() {
        System.out.println("Barcelona");
    }

    public void printTeam(String teamName) {
        System.out.println(teamName);
    }


}
