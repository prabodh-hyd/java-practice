package learnjava;

public class PrimitiveDataTypes {
  //Primitive data are only single values and have no special capabilities

        // declare and initialize boolean variables
        boolean isTrue = true;
        boolean isFalse = false;

        // use boolean operators to perform logical operations
        boolean logicalAnd(){
          boolean result1 = isTrue && isFalse;  // logical AND
          return result1;
        }
        boolean logicalOr(){
        boolean result2 = isTrue || isFalse;  // logical OR
        return result2;
        }
        boolean logicalNot(){
        boolean result3 = !isTrue;  // logical NOT
        return result3;
        }
       
    }

