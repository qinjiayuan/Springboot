package sql;

import java.util.List;
import model.ClientReviewRecord;
import model.ClientReviewRecordExample;

public interface ClientReviewRecordMapper {
    int deleteByPrimaryKey(String id);

    int insert(ClientReviewRecord record);

    int insertSelective(ClientReviewRecord record);

    List<ClientReviewRecord> selectByExample(ClientReviewRecordExample example);

    ClientReviewRecord selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ClientReviewRecord record);

    int updateByPrimaryKey(ClientReviewRecord record);

    List<ClientReviewRecord> selectflownum(String corporateName);

    int deleteflow(String docid);
}