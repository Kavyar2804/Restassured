package pojoClassforSerializationandDeserialization;

public class Spouse {
	
	String Spousename;
	String semail;
	int [] sphnNo;
	String saddress;
	
	public Spouse(String spousename, String semail, int[] sphnNo, String saddress) {
		super();
		Spousename = spousename;
		this.semail = semail;
		this.sphnNo = sphnNo;
		this.saddress = saddress;
	}

	public String getSpousename() {
		return Spousename;
	}

	public void setSpousename(String spousename) {
		Spousename = spousename;
	}

	public String getSemail() {
		return semail;
	}

	public void setSemail(String semail) {
		this.semail = semail;
	}

	public int[] getSphnNo() {
		return sphnNo;
	}

	public void setSphnNo(int[] sphnNo) {
		this.sphnNo = sphnNo;
	}

	public String getSaddress() {
		return saddress;
	}

	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	
	
	
	
}