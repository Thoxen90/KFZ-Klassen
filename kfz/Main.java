package kfz;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Fahrer Ralf = new Fahrer(12,"Ralf",12,"C");
		
		PTF Bus = new PTF(80,200,new GPS(128.6,19.8),8);
		
		System.out.println(Bus.toString());		
		System.out.println(Ralf.getId());

	}

}
