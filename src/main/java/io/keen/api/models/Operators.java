/*
 * KeenIoLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 11/14/2016
 */
package io.keen.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Operators 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5725488001733156503L;
    private String contains;
    private String eq;
    private String exists;
    private String gt;
    private String gte;
    private String in;
    private String lt;
    private String lte;
    private String ne;
    private String notContains;
    private String within;
    /** GETTER
     * Whether or not the string property value contains the given set of characters
     */
    @JsonGetter("contains")
    public String getContains ( ) { 
        return this.contains;
    }
    
    /** SETTER
     * Whether or not the string property value contains the given set of characters
     */
    @JsonSetter("contains")
    public void setContains (String value) { 
        this.contains = value;
    }
 
    /** GETTER
     * Equal to. Note that if your property?s value is an array, ?eq? can be used to filter for values inside that array. For example, eq: 5 will match a value of [5, 6, 7].
     */
    @JsonGetter("eq")
    public String getEq ( ) { 
        return this.eq;
    }
    
    /** SETTER
     * Equal to. Note that if your property?s value is an array, ?eq? can be used to filter for values inside that array. For example, eq: 5 will match a value of [5, 6, 7].
     */
    @JsonSetter("eq")
    public void setEq (String value) { 
        this.eq = value;
    }
 
    /** GETTER
     * Whether or not a specific property exists on an event record. When using the ?exists? operator, the value passed in must be either ?true? or ?false?
     */
    @JsonGetter("exists")
    public String getExists ( ) { 
        return this.exists;
    }
    
    /** SETTER
     * Whether or not a specific property exists on an event record. When using the ?exists? operator, the value passed in must be either ?true? or ?false?
     */
    @JsonSetter("exists")
    public void setExists (String value) { 
        this.exists = value;
    }
 
    /** GETTER
     * Greater than.
     */
    @JsonGetter("gt")
    public String getGt ( ) { 
        return this.gt;
    }
    
    /** SETTER
     * Greater than.
     */
    @JsonSetter("gt")
    public void setGt (String value) { 
        this.gt = value;
    }
 
    /** GETTER
     * Greater than or equal to.
     */
    @JsonGetter("gte")
    public String getGte ( ) { 
        return this.gte;
    }
    
    /** SETTER
     * Greater than or equal to.
     */
    @JsonSetter("gte")
    public void setGte (String value) { 
        this.gte = value;
    }
 
    /** GETTER
     * Whether or not the property value is in a given set of values. When using the ?in? operator, the value must be a JSON array of values. Example: [1,2,4,5]
     */
    @JsonGetter("in")
    public String getIn ( ) { 
        return this.in;
    }
    
    /** SETTER
     * Whether or not the property value is in a given set of values. When using the ?in? operator, the value must be a JSON array of values. Example: [1,2,4,5]
     */
    @JsonSetter("in")
    public void setIn (String value) { 
        this.in = value;
    }
 
    /** GETTER
     * Less than
     */
    @JsonGetter("lt")
    public String getLt ( ) { 
        return this.lt;
    }
    
    /** SETTER
     * Less than
     */
    @JsonSetter("lt")
    public void setLt (String value) { 
        this.lt = value;
    }
 
    /** GETTER
     * Less than or equal to
     */
    @JsonGetter("lte")
    public String getLte ( ) { 
        return this.lte;
    }
    
    /** SETTER
     * Less than or equal to
     */
    @JsonSetter("lte")
    public void setLte (String value) { 
        this.lte = value;
    }
 
    /** GETTER
     * Not equal to
     */
    @JsonGetter("ne")
    public String getNe ( ) { 
        return this.ne;
    }
    
    /** SETTER
     * Not equal to
     */
    @JsonSetter("ne")
    public void setNe (String value) { 
        this.ne = value;
    }
 
    /** GETTER
     * Whether or not the string property value does not contain the given set of characters.
     */
    @JsonGetter("not_contains")
    public String getNotContains ( ) { 
        return this.notContains;
    }
    
    /** SETTER
     * Whether or not the string property value does not contain the given set of characters.
     */
    @JsonSetter("not_contains")
    public void setNotContains (String value) { 
        this.notContains = value;
    }
 
    /** GETTER
     * sed to select events within a certain radius of the provided geo coordinate (for geo analysis only).
     */
    @JsonGetter("within")
    public String getWithin ( ) { 
        return this.within;
    }
    
    /** SETTER
     * sed to select events within a certain radius of the provided geo coordinate (for geo analysis only).
     */
    @JsonSetter("within")
    public void setWithin (String value) { 
        this.within = value;
    }
 
}
 