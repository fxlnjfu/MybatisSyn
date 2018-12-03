package mybatis.mapper;

import java.util.List;
import mybatis.model.MerBaseInfoSyn;
import mybatis.model.MerBaseInfoSynExample;
import org.apache.ibatis.annotations.Param;

public interface MerBaseInfoSynMapper {
    long countByExample(MerBaseInfoSynExample example);

    int deleteByExample(MerBaseInfoSynExample example);

    int insert(MerBaseInfoSyn record);

    int insertSelective(MerBaseInfoSyn record);

    List<MerBaseInfoSyn> selectByExample(MerBaseInfoSynExample example);

    int updateByExampleSelective(@Param("record") MerBaseInfoSyn record, @Param("example") MerBaseInfoSynExample example);

    int updateByExample(@Param("record") MerBaseInfoSyn record, @Param("example") MerBaseInfoSynExample example);
}