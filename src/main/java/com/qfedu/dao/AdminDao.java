package com.qfedu.dao;

import com.qfedu.entity.Admin;

public interface AdminDao {
    public Admin addAdmin(Admin admin);

    public Admin selecByCode(String username);

    public Admin findById(String username);

}
