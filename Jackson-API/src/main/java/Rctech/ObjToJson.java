package Rctech;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjToJson {
	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		Customer customer = new Customer("Rctech", "101", "12152541");
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("customer.json"), customer);
	}

}
