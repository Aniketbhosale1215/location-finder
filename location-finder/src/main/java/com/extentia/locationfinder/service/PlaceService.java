/**
 * 
 */
package com.extentia.locationfinder.service;

import com.extentia.entity.Detail;
import com.extentia.entity.FilterText;
import com.extentia.entity.LocationCandidate;
import com.extentia.entity.SearchLocation;

/**
 * @author Aniket.Bhosale
 *
 */
public interface PlaceService {

	public SearchLocation getSerach(double lattitude, double longitude, int v);

	public Detail getDetail(String placeId);

	public FilterText getFilter(String query);

	public LocationCandidate getLocation(String input);

}
