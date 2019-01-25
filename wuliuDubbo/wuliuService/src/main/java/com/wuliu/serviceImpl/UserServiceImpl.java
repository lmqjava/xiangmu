package com.wuliu.serviceImpl;

import com.wuliu.mapper.UserMapper;
import com.wuliu.pojo.User;
import com.wuliu.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService{
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> selectAll(){
        return userMapper.selectAll();
    }
}
