package sql;

import java.util.List;
import model.ClientReviewFileRecord;
import model.ClientReviewFileRecordExample;

public interface ClientReviewFileRecordMapper {
    int deleteByPrimaryKey(String s3FileId);

    int insert(ClientReviewFileRecord record);

    int insertSelective(ClientReviewFileRecord record);

    List<ClientReviewFileRecord> selectByExample(ClientReviewFileRecordExample example);

    ClientReviewFileRecord selectByPrimaryKey(String s3FileId);

    int updateByPrimaryKeySelective(ClientReviewFileRecord record);

    int updateByPrimaryKey(ClientReviewFileRecord record);
}