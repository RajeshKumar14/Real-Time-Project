package com.app.model;

import javax.persistence.Entity;

@Entity
public class Seller {
	private int sellerId;
    private String sellerFirstName;
	private String sellerLastName;
	private String sellerEmail;
	private String mobileNo;
	private String dob;
	private String gender;
	private String Token;
	private String Pwd;
	public Seller() {
		super();
	}
	public Seller(int sellerId) {
		super();
		this.sellerId = sellerId;
	}
	public Seller(int sellerId, String sellerFirstName) {
		super();
		this.sellerId = sellerId;
		this.sellerFirstName = sellerFirstName;
	}
	public Seller(int sellerId, String sellerFirstName, String sellerLastName) {
		super();
		this.sellerId = sellerId;
		this.sellerFirstName = sellerFirstName;
		this.sellerLastName = sellerLastName;
	}
	public Seller(int sellerId, String sellerFirstName, String sellerLastName, String sellerEmail) {
		super();
		this.sellerId = sellerId;
		this.sellerFirstName = sellerFirstName;
		this.sellerLastName = sellerLastName;
		this.sellerEmail = sellerEmail;
	}
	public Seller(int sellerId, String sellerFirstName, String sellerLastName, String sellerEmail, String mobileNo) {
		super();
		this.sellerId = sellerId;
		this.sellerFirstName = sellerFirstName;
		this.sellerLastName = sellerLastName;
		this.sellerEmail = sellerEmail;
		this.mobileNo = mobileNo;
	}
	public Seller(int sellerId, String sellerFirstName, String sellerLastName, String sellerEmail, String mobileNo,
			String dob) {
		super();
		this.sellerId = sellerId;
		this.sellerFirstName = sellerFirstName;
		this.sellerLastName = sellerLastName;
		this.sellerEmail = sellerEmail;
		this.mobileNo = mobileNo;
		this.dob = dob;
	}
	public Seller(int sellerId, String sellerFirstName, String sellerLastName, String sellerEmail, String mobileNo,
			String dob, String gender) {
		super();
		this.sellerId = sellerId;
		this.sellerFirstName = sellerFirstName;
		this.sellerLastName = sellerLastName;
		this.sellerEmail = sellerEmail;
		this.mobileNo = mobileNo;
		this.dob = dob;
		this.gender = gender;
	}
	public Seller(int sellerId, String sellerFirstName, String sellerLastName, String sellerEmail, String mobileNo,
			String dob, String gender, String token) {
		super();
		this.sellerId = sellerId;
		this.sellerFirstName = sellerFirstName;
		this.sellerLastName = sellerLastName;
		this.sellerEmail = sellerEmail;
		this.mobileNo = mobileNo;
		this.dob = dob;
		this.gender = gender;
		Token = token;
	}
	public Seller(int sellerId, String sellerFirstName, String sellerLastName, String sellerEmail, String mobileNo,
			String dob, String gender, String token, String pwd) {
		super();
		this.sellerId = sellerId;
		this.sellerFirstName = sellerFirstName;
		this.sellerLastName = sellerLastName;
		this.sellerEmail = sellerEmail;
		this.mobileNo = mobileNo;
		this.dob = dob;
		this.gender = gender;
		Token = token;
		Pwd = pwd;
	}
	@Override
	public String toString() {
		return "Seller [sellerId=" + sellerId + ", sellerFirstName=" + sellerFirstName + ", sellerLastName="
				+ sellerLastName + ", sellerEmail=" + sellerEmail + ", mobileNo=" + mobileNo + ", dob=" + dob
				+ ", gender=" + gender + ", Token=" + Token + ", Pwd=" + Pwd + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Pwd == null) ? 0 : Pwd.hashCode());
		result = prime * result + ((Token == null) ? 0 : Token.hashCode());
		result = prime * result + ((dob == null) ? 0 : dob.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((mobileNo == null) ? 0 : mobileNo.hashCode());
		result = prime * result + ((sellerEmail == null) ? 0 : sellerEmail.hashCode());
		result = prime * result + ((sellerFirstName == null) ? 0 : sellerFirstName.hashCode());
		result = prime * result + sellerId;
		result = prime * result + ((sellerLastName == null) ? 0 : sellerLastName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seller other = (Seller) obj;
		if (Pwd == null) {
			if (other.Pwd != null)
				return false;
		} else if (!Pwd.equals(other.Pwd))
			return false;
		if (Token == null) {
			if (other.Token != null)
				return false;
		} else if (!Token.equals(other.Token))
			return false;
		if (dob == null) {
			if (other.dob != null)
				return false;
		} else if (!dob.equals(other.dob))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (mobileNo == null) {
			if (other.mobileNo != null)
				return false;
		} else if (!mobileNo.equals(other.mobileNo))
			return false;
		if (sellerEmail == null) {
			if (other.sellerEmail != null)
				return false;
		} else if (!sellerEmail.equals(other.sellerEmail))
			return false;
		if (sellerFirstName == null) {
			if (other.sellerFirstName != null)
				return false;
		} else if (!sellerFirstName.equals(other.sellerFirstName))
			return false;
		if (sellerId != other.sellerId)
			return false;
		if (sellerLastName == null) {
			if (other.sellerLastName != null)
				return false;
		} else if (!sellerLastName.equals(other.sellerLastName))
			return false;
		return true;
	}
	public int getSellerId() {
		return sellerId;
	}
	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}
	public String getSellerFirstName() {
		return sellerFirstName;
	}
	public void setSellerFirstName(String sellerFirstName) {
		this.sellerFirstName = sellerFirstName;
	}
	public String getSellerLastName() {
		return sellerLastName;
	}
	public void setSellerLastName(String sellerLastName) {
		this.sellerLastName = sellerLastName;
	}
	public String getSellerEmail() {
		return sellerEmail;
	}
	public void setSellerEmail(String sellerEmail) {
		this.sellerEmail = sellerEmail;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getToken() {
		return Token;
	}
	public void setToken(String token) {
		Token = token;
	}
	public String getPwd() {
		return Pwd;
	}
	public void setPwd(String pwd) {
		Pwd = pwd;
	}
	
	
}
