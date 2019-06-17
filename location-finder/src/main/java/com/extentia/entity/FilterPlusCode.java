/**
 * 
 */
package com.extentia.entity;

/**
 * @author Aniket.Bhosale
 *
 */
public class FilterPlusCode {

	private String compound_code;
	private String global_code;

	public String getCompound_code() {
		return compound_code;
	}

	public void setCompound_code(String compound_code) {
		this.compound_code = compound_code;
	}

	public String getGlobal_code() {
		return global_code;
	}

	public void setGlobal_code(String global_code) {
		this.global_code = global_code;
	}

	@Override
	public String toString() {
		return "FilterPlusCode [compound_code=" + compound_code + ", global_code=" + global_code + "]";
	}

}
