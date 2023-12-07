package sql;

import java.util.List;
import model.CounterpartyOrg;
import model.CounterpartyOrgExample;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CounterpartyOrgMapper {
    int deleteByPrimaryKey(String id);

    int insert(CounterpartyOrg record);

    int insertSelective(CounterpartyOrg record);

    List<CounterpartyOrg> selectByExample(CounterpartyOrgExample example);

    CounterpartyOrg selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(CounterpartyOrg record);

    int updateByPrimaryKey(CounterpartyOrg record);
}