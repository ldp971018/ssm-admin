package com.ldp.mybatisplusstudy.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ldp.mybatisplusstudy.entity.User;
import com.ldp.mybatisplusstudy.mapper.UserMapper;
import com.ldp.mybatisplusstudy.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author t-liudp
 * @since 2022-07-01
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
