/**
 * 
 */
package com.extentia.entity;

import java.util.List;

/**
 * @author Aniket.Bhosale
 *
 */
public class LocationCandidate {

	private List<LocationResponse> candidates;
	private String status;

	public List<LocationResponse> getCandidates() {
		return candidates;
	}

	public void setCandidates(List<LocationResponse> candidates) {
		this.candidates = candidates;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "LocationCandidate [candidates=" + candidates + ", status=" + status + "]";
	}

}
