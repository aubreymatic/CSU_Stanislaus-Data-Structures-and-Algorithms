package twothreetree;

public class TwoThreeDriver {

	public static void main(String[] args) {
		
		TwoThreeTree<Integer, Integer> tree = new TwoThreeTree<Integer, Integer>();
		
		Integer[] nums= {5,2,6,9,4,10,1,8,15,20,14,30,40,12,7};
		for (Integer num: nums) {
			tree.insert(num, num);
		}
		tree.inOrder();
	}
}
