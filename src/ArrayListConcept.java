import java.util.ArrayList;
import java.util.Collections;

public class ArrayListConcept {

	public static void main(String[] args) {

		
		//raw array list with default virtual capacity 10
		ArrayList ar=new ArrayList();
		ar.add(100);
		ar.add("a");
		ar.add(12.33);
		ar.add(true);
		ar.add('f');
		System.out.println(ar.size());
		
		ArrayList ar1=new ArrayList(20);//20 virtual segments created
		System.out.println(ar1.size());//0 because size refers the physical capacity
		
		ar1.add(0, "dad");
		ar1.add(1, 'f');
		for(int i=0;i<ar1.size();i++) {
			System.out.println(ar1.get(i));
		}
		
		//Generic ArrayList
		
		ArrayList<Integer> marksList=new ArrayList<Integer>();
		/*
		 * marksList.add(100); marksList.add(450); marksList.add(45); marksList.add(5);
		 */
		Collections.addAll(marksList, 100,450,45,5);//another way to add all the values in one shot
		for(Integer e:marksList) {
			System.out.println(e);
			
					}
		System.out.println("-------");
		Collections.sort(marksList);
		System.out.println(marksList);
		System.out.println("-------");
		Collections.sort(marksList,Collections.reverseOrder());
		//Collections.sort(marksList,);
		System.out.println(marksList);
		
		
		
      // To store diff types of data in to the same array we use array list with object collection type
		
		ArrayList<Object> empData=new ArrayList<Object>();
		empData.add("Lahari");
		empData.add(25);
		empData.add(23.44);
		empData.add(true);
		empData.add('f');
		
		for(Object e: empData) {
			System.out.println(e);
		}

		
		//to print the emp data in reverse order
		System.out.println(empData.size());
			for(int i=empData.size()-1;i>=0;i--) {
				System.out.println(empData.get(i));
			}
			
			empData.add(4,56);
			for(Object e: empData) {
				System.out.println(e);
			}
			
			/*empData.addAll(marksList);
			
			
			 * for(Object e: empData) { System.out.println(e); }
			 */
			
			empData.addAll(4,marksList);
			
			
			  for(Object e: empData) { System.out.println(e); }
			 empData.clear();
			 System.out.println("After Clear"+empData);
			// for(Object e: empData) { System.out.println(e); }
			 marksList.removeAll(marksList);
			 System.out.println("After removeall"+marksList); 
			 
	}

}
