package mybatis.mapper;

import java.util.List;
import mybatis.model.MerFeeModeSyn;
import mybatis.model.MerFeeModeSynExample;
import org.apache.ibatis.annotations.Param;

public interface MerFeeModeSynMapper {
    long countByExample(MerFeeModeSynExample example);

    int deleteByExample(MerFeeModeSynExample example);

    int insert(MerFeeModeSyn record);

    int insertSelective(MerFeeModeSyn record);

    List<MerFeeModeSyn> selectByExample(MerFeeModeSynExample example);

    int updateByExampleSelective(@Param("record") MerFeeModeSyn record, @Param("example") MerFeeModeSynExample example);

    int updateByExample(@Param("record") MerFeeModeSyn record, @Param("example") MerFeeModeSynExample example);
}