package by.it.dkruchek.jd02_02;

/**
 * Created by Dmitriy.Kruchek on 5/25/2018.
 */
public interface IBuyer {
    void enterToMarket(); //вошел в магазин (мгновенно)
    void chooseGoods(); //выбрал товар (от 0,5 до 2 секунд)
    void goToQueue(); //встал в очередь
    void goToOut(); //отправился на выход(мгновенно)
}
