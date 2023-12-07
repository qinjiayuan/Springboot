package sql;

import java.util.List;
import model.Auser;
import model.AuserExample;

public interface AuserMapper {
    int deleteByPrimaryKey(String userid);

    int insert(Auser record);

    int insertSelective(Auser record);

    List<Auser> selectByExample(AuserExample example);

    Auser selectByPrimaryKey(String userid);

    int updateByPrimaryKeySelective(Auser record);

    int updateByPrimaryKey(Auser record);
}