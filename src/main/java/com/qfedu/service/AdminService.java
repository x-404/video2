package com.qfedu.service;

import com.qfedu.entity.Admin;

public interface AdminService {
    public Admin login(String username, String password);

    public Admin selectByCode(String username);

    public void addAdmin(Admin admin);


}
