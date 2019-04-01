
public class SoccerPlayer {
	
	private String name;        //playername
	private int num;            //playernumber
	private SoccerTeam team;           // team name
	private boolean redCard, yellowCard = false;
//	public String cards;       // red, yellow
	private int goals;     // no of goals
	
	// contructor(s)
	public SoccerPlayer( String name ) {
		this.name = name;
		this.goals = 0;
	}
	
	// getter, setter and other methods
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	//Intendation!
	
		public void redCard() {
			
			this.redCard = true;
			
	}
	    public void yellowCard() {
	    	
	    	if(yellowCard = true) {
	    		this.redCard = true;
	    	}else {
	    		this.redCard = false;	
	    	}
	    }
	    
	    public int getNumber() {
			
	    	 return this.num;
	    	 
	     }
      public void setNumber(int num) {
    	 
    	    this.num = num;
    	  
      }
      public int increaseGoalCount() {
    	  
    	  return  goals+=1;
    	  
      }
      public void setTeam(SoccerTeam newTeam){
    	  
  		team = newTeam;
}
      public String toString(){
  		return "Player: "+name+"  Number: "+num+"  Team: "+team.getName()+"  Goals: "+goals;
}
}
