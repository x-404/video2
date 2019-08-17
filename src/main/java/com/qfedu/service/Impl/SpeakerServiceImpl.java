package com.qfedu.service.Impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qfedu.dao.SpeakerDao;
import com.qfedu.entity.Speaker;
import com.qfedu.service.SpeakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpeakerServiceImpl implements SpeakerService {

    @Autowired(required = false)
    private SpeakerDao speakerDao;

    @Override
    public List<Speaker> findAllSpeaker(Speaker speaker, Integer page, Integer limit) {
        PageHelper.startPage(page, limit);
        List<Speaker> list = speakerDao.findAllSpeaker(speaker);
        return list;
    }

    @Override
    public List<Speaker> findSpeaker() {
        List<Speaker> lt = speakerDao.findSpeaker();
        return lt;
    }

    @Override
    public void addSpeaker(Speaker speaker) {
        speakerDao.addSpeaker(speaker);
    }

    @Override
    public void deleteBySpeakerId(Integer id) {
        speakerDao.deleteBySpeakerId(id);
    }

    @Override
    public void updateSpeaker(Speaker speaker) {
        speakerDao.updateSpeaker(speaker);
    }

    @Override
    public Speaker selectBySpeakerId(Integer id) {
        return speakerDao.selectBySpeakerId(id);
    }
}
