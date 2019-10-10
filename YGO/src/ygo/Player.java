package ygo;

public class Player {
	private String name;
	private int lifePoint;
	private int res;
	Player(String nameP){
		this.name = nameP;
	}
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
	public void soustraction(int sous) {
		if (sous>0) {
			this.lifePoint-=sous;
		}
	}
	public void soustraction(int sous,int mons) {
		if (mons>0&&mons<sous) {
			res = sous-mons;
		}
		if (res>0) {
			this.lifePoint-=res;
		}
	}
	public void addition(int add) {
		if (add>0) {
			this.lifePoint+=add;
		}
	}
}
