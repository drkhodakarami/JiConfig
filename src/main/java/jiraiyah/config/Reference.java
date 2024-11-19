/***********************************************************************************
 * Copyright (c) 2024 Alireza Khodakarami (Jiraiyah)                               *
 * ------------------------------------------------------------------------------- *
 * MIT License                                                                     *
 * =============================================================================== *
 * Permission is hereby granted, free of charge, to any person obtaining a copy    *
 * of this software and associated documentation files (the "Software"), to deal   *
 * in the Software without restriction, including without limitation the rights    *
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell       *
 * copies of the Software, and to permit persons to whom the Software is           *
 * furnished to do so, subject to the following conditions:                        *
 * ------------------------------------------------------------------------------- *
 * The above copyright notice and this permission notice shall be included in all  *
 * copies or substantial portions of the Software.                                 *
 * ------------------------------------------------------------------------------- *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR      *
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,        *
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE     *
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER          *
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,   *
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE   *
 * SOFTWARE.                                                                       *
 ***********************************************************************************/

package jiraiyah.config;

import net.fabricmc.loader.api.FabricLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class contains the reference information for the mod UIO.
 * It includes constants and configurations utilized throughout the mod.
 */
@SuppressWarnings("unused")
public class Reference
{
    public static boolean DEBUG = FabricLoader.getInstance().isDevelopmentEnvironment();
    public static String ModID = "default";
    /**
     * A Logger instance used for logging messages throughout the UIO mod.
     * It is initialized using the mod's ID, which helps in identifying
     * the source of log messages in the application's log output.
     * This logger can be utilized to capture various log levels,
     * including debug, info, warning, and error messages, facilitating
     * effective monitoring and troubleshooting of the mod's behavior.
     */
    public static final Logger LOGGER = LoggerFactory.getLogger(ModID);

