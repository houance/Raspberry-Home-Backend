package com.rashome.rashome.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rashome.rashome.dto.QueryData;
import com.rashome.rashome.mapper.RasberryPiDataMapper;
import com.rashome.rashome.po.RasberryPiData;

@Service
public class RasberryPiDataService {
    private RasberryPiDataMapper rasberryPiDataMapper;

    public RasberryPiDataService(
        RasberryPiDataMapper rasberryPiDataMapper
    ){
        this.rasberryPiDataMapper = rasberryPiDataMapper;
    }

    public int addRecord(RasberryPiData rasberryPiData){
        return this.rasberryPiDataMapper.insert(rasberryPiData);
    }

    public List<RasberryPiData> queryDataByRasberrPiID(QueryData queryData){
        return this.rasberryPiDataMapper.selectByRasberryPiID(queryData);
    }

    public List<RasberryPiData> queryDataByTimestamp(QueryData queryData){
        return this.rasberryPiDataMapper.selectByTimestamp(queryData);
    }
}
