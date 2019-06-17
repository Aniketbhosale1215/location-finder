/**
 * 
 */
package com.extentia.locationfinder.service.impl;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.extentia.entity.Detail;
import com.extentia.entity.FilterText;
import com.extentia.entity.LocationCandidate;
import com.extentia.entity.SearchLocation;
import com.extentia.locationfinder.common.Constants;
import com.extentia.locationfinder.service.PlaceService;
import com.google.gson.Gson;

/**
 * @author Aniket.Bhosale
 *
 */

@Component
public class PlaceImpl implements PlaceService {

	@GetMapping("/Search")
	@ResponseBody
	public SearchLocation getSerach(
			@RequestParam(name = "lattitude", required = false, defaultValue = "40.7484") double lattitude,
			@RequestParam(name = "longitude", required = false, defaultValue = "-73.9857") double longitude,
			@RequestParam(name = "v", required = false, defaultValue = "20190601") int v) {
		SearchLocation searchLocation = null;
		HttpURLConnection conn = null;
		StringBuilder jsonResults = new StringBuilder();
		try {
			StringBuilder sb = new StringBuilder();

			sb.append(Constants.CommonMethod.PLACES_API_BASE_FOR);
			sb.append(Constants.CommonMethod.SEARCH);
			sb.append("?ll=");
			sb.append(lattitude);
			sb.append(",");
			sb.append(longitude);
			sb.append("&client_id=");
			sb.append(Constants.CommonMethod.Client_ID);
			sb.append("&client_secret=");
			sb.append(Constants.CommonMethod.Client_SECRET);
			sb.append("&v=");
			sb.append(v);

			URL serverUrl = new URL(sb.toString());
			conn = (HttpURLConnection) serverUrl.openConnection();

			InputStreamReader in = new InputStreamReader(conn.getInputStream());

			int read;
			char[] buff = new char[1024];
			while ((read = in.read(buff)) != -1) {
				jsonResults.append(buff, 0, read);
			}
			System.out.print(jsonResults);

			searchLocation = new Gson().fromJson(jsonResults.toString(), SearchLocation.class);

			System.out.print(searchLocation);

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				conn.disconnect();
			}
		}
		return searchLocation;
	}

	@GetMapping("/Location")
	@ResponseBody
	public LocationCandidate getLocation(
			@RequestParam(name = "input", required = false, defaultValue = "Pune") String input) {
		LocationCandidate locationCandidate = null;
		HttpURLConnection conn = null;
		StringBuilder jsonResults = new StringBuilder();

		String[] words = input.split(" ");
		StringBuffer sentence = new StringBuffer();

		for (String w : words) {
			sentence.append("%20");
			sentence.append(w);
		}

		try {
			StringBuilder sb = new StringBuilder();

			sb.append(Constants.CommonMethod.TARGET_URL);
			sb.append(Constants.CommonMethod.TYPE_SEARCH);
			sb.append(Constants.CommonMethod.OUT_JSON);
			sb.append("?input=");
			sb.append(sentence);
			sb.append("&inputtype=textquery");
			sb.append("&fields=formatted_address,name,place_id");
			sb.append("&key=");
			sb.append(Constants.CommonMethod.API_KEY);

			URL serverUrl = new URL(sb.toString());
			conn = (HttpURLConnection) serverUrl.openConnection();

			InputStreamReader in = new InputStreamReader(conn.getInputStream());

			int read;
			char[] buff = new char[1024];
			while ((read = in.read(buff)) != -1) {
				jsonResults.append(buff, 0, read);
			}
			System.out.print(jsonResults);

			locationCandidate = new Gson().fromJson(jsonResults.toString(), LocationCandidate.class);

			System.out.print(locationCandidate);

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				conn.disconnect();
			}
		}
		return locationCandidate;
	}

	@GetMapping("/Detail")
	@ResponseBody
	public Detail getDetail(
			@RequestParam(name = "placeId", required = false, defaultValue = "ChIJARFGZy6_wjsRQ-Oenb9DjYI") String placeId) {

		Detail detail = null;
		HttpURLConnection conn = null;
		StringBuilder jsonResults = new StringBuilder();
		try {
			StringBuilder sb = new StringBuilder(Constants.CommonMethod.PLACES_API_BASE);
			sb.append(Constants.CommonMethod.TYPE_DETAILS);
			sb.append(Constants.CommonMethod.OUT_JSON);
			sb.append("?key=");
			sb.append(Constants.CommonMethod.API_KEY);
			sb.append("&placeid=");
			sb.append(placeId);
			sb.append("&region=address_component,adr_address,name,type");

			URL serverUrl = new URL(sb.toString());
			conn = (HttpURLConnection) serverUrl.openConnection();

			InputStreamReader in = new InputStreamReader(conn.getInputStream());

			int read;
			char[] buff = new char[1024];
			while ((read = in.read(buff)) != -1) {
				jsonResults.append(buff, 0, read);
			}

			detail = new Gson().fromJson(jsonResults.toString(), Detail.class);

			System.out.print(jsonResults);

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				conn.disconnect();
			}
		}
		return detail;
	}

	@GetMapping("/textsearch")
	@ResponseBody
	public FilterText getFilter(@RequestParam(name = "query", required = false, defaultValue = "pune") String query) {

		HttpURLConnection conn = null;

		FilterText filterText = null;
		StringBuilder jsonResults = new StringBuilder();
		StringBuilder sb = null;

		String[] words = query.split(" ");
		StringBuffer sentence = new StringBuffer();

		for (String w : words) {
			sentence.append("%20");
			sentence.append(w);
		}

		System.out.println(sentence);
		try {
			sb = new StringBuilder();

			sb.append(Constants.CommonMethod.TARGET_URL);
			sb.append(Constants.CommonMethod.FILTER);
			sb.append(Constants.CommonMethod.OUT_JSON);
			sb.append("?key=");
			sb.append(Constants.CommonMethod.API_KEY);
			sb.append("&query=");
			sb.append(sentence);

			URL serverUrl = new URL(sb.toString());
			conn = (HttpURLConnection) serverUrl.openConnection();
			conn.setRequestProperty("file.encoding", "UTF-8");

			InputStreamReader in = new InputStreamReader(conn.getInputStream());
			int read;
			char[] buff = new char[1024];
			while ((read = in.read(buff)) != -1) {
				jsonResults.append(buff, 0, read);
			}
			System.out.print(jsonResults);

			filterText = new Gson().fromJson(jsonResults.toString(), FilterText.class);

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				conn.disconnect();
			}
		}
		return filterText;
	}
}
