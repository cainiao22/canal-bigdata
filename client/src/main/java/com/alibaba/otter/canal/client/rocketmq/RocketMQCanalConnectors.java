package com.alibaba.otter.canal.client.rocketmq;

/**
 * RocketMQ connector provider.
 */
public class RocketMQCanalConnectors {

    /**
     * Create RocketMQ connector
     *
     * @param nameServers name servers for RocketMQ
     * @param topic
     * @param groupId
     * @return {@link RocketMQCanalConnector}
     */
    public static RocketMQCanalConnector newRocketMQConnector(String nameServers, String topic, String groupId) {
        return new RocketMQCanalConnector(nameServers, topic, groupId, false);
    }

    public static RocketMQCanalConnector newRocketMQConnector(String nameServers, String topic, String groupId,
                                                              boolean flatMessage) {
        return new RocketMQCanalConnector(nameServers, topic, groupId, flatMessage);
    }
}
