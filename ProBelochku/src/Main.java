
//Создать класс Орешек с полем вес. Все орешки создаются с весом 12.5. Изменить вес ореха нельзя.
// - done

//Создать класс Дерево, у которого есть метод ВыраститьМассивОрехов.
// Параметр метода - это количество, результат - массив Орешков.
// - done

//Создать класс Белочка, у которой есть метод собирания орехов из массива, выращенного деревом.
// Белочка перебирает каждый орешек в массиве, говорит "ура, еще орех!" и суммирует вес всех найденных орехов.
// В итоге она гордо сообщает, какой общий вес она насобирала
// - done

//Продемонстрировать работу системы с 1 объектом класса Белочка, 1 Деревом и массивом из 15 орехов
// - done


class Oreshek
{
    double ves = 12.5;
}

class Derevo
{
    Oreshek[] growUpOreshki(int kolvo)
    {
        Oreshek[] oreshki = new Oreshek[kolvo];
        for (int i = 0; i < oreshki.length; i++){oreshki[i] = new Oreshek();}
        return oreshki;
    }
}

class Belochka
{
    void sayOnOreh(){System.out.println("Белка: 'Ура, ещё орех!' ");}

    double sum(Oreshek[] oreshki)
    {
        double result = 0;
        for (int i = 0; i < oreshki.length; i++){result = result + oreshki[i].ves; System.out.println(" "); sayOnOreh();}
        System.out.println(" ");
        System.out.println("Белка: 'А всего я собрала " + result + " грамм орешков!' ");
        return result;
    }
}

public class Main {
    public static void main(String[] args)
    {
        Derevo derevo = new Derevo();
        Belochka belochka = new Belochka();
        belochka.sum(derevo.growUpOreshki(15));
    }
}