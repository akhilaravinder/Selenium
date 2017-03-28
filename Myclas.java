package basics;
	import java.util.ArrayList;
	public class Myclas {
		

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int simple_array[]=new int[5];
					ArrayList<Integer>myList =new ArrayList<Integer>(5);
					myList.add(1, null);
					myList.add(5, null);
					myList.add(34, null);
					myList.add(98, null);
	for(Integer x : myList)
		System.out.println(x);
		}

	}

