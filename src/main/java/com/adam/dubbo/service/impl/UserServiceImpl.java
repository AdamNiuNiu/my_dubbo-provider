package com.adam.dubbo.service.impl;

import com.adam.dubbo.pojo.User;
import com.adam.dubbo.service.UserService;
import com.alibaba.dubbo.config.annotation.Service;

import java.util.ArrayList;
import java.util.List;

//声明这是一个dubbo服务
@Service(version = "${dubbo.service.version}")
public class UserServiceImpl implements UserService {

    /**
     * 模拟数据库查询
     * @return
     */
    @Override
    public List<User> queryAll() {

        List<User> list = new ArrayList<User>();
        for (int i = 0; i < 10; i++) {
             User user = new User();
             user.setAge(10+i);
             user.setId(Long.valueOf(i+1));
             user.setPassword("666");
             user.setUsername("服务20880----真的----从服务提供方获取到了user信息"+i);
            System.out.println("-------服务20880--------");
            list.add(user);
        }
        return list;
    }
}
