#Getting started

## How to Build

The generated code uses a few Maven dependencies e.g., Jackson, UniRest,
and Apache HttpClient. The reference to these dependencies is already
added in the pom.xml file will be installed automatically. Therefore,
you will need internet access for successful build.

* In order to open the client library in Eclipse click on ``` File -> Import ```.

![Importing SDK into Eclipse - Step 1](http://apidocs.io/illustration/java?step=import0&workspaceFolder=Keen.io-Java&workspaceName=KeenIo&projectName=KeenIoLib&rootNamespace=io.keen.api)

* In the import dialog, select ``` Existing Java Project ``` and click ``` Next ```.

![Importing SDK into Eclipse - Step 2](http://apidocs.io/illustration/java?step=import1&workspaceFolder=Keen.io-Java&workspaceName=KeenIo&projectName=KeenIoLib&rootNamespace=io.keen.api)

* Browse to locate the folder containing the source code. Select the detected location of the project and click ``` Finish ```.

![Importing SDK into Eclipse - Step 3](http://apidocs.io/illustration/java?step=import2&workspaceFolder=Keen.io-Java&workspaceName=KeenIo&projectName=KeenIoLib&rootNamespace=io.keen.api)

* Upon successful import, the project will be automatically built by Eclipse after automatically resolving the dependencies.

![Importing SDK into Eclipse - Step 4](http://apidocs.io/illustration/java?step=import3&workspaceFolder=Keen.io-Java&workspaceName=KeenIo&projectName=KeenIoLib&rootNamespace=io.keen.api)

## How to Use

The following section explains how to use the KeenIo library in a new console project.

### 1. Starting a new project

For starting a new project, click the menu command ``` File > New > Project ```.

![Add a new project in Eclipse](http://apidocs.io/illustration/java?step=createNewProject0&workspaceFolder=Keen.io-Java&workspaceName=KeenIo&projectName=KeenIoLib&rootNamespace=io.keen.api)

Next, choose ``` Maven > Maven Project ```and click ``` Next ```.

![Create a new Maven Project - Step 1](http://apidocs.io/illustration/java?step=createNewProject1&workspaceFolder=Keen.io-Java&workspaceName=KeenIo&projectName=KeenIoLib&rootNamespace=io.keen.api)

Here, make sure to use the current workspace by choosing ``` Use default Workspace location ```, as shown in the picture below and click ``` Next ```.

![Create a new Maven Project - Step 2](http://apidocs.io/illustration/java?step=createNewProject2&workspaceFolder=Keen.io-Java&workspaceName=KeenIo&projectName=KeenIoLib&rootNamespace=io.keen.api)

Following this, select the *quick start* project type to create a simple project with an existing class and a ``` main ``` method. To do this, choose ``` maven-archetype-quickstart ``` item from the list and click ``` Next ```.

![Create a new Maven Project - Step 3](http://apidocs.io/illustration/java?step=createNewProject3&workspaceFolder=Keen.io-Java&workspaceName=KeenIo&projectName=KeenIoLib&rootNamespace=io.keen.api)

In the last step, provide a ``` Group Id ``` and ``` Artifact Id ``` as shown in the picture below and click ``` Finish ```.

![Create a new Maven Project - Step 4](http://apidocs.io/illustration/java?step=createNewProject4&workspaceFolder=Keen.io-Java&workspaceName=KeenIo&projectName=KeenIoLib&rootNamespace=io.keen.api)

### 2. Add reference of the library project

The created Maven project manages its dependencies using its ``` pom.xml ``` file. In order to add a dependency on the *KeenIoLib* client library, double click on the ``` pom.xml ``` file in the ``` Package Explorer ```. Opening the ``` pom.xml ``` file will render a graphical view on the cavas. Here, switch to the ``` Dependencies ``` tab and click the ``` Add ``` button as shown in the picture below.

![Adding dependency to the client library - Step 1](http://apidocs.io/illustration/java?step=testProject0&workspaceFolder=Keen.io-Java&workspaceName=KeenIo&projectName=KeenIoLib&rootNamespace=io.keen.api)

Clicking the ``` Add ``` button will open a dialog where you need to specify KeenIo in ``` Group Id ``` and KeenIoLib in the ``` Artifact Id ``` fields. Once added click ``` OK ```. Save the ``` pom.xml ``` file.

![Adding dependency to the client library - Step 2](http://apidocs.io/illustration/java?step=testProject1&workspaceFolder=Keen.io-Java&workspaceName=KeenIo&projectName=KeenIoLib&rootNamespace=io.keen.api)

### 3. Write sample code

Once the ``` SimpleConsoleApp ``` is created, a file named ``` App.java ``` will be visible in the *Package Explorer* with a ``` main ``` method. This is the entry point for the execution of the created project.
Here, you can add code to initialize the client library and instantiate a *Controller* class. Sample code to initialize the client library and using controller methods is given in the subsequent sections.

![Adding dependency to the client library - Step 2](http://apidocs.io/illustration/java?step=testProject2&workspaceFolder=Keen.io-Java&workspaceName=KeenIo&projectName=KeenIoLib&rootNamespace=io.keen.api)

## How to Test

The generated code and the server can be tested using automatically generated test cases. 
JUnit is used as the testing framework and test runner.

In Eclipse, for running the tests do the following:

1. Select the project *KeenIoLib* from the package explorer.
2. Select "Run -> Run as -> JUnit Test" or use "Alt + Shift + X" followed by "T" to run the Tests.

## Initialization

### Authentication and 
In order to setup authentication and initialization of the API client, you need the following information.

| Parameter | Description |
|-----------|-------------|
| authorization | its value should just be your API Key |



API client can be initialized as following.

```java
// Initializing Object Mapper for Serialization and Deserialization purposes
public static ObjectMapper mapper = new ObjectMapper()
{
	private static final long serialVersionUID = -174113593500315394L;
	{
		configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		setSerializationInclusion(JsonInclude.Include.NON_NULL);
	}
};

// Configuration parameters and credentials
String authorization = "authorization"; // its value should just be your API Key

KeenIoClient client = new KeenIoClient(authorization);
```

## Class Reference

### <a name="list_of_controllers"></a>List of Controllers

* [FunnelResourceController](#funnel_resource_controller)
* [SavedQueriesListResourceController](#saved_queries_list_resource_controller)
* [ExtractionResourceController](#extraction_resource_controller)
* [SelectUniqueResourceController](#select_unique_resource_controller)
* [SumResourceController](#sum_resource_controller)
* [PercentileResourceController](#percentile_resource_controller)
* [MedianResourceController](#median_resource_controller)
* [AverageResourceController](#average_resource_controller)
* [MaximumResourceController](#maximum_resource_controller)
* [MinimumResourceController](#minimum_resource_controller)
* [CountUniqueResourceController](#count_unique_resource_controller)
* [CountResourceController](#count_resource_controller)
* [EventCollectionResourceController](#event_collection_resource_controller)
* [WardrobeResourceController](#wardrobe_resource_controller)
* [PropertyResourceController](#property_resource_controller)
* [EventResourceController](#event_resource_controller)
* [SavedQueryRowResourceController](#saved_query_row_resource_controller)
* [SavedQueryRowResultResourceController](#saved_query_row_result_resource_controller)
* [DiscoveryResourceController](#discovery_resource_controller)
* [ProjectsResourceController](#projects_resource_controller)
* [VersionsResourceController](#versions_resource_controller)
* [QueriesResourceController](#queries_resource_controller)
* [ProjectRowResourceController](#project_row_resource_controller)

### <a name="funnel_resource_controller"></a>![Class: ](http://apidocs.io/img/class.png "io.keen.api.controllers.FunnelResourceController") FunnelResourceController

#### Get singleton instance

The singleton instance of the ``` FunnelResourceController ``` class can be accessed from the API Client.

```java
FunnelResourceController funnelResource = client.getFunnelResource();
```

#### <a name="get_funnel_resource_async"></a>![Method: ](http://apidocs.io/img/method.png "io.keen.api.controllers.FunnelResourceController.getFunnelResourceAsync") getFunnelResourceAsync

>  Funnels count relevant events in succession. See Funnels for more details!


```java
void getFunnelResourceAsync(
        final GetFunnelResourceInput input,
        final APICallBack<GetFunnelResourceResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| projectId |  ``` Required ```  | TODO: Add a parameter description |
| steps |  ``` Required ```  | TODO: Add a parameter description |
| version |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
GetFunnelResourceInput collect = new GetFunnelResourceInput();

String projectId = "project_id";
collect.setProjectId(projectId);

String steps = "steps";
collect.setSteps(steps);

String version = "version";
collect.setVersion(version);

// Invoking the API call with sample inputs
funnelResource.getFunnelResourceAsync(collect, new APICallBack<GetFunnelResourceResponse>() {
    public void onSuccess(HttpContext context, GetFunnelResourceResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


[Back to List of Controllers](#list_of_controllers)

### <a name="saved_queries_list_resource_controller"></a>![Class: ](http://apidocs.io/img/class.png "io.keen.api.controllers.SavedQueriesListResourceController") SavedQueriesListResourceController

#### Get singleton instance

The singleton instance of the ``` SavedQueriesListResourceController ``` class can be accessed from the API Client.

```java
SavedQueriesListResourceController savedQueriesListResource = client.getSavedQueriesListResource();
```

#### <a name="get_saved_queries_list_resource_async"></a>![Method: ](http://apidocs.io/img/method.png "io.keen.api.controllers.SavedQueriesListResourceController.getSavedQueriesListResourceAsync") getSavedQueriesListResourceAsync

> GET returns all the available Saved Queries for the specified project as well as links to child-resources.


```java
void getSavedQueriesListResourceAsync(
        final GetSavedQueriesListResourceInput input,
        final APICallBack<List<SavedQueriesListResourceResponse>> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| projectId |  ``` Required ```  | TODO: Add a parameter description |
| version |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
GetSavedQueriesListResourceInput collect = new GetSavedQueriesListResourceInput();

String projectId = "project_id";
collect.setProjectId(projectId);

String version = "version";
collect.setVersion(version);

// Invoking the API call with sample inputs
savedQueriesListResource.getSavedQueriesListResourceAsync(collect, new APICallBack<List<SavedQueriesListResourceResponse>>() {
    public void onSuccess(HttpContext context, List<SavedQueriesListResourceResponse> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


[Back to List of Controllers](#list_of_controllers)

### <a name="extraction_resource_controller"></a>![Class: ](http://apidocs.io/img/class.png "io.keen.api.controllers.ExtractionResourceController") ExtractionResourceController

#### Get singleton instance

The singleton instance of the ``` ExtractionResourceController ``` class can be accessed from the API Client.

```java
ExtractionResourceController extractionResource = client.getExtractionResource();
```

#### <a name="get_extraction_resource_async"></a>![Method: ](http://apidocs.io/img/method.png "io.keen.api.controllers.ExtractionResourceController.getExtractionResourceAsync") getExtractionResourceAsync

> creates an extraction request for full-form event data with all property values. See Data Extractions for more details. If the query string parameter email is specified, then the extraction will be processed asynchronously and an e-mail will be sent to the specified address when it completes. The email will include a link to a downloadable CSV file. If email is omitted, then the extraction will be processed in-line and JSON results will be returned in the GET request.


```java
void getExtractionResourceAsync(
        final GetExtractionResourceInput input,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| eventCollection |  ``` Required ```  | The name of the event collection you are analyzing. |
| projectId |  ``` Required ```  | TODO: Add a parameter description |
| version |  ``` Required ```  | TODO: Add a parameter description |
| email |  ``` Optional ```  | If an email address is specified, an email will be sent to it when your extraction is ready for download. If email is not specified, your extraction will be processed synchronously and your data will be returned as JSON. |
| filters |  ``` Optional ```  | Filters are used to narrow down the events used in an analysis request based on event property values. |
| latest |  ``` Optional ```  | An integer containing the number of most recent events to extract. |
| propertyNames |  ``` Optional ```  | A URL-encoded array of strings containing properties you wish to extract. If this parameter is omitted, all properties will be returned. |
| timeframe |  ``` Optional ```  | A Timeframe specifies the events to use for analysis based on a window of time. |


#### Example Usage

```java
GetExtractionResourceInput collect = new GetExtractionResourceInput();

String eventCollection = "event_collection";
collect.setEventCollection(eventCollection);

String projectId = "project_id";
collect.setProjectId(projectId);

String version = "version";
collect.setVersion(version);

String email = "email";
collect.setEmail(email);

String filters = "filters";
collect.setFilters(filters);

Integer latest = 7;
collect.setLatest(latest);

String propertyNames = "property_names";
collect.setPropertyNames(propertyNames);

String timeframe = "timeframe";
collect.setTimeframe(timeframe);

// Invoking the API call with sample inputs
extractionResource.getExtractionResourceAsync(collect, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


[Back to List of Controllers](#list_of_controllers)

### <a name="select_unique_resource_controller"></a>![Class: ](http://apidocs.io/img/class.png "io.keen.api.controllers.SelectUniqueResourceController") SelectUniqueResourceController

#### Get singleton instance

The singleton instance of the ``` SelectUniqueResourceController ``` class can be accessed from the API Client.

```java
SelectUniqueResourceController selectUniqueResource = client.getSelectUniqueResource();
```

#### <a name="get_select_unique_resource_async"></a>![Method: ](http://apidocs.io/img/method.png "io.keen.api.controllers.SelectUniqueResourceController.getSelectUniqueResourceAsync") getSelectUniqueResourceAsync

>  returns a list of UNIQUE resources in the event collection matching the given criteria. The response will be a simple JSON object with one key: result, which maps to an array of unique property values.


```java
void getSelectUniqueResourceAsync(
        final GetSelectUniqueResourceInput input,
        final APICallBack<SelectUniqueResourceResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| eventCollection |  ``` Required ```  | The name of the event collection you are analyzing. |
| projectId |  ``` Required ```  | TODO: Add a parameter description |
| targetProperty |  ``` Required ```  | the name of the property you are analyzing. |
| version |  ``` Required ```  | TODO: Add a parameter description |
| filters |  ``` Optional ```  | Filters are used to narrow down the events used in an analysis request based on event property values. |
| groupBy |  ``` Optional ```  | The group_by parameter specifies the name of a property by which you would like to group the results. Using this parameter changes the response format. Read more about Group By to learn more. |
| interval |  ``` Optional ```  | An Interval specifies the size of time block to break a response into. This will cause a change in the response shape. |
| timeframe |  ``` Optional ```  | Similar to filters, a Timeframe is used to narrow down the events used in an analysis request based on the time that the event occurred. |
| timezone |  ``` Optional ```  | Modifies the timeframe filters for Relative Timeframes to match a specific timezone. |


#### Example Usage

```java
GetSelectUniqueResourceInput collect = new GetSelectUniqueResourceInput();

String eventCollection = "event_collection";
collect.setEventCollection(eventCollection);

String projectId = "project_id";
collect.setProjectId(projectId);

String targetProperty = "target_property";
collect.setTargetProperty(targetProperty);

String version = "version";
collect.setVersion(version);

String filters = "filters";
collect.setFilters(filters);

String groupBy = "group_by";
collect.setGroupBy(groupBy);

String interval = "interval";
collect.setInterval(interval);

String timeframe = "timeframe";
collect.setTimeframe(timeframe);

String timezone = "timezone";
collect.setTimezone(timezone);

// Invoking the API call with sample inputs
selectUniqueResource.getSelectUniqueResourceAsync(collect, new APICallBack<SelectUniqueResourceResponse>() {
    public void onSuccess(HttpContext context, SelectUniqueResourceResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


[Back to List of Controllers](#list_of_controllers)

### <a name="sum_resource_controller"></a>![Class: ](http://apidocs.io/img/class.png "io.keen.api.controllers.SumResourceController") SumResourceController

#### Get singleton instance

The singleton instance of the ``` SumResourceController ``` class can be accessed from the API Client.

```java
SumResourceController sumResource = client.getSumResource();
```

#### <a name="get_sum_resource_async"></a>![Method: ](http://apidocs.io/img/method.png "io.keen.api.controllers.SumResourceController.getSumResourceAsync") getSumResourceAsync

> TODO: Add a method description


```java
void getSumResourceAsync(
        final GetSumResourceInput input,
        final APICallBack<CountResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| apiKey |  ``` Required ```  | Read Key for the project containing the data you are analyzing. See Authentication for more information |
| eventCollection |  ``` Required ```  | he name of the event collection you are analyzing. |
| projectId |  ``` Required ```  | TODO: Add a parameter description |
| targetProperty |  ``` Required ```  | The name of the property you are analyzing. |
| version |  ``` Required ```  | TODO: Add a parameter description |
| filters |  ``` Optional ```  | Filters are used to narrow down the events used in an analysis request based on event property values. |
| groupBy |  ``` Optional ```  | The group_by parameter specifies the name of a property by which you would like to group the results. Using this parameter changes the response format. Read more about Group By to learn more. |
| interval |  ``` Optional ```  | An Interval specifies the size of time block to break a response into. This will cause a change in the response shape. |
| timeframe |  ``` Optional ```  | Similar to filters, a Timeframe is used to narrow down the events used in an analysis request based on the time that the event occurred. |
| timezone |  ``` Optional ```  | Modifies the timeframe filters for Relative Timeframes to match a specific timezone. |


#### Example Usage

```java
GetSumResourceInput collect = new GetSumResourceInput();

String apiKey = "api_key";
collect.setApiKey(apiKey);

String eventCollection = "event_collection";
collect.setEventCollection(eventCollection);

String projectId = "project_id";
collect.setProjectId(projectId);

String targetProperty = "target_property";
collect.setTargetProperty(targetProperty);

String version = "version";
collect.setVersion(version);

String filters = "filters";
collect.setFilters(filters);

String groupBy = "group_by";
collect.setGroupBy(groupBy);

String interval = "interval";
collect.setInterval(interval);

String timeframe = "timeframe";
collect.setTimeframe(timeframe);

String timezone = "timezone";
collect.setTimezone(timezone);

// Invoking the API call with sample inputs
sumResource.getSumResourceAsync(collect, new APICallBack<CountResponse>() {
    public void onSuccess(HttpContext context, CountResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


[Back to List of Controllers](#list_of_controllers)

### <a name="percentile_resource_controller"></a>![Class: ](http://apidocs.io/img/class.png "io.keen.api.controllers.PercentileResourceController") PercentileResourceController

#### Get singleton instance

The singleton instance of the ``` PercentileResourceController ``` class can be accessed from the API Client.

```java
PercentileResourceController percentileResource = client.getPercentileResource();
```

#### <a name="get_percentile_resource_async"></a>![Method: ](http://apidocs.io/img/method.png "io.keen.api.controllers.PercentileResourceController.getPercentileResourceAsync") getPercentileResourceAsync

>  returns the specified percentile across all numeric values for the target property in the event collection matching the given criteria. Non-numeric values are ignored. The response will be a simple JSON object with one key: result, which maps to the numeric result described previously. The response will be a simple JSON object with one key: result, which maps to the numeric result described previously.


```java
void getPercentileResourceAsync(
        final GetPercentileResourceInput input,
        final APICallBack<CountResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| eventCollection |  ``` Required ```  | The name of the event collection you are analyzing. |
| projectId |  ``` Required ```  | TODO: Add a parameter description |
| targetProperty |  ``` Required ```  | he name of the property you are analyzing. percentile (required) - The specific percentile you wish to calculate, supporting 0-100 with two decimal places of precision for example, 99.99 |
| version |  ``` Required ```  | TODO: Add a parameter description |
| filters |  ``` Optional ```  | Filters are used to narrow down the events used in an analysis request based on event property values. |
| groupBy |  ``` Optional ```  | The Group By parameter specifies the name of a property by which you would like to group the results. Using this parameter changes the response format. |
| interval |  ``` Optional ```  | An Interval specifies the size of time block to break a response into. This will cause a change in the response shape. |
| timeframe |  ``` Optional ```  | imilar to filters, a Timeframe is used to narrow down the events used in an analysis request based on the time that the event occurred. |
| timezone |  ``` Optional ```  | A Timezone modifies the timeframe filters for Relative Timeframes to match a specific timezone. |


#### Example Usage

```java
GetPercentileResourceInput collect = new GetPercentileResourceInput();

String eventCollection = "event_collection";
collect.setEventCollection(eventCollection);

String projectId = "project_id";
collect.setProjectId(projectId);

String targetProperty = "target_property";
collect.setTargetProperty(targetProperty);

String version = "version";
collect.setVersion(version);

String filters = "filters";
collect.setFilters(filters);

String groupBy = "group_by";
collect.setGroupBy(groupBy);

String interval = "interval";
collect.setInterval(interval);

String timeframe = "timeframe";
collect.setTimeframe(timeframe);

String timezone = "timezone";
collect.setTimezone(timezone);

// Invoking the API call with sample inputs
percentileResource.getPercentileResourceAsync(collect, new APICallBack<CountResponse>() {
    public void onSuccess(HttpContext context, CountResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


[Back to List of Controllers](#list_of_controllers)

### <a name="median_resource_controller"></a>![Class: ](http://apidocs.io/img/class.png "io.keen.api.controllers.MedianResourceController") MedianResourceController

#### Get singleton instance

The singleton instance of the ``` MedianResourceController ``` class can be accessed from the API Client.

```java
MedianResourceController medianResource = client.getMedianResource();
```

#### <a name="get_median_resource_async"></a>![Method: ](http://apidocs.io/img/method.png "io.keen.api.controllers.MedianResourceController.getMedianResourceAsync") getMedianResourceAsync

> returns the median across all numeric values for the target property in the event collection matching the given criteria. Non-numeric values are ignored. The response will be a simple JSON object with one key: result, which maps to the numeric result described previously. The response will be a simple JSON object with one key: result, which maps to the numeric result described previously.


```java
void getMedianResourceAsync(
        final GetMedianResourceInput input,
        final APICallBack<CountResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| eventCollection |  ``` Required ```  | The name of the event collection you are analyzing. |
| projectId |  ``` Required ```  | TODO: Add a parameter description |
| targetProperty |  ``` Required ```  | The name of the property you are analyzing. |
| filters |  ``` Optional ```  | Filters are used to narrow down the events used in an analysis request based on event property values. |
| groupBy |  ``` Optional ```  | The group_by parameter specifies the name of a property by which you would like to group the results. Using this parameter changes the response format. Read more about Group By to learn more. |
| interval |  ``` Optional ```  | An Interval specifies the size of time block to break a response into. This will cause a change in the response shape. |
| timeframe |  ``` Optional ```  | Similar to filters, a Timeframe is used to narrow down the events used in an analysis request based on the time that the event occurred. |
| timezone |  ``` Optional ```  | Modifies the timeframe filters for Relative Timeframes to match a specific timezone. |
| version |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
GetMedianResourceInput collect = new GetMedianResourceInput();

String eventCollection = "event_collection";
collect.setEventCollection(eventCollection);

String projectId = "project_id";
collect.setProjectId(projectId);

String targetProperty = "target_property";
collect.setTargetProperty(targetProperty);

String filters = "filters";
collect.setFilters(filters);

String groupBy = "group_by";
collect.setGroupBy(groupBy);

String interval = "interval";
collect.setInterval(interval);

String timeframe = "timeframe";
collect.setTimeframe(timeframe);

String timezone = "timezone";
collect.setTimezone(timezone);

String version = "version";
collect.setVersion(version);

// Invoking the API call with sample inputs
medianResource.getMedianResourceAsync(collect, new APICallBack<CountResponse>() {
    public void onSuccess(HttpContext context, CountResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


[Back to List of Controllers](#list_of_controllers)

### <a name="average_resource_controller"></a>![Class: ](http://apidocs.io/img/class.png "io.keen.api.controllers.AverageResourceController") AverageResourceController

#### Get singleton instance

The singleton instance of the ``` AverageResourceController ``` class can be accessed from the API Client.

```java
AverageResourceController averageResource = client.getAverageResource();
```

#### <a name="get_average_resource_async"></a>![Method: ](http://apidocs.io/img/method.png "io.keen.api.controllers.AverageResourceController.getAverageResourceAsync") getAverageResourceAsync

> returns the average across all numeric values for the target property in the event collection matching the given criteria. Non-numeric values are ignored. The response will be a simple JSON object with one key: result, which maps to the numeric result described previously. The response will be a simple JSON object with one key: result, which maps to the numeric result described previously.


```java
void getAverageResourceAsync(
        final GetAverageResourceInput input,
        final APICallBack<CountResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| eventCollection |  ``` Required ```  | - The name of the event collection you are analyzing. |
| interval |  ``` Required ```  | An Interval specifies the size of time block to break a response into. This will cause a change in the response shape. |
| projectId |  ``` Required ```  | TODO: Add a parameter description |
| targetProperty |  ``` Required ```  | The name of the property you are analyzing. |
| version |  ``` Required ```  | TODO: Add a parameter description |
| filters |  ``` Optional ```  | Filters are used to narrow down the events used in an analysis request based on event property values. |
| groupBy |  ``` Optional ```  | The group_by parameter specifies the name of a property by which you would like to group the results. Using this parameter changes the response format. Read more about Group By to learn more. |
| timeframe |  ``` Optional ```  | Similar to filters, a Timeframe is used to narrow down the events used in an analysis request based on the time that the event occurred. |
| timezone |  ``` Optional ```  | Modifies the timeframe filters for Relative Timeframes to match a specific timezone. |


#### Example Usage

```java
GetAverageResourceInput collect = new GetAverageResourceInput();

String eventCollection = "event_collection";
collect.setEventCollection(eventCollection);

String interval = "interval";
collect.setInterval(interval);

String projectId = "project_id";
collect.setProjectId(projectId);

String targetProperty = "target_property";
collect.setTargetProperty(targetProperty);

String version = "version";
collect.setVersion(version);

String filters = "filters";
collect.setFilters(filters);

String groupBy = "group_by";
collect.setGroupBy(groupBy);

String timeframe = "timeframe";
collect.setTimeframe(timeframe);

String timezone = "timezone";
collect.setTimezone(timezone);

// Invoking the API call with sample inputs
averageResource.getAverageResourceAsync(collect, new APICallBack<CountResponse>() {
    public void onSuccess(HttpContext context, CountResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


[Back to List of Controllers](#list_of_controllers)

### <a name="maximum_resource_controller"></a>![Class: ](http://apidocs.io/img/class.png "io.keen.api.controllers.MaximumResourceController") MaximumResourceController

#### Get singleton instance

The singleton instance of the ``` MaximumResourceController ``` class can be accessed from the API Client.

```java
MaximumResourceController maximumResource = client.getMaximumResource();
```

#### <a name="get_maximum_resource_async"></a>![Method: ](http://apidocs.io/img/method.png "io.keen.api.controllers.MaximumResourceController.getMaximumResourceAsync") getMaximumResourceAsync

> returns the maximum numeric value for the target property in the event collection matching the given criteria. If strings and numbers are present, non-numeric values are ignored. The response will be a simple JSON object with one key: result, which maps to the numeric result described previously.


```java
void getMaximumResourceAsync(
        final GetMaximumResourceInput input,
        final APICallBack<CountResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| projectId |  ``` Required ```  | TODO: Add a parameter description |
| version |  ``` Required ```  | TODO: Add a parameter description |
| eventCollection |  ``` Optional ```  | The name of the event collection you are analyzing. |
| filters |  ``` Optional ```  | Filters are used to narrow down the events used in an analysis request based on event property values. |
| groupBy |  ``` Optional ```  | The group_by parameter specifies the name of a property by which you would like to group the results. Using this parameter changes the response format. Read more about Group By to learn more. |
| interval |  ``` Optional ```  | An Interval specifies the size of time block to break a response into. This will cause a change in the response shape. |
| targetProperty |  ``` Optional ```  | The name of the property you are analyzing. |
| timeframe |  ``` Optional ```  | Similar to filters, a Timeframe is used to narrow down the events used in an analysis request based on the time that the event occurred. |
| timezone |  ``` Optional ```  | Modifies the timeframe filters for Relative Timeframes to match a specific timezone. |


#### Example Usage

```java
GetMaximumResourceInput collect = new GetMaximumResourceInput();

String projectId = "project_id";
collect.setProjectId(projectId);

String version = "version";
collect.setVersion(version);

String eventCollection = "event_collection";
collect.setEventCollection(eventCollection);

String filters = "filters";
collect.setFilters(filters);

String groupBy = "group_by";
collect.setGroupBy(groupBy);

String interval = "interval";
collect.setInterval(interval);

String targetProperty = "target_property";
collect.setTargetProperty(targetProperty);

String timeframe = "timeframe";
collect.setTimeframe(timeframe);

String timezone = "timezone";
collect.setTimezone(timezone);

// Invoking the API call with sample inputs
maximumResource.getMaximumResourceAsync(collect, new APICallBack<CountResponse>() {
    public void onSuccess(HttpContext context, CountResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


[Back to List of Controllers](#list_of_controllers)

### <a name="minimum_resource_controller"></a>![Class: ](http://apidocs.io/img/class.png "io.keen.api.controllers.MinimumResourceController") MinimumResourceController

#### Get singleton instance

The singleton instance of the ``` MinimumResourceController ``` class can be accessed from the API Client.

```java
MinimumResourceController minimumResource = client.getMinimumResource();
```

#### <a name="get_minimum_resource_async"></a>![Method: ](http://apidocs.io/img/method.png "io.keen.api.controllers.MinimumResourceController.getMinimumResourceAsync") getMinimumResourceAsync

> returns the minimum numeric value for the target property in the event collection matching the given criteria. If strings and numbers are present, non-numeric values are ignored. The response will be a simple JSON object with one key: result, which maps to the numeric result described previously.


```java
void getMinimumResourceAsync(
        final GetMinimumResourceInput input,
        final APICallBack<CountResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| projectId |  ``` Required ```  | TODO: Add a parameter description |
| version |  ``` Required ```  | TODO: Add a parameter description |
| eventCollection |  ``` Optional ```  | The name of the event collection you are analyzing. |
| filters |  ``` Optional ```  | Filters are used to narrow down the events used in an analysis request based on event property values. |
| groupBy |  ``` Optional ```  | The group_by parameter specifies the name of a property by which you would like to group the results. Using this parameter changes the response format. Read more about Group By to learn more. |
| interval |  ``` Optional ```  | An Interval specifies the size of time block to break a response into. This will cause a change in the response shape |
| targetProperty |  ``` Optional ```  | The name of the property you are analyzing. |
| timeframe |  ``` Optional ```  | Similar to filters, a Timeframe is used to narrow down the events used in an analysis request based on the time that the event occurred. |
| timezone |  ``` Optional ```  | Modifies the timeframe filters for Relative Timeframes to match a specific timezone. |


#### Example Usage

```java
GetMinimumResourceInput collect = new GetMinimumResourceInput();

String projectId = "project_id";
collect.setProjectId(projectId);

String version = "version";
collect.setVersion(version);

String eventCollection = "event_collection";
collect.setEventCollection(eventCollection);

String filters = "filters";
collect.setFilters(filters);

String groupBy = "group_by";
collect.setGroupBy(groupBy);

String interval = "interval";
collect.setInterval(interval);

String targetProperty = "target_property";
collect.setTargetProperty(targetProperty);

String timeframe = "timeframe";
collect.setTimeframe(timeframe);

String timezone = "timezone";
collect.setTimezone(timezone);

// Invoking the API call with sample inputs
minimumResource.getMinimumResourceAsync(collect, new APICallBack<CountResponse>() {
    public void onSuccess(HttpContext context, CountResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


[Back to List of Controllers](#list_of_controllers)

### <a name="count_unique_resource_controller"></a>![Class: ](http://apidocs.io/img/class.png "io.keen.api.controllers.CountUniqueResourceController") CountUniqueResourceController

#### Get singleton instance

The singleton instance of the ``` CountUniqueResourceController ``` class can be accessed from the API Client.

```java
CountUniqueResourceController countUniqueResource = client.getCountUniqueResource();
```

#### <a name="get_count_unique_resource_async"></a>![Method: ](http://apidocs.io/img/method.png "io.keen.api.controllers.CountUniqueResourceController.getCountUniqueResourceAsync") getCountUniqueResourceAsync

>  returns the number of UNIQUE resources in the event collection matching the given criteria. The response will be a simple JSON object with one key: result, which maps to the numeric result described previously.


```java
void getCountUniqueResourceAsync(
        final GetCountUniqueResourceInput input,
        final APICallBack<CountResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| eventCollection |  ``` Required ```  | The name of the event collection you are analyzing. |
| projectId |  ``` Required ```  | TODO: Add a parameter description |
| targetProperty |  ``` Required ```  | The name of the property you are analyzing. |
| version |  ``` Required ```  | TODO: Add a parameter description |
| interval |  ``` Optional ```  | An Interval specifies the size of time block to break a response into. This will cause a change in the response shape. |
| filters |  ``` Optional ```  | Filters are used to narrow down the events used in an analysis request based on event property values. |
| groupBy |  ``` Optional ```  | he group_by parameter specifies the name of a property by which you would like to group the results. Using this parameter changes the response format |
| timeframe |  ``` Optional ```  | Similar to filters, a Timeframe is used to narrow down the events used in an analysis request based on the time that the event occurred. |
| timezone |  ``` Optional ```  | Modifies the timeframe filters for Relative Timeframes to match a specific timezone. |


#### Example Usage

```java
GetCountUniqueResourceInput collect = new GetCountUniqueResourceInput();

String eventCollection = "event_collection";
collect.setEventCollection(eventCollection);

String projectId = "project_id";
collect.setProjectId(projectId);

String targetProperty = "target_property";
collect.setTargetProperty(targetProperty);

String version = "version";
collect.setVersion(version);

String interval = "interval";
collect.setInterval(interval);

String filters = "filters";
collect.setFilters(filters);

String groupBy = "group_by";
collect.setGroupBy(groupBy);

String timeframe = "timeframe";
collect.setTimeframe(timeframe);

String timezone = "timezone";
collect.setTimezone(timezone);

// Invoking the API call with sample inputs
countUniqueResource.getCountUniqueResourceAsync(collect, new APICallBack<CountResponse>() {
    public void onSuccess(HttpContext context, CountResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


[Back to List of Controllers](#list_of_controllers)

### <a name="count_resource_controller"></a>![Class: ](http://apidocs.io/img/class.png "io.keen.api.controllers.CountResourceController") CountResourceController

#### Get singleton instance

The singleton instance of the ``` CountResourceController ``` class can be accessed from the API Client.

```java
CountResourceController countResource = client.getCountResource();
```

#### <a name="get_count_resource_async"></a>![Method: ](http://apidocs.io/img/method.png "io.keen.api.controllers.CountResourceController.getCountResourceAsync") getCountResourceAsync

>  returns the number of resources in the event collection matching the given criteria. The response will be a simple JSON object with one key: a numeric result.


```java
void getCountResourceAsync(
        final GetCountResourceInput input,
        final APICallBack<CountResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| eventCollection |  ``` Required ```  | he name of the event collection you are analyzing. |
| projectId |  ``` Required ```  | TODO: Add a parameter description |
| version |  ``` Required ```  | TODO: Add a parameter description |
| filters |  ``` Optional ```  | Filters are used to narrow down the events used in an analysis request based on event property values. |
| groupBy |  ``` Optional ```  | The group_by parameter specifies the name of a property by which you would like to group the results. Using this parameter changes the response format. Read more about Group By to learn more. |
| interval |  ``` Optional ```  | An Interval specifies the size of time block to break a response into. This will cause a change in the response shape. |
| timeframe |  ``` Optional ```  | Similar to filters, a Timeframe is used to narrow down the events used in an analysis request based on the time that the event occurred. |
| timezone |  ``` Optional ```  | Modifies the timeframe filters for Relative Timeframes to match a specific timezone. |


#### Example Usage

```java
GetCountResourceInput collect = new GetCountResourceInput();

String eventCollection = "event_collection";
collect.setEventCollection(eventCollection);

String projectId = "project_id";
collect.setProjectId(projectId);

String version = "version";
collect.setVersion(version);

String filters = "filters";
collect.setFilters(filters);

String groupBy = "group_by";
collect.setGroupBy(groupBy);

String interval = "interval";
collect.setInterval(interval);

String timeframe = "timeframe";
collect.setTimeframe(timeframe);

String timezone = "timezone";
collect.setTimezone(timezone);

// Invoking the API call with sample inputs
countResource.getCountResourceAsync(collect, new APICallBack<CountResponse>() {
    public void onSuccess(HttpContext context, CountResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


[Back to List of Controllers](#list_of_controllers)

### <a name="event_collection_resource_controller"></a>![Class: ](http://apidocs.io/img/class.png "io.keen.api.controllers.EventCollectionResourceController") EventCollectionResourceController

#### Get singleton instance

The singleton instance of the ``` EventCollectionResourceController ``` class can be accessed from the API Client.

```java
EventCollectionResourceController eventCollectionResource = client.getEventCollectionResource();
```

#### <a name="delete_event_collection_resource_async"></a>![Method: ](http://apidocs.io/img/method.png "io.keen.api.controllers.EventCollectionResourceController.deleteEventCollectionResourceAsync") deleteEventCollectionResourceAsync

> DELETE is for deleting the entire event collection. This is irreversible and will only work for collections under 10k events.


```java
void deleteEventCollectionResourceAsync(
        final DeleteEventCollectionResourceInput input,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| eventCollection |  ``` Required ```  | TODO: Add a parameter description |
| projectId |  ``` Required ```  | TODO: Add a parameter description |
| version |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
DeleteEventCollectionResourceInput collect = new DeleteEventCollectionResourceInput();

String eventCollection = "event_collection";
collect.setEventCollection(eventCollection);

String projectId = "project_id";
collect.setProjectId(projectId);

String version = "version";
collect.setVersion(version);

// Invoking the API call with sample inputs
eventCollectionResource.deleteEventCollectionResourceAsync(collect, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


#### <a name="get_event_collection_resource_async"></a>![Method: ](http://apidocs.io/img/method.png "io.keen.api.controllers.EventCollectionResourceController.getEventCollectionResourceAsync") getEventCollectionResourceAsync

> GET returns available schema information for this event collection, including properties and their type. It also returns links to sub-resources.


```java
void getEventCollectionResourceAsync(
        final GetEventCollectionResourceInput input,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| eventCollection |  ``` Required ```  | TODO: Add a parameter description |
| projectId |  ``` Required ```  | TODO: Add a parameter description |
| version |  ``` Required ```  | TODO: Add a parameter description |
| data |  ``` Optional ```  | The event body you want to save to Keen IO, URL-encoded AND base-64 encoded |
| filters |  ``` Optional ```  | he filters to use when deleting events. See Filters for more information. |
| redirect |  ``` Optional ```  | The URL you want to redirect the user to after the event is saved. If you don?t include a protocol (http:// or https://), we?ll automatically add that for you. |
| timeframe |  ``` Optional ```  | The timeframe to use when deleting events. See Timeframe for more information. |
| timezone |  ``` Optional ```  | The timezone to use when specifying a timeframe (while deleting events). See Timezone for more information. |


#### Example Usage

```java
GetEventCollectionResourceInput collect = new GetEventCollectionResourceInput();

String eventCollection = "event_collection";
collect.setEventCollection(eventCollection);

String projectId = "project_id";
collect.setProjectId(projectId);

String version = "version";
collect.setVersion(version);

String data = "data";
collect.setData(data);

String filters = "filters";
collect.setFilters(filters);

String redirect = "redirect";
collect.setRedirect(redirect);

String timeframe = "timeframe";
collect.setTimeframe(timeframe);

String timezone = "timezone";
collect.setTimezone(timezone);

// Invoking the API call with sample inputs
eventCollectionResource.getEventCollectionResourceAsync(collect, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


#### <a name="post_event_collection_resource_async"></a>![Method: ](http://apidocs.io/img/method.png "io.keen.api.controllers.EventCollectionResourceController.postEventCollectionResourceAsync") postEventCollectionResourceAsync

> POST is for inserting one event at a time in a single request.


```java
void postEventCollectionResourceAsync(
        final PostEventCollectionResourceInput input,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| eventCollection |  ``` Required ```  | Single JSON event |
| eventBody |  ``` Required ```  | TODO: Add a parameter description |
| projectId |  ``` Required ```  | TODO: Add a parameter description |
| version |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
PostEventCollectionResourceInput collect = new PostEventCollectionResourceInput();

    String eventCollection = "event_collection";
collect.setEventCollection(eventCollection);

    Object eventBody = new Object();
collect.setEventBody(eventBody);

    String projectId = "project_id";
collect.setProjectId(projectId);

    String version = "version";
collect.setVersion(version);

    // Invoking the API call with sample inputs
    eventCollectionResource.postEventCollectionResourceAsync(collect, new APICallBack<DynamicResponse>() {
        public void onSuccess(HttpContext context, DynamicResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    }
);
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


[Back to List of Controllers](#list_of_controllers)

### <a name="wardrobe_resource_controller"></a>![Class: ](http://apidocs.io/img/class.png "io.keen.api.controllers.WardrobeResourceController") WardrobeResourceController

#### Get singleton instance

The singleton instance of the ``` WardrobeResourceController ``` class can be accessed from the API Client.

```java
WardrobeResourceController wardrobeResource = client.getWardrobeResource();
```

#### <a name="post_wardrobe_resource_async"></a>![Method: ](http://apidocs.io/img/method.png "io.keen.api.controllers.WardrobeResourceController.postWardrobeResourceAsync") postWardrobeResourceAsync

> Use this resource to request a garment of a given size to a given address. This is really just the Event Collect Resource, except you must use a specific project ID, write key, and collection name. See below. POST is for inserting one event at a time in a single request, for a single person. Examples below. Note: Wardrobe resource has questionable availability and response time depending on inventory, expense to ship to your country, trolls, team temperament, and our willingness to visit the post office in a given week.


```java
void postWardrobeResourceAsync(
        final PostWardrobeResourceInput input,
        final APICallBack<CreatedResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Required ```  | Single JSON event |
| projectId |  ``` Required ```  | TODO: Add a parameter description |
| version |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
PostWardrobeResourceInput collect = new PostWardrobeResourceInput();

    Object body = new Object();
collect.setBody(body);

    String projectId = "project_id";
collect.setProjectId(projectId);

    String version = "version";
collect.setVersion(version);

    // Invoking the API call with sample inputs
    wardrobeResource.postWardrobeResourceAsync(collect, new APICallBack<CreatedResponse>() {
        public void onSuccess(HttpContext context, CreatedResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    }
);
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


[Back to List of Controllers](#list_of_controllers)

### <a name="property_resource_controller"></a>![Class: ](http://apidocs.io/img/class.png "io.keen.api.controllers.PropertyResourceController") PropertyResourceController

#### Get singleton instance

The singleton instance of the ``` PropertyResourceController ``` class can be accessed from the API Client.

```java
PropertyResourceController propertyResource = client.getPropertyResource();
```

#### <a name="delete_property_resource_async"></a>![Method: ](http://apidocs.io/img/method.png "io.keen.api.controllers.PropertyResourceController.deletePropertyResourceAsync") deletePropertyResourceAsync

> DELETE is for removing a property and deleting all values stored with that property name.


```java
void deletePropertyResourceAsync(
        final DeletePropertyResourceInput input,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| eventCollection |  ``` Required ```  | TODO: Add a parameter description |
| projectId |  ``` Required ```  | TODO: Add a parameter description |
| propertyName |  ``` Required ```  | TODO: Add a parameter description |
| version |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
DeletePropertyResourceInput collect = new DeletePropertyResourceInput();

String eventCollection = "event_collection";
collect.setEventCollection(eventCollection);

String projectId = "project_id";
collect.setProjectId(projectId);

String propertyName = "property_name";
collect.setPropertyName(propertyName);

String version = "version";
collect.setVersion(version);

// Invoking the API call with sample inputs
propertyResource.deletePropertyResourceAsync(collect, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


#### <a name="get_property_resource_async"></a>![Method: ](http://apidocs.io/img/method.png "io.keen.api.controllers.PropertyResourceController.getPropertyResourceAsync") getPropertyResourceAsync

> GET returns the property name, type, and a link to sub-resources


```java
void getPropertyResourceAsync(
        final GetPropertyResourceInput input,
        final APICallBack<GetPropertyResourceResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| eventCollection |  ``` Required ```  | TODO: Add a parameter description |
| projectId |  ``` Required ```  | TODO: Add a parameter description |
| propertyName |  ``` Required ```  | TODO: Add a parameter description |
| version |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
GetPropertyResourceInput collect = new GetPropertyResourceInput();

String eventCollection = "event_collection";
collect.setEventCollection(eventCollection);

String projectId = "project_id";
collect.setProjectId(projectId);

String propertyName = "property_name";
collect.setPropertyName(propertyName);

String version = "version";
collect.setVersion(version);

// Invoking the API call with sample inputs
propertyResource.getPropertyResourceAsync(collect, new APICallBack<GetPropertyResourceResponse>() {
    public void onSuccess(HttpContext context, GetPropertyResourceResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


[Back to List of Controllers](#list_of_controllers)

### <a name="event_resource_controller"></a>![Class: ](http://apidocs.io/img/class.png "io.keen.api.controllers.EventResourceController") EventResourceController

#### Get singleton instance

The singleton instance of the ``` EventResourceController ``` class can be accessed from the API Client.

```java
EventResourceController eventResource = client.getEventResource();
```

#### <a name="post_event_resource_async"></a>![Method: ](http://apidocs.io/img/method.png "io.keen.api.controllers.EventResourceController.postEventResourceAsync") postEventResourceAsync

> POST is for inserting multiple events in one or more collections, in a single request. See below for examples.


```java
void postEventResourceAsync(
        final PostEventResourceInput input,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| eventsBody |  ``` Required ```  | JSON arrays of events |
| projectId |  ``` Required ```  | TODO: Add a parameter description |
| version |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
PostEventResourceInput collect = new PostEventResourceInput();

    Object eventsBody = new Object();
collect.setEventsBody(eventsBody);

    String projectId = "project_id";
collect.setProjectId(projectId);

    String version = "version";
collect.setVersion(version);

    // Invoking the API call with sample inputs
    eventResource.postEventResourceAsync(collect, new APICallBack<DynamicResponse>() {
        public void onSuccess(HttpContext context, DynamicResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    }
);
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


#### <a name="get_event_resource_async"></a>![Method: ](http://apidocs.io/img/method.png "io.keen.api.controllers.EventResourceController.getEventResourceAsync") getEventResourceAsync

> GET returns schema information for all the event collections in this project, including properties and their type. It also returns links to sub-resources.


```java
void getEventResourceAsync(
        final GetEventResourceInput input,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| projectId |  ``` Required ```  | TODO: Add a parameter description |
| version |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
GetEventResourceInput collect = new GetEventResourceInput();

String projectId = "project_id";
collect.setProjectId(projectId);

String version = "version";
collect.setVersion(version);

// Invoking the API call with sample inputs
eventResource.getEventResourceAsync(collect, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


[Back to List of Controllers](#list_of_controllers)

### <a name="saved_query_row_resource_controller"></a>![Class: ](http://apidocs.io/img/class.png "io.keen.api.controllers.SavedQueryRowResourceController") SavedQueryRowResourceController

#### Get singleton instance

The singleton instance of the ``` SavedQueryRowResourceController ``` class can be accessed from the API Client.

```java
SavedQueryRowResourceController savedQueryRowResource = client.getSavedQueryRowResource();
```

#### <a name="delete_saved_query_row_resource_async"></a>![Method: ](http://apidocs.io/img/method.png "io.keen.api.controllers.SavedQueryRowResourceController.deleteSavedQueryRowResourceAsync") deleteSavedQueryRowResourceAsync

> DELETE just plain old deletes the Saved Query.


```java
void deleteSavedQueryRowResourceAsync(
        final DeleteSavedQueryRowResourceInput input,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| projectId |  ``` Required ```  | TODO: Add a parameter description |
| savedQueryName |  ``` Required ```  | TODO: Add a parameter description |
| version |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
DeleteSavedQueryRowResourceInput collect = new DeleteSavedQueryRowResourceInput();

String projectId = "project_id";
collect.setProjectId(projectId);

String savedQueryName = "saved_query_name";
collect.setSavedQueryName(savedQueryName);

String version = "version";
collect.setVersion(version);

// Invoking the API call with sample inputs
savedQueryRowResource.deleteSavedQueryRowResourceAsync(collect, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


#### <a name="get_saved_query_row_resource_async"></a>![Method: ](http://apidocs.io/img/method.png "io.keen.api.controllers.SavedQueryRowResourceController.getSavedQueryRowResourceAsync") getSavedQueryRowResourceAsync

> GET returns information about the specified Saved Query and includes links to child-resources.


```java
void getSavedQueryRowResourceAsync(
        final GetSavedQueryRowResourceInput input,
        final APICallBack<SavedQueriesListResourceResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| analysisType |  ``` Required ```  | TODO: Add a parameter description |
| projectId |  ``` Required ```  | TODO: Add a parameter description |
| savedQueryName |  ``` Required ```  | TODO: Add a parameter description |
| version |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
GetSavedQueryRowResourceInput collect = new GetSavedQueryRowResourceInput();

String analysisType = "analysis_type";
collect.setAnalysisType(analysisType);

String projectId = "project_id";
collect.setProjectId(projectId);

String savedQueryName = "saved_query_name";
collect.setSavedQueryName(savedQueryName);

String version = "version";
collect.setVersion(version);

// Invoking the API call with sample inputs
savedQueryRowResource.getSavedQueryRowResourceAsync(collect, new APICallBack<SavedQueriesListResourceResponse>() {
    public void onSuccess(HttpContext context, SavedQueriesListResourceResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


#### <a name="put_saved_query_row_resource_async"></a>![Method: ](http://apidocs.io/img/method.png "io.keen.api.controllers.SavedQueryRowResourceController.putSavedQueryRowResourceAsync") putSavedQueryRowResourceAsync

> PUT either inserts a new Saved Query if it doesn?t already exist, or updates an existing Saved Query if it does exist.


```java
void putSavedQueryRowResourceAsync(
        final PutSavedQueryRowResourceInput input,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| analysisType |  ``` Required ```  | TODO: Add a parameter description |
| body |  ``` Required ```  | TODO: Add a parameter description |
| projectId |  ``` Required ```  | TODO: Add a parameter description |
| savedQueryName |  ``` Required ```  | TODO: Add a parameter description |
| version |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
PutSavedQueryRowResourceInput collect = new PutSavedQueryRowResourceInput();

    String analysisType = "analysis_type";
collect.setAnalysisType(analysisType);

    Object body = new Object();
collect.setBody(body);

    String projectId = "project_id";
collect.setProjectId(projectId);

    String savedQueryName = "saved_query_name";
collect.setSavedQueryName(savedQueryName);

    String version = "version";
collect.setVersion(version);

    // Invoking the API call with sample inputs
    savedQueryRowResource.putSavedQueryRowResourceAsync(collect, new APICallBack<DynamicResponse>() {
        public void onSuccess(HttpContext context, DynamicResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    }
);
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


[Back to List of Controllers](#list_of_controllers)

### <a name="saved_query_row_result_resource_controller"></a>![Class: ](http://apidocs.io/img/class.png "io.keen.api.controllers.SavedQueryRowResultResourceController") SavedQueryRowResultResourceController

#### Get singleton instance

The singleton instance of the ``` SavedQueryRowResultResourceController ``` class can be accessed from the API Client.

```java
SavedQueryRowResultResourceController savedQueryRowResultResource = client.getSavedQueryRowResultResource();
```

#### <a name="get_saved_query_row_result_resource_async"></a>![Method: ](http://apidocs.io/img/method.png "io.keen.api.controllers.SavedQueryRowResultResourceController.getSavedQueryRowResultResourceAsync") getSavedQueryRowResultResourceAsync

> GET returns the results of the specified Saved Query.


```java
void getSavedQueryRowResultResourceAsync(
        final GetSavedQueryRowResultResourceInput input,
        final APICallBack<CountResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| projectId |  ``` Required ```  | TODO: Add a parameter description |
| savedQueryName |  ``` Required ```  | TODO: Add a parameter description |
| version |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
GetSavedQueryRowResultResourceInput collect = new GetSavedQueryRowResultResourceInput();

String projectId = "project_id";
collect.setProjectId(projectId);

String savedQueryName = "saved_query_name";
collect.setSavedQueryName(savedQueryName);

String version = "version";
collect.setVersion(version);

// Invoking the API call with sample inputs
savedQueryRowResultResource.getSavedQueryRowResultResourceAsync(collect, new APICallBack<CountResponse>() {
    public void onSuccess(HttpContext context, CountResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


[Back to List of Controllers](#list_of_controllers)

### <a name="discovery_resource_controller"></a>![Class: ](http://apidocs.io/img/class.png "io.keen.api.controllers.DiscoveryResourceController") DiscoveryResourceController

#### Get singleton instance

The singleton instance of the ``` DiscoveryResourceController ``` class can be accessed from the API Client.

```java
DiscoveryResourceController discoveryResource = client.getDiscoveryResource();
```

#### <a name="get_avaliable_child_project_resource_async"></a>![Method: ](http://apidocs.io/img/method.png "io.keen.api.controllers.DiscoveryResourceController.getAvaliableChildProjectResourceAsync") getAvaliableChildProjectResourceAsync

> Returns the available child resources. Currently, the only child resource is the Projects Resource.


```java
void getAvaliableChildProjectResourceAsync(
        final String version,
        final APICallBack<AvaliableChildProjectResourceResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| version |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String version = "version";
// Invoking the API call with sample inputs
discoveryResource.getAvaliableChildProjectResourceAsync(version, new APICallBack<AvaliableChildProjectResourceResponse>() {
    public void onSuccess(HttpContext context, AvaliableChildProjectResourceResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

### <a name="projects_resource_controller"></a>![Class: ](http://apidocs.io/img/class.png "io.keen.api.controllers.ProjectsResourceController") ProjectsResourceController

#### Get singleton instance

The singleton instance of the ``` ProjectsResourceController ``` class can be accessed from the API Client.

```java
ProjectsResourceController projectsResource = client.getProjectsResource();
```

#### <a name="get_projects_resource_async"></a>![Method: ](http://apidocs.io/img/method.png "io.keen.api.controllers.ProjectsResourceController.getProjectsResourceAsync") getProjectsResourceAsync

> Returns the projects accessible to the API user, as well as links to project sub-resources for discovery.


```java
void getProjectsResourceAsync(
        final String version,
        final APICallBack<List<GetProjectAccessibleResponse>> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| version |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String version = "version";
// Invoking the API call with sample inputs
projectsResource.getProjectsResourceAsync(version, new APICallBack<List<GetProjectAccessibleResponse>>() {
    public void onSuccess(HttpContext context, List<GetProjectAccessibleResponse> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

### <a name="versions_resource_controller"></a>![Class: ](http://apidocs.io/img/class.png "io.keen.api.controllers.VersionsResourceController") VersionsResourceController

#### Get singleton instance

The singleton instance of the ``` VersionsResourceController ``` class can be accessed from the API Client.

```java
VersionsResourceController versionsResource = client.getVersionsResource();
```

#### <a name="get_api_version_async"></a>![Method: ](http://apidocs.io/img/method.png "io.keen.api.controllers.VersionsResourceController.getAPIVersionAsync") getAPIVersionAsync

> Returns the available API versions. Please only use API version 3.0. Versions 1.0 and 2.0 have been deprecated.


```java
void getAPIVersionAsync(final APICallBack<List<GetAPIVersionResponse>> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
versionsResource.getAPIVersionAsync(new APICallBack<List<GetAPIVersionResponse>>() {
    public void onSuccess(HttpContext context, List<GetAPIVersionResponse> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

### <a name="queries_resource_controller"></a>![Class: ](http://apidocs.io/img/class.png "io.keen.api.controllers.QueriesResourceController") QueriesResourceController

#### Get singleton instance

The singleton instance of the ``` QueriesResourceController ``` class can be accessed from the API Client.

```java
QueriesResourceController queriesResource = client.getQueriesResource();
```

#### <a name="get_queries_resource_async"></a>![Method: ](http://apidocs.io/img/method.png "io.keen.api.controllers.QueriesResourceController.getQueriesResourceAsync") getQueriesResourceAsync

> GET returns the list of available queries and links to them.


```java
void getQueriesResourceAsync(
        final GetQueriesResourceInput input,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| projectId |  ``` Required ```  | TODO: Add a parameter description |
| version |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
GetQueriesResourceInput collect = new GetQueriesResourceInput();

String projectId = "project_id";
collect.setProjectId(projectId);

String version = "version";
collect.setVersion(version);

// Invoking the API call with sample inputs
queriesResource.getQueriesResourceAsync(collect, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


[Back to List of Controllers](#list_of_controllers)

### <a name="project_row_resource_controller"></a>![Class: ](http://apidocs.io/img/class.png "io.keen.api.controllers.ProjectRowResourceController") ProjectRowResourceController

#### Get singleton instance

The singleton instance of the ``` ProjectRowResourceController ``` class can be accessed from the API Client.

```java
ProjectRowResourceController projectRowResource = client.getProjectRowResource();
```

#### <a name="get_project_row_resource_async"></a>![Method: ](http://apidocs.io/img/method.png "io.keen.api.controllers.ProjectRowResourceController.getProjectRowResourceAsync") getProjectRowResourceAsync

> GET returns detailed information about the specific project, as well as links to related resources


```java
void getProjectRowResourceAsync(
        final GetProjectRowResourceInput input,
        final APICallBack<GetProjectAccessibleResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| projectId |  ``` Required ```  | TODO: Add a parameter description |
| version |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
GetProjectRowResourceInput collect = new GetProjectRowResourceInput();

String projectId = "project_id";
collect.setProjectId(projectId);

String version = "version";
collect.setVersion(version);

// Invoking the API call with sample inputs
projectRowResource.getProjectRowResourceAsync(collect, new APICallBack<GetProjectAccessibleResponse>() {
    public void onSuccess(HttpContext context, GetProjectAccessibleResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


[Back to List of Controllers](#list_of_controllers)



