package top.ibytewave.domain.strategy.service.rule.chain;

/**
 * @author ChanYanny
 * @description 责任链装配
 * @date 2026/02/25 20:32
 **/
public interface ILogicChainArmory {

    ILogicChain next();

    ILogicChain appendNext(ILogicChain next);

}


