package com.mayaoting.springcloud.controller;

import com.mayaoting.springcloud.entities.Purduct;
import com.mayaoting.springcloud.service.PurductService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

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
}
