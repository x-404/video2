package com.qfedu.controller;


import com.github.pagehelper.Page;
import com.qfedu.common.JsonPage;
import com.qfedu.common.JsonResult;
import com.qfedu.entity.Video;
import com.qfedu.service.VideoService;
import com.qfedu.vo.VideoInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("/video")
public class VideoController {
    @Autowired
    private VideoService videoService;

    @RequestMapping("/listVideo.do")
    @ResponseBody
    public Map<String, Object> listVideoInfo(String title, String speakerName, Integer page, Integer limit) {
        //Admin video = (Admin) session.getAttribute(StrUtils.LOGIN_USER);
        List<VideoInfo> list = videoService.findAllVideo(title, speakerName, page, limit);
        long total = ((Page) list).getTotal();
        Map<String, Object> map = new HashMap<>();
        map.put("code", 0); // 结合layui的表格组件，0表示成功
        map.put("msg", "");
        map.put("count", total);// 表中总记录数
        map.put("data", list); // 获取到的分页数据

        return map;
    }


    @RequestMapping("/findVideo.do")
    @ResponseBody
    public Map<String, Object> findVideo(VideoInfo videoInfo, JsonPage jsonPage) {
        List<VideoInfo> list = videoService.findVideo(videoInfo, jsonPage);
        long total = ((Page) list).getTotal();
        Map<String, Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", total);
        map.put("data", list);
        return map;
    }


    @RequestMapping("/addVideo.do")
    @ResponseBody
    public JsonResult addVideo(Video video) {
        videoService.addVideo(video);
        return new JsonResult(1, "添加成功");
    }


    @RequestMapping("/deleteByVid.do")
    @ResponseBody
    public JsonResult deleteVideo(Integer id) {

        videoService.deleteByVid(id);
        return new JsonResult(1, "删除成功");
    }

    @RequestMapping("/updateVideo.do")
    @ResponseBody
    public JsonResult updateVideo(Video video) {
        videoService.updateVideo(video);
        return new JsonResult(1, null);
    }

    @RequestMapping("/queryVid.do")
    @ResponseBody
    public JsonResult selectVid(Integer id) {
        Video video = videoService.selectByVid(id);
        return new JsonResult(1, video);
    }

    @RequestMapping("/deleteVideo.do")
    @ResponseBody
    public JsonResult deleteVideo(Integer[] id) {
        videoService.deleteVideo(id);
        return new JsonResult(1, "删除成功");
    }

/*    @RequestMapping("/findVideo.do")
    @ResponseBody
    public Map<String, Object> findVideo(Video video, JsonPage jsonPage) {
        List<VideoInfo> list = videoService.findVideo(video, jsonPage);
        long total = ((Page) list).getTotal();
        Map<String, Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", total);
        map.put("data", list);

        return map;
    }*/


}
