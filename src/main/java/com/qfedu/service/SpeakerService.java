package com.qfedu.service;

import com.qfedu.entity.Speaker;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.List;


public interface SpeakerService {

    public List<Speaker> findAllSpeaker(Speaker speaker, Integer page, Integer limit);

    public List<Speaker> findSpeaker();

    public void addSpeaker(Speaker speaker);

    public void deleteBySpeakerId(Integer id);

    public void updateSpeaker(Speaker speaker);

    public Speaker selectBySpeakerId(Integer id);
}
