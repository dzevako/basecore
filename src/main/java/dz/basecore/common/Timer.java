package dz.basecore.common;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.annotation.Nullable;

/**
 * Класс для даты\времени со встроенным форматированием
 * @author user
 *
 */
public class Timer
{
    private Timer()
    {
    }

    public static final int SECUNDE = 1000;
    public static final int MINUTE = SECUNDE * 60;

    /**
     * Возвращает дату в формате 01.01.16
     */
    public static String date()
    {
        return DateFormat.getDateInstance(3, Locale.GERMANY).format(new Date());
    }

    /**
     * Возвращает дату в формате 01.01.2016
     */
    public static String date2()
    {
        return DateFormat.getDateInstance(2, Locale.GERMANY).format(new Date());
    }

    /**
     * Возвращает дату и время в формате 01.01.16 13:43:06
     */
    public static String dateTime()
    {
        return DateFormat.getDateTimeInstance(3, 2, Locale.GERMANY).format(new Date());
    }

    /**
     * Проверить, настал ли следующий день
     * @param today сегодня
     */
    public static boolean isNextDay(@Nullable String today)
    {
        if (null == today)
        {
            return false;
        }
        return !date2().equals(today);
    }

    /**
     * Признак того что следующий день за указанным, является днем другого месяца(началом следующего месяца)
     */
    public static boolean isNextDayInOtherMonth(@Nullable String day)
    {
        if (null == day)
        {
            return false;
        }
        String date;
        try
        {
            DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
            Date d = dateFormat.parse(day);
            date = DateFormat.getDateInstance(2, Locale.GERMANY).format(d);
        }
        catch (ParseException e)
        {
            return false;
        }
        return !monthYear().equals(date.substring(3));
    }

    /**
     * Возвращает месяц и год в формате 02.2016
     */
    public static String monthYear()
    {
        return date2().substring(3);
    }

    /**
     * Возвращает время в формате 13:39:46
     */
    public static String time()
    {
        return DateFormat.getTimeInstance(2, Locale.GERMANY).format(new Date());
    }

    /**
     * Остановить поток на указанное время
     */
    public static void waitMillis(long millis)
    {
        try
        {
            Thread.sleep(millis);
        }
        catch (InterruptedException e)
        {
            Thread.currentThread().interrupt();
        }
    }

    /**
     * Выждать паузу в секундах
     */
    public static void waitSec(int delay)
    {
        waitMillis(delay * 1000L);
    }
}
