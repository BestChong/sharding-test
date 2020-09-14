package com.sharding.demo.sharding;

import lombok.extern.slf4j.Slf4j;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;
import org.springframework.util.StringUtils;

import java.util.Collection;

@Slf4j
public class PayOrderPreciseShardingAlgorithm implements PreciseShardingAlgorithm<String> {

    @Override
    public String doSharding(Collection<String> collection, PreciseShardingValue<String> preciseShardingValue) {
        String orderNo = null == preciseShardingValue.getValue() ? null : preciseShardingValue.getValue();
        if (StringUtils.isEmpty(orderNo)) {
            return "无法命中分表";
        }
        String tag = orderNo.substring(orderNo.length() - 1);
        for (String table : collection) {
            if (table.endsWith(tag)) {
                return table;
            }
        }
        return "无法命中分表";
    }
}