    //region Logging
    /**
     * ANSI escape code for resetting the color formatting in the console output.
     * This code can be used to revert the text color back to the default settings
     * after applying any other ANSI color codes. Utilizing this constant makes
     * it easier to manage text color when logging or printing messages to the console.
     */
    public static final String ANSI_RESET = "\u001B[0m";
    /**
     * ANSI escape code for setting the text color to different colors in console output.
     * This code can be used to change the color of the text displayed in the
     * console to different color. It is useful for enhancing the readability of log
     * messages or console output by using different colors for different contexts.
     */
    public static final String ANSI_BLACK = "\u001B[30m";
    /**
     * ANSI escape code for setting the background color to different colors in console output.
     * This code can be used to change the background color of the text displayed
     * in the console to different color. It is useful for enhancing the visual distinction
     * of log messages or console output by applying different background colors.
     */
    public static final String ANSI_BLACK_BACK = "\u001B[40m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_MAGENTA = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_BRIGHT_BLACK = "\u001B[90m";
    public static final String ANSI_BRIGHT_RED = "\u001B[91m";
    public static final String ANSI_BRIGHT_GREEN = "\u001B[92m";
    public static final String ANSI_BRIGHT_YELLOW = "\u001B[93m";
    public static final String ANSI_BRIGHT_BLUE = "\u001B[94m";
    public static final String ANSI_BRIGHT_MAGENTA = "\u001B[95m";
    public static final String ANSI_BRIGHT_CYAN = "\u001B[96m";
    public static final String ANSI_BRIGHT_WHITE = "\u001B[97m";
    /**
     * Private constructor to prevent instantiation of this utility class.
     * This will throw an AssertionError if attempted.
     */
    Reference()
    {
        throw new AssertionError();
    }
    public static final String ANSI_RED_BACK = "\u001B[41m";
    public static final String ANSI_GREEN_BACK = "\u001B[42m";
    public static final String ANSI_YELLOW_BACK = "\u001B[43m";
    public static final String ANSI_BLUE_BACK = "\u001B[44m";
    public static final String ANSI_MAGENTA_BACK = "\u001B[45m";
    public static final String ANSI_CYAN_BACK = "\u001B[46m";
    public static final String ANSI_WHITE_BACK = "\u001B[47m";
    public static final String ANSI_BRIGHT_BLACK_BACK = "\u001B[100m";
    public static final String ANSI_BRIGHT_RED_BACK = "\u001B[101m";
    public static final String ANSI_BRIGHT_GREEN_BACK = "\u001B[102m";
    public static final String ANSI_BRIGHT_YELLOW_BACK = "\u001B[103m";
    public static final String ANSI_BRIGHT_BLUE_BACK = "\u001B[104m";
    public static final String ANSI_BRIGHT_MAGENTA_BACK = "\u001B[105m";
    public static final String ANSI_BRIGHT_CYAN_BACK = "\u001B[106m";
    public static final String ANSI_BRIGHT_WHITE_BACK = "\u001B[107m";

    /**
     * Logs the initialization message of the UIO mod to the console.
     * This method uses a specific ANSI color formatting for the log message
     * to enhance visibility. It outputs an info level log indicating
     * that the mod is being initialized. The colors are set to a
     * bright-yellow foreground with a pink background for emphasis.
     */
    public static void logMain()
    {
        LOGGER.info("\u001b[38;2;" + 255 + ";" + 255 + ";" + 0 + ";48;2;" + 255 + ";" + 0 + ";" + 127 +
                    "m>>> " + "Initializing" + " " + Reference.ANSI_RESET);
    }

    /**
     * Logs a message to the console if debugging is enabled.
     * This method checks the DEBUG flag and, if true, logs the provided
     * message using an info level log. The message is formatted with
     * bright magenta text to enhance visibility in the console output.
     *
     * @param message The message to log, intended for debugging purposes.
     */
    public static void log(String message)
    {
        if (DEBUG)
            LOGGER.info(ANSI_BRIGHT_MAGENTA + ">>> {}" + ANSI_RESET, message);
    }

    /**
     * Logs an error message to the console.
     * This method logs the provided message using an info level log,
     * formatted with a bright red background and black text for emphasis.
     * It is intended for indicating error conditions or significant issues
     * that need to be brought to the user's attention.
     *
     * @param message The error message to log, intended for error tracking.
     */
    public static void logError(String message)
    {
        LOGGER.info(ANSI_BRIGHT_RED_BACK + ANSI_BLACK + ">>> {}" + ANSI_RESET, message);
    }

    /**
     * Logs a warning message to the console if debugging is enabled.
     * This method checks the DEBUG flag and, if true, logs the provided
     * warning message with bright yellow background and black text for visibility.
     * This is intended for indicating potential issues or important notes
     * that may require attention.
     *
     * @param message The warning message to log, aimed at alerting users
     *                to possible concerns or conditions.
     */
    public static void logWarning(String message)
    {
        if (DEBUG)
            LOGGER.info(ANSI_BRIGHT_YELLOW_BACK + ANSI_BLACK + ">>> {}" + ANSI_RESET, message);
    }

    /**
     * Logs a general message to the console if debugging is enabled.
     * This method checks the DEBUG flag and, if true, logs the provided
     * message without any special formatting. This is useful for outputting
     * standard messages that do not require specific color coding.
     *
     * @param message The message to log, intended for general informational output.
     */
    public static void logN(String message)
    {
        if (DEBUG)
            LOGGER.info(">>> {}", message);
    }

    /**
     * Logs a message to the console with customizable RGB color formatting
     * if debugging is enabled. This method allows the user to specify
     * the red, green, and blue color components for the message text.
     * The output will use the specified RGB values for the text color,
     * making it easier to highlight messages in a colorful manner.
     *
     * @param message The message to log, intended for informational output.
     * @param r       The red component of the text color (0-255).
     * @param g       The green component of the text color (0-255).
     * @param b       The blue component of the text color (0-255).
     */
    public static void logRGB256(String message, int r, int g, int b)
    {
        if (DEBUG)
            LOGGER.info("\u001B[38;2;{};{};{}m>>> {}" + ANSI_RESET, r, g, b, message);
    }

    /**
     * Logs a message to the console with customizable RGB color formatting
     * for both the text and the background if debugging is enabled.
     * This method allows the user to specify the red, green, and blue
     * color components for the message text color and the background color.
     * The output will use the specified RGB values, making it easy to create
     * visually distinct log messages.
     *
     * @param message The message to log, intended for informational output.
     * @param rf      The red component of the text color (0-255).
     * @param gf      The green component of the text color (0-255).
     * @param bf      The blue component of the text color (0-255).
     * @param rb      The red component of the background color (0-255).
     * @param gb      The green component of the background color (0-255).
     * @param bb      The blue component of the background color (0-255).
     */
    public static void logBackRGB256(String message, int rf, int gf, int bf, int rb, int gb, int bb)
    {
        if (DEBUG)
            LOGGER.info("\u001B[38;2;{};{};{};48;2;{};{};{}m>>> {} " + ANSI_RESET, rf, gf, bf, rb, gb, bb, message);
    }
    //endregion
}