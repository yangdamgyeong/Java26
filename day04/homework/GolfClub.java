package homework;

public class GolfClub {
	private String type;
	private int num;
	
	public GolfClub (String type, int num) {
		this.type = type;
		this.num = num;
	}
	
	public GolfClub() {
        this("아이언", 7);
    }

    public GolfClub(int num) {
        this("아이언", num);
        
    }
    
	public GolfClub (String type) {
		this(type, 0);
	}
	
	public void print() {
		if(num == 0) {
			System.out.println(type + "입니다.");
		} else {
			System.out.println(num + "번 " + type + "입니다.");
		}
		
	}
	

}
