package cn.ld.peach.mall.auth.mapper;

import cn.ld.peach.mall.auth.domain.AuthRolePriorityRelationship;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 角色权限关系Dao
 *
 * @author lidong
 * @date 2021/3/27
 */
@Mapper
public interface RolePriorityRelationshipMapper extends BaseMapper<AuthRolePriorityRelationship> {
}
