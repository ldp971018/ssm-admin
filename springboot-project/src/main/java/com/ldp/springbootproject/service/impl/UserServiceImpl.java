package com.ldp.springbootproject.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ldp.springbootproject.bean.User;
import com.ldp.springbootproject.mapper.UserMapper;
import com.ldp.springbootproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {


}
