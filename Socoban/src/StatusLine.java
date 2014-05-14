
public class StatusLine {

	private String playerName;
	private int level;
	private int moves;
	private int time;
		

    public String getPlayerName() {

        return this.playerName;

    }

    public void setPlayerName(String playerName) {

        this.playerName = playerName;

    }

    public int getLevel() {

        return this.level;

    }

    public void setLevel(int level) {

        this.level = level;

    }
    public int getMoves() {

        return this.moves;

    }

    public void setMoves(int moves) {

        this.moves = moves;

    }

    public int getTime() {

        return this.time;

    }

    public void setTime(int time) {

        this.time = time;

    }
    
    public StatusLine(String playerName) {

        this.playerName = playerName;

      
    }
   
    public StatusLine(int level,int moves ) {

        this.level = 1;
        this.moves=0;

      
    }
   
}


