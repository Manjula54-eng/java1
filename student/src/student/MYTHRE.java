package student;


public class MYTHRE {
		
		static String theatreName;
		static  String theatreLocation;
		String movieName;
		int movieBudget;
		String moviereleasedate;
		public static void main() {
			theatreName="raja";
			theatreLocation="anakapalli";
			MYTHRE M1=new MYTHRE();
			M1.movieName="irumudi";
			M1.movieBudget=300000;	
			System.out.println(theatreName);
			System.out.println(theatreLocation);
			System.out.println(M1.movieName);
			System.out.println(M1.movieBudget);
			MYTHRE M2=new MYTHRE();
			M2.movieName="Toxic";
			M2.movieBudget=400000;	
			System.out.println(theatreName);
			System.out.println(theatreLocation);
			System.out.println(M2.movieName);
			System.out.println(M2.movieBudget);
			theatreName="raja";
			theatreLocation="anakapalli";
			MYTHRE M3=new MYTHRE();
			M3.movieName="dude";
			M3.movieBudget=400000;	
			System.out.println(theatreName);
			System.out.println(theatreLocation);
			System.out.println(M3.movieName);
			System.out.println(M3.movieBudget);
			MYTHRE M4=new MYTHRE();
			M4.movieName="ma inti bangaram";
			M4.movieBudget=500000;	
			System.out.println(theatreName);
			System.out.println(theatreLocation);
			System.out.println(M4.movieName);
			System.out.println(M4.movieBudget);
		}		

}
