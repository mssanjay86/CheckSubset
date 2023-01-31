public class SubsetOfArray {
	public static void main(String[] args) {
		int givenArr[] = { 12, 19, 21, 1, 8 };
		int subsetArr[] = { 100, 22 };
		boolean isSubset = false;
		for (int i : subsetArr) {
			for (int j : givenArr) {
				if (i == j) {
					isSubset = true;
					break;
				} else {
					isSubset = false;
				}

			}
			if (!isSubset) {
				break;
			}
		}
		System.out.println(isSubset);

	}
}
