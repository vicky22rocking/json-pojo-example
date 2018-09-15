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
package com.java.json.example.model;/*
 *
 * @author Vikram Bharti
 * Created on 15/09/18
 */

import java.util.ArrayList;
import java.util.List;

public class CarFleet {
    private List<Car> cars = new ArrayList<Car>();


    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }


    @Override
    public String toString() {
        return "CarFleet [cars=" + cars + "]";
    }

}
