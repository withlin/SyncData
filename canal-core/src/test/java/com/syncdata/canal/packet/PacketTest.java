package com.syncdata.canal.packet;

import com.canal.syncdata.canal.SyncdataApplication;
import com.syncdata.canal.model.Packet;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration
@SpringBootTest(classes = SyncdataApplication.class)
public class PacketTest {
    @Test
    public  void packetBuilder(){
        Packet<String> packet= Packet.<String>builder()
                .action("action")
                .after("after")
                .before("before")
                .id("id")
                .queue("queue")
                .schema("schema")
                .table("table")
                .timestamp(Long.parseLong("1234565656"))
                .version("version")
                .build();
        Assert.assertEquals("queue",packet.getQueue());
        Assert.assertEquals("action",packet.getAction());
        Assert.assertEquals("after",packet.getAfter());
        Assert.assertEquals("before",packet.getBefore());
        Assert.assertEquals("id",packet.getId());
        Assert.assertEquals("schema",packet.getSchema());
        Assert.assertEquals("table",packet.getTable());
        Assert.assertEquals("1234565656",packet.getTimestamp().toString());
        Assert.assertEquals("version",packet.getVersion());

    }

}