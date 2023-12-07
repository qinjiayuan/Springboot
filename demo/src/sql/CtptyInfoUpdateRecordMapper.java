package sql;

import java.util.List;
import model.CtptyInfoUpdateRecord;
import model.CtptyInfoUpdateRecordExample;

public interface CtptyInfoUpdateRecordMapper {
    int deleteByPrimaryKey(String id);

    int insert(CtptyInfoUpdateRecord record);

    int insertSelective(CtptyInfoUpdateRecord record);

    List<CtptyInfoUpdateRecord> selectByExample(CtptyInfoUpdateRecordExample example);

    CtptyInfoUpdateRecord selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(CtptyInfoUpdateRecord record);

    int updateByPrimaryKey(CtptyInfoUpdateRecord record);
}