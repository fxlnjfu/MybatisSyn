package mybatis.mapper;

import java.util.List;
import mybatis.model.FieldSynInfo;
import mybatis.model.FieldSynInfoExample;
import mybatis.model.FieldSynInfoKey;
import org.apache.ibatis.annotations.Param;

public interface FieldSynInfoMapper {
    long countByExample(FieldSynInfoExample example);

    int deleteByExample(FieldSynInfoExample example);

    int deleteByPrimaryKey(FieldSynInfoKey key);

    int insert(FieldSynInfo record);

    int insertSelective(FieldSynInfo record);

    List<FieldSynInfo> selectByExample(FieldSynInfoExample example);

    FieldSynInfo selectByPrimaryKey(FieldSynInfoKey key);

    int updateByExampleSelective(@Param("record") FieldSynInfo record, @Param("example") FieldSynInfoExample example);

    int updateByExample(@Param("record") FieldSynInfo record, @Param("example") FieldSynInfoExample example);

    int updateByPrimaryKeySelective(FieldSynInfo record);

    int updateByPrimaryKey(FieldSynInfo record);
}