
public class FizzBuzz {

    private Object[] number;

    public Object[] putNumbersInArray(int n) {
        number = new Object[n];
        for (int i = 0; i< number.length; i++){

            if ((i + 1) % 15 == 0) {
                number[i] = "fizzbuzz";
            }
            else if((i + 1) % 3 == 0) {
                number[i] = "fizz";
            }
            else if ((i + 1) % 5 == 0) {
                number[i] = "buzz";
            }
            else{
                number[i] = i + 1;
            }
        }
        return number;
    }
}
