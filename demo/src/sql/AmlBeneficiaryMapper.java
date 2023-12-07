package sql;

import model.AmlBeneficiary;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AmlBeneficiaryMapper {
    int deleteByPrimaryKey(String id);

    int insert(AmlBeneficiary record);

    int insertSelective(AmlBeneficiary record);

    AmlBeneficiary selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(AmlBeneficiary record);

    int updateByPrimaryKey(AmlBeneficiary record);
}