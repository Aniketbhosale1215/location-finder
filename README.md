# location-finder

# RESTFul Service Using Google and Foursquare Places API in Spring Boot


INTRODUCTION
-------------------------------
# Thank you for using this Location Finder. This REST Service contains functionality of search, list of places/details 
and filter/category/other attributes


REQUIREMENTS
-------------------------------
JDK 1.8
Apache Tomcat 8
Eclipse Java EE


CONTENTS
-------------------------------
/src - example code to execute the REST APIs
/readme.txt - this file
/JRE System Library - contains all dependent jar files to run the sample
/Maven Dependencies - contains all dependencies Jar Files
/pom.xml -file contains information of project and configuration information for the maven to build the project such as dependencies, build directory, source directory, test source directory
		  Maven reads the pom.xml file


DOCUMENTATION & SUPPORT
-------------------------------

# Foursquare Places API Documentation is available at https://developer.foursquare.com/docs/api
# Google Places API Documentation is available at https://developers.google.com/places/web-service/search


PRE-REQUISITES
-------------------------------

# The following are pre-requisites to successfully run the sample code:

# server.port :9000 


RUNNING THE EXAMPLE
-------------------------------

# Right click on project and Run As Java Application "PlaceApplication"

# Open any browser and type below URI
	
# Search for any location :Protocol GET: Using Foursquare Places

http://localhost:9000/Search?ll=40.7484,-73.9857&v=20190601



# See a list of places with details: 

   http://localhost:9000/Location?cityName=<city_Name>
  
  # Protocol GET:
   http://localhost:9000/Location?cityName=Mumbai
   
   http://localhost:9000/Detail?placeId=<place_Id>
  
  # NOTE: WE will GET Place id search for any location API
  # Protocol GET: 
   http://localhost:9000/Detail?placeId=ChIJwe1EZjDG5zsRaYxkjY_tpF0
   
# Option to filter by category / type / other attributes - Using Google Places
   # Protocol GET: 
   
   http://localhost:9000/textsearch?query=restaurants near pune
   

DEBUGGING THE EXAMPLE IN ECLIPSE IDE
------------------------------------
 
# Copy the unzipped folder into your Eclipse workspace

# Load the project into Eclipse.

# In Eclipse, create a new Java project: 
- File -> New -> Java Project
- Enter project name, and point the project's root folder to the unzipped folder's location
- Click 'Next'
- Click 'Finish'

# Create a Run/Debug configuraiton for PlaceApplication.java

# Right Click on Project and Debug As Java Application "PlaceApplication"
