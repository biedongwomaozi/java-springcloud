package com.mayaoting.springcloud.service;

import com.mayaoting.springcloud.entities.Purduct;

import java.util.List;

public interface PurductService {
    public boolean add(Purduct purduct);
    public Purduct get(String pid);
    public List<Purduct> list();
}
