package sql;

import java.util.List;
import model.CrtExpiredRecordUnion;
import model.CrtExpiredRecordUnionExample;

public interface CrtExpiredRecordUnionMapper {
    int deleteByPrimaryKey(String id);

    int insert(CrtExpiredRecordUnion record);

    int insertSelective(CrtExpiredRecordUnion record);

    List<CrtExpiredRecordUnion> selectByExample(CrtExpiredRecordUnionExample example);

    CrtExpiredRecordUnion selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(CrtExpiredRecordUnion record);

    int updateByPrimaryKey(CrtExpiredRecordUnion record);
}