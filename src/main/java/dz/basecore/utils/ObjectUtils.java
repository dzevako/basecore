package dz.basecore.utils;

import java.util.Map;

/**
 * Утилитарные методы для работы с объектами
 *
 * @author dzevako
 * @since 11.03.2024
 */
public class ObjectUtils
{
    private ObjectUtils()
    {
    }

    public static <T> T getFromMap(Map<String, Object> map, String key,
            Class<T> valueType, T defaultValue)
    {
        Object value = map.get(key);
        return valueType.isInstance(value)
                ? valueType.cast(value)
                : defaultValue;
    }
}