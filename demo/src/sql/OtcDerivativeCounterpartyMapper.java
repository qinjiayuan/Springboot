package sql;

import java.util.List;
import model.OtcDerivativeCounterparty;
import model.OtcDerivativeCounterpartyotExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OtcDerivativeCounterpartyMapper {
    int deleteByPrimaryKey(String id);

    int insert(OtcDerivativeCounterparty record);

    int insertSelective(OtcDerivativeCounterparty record);

    int updateByCorporatename(OtcDerivativeCounterparty record);

    OtcDerivativeCounterparty selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(OtcDerivativeCounterparty record);

    int updateByPrimaryKey(OtcDerivativeCounterparty record);

    List<OtcDerivativeCounterparty> selectAll(String corporateName);

    List<OtcDerivativeCounterparty> selectClientbyid(String clientid);




}