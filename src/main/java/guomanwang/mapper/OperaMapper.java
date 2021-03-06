package guomanwang.mapper;

import guomanwang.domain.Opera;
import guomanwang.domain.OperaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
@Repository("OperaMapper")
public interface OperaMapper {
	
	//自定义条件计数
    int countByExample(OperaExample example);
    //自定义条件删除
    int deleteByExample(OperaExample example);
    //根据主键删除
    int deleteByPrimaryKey(Integer id);
    //插入文件 所有值都要有，除了time自动生成
    int insert(Opera record);
    //选择性插入，根据传入的值进行插入,传多少值，插入多少
    int insertSelective(Opera record);
    //根据自定义条件查询
    List<Opera> selectByExample(OperaExample example);
    //通过主键查询即id
    Opera selectByPrimaryKey(Integer id);
    //根据自定义条件选择性更新
    int updateByExampleSelective(@Param("record") Opera record, @Param("example") OperaExample example);
    //根据自定义条件更新所有
    int updateByExample(@Param("record") Opera record, @Param("example") OperaExample example);
    //通过主键选择性更新 即传入多少值就更新多少值，并且where id =#{id}
    int updateByPrimaryKeySelective(Opera record);
    //通过主键更新,所有的六项都要更新
    int updateByPrimaryKey(Opera record);
}