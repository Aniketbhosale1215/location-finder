/**
 * 
 */
package com.extentia.entity;

import java.util.Arrays;

/**
 * @author Aniket.Bhosale
 *
 */
public class Detail {

	private String[] html_attributions;
	private DetailsResult result;
	private String status;

	public String[] getHtml_attributions() {
		return html_attributions;
	}

	public void setHtml_attributions(String[] html_attributions) {
		this.html_attributions = html_attributions;
	}

	public DetailsResult getResult() {
		return result;
	}

	public void setResult(DetailsResult result) {
		this.result = result;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Detail [html_attributions=" + Arrays.toString(html_attributions) + ", result=" + result + ", status="
				+ status + "]";
	}

}
