/*
 * Copyright 2016 Mario Serrano Leones.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package tools.dynamia.zk.addons.chartjs;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.TimeZone;

import org.zkoss.json.JSONObject;

/**
 *
 * @author Mario Serrano Leones
 */
public class Coordinate extends JSONObject implements Serializable {

    public Coordinate() {
    }

    public Coordinate(Number x, Number y) {
        setX(x);
        setY(y);
    }

    /*
     * It assumes for the time, the java default time zone.
     * Axe::type needs to be set to "time" for that to work
     *
     * TODO: give a chance to speficy timezone
     */
    public Coordinate(LocalDateTime x, Number y) {
    	setX(x);
    	setY(y);
    }

    public Number getX() {
        return (Number) get("x");
    }

    public void setX(Number x) {
        put("x", x);
    }

    public void setX(LocalDateTime x) {
    	// chart js. expects datetimes to be in miliseconds since epoch (It's possible
    	// to send other times, but performance would be worse).
//    	setX(x
//    			.atZone(TimeZone.getDefault().toZoneId())
//    			.toInstant()
//    			.toEpochMilli());
    	// this one here should be more performant than the above
    	setX(x
    			.atZone(TimeZone.getDefault().toZoneId())
    			.toEpochSecond() * 1000);
    }

    public Number getY() {
        return (Number) get("y");
    }

    public void setY(Number y) {
        put("y", y);
    }

}
