package sql;

import model.AmlBeneficiary;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AmlBeneficiaryMapper {
    int deleteByPrimaryKey(String id);

    int insert(AmlBeneficiary record);

    int insertSelective(AmlBeneficiary record);

    AmlBeneficiary selectByPrimaryKey(String id);

    List<AmlBeneficiary> selectAll(String counterpartyId);

    List<AmlBeneficiary> selectByclientName(String clientName);

    int updateByPrimaryKeySelective(AmlBeneficiary record);

    int updateByPrimaryKey(AmlBeneficiary record);
}