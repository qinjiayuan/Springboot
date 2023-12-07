package sql;

import java.util.List;
import model.AmlCounterparty;
import model.AmlCounterpartyExample;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AmlCounterpartyMapper {
    int deleteByPrimaryKey(String id);

    int insert(AmlCounterparty record);

    int insertSelective(AmlCounterparty record);

    List<AmlCounterparty> selectByExample(AmlCounterpartyExample example);

    AmlCounterparty selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(AmlCounterparty record);

    int updateByPrimaryKey(AmlCounterparty record);
}