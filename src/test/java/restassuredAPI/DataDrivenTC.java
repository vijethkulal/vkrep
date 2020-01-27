package restassuredAPI;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTC {


    @Test(priority = 1, dataProvider = "empdta")
    void addnewemployees(String ename, String esal, String eage) {

        RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
        RequestSpecification httpRequest1 = RestAssured.with();

        //Response getresponse_cust = httpRequest1.request(Method.GET, "/register");

        //request payload
        JSONObject postdata = new JSONObject();
        postdata.put("name", ename);
        postdata.put("salary", esal);
        postdata.put("age", eage);

        httpRequest1.header("Content-Type", "application/json");
        httpRequest1.body(postdata.toJSONString());

        Response response = httpRequest1.request(Method.POST, "/create");
        String response_body = response.getBody().asString();
        System.out.println(response_body);

        Assert.assertEquals(response_body.contains(ename), true);
        Assert.assertEquals(response_body.contains(esal), true);
        Assert.assertEquals(response_body.contains(eage), true);
        int statuscodepost = response.getStatusCode();
        System.out.println("Sattus code is " + statuscodepost);
        Assert.assertEquals(statuscodepost, 200);
        String Succescodenumber = response.jsonPath().get("SuccessCode");
        System.out.println(Succescodenumber);


    }


    @DataProvider(name = "empdta")
    Object[][] getempdata() {
        String empdta[][] = {{"ab", "30000", "40"}, {"abc24", "30000", "40"}, {"abc235", "30000", "40"}};
        return (empdta);

    }
}
