public class Main {
    public static void main(String[] args){
        String inputWrong = "1234z";
        String inputCorrect = "12345";
        ExceptionLogger logger = new ExceptionLogger("log.txt");

        try {
            int number = parseInt(inputWrong);
            System.out.println(" " + number);
        } catch (CustomNumberFormatException e) {
            logger.logException(e);
            System.err.println("Ошибка: строка не является числом");
        }

        try {
            int number = parseInt(inputCorrect);
            System.out.println(" " + number);
        } catch (CustomNumberFormatException e) {
            logger.logException(e);
            System.err.println("Ошибка: строка не является числом");
        }
    }
    
    public static int parseInt(String str) throws CustomNumberFormatException {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw new CustomNumberFormatException("Строка не является числом: " + str);
        }
    }
}
