
public class SoccerTeam {
	
	private String name;
	private SoccerTrainer trainer;
	private int tablePosition;
	private int goalsScored;
	private int goalsAgainst;
	
	private SoccerPlayer[] players= new SoccerPlayer[11];
	
	public SoccerTeam(String name, SoccerTrainer trainer, int tablePosition){
		this.name=name;
		this.trainer=trainer;
		this.tablePosition=tablePosition;
	}
	
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
   public boolean addPlayer(SoccerPlayer player) {
		
		for(int i=0; i<players.length;i++) {
			if(players[i]==null) {
				players[i] = player;
				player.setTeam(this);
				player.setNumber(i+1);
				return true;
			}
			
		}
		
		return false;
   } 
		public void goal(int playerNumber){
			    
		players[playerNumber-1].increaseGoalCount();
			
			    goalsScored+=1;
		}		
			public void goalAgainst(){
				goalsAgainst+=1;
			}		
			public String ratioString(){
				return goalsScored+":"+goalsAgainst;
					}
			public String toString(){
				
String result = "Name: "+name+"  Trainer: "+trainer.getName()+"  Ratio: "+ratioString()+"  Players: \n";
			  
              String result1 = "";
				
              for(int i=0;i<players.length;i++){
					result1+=players[i].toString()+"\n";
				}
			
				return result + result1;
			}
			}
