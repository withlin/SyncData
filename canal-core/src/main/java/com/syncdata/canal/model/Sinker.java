package com.syncdata.canal.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class Sinker {
    private String rabbitmqUser;
    private String rabbitmqPass;
    private String rabbitmqHost;
    private int rabbitmqPort;
    private String rabbitmqVirtualHost;
    private String rabbitmqExchange;
    private String rabbitmqExchangeType;
    private boolean rabbitMqExchangeDurable;
    private boolean rabbitMqExchangeAutoDelete;
    private String rabbitmqRoutingKeyTemplate;
    private boolean rabbitmqMessagePersistent;
    private boolean rabbitmqDeclareExchange;
}