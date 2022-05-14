package lesson26full.impl;

import lesson26full.AccountService;
import lombok.AllArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
public class AccountServiceImpl implements AccountService {

    private BigDecimal balance;

    @Override
    public BigDecimal getCurrentBalance() {
        return balance;
    }

    @Override
    public void withdraw (BigDecimal money) {
        this.balance = balance.subtract(money);
    }

    @Override
    public void deposit (BigDecimal money) {
        this.balance = balance.add(money);
    }
}
