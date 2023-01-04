package pojoClassforSerializationandDeserialization;

public class EmployeeDetailswithArrayPojo {
	
	String Ename;
	String Eid;
	String [] Email;
	int [] phnNo;
	int pincode;
	String Address;
	
	public EmployeeDetailswithArrayPojo(String ename, String eid, String[] email, int[] phnNo, int pincode,
			String address) {
		Ename = ename;
		Eid = eid;
		Email = email;
		this.phnNo = phnNo;
		this.pincode = pincode;
		Address = address;
	}
	public EmployeeDetailswithArrayPojo()
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

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}
	
	
	
}
