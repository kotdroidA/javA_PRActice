import java.util.*;
public class KucchBhi{
public static void main(String[] args) {
          		ArrayList<Integer> numList=new ArrayList();
          		numList.add(4);
          		numList.add(5);
          		numList.add(9);
          		numList.add(10);
          		numList.add(6);
          		numList.add(4);
          		numList.add(9);
          		numList.add(2);
          		numList.add(20);
          		numList.add(17);
          		numList.add(16);
          		numList.add(15);
          		numList.add(11);
          		numList.add(2);
          		numList.add(19);
          		numList.add(3);
          		numList.add(1);
          		numList.add(7);
          		numList.add(18);
          		numList.add(8);
          		numList.add(14);

          	    Set<Integer> numSet=new HashSet();


          		for(int i=0; i<numList.size(); i++){
          		int s=numList.get(i);
          		numSet.add(s);	
          		}

          		System.out.println(numList);
          		System.out.println(numSet);
		
	}
} 