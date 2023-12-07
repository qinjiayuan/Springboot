package sql;

import java.util.List;
import model.ProcessExpiredRemind;
import model.ProcessExpiredRemindExample;

public interface ProcessExpiredRemindMapper {
    int deleteByPrimaryKey(String id);

    int insert(ProcessExpiredRemind record);

    int insertSelective(ProcessExpiredRemind record);

    List<ProcessExpiredRemind> selectByExample(ProcessExpiredRemindExample example);

    ProcessExpiredRemind selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ProcessExpiredRemind record);

    int updateByPrimaryKey(ProcessExpiredRemind record);
}