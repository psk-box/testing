public class LinearSearch {

	public static void main(String[] args) {
		int a[] = {25,6,42,19,26,12};
		int ele = 26;
		int index = -1;

		for (int i = 0; i < a.length; i++) {
			if (a[i] == ele) {
				index = l;
				break;
			}
		}

		if (index != -1) {
			System.out.println("Element found at index: " + index);
		} else {
			System.out.println("Element not found");
		}
	}

}
