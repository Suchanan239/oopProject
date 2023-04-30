package Game;

public class PlayerTwo extends Player{
    private int score;
    
    public PlayerTwo() {
        
    }
    
    public PlayerTwo(String name){
        this.setName(name);
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    
}
