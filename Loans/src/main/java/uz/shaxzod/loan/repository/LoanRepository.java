package uz.shaxzod.loan.repository;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.shaxzod.loan.entity.Loans;

import java.util.Optional;

@Repository
public interface LoanRepository extends JpaRepository<Loans, Long> {
    Optional<Loans> findByMobileNumber(String mobileNumber);

    Optional<Object> findByLoanNumber(@NotEmpty(message = "Loan number can not be empty or null") @Pattern(regexp = "(^$|[0,9]{12})", message = "Loan number must be 12 digits") String loanNumber);
}
