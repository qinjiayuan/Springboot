package sql;

import java.util.List;
import model.CrtExpiredRecord;
import model.CrtExpiredRecordExample;

public interface CrtExpiredRecordMapper {
    int deleteByPrimaryKey(String id);

    int insert(CrtExpiredRecord record);

    int insertSelective(CrtExpiredRecord record);

    List<CrtExpiredRecord> selectByExample(CrtExpiredRecordExample example);

    CrtExpiredRecord selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(CrtExpiredRecord record);

    int updateByPrimaryKey(CrtExpiredRecord record);
}