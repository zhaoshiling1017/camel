/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.component.dsl;

import javax.annotation.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.elytron.ElytronComponent;

/**
 * The elytron component is allows you to work with the Elytron Security
 * Framework
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface ElytronComponentBuilderFactory {

    /**
     * Elytron (camel-elytron)
     * The elytron component is allows you to work with the Elytron Security
     * Framework
     * 
     * Category: http
     * Since: 3.1
     * Maven coordinates: org.apache.camel:camel-elytron
     */
    static ElytronComponentBuilder elytron() {
        return new ElytronComponentBuilderImpl();
    }

    /**
     * Builder for the Elytron component.
     */
    interface ElytronComponentBuilder
            extends
                ComponentBuilder<ElytronComponent> {
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default ElytronComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * If enabled and an Exchange failed processing on the consumer side the
         * response's body won't contain the exception's stack trace.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default ElytronComponentBuilder muteException(boolean muteException) {
            doSetProperty("muteException", muteException);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default ElytronComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the component should use basic property binding (Camel 2.x)
         * or the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default ElytronComponentBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Elytron security provider, has to support mechanism from parameter
         * mechanismName.
         * 
         * The option is a:
         * <code>org.wildfly.security.WildFlyElytronBaseProvider</code> type.
         * 
         * Default: instance of WildFlyElytronHttpBearerProvider
         * Group: advanced
         */
        default ElytronComponentBuilder elytronProvider(
                org.wildfly.security.WildFlyElytronBaseProvider elytronProvider) {
            doSetProperty("elytronProvider", elytronProvider);
            return this;
        }
        /**
         * To configure common options, such as thread pools.
         * 
         * The option is a:
         * <code>org.apache.camel.component.undertow.UndertowHostOptions</code>
         * type.
         * 
         * Group: advanced
         */
        default ElytronComponentBuilder hostOptions(
                org.apache.camel.component.undertow.UndertowHostOptions hostOptions) {
            doSetProperty("hostOptions", hostOptions);
            return this;
        }
        /**
         * Name of the mechanism, which will be used for selection of
         * authentication mechanism.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: BEARER_TOKEN
         * Group: advanced
         */
        default ElytronComponentBuilder mechanismName(
                java.lang.String mechanismName) {
            doSetProperty("mechanismName", mechanismName);
            return this;
        }
        /**
         * Definition of Builder, which will be used for creation of security
         * domain.
         * 
         * The option is a:
         * <code>org.wildfly.security.auth.server.SecurityDomain.Builder</code>
         * type.
         * 
         * Group: advanced
         */
        default ElytronComponentBuilder securityDomainBuilder(
                org.wildfly.security.auth.server.SecurityDomain.Builder securityDomainBuilder) {
            doSetProperty("securityDomainBuilder", securityDomainBuilder);
            return this;
        }
        /**
         * To use a custom HttpBinding to control the mapping between Camel
         * message and HttpClient.
         * 
         * The option is a:
         * <code>org.apache.camel.component.undertow.UndertowHttpBinding</code>
         * type.
         * 
         * Group: advanced
         */
        default ElytronComponentBuilder undertowHttpBinding(
                org.apache.camel.component.undertow.UndertowHttpBinding undertowHttpBinding) {
            doSetProperty("undertowHttpBinding", undertowHttpBinding);
            return this;
        }
        /**
         * To configure security using SSLContextParameters.
         * 
         * The option is a:
         * <code>org.apache.camel.support.jsse.SSLContextParameters</code> type.
         * 
         * Group: security
         */
        default ElytronComponentBuilder sslContextParameters(
                org.apache.camel.support.jsse.SSLContextParameters sslContextParameters) {
            doSetProperty("sslContextParameters", sslContextParameters);
            return this;
        }
        /**
         * Enable usage of global SSL context parameters.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: security
         */
        default ElytronComponentBuilder useGlobalSslContextParameters(
                boolean useGlobalSslContextParameters) {
            doSetProperty("useGlobalSslContextParameters", useGlobalSslContextParameters);
            return this;
        }
    }

    class ElytronComponentBuilderImpl
            extends
                AbstractComponentBuilder<ElytronComponent>
            implements
                ElytronComponentBuilder {
        @Override
        protected ElytronComponent buildConcreteComponent() {
            return new ElytronComponent();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "bridgeErrorHandler": ((ElytronComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "muteException": ((ElytronComponent) component).setMuteException((boolean) value); return true;
            case "lazyStartProducer": ((ElytronComponent) component).setLazyStartProducer((boolean) value); return true;
            case "basicPropertyBinding": ((ElytronComponent) component).setBasicPropertyBinding((boolean) value); return true;
            case "elytronProvider": ((ElytronComponent) component).setElytronProvider((org.wildfly.security.WildFlyElytronBaseProvider) value); return true;
            case "hostOptions": ((ElytronComponent) component).setHostOptions((org.apache.camel.component.undertow.UndertowHostOptions) value); return true;
            case "mechanismName": ((ElytronComponent) component).setMechanismName((java.lang.String) value); return true;
            case "securityDomainBuilder": ((ElytronComponent) component).setSecurityDomainBuilder((org.wildfly.security.auth.server.SecurityDomain.Builder) value); return true;
            case "undertowHttpBinding": ((ElytronComponent) component).setUndertowHttpBinding((org.apache.camel.component.undertow.UndertowHttpBinding) value); return true;
            case "sslContextParameters": ((ElytronComponent) component).setSslContextParameters((org.apache.camel.support.jsse.SSLContextParameters) value); return true;
            case "useGlobalSslContextParameters": ((ElytronComponent) component).setUseGlobalSslContextParameters((boolean) value); return true;
            default: return false;
            }
        }
    }
}