package com.stu.springbootredis.Service.User;

import com.stu.springbootredis.model.UserDomain;

public interface UserService {

    int addUser(UserDomain user);

   // PageInfo<UserDomain> findAllUser(int pageNum, int pageSize);
}