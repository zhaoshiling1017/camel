/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.web3j;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class Web3jComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    private org.apache.camel.component.web3j.Web3jConfiguration getOrCreateConfiguration(Web3jComponent target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.web3j.Web3jConfiguration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        Web3jComponent target = (Web3jComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "address": getOrCreateConfiguration(target).setAddress(property(camelContext, java.lang.String.class, value)); return true;
        case "addresses": getOrCreateConfiguration(target).setAddresses(property(camelContext, java.util.List.class, value)); return true;
        case "atblock":
        case "atBlock": getOrCreateConfiguration(target).setAtBlock(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "blockhash":
        case "blockHash": getOrCreateConfiguration(target).setBlockHash(property(camelContext, java.lang.String.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "clientid":
        case "clientId": getOrCreateConfiguration(target).setClientId(property(camelContext, java.lang.String.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.web3j.Web3jConfiguration.class, value)); return true;
        case "data": getOrCreateConfiguration(target).setData(property(camelContext, java.lang.String.class, value)); return true;
        case "databasename":
        case "databaseName": getOrCreateConfiguration(target).setDatabaseName(property(camelContext, java.lang.String.class, value)); return true;
        case "filterid":
        case "filterId": getOrCreateConfiguration(target).setFilterId(property(camelContext, java.math.BigInteger.class, value)); return true;
        case "fromaddress":
        case "fromAddress": getOrCreateConfiguration(target).setFromAddress(property(camelContext, java.lang.String.class, value)); return true;
        case "fromblock":
        case "fromBlock": getOrCreateConfiguration(target).setFromBlock(property(camelContext, java.lang.String.class, value)); return true;
        case "fulltransactionobjects":
        case "fullTransactionObjects": getOrCreateConfiguration(target).setFullTransactionObjects(property(camelContext, boolean.class, value)); return true;
        case "gaslimit":
        case "gasLimit": getOrCreateConfiguration(target).setGasLimit(property(camelContext, java.math.BigInteger.class, value)); return true;
        case "gasprice":
        case "gasPrice": getOrCreateConfiguration(target).setGasPrice(property(camelContext, java.math.BigInteger.class, value)); return true;
        case "hashrate": getOrCreateConfiguration(target).setHashrate(property(camelContext, java.lang.String.class, value)); return true;
        case "headerpowhash":
        case "headerPowHash": getOrCreateConfiguration(target).setHeaderPowHash(property(camelContext, java.lang.String.class, value)); return true;
        case "index": getOrCreateConfiguration(target).setIndex(property(camelContext, java.math.BigInteger.class, value)); return true;
        case "keyname":
        case "keyName": getOrCreateConfiguration(target).setKeyName(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "mixdigest":
        case "mixDigest": getOrCreateConfiguration(target).setMixDigest(property(camelContext, java.lang.String.class, value)); return true;
        case "nonce": getOrCreateConfiguration(target).setNonce(property(camelContext, java.lang.String.class, value)); return true;
        case "operation": getOrCreateConfiguration(target).setOperation(property(camelContext, java.lang.String.class, value)); return true;
        case "position": getOrCreateConfiguration(target).setPosition(property(camelContext, java.math.BigInteger.class, value)); return true;
        case "priority": getOrCreateConfiguration(target).setPriority(property(camelContext, java.math.BigInteger.class, value)); return true;
        case "privatefor":
        case "privateFor": getOrCreateConfiguration(target).setPrivateFor(property(camelContext, java.util.List.class, value)); return true;
        case "quorumapi":
        case "quorumAPI": getOrCreateConfiguration(target).setQuorumAPI(property(camelContext, boolean.class, value)); return true;
        case "sha3hashofdatatosign":
        case "sha3HashOfDataToSign": getOrCreateConfiguration(target).setSha3HashOfDataToSign(property(camelContext, java.lang.String.class, value)); return true;
        case "signedtransactiondata":
        case "signedTransactionData": getOrCreateConfiguration(target).setSignedTransactionData(property(camelContext, java.lang.String.class, value)); return true;
        case "sourcecode":
        case "sourceCode": getOrCreateConfiguration(target).setSourceCode(property(camelContext, java.lang.String.class, value)); return true;
        case "toaddress":
        case "toAddress": getOrCreateConfiguration(target).setToAddress(property(camelContext, java.lang.String.class, value)); return true;
        case "toblock":
        case "toBlock": getOrCreateConfiguration(target).setToBlock(property(camelContext, java.lang.String.class, value)); return true;
        case "topics": getOrCreateConfiguration(target).setTopics(property(camelContext, java.lang.String.class, value)); return true;
        case "transactionhash":
        case "transactionHash": getOrCreateConfiguration(target).setTransactionHash(property(camelContext, java.lang.String.class, value)); return true;
        case "ttl": getOrCreateConfiguration(target).setTtl(property(camelContext, java.math.BigInteger.class, value)); return true;
        case "value": getOrCreateConfiguration(target).setValue(property(camelContext, java.math.BigInteger.class, value)); return true;
        case "web3j": getOrCreateConfiguration(target).setWeb3j(property(camelContext, org.web3j.protocol.Web3j.class, value)); return true;
        default: return false;
        }
    }

}

