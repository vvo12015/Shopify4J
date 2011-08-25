/**
* DO NOT MODIFY THIS CODE
* 
* Place all of your changes in SmartCollection.java
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
  
public class MGSmartCollection extends ShopifyResource {

	@JsonProperty("body_html")
	private String _body_html;
	public String getBody_html(){ return _body_html;}
	public void setBody_html(String newbody_html){_body_html = newbody_html;}

	@JsonProperty("handle")
	private String _handle;
	public String getHandle(){ return _handle;}
	public void setHandle(String newhandle){_handle = newhandle;}

	@JsonProperty("template_suffix")
	private String _template_suffix;
	public String getTemplate_suffix(){ return _template_suffix;}
	public void setTemplate_suffix(String newtemplate_suffix){_template_suffix = newtemplate_suffix;}

	@JsonProperty("title")
	private String _title;
	public String getTitle(){ return _title;}
	public void setTitle(String newtitle){_title = newtitle;}

	// TODO: rules is a hash or array
	/* [{"column":"type","relation":"equals","condition":"Cult Products"}] */

	@JsonProperty("sort_order")
	private String _sort_order;
	public String getSort_order(){ return _sort_order;}
	public void setSort_order(String newsort_order){_sort_order = newsort_order;}

	@JsonProperty("published_at")
	private String _published_at;
	public String getPublished_at(){ return _published_at;}
	public void setPublished_at(String newpublished_at){_published_at = newpublished_at;}

}