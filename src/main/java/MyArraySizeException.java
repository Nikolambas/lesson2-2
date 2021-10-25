public class MyArraySizeException extends Exception{
    public MyArraySizeException(){
        System.out.println("В каком то ряду массива больше четырех значений");
        System.exit(-1);
    }
}
