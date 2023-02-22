import java.util.*;

public class ComparableComparator4 {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(5, 7, 2, 9);
		
//		Collections.sort(nums);//[2, 5, 7, 9]
//		Collections.reverse(nums);//Big to small[9, 7, 5, 2]
		
		Collections.sort(nums, (n1,n2) -> n2-n1);//[9, 7, 5, 2]
//		Collections.sort(nums, (n1,n2) -> n1-n2);//[2, 5, 7, 9]
		                    
		System.out.println(nums);
	
		
	}

}
