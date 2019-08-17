package com.qfedu.service.Impl;

import com.qfedu.dao.SubjectDao;
import com.qfedu.entity.Subject;
import com.qfedu.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectServiceImpl implements SubjectService {

    @Autowired(required = false)
    private SubjectDao subjectDao;


    @Override
    public List<Subject> findSubject() {
        List<Subject> subject = subjectDao.findSubject();
        return subject;
    }
}
