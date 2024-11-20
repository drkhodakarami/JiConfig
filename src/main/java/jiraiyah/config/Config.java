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

import jiraiyah.logger.Logger;

/**
 * The main config entry class. Your mod's config class should extend this class.
 *
 * @author Jiraiyah
 */
@SuppressWarnings("unused")
public abstract class Config
{
    private final String modId;
    protected BaseConfig config;
    protected ConfigProvider provider;

    public Config(String modId)
    {
        this.modId = modId;
    }

    /**
     * @return the current config instance.
     */
    public BaseConfig getConfig()
    {
        return this.config;
    }

    /**
     * Loads the config for the specified mod.
     *
     * @param modID The mod ID of the mod to load the config for.
     */
    public void load()
    {
        Logger logger = new Logger(this.modId);

        this.provider = new ConfigProvider(ConfigKeyCasing.ALL_UPPER_CASE);
        this.createConfigs();

        this.config = BaseConfig.of(this.modId, "_config").provider(provider).request(this.modId);

        logger.logN("All " + provider.getConfigList().size() + " config entries have been set properly");

        this.assignConfigValues();

        logger.logN("All " + provider.getConfigList().size() + " config entries have been loaded properly");
    }

    /**
     * Creates the config entries for the mod.
     */
    protected void createConfigs()
    {
    }

    /**
     * Assigns the values of the config entries to their respective variables.
     */
    protected void assignConfigValues()
    {
    }

}