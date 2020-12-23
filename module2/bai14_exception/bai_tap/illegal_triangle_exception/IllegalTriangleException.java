package bai14_exception.bai_tap.illegal_triangle_exception;

public class IllegalTriangleException extends Exception {
    IllegalTriangleException(){
        super("Day ko phai la tam giac");
    }
    IllegalTriangleException(String msg){
        super(msg);
    }
}
