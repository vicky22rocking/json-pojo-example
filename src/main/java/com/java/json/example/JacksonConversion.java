/*
 *-----------------------------------------------------------------
 * IBM Confidential
 *
 * OCO Source Materials
 *
 * 5725-Y11
 *
 * (C) Copyright IBM Corp. 2015, 2018
 *
 * The source code for this program is not published or otherwise
 * divested of its trade secrets, irrespective of what has
 * been deposited with the U.S. Copyright Office.
 *-----------------------------------------------------------------
 */
package com.java.json.example;/*
 *
 * @author Vikram Bharti
 * Created on 15/09/18
 */

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.couchbase.client.java.document.json.JsonObject;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.java.json.example.model.Car;
import com.java.json.example.model.CarEngine;
import com.java.json.example.model.CarFleet;

public class JacksonConversion {
    public static void main(String[] args) throws JsonProcessingException{
        CarFleet  carfleet=getcarfleet();
   // Converting java object to json 
        ObjectMapper mapper = new ObjectMapper();
		String 	carfleetJson=mapper.writeValueAsString(carfleet);
        System.out.println(carfleetJson);
//		JsonObject json=JsonObject.fromJson(carfleetJson) ;
//	System.out.println(json);
// Getting java object from Json 
        try {
		CarFleet   java_carfeleetObject=	mapper.readValue(carfleetJson, CarFleet.class);
		System.out.println(java_carfeleetObject);
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    }
private static CarFleet getcarfleet(){
    Car car1 = new Car();
    car1.setName("Audi");
    car1.setModel("2010");
    car1.setCost(30000);


    CarEngine engine1 = new CarEngine();
    engine1.setPower("88KWH");
    engine1.setType("Diesel");
    car1.setEngine(engine1);

    Car car2 = new Car();
    car2.setName("Jaguar");
    car2.setModel("2013");
    car2.setCost(60000);

    CarEngine engine2 = new CarEngine();
    engine2.setPower("120KWH");
    engine2.setType("Diesel");
    car2.setEngine(engine2);

    List<String> colors = new ArrayList<String>();
    colors.add("Grey");
    colors.add("white");
    car1.setColors(colors);
    car2.setColors(colors);

    CarFleet carFleet = new CarFleet();
    carFleet.getCars().add(car1);
    carFleet.getCars().add(car2);

    return carFleet;

}

}
