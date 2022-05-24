
public class Customer
{
	int Cid;
	String Cname;
	int Cnum;
	String Cloc;
	
	public Customer(int Cid, String Cname, int Cnum, String Cloc)
	{
		super();
		this.Cid = Cid;
		this.Cname = Cname;
		this.Cnum = Cnum;
		this.Cloc = Cloc;
	}

	public int getCid() {
		return Cid;
	}

	public void setCid(int Cid) {
		this.Cid = Cid;
	}

	public String getCname() {
		return Cname;
	}

	public void setCname(String Cname) {
		this.Cname = Cname;
	}

	public int getCnum() {
		return Cnum;
	}

	public void setCnum(int Cnum) {
		this.Cnum = Cnum;
	}

	public String getCloc() {
		return Cloc;
	}

	public void setCloc(String Cloc) {
		this.Cloc = Cloc;
	}
	
	
}
