/*
 * KeenIoLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 11/14/2016
 */
package io.keen.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Steps 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4868565894838779496L;
    private List<String> actorProperty;
    private String eventCollection;
    private List<Filters> filters;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("actor_property")
    public List<String> getActorProperty ( ) { 
        return this.actorProperty;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("actor_property")
    public void setActorProperty (List<String> value) { 
        this.actorProperty = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("event_collection")
    public String getEventCollection ( ) { 
        return this.eventCollection;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("event_collection")
    public void setEventCollection (String value) { 
        this.eventCollection = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("filters")
    public List<Filters> getFilters ( ) { 
        return this.filters;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("filters")
    public void setFilters (List<Filters> value) { 
        this.filters = value;
    }
 
}
 