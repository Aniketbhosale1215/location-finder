package com.extentia.locationfinder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.extentia.entity.Detail;
import com.extentia.entity.FilterText;
import com.extentia.entity.LocationCandidate;
import com.extentia.entity.SearchLocation;
import com.extentia.locationfinder.service.PlaceService;

@Controller
@RestController
public class PlaceController {
	
	@Autowired
	PlaceService placeService;
	
	@RequestMapping(value = "/Search", method = RequestMethod.GET)
	public SearchLocation getSerach(
			@RequestParam(name = "lattitude", required = false, defaultValue = "40.7484") double lattitude,
			@RequestParam(name = "longitude", required = false, defaultValue = "-73.9857") double longitude,
			@RequestParam(name = "v", required = false, defaultValue = "20190601") int v) {
		return placeService.getSerach(lattitude,longitude,v);
	}
	
	@RequestMapping(value = "/Location", method = RequestMethod.GET)
	public LocationCandidate getLocation(
			@RequestParam(name = "input", required = false, defaultValue = "pune") String input){
		return placeService.getLocation(input);
	}
	
	@RequestMapping(value = "/Detail", method = RequestMethod.GET)
	public Detail getDetail(
			@RequestParam(name = "placeId", required = false, defaultValue = "ChIJARFGZy6_wjsRQ-Oenb9DjYI") String placeId) {
		return placeService.getDetail(placeId);
	}
	
	@RequestMapping(value = "/textsearch", method = RequestMethod.GET)
	private FilterText getFilter(
			@RequestParam(name = "query", required = false, defaultValue = "pune") String query) {
		return placeService.getFilter(query);
	}
}
