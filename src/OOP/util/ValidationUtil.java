package OOP.util;

import java.lang.reflect.Field;

import OOP.annotation.NotBlank;
import OOP.data.LoginRequest;
import OOP.error.BlankException;
import OOP.error.ValidationException;

public class ValidationUtil {
	public static void validate(LoginRequest loginRequest) throws ValidationException, NullPointerException {

		if(loginRequest.username()==null) {
			throw new NullPointerException("Usernama is null");
		}else if(loginRequest.username().isBlank()) {
			throw new ValidationException("Username is blank");
		}else if(loginRequest.password()==null) {
			throw new NullPointerException("Password is null");
		}else if(loginRequest.password().isBlank()) {
			throw new ValidationException("Password is blank");
		}
		
	}

	public static void ValidateRuntime (LoginRequest loginRequest){
		
		if(loginRequest.username()==null) {
			throw new BlankException("Usernama is null");
		}else if(loginRequest.username().isBlank()) {
			throw new BlankException("Username is blank");
		}else if(loginRequest.password()==null) {
			throw new BlankException("Password is null");
		}else if(loginRequest.password().isBlank()) {
			throw new BlankException("Password is blank");
		}
		
	}
	
	public static void ValidationReflection(Object object) {
		Class aClass = object.getClass();
		Field[] fields = aClass.getDeclaredFields();
		
		for(var field : fields) {
			field.setAccessible(true);
			if (field.getAnnotation(NotBlank.class) != null) {
				try {
					String value = (String) field.get(object);	
					
					if(value == null || value.isBlank()) {
						throw new BlankException("Field " + field.getName() + " is blank ");
					}
				} catch (IllegalAccessException exception) {
					// TODO: handle exception
					System.out.println("tidak bisa mengakses field "+ field.getName());
				}
			}
		}
		
	}
}