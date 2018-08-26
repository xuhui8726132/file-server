package com.xuhui.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class MainController {
    @RequestMapping(value = "/upload" , method = RequestMethod.POST)
    @ResponseBody
    public String upload(@RequestParam(value = "files") MultipartFile[] files){
        System.out.println(files.length);
        for (MultipartFile file:files) {
            System.out.println(file.getOriginalFilename());
        }
        return "file  hello";
    }
}
