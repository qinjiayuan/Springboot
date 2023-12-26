package sql;

import java.util.List;
import model.CrtExpiredPersonRecord;
import model.CrtExpiredPersonRecordExample;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CrtExpiredPersonRecordMapper {

    List<CrtExpiredPersonRecord> selectByIdNo(String idNo);
}