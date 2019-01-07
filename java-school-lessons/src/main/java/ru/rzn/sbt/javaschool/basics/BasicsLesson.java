package ru.rzn.sbt.javaschool.basics;

import ru.rzn.sbt.javaschool.basics.utils.Logger;
import ru.rzn.sbt.javaschool.basics.utils.StringSupplier;

public class BasicsLesson {

    /**
     * Времена года.<br/>
     * <br/>
     * Получив месяц в формате "ЯНВАРЬ", "ФЕВРАЛЬ" и т.д., выведите время года, к которому он принадлежит
     * ("ЗИМА", "ВЕСНА", "ЛЕТО", "ОСЕНЬ"). Если время года определить не удаётся, верните строку "НЕТ ДАННЫХ"<br/>
     * Используйте switch, не создавайте новых переменных.<br/>
     * После прохождения тестов позовите преподавателя.
     */
    public String getSeason(String month) {
        String result = null;
        switch (month){
            case "ЯНВАРЬ":
            case "ФЕВРАЛЬ":
            case "ДЕКАБРЬ":   result = "ЗИМА";
                break;
            case "МАРТ":
            case "АПРЕЛЬ":
            case "МАЙ":   result = "ВЕСНА";
                break;
            case "ИЮНЬ":
            case "ИЮЛЬ":
            case "АВГУСТ":   result = "ЛЕТО";
                break;
            case "СЕНТЯБРЬ":
            case "ОКТЯБРЬ":
            case "НОЯБРЬ":   result = "ОСЕНЬ";
                break;
            default: result = "НЕТ ДАННЫХ";
        }
        return result;
    }

    /**
     * X негритят.<br/>
     * <br/>
     * Получив количество негритят {@code x}, выведите в лог {@code log} обратный отсчёт:<br/>
     * <ul>
     * <li>10 little indians</li>
     * <li>9 little indians</li>
     * <li>...</li>
     * <li>2 little indians</li>
     * <li>1 little indian</li>
     * </ul>
     */
    public void xLittleIndians(int x, Logger log) {
        if (x>=1)
            for (int k=x; k>0; k-- ) {
                if (k>1)
                    log.log(k+" little indians");
                else
                    log.log(k+" little indian");
            }

    }

    /**
     * Всё в лог.<br/>
     * <br/>
     * Сервис {@link StringSupplier} предоставляет строки в ответ на вызов метода {@link StringSupplier#next()}.
     * Если у него есть ещё строка, то он отвечает {@code true} на вызов метода {@link StringSupplier#hasNext()},
     * если строки кончились - ответит {@code false}.<br/>
     * Получите от сервиса все строки и отправьте их в лог.
     */
    public void logEverything(StringSupplier supplier, Logger log) {
        while (supplier.hasNext())
            log.log(supplier.next());
    }

    /**
     * Устами младенца.<br/>
     * <br/>
     * Малыши "не выговаливают" букву Р. Сделайте для робота малыша метод, который получив слово, заменит в нём все
     * буквы Р на Л.
     */
    public String littleKid(String word) {
        String result = null;
        result =word.replace("Р","Л");
        return result;
    }

    /**
     * Первый раз в первый класс.<br/>
     * <br/>
     * Создайте в этом пакете ({@link ru.rzn.sbt.javaschool.basics}) новый класс с именем LethalWeapon.<br/>
     * Класс должен содержать:
     * <ul>
     *     <li>публичное строковое поле color</li>
     *     <li>приватное поле {@code roundsLeft} типа {@code int} без методов чтения и записи</li>
     *     <li>приватное поле {@code power типа} {@code Double} с методами чтения и записи</li>
     *     <li>публичный void-метод {@code reload}, принимающий {@code int} - количество зарядов и увеличивающий
     *     {@code roundsLeft} на эту величину</li>
     *     <li>публичный void-метод pewPew без параметров, уменьшающий значение {@code roundsLeft} на 2</li>
     *     <li>публичный конструктор без параметров</li>
     *     <li>публичный конструктор, принимающий параметры для всех полей в алфавитном порядке их имён</li>
     * </ul>
     * Создайте объект нового класса, проинициализировав все его поля и верните его из метода {@link #newClass()}.<br/>
     */

