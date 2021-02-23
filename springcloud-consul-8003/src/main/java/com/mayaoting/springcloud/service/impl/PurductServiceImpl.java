package com.mayaoting.springcloud.service.impl;

import com.mayaoting.springcloud.dao.PurductDao;
import com.mayaoting.springcloud.entities.Purduct;
import com.mayaoting.springcloud.service.PurductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PurductServiceImpl implements PurductService {
    @Resource
    private PurductDao purductDao;
    @Override
    public boolean add(Purduct purduct) {
        return purductDao.add(purduct);
    }

    @Override
    public Purduct get(String pid) {
        return purductDao.get(pid);
    }

    @Override
    public List<Purduct> list() {
        return purductDao.list();
    }
}
