package sql;

import java.util.List;
import model.CtptyInfoUpdateRecord;
import model.CtptyInfoUpdateRecordExample;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CtptyInfoUpdateRecordMapper {
    int deleteByPrimaryKey(String id);

    int insert(CtptyInfoUpdateRecord record);

    int insertSelective(CtptyInfoUpdateRecord record);

    List<CtptyInfoUpdateRecord> selectByExample(CtptyInfoUpdateRecordExample example);

    List<CtptyInfoUpdateRecord> selectByPrimaryKey();

    int updateByPrimaryKeySelective(CtptyInfoUpdateRecord record);

    int updateByPrimaryKey(CtptyInfoUpdateRecord record);
}