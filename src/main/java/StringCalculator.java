public class StringCalculator {
    public static int add(String numbers) {
        int returnValue=0;
        String[] numbersArray = numbers.split(",|\n");
        if (numbersArray.length > 2) {
            throw new RuntimeException("Up to 2 numbers separated by comma (,) are allowed");
        } else {
            for (String number : numbersArray) {
                if(Integer.parseInt(number.trim()) < 0){
                    throw new IllegalArgumentException("Negatives are not allowed");
                }else if(Integer.parseInt(number.trim()) >= 1000){
                    continue;
                }
                if (!number.trim().isEmpty()) {
                    returnValue+=Integer.parseInt(number.trim()); // If it is not a number, parseInt will throw an exception
                }
            }
        }
        return returnValue;

    }
}
