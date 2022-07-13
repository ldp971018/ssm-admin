package com.ldp.mybatisplusstudy;

import com.ldp.mybatisplusstudy.pojo.User;
import com.ldp.mybatisplusstudy.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

/**
 * @author T-liudp
 * @create 2022-06-28 23:32
 */
@SpringBootTest
public class MybatisPlusServiceTest {

    @Autowired
    private UserService userService;

     /**
     * @Author: T-liudp
     * @Description: 测试查询数据
     * @Date: 2022/6/28 23:35
     * @Parms:
     * @ReturnType:
     */

    @Test
    public void testGetUser(){
        //查询总记录数的条数
        long count = userService.count();
        System.out.println("count = " + count);
    }

     /**
     * @Author: T-liudp
     * @Description:  批量数据添加
     * @Date: 2022/6/28 23:34
     * @Parms:
     * @ReturnType:
     */
    @Test
    public void testInsertUser(){
        List<User> userList=new ArrayList<User>();
        for (int i = 0; i < 1000; i++) {
            User user=new User();
            user.setName("T-liudp");
            user.setAge(18);
            user.setEmail("dongping.liu@gientech.com");
            userList.add(user);
        }
        boolean flag = userService.saveBatch(userList);
        System.out.println("flag = " + flag);
    }
}
