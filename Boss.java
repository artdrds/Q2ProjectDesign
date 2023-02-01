//superclass for bosses
public abstract class Boss implements Interactive {
	protected final String bossName, answers;
	protected int wrongAnswers;
 	protected boolean bossEncounter = false;

	public Boss(String n, String a, int w){
		bossName = n;
		answers = a;
		wrongAnswers = w; 
	}

	public String getBossName(){
		return bossName;
	}

	public String getAnswers(){
		return answers;
	}

	public int getWrongAnswers(){
		return wrongAnswers;
	}

	public boolean getBossEncounter(){
		return bossEncounter;
	}
	
	public void spawnBoss(){
    		bossEncounter = true;
	}

	public void askQuestion(){
	}
	
	public static void bossWin(){		
    		Player.restoreLives(); 
	}

	public String addParts(String  , String){
  	}

	public void interact(){
	}
}
