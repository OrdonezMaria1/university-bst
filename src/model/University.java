package model;

public class University {
	private String name;
	private String address;
	private AcademicUnit root;
	
	public University(String n, String a) {
		this.name = n;
		this.address = a;
	}
	
	public void addAcademicUnit(String n, int c, String d) {
		AcademicUnit academicUnit = new AcademicUnit(n,c,d);
		if(root == null) {
			root = academicUnit;
		}else {
			AcademicUnit current = root;
			boolean added = false;
			while(!added) {
				if(academicUnit.compareTo(current) > 0) {
					if(current.getRight() == null) {
						current.setRight(academicUnit);
						added = true;
					}else {
						current = current.getRight();
					}
				}else {
					if(current.getLeft() == null) {
						current.setLeft(academicUnit);
						added = true;
					}else {
						current = current.getLeft();
					}
				}
			}
		}
	}

}
