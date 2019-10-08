package ygo;

public class Player {
	private String name;
	private int lifePoint;
	Player(String nameP,int LP){
		this.name = nameP;
		this.setLifePoint(LP);
	}
	
	public void setName(String nameP){
		this.name = nameP;
	}
	public void setLifePoint(int LP){
		if (LP>=0) {
			this.lifePoint = LP;
		}
	}
	public String getName() {
		return name;
	}
	public int getLifePoint() {
		return lifePoint;
	}
}
