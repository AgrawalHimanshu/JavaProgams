public class Creature {
    private int legCount;
    private int wingCount;
    
    public Creature(int legCount) {
        this.legCount = this.legCount;
        this.wingCount = 10;
    }
    
    public String toString() {
        return "legs=" + this.legCount + " wings=" + this.wingCount;
    }
    
    public static void main(String args[]){
    	Creature creature =  new Creature(10);
    	System.out.println(creature.toString());
    }
}

