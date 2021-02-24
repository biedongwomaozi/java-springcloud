package com.mayaoting.springcloud.serivce;

import com.mayaoting.springcloud.entities.Purduct;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Component
@FeignClient(value = "purduct")
public interface PurductConService {
    @PostMapping(value = "purductController/add")
    Boolean add(Purduct purduct);

    @GetMapping(value = "purductController/get")
    Purduct get(String pid);

    @GetMapping(value = "purductController/list")
    List<Purduct> list();

    @GetMapping(value = "purductController/getPort")
    String getPort();
}
