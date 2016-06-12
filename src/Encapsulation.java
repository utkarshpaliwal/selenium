
public class Encapsulation {
	public static void main(String a[]){
		Bank b = new Bank();
		System.out.println(b.getBal());
		b.setBal(234654151,"2141");;
		System.out.println(b.getBal());
	}
}

class Bank{
	private int Bal;
	Bank(){
		Bal = 5000;
	}
	public int getBal(){
		return Bal;
	}
	public void setBal(int b,String pin){
		if(pin.equals("1245")){
		Bal = b;
		}else{
			System.out.println("Invalid pin");
		}
	}
}