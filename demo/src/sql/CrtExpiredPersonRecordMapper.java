package sql;

import java.util.List;
import model.CrtExpiredPersonRecord;
import model.CrtExpiredPersonRecordExample;

public interface CrtExpiredPersonRecordMapper {
    int deleteByPrimaryKey(String id);

    int insert(CrtExpiredPersonRecord record);

    int insertSelective(CrtExpiredPersonRecord record);

    List<CrtExpiredPersonRecord> selectByExample(CrtExpiredPersonRecordExample example);

    CrtExpiredPersonRecord selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(CrtExpiredPersonRecord record);

    int updateByPrimaryKey(CrtExpiredPersonRecord record);
}