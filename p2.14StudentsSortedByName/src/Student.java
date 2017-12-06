public class Student implements Comparable<Student> {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

	
		@Override
		public int compareTo(Student o) {
			int compare = this.getName().compareTo(o.getName());

			if (compare < 0) {
				return -1;
			} else if (compare > 0) {
				return 1;
			} else {
				return 0;
			}

	}

}
