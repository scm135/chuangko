package 蓝桥大数据分析.飞机订票系统;

import java.util.Set;

public class Order {
    private String id;
    private float jpjg;//机票价格
    private float airportTax;//机场税
    private float ryf;//燃油费
    private float hkzhx;//航空综合险
    private float jptgx;//机票退改险
    private float yhq;//优惠券
    private float hszj;//含税总价
    private Set<Counster> counsterSet;
    private Flight flight;//订单里面有航班信息
    
    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }



    public float getRyf() {
        return ryf;
    }

    public void setRyf(float ryf) {
        this.ryf = ryf;
    }

    public float getHkzhx() {
        return hkzhx;
    }

    public void setHkzhx(float hkzhx) {
        this.hkzhx = hkzhx;
    }

    public float getJptgx() {
        return jptgx;
    }

    public void setJptgx(float jptgx) {
        this.jptgx = jptgx;
    }

    public float getYhq() {
        return yhq;
    }

    public void setYhq(float yhq) {
        this.yhq = yhq;
    }

    public float getHszj() {
        return hszj;
    }

    public void setHszj(float hszj) {
        this.hszj = hszj;
    }

    public Set<Counster> getCounsterSet() {
        return counsterSet;
    }

    public void setCounsterSet(Set<Counster> counsterSet) {
        this.counsterSet = counsterSet;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getJpjg() {
        return jpjg;
    }

    public void setJpjg(float jpjg) {
        this.jpjg = jpjg;
    }

    public float getAirportTax() {
        return airportTax;
    }

    public void setAirportTax(float airportTax) {
        this.airportTax = airportTax;
    }


}
