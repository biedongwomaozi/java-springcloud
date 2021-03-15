package com.mayaoting.springcloud.serivce.impl;

import com.mayaoting.springcloud.common.Contant;
import com.mayaoting.springcloud.entities.Purduct;
import com.mayaoting.springcloud.serivce.PurductConService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PurductFallbackConServiceImpl implements PurductConService {
    @Override
    public Boolean add(Purduct purduct) {
        return false;
    }

    @Override
    public Purduct get(String pid) {
        return new Purduct(Contant.ERROR_BOOLEAN_STATUS);
    }

    @Override
    public List<Purduct> list() {
        List<Purduct> list = new ArrayList<>();
        list.add(new Purduct(Contant.ERROR_BOOLEAN_STATUS));
        return list;
    }

    @Override
    public String getPort() {
        return Contant.ERROR_STRING_STATUS;
    }

    @Override
    public String getExt() {
        return Contant.ERROR_STRING_STATUS;
    }

    @Override
    public String rumTime() throws InterruptedException {
        return Contant.ERROR_STRING_STATUS;
    }
}
