package com.qfedu.service;

import com.qfedu.entity.User;

public interface UserService {
    public User findByUid(Integer id);

    public void addUser(User user);

    public void updateUser(User user);

    public void deleteById(Integer id);
}
