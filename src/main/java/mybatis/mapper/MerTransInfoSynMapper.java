package mybatis.mapper;

import java.util.List;
import mybatis.model.MerTransInfoSyn;
import mybatis.model.MerTransInfoSynExample;
import org.apache.ibatis.annotations.Param;

public interface MerTransInfoSynMapper {
    long countByExample(MerTransInfoSynExample example);

    int deleteByExample(MerTransInfoSynExample example);

    int insert(MerTransInfoSyn record);

    int insertSelective(MerTransInfoSyn record);

    List<MerTransInfoSyn> selectByExample(MerTransInfoSynExample example);

    int updateByExampleSelective(@Param("record") MerTransInfoSyn record, @Param("example") MerTransInfoSynExample example);

    int updateByExample(@Param("record") MerTransInfoSyn record, @Param("example") MerTransInfoSynExample example);
}