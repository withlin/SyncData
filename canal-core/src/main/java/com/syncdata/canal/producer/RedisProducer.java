package com.syncdata.canal.producer;

import com.syncdata.canal.packet.Packet;

public class RedisProducer<T> extends AbstractProducer<T> {
    @Override
    public void push(Packet<T> packet) {

    }
}
