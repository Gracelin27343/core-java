package Demo;

public class Student {
	private int Sid;
	private String Sname;
	private String Scourse;
	/**
	 * @param sid
	 * @param sname
	 * @param scousre
	 */
	public Student() {
		    
			System.out.println("Default Constructor");
		}
	public Student(int sid, String sname, String scourse) {
		super();
		this.Sid = sid;
		this.Sname = sname;
		this.Scourse = scourse;
	}
	public int getSid() {
		return Sid;
	}
	public void setSid(int sid) {
		this.Sid = sid;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		this.Sname = sname;
	}
	public String getScourse() {
		return Scourse;
	}
	public void setScourse(String scourse) {
		this.Scourse = scourse;
	}
	@Override
	public String toString() {
		return "Student [Sid=" + Sid + ", Sname=" + Sname + ", Scourse=" + Scourse + ", getSid()=" + getSid()
				+ ", getSname()=" + getSname() + ", getScourse()=" + getScourse() + "]";
	}
	
	
}
