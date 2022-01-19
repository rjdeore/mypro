package frst;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class Pract {
	
	public static void main(String[] args) {
		// duplicate character in array
		
		String a = "dsadadashdajdja";
		
		char[] ar = a.toCharArray();
		
		
		HashMap<Character,Integer> hsm= new HashMap<>();
		
		for(char u : ar) {
			
			if(hsm.containsKey(u)) {
				hsm.put(u, hsm.get(u)+1);
			}
			
			else {
				hsm.put(u,1);
			}
			
		}
		
		
		Set<Character> ks =  hsm.keySet();
		
		for(char r: ks) {
			if(hsm.get(r)>1) {
				System.out.println(r + " : " +hsm.get(r));
			}
			
		}
		
	
		
		
		
		
		//  sorting
		
		int [] ari= {2,3,4,4,243,5,435,34,56,65,46,6,7,5,7,657,5756};
		
		TreeSet<Integer> trs = new TreeSet<>();
		
		for(int sr: ari) {
			trs.add(sr);
		}
		
		Object[] ars=trs.toArray();
		
		
		System.out.println(ars[ars.length-1]);
		
		
		
		
		
		
		// reversing the number
		
		int x= 6948;
		
		int rev = 0;
		
		while(x>0) {
			System.out.println(rev);
			
			rev=rev*10+x%10;
			
			x=x/10;
		}
		
		System.out.println(rev);
		
		
	}
	
	
	
	
	

}
