public class Main {
    public static void main(String[] args) {
        String[][] strings = {{"2", "30", "3", "2"}, {"1", "5", "3", "7"}};
        try {
            sum(strings);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
    }

    public static void sum(String [] [] strings) throws MyArraySizeException,MyArrayDataException {
        if (strings.length != 2 || strings[0].length != 4 || strings[1].length!=4) {
            throw new MyArraySizeException();
        }
        int sum = 0;
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length; j++) {
                try {
                    sum+=Integer.parseInt(strings[i][j]);
                }catch (NumberFormatException e){
                    System.out.println(String.format("В %d ряду, в %d ячейке неверно заданно значение",i,j));
                    throw new MyArrayDataException();
                }
            }
        }
        System.out.println(sum);
    }
}
