package mybatis.mapper;

import java.util.List;
import mybatis.model.UsrInfoSyn;
import mybatis.model.UsrInfoSynExample;
import org.apache.ibatis.annotations.Param;

public interface UsrInfoSynMapper {
    long countByExample(UsrInfoSynExample example);

    int deleteByExample(UsrInfoSynExample example);

    int insert(UsrInfoSyn record);

    int insertSelective(UsrInfoSyn record);

    List<UsrInfoSyn> selectByExample(UsrInfoSynExample example);

    int updateByExampleSelective(@Param("record") UsrInfoSyn record, @Param("example") UsrInfoSynExample example);

    int updateByExample(@Param("record") UsrInfoSyn record, @Param("example") UsrInfoSynExample example);
}