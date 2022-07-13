package com.ldp.mybatisx.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ldp.mybatisx.bean.User;
import com.ldp.mybatisx.service.UserService;
import com.ldp.mybatisx.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【t_user】的数据库操作Service实现
* @createDate 2022-07-02 08:03:01
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




