package restassuredAPI;

import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.PreemptiveAuthSpec;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TC_RestAPI_GetRequest {


    @Test(priority = 3)
    void getWeatherDetails() {

        RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
        RequestSpecification httpRequest = RestAssured.with();
        Response getresponse = httpRequest.request(Method.GET, "/Bangalore");
        String responseBody = getresponse.getBody().asString();
        System.out.println("Response Body is =>  " + responseBody);
        long time = getresponse.getTime();
        System.out.println("current time is :" + time);
        LocalTime timers = LocalTime.now();
        LocalDateTime datetimers = LocalDateTime.now();
        System.out.println("localdatetime is :" + datetimers);
        System.out.println("localtime is :" + timers);
        LocalTime curtime = java.time.LocalTime.now();
        //Assert.assertEquals(time, Collections.singleton(curtime),false);
        Assert.assertFalse(false);
        System.out.println(getresponse.hashCode());
        int stateside = getresponse.getStatusCode();
        System.out.println(stateside);
        Assert.assertEquals(stateside, 200);
       // Assert.assert
        String header = getresponse.getHeader(toString());
        String statuscodeline = getresponse.getStatusLine();
        System.out.println(header);
        System.out.println(statuscodeline);
        Assert.assertEquals(statuscodeline, "HTTP/1.1 200 OK");
    }

    @Test(priority = 2, dependsOnMethods = "checkgooglemapApi")
    void checkcustomerdetails() {
        RestAssured.baseURI = "http://restapi.demoqa.com/customer";
        RequestSpecification httpRequest1 = RestAssured.with();

        //Response getresponse_cust = httpRequest1.request(Method.GET, "/register");

        //request payload
        JSONObject postdata = new JSONObject();
        postdata.put("FirstName", "Vijeth543");
        postdata.put("LastName", "Kulal43");
        postdata.put("UserName", "Vijeth8 Kulal");
        postdata.put("Password", "Vijeth8 Kulal");
        postdata.put("Email", "VijethKulal3248@gmail.com");

        httpRequest1.header("Content-Type", "application/json");
        httpRequest1.body(postdata.toJSONString());
        Response response = httpRequest1.request(Method.POST, "/register");
        String response_body = response.getBody().asString();
        System.out.println("ResponseBody is " + response_body);
        System.out.println(response.getHeader(toString()));
        int statuscodepost = response.getStatusCode();
        System.out.println(statuscodepost);
        Assert.assertEquals(statuscodepost, 201);

        String Succescodenumber = response.jsonPath().get("FirstName");
        System.out.println(Succescodenumber);

    }

    @Test(priority = 2)
    void checkgooglemapApi() {
        RestAssured.baseURI = "https://maps.google.com";
        RequestSpecification httpRequest1 = RestAssured.with();
        Response response = httpRequest1.request(Method.GET,"/maps/search/supermarkets+near+me/@12.8462943,77.6650654,15z/data=!3m1!4b1");
        String response_body = response.getBody().asString().trim();
        String content_type = response.getHeader("Content-Type");
        System.out.println("Content Type  ::" + content_type);
        Assert.assertEquals(content_type, "text/html; charset=UTF-8");
        // System.out.println("ResponseBody is " + response_body.toString().trim());
        System.out.println(response.getHeader(toString()));
        int statuscodepost = response.getStatusCode();
        System.out.println(statuscodepost);
        Assert.assertEquals(statuscodepost, 200);
        System.out.println(content_type);
        String content_encoding = response.getHeader("content-encoding");
        Assert.assertEquals(content_encoding, "gzip");

    }

    @Test(priority = 1, groups = "API")
    void checkgooglemapApiheaderlist() {
        RestAssured.baseURI = "https://maps.google.com";
        RequestSpecification httpRequest1 = RestAssured.with();
        Response response = httpRequest1.request(Method.GET, "/maps/search/supermarkets+near+me/@12.8462943,77.6650654,15z/data=!3m1!4b1");
        String response_body = response.getBody().prettyPrint();
        System.out.println(response_body);
        Boolean store=response_body.contains("Store");
        System.out.println(store);
        Headers headerlist = response.headers();
        // List<String> ab= new ArrayList(hearderlist.toString().trim());
        for (Header header : headerlist) {
            System.out.println(header.getName() + "---" + header.getValue());
        }
        Assert.assertEquals(headerlist.getValue("Content-Type"),"text/html; charset=UTF-8");



    }

    @Test(description = "ExtractValue of Nodein JSON")
    void ExtractValueofNodeinJSON()
    {
        RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
        RequestSpecification httpRequest1 = RestAssured.with();
        Response response = httpRequest1.request(Method.GET, "/Bangalore");

        JsonPath path;
        path = response.jsonPath();
        String cityname=path.get("City");
        System.out.println("Cityname is :"  +cityname);
        System.out.println(path.get("Temperature").toString().trim());
            Assert.assertTrue(true,"true");
        System.out.println("Temperature of "+cityname+ " is "+path.get("Temperature"));




       // String response_body = response.getBody().asString().trim();
    }


    @Test(description = "Authorisation")
    void Authorisation()
    {
        RestAssured.baseURI = "http://www.restapi.demoqa.com/authentication/CheckForAuthentication";
        // Authentication need to be sent before request
        PreemptiveBasicAuthScheme authScheme=new PreemptiveBasicAuthScheme();
        authScheme.setUserName("ToolsQA");
        authScheme.setPassword("TestPassword");
        RestAssured.authentication =authScheme;

        RequestSpecification httpRequest1 = RestAssured.with();
        Response response = httpRequest1.request(Method.GET, "/");
        String responsebody=response.getBody().asString().trim();
        System.out.println(responsebody);
        int statuscode = response.getStatusCode();
        String statusline=response.getStatusLine();
        System.out.println(statusline);
        System.out.println(statuscode);
        Assert.assertEquals(statuscode, 200);
        Headers headerlist = response.headers();
        // List<String> ab= new ArrayList(hearderlist.toString().trim());
        for (Header header : headerlist) {
            System.out.println(header.getName() + "---" + header.getValue());
        }
    }
}
