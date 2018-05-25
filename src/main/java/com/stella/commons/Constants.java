package com.stella.commons;

public interface Constants {
    long EXCEPTION_HTTP_CODE = -9L;
    String SHORT_DATE_FORMAT = "yyyy-MM-dd";

    interface Incoming {
        interface UrlPaths {
            interface Query {
                String GET_PAYMENTS = "/query/payments";
                String GET_LAST_BLOCK = "/query/last-block" ;
            }
        };
    }

    interface WebWallet {
        interface UrlPaths {
            interface Notification {
                String CRYPTO_DEPOSIT = "/notification/crypto-deposit";
                String MANUAL_TOKEN_TRANSFER = "/notification/manual-token-transfer";
            }
            interface User {
                String STELLA_ADDRESS_BY_DEPOSIT = "/user/stella-address";
                String USER_CREATE = "/user/create";
                String PASSWORD_FORGOT = "/user/password/forgot";
                String PASSWORD_NEW = "/user/password/reset";
                String USER_LIST = "/user/list";
            }
        };
    }

    interface WalletGenerator {
        interface UrlPaths {
            interface Wallet {
                String USER_ADDRESSES = "/wallet/addresses";
                String DEPOSIT_ADDRESSES = "/wallet/deposit-addresses";
            }
        }
    }

    interface BeanNames {
        String LITECOIN_SERVICE = "litecoinService";
        String BITCOIN_SERVICE = "bitcoinService";
        String ETHEREUM_SERVICE = "ethereumService";
        String RIPPLE_SERVICE = "rippleService";
        String QUARTZ_DB_INITIALIZER = "quartzDbInitializer";
    }
}
