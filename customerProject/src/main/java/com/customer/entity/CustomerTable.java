package com.customer.entity;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * (CustomerTable)表实体类
 *
 * @author makejava
 * @since 2019-11-05 19:38:03
 */
@Data
@NoArgsConstructor
@SuppressWarnings("serial")
public class CustomerTable extends Model<CustomerTable> {

    @TableId(type = IdType.AUTO)    
        
    private Integer id;

        
        
    private String name;

        
        
    private String sex;

        
        
    private String tell;

        
        
    private String addr;
}