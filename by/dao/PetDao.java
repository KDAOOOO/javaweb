package com.by.dao;

import com.by.bean.Pet;

import java.util.List;

public interface PetDao {

    public List<Pet> findall();

    public int insert(Pet pet);

    public int update(Pet pet);

    public int del(Pet pet);
}
