package com.syncdata.canal.producer;

import com.syncdata.canal.model.Packet;

public abstract class AbstractProducer<T> {

    public abstract void  push(Packet<T> packet);
}

