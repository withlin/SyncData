package com.syncdata.canal.model;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Builder
public class Packet<T> {
    private String id;
    private String queue;
    private String schema;
    private String table;
    private String action;
    private T before;
    private T after;
    private String version;
    private Long timestamp;
}
