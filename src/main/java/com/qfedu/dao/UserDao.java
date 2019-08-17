package com.qfedu.dao;

import com.qfedu.entity.User;
import com.sun.tools.javac.util.List;

public interface UserDao {
    public List<User> findAllUser();

    public User findByUid(Integer id);

    public void addUser(User user);

    public void updateUser(User user);

    public void deleteUser(Integer id);
}
