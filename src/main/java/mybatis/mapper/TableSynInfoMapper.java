package mybatis.mapper;

import java.util.List;
import mybatis.model.TableSynInfo;
import mybatis.model.TableSynInfoExample;
import org.apache.ibatis.annotations.Param;

public interface TableSynInfoMapper {
    long countByExample(TableSynInfoExample example);

    int deleteByExample(TableSynInfoExample example);

    int deleteByPrimaryKey(String tableName);

    int insert(TableSynInfo record);

    int insertSelective(TableSynInfo record);

    List<TableSynInfo> selectByExample(TableSynInfoExample example);

    TableSynInfo selectByPrimaryKey(String tableName);

    int updateByExampleSelective(@Param("record") TableSynInfo record, @Param("example") TableSynInfoExample example);

    int updateByExample(@Param("record") TableSynInfo record, @Param("example") TableSynInfoExample example);

    int updateByPrimaryKeySelective(TableSynInfo record);

    int updateByPrimaryKey(TableSynInfo record);
}