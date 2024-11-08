public class Task1 {
    public static void main(String[] args) {
        int temperature = (int) (Math.random()*30)+1;
        System.out.println("температура в помещении " + temperature);

        if (temperature > 25){
            System.out.println("режим cool");
        }
        else if ((temperature <= 24) && (temperature >=8)) {
            System.out.println("не работает");
        }
        else if (temperature < 8) {
            System.out.println("режим heat");
        }
    }
}
