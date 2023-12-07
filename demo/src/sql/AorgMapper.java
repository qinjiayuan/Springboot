package sql;

import java.util.List;
import model.Aorg;
import model.AorgExample;

public interface AorgMapper {
    int deleteByPrimaryKey(String orgid);

    int insert(Aorg record);

    int insertSelective(Aorg record);

    List<Aorg> selectByExample(AorgExample example);

    Aorg selectByPrimaryKey(String orgid);

    int updateByPrimaryKeySelective(Aorg record);

    int updateByPrimaryKey(Aorg record);
}