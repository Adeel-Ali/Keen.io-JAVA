/*
 * KeenIoLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 11/14/2016
 */
package io.keen.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class GetPropertyResourceResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4887687654795918762L;
    private String propertyName;
    private String type;
    private String url;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("property_name")
    public String getPropertyName ( ) { 
        return this.propertyName;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("property_name")
    public void setPropertyName (String value) { 
        this.propertyName = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("type")
    public String getType ( ) { 
        return this.type;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("type")
    public void setType (String value) { 
        this.type = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("url")
    public String getUrl ( ) { 
        return this.url;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("url")
    public void setUrl (String value) { 
        this.url = value;
    }
 
}
 