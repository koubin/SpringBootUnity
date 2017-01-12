package info.xiaomo.aries.model;

import info.xiaomo.aries.base.BaseModel;
import io.swagger.annotations.ApiModel;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author 小莫 (https://xiaomo.info) (https://github.com/syoubaku)
 * @version : 2017/1/11 16:40
 */
@Entity
@Table(name = "user")
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "用户实体类")
public class UserModel extends BaseModel {

    private String school;

    private String password;

    private String salt;

}