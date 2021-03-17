package com.mayaoting.springcloud.controller;

import com.mayaoting.springcloud.entities.Purduct;
import com.mayaoting.springcloud.service.PurductService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.TimeUnit;

@RestController
public class PurductController {
    @Resource
    private PurductService purductService;

    @Value("${server.port}")
    private String port;

    @GetMapping(value = "purductController/getPort")
    public String getPort() {
        return port;
    }

    @PostMapping("purductController/add")
    public boolean add(@RequestBody Purduct purduct){
        return purductService.add(purduct);
    }

    @GetMapping("purductController/get")
    public Purduct get(@RequestParam(value = "pid") String pid){
        return purductService.get(pid);
    }

    @GetMapping("purductController/list")
    public List<Purduct> list(){
        return purductService.list();
    }

    @GetMapping("purductController/getExt")
    public String getExt(){
        if(1==1){
            throw  new RuntimeException("getExt报错了");
        }
        return "";
    }

    @PostMapping("purductController/runTime")
    public String rumTime(@RequestParam(value = "time") int time) {
        try {
            TimeUnit.SECONDS.sleep(time);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "线程池：" + Thread.currentThread().getName()+"端口号："+port;
    }


}
