package com.ldp.springbootproject.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ldp.springbootproject.bean.User;
import org.apache.ibatis.annotations.Mapper;


/**
 *
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {


}
