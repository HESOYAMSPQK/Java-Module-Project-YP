public class Race {
    private String leader = "";
    private int leaderDistance = 0;


    public void newLeaderUpdate(Auto auto) {
        int distance = 24 * auto.speed;

        if (distance> leaderDistance){
            leaderDistance = distance;
            leader = auto.name;
            System.out.println("Новый лидер гонки: " + leader + " проехал дистанцию: " + leaderDistance + " км.");
        } else {
            System.out.println("Лидер по прежнему: " + leader + " проехал дистанцию: " + leaderDistance + " км.");
        }
    }
    public String getCurrentLeader() {
        return leader;
    }
}
