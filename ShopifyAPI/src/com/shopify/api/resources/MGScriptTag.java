/**
* DO NOT MODIFY THIS CODE
* 
* Place all of your changes in ScriptTag.java
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
  
public class MGScriptTag extends ShopifyResource {

	@JsonProperty("src")
	private String _src;
	public String getSrc(){ return _src;}
	public void setSrc(String newsrc){_src = newsrc;}

	@JsonProperty("event")
	private String _event;
	public String getEvent(){ return _event;}
	public void setEvent(String newevent){_event = newevent;}

}