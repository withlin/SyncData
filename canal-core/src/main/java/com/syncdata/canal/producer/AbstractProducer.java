package com.syncdata.canal.producer;

import com.syncdata.canal.packet.Packet;

public abstract class AbstractProducer<T> {

    public abstract void  push(Packet<T> packet);
}

