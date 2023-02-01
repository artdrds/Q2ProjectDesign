public class BossTwo extends Boss {
  protected int difficulty;

  public BossTwo(String name, String answers, int wrongAnswers, int d) {
    super(name, answers, wrongAnswers);
    difficulty = d;
  } 
  
  public void increaseDifficulty() {
    
  }

  /**
  public void inspect(Interactive i){
	i.inspect();
  }**/
}	