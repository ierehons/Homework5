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
        //case 2.1
        System.out.println("case 2.1");
        int yearsOld = 6;
        if (yearsOld >= 18) {
            System.out.println("поздравляем с совершеннолетием!");
        }        else {
            System.out.println("совершеннолетие ещё не наступил, нужно немного подождать.");
        }
        // case 2.2
        System.out.println("case 2.2");
        int yearsOld2 = 21;
        if (yearsOld2 >= 7&& yearsOld2 < 18) {
            System.out.println("Ребёнок ходит в школу");
        } else if (yearsOld2 >= 18&& yearsOld2 < 24) {
            System.out.println("человек уже закончил школу и может отправляться в университет");
        }
        else if (yearsOld2 >= 24) {
            System.out.println("человек окончил университет и ему пора искать первую работу");
        }
        // case 2.3
        System.out.println("case 2.3");
        int Place = 102;
        int seating =60;
        int standing = Place - seating;
        int usedSeating =10;  //занято сидячих мест
        int usedStanding = 8;  //занято стоящих мест
        if (usedSeating < seating){
            System.out.println("Есть ещё "+ (seating - usedSeating)+ " сидячих места");
        }
        else {
            System.out.println("Сидячих мест нет!");
        }
        if (usedStanding < standing){
            System.out.println("Есть ещё "+ (standing - usedStanding)+ " стоячих места");
        }
        else {
            System.out.println("Сотячих мест нет!");
        }
// case 3.1
        System.out.println("case 3.1");
        int yarsOld = 5;
        if (yarsOld >= 2 && yarsOld <= 6){
            System.out.println("Если возраст человека равен "+yarsOld+", то ему нужно ходить в детский сад.");
        } else if (yarsOld > 6 && yarsOld <= 18) {
            System.out.println("Если возраст человека равен "+yarsOld+", то ему нужно ходить в школу.");
        } else if (yarsOld > 18 && yarsOld <= 24) {
            System.out.println("Если возраст человека равен "+yarsOld+", то ему нужно ходить в университет.");
        } else if (yarsOld > 24) {
            System.out.println("Если возраст человека равен "+yarsOld+", то ему нужно ходить на работу.");
        }
// case 3.2
        System.out.println("case 3.2");
        int ageChildren = 4;
        if (ageChildren < 5){
            System.out.println("Ребёнок не может кататься на аттракционе");
        } else if (ageChildren <= 14) {
            System.out.println("Ребёнок может кататься на аттракционе только в сопровождении взрослого");
        } else {
            System.out.println("Ребёнок может кататься на аттракционахбез сопровождения взрослого");
        }
// case 3
        System.out.println("case 3.3");
        int one=-119;
        int two=129;
        int three=-117;
        if (one>two) {
            if (one>=three){
                System.out.println("Максимальное число - " + one );
            } else {
                System.out.println("Максимальное число - " + three );
            }
        } else if (two>one) {
            if (two >= three) {
                System.out.println("Максимальное число - " + two);
            } else {
                System.out.println("Максимальное число - " + three);
            }
        } else {
            if (three < one) {
                System.out.println("Максимальное число - " + one);
            } else if (three > one) {
                System.out.println("Максимальное число - " + three);
            } else {
                System.out.println("Все три числа равны");
            }
        }
        }
    }
