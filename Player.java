public class Player {
	protected final String playerName, playerColor;
  protected char playerSex;
	protected int lives;

  public String getPlayerName(){
		return playerName;
	}

  public String getPlayerColor(){
		return playerColor;
	}

  public char getPlayerSex(){
		return playerSex;
	}

  public int getLives(){
		return lives;
	}
  
	public Player(String n, char s, String c, int l){
		playerName = n;
    playerSex = s;
		playerColor = c;
		lives = l; 
	}

  public void restoreLives(){
    lives++;
  }
  
	public void loseLife(){
    lives--;
	}
  
	public void inspect(Interactive i){
    i.interact();
	}
}

