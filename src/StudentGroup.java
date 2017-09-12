import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		return students;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		this.students=students;
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		if(index<0||index>=students.length) {
			throw new IllegalArgumentException();
		}
		else {
			return students[index];
		}
		
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
	
		if(index<0||index>=students.length||student==null) {
			throw new IllegalArgumentException();
		}
		else {
			students[index]=student;
		}
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		if(student==null) {
			throw new IllegalArgumentException();
		}
		else {
			Student[] s2=new Student[students.length+1];
			s2[0]=student;
			for(int i=0;i<students.length;i++) {
				s2[i+1]=students[i];
			}
			students=s2;
		}
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		if(student==null) {
			throw new IllegalArgumentException();
		}
		else {
			Student[] s2=new Student[students.length+1];
			for(int i=0;i<students.length;i++) {
				s2[i]=students[i];
			}
			s2[s2.length-1]=student;
			students=s2;
		}
		
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here

		if(index<0||index>=students.length||student==null) {
			throw new IllegalArgumentException();
		}
		else {
			Student[] s2=new Student[students.length+1];
			for(int i=0;i<index;i++) {
				s2[i]=students[i];
			}
			s2[index]=student;
			for(int i=index+1;i<students.length;i++) {
				s2[i]=students[i-1];
			}
			students=s2;
		}
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		if(index<0||index>=students.length) {
			throw new IllegalArgumentException();
		}
		else {
			int j=0;
			Student[] s2=new Student[students.length-1];
			for(int i=0;i<students.length;i++) {
				if(i!=index) {
					s2[j]=students[i];
					j++;
				}
			}
			students=s2;
		}
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		if(student==null) {
			throw new IllegalArgumentException();
		}
		else {
			
		}
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		if(index<0||index>=students.length) {
			throw new IllegalArgumentException();
		}
		else {
			
		}
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		if(student==null) {
			throw new IllegalArgumentException();
		}
		else {
			
		}
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		if(index<0||index>=students.length) {
			throw new IllegalArgumentException();
		}
		else {
			
		}
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		if(student==null) {
			throw new IllegalArgumentException();
		}
		else {
			
		}
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
		
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		Student[] st=new Student[students.length];
		int j=0;
		if(date==null) {
			throw new IllegalArgumentException();
		}
		else {
			for(int i=0;i<students.length;i++) {
				if(students[i].getBirthDate().compareTo(date)<=0) {
					st[j]=students[i];
					j++;
				}
			}
			Student[] st2=new Student[j];
			for(int i=0;i<j;i++) {
				st2[i]=st[i];
			}
			return st2;
		}
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		if(firstDate==null||lastDate==null) {
			throw new IllegalArgumentException();
		}
		else {
			
		}
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		if(date==null) {
			throw new IllegalArgumentException();
		}
		else {
			
		}
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		if(indexOfStudent==0) {
			throw new IllegalArgumentException();
		}
		else {
			
		}
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		if(student==null) {
			throw new IllegalArgumentException();
		}
		else {
			
		}
		return null;
	}
}
