package com.xyz.slppp.app.modular.system.service.impl;

import com.xyz.slppp.app.modular.system.dao.SlpSendMapper;
import com.xyz.slppp.app.modular.system.model.SlpSend;
import com.xyz.slppp.app.modular.system.service.SlpSendService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SlpSendServiceImpl implements SlpSendService {

    @Resource
    private SlpSendMapper slpSendMapper;


    @Override
    public int insertSlpSend(SlpSend slpSend) {
        return slpSendMapper.insertSlpSend(slpSend);
    }
}
