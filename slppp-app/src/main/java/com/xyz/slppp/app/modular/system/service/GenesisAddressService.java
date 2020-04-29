package com.xyz.slppp.app.modular.system.service;

import com.xyz.slppp.app.modular.system.model.GenesisAddress;

public interface GenesisAddressService {

    int insertGenesisAddress(GenesisAddress genesisAddress);

    GenesisAddress findByTxidAndRaiseVout(String txid, Integer raiseVout);

    int updateGensisAddress(GenesisAddress genesisAddress);

}
