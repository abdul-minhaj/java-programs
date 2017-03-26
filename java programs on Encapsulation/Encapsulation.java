package javaprograms;

import java.util.ArrayList;

public class Encapsulation {


	public static void main(String[] args) {
		
		ArrayList <BeamEx> al= new ArrayList<> ();
		
		BeamEx b1 = new BeamEx ();
		
		b1.setId(123);
		b1.setName("abdul");
		b1.setSalary(40.50);
		al.add(b1);
		
		BeamEx b2 = new BeamEx ();
		b2.setId(111);
		b2.setName("minhaj");
		b2.setSalary(45.50);
		al.add(b2);
		
		BeamEx b3 = new BeamEx ();
		b3.setId(150);
		b3.setName("minnu");
		b3.setSalary(50.50);
		al.add(b3);
		
		
		for (BeamEx b : al){
			
			System.out.println(b.getId() + "\t"  + b.getName() + "\t" + b.getSalary() );
		}
			
	
/*
 * Output : 123	abdul	40.5
111	minhaj	45.5
150	minnu	50.5		
 */
		
		
		
		

	}

}
