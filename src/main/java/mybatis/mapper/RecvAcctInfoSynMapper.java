package mybatis.mapper;

import java.util.List;
import mybatis.model.RecvAcctInfoSyn;
import mybatis.model.RecvAcctInfoSynExample;
import org.apache.ibatis.annotations.Param;

public interface RecvAcctInfoSynMapper {
    long countByExample(RecvAcctInfoSynExample example);

    int deleteByExample(RecvAcctInfoSynExample example);

    int insert(RecvAcctInfoSyn record);

    int insertSelective(RecvAcctInfoSyn record);

    List<RecvAcctInfoSyn> selectByExample(RecvAcctInfoSynExample example);

    int updateByExampleSelective(@Param("record") RecvAcctInfoSyn record, @Param("example") RecvAcctInfoSynExample example);

    int updateByExample(@Param("record") RecvAcctInfoSyn record, @Param("example") RecvAcctInfoSynExample example);
}