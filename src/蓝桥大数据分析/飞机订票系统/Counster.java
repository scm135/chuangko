package 蓝桥大数据分析.飞机订票系统;

//import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import java.util.Date;

public class Counster {

    private String id;
    private String name;
    private String phone;
    private String carid;
    private String counsterType;
    private Date birthDate;
    private Order order;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public String getCounsterType() {
        return counsterType;
    }

    public void setCounsterType(String counsterType) {
        this.counsterType = counsterType;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCarid() {
        return carid;
    }

    public void setCarid(String carid) {
        this.carid = carid;
    }

}
