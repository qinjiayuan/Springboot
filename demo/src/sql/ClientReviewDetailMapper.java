package sql;

import java.util.List;
import model.ClientReviewDetail;
import model.ClientReviewDetailExample;
import model.ClientReviewDetailWithBLOBs;

public interface ClientReviewDetailMapper {
    int deleteByPrimaryKey(String id);

    int insert(ClientReviewDetailWithBLOBs record);

    int insertSelective(ClientReviewDetailWithBLOBs record);

    List<ClientReviewDetailWithBLOBs> selectByExampleWithBLOBs(ClientReviewDetailExample example);

    List<ClientReviewDetail> selectByExample(ClientReviewDetailExample example);

    ClientReviewDetailWithBLOBs selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ClientReviewDetailWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ClientReviewDetailWithBLOBs record);

    int updateByPrimaryKey(ClientReviewDetail record);
}