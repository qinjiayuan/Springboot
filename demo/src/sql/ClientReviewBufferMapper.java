package sql;

import java.util.List;
import model.ClientReviewBuffer;
import model.ClientReviewBufferExample;

public interface ClientReviewBufferMapper {
    int deleteByPrimaryKey(String id);

    int insert(ClientReviewBuffer record);

    int insertSelective(ClientReviewBuffer record);

    List<ClientReviewBuffer> selectByExample(ClientReviewBufferExample example);

    ClientReviewBuffer selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ClientReviewBuffer record);

    int updateByPrimaryKey(ClientReviewBuffer record);
}