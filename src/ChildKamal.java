
public class ChildKamal extends ParentAirCraft {
	
	public static void main(String[] args) {
		ChildKamal k = new ChildKamal();
		k.engine();
		k.safetyGuidline();
		k.bodyColor();
	}

@Override
public void bodyColor() {
	// TODO Auto-generated method stub
	System.out.println("Red colou on the body.");
}
}
