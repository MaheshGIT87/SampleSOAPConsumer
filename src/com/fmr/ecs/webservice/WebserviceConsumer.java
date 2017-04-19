/**
 * 
 */
package com.fmr.ecs.webservice;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

/**
 * @author Mahesh
 *
 */
public class WebserviceConsumer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("You need to pass in your arguments");
		} else {
			String input1 = args[0];
			GeoIPService service = new GeoIPService();
			GeoIPServiceSoap geoIPServiceSoap = service.getGeoIPServiceSoap();
			GeoIP output = geoIPServiceSoap.getGeoIP(input1);
			System.out.println(
					"Country Code  :" + output.getCountryCode() + " Country Name : " + output.getCountryName());
		}

	}

}
