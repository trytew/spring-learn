package org.nelg.learn_1.factory;

import org.nelg.learn_1.service.WalletService;

public class StaticFactory {

    static public WalletService getWalletService() {
        return new WalletService();
    }
}
