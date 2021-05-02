package entities;

public class Idtracker {
	int nextdoctorid;
	int nextpatientid;
	
	public Idtracker(int nextdoctorid, int nextpatientid) {
		this.nextdoctorid = nextdoctorid;
		this.nextpatientid = nextpatientid;
	}
	public int getNextdoctorid() {
		return nextdoctorid;
	}
	public void setNextdoctorid() {
		this.nextdoctorid++;
	}
	public int getNextpatientid() {
		return nextpatientid;
	}
	public void setNextpatientid() {
		this.nextpatientid++;
	}
	
	
}
