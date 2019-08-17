package com.qfedu.service.Impl;


import com.github.pagehelper.PageHelper;
import com.qfedu.common.JsonPage;
import com.qfedu.dao.VideoDao;
import com.qfedu.entity.Video;
import com.qfedu.service.VideoService;

import com.qfedu.vo.VideoInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class VideoServiceImpl implements VideoService {
    @Autowired(required = false)
    private VideoDao videoDao;

    @Override
    public List<VideoInfo> findAllVideo(String title, String speakerName, Integer page, Integer limit) {
        // 设置页码和每页显示的记录数，该语句后面，紧跟着数据库查询相关的语句
        PageHelper.startPage(page, limit);
        List<VideoInfo> list = videoDao.findAllVideo(title, speakerName);

        return list;
    }

    @Override
    public List<VideoInfo> findVideo(VideoInfo videoInfo, JsonPage jsonPage) {
        PageHelper.startPage(jsonPage.getPage(), jsonPage.getLimit());
        return videoDao.findVideo(videoInfo);
    }

    @Override
    public void addVideo(Video video) {
        videoDao.addVideo(video);
    }


    @Override
    public void deleteByVid(Integer id) {
        videoDao.deleteByVid(id);
    }

    @Override
    public void updateVideo(Video video) {
        videoDao.updateVideo(video);
    }

    @Override
    public Video selectByVid(Integer id) {
        return videoDao.selectByVid(id);
    }

    @Override
    public void deleteVideo(Integer[] id) {
        videoDao.deleteVideo(id);
    }

   /* @Override
    public List<VideoInfo> findVideo(Video video) {
        return videoDao.findVideo(video);
    }*/
}
