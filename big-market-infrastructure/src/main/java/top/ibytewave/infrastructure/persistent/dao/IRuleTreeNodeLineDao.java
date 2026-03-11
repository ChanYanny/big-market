package top.ibytewave.infrastructure.persistent.dao;

import org.apache.ibatis.annotations.Mapper;
import top.ibytewave.infrastructure.persistent.po.RuleTreeNodeLine;

import java.util.List;

/**
 * @author ChanYanny
 * @description 规则树节点连线表DAO
 * @date 2026/03/11 16:32
 **/
@Mapper
public interface IRuleTreeNodeLineDao {

    List<RuleTreeNodeLine> queryRuleTreeNodeLineListByTreeId(String treeId);

}


