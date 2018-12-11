
/*10)	From given array of integers, create new array having duplicates 
 * removed and every element appearing once only from the given array.
 */

import java.util.HashMap;


public class RemoveDuplicate {


	public static void main(String[] args) {

		int a[]={6,4,8,15,10,3,4,25,10,4,5,8,10,20,22,56,4,9};
		HashMap<Integer,Integer> hmap=new HashMap<>();

		for(int i=0;i<a.length;i++){
			if(hmap.containsKey(a[i])){
				hmap.put(a[i], hmap.get(a[i]));
			}else{
				hmap.put(a[i], 1);
			}

		}
		System.out.println(hmap.keySet());


	}


}