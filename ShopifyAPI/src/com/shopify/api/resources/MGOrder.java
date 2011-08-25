/**
* DO NOT MODIFY THIS CODE
* 
* Place all of your changes in Order.java
* 
* It has been machine generated from fixtures and your changes will be
* lost if anything new needs to be added to the API. 
**/
// Last Generated: 2011-08-25T16:56:47-04:00
package com.shopify.api.resources;

import org.codehaus.jackson.annotate.JsonProperty;

/**
* This code has been machine generated by processing the single entry
* fixtures found from the Shopify API Documentation
*/
  
public class MGOrder extends ShopifyResource {

	// TODO: tax_lines is a hash or array
	/* [{"price":"11.94","title":"State Tax","rate":0.06}] */

	@JsonProperty("name")
	private String _name;
	public String getName(){ return _name;}
	public void setName(String newname){_name = newname;}

	@JsonProperty("number")
	private int _number;
	public int getNumber(){ return _number;}
	public void setNumber(int newnumber){_number = newnumber;}

	// TODO: line_items is a hash or array
	/* [{"price":"199.00","name":"IPod Nano - 8gb - green","title":"IPod Nano - 8gb","requires_shipping":true,"quantity":1,"product_id":632910392,"id":466157049,"grams":200,"sku":"IPOD2008GREEN","vendor":null,"variant_title":"green","fulfillment_status":null,"fulfillment_service":"manual","variant_id":39072856},{"price":"199.00","name":"IPod Nano - 8gb - black","title":"IPod Nano - 8gb","requires_shipping":true,"quantity":1,"product_id":632910392,"id":703073504,"grams":200,"sku":"IPOD2008BLACK","vendor":null,"variant_title":"black","fulfillment_status":null,"fulfillment_service":"manual","variant_id":457924702}] */

	@JsonProperty("total_discounts")
	private String _total_discounts;
	public String getTotal_discounts(){ return _total_discounts;}
	public void setTotal_discounts(String newtotal_discounts){_total_discounts = newtotal_discounts;}

	@JsonProperty("browser_ip")
	private String _browser_ip;
	public String getBrowser_ip(){ return _browser_ip;}
	public void setBrowser_ip(String newbrowser_ip){_browser_ip = newbrowser_ip;}

	// TODO: payment_details is a hash or array
	/* {"credit_card_number":"XXXX-XXXX-XXXX-4242","credit_card_company":"Visa"} */

	@JsonProperty("cancel_reason")
	private String _cancel_reason;
	public String getCancel_reason(){ return _cancel_reason;}
	public void setCancel_reason(String newcancel_reason){_cancel_reason = newcancel_reason;}

	@JsonProperty("landing_site_ref")
	private String _landing_site_ref;
	public String getLanding_site_ref(){ return _landing_site_ref;}
	public void setLanding_site_ref(String newlanding_site_ref){_landing_site_ref = newlanding_site_ref;}

	@JsonProperty("token")
	private String _token;
	public String getToken(){ return _token;}
	public void setToken(String newtoken){_token = newtoken;}

	@JsonProperty("total_price")
	private String _total_price;
	public String getTotal_price(){ return _total_price;}
	public void setTotal_price(String newtotal_price){_total_price = newtotal_price;}

	@JsonProperty("landing_site")
	private String _landing_site;
	public String getLanding_site(){ return _landing_site;}
	public void setLanding_site(String newlanding_site){_landing_site = newlanding_site;}

	@JsonProperty("taxes_included")
	private boolean _taxes_included;
	public boolean getTaxes_included(){ return _taxes_included;}
	public void setTaxes_included(boolean newtaxes_included){_taxes_included = newtaxes_included;}

	// TODO: shipping_lines is a hash or array
	/* [{"price":"0.00","title":"Free Shipping","code":"Free Shipping"}] */

	@JsonProperty("cancelled_at")
	private String _cancelled_at;
	public String getCancelled_at(){ return _cancelled_at;}
	public void setCancelled_at(String newcancelled_at){_cancelled_at = newcancelled_at;}

