package com.xyz.slppp.app.modular.system.service.impl;

import com.xyz.slppp.app.modular.system.dao.UtxoMapper;
import com.xyz.slppp.app.modular.system.model.Utxo;
import com.xyz.slppp.app.modular.system.service.UtxoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UtxoServiceImpl implements UtxoService {

    @Resource
    private UtxoMapper utxoMapper;

    @Override
    public List<Utxo> findByAddress(String address) {
        return utxoMapper.findByAddress(address);
    }


}
