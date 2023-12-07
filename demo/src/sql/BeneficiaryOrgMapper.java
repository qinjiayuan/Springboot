package sql;

import java.util.List;
import model.BeneficiaryOrg;
import model.BeneficiaryOrgExample;

public interface BeneficiaryOrgMapper {
    int deleteByPrimaryKey(String id);

    int insert(BeneficiaryOrg record);

    int insertSelective(BeneficiaryOrg record);

    List<BeneficiaryOrg> selectByExample(BeneficiaryOrgExample example);

    BeneficiaryOrg selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BeneficiaryOrg record);

    int updateByPrimaryKey(BeneficiaryOrg record);
}