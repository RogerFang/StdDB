package edu.whu.irlab.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Roger on 2016/7/21.
 */
@Controller
@RequestMapping("/system")
public class SystemController {

    @RequestMapping(value = "/fileUpload", method = RequestMethod.GET)
    public String fileUpload(){
        return "upload";
    }

    /**
     * 上传文件
     *
     * @param multipartFile
     * @param request
     */
    @RequestMapping(value = "/fileUpload", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, String> fileUpload(MultipartFile multipartFile,
                                          HttpServletRequest request){
        Map<String, String> map = new HashMap<>();
        map.put("msg", "上传失败");
        String path = request.getSession().getServletContext().getRealPath("/")+ File.separator+"upload" + File.separator +multipartFile.getOriginalFilename();
        try {
            FileOutputStream fos = new FileOutputStream(path);
            fos.write(multipartFile.getBytes());
            fos.close();

            System.out.println("upload:"+path);
            map.put("msg", "上传成功");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }
}