	// TODO: shipping_address is a hash or array
	/* {"company":null,"city":"Louisville","address1":"Chestnut Street 92","name":"Bob Norman","zip":"40202","latitude":"45.41634","address2":"","country":"United States","country_code":"US","province_code":"KY","phone":"555-625-1199","last_name":"Norman","longitude":"-75.6868","province":"Kentucky","first_name":"Bob"} */

	@JsonProperty("referring_site")
	private String _referring_site;
	public String getReferring_site(){ return _referring_site;}
	public void setReferring_site(String newreferring_site){_referring_site = newreferring_site;}

	@JsonProperty("total_line_items_price")
	private String _total_line_items_price;
	public String getTotal_line_items_price(){ return _total_line_items_price;}
	public void setTotal_line_items_price(String newtotal_line_items_price){_total_line_items_price = newtotal_line_items_price;}

	@JsonProperty("order_number")
	private int _order_number;
	public int getOrder_number(){ return _order_number;}
	public void setOrder_number(int neworder_number){_order_number = neworder_number;}

	@JsonProperty("note")
	private String _note;
	public String getNote(){ return _note;}
	public void setNote(String newnote){_note = newnote;}

	@JsonProperty("subtotal_price")
	private String _subtotal_price;
	public String getSubtotal_price(){ return _subtotal_price;}
	public void setSubtotal_price(String newsubtotal_price){_subtotal_price = newsubtotal_price;}

	// TODO: billing_address is a hash or array
	/* {"company":null,"city":"Louisville","address1":"Chestnut Street 92","name":"Bob Norman","zip":"40202","latitude":"45.41634","address2":"","country":"United States","country_code":"US","province_code":"KY","phone":"555-625-1199","last_name":"Norman","longitude":"-75.6868","province":"Kentucky","first_name":"Bob"} */

	// TODO: note_attributes is a hash or array
	/* [{"name":"colour","value":"green"},{"name":"custom engraving","value":"Happy Birthday"}] */

	@JsonProperty("buyer_accepts_marketing")
	private boolean _buyer_accepts_marketing;
	public boolean getBuyer_accepts_marketing(){ return _buyer_accepts_marketing;}
	public void setBuyer_accepts_marketing(boolean newbuyer_accepts_marketing){_buyer_accepts_marketing = newbuyer_accepts_marketing;}

	@JsonProperty("closed_at")
	private String _closed_at;
	public String getClosed_at(){ return _closed_at;}
	public void setClosed_at(String newclosed_at){_closed_at = newclosed_at;}

	@JsonProperty("currency")
	private String _currency;
	public String getCurrency(){ return _currency;}
	public void setCurrency(String newcurrency){_currency = newcurrency;}

	@JsonProperty("financial_status")
	private String _financial_status;
	public String getFinancial_status(){ return _financial_status;}
	public void setFinancial_status(String newfinancial_status){_financial_status = newfinancial_status;}

	@JsonProperty("fulfillment_status")
	private String _fulfillment_status;
	public String getFulfillment_status(){ return _fulfillment_status;}
	public void setFulfillment_status(String newfulfillment_status){_fulfillment_status = newfulfillment_status;}

	@JsonProperty("gateway")
	private String _gateway;
	public String getGateway(){ return _gateway;}
	public void setGateway(String newgateway){_gateway = newgateway;}

	// TODO: customer is a hash or array
	/* {"accepts_marketing":false,"orders_count":0,"tags":"","id":207119551,"note":null,"last_name":"Norman","total_spent":"0.00","first_name":"Bob","email":"bob.norman@hostmail.com"} */

	@JsonProperty("total_tax")
	private String _total_tax;
	public String getTotal_tax(){ return _total_tax;}
	public void setTotal_tax(String newtotal_tax){_total_tax = newtotal_tax;}

	@JsonProperty("email")
	private String _email;
	public String getEmail(){ return _email;}
	public void setEmail(String newemail){_email = newemail;}

	@JsonProperty("total_weight")
	private int _total_weight;
	public int getTotal_weight(){ return _total_weight;}
	public void setTotal_weight(int newtotal_weight){_total_weight = newtotal_weight;}

}