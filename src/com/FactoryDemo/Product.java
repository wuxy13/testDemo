/**
 * 
 */
package com.FactoryDemo;

/**
 * @author wuxy13
 *
 */
public class Product {
	private String producedBy;
	private String consumedBy;
	
	public Product() {
		// TODO Auto-generated constructor stub
		this.producedBy="N/A";
		this.consumedBy="N/A";
	}
	
	public Product(String producedBy){
		this.producedBy=producedBy;
	}
	
	public String getProducedBy() {
		return producedBy;
	}
	public void setProducedBy(String producedBy) {
		this.producedBy = producedBy;
	}
	public String getConsumedBy() {
		return consumedBy;
	}
	public void setConsumedBy(String consumedBy) {
		this.consumedBy = consumedBy;
	}
	
	public String getProduct(){
		return producedBy+":"+consumedBy;
	}
}
