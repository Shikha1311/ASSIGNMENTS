package regiestration;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ValidCityCode implements ConstraintValidator<CityCode,String>{
    public boolean isValid(String s, ConstraintValidatorContext cvc) { 
    	regiestrationClass R=new regiestrationClass();
    	if(s.equalsIgnoreCase("bhopal") && R.getPin().equalsIgnoreCase("462022"))
    		return true;
    	if(s.equalsIgnoreCase("indore") && R.getPin().equalsIgnoreCase("451010"))
    		return true;
    	if(s.equalsIgnoreCase("ujjain") && R.getPin().equalsIgnoreCase("456001"))
    		return true;
    	if(s.equalsIgnoreCase("shahdol") && R.getPin().equalsIgnoreCase("484001"))
    		return true;
    	return false;
    }


}
