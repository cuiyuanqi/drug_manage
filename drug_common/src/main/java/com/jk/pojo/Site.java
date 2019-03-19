package com.jk.pojo;

public class Site {
    private Integer id;
    private String consignee;
    private String region;
    private String detailedAddress;
    private Integer postcode;
    private Integer telephone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDetailedAddress() {
        return detailedAddress;
    }

    public void setDetailedAddress(String detailedAddress) {
        this.detailedAddress = detailedAddress;
    }

    public Integer getPostcode() {
        return postcode;
    }

    public void setPostcode(Integer postcode) {
        this.postcode = postcode;
    }

    public Integer getTelephone() {
        return telephone;
    }

    public void setTelephone(Integer telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Site{" +
                "id=" + id +
                ", consignee='" + consignee + '\'' +
                ", region='" + region + '\'' +
                ", detailedAddress='" + detailedAddress + '\'' +
                ", postcode=" + postcode +
                ", telephone=" + telephone +
                '}';
    }
}
