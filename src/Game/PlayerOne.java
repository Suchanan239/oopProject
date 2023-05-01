package Game;

public class PlayerOne extends Player{
    
    public PlayerOne(String name){
        this.setName(name);
    }
    
    private int score;

    public PlayerOne() {
        
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    
    
}
