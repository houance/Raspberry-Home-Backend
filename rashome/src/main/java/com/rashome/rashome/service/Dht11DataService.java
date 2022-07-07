package com.rashome.rashome.service;

import org.springframework.stereotype.Service;

import com.rashome.rashome.mapper.Dht11DataMapper;
import com.rashome.rashome.po.Dht11Data;

@Service
public class Dht11DataService {
    
    private Dht11DataMapper dht11DataMapper;

    public Dht11DataService(
        Dht11DataMapper dht11DataMapper
    ){
        this.dht11DataMapper = dht11DataMapper;
    }

    public int addRecord(Dht11Data dht11Data){
        return dht11DataMapper.insert(dht11Data);
    }

    

}
