package com.qfedu.dao;


import com.qfedu.entity.Video;
import com.qfedu.vo.VideoInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface VideoDao {
    public List<VideoInfo> findAllVideo(@Param("title") String title, @Param("speakerName") String speakerName);

    public List<VideoInfo> findVideo(VideoInfo videoInfo);

    //添加
    public void addVideo(Video video);

    //删除
    public void deleteByVid(Integer id);

    //更新
    public void updateVideo(Video video);

    //根据id查看
    public Video selectByVid(Integer id);

    //批量删除
    public void deleteVideo(Integer[] id);

//    public List<VideoInfo> findVideo(Video video);

}




