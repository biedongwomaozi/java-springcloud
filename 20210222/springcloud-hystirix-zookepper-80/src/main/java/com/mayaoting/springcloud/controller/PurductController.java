package com.mayaoting.springcloud.controller;

import com.mayaoting.springcloud.common.CommonResult;
import com.mayaoting.springcloud.common.Contant;
import com.mayaoting.springcloud.entities.Purduct;
import com.mayaoting.springcloud.serivce.PurductConService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class PurductController {
    @Resource
    private PurductConService purductConService;

    @PostMapping(value = "purduct/add")
    public CommonResult<Object> add(Purduct purduct) {
        CommonResult<Object> commonResult;
        try{
            boolean add = purductConService.add(purduct);
            commonResult = new CommonResult<Object>(Contant.SUCCESS_CODE,"插入数据成功",add);
        }catch (Exception e){
            commonResult =  new CommonResult<Object>(Contant.ERROR_CODE,e.getMessage());
        }
        return commonResult;
    }

    @GetMapping(value = "purduct/get/{pid}")
    public CommonResult<Purduct> get(@PathVariable String pid) {
        CommonResult<Purduct> commonResult;
        try{
            Purduct purduct = purductConService.get(pid);
            commonResult = new CommonResult<Purduct>(Contant.SUCCESS_CODE,"查询数据成功",purduct);
        }catch (Exception e){
            commonResult =  new CommonResult<Purduct>(Contant.ERROR_CODE,e.getMessage());
        }
        return commonResult;
    }

    @GetMapping(value = "purduct/list")
    public CommonResult<List<Purduct>> list() {
        CommonResult<List<Purduct>> commonResult;
        try{
            List<Purduct> purduct = purductConService.list();
            commonResult = new CommonResult<List<Purduct>>(Contant.SUCCESS_CODE,"查询数据成功",purduct);
        }catch (Exception e){
            commonResult =  new CommonResult<List<Purduct>>(Contant.ERROR_CODE,e.getMessage());
        }
        return commonResult;
    }

    @GetMapping(value = "purduct/getPort")
    public CommonResult<String> getPort() {
        CommonResult<String> commonResult;
        try{
            String port = purductConService.getPort();
            commonResult = new CommonResult<String>(Contant.SUCCESS_CODE,"查询数据成功",port);
        }catch (Exception e){
            commonResult =  new CommonResult<String>(Contant.ERROR_CODE,e.getMessage());
        }
        return commonResult;
    }
    @GetMapping(value = "purduct/getExt")
    public CommonResult<String> getExt() {
        CommonResult<String> commonResult;
        try{
            String getExt = purductConService.getExt();
            commonResult = new CommonResult<String>(Contant.SUCCESS_CODE,"查询数据成功",getExt);
        }catch (Exception e){
            commonResult =  new CommonResult<String>(Contant.ERROR_CODE,e.getMessage());
        }
        return commonResult;
    }
    @GetMapping(value = "purduct/rumTime")
    public CommonResult<String> rumTime() {
        CommonResult<String> commonResult;
        try{
            long startTime = System.currentTimeMillis();
            String rumTime = purductConService.rumTime();
            long endTime = System.currentTimeMillis();
            rumTime += "程序运行时间： "+(endTime-startTime)+"ms";
            commonResult = new CommonResult<String>(Contant.SUCCESS_CODE,"查询数据成功",rumTime);
        }catch (Exception e){
            commonResult =  new CommonResult<String>(Contant.ERROR_CODE,e.getMessage());
        }
        return commonResult;
    }
}