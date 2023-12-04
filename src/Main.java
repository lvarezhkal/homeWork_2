public class Main {
    public static void main(String[] args) {
        //1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //3
        cat = cat -1.6;
        dog = dog - 3.5;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        //5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        //6
        var weightOneBoxer = 78.2;
        var weightSecondBoxer = 82.7;
        var weightBothBoxers = weightOneBoxer + weightSecondBoxer;
        System.out.println(weightBothBoxers);
        var massDifference = weightOneBoxer - weightSecondBoxer;
        System.out.println(massDifference);
        //7
        massDifference = weightSecondBoxer - weightOneBoxer;
        System.out.println(massDifference);
        massDifference = weightSecondBoxer % weightOneBoxer;
        System.out.println(massDifference);
        //8.1
        var totalHours = 640;
        var workingDay = 8;
        var numberOfStaff = totalHours / workingDay;
        System.out.println("Всего работников в компании — " + numberOfStaff + " человек.");
        //8.2
        numberOfStaff = numberOfStaff + 94;
        workingDay = totalHours / numberOfStaff;
        System.out.println("Если в компании работает " + numberOfStaff + " человек, то всего " + workingDay + " часа работы может быть поделено между сотрудниками.");
    }
}