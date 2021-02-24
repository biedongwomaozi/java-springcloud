package com.mayaoting.springcloud.dao;

import com.mayaoting.springcloud.entities.Purduct;

import java.util.List;

public interface PurductDao {
    public boolean add(Purduct purduct);
    public Purduct get(String pid);
    public List<Purduct> list();
}
