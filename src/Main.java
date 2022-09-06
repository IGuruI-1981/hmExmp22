public class Main {
    public static void main(String[] args) {
        System.out.println("Hello SkyPRO!");

        FacultyGriffindor[] griffindors = {
                new FacultyGriffindor("Поттер", "Гарри", 12, 32, 65, 23, 76),
                new FacultyGriffindor("Грейнджер","Гермиона",45,23,65,34,65),
                new FacultyGriffindor("Уизл","Рон",23,32,7,45,76)
        };

        FacultySlytherin[] slytherins = {
                new FacultySlytherin("Малфой","Драко",45,24,43,76,34,98,34),
                new FacultySlytherin("Гойл","Грегори",65,34,65,11,25,76,34),
                new FacultySlytherin("Монтегю","Грэхэм",76,23,55,34,12,67,23)
        };

        FacultyHufflepuff[] hufflepuffs = {
                new FacultyHufflepuff("Смит","Захария",53,32,4,45,66),
                new FacultyHufflepuff("Диггори","Седрик",52,5,67,85,34),
                new FacultyHufflepuff("Финч-Флетчли","Джастин",12,34,56,34,43),
        };

        FacultyRavenclaw[] ravenclaws = {
                new FacultyRavenclaw("Чанг","Чжоу",64,23,5,78,23,33),
                new FacultyRavenclaw("Патил","Падма",11,15,32,41,32,33),
                new FacultyRavenclaw("Белби","Маркус",88,67,84,34,22,1)
        };

        Hogwarts.getAllFacultyGriffindor(griffindors);


    }


}
//    В школе магии и волшебства Хогвартс есть четыре факультета:
//
//        - Гриффиндор
//        - Пуффендуй
//        - Когтевран
//        - Слизерин
//
//        Студентам каждого из этих факультетов присущи свои свойства характера. Эти свойства оцениваются в
//        целочисленном эквиваленте от 0 до 100.
//
//        Всем Гриффиндорцам присущи благородство, честь и храбрость.
//
//        Студенты Пуффендуя трудолюбивы, верны, честны.
//
//        Когтевранцы умны, мудры, остроумны и полны творчества.
//
//        Всем ученикам Слизерина присущи хитрость, решительность, амбициозность, находчивость и жажда власти.
//
//        Абсолютно все ученики школы Хогвартс умеют колдовать с мощностью в сколько-то баллов и могут трансгрессировать
//        на какое-то расстояние. Сила магии и расстояние трансгресии у каждого ученика своё и выражается в
//        целочисленном эквиваленте.
//
//        Гарри Поттер, Гермиона Грейнджер и Рон Уизли учатся на факультете Гриффиндор.
//
//        Драко Малфой, Грэхэм Монтегю, Грегори Гойл учатся на Слизерине.
//
//        На факультет Пуффендуй учатся Захария Смит, Седрик Диггори, Джастин Финч-Флетчли.
//
//        На факультете Когтевран учится Чжоу Чанг, Падма Патил и Маркус Белби.
//
//        Напишите программу, в которой реализован класс hogwarts и четыре класса по названиям факультетов. В классах
//        факультетов опишите свойства каждого, перечисленные выше. Ученики должны быть реализованы в качестве объектов.
//        Должна быть возможность задавать качества учеников через конструктор. Присвойте каждому свойству произвольное
//        числовое значение от 0 до 100.
//
//        Сделайте метод, который выводит на экран описание студента. В описание надо включать качества, которые
//        присущи всем студентам, плюс качества, которые присущи студенту, потому что он учится на конкретном факультете.
//
//        Реализуйте 4 метода, по одному для каждого факультета, которые сравнивают между собой учеников одного
//        факультета по свойствам. У каждого ученика нужно сложить баллы по каждому свойству, которое присуще ученику
//        данного факультета.
//
//        Тот ученик, у которого сумма свойств больше, считается лучшим учеником.
//
//        Метод должен выводить в консоль сравнение учеников.
//
//        Например, у Гермионы благородство = 5 баллов, честь = 5 баллов и храбрость = 6 баллов. У Рона Уизли
//        благородство = 3 балла, честь = 6 баллов и храбрость = 5 баллов.
//
//        У Гермионы сумма баллов равна 16-ти, а у Рона – 14-ти. Значит метод должен вывести в консоль
//        “Гермиона лучший Гриффиндорец, чем Рон”.
//
//        Реализуйте метод, который сравнивает двух любых учеников Хогвартса по силе магии и расстоянию
//        трансгрессии, и выводит в консоль сравнительную оценку между двумя учениками.
//
//        Например, Драко Малфой обладает бОльшей мощностью магии, чем Захария Смит.
//
//        Важно: поля объектов должны быть приватными.
//
//        - Критерии оценки:
//        - Реализован класс hogwarts с описанием свойств, присущих всем ученикам
//        - Классы-факультеты описывают свойства учеников-наследников и являются наследниками класса hogwarts
//        - Ученики реализованы в качестве объектов и наследуют свойства класса-факультета и класса hogwarts
//        - Качества учеников можно задавать с помощью конструктора
//        - Реализован метод, который выводит на экран описание студента: качества, присущие всем ученикам школы и
//        присущие определенному факультету.
//        - Реализованы методы, которые выводят на экран результат сравнения двух учеников одного факультета по
//        свойствам только это факультета
//        - Реализован метод, который сравнивает двух любых учеников по присущим всем ученикам школы характеристикам.