
public class CanadianTraffic implements CentralTraffic,ContinentTraffic{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CentralTraffic c = new CanadianTraffic();
		c.redStop();
		c.greenGo();
		c.FlashYellow();
		
		CanadianTraffic a = new CanadianTraffic();
		a.WalkOnSumbol();
		
		ContinentTraffic ct = new CanadianTraffic();
		ct.Trainsymbol();
		
	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("Green Go implementation");
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("Red Stop implementation");
	}

	@Override
	public void FlashYellow() {
		// TODO Auto-generated method stub
		System.out.println("Flash Yellow implementation");
	}
	
	public void WalkOnSumbol()
	{
		System.out.println("Walk On Symbol implementation");
	}

	@Override
	public void Trainsymbol() {
		// TODO Auto-generated method stub
		System.out.println("Stop on Train Symbol");
	}

}
