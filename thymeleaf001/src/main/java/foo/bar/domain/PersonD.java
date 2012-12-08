package foo.bar.domain;

public class PersonD {
	private String fname;

	public PersonD(String fname) {
		setFname(fname);
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}
}
