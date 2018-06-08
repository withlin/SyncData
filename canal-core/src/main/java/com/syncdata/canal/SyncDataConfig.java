package com.syncdata.canal;

import com.syncdata.canal.model.Sinker;

public class SyncDataConfig {

    public String rabbitmqUser;
    public String rabbitmqPass;
    public String rabbitmqHost;
    public int rabbitmqPort;
    public String rabbitmqVirtualHost;
    public String rabbitmqExchange;
    public String rabbitmqExchangeType;
    public boolean rabbitMqExchangeDurable;
    public boolean rabbitMqExchangeAutoDelete;
    public String rabbitmqRoutingKeyTemplate;
    public boolean rabbitmqMessagePersistent;
    public boolean rabbitmqDeclareExchange;

    public SyncDataConfig(Sinker sinker){
        this.rabbitmqUser=sinker.getRabbitmqUser();
        this.rabbitmqPass=sinker.getRabbitmqPass();
        this.rabbitmqHost=sinker.getRabbitmqHost();
        this.rabbitmqPort=sinker.getRabbitmqPort();
        this.rabbitmqVirtualHost=sinker.getRabbitmqVirtualHost();
        this.rabbitmqExchange=sinker.getRabbitmqExchange();
        this.rabbitmqExchangeType=sinker.getRabbitmqExchangeType();
        this.rabbitMqExchangeDurable=sinker.isRabbitMqExchangeDurable();
        this.rabbitMqExchangeAutoDelete=sinker.isRabbitMqExchangeAutoDelete();
        this.rabbitmqRoutingKeyTemplate=sinker.getRabbitmqRoutingKeyTemplate();
        this.rabbitmqMessagePersistent=sinker.isRabbitmqMessagePersistent();
        this.rabbitmqDeclareExchange=sinker.isRabbitmqDeclareExchange();   
    }
}
