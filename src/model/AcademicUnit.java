package model;

public class AcademicUnit implements Comparable<AcademicUnit>{
	private String name;
	private int code;
	private String director;
	private AcademicUnit right;
	private AcademicUnit left;
	
	
	public AcademicUnit(String n, int c, String d) {
		name = n;
		code = c;
		director = d;
	}
	public String getName() {
		return name;
	}
	public int getCode() {
		return code;
	}
	public String getDirector() {
		return director;
	}
	public AcademicUnit getRight() {
		return right;
	}
	public AcademicUnit getLeft() {
		return left;
	}
	public void setRight(AcademicUnit r) {
		right = r;
	}
	public void setLeft(AcademicUnit l) {
		left = l;
	}

	@Override
	public int compareTo(AcademicUnit other) {
		int comparation;
		if(code > other.code) {
			comparation = 1;
		}else if(code < other.code) {
			comparation = -1;
		}else {
			comparation = 0;
		}
		return comparation;
	}
	

}
