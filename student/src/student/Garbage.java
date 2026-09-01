package student;

public class Garbage {
	 Garbage link;
	// nullifying objects
	public static void main() {
		Garbage g1=new Garbage();
		g1=null; 
		// out of scope
		Garbage g2=new Garbage();
		Garbage g3=new Garbage();
		g3=g2;
		
	}
	//island of isolation

   Garbage g4=new Garbage();
   Garbage g5=new Garbage();
   g4.link=g5;
   g5.limk=g4;
   g4=null;
   g5=null;
   
}
//out of scope
g1.outofscope();

