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


    //--------------------------------------
    //如果安装了lambook插件，以下代码可以删掉
    public CustomerTable() {
    }

    public CustomerTable(Integer id, String name, String sex, String tell, String addr) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.tell = tell;
        this.addr = addr;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTell() {
        return tell;
    }

    public void setTell(String tell) {
        this.tell = tell;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "CustomerTable{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", tell='" + tell + '\'' +
                ", addr='" + addr + '\'' +
                '}';
    }
}