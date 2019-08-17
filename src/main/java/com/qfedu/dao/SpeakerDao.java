package com.qfedu.dao;


import com.qfedu.entity.Speaker;

import java.util.List;

public interface SpeakerDao {

    public List<Speaker> findAllSpeaker(Speaker speaker);

    public List<Speaker> findSpeaker();

    public void addSpeaker(Speaker speaker);

    public void deleteBySpeakerId(Integer id);

    public void updateSpeaker(Speaker speaker);

    public Speaker selectBySpeakerId(Integer id);

}
