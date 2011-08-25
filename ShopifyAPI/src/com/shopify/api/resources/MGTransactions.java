/**
* DO NOT MODIFY THIS CODE
* 
* Place all of your changes in Transactions.java
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
  
public class MGTransactions extends ShopifyResource {

	@JsonProperty("kind")
	private String _kind;
	public String getKind(){ return _kind;}
	public void setKind(String newkind){_kind = newkind;}

	@JsonProperty("order_id")
	private int _order_id;
	public int getOrder_id(){ return _order_id;}
	public void setOrder_id(int neworder_id){_order_id = neworder_id;}

	@JsonProperty("amount")
	private String _amount;
	public String getAmount(){ return _amount;}
	public void setAmount(String newamount){_amount = newamount;}

	@JsonProperty("authorization")
	private String _authorization;
	public String getAuthorization(){ return _authorization;}
	public void setAuthorization(String newauthorization){_authorization = newauthorization;}

	// TODO: receipt is a hash or array
	/* {"testcase":true,"authorization":"123456"} */

	@JsonProperty("status")
	private String _status;
	public String getStatus(){ return _status;}
	public void setStatus(String newstatus){_status = newstatus;}

}