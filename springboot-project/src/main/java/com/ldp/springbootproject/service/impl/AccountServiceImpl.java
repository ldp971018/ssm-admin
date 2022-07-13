package com.ldp.springbootproject.service.impl;

import com.ldp.springbootproject.bean.Account;
import com.ldp.springbootproject.mapper.AccountMapper;
import com.ldp.springbootproject.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
     AccountMapper accountMapper;

    public Account getAcctByid(Long id){
        return accountMapper.getAcct(id);
    }
}
