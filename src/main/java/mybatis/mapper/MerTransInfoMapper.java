package mybatis.mapper;

import java.util.List;
import mybatis.model.MerTransInfo;
import mybatis.model.MerTransInfoExample;
import org.apache.ibatis.annotations.Param;

public interface MerTransInfoMapper {
    long countByExample(MerTransInfoExample example);

    int deleteByExample(MerTransInfoExample example);

    int insert(MerTransInfo record);

    int insertSelective(MerTransInfo record);

    List<MerTransInfo> selectByExample(MerTransInfoExample example);

    int updateByExampleSelective(@Param("record") MerTransInfo record, @Param("example") MerTransInfoExample example);

    int updateByExample(@Param("record") MerTransInfo record, @Param("example") MerTransInfoExample example);
}