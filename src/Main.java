public class Main {


    public static void main(String[] args) {
        int age;
        int temperature;


        checkWeatherAndAge(age=25, temperature=-15);


        checkWeatherAndAge(age=18, temperature=10);


        checkWeatherAndAge(age=50, temperature=20);


        checkWeatherAndAge(age=30, temperature=35);


        checkWeatherAndAge(age=40, temperature=5);


    }


    public static void checkWeatherAndAge(int age, int temperature) {


        if ((age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) ||


                (age < 20 && temperature >= 0 && temperature <= 28) ||


                (age > 45 && temperature >= -10 && temperature <= 25)) {


            System.out.println("Можно идти гулять");


        } else {


            System.out.println("Оставайтесь дома");


        }


    }


}