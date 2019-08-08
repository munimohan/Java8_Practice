package stringtojson;

public class Request {
    private String id;

    private String	supplierName;
    private String	itemSetupContactName;
    private String	itemSetupContactPhoneNumber;
    private String	itemSetupContactEmail;
    private String	syndigoProductName;
    private String	itemDescription;
    private String	subdivision;
    private String	assortment;
    private String	lowesEffectiveDate;
    private String	sellingCenterEffectiveDate;
    private String	submissionDate;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public String getItemSetupContactName() {
		return itemSetupContactName;
	}
	public void setItemSetupContactName(String itemSetupContactName) {
		this.itemSetupContactName = itemSetupContactName;
	}
	public String getItemSetupContactPhoneNumber() {
		return itemSetupContactPhoneNumber;
	}
	public void setItemSetupContactPhoneNumber(String itemSetupContactPhoneNumber) {
		this.itemSetupContactPhoneNumber = itemSetupContactPhoneNumber;
	}
	public String getItemSetupContactEmail() {
		return itemSetupContactEmail;
	}
	public void setItemSetupContactEmail(String itemSetupContactEmail) {
		this.itemSetupContactEmail = itemSetupContactEmail;
	}
	public String getSyndigoProductName() {
		return syndigoProductName;
	}
	public void setSyndigoProductName(String syndigoProductName) {
		this.syndigoProductName = syndigoProductName;
	}
	public String getItemDescription() {
		return itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	public String getSubdivision() {
		return subdivision;
	}
	public void setSubdivision(String subdivision) {
		this.subdivision = subdivision;
	}
	public String getAssortment() {
		return assortment;
	}
	public void setAssortment(String assortment) {
		this.assortment = assortment;
	}
	public String getLowesEffectiveDate() {
		return lowesEffectiveDate;
	}
	public void setLowesEffectiveDate(String lowesEffectiveDate) {
		this.lowesEffectiveDate = lowesEffectiveDate;
	}
	public String getSellingCenterEffectiveDate() {
		return sellingCenterEffectiveDate;
	}
	public void setSellingCenterEffectiveDate(String sellingCenterEffectiveDate) {
		this.sellingCenterEffectiveDate = sellingCenterEffectiveDate;
	}
	public String getSubmissionDate() {
		return submissionDate;
	}
	public void setSubmissionDate(String submissionDate) {
		this.submissionDate = submissionDate;
	}
	@Override
	public String toString() {
		return "Request [id=" + id + ", supplierName=" + supplierName + ", itemSetupContactName=" + itemSetupContactName
				+ ", itemSetupContactPhoneNumber=" + itemSetupContactPhoneNumber + ", itemSetupContactEmail="
				+ itemSetupContactEmail + ", syndigoProductName=" + syndigoProductName + ", itemDescription="
				+ itemDescription + ", subdivision=" + subdivision + ", assortment=" + assortment
				+ ", lowesEffectiveDate=" + lowesEffectiveDate + ", sellingCenterEffectiveDate="
				+ sellingCenterEffectiveDate + ", submissionDate=" + submissionDate + "]";
	}

   }