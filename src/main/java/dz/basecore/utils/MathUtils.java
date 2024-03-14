package dz.basecore.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * Утилитарный класс с набором математических функций
 *
 * @author dzevako
 * @since Dec 12, 2015
 */
public class MathUtils
{
    private MathUtils()
    {
    }

    /**
     * Округление до указанного количествао знаков
     * @param value значение
     * @param places количество знаков
     */
    public static double round(double value, int places)
    {
        if (places < 0 || Double.isInfinite(value) || Double.isNaN(value))
        {
            throw new IllegalArgumentException(
                    "Illegal arguments detected: value = '" + value + "' places = '" + places + "'");
        }

        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    /**
     * Округление до 1 знака
     */
    public static double round1(double value)
    {
        return round(value, 1);
    }

    /**
     * Округление до 2 знаков
     */
    public static double round2(double value)
    {
        return round(value, 2);
    }

    /**
     * Округление до 3 знаков
     */
    public static double round3(double value)
    {
        return round(value, 3);
    }

    /**
     * Округление до 4 знаков
     */
    public static double round4(double value)
    {
        return round(value, 4);
    }

    public static String toString(double value, int fractLimit)
    {
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(fractLimit);
        df.setGroupingUsed(false);
        String res = df.format(value);
        if (res.contains("."))
        {
            while (res.endsWith("0"))
            {
                res = res.substring(0, res.length() - 1);
            }
        }
        return res;
    }
}
