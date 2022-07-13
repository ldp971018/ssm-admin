package com.ldp.springbootproject.mapper;

import com.ldp.springbootproject.bean.Account;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccountMapper {


    public Account getAcct(Long id);
}
