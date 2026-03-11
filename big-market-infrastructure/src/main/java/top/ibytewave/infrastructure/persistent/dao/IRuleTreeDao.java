package top.ibytewave.infrastructure.persistent.dao;

import org.apache.ibatis.annotations.Mapper;
import top.ibytewave.infrastructure.persistent.po.RuleTree;

/**
 * @author ChanYanny
 * @description 规则树表DAO
 * @date 2026/03/11 16:31
 **/
@Mapper
public interface IRuleTreeDao {

    RuleTree queryRuleTreeByTreeId(String treeId);

}


