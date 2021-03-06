package com.tronlink.sdk.sdkinterface;

import android.app.Activity;
import android.app.Application;
import com.tronlink.sdk.bean.Account;
import com.tronlink.sdk.bean.Param;
import com.tronlink.sdk.bean.ResourceMessage;

import java.util.List;


public interface ITronLinkSdk {

    void register(Application application, String appId, String secret);

    ResourceMessage getResourceMessage(String address, boolean isBase58);

    Account getAccount(String address, boolean isBase58);

    double getBalanceTrx(String address, boolean isBase58);

    byte[] createTrxTransaction(String fromAddress,
                                String toAddress, double amount);

    byte[] createTrc10Transaction(String fromAddress,
                                  String toAddress, double amount, String id);

    byte[] createTrc20Transaction(String fromAddress,
                                  String toAddress, double amount,
                                  int precision,
                                  String contractAddress);

    String createTrxTransactionJson(String fromAddress,
                                    String toAddress, double amount);

    String createTrc10TransactionJson(String fromAddress,
                                      String toAddress, double amount, String id);

    String createTrc20TransactionJson(String fromAddress,
                                      String toAddress, double amount,
                                      int precision,
                                      String contractAddress);

    byte[] hashOperation(String hashStr);

    void authLogin(Activity activity);

    void toPay(Activity activity, byte[] transactionBytes, String walletName);

    void toPay(Activity activity, String json, String walletName);

    void toPayReturnSign(Activity activity, String json, String walletName);

    byte[] triggerContract(String fromAddress, String contractAddress,
                           String methodName, List<Param> params,
                           String feeLimit);
}
