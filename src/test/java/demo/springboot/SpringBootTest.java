package demo.springboot;

import demo.springboot.model.Employee;
import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static org.junit.Assert.assertEquals;

public class SpringBootTest {
    private static final String API_ROOT = "http://localhost:8081/api/employee";

    private Employee createRandomEmployee() {
        Employee employee = new Employee();
        employee.setEmployeeName("Ashutosh");
        employee.setEmployeeAddress("Bangalore");
        return employee;
    }

    @Test
    public void whenCreateNewEmployee_thenCreated() {
        Employee employee = createRandomEmployee();
        Response response = RestAssured.given()
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .body(employee)
                .post(API_ROOT + "/" + "createEmployee");

        assertEquals(HttpStatus.CREATED.value(), response.getStatusCode());
    }

    @Test
    public void whenGetAllEmployees_thenOK() {
        Response response = RestAssured.get(API_ROOT + "/" + "getAllEmployees");
        assertEquals(HttpStatus.OK.value(), response.getStatusCode());
    }
}
