
public class Driver {

	public static void main(String[] args) {

		Employee[] em = new Employee[10];
		Employee ep = new Employee();

		em[0] = new Employee("Bob Jones", 29);
		em[1] = new Employee("Susan Little", 23);
		em[2] = new Employee("Kathy White", 21);
		em[3] = new Employee("John Smith", 25);
		em[4] = new Employee("Mike Ross", 45);
		em[5] = new Employee("Jennifer Hunt", 32);
		em[6] = new Employee("Walter Brown", 50);
		em[7] = new Employee("Samantha Goings", 47);
		em[8] = new Employee("Steve Barber", 36);
		em[9] = new Employee("Terry Manson", 37);

		quickSort(em, 0, em.length - 1);
		for (int i = 0; i < 10; i++) {
			System.out.println("\n" + em[i].toString());
		}
		
		System.out.println("\nSum of all the employees ages is " + sum(em, 0)/2);
//		System.out.println(sum2(em, 0, em.length));

	}

	public static int sum(Employee[] array, int n) {
		if (n == array.length) {
			return 0;
		} else {
			return array[n].getAge() + sum(array, n + 1);
		}
	}

//	public static int sum2(Employee[] array, int min, int max) {
//		if (min == max) {
//			return 0;
//		} else {
//			return sum(array, min, max - 1) + array[max - 1].getAge();
//		}
//	}

	public static void quickSort(Employee[] array, int min, int max) {
		int pivot;
		if (min < max) {
			pivot = partition(array, min, max);
			quickSort(array, min, (pivot - 1));
			quickSort(array, (pivot + 1), max);
		}
	}

	public static int partition(Employee[] array, int min, int max) {

		int pivot = array[min].getAge();
		int left = min;
		int right = max;
		while (left < right) {
			while (array[left].getAge() <= pivot && left < right) {
				left++;
			}
			while (array[right].getAge() > pivot) {
				right--;
			}
			if (left < right) {
				swap(array, left, right);
			}
		}
		swap(array, min, right);

		return right;
	}

	public static void swap(Employee[] array, int left, int right) {
		Employee temp = array[left];
		array[left] = array[right];
		array[right] = temp;
	}

}
