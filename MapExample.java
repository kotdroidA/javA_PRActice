    	import java.util.*;

        public class MapExample{
                public static void main (String[] args ){
                	Map<String,Integer> courseFee=new HashMap<>();
			
			// insert values in map
			
			courseFee.put("Java",677);
         		
    		courseFee.put("kotlin",8000);

			courseFee.put("Javascript",9000);

			courseFee.put("C",11000);

			courseFee.put("C++",5000);

			//using method get()

			int a=courseFee.get("Java");

			int b=courseFee.get("kotlin");

			System.out.println("combined fees for java and kotlin is :"+(a+b));

			Map<String ,Integer> letestCourse=new HashMap<>();

			//using method putAll()

			letestCourse.putAll(courseFee);

			System.out.println(letestCourse);



			//using method putIfAbsent()


			// int c=letestCourse.putIfAbsent("Java",10000);
			// System.out.println(c);

			//using method remove()
						
			courseFee.remove("C");
			System.out.println(courseFee);

			//using method remove()

 
			boolean d=courseFee.remove("C++",4000);

			System.out.println(d);
			System.out.println(courseFee);


			//using method keySet()

			courseFee.keySet();
			System.out.println(courseFee);

			//using method clear()


			//courseFee.clear();

			//System.out.println(courseFee);

			//using method containsKey()

			boolean e=courseFee.containsKey("Javascript");
			System.out.println("is Javascript included ?"+e);

			//using method containsValue()

			boolean f=courseFee.containsValue(4000);
			System.out.println(f);

			//using method equals()

			boolean g=courseFee.equals(letestCourse);
			System.out.println("courseFee equal hai letestCourse :"+g);

			//using method getOrDefault()

			//int feeKotlin = courseFee.getOrDefault("kotlin",8000);
			//System.out.println("Kotlin Fees: "+ feeKotlin);
			//System.out.println(courseFee);

			//using method isEmpty()

			boolean h=courseFee.isEmpty();
			System.out.println("map is empty :"+h);

			//using method replace()
 
			int i=courseFee.replace("C++",6000);
			System.out.println("replace fees of c++ :"+i);

			//using method value()      
			Collection<Integer> list=courseFee.values();
			System.out.println(list);


			// using entrySet() method
			Set<Map.Entry<String,Integer>> entrySet = courseFee.entrySet();
			System.out.println(entrySet);



			//Usage of Map.Entry Interface methods
			for(Map.Entry entry : entrySet ) {

				if(entry.getKey().equals("Java")){
					entry.setValue(20000);
				}
				System.out.print(entry.getKey() + " : ");
				System.out.println(entry.getValue() );


			}



	}

}
