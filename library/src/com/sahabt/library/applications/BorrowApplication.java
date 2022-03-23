package com.sahabt.library.applications;

import java.util.Optional;

import com.sahabt.library.domain.borrow.Borrow;
import com.sahabt.library.domain.borrow.IdentityNo;

public interface BorrowApplication {

	Optional<Borrow> hireBooking(Borrow borrow);
	Optional<Borrow> fireBooking(Borrow borrowId);
	Optional<Borrow> getAllBorrowByIdentityNo(IdentityNo identityNo);
	Optional<Borrow> getAllBorrow();
	Optional<Borrow> getInformationBorrow(Borrow borrowId);
	

}
