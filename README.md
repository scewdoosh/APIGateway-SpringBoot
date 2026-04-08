# Project Structure

In this repo we git one Eureka registery server, 2 microservices applications named as Application1 and
Application2 respectively. One AdminServer (feel free to ignore the admin server) and the most important
i.e the APIGateway check the APIGateway/pom.xml for the dependencies. Inside it's application properties we have
registered it in eureka registery server.

flow of the application: 

# Before the API Gateway

Consider the client wants to hit the application1 they have to call application1 endpoints just like normal applications.
as the application2 have feign client which calls the `/get-info` as feign client also balance the load of the application if multiple instances are deployed
Same for the second application Application2 we'll end up calling the req seperately.

# After API Gateway (without configuration)

The requests will get routed through the API Gateway but the req will be like `http://localhost:port/Application-Name/url`
as this is also not the most of what we can get out of API Gateway

# After Configuration

Inside the package `com.cosa.routes` check the Routes class the configuration :
Returns a RouteLocator it's like a table which contains all the routes and RouteLocatorBuilder is used to build those routes you have to specify the path, uri (uri can be the application name from the eureka registery or the url
eg: `http://localhost:port` 'lb' is nothing but loadbalancer).

As you might know that we can configure the application properties for the db connection and all in either a class (configuration class) or application properties now checkout the application properties the commented stuff do the same thing which configureation class does. :)
