/*
 * KeenIoLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 11/14/2016
 */
package io.keen.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class GetEventResourceInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4736475678964531629L;
    private String projectId;
    private String version;
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
 
}
 