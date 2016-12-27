package q20161218185602;

import java.util.ArrayList;
import java.util.List;

public class Frog {
	public int Frog(){return 0;}
	public List<Integer> getLegs() {
		return legs;
	}
	public int getLegCounts() {
		return legs.size();
	}
	public void setLegs(List<Integer> legs) {
		this.legs = legs;
	}
	private List<Integer> legs;
	public Frog(){
		legs = new ArrayList<Integer>();
		for (int i = 0; i < 4; i++) {
			legs.add(i);
	}}}
