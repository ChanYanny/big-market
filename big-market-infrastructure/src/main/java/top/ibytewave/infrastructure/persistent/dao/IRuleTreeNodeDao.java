package top.ibytewave.infrastructure.persistent.dao;

import org.apache.ibatis.annotations.Mapper;
import top.ibytewave.infrastructure.persistent.po.RuleTreeNode;

import java.util.List;

/**
 * @author ChanYanny
 * @description 规则树节点表DAO
 * @date 2026/03/11 16:31
 **/
@Mapper
public interface IRuleTreeNodeDao {

    List<RuleTreeNode> queryRuleTreeNodeListByTreeId(String treeId);

}


