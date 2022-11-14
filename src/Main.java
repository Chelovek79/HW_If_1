public class Main {

        public static void main(String[] args) {

// Задание 1.1.
            int AgeUser = 18;
            if (AgeUser >= 18) {
                System.out.println("Возраст " + AgeUser + ". Поздравляем !!! Вы - совершеннолетний ;)))");
            }
            if (AgeUser < 18) {
                System.out.println("Возраст " + AgeUser + ". Подрасти дружок ;(");
            }
            System.out.println("---------------------------");

// Задание 1.2.
            int HumanAge = 24;
            System.out.print("Возраст человеческого детёныша " + HumanAge);
            if (HumanAge < 7) {
                System.out.println(". Дитё...");
            }
            if (HumanAge >= 7) {
                if (HumanAge < 18) {
                    System.out.println(". Ребёнок может посещать школьные занятия.");
                }
            }
            if (HumanAge >= 18) {
                if (HumanAge < 24) {
                    System.out.println(". Подросток может посещать занятия в университете.");
                }
            }
            if (HumanAge >= 24) {
                System.out.println(". Welcome to ... - работай.");
            }
            System.out.println("---------------------------");

// Задание 1.3.
            int PopulationWagon = 102;
            int Seating = 60;
            int Passengers = 102;
            if (Passengers < Seating) {
                System.out.println("В вагоне осталось " + (Seating - Passengers) + " сидячих мест и " +
                        (102 - 60) + "стоячих мест");
            }
            if (Passengers >= Seating) {
                if (Passengers < PopulationWagon)
                    System.out.println("В вагоне осталось " + (PopulationWagon - Passengers) + " стоячих места");
            }

            if (Passengers >= PopulationWagon) {
                System.out.println("Вагон заполнен - возможна давка...");
            }
            System.out.println("---------------------------");

        }
}
