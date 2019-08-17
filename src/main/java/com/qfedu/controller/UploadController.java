package com.qfedu.controller;

import com.qfedu.common.JsonResult;
import com.qfedu.entity.Admin;
import com.qfedu.service.AdminService;
import com.qfedu.utils.StrUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;

public class UploadController {

/*    @RequestMapping("/upload2.do")

    @ResponseBody
    public JsonResult uploadFile2(@RequestParam("file") MultipartFile upfile, HttpSession session){

        Admin a = (Admin) session.getAttribute(StrUtils.LOGIN_USER);
        if(a == null){
            new JsonResult(0, "未登陆");
        }
        // 上传文件的目录
        String dir = "D:/upload";
        // 获取上传的文件的文件名
        String fileName = upfile.getOriginalFilename();

        // 判断目录是否存在
        File dirFile = new File(dir);
        if(!dirFile.exists()){
            dirFile.mkdirs();
        }

        // 要保存的文件的File对象
        File newFile = new File(dir, fileName);
        try {
            // 保存文件
            upfile.transferTo(newFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 获取上传文件的输入流，进行流的拷贝，也可以实现文件的上传
        //InputStream inputStream = upfile.getInputStream();

        // 操作数据库
        AdminService.updateHeadImg(u.getUid(), "/upload/" + fileName);

        return new JsonResult(1, "上传成功");
    }*/

}
