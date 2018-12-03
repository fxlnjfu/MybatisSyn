package mybatis.mapper;

import java.util.List;
import mybatis.model.RecvAcctInfo;
import mybatis.model.RecvAcctInfoExample;
import org.apache.ibatis.annotations.Param;

public interface RecvAcctInfoMapper {
    long countByExample(RecvAcctInfoExample example);

    int deleteByExample(RecvAcctInfoExample example);

    int insert(RecvAcctInfo record);

    int insertSelective(RecvAcctInfo record);

    List<RecvAcctInfo> selectByExample(RecvAcctInfoExample example);

    int updateByExampleSelective(@Param("record") RecvAcctInfo record, @Param("example") RecvAcctInfoExample example);

    int updateByExample(@Param("record") RecvAcctInfo record, @Param("example") RecvAcctInfoExample example);
}