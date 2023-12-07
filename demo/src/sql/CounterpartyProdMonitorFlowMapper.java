package sql;

import java.util.List;
import model.CounterpartyProdMonitorFlow;
import model.CounterpartyProdMonitorFlowExample;

public interface CounterpartyProdMonitorFlowMapper {
    int deleteByPrimaryKey(String id);

    int insert(CounterpartyProdMonitorFlow record);

    int insertSelective(CounterpartyProdMonitorFlow record);

    List<CounterpartyProdMonitorFlow> selectByExample(CounterpartyProdMonitorFlowExample example);

    CounterpartyProdMonitorFlow selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(CounterpartyProdMonitorFlow record);

    int updateByPrimaryKey(CounterpartyProdMonitorFlow record);
}