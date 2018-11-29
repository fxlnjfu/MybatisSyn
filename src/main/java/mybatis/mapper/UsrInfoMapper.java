package mybatis.mapper;

import java.util.List;
import mybatis.model.UsrInfo;
import mybatis.model.UsrInfoExample;
import org.apache.ibatis.annotations.Param;

public interface UsrInfoMapper {
    long countByExample(UsrInfoExample example);

    int deleteByExample(UsrInfoExample example);

    int insert(UsrInfo record);

    int insertSelective(UsrInfo record);

    List<UsrInfo> selectByExample(UsrInfoExample example);

    int updateByExampleSelective(@Param("record") UsrInfo record, @Param("example") UsrInfoExample example);

    int updateByExample(@Param("record") UsrInfo record, @Param("example") UsrInfoExample example);
}