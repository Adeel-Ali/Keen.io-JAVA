/*
 * KeenIoLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 11/14/2016
 */
package io.keen.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class GetSelectUniqueResourceInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5378790139768633301L;
    private String eventCollection;
    private String projectId;
    private String targetProperty;
    private String version;
    private String filters;
    private String groupBy;
    private String interval;
    private String timeframe;
    private String timezone;
    /** GETTER
     * The name of the event collection you are analyzing.
     */
    @JsonGetter("event_collection")
    public String getEventCollection ( ) { 
        return this.eventCollection;
    }
    
    /** SETTER
     * The name of the event collection you are analyzing.
     */
    @JsonSetter("event_collection")
    public void setEventCollection (String value) { 
        this.eventCollection = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("project_id")
    public String getProjectId ( ) { 
        return this.projectId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("project_id")
    public void setProjectId (String value) { 
        this.projectId = value;
    }
 
    /** GETTER
     * the name of the property you are analyzing.
     */
    @JsonGetter("target_property")
    public String getTargetProperty ( ) { 
        return this.targetProperty;
    }
    
    /** SETTER
     * the name of the property you are analyzing.
     */
    @JsonSetter("target_property")
    public void setTargetProperty (String value) { 
        this.targetProperty = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("version")
    public String getVersion ( ) { 
        return this.version;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("version")
    public void setVersion (String value) { 
        this.version = value;
    }
 
    /** GETTER
     * Filters are used to narrow down the events used in an analysis request based on event property values.
     */
    @JsonGetter("filters")
    public String getFilters ( ) { 
        return this.filters;
    }
    
    /** SETTER
     * Filters are used to narrow down the events used in an analysis request based on event property values.
     */
    @JsonSetter("filters")
    public void setFilters (String value) { 
        this.filters = value;
    }
 
    /** GETTER
     * The group_by parameter specifies the name of a property by which you would like to group the results. Using this parameter changes the response format. Read more about Group By to learn more.
     */
    @JsonGetter("group_by")
    public String getGroupBy ( ) { 
        return this.groupBy;
    }
    
    /** SETTER
     * The group_by parameter specifies the name of a property by which you would like to group the results. Using this parameter changes the response format. Read more about Group By to learn more.
     */
    @JsonSetter("group_by")
    public void setGroupBy (String value) { 
        this.groupBy = value;
    }
 
    /** GETTER
     * An Interval specifies the size of time block to break a response into. This will cause a change in the response shape.
     */
    @JsonGetter("interval")
    public String getInterval ( ) { 
        return this.interval;
    }
    
    /** SETTER
     * An Interval specifies the size of time block to break a response into. This will cause a change in the response shape.
     */
    @JsonSetter("interval")
    public void setInterval (String value) { 
        this.interval = value;
    }
 
    /** GETTER
     * Similar to filters, a Timeframe is used to narrow down the events used in an analysis request based on the time that the event occurred.
     */
    @JsonGetter("timeframe")
    public String getTimeframe ( ) { 
        return this.timeframe;
    }
    
    /** SETTER
     * Similar to filters, a Timeframe is used to narrow down the events used in an analysis request based on the time that the event occurred.
     */
    @JsonSetter("timeframe")
    public void setTimeframe (String value) { 
        this.timeframe = value;
    }
 
    /** GETTER
     * Modifies the timeframe filters for Relative Timeframes to match a specific timezone.
     */
    @JsonGetter("timezone")
    public String getTimezone ( ) { 
        return this.timezone;
    }
    
    /** SETTER
     * Modifies the timeframe filters for Relative Timeframes to match a specific timezone.
     */
    @JsonSetter("timezone")
    public void setTimezone (String value) { 
        this.timezone = value;
    }
 
}
 