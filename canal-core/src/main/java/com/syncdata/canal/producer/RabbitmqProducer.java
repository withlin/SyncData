package com.syncdata.canal.producer;

import com.syncdata.canal.model.Packet;

public class RabbitmqProducer<T> extends  AbstractProducer<T>{
    @Override
    public void push(Packet<T> packet) {

    }
}
