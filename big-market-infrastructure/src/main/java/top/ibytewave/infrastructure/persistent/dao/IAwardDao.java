package top.ibytewave.infrastructure.persistent.dao;

import org.apache.ibatis.annotations.Mapper;
import top.ibytewave.infrastructure.persistent.po.Award;

import java.util.List;

/**
 * @author ChanYanny
 * @date 2026/1/30 13:45
 */
@Mapper
public interface IAwardDao {

    List<Award> queryAwardList();

}
