package dto;

public class ItemDto {
    private String code;
    private String desc;
    private String pack;
    private Double unitPrice;
    private Integer qoh;

    public ItemDto() {
    }

    public ItemDto(String code, String desc, String pack, Double unitPrice, Integer qoh) {
        this.code = code;
        this.desc = desc;
        this.pack = pack;
        this.unitPrice = unitPrice;
        this.qoh = qoh;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPack() {
        return pack;
    }

    public void setPack(String pack) {
        this.pack = pack;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getQoh() {
        return qoh;
    }

    public void setQoh(Integer qoh) {
        this.qoh = qoh;
    }

    @Override
    public String toString() {
        return "ItemDto{" +
                "code='" + code + '\'' +
                ", desc='" + desc + '\'' +
                ", pack='" + pack + '\'' +
                ", unitPrice=" + unitPrice +
                ", qoh=" + qoh +
                '}';
    }
}
