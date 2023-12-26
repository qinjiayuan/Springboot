package sql;

import java.util.List;
import model.CrtExpiredRecord;
import model.CrtExpiredRecordExample;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CrtExpiredRecordMapper {
    int deleteByPrimaryKey(String recordId);

    int deleteByunisocialcode(String unifiedsocialCode);

    int insert(CrtExpiredRecord record);

    int insertSelective(CrtExpiredRecord record);

    List<CrtExpiredRecord> selectByExample(CrtExpiredRecordExample example);

    CrtExpiredRecord selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(CrtExpiredRecord record);

    List<CrtExpiredRecord> selectProcessingflow(CrtExpiredRecord record);



    int updateByPrimaryKey(CrtExpiredRecord record);
}