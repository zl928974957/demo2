import lombok.Data;

public class House {
    private Integer id;        //id
    private Integer ownerid;   //家主编号
    private String housename;  //家庭名称
    private String address;    //家庭地址
    private DouDing douDing;

    public DouDing getDouDing() {
        return douDing;
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", ownerid=" + ownerid +
                ", housename='" + housename + '\'' +
                ", address='" + address + '\'' +
                ", douDing=" + douDing +
                '}';
    }

    public void setDouDing(DouDing douDing) {
        this.douDing = douDing;
    }

    public House(Integer id, Integer ownerid, String housename, String address, DouDing douDing) {
        this.id = id;
        this.ownerid = ownerid;
        this.housename = housename;
        this.address = address;
        this.douDing = douDing;
    }

    public House(Integer id, Integer ownerid, String housename, String address) {
        this.id = id;
        this.ownerid = ownerid;
        this.housename = housename;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOwnerid() {
        return ownerid;
    }

    public void setOwnerid(Integer ownerid) {
        this.ownerid = ownerid;
    }

    public String getHousename() {
        return housename;
    }

    public void setHousename(String housename) {
        this.housename = housename;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
