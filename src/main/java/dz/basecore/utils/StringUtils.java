package dz.basecore.utils;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;

import javax.annotation.Nullable;

import dz.basecore.common.HasTitle;

/**
 * Утилитарные методы для работы со строками
 * @author dzevako
 * @since Nov 1, 2014
 */
public class StringUtils
{
    public static final String EMPTY = "";

    private StringUtils()
    {
    }

    /**
     * Кодировать атрибуты в виде Map в URL-строку
     * {attr1:value1,attr2:value2...}
     */
    public static String encodeUrlAttrs(Map<String, String> params)
    {
        StringBuilder sb = new StringBuilder("{");
        boolean first = true;
        for (Entry<String, String> param : params.entrySet())
        {
            sb.append(first ? "\"" : ",\"").append(param.getKey()).append("\":\"").append(param.getValue())
                    .append("\"");
            first = false;
        }
        sb.append("}");
        return sb.toString();
    }

    /**
     * Кодировать параметры в виде Map в URL-строку
     * attr1=value1&attr2=value2...
     */
    public static String encodeUrlParams(Map<String, String> params)
    {
        StringBuilder result = new StringBuilder();
        for (Entry<String, String> param : params.entrySet())
        {
            if (!result.isEmpty())
            {
                result.append("&");
            }
            result.append(param.getKey()).append("=").append(param.getValue());
        }
        return result.toString();
    }

    /**
     * Получить строку, содержащую указанную строку, 
     * дополненную пробельными символами до длины length
     */
    public static String getCompleteString(String str, int length)
    {
        StringBuilder strBuilder = new StringBuilder(str);
        while (strBuilder.length() < length)
        {
            strBuilder.append(" ");
        }
        str = strBuilder.toString();
        return str;
    }

    /**
     * Вернуть не более length символов указанной строки.
     * В случае усечения дополняется троеточием
     */
    public static String getShortString(String str, int length)
    {
        return length < 0 || str.length() <= length
                ? str
                : str.substring(0, length) + "...";
    }

    public static String getMessage(@Nullable Exception e)
    {
        if (e == null || e.getMessage() == null)
        {
            return "null";
        }
        String msg = e.getMessage();
        String ellipsis = "...";
        String enter = "\n";
        int defLength = 200;
        if (msg.contains(enter))
        {
            String[] parts = msg.split(enter);
            if (parts[0].length() > defLength)
            {
                return parts[0].substring(0, defLength) + ellipsis;
            }
            else
            {
                return parts[0] + enter + (parts[1].length() > defLength ? (parts[1].substring(0, defLength) + ellipsis)
                        : (parts[1] + ellipsis));
            }
        }
        else
        {
            return msg.length() > defLength ? (msg.substring(0, defLength) + ellipsis) : msg;
        }
    }

    /**
     * Получить строку из названий объектов в одинарных кавычках
     */
    public static String getTitlesString(Collection<? extends HasTitle> objects)
    {
        if (objects.isEmpty())
        {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (HasTitle object : objects)
        {
            sb.append("'").append(object.getTitle()).append("'").append(", ");
        }
        String titles = sb.toString();
        return titles.substring(0, titles.length() - 3);
    }

    /**
     * Признак того, что строка пуста
     */
    public static boolean isEmpty(@Nullable String str)
    {
        return str == null || str.isEmpty();
    }

    /**
     * Признак того, что строка не пуста
     */
    public static boolean isNotEmpty(@Nullable String str)
    {
        return !isEmpty(str);
    }

    /**
     * Получить строку из коллекции, каждый элемент в двойных кавычках 
     */
    public static String toDoubleQuotedString(Iterable<?> objects)
    {
        return decorateElemtntsToString(objects, "\"");
    }

    /**
     * Получить строку из коллекции, каждый элемент в одинарных кавычках 
     */
    public static String toQuotedString(Iterable<?> objects)
    {
        return decorateElemtntsToString(objects, "'");
    }

    public static String toString(Iterable<?> objects, String delimiter)
    {
        StringBuilder sb = new StringBuilder();
        for (Object object : objects)
        {
            sb.append(object.toString()).append(delimiter);
        }
        return sb.toString();
    }

    private static String decorateElemtntsToString(Iterable<?> objects, String decorator)
    {
        StringBuilder sb = new StringBuilder();
        boolean first = true;
        for (Object object : objects)
        {
            sb.append(first ? decorator : (", " + decorator)).append(object.toString()).append(decorator);
            first = false;
        }
        return sb.toString();
    }
}
