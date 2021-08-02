package chap16_00;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main2 {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		nums.add(10);
		nums.add(20);
		nums.add(30);

		List<Integer> nums2 = new LinkedList<>(nums);
	}

}
