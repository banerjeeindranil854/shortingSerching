package project;

public class MergeSort {
	public static void main(String[] args) {
		int[] ar = { 1, 5, 3, 6, 10 };
		MergeSort m = new MergeSort();
		m.sort(ar);
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]);
		}

	}

	void sort(int[] ar) {
		if (ar == null) {
			return;
		}
		if (ar.length > 1) {
			int first = ar.length / 2;
			if (ar.length % 2 != 0) {
				first = first + 1;
			}
			int[] firstArr = new int[first];
			int[] secondArr = new int[ar.length - first];
			for (int i = 0; i < ar.length; i++) {
				if (i < first) {
					firstArr[i] = ar[i];
				}
			}
			for (int i = first; i < ar.length; i++) {
				secondArr[i - first] = ar[i];
			}
			sort(firstArr);
			sort(secondArr);
			int i = 0;
			int j = 0;
			int k = 0;
			while (i < firstArr.length && j < secondArr.length) {
				if (firstArr[i] < secondArr[j]) {
					ar[k] = firstArr[i];
					i++;
					k++;
				} else {
					ar[k] = firstArr[j];
					j++;
					k++;
				}
			}
			while (i < firstArr.length) {
				ar[k] = firstArr[i];
				k++;
				i++;
			}
			while (j < secondArr.length) {
				ar[k] = secondArr[j];
				j++;
				k++;
			}
		}
	}
}
