package sql;

import java.util.List;
import model.CounterpartyBenefitOverList;
import model.CounterpartyBenefitOverListExample;
import model.CounterpartyBenefitOverListKey;

public interface CounterpartyBenefitOverListMapper {
    int deleteByPrimaryKey(CounterpartyBenefitOverListKey key);

    int insert(CounterpartyBenefitOverList record);

    int insertSelective(CounterpartyBenefitOverList record);

    List<CounterpartyBenefitOverList> selectByExample(CounterpartyBenefitOverListExample example);

    CounterpartyBenefitOverList selectByPrimaryKey(CounterpartyBenefitOverListKey key);

    int updateByPrimaryKeySelective(CounterpartyBenefitOverList record);

    int updateByPrimaryKey(CounterpartyBenefitOverList record);

    List<CounterpartyBenefitOverList> selectByClientId(String clientId);


}