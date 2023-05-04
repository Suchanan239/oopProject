package Game;

public class PlayerOne extends Player {

    private int score;

    public PlayerOne(String name) {
        this.setName(name);
    }

    public PlayerOne() {

    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

}
