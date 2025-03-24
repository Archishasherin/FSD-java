package session5;

public class AccessFoodMenu implements VegItems,NonVegItems{

	@Override
	public void Curry() {
		System.out.println("curry is a good combination with rice");
		System.out.println("fish,chicken,mutton");
		
	}

	@Override
	public void Chilly() {
		System.out.println("chilly is a best combo in hotels");
		System.out.println("chicken,fish,cauliflower");
		
	}

	@Override
	public void breakfast() {
		System.out.println("morning breakfast is mandatory for everyone");
		System.out.println("idly,dosa,pongal");
		
	}

	@Override
	public void lunch() {
		String[] lunch = {"curd rice", "sambar", "lemon rice"};
		for(String l: lunch) {
			System.out.println(l);
		}
		System.out.println("lunch is very important");
//		System.out.println("curd rice,sambar,lemon rice");
		
	}
	public static void main(String[] args) {
		AccessFoodMenu AFM = new AccessFoodMenu();
		AFM.breakfast();
		AFM.Chilly();
		AFM.Curry();
		AFM.lunch();
	}

}
