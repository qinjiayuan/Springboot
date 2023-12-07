package sql;

import java.util.List;
import model.ClientReviewCounterparty;
import model.ClientReviewCounterpartyExample;

public interface ClientReviewCounterpartyMapper {
    int deleteByPrimaryKey(String id);

    int insert(ClientReviewCounterparty record);

    int insertSelective(ClientReviewCounterparty record);

    List<ClientReviewCounterparty> selectByExample(ClientReviewCounterpartyExample example);

    ClientReviewCounterparty selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ClientReviewCounterparty record);

    int updateByPrimaryKey(ClientReviewCounterparty record);
}