package com.ldp.springbootredis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.Random;
import java.util.concurrent.TimeUnit;

@SpringBootTest
class SpringbootRedisApplicationTests {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void jedisRedisDemo() {
        //发送验证码
        verifyCode("15979720464");
        //getRedisCode("15979720464","797421");
    }

     /**
     * @Author: T-liudp
     * @Description:  校验的验证码
     * @Date: 2022/7/6 16:48
     * @Parms:
     * @ReturnType:
     */
    public void getRedisCode(String phone,String code){
        //获取连接对象
        //Jedis jedis=new Jedis("192.168.192.133",6379);
        //手机发送验证码的key
        String codeKey = "VerifyCode"+phone+":code";
        String reidsCode = (String) redisTemplate.opsForValue().get(codeKey);

        if (reidsCode.equals(code)) {
            System.out.println("验证成功！");
        }else{
            System.out.println("验证成功！");
        }
    }

    /**
     * @Author: T-liudp
     * @Description:  每个手机只能发送三次验证码，设置多强时间
     * @Date: 2022/7/6 16:37
     * @Parms:
     * @ReturnType:
     */
    public void verifyCode(String phone){
        //获取连接对象
        //Jedis jedis=new Jedis("192.168.192.133",6379);
        //手机发送次数的key
        String countKey = "VerifyCode"+phone+":count";
        //手机发送验证码的key
        String codeKey = "VerifyCode"+phone+":code";
        //获取手机发送的此数据
        String count = (String) redisTemplate.opsForValue().get(codeKey);
        if(count==null){
            //发送次数加一
            redisTemplate.opsForValue().set(countKey,1,24*60*60, TimeUnit.SECONDS);
            //jedis.setex(countKey,24*60*60, "1");
        }else if(Integer.parseInt(count)<=2){
            redisTemplate.opsForValue().set(codeKey,String.valueOf((Integer.parseInt(count)+1)));
            //jedis.incr(codeKey);
        }else if (Integer.parseInt(count)>2){
            System.out.println(phone+"发送验证码次数超过三次");
            return;
        }
        
        //获取验证码
        String vCode=getCode();
        //往redis存放，并设置有效时间60s
        //jedis.setex(codeKey,120,vCode);
        redisTemplate.opsForValue().set(codeKey,vCode,120, TimeUnit.SECONDS);
        //关闭连接
        //jedis.close();
    }

    public String getCode(){
        //生成随时6位验证码
        Random reRandom=new Random();
        String code="";
        for (int i = 0; i < 6; i++) {
            int rand = reRandom.nextInt(10);
            code+=rand;
        }
        return code;
    }
}
