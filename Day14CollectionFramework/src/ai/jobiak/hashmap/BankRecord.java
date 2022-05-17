package ai.jobiak.hashmap;

import java.util.Objects;

public class BankRecord{
private int custmId;
private String custmName;
public BankRecord(int custmId, String custmName) {
	super();
	this.custmId = custmId;
	this.custmName = custmName;
}
public int  getcustmId() {
	return custmId;
}
public void setcustmId(int custmId) {
	this.custmId = custmId;
}
public String getcustmName() {
	return custmName;
}
public void setcustName(String custName) {
	this.custmName = custName;
}

@Override
public int hashCode() {
	return Objects.hash(custmId, custmName);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	BankRecord other = (BankRecord) obj;
	return custmId == other.custmId && Objects.equals(custmName, other.custmName);
}
@Override
public String toString() {
	return "BankRecord [custmId=" + custmId + ", custmName=" + custmName + "]";
}

}

	



