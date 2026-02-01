package top.ibytewave.infrastructure.persistent.po;

import lombok.Data;

import java.util.Date;

/**
 * @author ChanYanny
 * @date 2026/01/30 13:04
 * @description 抽奖策略总表
 **/
@Data
public class Strategy {

    /** 自增ID */
    private Long id;
    /** 抽奖策略ID */
    private Long strategyId;
    /** 抽奖策略描述 */
    private String strategyDesc;
    /** 抽奖规则模型 rule_weight,rule_blacklist */
    private String ruleModels;
    /** 创建时间 */
    private Date createTime;
    /** 更新时间 */
    private Date updateTime;

}

