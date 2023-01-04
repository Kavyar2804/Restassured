package pojoClassforSerializationandDeserialization;

public class EmployeeDetailsWithObject {
	
	String Ename;
	String Eid;
	String [] Email;
	int [] phnNo;
	String Address;
	Object Spouse;
	
	public EmployeeDetailsWithObject(String ename, String eid, String[] email, int[] phnNo, String address,
			Object spouse) {
		super();
		Ename = ename;
		Eid = eid;
		Email = email;
		this.phnNo = phnNo;
		Address = address;
		Spouse = spouse;
	}
	public EmployeeDetailsWithObject()
	{
		
	}

	public String getEname() {
		return Ename;
	}

	public void setEname(String ename) {
		Ename = ename;
	}

	public String getEid() {
		return Eid;
	}

	public void setEid(String eid) {
		Eid = eid;
	}

	public String[] getEmail() {
		return Email;
	}

	public void setEmail(String[] email) {
		Email = email;
	}

	public int[] getPhnNo() {
		return phnNo;
	}

	public void setPhnNo(int[] phnNo) {
		this.phnNo = phnNo;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public Object getSpouse() {
		return Spouse;
	}

	public void setSpouse(Object spouse) {
		Spouse = spouse;
	}
	
	
	

}
