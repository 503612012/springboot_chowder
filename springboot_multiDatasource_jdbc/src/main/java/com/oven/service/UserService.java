package com.oven.service;

import com.oven.dao.UserDao;
import com.oven.vo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {

    @Resource
    private UserDao userDao;

    public List<User> getMysql() {
        return userDao.getMysql();
    }

    public List<User> getOracle() {
        return userDao.getOracle();
    }

}
