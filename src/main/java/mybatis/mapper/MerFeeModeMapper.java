package mybatis.mapper;

import java.util.List;
import mybatis.model.MerFeeMode;
import mybatis.model.MerFeeModeExample;
import org.apache.ibatis.annotations.Param;

public interface MerFeeModeMapper {
    long countByExample(MerFeeModeExample example);

    int deleteByExample(MerFeeModeExample example);

    int insert(MerFeeMode record);

    int insertSelective(MerFeeMode record);

    List<MerFeeMode> selectByExample(MerFeeModeExample example);

    int updateByExampleSelective(@Param("record") MerFeeMode record, @Param("example") MerFeeModeExample example);

    int updateByExample(@Param("record") MerFeeMode record, @Param("example") MerFeeModeExample example);
}