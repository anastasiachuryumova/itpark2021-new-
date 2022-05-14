package lesson26full;

import java.math.BigDecimal;

public interface AccountService {
    void withdraw (BigDecimal money);
    void deposit (BigDecimal money);

    BigDecimal getCurrentBalance();
}
