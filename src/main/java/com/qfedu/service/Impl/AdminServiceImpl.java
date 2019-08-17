package com.qfedu.service.Impl;

import com.qfedu.dao.AdminDao;
import com.qfedu.entity.Admin;
import com.qfedu.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired(required = false)
    private AdminDao adminDao;
    @Override
    public Admin login(String username, String password) {

        Admin admin = adminDao.findById(username);
        if (admin == null) {
            throw new RuntimeException("账号错误");
        }
        if (!admin.getPassword().equals(password)) {
            throw new RuntimeException("密码错误");
        }
        return admin;
    }

    @Override
    public Admin selectByCode(String username) {
        return adminDao.selecByCode(username);
    }


    @Override
    public void addAdmin(Admin admind) {

    }
}
