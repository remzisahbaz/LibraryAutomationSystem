package com.sahabt.library.domain.credicard;

import com.sahabt.library.domain.annotations.Aggregate;
import com.sahabt.library.domain.user.FullName;
import com.sahabt.library.domain.user.IdentityNo;
import com.sahabt.library.domain.user.User;
import com.sahabt.library.domain.user.User.Builder;

@Aggregate(id = "crediCardNo")
public class CrediCard {
	private IdentityNo identityNo;
	private CrediCardNo crediCardNo;
	private ExpirationDate expirationDate;
	private CVV cvv;

	public CrediCard (Builder builder) {
		this.identityNo=builder.identityNo;
		this.crediCardNo=builder.crediCardNo;
		this.expirationDate=builder.expirationDate;
		this.cvv=builder.cvv;
		}
	
	public IdentityNo getIdentityNo() {
		return identityNo;
	}

	public void setIdentityNo(IdentityNo identityNo) {
		this.identityNo = identityNo;
	}

	public CrediCardNo getCrediCardNo() {
		return crediCardNo;
	}

	public void setCrediCardNo(CrediCardNo crediCardNo) {
		this.crediCardNo = crediCardNo;
	}

	public ExpirationDate getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(ExpirationDate expirationDate) {
		this.expirationDate = expirationDate;
	}

	public CVV getCvv() {
		return cvv;
	}

	public void setCvv(CVV cvv) {
		this.cvv = cvv;
	}

	public static class Builder{
		private IdentityNo identityNo;
		private CrediCardNo crediCardNo;
		private ExpirationDate expirationDate;
		private CVV cvv;
		
		public Builder identityNo(String identityNo) {
			this.identityNo=IdentityNo.of(identityNo);
			return this;
		}
		public Builder crediCardNo(String crediCardNo) {
			this.crediCardNo=CrediCardNo.of(crediCardNo);
			return this;
		}
		public Builder expirationDate(int mount, int year) {
			this.expirationDate=ExpirationDate.of(mount,year);
			return this;
		}
		public Builder cvv(int cvv) {
			this.cvv=CVV.of(cvv);
			return this;
		}
		public CrediCard build() {
			// validation
			// business rule
			// constraint
			// invariance
			return new CrediCard(this);
		}
	
	}
}
