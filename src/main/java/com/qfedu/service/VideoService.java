package com.qfedu.service;


import com.qfedu.common.JsonPage;
import com.qfedu.entity.Video;
import com.qfedu.vo.VideoInfo;

import java.util.List;

public interface VideoService {
    public List<VideoInfo> findAllVideo(String title, String speakerName, Integer page, Integer limit);

    public List<VideoInfo> findVideo(VideoInfo videoInfo, JsonPage jsonPage);

    public void addVideo(Video video);

    public void deleteByVid(Integer id);

    public void updateVideo(Video video);

    public Video selectByVid(Integer id);

    public void deleteVideo(Integer[] id);

//    public List<VideoInfo> findVideo(Video video);

}
