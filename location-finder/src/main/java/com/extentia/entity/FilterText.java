/**
 * 
 */
package com.extentia.entity;

import java.util.Arrays;
import java.util.List;

/**
 * @author Aniket.Bhosale
 *
 */
public class FilterText {

	private String[] html_attributions;
	private List<FilterTextResult> results;
	private String status;

	public String[] getHtml_attributions() {
		return html_attributions;
	}

	public void setHtml_attributions(String[] html_attributions) {
		this.html_attributions = html_attributions;
	}

	public List<FilterTextResult> getResults() {
		return results;
	}

	public void setResults(List<FilterTextResult> results) {
		this.results = results;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "FilterText [html_attributions=" + Arrays.toString(html_attributions) + ", results=" + results
				+ ", status=" + status + "]";
	}

}
