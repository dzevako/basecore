package dz.basecore.utils;

/**
 * Sound utility class. 
 * @author dzevako
 * @since Aug 20, 2015
 */
public final class SoundUtils
{
    private SoundUtils()
    {
    }

    public static String getSoundCommand(int freq)
    {
        return "speaker-test -t sine -f " + freq + " -l 1 -p -1";
    }
}
