package learnjava;

public class ExplicitTypeCon{
    /*the target type specifies the desired type to convert the specified value to.
    double-float-long-int-short-Byte*/
    public  int convertDoubleToInt() {
        double d = 123.45;
        int i = (int) d;
        
        return i;
    }
    
    public double convertStringToDouble() {
        String s = "456.78";
        double d = Double.parseDouble(s);
        return d;
    }
    }


