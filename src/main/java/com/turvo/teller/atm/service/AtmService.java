package com.turvo.teller.atm.service;

import com.turvo.teller.atm.domain.Account;

import java.math.BigDecimal;
import java.util.List;

public interface AtmService {

    public int depositCash(int accountNumber, int amount);

    public int withdrawCash(int accountNumber, int pin, int amount);

    public int requestBalance(int accountNumber, int pin);

    public List<Account> accounts();
}
