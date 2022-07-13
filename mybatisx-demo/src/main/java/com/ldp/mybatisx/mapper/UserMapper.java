package com.ldp.mybatisx.mapper;
import org.apache.ibatis.annotations.Param;

import com.ldp.mybatisx.bean.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author Administrator
* @description 针对表【t_user】的数据库操作Mapper
* @createDate 2022-07-02 08:03:01
* @Entity com.ldp.mybatisx.bean.User
*/
public interface UserMapper extends BaseMapper<User> {

    int insertSelective(User user);

}