    public Object newClass() {
//        Object o = null;
//        String myColor = "red";
//        Double myPower = new Double(10);
//        int myR = 5;
//        LethalWeapon o = new LethalWeapon(myColor, myPower, myR);
 //       o =myObj;
        LethalWeapon o = new LethalWeapon("red", new Double(10) , 5);
        return o;

    }
    /**
     * Добавьте в класс LethalWeapon серийные номера.<br />
     * <br />
     * Создайте приватное статическое целочисленное ({@code long}) поле nextSerial = 0.<br />
     * Создайте приватное финальное целочисленное ({@code long}) поле serial с методом чтения.<br />
     * В конструкторах обеспечьте корректное проставление серийных номеров.<br />
     */
    public void serial() {
    }

    /**
     * Реализуйте метод equals() у класса LethalWeapon. Сравните цвет, мощность и заряд. Серийный номер роли не играет.
     */
    public void equalsContract() {

    }

    /**
     * Получив некоторую строку, получите из нее подстроку со 2-го символа по символ "S",
     * приведите все символы в верхний регистр и верните результат.
     * @param input
     * @return
     */
    public String stringExercise1(String input) {
        String subStr = input.substring(2,input.indexOf("S")+1);
        subStr=subStr.toUpperCase();
        return subStr;
    }

    /**
     * Получив некоторую строку, найдите длину строки, количество запятых, количество дефисов,
     * индекс первого символа "R", индекс последнего символа "L" и количество пробелолв между словами.
     * Верните результат перемножения всех полученных чисел.
     * @param input
     * @return
     */
    public int stringExercise2(String input) {
        int len=input.length();
        int result=0, nz=0, nd=0, nr=0, nl=0, np=0, bp=0, ep=len-1;
        nr=input.indexOf("R");
        nl=input.lastIndexOf("L");

        while (input.charAt(bp)==' '){bp++;}
        while (input.charAt(ep)==' '){ep--;}
        for (int i=bp; i<ep;i++){
            if(input.charAt(i)==',')
                nz++;
            if(input.charAt(i)=='-')
                nd++;
            if(input.charAt(i)==' ')
                np++;
        }
        return len*nz*nd*nr*nl*np;
    }

    /**
     * Получив некоторую строку выполните следующее:<br />
     * 1. если в строке 3 слова и есть слово "Hello", верните новую строку, содержащую первое и последнее слова (без лишних пробелов).<br />
     * 2. если в строке 2 слова и есть слово "Hello", инвертируйте порядок символов в ней и верните результат.<br />
     * 3. если в строке 3 слова и есть слово "Goodbye", верните новую строку, содержащую первое и последнее слова (без лишних пробелов),
     * если в конце есть восклицательный знак - уберите его, если нет - добавьте.<br />
     * 4. если в строке 2 слова и есть слово "Goodbye", поменяйте слова местами (между словами в новой строке тоже должен быть пробел, лишних пробелов быть не должно),
     * сделайте все буквы в нижнем регистре и верните результат.
     * @param input
     * @return
     */
    public String stringExercise3(String input) {
        String result="", w1,w2,tmp;
        int len=input.length();
        tmp=input.trim();
        String[] s=tmp.split(" ");
        boolean hasHello=false, hasGoodbye=false;

        for (String w: s ) {
            if (w.equals("Hello")) hasHello = true;
            if (w.equals("Goodbye")) hasGoodbye = true;
        }
        if ((s.length==3)&hasHello)
                result=s[0]+" "+s[2];

        if ((s.length==2)&hasHello)
            for(int i=0; i<len; i++)
                result+=input.charAt(len-1-i);

        if ((s.length==3)&hasGoodbye)
            if (s[2].endsWith("!"))
                result = s[0] +" "+ s[2].substring(0, s[2].length()-1);
            else
                result = s[0] +" "+ s[2] + "!";


        if ((s.length==2)&hasGoodbye)
            result=(s[1]+" "+s[0]).toLowerCase();


        return result;
    }
}
