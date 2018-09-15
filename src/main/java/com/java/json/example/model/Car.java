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

public class Car {

    private String name;
    private String model;
    private long cost;
    private List<String> colors = new ArrayList<String>();
    private CarEngine engine = new CarEngine();

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public long getCost() {
        return cost;
    }
    public void setCost(long cost) {
        this.cost = cost;
    }

    public CarEngine getEngine() {
        return engine;
    }
    public void setEngine(CarEngine engine) {
        this.engine = engine;
    }

    public List<String> getColors() {
        return colors;
    }
    public void setColors(List<String> colors) {
        this.colors = colors;
    }
    @Override
    public String toString() {
        return "Car [name=" + name + ", model=" + model + ", cost=" + cost
                + ", colors=" + colors + ", engine=" + engine + "]";
    }

}
