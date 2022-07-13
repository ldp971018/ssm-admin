package com.ldp.springbootproject.service;


import com.ldp.springbootproject.bean.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public interface AccountService {

    Account getAcctByid(Long id);
}
