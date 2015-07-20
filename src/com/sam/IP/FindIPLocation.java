package com.sam.IP;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

public class FindIPLocation {

	public static void main(String[] args) {
		if (args.length !=1)
			System.out.println("please enter one IP address");
		else {
			String ipAddress = args[0];
			GeoIPService geoIPService = new GeoIPService();
			GeoIPServiceSoap geoIPServiceSoap = geoIPService.getGeoIPServiceSoap();
			GeoIP geoIP = geoIPServiceSoap.getGeoIP(ipAddress);
			System.out.println("IP Address of " + ipAddress + " is : " + geoIP.getCountryName());
			
		}

	}

}
