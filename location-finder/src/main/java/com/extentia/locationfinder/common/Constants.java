/**
 * 
 */
package com.extentia.locationfinder.common;

/**
 * @author Aniket.Bhosale
 *
 */
public class Constants {
	
	private Constants() {
	}
	
	public static class CommonMethod {
	
		private CommonMethod() {}
		
		public static final String TYPE_SEARCH = "/findplacefromtext";
		public static final String OUT_JSON = "/json";
		public static final String OUT_XML = "/xml";
		public static final String TYPE_DETAILS = "/details";
		public static final String PLACES_API_BASE = "https://maps.googleapis.com/maps/api/place";
		public static final String API_KEY = "AIzaSyAZBTeKmb-ZahS0gVLuQF8Mh97oBWopAWM";
		public static final String PLACES_API_BASE_FOR = "https://api.foursquare.com/v2/venues";
		public static final String Client_ID = "PI1XRV310D14BGS2QGHO3MUXEWIQ15DWT4SJ0OVRDJ1ESXYR";
		public static final String Client_SECRET = "NW0NXEADZ4V4Q4KIZ0VSAA2QYWRLNLDMY5DK0GTMBUK0XMUM";
		public static final String CAT="/categories";
		public static final String SEARCH="/search";
		public static final String FILTER="/textsearch";
		public static final String TARGET_URL = "https://maps.googleapis.com/maps/api/place";
	}
}
