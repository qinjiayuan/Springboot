package sql;

import model.AmlBeneficiary;

public interface AmlBeneficiaryMapper {
    int deleteByPrimaryKey(String id);

    int insert(AmlBeneficiary record);

    int insertSelective(AmlBeneficiary record);

    AmlBeneficiary selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(AmlBeneficiary record);

    int updateByPrimaryKey(AmlBeneficiary record);
}