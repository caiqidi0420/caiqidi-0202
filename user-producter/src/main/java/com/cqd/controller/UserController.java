package com.cqd.controller;

import com.cqd.entity.User;
import com.cqd.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class UserController {

    @Autowired
    UserMapper userMapper;

    @RequestMapping("list")
    public Page<User> list(@RequestParam(defaultValue = "0") Integer pageNum, @RequestParam(defaultValue = "3") Integer pageSize) {
        Page<User> all = userMapper.findAll(PageRequest.of(pageNum - 1, pageSize));

        return all;

    }

    @RequestMapping("add")
    public String add(User user){
        userMapper.save(user);
        return "success";
    }

    @RequestMapping("del")
    public String del(Integer id){
        userMapper.deleteById(id);
        return "success";
    }

    @RequestMapping("getUser")
    public User getUser(Integer id){
        Optional<User> byId = userMapper.findById(id);
        User user = byId.get();
        return user;
    }

    @RequestMapping("update")
    public String update(User user){
        userMapper.saveAndFlush(user);
        return "success";
    }
}
