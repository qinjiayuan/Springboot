package sql;

import java.util.List;
import model.CounterpartyProdMonitorFlow;
import model.CounterpartyProdMonitorFlowExample;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CounterpartyProdMonitorFlowMapper {
    int deleteByPrimaryKey(String clientId);

    int insert(CounterpartyProdMonitorFlow record);

    int insertSelective(CounterpartyProdMonitorFlow record);

    List<CounterpartyProdMonitorFlow> selectByExample(CounterpartyProdMonitorFlowExample example);

    CounterpartyProdMonitorFlow selectByPrimaryKey(String corporateName);

    int updateByPrimaryKeySelective(CounterpartyProdMonitorFlow record);

    int updateByPrimaryKey(CounterpartyProdMonitorFlow record);

    List<CounterpartyProdMonitorFlow> selectFlow(String corporateName);
}