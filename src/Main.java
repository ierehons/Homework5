public class Main {
    public static void main(String[] args) {
        // case 1
        System.out.println("case 1");
        int age = 36;
        if (age >= 18) {
            System.out.println("поздравляем с совершеннолетием!");
        }
        if (age < 18) {
            System.out.println("совершеннолетие ещё не наступил, нужно немного подождать.");
        }
        // case 2
        System.out.println("case 2");
        int age2 = 25;
        if (age2 >= 7&&age2<18) {
            System.out.println("Ребёнок ходит в школу");
        }
        if (age2 >= 18&&age2<24) {
            System.out.println("человек уже закончил школу и может отправляться в университет");
        }
        if (age2 >= 24) {
            System.out.println("человек окончил университет и ему пора искать первую работу");
        }
        // case 1.3
        System.out.println("case 3");
int totalPlace = 102;
int seatingPlaces =60;
int standingPlaces= totalPlace - seatingPlaces;
int usedSeatingPlaces =5;  //занято сидячих мест
int usedStandingPlaces = 28;  //занято стоящих мест
if (usedSeatingPlaces<seatingPlaces){
    System.out.println("Есть ещё "+ (seatingPlaces - usedSeatingPlaces)+ " сидячих места");
}
        if (usedSeatingPlaces>=seatingPlaces){
            System.out.println("Сидячих мест нет!");
}
if (usedStandingPlaces<standingPlaces){
    System.out.println("Есть ещё "+ (standingPlaces - usedStandingPlaces)+ " стоячих места");
}
        if (usedStandingPlaces>=standingPlaces){
            System.out.println("Сотячих мест нет!");
        }
        }
    }
