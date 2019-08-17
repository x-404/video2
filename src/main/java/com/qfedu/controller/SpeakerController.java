package com.qfedu.controller;

import com.github.pagehelper.Page;
import com.qfedu.common.JsonResult;
import com.qfedu.entity.Speaker;
import com.qfedu.service.SpeakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
@ResponseBody
//@RequestMapping("/speaker")
public class SpeakerController {
    @Autowired
    private SpeakerService speakerService;

    @RequestMapping("/listSpeaker.do")
    public Map<String, Object> listSpeaker(Speaker speaker, Integer page, Integer limit) {
        List<Speaker> list = speakerService.findAllSpeaker(speaker, page, limit);
        long total = ((Page) list).getTotal();
        Map<String, Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", total);
        map.put("data", list);
        return map;
    }

    @RequestMapping("/speakerList.do")
    public JsonResult list() {
        List<Speaker> speaker = speakerService.findSpeaker();
        return new JsonResult(1, speaker);
    }

    @RequestMapping("/addSpeaker.do")
    public JsonResult addSpeaker(Speaker speaker) {
        speakerService.addSpeaker(speaker);
        return new JsonResult(1, null);
    }

    @RequestMapping("/deleteSpeaker.do")
    public JsonResult deleteSpeaker(Integer id) {
        speakerService.deleteBySpeakerId(id);
        return new JsonResult(1, "删除成功");
    }

    @RequestMapping("/updateSpeaker.do")
    public JsonResult updateSpeaker(Speaker speaker) {
        speakerService.updateSpeaker(speaker);
        return new JsonResult(1, null);
    }

    @RequestMapping("/querySpeakerId.do")
    public JsonResult selectBySpeakerId(Integer id) {
        Speaker speaker = speakerService.selectBySpeakerId(id);
        return new JsonResult(1, speaker);
    }
}
