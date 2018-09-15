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

public class CarEngine {
    private String type;
    private String power;
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getPower() {
        return power;
    }
    public void setPower(String power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "CarEngine [type=" + type + ", power=" + power + "]";
    }
}
