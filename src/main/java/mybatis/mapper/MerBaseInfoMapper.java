package mybatis.mapper;

import java.util.List;
import mybatis.model.MerBaseInfo;
import mybatis.model.MerBaseInfoExample;
import org.apache.ibatis.annotations.Param;

public interface MerBaseInfoMapper {
    long countByExample(MerBaseInfoExample example);

    int deleteByExample(MerBaseInfoExample example);

    int insert(MerBaseInfo record);

    int insertSelective(MerBaseInfo record);

    List<MerBaseInfo> selectByExample(MerBaseInfoExample example);

    int updateByExampleSelective(@Param("record") MerBaseInfo record, @Param("example") MerBaseInfoExample example);

    int updateByExample(@Param("record") MerBaseInfo record, @Param("example") MerBaseInfoExample example);
}