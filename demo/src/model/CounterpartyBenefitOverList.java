package model;

import java.math.BigDecimal;

public class CounterpartyBenefitOverList extends CounterpartyBenefitOverListKey {
    private String name;

    private Short proportion;

    private BigDecimal fiid;

    private String professionalInvestorFlag;

    private Short financialAssetsOfLastyear;

    private String invest3yearExpFlag;

    private String prodId;

    private String assets20millionFlag;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Short getProportion() {
        return proportion;
    }

    public void setProportion(Short proportion) {
        this.proportion = proportion;
    }

    public BigDecimal getFiid() {
        return fiid;
    }

    public void setFiid(BigDecimal fiid) {
        this.fiid = fiid;
    }

    public String getProfessionalInvestorFlag() {
        return professionalInvestorFlag;
    }

    public void setProfessionalInvestorFlag(String professionalInvestorFlag) {
        this.professionalInvestorFlag = professionalInvestorFlag;
    }

    public Short getFinancialAssetsOfLastyear() {
        return financialAssetsOfLastyear;
    }

    public void setFinancialAssetsOfLastyear(Short financialAssetsOfLastyear) {
        this.financialAssetsOfLastyear = financialAssetsOfLastyear;
    }

    public String getInvest3yearExpFlag() {
        return invest3yearExpFlag;
    }

    public void setInvest3yearExpFlag(String invest3yearExpFlag) {
        this.invest3yearExpFlag = invest3yearExpFlag;
    }

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    public String getAssets20millionFlag() {
        return assets20millionFlag;
    }

    public void setAssets20millionFlag(String assets20millionFlag) {
        this.assets20millionFlag = assets20millionFlag;
    }
}